// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a Sign On Policy.
//
// This resource allows you to create and configure a Sign On Policy.
//
// ## Import
//
// A Sign On Policy can be imported via the Okta ID.
//
// ```sh
//  $ pulumi import okta:policy/signon:Signon example <policy id>
// ```
type Signon struct {
	pulumi.CustomResourceState

	// Policy Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of Group IDs to Include.
	GroupsIncludeds pulumi.StringArrayOutput `pulumi:"groupsIncludeds"`
	// Policy Name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Priority of the policy.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Policy Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
}

// NewSignon registers a new resource with the given unique name, arguments, and options.
func NewSignon(ctx *pulumi.Context,
	name string, args *SignonArgs, opts ...pulumi.ResourceOption) (*Signon, error) {
	if args == nil {
		args = &SignonArgs{}
	}

	var resource Signon
	err := ctx.RegisterResource("okta:policy/signon:Signon", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSignon gets an existing Signon resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSignon(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SignonState, opts ...pulumi.ResourceOption) (*Signon, error) {
	var resource Signon
	err := ctx.ReadResource("okta:policy/signon:Signon", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Signon resources.
type signonState struct {
	// Policy Description.
	Description *string `pulumi:"description"`
	// List of Group IDs to Include.
	GroupsIncludeds []string `pulumi:"groupsIncludeds"`
	// Policy Name.
	Name *string `pulumi:"name"`
	// Priority of the policy.
	Priority *int `pulumi:"priority"`
	// Policy Status: `"ACTIVE"` or `"INACTIVE"`.
	Status *string `pulumi:"status"`
}

type SignonState struct {
	// Policy Description.
	Description pulumi.StringPtrInput
	// List of Group IDs to Include.
	GroupsIncludeds pulumi.StringArrayInput
	// Policy Name.
	Name pulumi.StringPtrInput
	// Priority of the policy.
	Priority pulumi.IntPtrInput
	// Policy Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrInput
}

func (SignonState) ElementType() reflect.Type {
	return reflect.TypeOf((*signonState)(nil)).Elem()
}

type signonArgs struct {
	// Policy Description.
	Description *string `pulumi:"description"`
	// List of Group IDs to Include.
	GroupsIncludeds []string `pulumi:"groupsIncludeds"`
	// Policy Name.
	Name *string `pulumi:"name"`
	// Priority of the policy.
	Priority *int `pulumi:"priority"`
	// Policy Status: `"ACTIVE"` or `"INACTIVE"`.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a Signon resource.
type SignonArgs struct {
	// Policy Description.
	Description pulumi.StringPtrInput
	// List of Group IDs to Include.
	GroupsIncludeds pulumi.StringArrayInput
	// Policy Name.
	Name pulumi.StringPtrInput
	// Priority of the policy.
	Priority pulumi.IntPtrInput
	// Policy Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrInput
}

func (SignonArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*signonArgs)(nil)).Elem()
}

type SignonInput interface {
	pulumi.Input

	ToSignonOutput() SignonOutput
	ToSignonOutputWithContext(ctx context.Context) SignonOutput
}

func (*Signon) ElementType() reflect.Type {
	return reflect.TypeOf((*Signon)(nil))
}

func (i *Signon) ToSignonOutput() SignonOutput {
	return i.ToSignonOutputWithContext(context.Background())
}

func (i *Signon) ToSignonOutputWithContext(ctx context.Context) SignonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SignonOutput)
}

func (i *Signon) ToSignonPtrOutput() SignonPtrOutput {
	return i.ToSignonPtrOutputWithContext(context.Background())
}

func (i *Signon) ToSignonPtrOutputWithContext(ctx context.Context) SignonPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SignonPtrOutput)
}

type SignonPtrInput interface {
	pulumi.Input

	ToSignonPtrOutput() SignonPtrOutput
	ToSignonPtrOutputWithContext(ctx context.Context) SignonPtrOutput
}

type signonPtrType SignonArgs

func (*signonPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Signon)(nil))
}

func (i *signonPtrType) ToSignonPtrOutput() SignonPtrOutput {
	return i.ToSignonPtrOutputWithContext(context.Background())
}

