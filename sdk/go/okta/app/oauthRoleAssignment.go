// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package app

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages assignment of an admin role to an OAuth application
//
//	This resource allows you to assign an Okta admin role to a OAuth
//	service application. This requires the Okta tenant feature flag for this function to be enabled.
//
// ## Import
//
// ```sh
// $ pulumi import okta:app/oauthRoleAssignment:OauthRoleAssignment test <clientID>/<roleAssignmentID>
// ```
type OauthRoleAssignment struct {
	pulumi.CustomResourceState

	// Client ID for the role to be assigned to
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// Label of the role assignment
	Label pulumi.StringOutput `pulumi:"label"`
	// Resource set for the custom role to assign, must be the ID of the created resource set.
	ResourceSet pulumi.StringPtrOutput `pulumi:"resourceSet"`
	// Custom Role ID
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// Status of the role assignment
	Status pulumi.StringOutput `pulumi:"status"`
	// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewOauthRoleAssignment registers a new resource with the given unique name, arguments, and options.
func NewOauthRoleAssignment(ctx *pulumi.Context,
	name string, args *OauthRoleAssignmentArgs, opts ...pulumi.ResourceOption) (*OauthRoleAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OauthRoleAssignment
	err := ctx.RegisterResource("okta:app/oauthRoleAssignment:OauthRoleAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOauthRoleAssignment gets an existing OauthRoleAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOauthRoleAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OauthRoleAssignmentState, opts ...pulumi.ResourceOption) (*OauthRoleAssignment, error) {
	var resource OauthRoleAssignment
	err := ctx.ReadResource("okta:app/oauthRoleAssignment:OauthRoleAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OauthRoleAssignment resources.
type oauthRoleAssignmentState struct {
	// Client ID for the role to be assigned to
	ClientId *string `pulumi:"clientId"`
	// Label of the role assignment
	Label *string `pulumi:"label"`
	// Resource set for the custom role to assign, must be the ID of the created resource set.
	ResourceSet *string `pulumi:"resourceSet"`
	// Custom Role ID
	Role *string `pulumi:"role"`
	// Status of the role assignment
	Status *string `pulumi:"status"`
	// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
	Type *string `pulumi:"type"`
}

type OauthRoleAssignmentState struct {
	// Client ID for the role to be assigned to
	ClientId pulumi.StringPtrInput
	// Label of the role assignment
	Label pulumi.StringPtrInput
	// Resource set for the custom role to assign, must be the ID of the created resource set.
	ResourceSet pulumi.StringPtrInput
	// Custom Role ID
	Role pulumi.StringPtrInput
	// Status of the role assignment
	Status pulumi.StringPtrInput
	// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
	Type pulumi.StringPtrInput
}

func (OauthRoleAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthRoleAssignmentState)(nil)).Elem()
}

type oauthRoleAssignmentArgs struct {
	// Client ID for the role to be assigned to
	ClientId string `pulumi:"clientId"`
	// Resource set for the custom role to assign, must be the ID of the created resource set.
	ResourceSet *string `pulumi:"resourceSet"`
	// Custom Role ID
	Role *string `pulumi:"role"`
	// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a OauthRoleAssignment resource.
type OauthRoleAssignmentArgs struct {
	// Client ID for the role to be assigned to
	ClientId pulumi.StringInput
	// Resource set for the custom role to assign, must be the ID of the created resource set.
	ResourceSet pulumi.StringPtrInput
	// Custom Role ID
	Role pulumi.StringPtrInput
	// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
	Type pulumi.StringInput
}

func (OauthRoleAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthRoleAssignmentArgs)(nil)).Elem()
}

type OauthRoleAssignmentInput interface {
	pulumi.Input

	ToOauthRoleAssignmentOutput() OauthRoleAssignmentOutput
	ToOauthRoleAssignmentOutputWithContext(ctx context.Context) OauthRoleAssignmentOutput
}

func (*OauthRoleAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthRoleAssignment)(nil)).Elem()
}

func (i *OauthRoleAssignment) ToOauthRoleAssignmentOutput() OauthRoleAssignmentOutput {
	return i.ToOauthRoleAssignmentOutputWithContext(context.Background())
}

func (i *OauthRoleAssignment) ToOauthRoleAssignmentOutputWithContext(ctx context.Context) OauthRoleAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthRoleAssignmentOutput)
}

// OauthRoleAssignmentArrayInput is an input type that accepts OauthRoleAssignmentArray and OauthRoleAssignmentArrayOutput values.
// You can construct a concrete instance of `OauthRoleAssignmentArrayInput` via:
//
//	OauthRoleAssignmentArray{ OauthRoleAssignmentArgs{...} }
type OauthRoleAssignmentArrayInput interface {
	pulumi.Input

	ToOauthRoleAssignmentArrayOutput() OauthRoleAssignmentArrayOutput
	ToOauthRoleAssignmentArrayOutputWithContext(context.Context) OauthRoleAssignmentArrayOutput
}

