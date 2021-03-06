// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "okta:index/adminRoleTargets:AdminRoleTargets":
		r, err = NewAdminRoleTargets(ctx, name, nil, pulumi.URN_(urn))
	case "okta:index/eventHook:EventHook":
		r, err = NewEventHook(ctx, name, nil, pulumi.URN_(urn))
	case "okta:index/templateSms:TemplateSms":
		r, err = NewTemplateSms(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:okta" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	return NewProvider(ctx, name, nil, pulumi.URN_(urn))
}

func init() {
	version, err := PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"okta",
		"index/adminRoleTargets",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"index/eventHook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"okta",
		"index/templateSms",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"okta",
		&pkg{version},
	)
}