func (i *signonPtrType) ToSignonPtrOutputWithContext(ctx context.Context) SignonPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SignonPtrOutput)
}

// SignonArrayInput is an input type that accepts SignonArray and SignonArrayOutput values.
// You can construct a concrete instance of `SignonArrayInput` via:
//
//          SignonArray{ SignonArgs{...} }
type SignonArrayInput interface {
	pulumi.Input

	ToSignonArrayOutput() SignonArrayOutput
	ToSignonArrayOutputWithContext(context.Context) SignonArrayOutput
}

type SignonArray []SignonInput

func (SignonArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Signon)(nil))
}

func (i SignonArray) ToSignonArrayOutput() SignonArrayOutput {
	return i.ToSignonArrayOutputWithContext(context.Background())
}

func (i SignonArray) ToSignonArrayOutputWithContext(ctx context.Context) SignonArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SignonArrayOutput)
}

// SignonMapInput is an input type that accepts SignonMap and SignonMapOutput values.
// You can construct a concrete instance of `SignonMapInput` via:
//
//          SignonMap{ "key": SignonArgs{...} }
type SignonMapInput interface {
	pulumi.Input

	ToSignonMapOutput() SignonMapOutput
	ToSignonMapOutputWithContext(context.Context) SignonMapOutput
}

type SignonMap map[string]SignonInput

func (SignonMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Signon)(nil))
}

func (i SignonMap) ToSignonMapOutput() SignonMapOutput {
	return i.ToSignonMapOutputWithContext(context.Background())
}

func (i SignonMap) ToSignonMapOutputWithContext(ctx context.Context) SignonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SignonMapOutput)
}

type SignonOutput struct {
	*pulumi.OutputState
}

func (SignonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Signon)(nil))
}

func (o SignonOutput) ToSignonOutput() SignonOutput {
	return o
}

func (o SignonOutput) ToSignonOutputWithContext(ctx context.Context) SignonOutput {
	return o
}

func (o SignonOutput) ToSignonPtrOutput() SignonPtrOutput {
	return o.ToSignonPtrOutputWithContext(context.Background())
}

func (o SignonOutput) ToSignonPtrOutputWithContext(ctx context.Context) SignonPtrOutput {
	return o.ApplyT(func(v Signon) *Signon {
		return &v
	}).(SignonPtrOutput)
}

type SignonPtrOutput struct {
	*pulumi.OutputState
}

func (SignonPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Signon)(nil))
}

func (o SignonPtrOutput) ToSignonPtrOutput() SignonPtrOutput {
	return o
}

func (o SignonPtrOutput) ToSignonPtrOutputWithContext(ctx context.Context) SignonPtrOutput {
	return o
}

type SignonArrayOutput struct{ *pulumi.OutputState }

func (SignonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Signon)(nil))
}

func (o SignonArrayOutput) ToSignonArrayOutput() SignonArrayOutput {
	return o
}

func (o SignonArrayOutput) ToSignonArrayOutputWithContext(ctx context.Context) SignonArrayOutput {
	return o
}

func (o SignonArrayOutput) Index(i pulumi.IntInput) SignonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Signon {
		return vs[0].([]Signon)[vs[1].(int)]
	}).(SignonOutput)
}

type SignonMapOutput struct{ *pulumi.OutputState }

func (SignonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Signon)(nil))
}

func (o SignonMapOutput) ToSignonMapOutput() SignonMapOutput {
	return o
}

func (o SignonMapOutput) ToSignonMapOutputWithContext(ctx context.Context) SignonMapOutput {
	return o
}

func (o SignonMapOutput) MapIndex(k pulumi.StringInput) SignonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Signon {
		return vs[0].(map[string]Signon)[vs[1].(string)]
	}).(SignonOutput)
}

func init() {
	pulumi.RegisterOutputType(SignonOutput{})
	pulumi.RegisterOutputType(SignonPtrOutput{})
	pulumi.RegisterOutputType(SignonArrayOutput{})
	pulumi.RegisterOutputType(SignonMapOutput{})
}
