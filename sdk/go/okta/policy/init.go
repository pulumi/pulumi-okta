// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "okta:policy/deviceAssuranceAndroid:DeviceAssuranceAndroid":
		r = &DeviceAssuranceAndroid{}
	case "okta:policy/deviceAssuranceChromeos:DeviceAssuranceChromeos":
		r = &DeviceAssuranceChromeos{}
	case "okta:policy/deviceAssuranceIos:DeviceAssuranceIos":
		r = &DeviceAssuranceIos{}
	case "okta:policy/deviceAssuranceMacos:DeviceAssuranceMacos":
		r = &DeviceAssuranceMacos{}
	case "okta:policy/deviceAssuranceWindows:DeviceAssuranceWindows":
		r = &DeviceAssuranceWindows{}
	case "okta:policy/mfa:Mfa":
		r = &Mfa{}
	case "okta:policy/password:Password":
		r = &Password{}
	case "okta:policy/ruleIdpDiscovery:RuleIdpDiscovery":
		r = &RuleIdpDiscovery{}
	case "okta:policy/ruleMfa:RuleMfa":
		r = &RuleMfa{}
	case "okta:policy/rulePassword:RulePassword":
		r = &RulePassword{}
	case "okta:policy/ruleSignon:RuleSignon":
		r = &RuleSignon{}
	case "okta:policy/signon:Signon":
		r = &Signon{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"okta",
		"policy/deviceAssuranceAndroid",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/deviceAssuranceChromeos",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/deviceAssuranceIos",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/deviceAssuranceMacos",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/deviceAssuranceWindows",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/mfa",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/password",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/ruleIdpDiscovery",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/ruleMfa",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/rulePassword",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/ruleSignon",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"policy/signon",
		&module{version},
	)
}
