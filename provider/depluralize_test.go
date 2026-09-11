package okta

import (
	"encoding/json"
	"os"
	"path/filepath"
	"regexp"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

// doublePluralized matches the names the bridge's pluralizer produces when it
// appends a bare "s" to an upstream field that already reads as plural. Every
// occurrence so far has been a name ending in a past participle, so match that
// shape rather than trying to decide plurality in general.
var doublePluralized = regexp.MustCompile(`(?:[a-z])(?:ed|en)s$`)

// TestNoDoublePluralizedProperties guards the depluralizedFields overrides: an
// upstream field that starts matching this shape is a breaking rename once it
// ships, so it has to be caught before release rather than after.
func TestNoDoublePluralizedProperties(t *testing.T) {
	t.Parallel()

	type objectSpec struct {
		Properties      map[string]json.RawMessage `json:"properties"`
		InputProperties map[string]json.RawMessage `json:"inputProperties"`
		StateInputs     *objectSpec                `json:"stateInputs"`
		Inputs          *objectSpec                `json:"inputs"`
		Outputs         *objectSpec                `json:"outputs"`
	}
	var spec struct {
		Resources map[string]objectSpec `json:"resources"`
		Functions map[string]objectSpec `json:"functions"`
		Types     map[string]objectSpec `json:"types"`
	}

	contents, err := os.ReadFile(filepath.Join("cmd", "pulumi-resource-okta", "schema.json"))
	require.NoError(t, err)
	require.NoError(t, json.Unmarshal(contents, &spec))

	var check func(token string, obj *objectSpec)
	check = func(token string, obj *objectSpec) {
		if obj == nil {
			return
		}
		for _, properties := range []map[string]json.RawMessage{obj.Properties, obj.InputProperties} {
			for name := range properties {
				assert.NotRegexpf(t, doublePluralized, name,
					"%s.%s looks double-pluralized; add the upstream field to depluralizedFields", token, name)
			}
		}
		check(token, obj.StateInputs)
		check(token, obj.Inputs)
		check(token, obj.Outputs)
	}

	for _, section := range []map[string]objectSpec{spec.Resources, spec.Functions, spec.Types} {
		for token, obj := range section {
			check(token, &obj)
		}
	}
}
