// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package app

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Creates a Bsaic Auth Application.
//
// This resource allows you to create and configure a Basic Auth Application.
//
// > This content is derived from https://github.com/articulate/terraform-provider-okta/blob/master/website/docs/r/app_basic_auth.html.markdown.
type BasicAuth struct {
	pulumi.CustomResourceState

	// The URL of the authenticating site for this app.
	AuthUrl pulumi.StringPtrOutput `pulumi:"authUrl"`
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrOutput `pulumi:"autoSubmitToolbar"`
	// Groups associated with the application
	Groups pulumi.StringArrayOutput `pulumi:"groups"`
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrOutput `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrOutput `pulumi:"hideWeb"`
	// The Application's display name.
	Label pulumi.StringOutput `pulumi:"label"`
	// name of app.
	Name pulumi.StringOutput `pulumi:"name"`
	// Sign on mode of application.
	SignOnMode pulumi.StringOutput `pulumi:"signOnMode"`
	// Status of application.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The URL of the sign-in page for this app.
	Url pulumi.StringPtrOutput `pulumi:"url"`
	// Users associated with the application
	Users BasicAuthUserArrayOutput `pulumi:"users"`
}

// NewBasicAuth registers a new resource with the given unique name, arguments, and options.
func NewBasicAuth(ctx *pulumi.Context,
	name string, args *BasicAuthArgs, opts ...pulumi.ResourceOption) (*BasicAuth, error) {
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil {
		args = &BasicAuthArgs{}
	}
	var resource BasicAuth
	err := ctx.RegisterResource("okta:app/basicAuth:BasicAuth", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBasicAuth gets an existing BasicAuth resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBasicAuth(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BasicAuthState, opts ...pulumi.ResourceOption) (*BasicAuth, error) {
	var resource BasicAuth
	err := ctx.ReadResource("okta:app/basicAuth:BasicAuth", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BasicAuth resources.
type basicAuthState struct {
	// The URL of the authenticating site for this app.
	AuthUrl *string `pulumi:"authUrl"`
	// Display auto submit toolbar
	AutoSubmitToolbar *bool `pulumi:"autoSubmitToolbar"`
	// Groups associated with the application
	Groups []string `pulumi:"groups"`
	// Do not display application icon on mobile app
	HideIos *bool `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb *bool `pulumi:"hideWeb"`
	// The Application's display name.
	Label *string `pulumi:"label"`
	// name of app.
	Name *string `pulumi:"name"`
	// Sign on mode of application.
	SignOnMode *string `pulumi:"signOnMode"`
	// Status of application.
	Status *string `pulumi:"status"`
	// The URL of the sign-in page for this app.
	Url *string `pulumi:"url"`
	// Users associated with the application
	Users []BasicAuthUser `pulumi:"users"`
}

type BasicAuthState struct {
	// The URL of the authenticating site for this app.
	AuthUrl pulumi.StringPtrInput
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrInput
	// Groups associated with the application
	Groups pulumi.StringArrayInput
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrInput
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrInput
	// The Application's display name.
	Label pulumi.StringPtrInput
	// name of app.
	Name pulumi.StringPtrInput
	// Sign on mode of application.
	SignOnMode pulumi.StringPtrInput
	// Status of application.
	Status pulumi.StringPtrInput
	// The URL of the sign-in page for this app.
	Url pulumi.StringPtrInput
	// Users associated with the application
	Users BasicAuthUserArrayInput
}

func (BasicAuthState) ElementType() reflect.Type {
	return reflect.TypeOf((*basicAuthState)(nil)).Elem()
}

type basicAuthArgs struct {
	// The URL of the authenticating site for this app.
	AuthUrl *string `pulumi:"authUrl"`
	// Display auto submit toolbar
	AutoSubmitToolbar *bool `pulumi:"autoSubmitToolbar"`
	// Groups associated with the application
	Groups []string `pulumi:"groups"`
	// Do not display application icon on mobile app
	HideIos *bool `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb *bool `pulumi:"hideWeb"`
	// The Application's display name.
	Label string `pulumi:"label"`
	// Status of application.
	Status *string `pulumi:"status"`
	// The URL of the sign-in page for this app.
	Url *string `pulumi:"url"`
	// Users associated with the application
	Users []BasicAuthUser `pulumi:"users"`
}

// The set of arguments for constructing a BasicAuth resource.
type BasicAuthArgs struct {
	// The URL of the authenticating site for this app.
	AuthUrl pulumi.StringPtrInput
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrInput
	// Groups associated with the application
	Groups pulumi.StringArrayInput
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrInput
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrInput
	// The Application's display name.
	Label pulumi.StringInput
	// Status of application.
	Status pulumi.StringPtrInput
	// The URL of the sign-in page for this app.
	Url pulumi.StringPtrInput
	// Users associated with the application
	Users BasicAuthUserArrayInput
}

func (BasicAuthArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*basicAuthArgs)(nil)).Elem()
}