type OauthRoleAssignmentArray []OauthRoleAssignmentInput

func (OauthRoleAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthRoleAssignment)(nil)).Elem()
}

func (i OauthRoleAssignmentArray) ToOauthRoleAssignmentArrayOutput() OauthRoleAssignmentArrayOutput {
	return i.ToOauthRoleAssignmentArrayOutputWithContext(context.Background())
}

func (i OauthRoleAssignmentArray) ToOauthRoleAssignmentArrayOutputWithContext(ctx context.Context) OauthRoleAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthRoleAssignmentArrayOutput)
}

// OauthRoleAssignmentMapInput is an input type that accepts OauthRoleAssignmentMap and OauthRoleAssignmentMapOutput values.
// You can construct a concrete instance of `OauthRoleAssignmentMapInput` via:
//
//	OauthRoleAssignmentMap{ "key": OauthRoleAssignmentArgs{...} }
type OauthRoleAssignmentMapInput interface {
	pulumi.Input

	ToOauthRoleAssignmentMapOutput() OauthRoleAssignmentMapOutput
	ToOauthRoleAssignmentMapOutputWithContext(context.Context) OauthRoleAssignmentMapOutput
}

type OauthRoleAssignmentMap map[string]OauthRoleAssignmentInput

func (OauthRoleAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthRoleAssignment)(nil)).Elem()
}

func (i OauthRoleAssignmentMap) ToOauthRoleAssignmentMapOutput() OauthRoleAssignmentMapOutput {
	return i.ToOauthRoleAssignmentMapOutputWithContext(context.Background())
}

func (i OauthRoleAssignmentMap) ToOauthRoleAssignmentMapOutputWithContext(ctx context.Context) OauthRoleAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthRoleAssignmentMapOutput)
}

type OauthRoleAssignmentOutput struct{ *pulumi.OutputState }

func (OauthRoleAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthRoleAssignment)(nil)).Elem()
}

func (o OauthRoleAssignmentOutput) ToOauthRoleAssignmentOutput() OauthRoleAssignmentOutput {
	return o
}

func (o OauthRoleAssignmentOutput) ToOauthRoleAssignmentOutputWithContext(ctx context.Context) OauthRoleAssignmentOutput {
	return o
}

// Client ID for the role to be assigned to
func (o OauthRoleAssignmentOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// Label of the role assignment
func (o OauthRoleAssignmentOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Resource set for the custom role to assign, must be the ID of the created resource set.
func (o OauthRoleAssignmentOutput) ResourceSet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringPtrOutput { return v.ResourceSet }).(pulumi.StringPtrOutput)
}

// Custom Role ID
func (o OauthRoleAssignmentOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

// Status of the role assignment
func (o OauthRoleAssignmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
func (o OauthRoleAssignmentOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthRoleAssignment) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type OauthRoleAssignmentArrayOutput struct{ *pulumi.OutputState }

func (OauthRoleAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthRoleAssignment)(nil)).Elem()
}

func (o OauthRoleAssignmentArrayOutput) ToOauthRoleAssignmentArrayOutput() OauthRoleAssignmentArrayOutput {
	return o
}

func (o OauthRoleAssignmentArrayOutput) ToOauthRoleAssignmentArrayOutputWithContext(ctx context.Context) OauthRoleAssignmentArrayOutput {
	return o
}

func (o OauthRoleAssignmentArrayOutput) Index(i pulumi.IntInput) OauthRoleAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OauthRoleAssignment {
		return vs[0].([]*OauthRoleAssignment)[vs[1].(int)]
	}).(OauthRoleAssignmentOutput)
}

type OauthRoleAssignmentMapOutput struct{ *pulumi.OutputState }

func (OauthRoleAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthRoleAssignment)(nil)).Elem()
}

func (o OauthRoleAssignmentMapOutput) ToOauthRoleAssignmentMapOutput() OauthRoleAssignmentMapOutput {
	return o
}

func (o OauthRoleAssignmentMapOutput) ToOauthRoleAssignmentMapOutputWithContext(ctx context.Context) OauthRoleAssignmentMapOutput {
	return o
}

func (o OauthRoleAssignmentMapOutput) MapIndex(k pulumi.StringInput) OauthRoleAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OauthRoleAssignment {
		return vs[0].(map[string]*OauthRoleAssignment)[vs[1].(string)]
	}).(OauthRoleAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OauthRoleAssignmentInput)(nil)).Elem(), &OauthRoleAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthRoleAssignmentArrayInput)(nil)).Elem(), OauthRoleAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthRoleAssignmentMapInput)(nil)).Elem(), OauthRoleAssignmentMap{})
	pulumi.RegisterOutputType(OauthRoleAssignmentOutput{})
	pulumi.RegisterOutputType(OauthRoleAssignmentArrayOutput{})
	pulumi.RegisterOutputType(OauthRoleAssignmentMapOutput{})
}
