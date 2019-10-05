// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"github.com/stretchr/testify/assert"
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	token := os.Getenv("OKTA_API_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing OKTA_API_TOKEN variable")
	}
	baseUrl := os.Getenv("OKTA_BASE_URL")
	if baseUrl == "" {
		t.Skipf("Skipping test due to missing OKTA_BASE_URL variable")
	}
	orgName := os.Getenv("OKTA_ORG_NAME")
	if orgName == "" {
		t.Skipf("Skipping test due to missing OKTA_ORG_NAME variable")
	}

	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}

	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config:  map[string]string{},
		Tracing: "https://tracing.pulumi-engineering.com/collector/api/v1/spans",
	}
	jsBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/okta",
		},
	})

	shortTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{
			Dir:         path.Join(cwd, "user"),
			SkipRefresh: true,
		}),
	}

	longTests := []integration.ProgramTestOptions{}

	tests := shortTests
	if !testing.Short() {
		tests = append(tests, longTests...)
	}

	for _, test := range tests {
		t.Run(test.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &test)
		})
	}
}
