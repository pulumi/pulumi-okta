// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package deprecated

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type PasswordPolicyRule struct {
	pulumi.CustomResourceState

	// Policy Rule Name
	Name pulumi.StringOutput `pulumi:"name"`
	// Network selection mode: ANYWHERE, ZONE, ON_NETWORK, or OFF_NETWORK.
	NetworkConnection pulumi.StringPtrOutput `pulumi:"networkConnection"`
	// The zones to exclude
	NetworkExcludes pulumi.StringArrayOutput `pulumi:"networkExcludes"`
	// The zones to include
	NetworkIncludes pulumi.StringArrayOutput `pulumi:"networkIncludes"`
	// Allow or deny a user to change their password: ALLOW or DENY. Default = ALLOW
	PasswordChange pulumi.StringPtrOutput `pulumi:"passwordChange"`
	// Allow or deny a user to reset their password: ALLOW or DENY. Default = ALLOW
	PasswordReset pulumi.StringPtrOutput `pulumi:"passwordReset"`
	// Allow or deny a user to unlock. Default = DENY
	PasswordUnlock pulumi.StringPtrOutput `pulumi:"passwordUnlock"`
	// Policy ID of the Rule
	Policyid pulumi.StringOutput `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an
	// invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Policy Rule Status: ACTIVE or INACTIVE.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayOutput `pulumi:"usersExcludeds"`
}

// NewPasswordPolicyRule registers a new resource with the given unique name, arguments, and options.
func NewPasswordPolicyRule(ctx *pulumi.Context,
	name string, args *PasswordPolicyRuleArgs, opts ...pulumi.ResourceOption) (*PasswordPolicyRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policyid == nil {
		return nil, errors.New("invalid value for required argument 'Policyid'")
	}
	var resource PasswordPolicyRule
	err := ctx.RegisterResource("okta:deprecated/passwordPolicyRule:PasswordPolicyRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPasswordPolicyRule gets an existing PasswordPolicyRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPasswordPolicyRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PasswordPolicyRuleState, opts ...pulumi.ResourceOption) (*PasswordPolicyRule, error) {
	var resource PasswordPolicyRule
	err := ctx.ReadResource("okta:deprecated/passwordPolicyRule:PasswordPolicyRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PasswordPolicyRule resources.
type passwordPolicyRuleState struct {
	// Policy Rule Name
	Name *string `pulumi:"name"`
	// Network selection mode: ANYWHERE, ZONE, ON_NETWORK, or OFF_NETWORK.
	NetworkConnection *string `pulumi:"networkConnection"`
	// The zones to exclude
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// The zones to include
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Allow or deny a user to change their password: ALLOW or DENY. Default = ALLOW
	PasswordChange *string `pulumi:"passwordChange"`
	// Allow or deny a user to reset their password: ALLOW or DENY. Default = ALLOW
	PasswordReset *string `pulumi:"passwordReset"`
	// Allow or deny a user to unlock. Default = DENY
	PasswordUnlock *string `pulumi:"passwordUnlock"`
	// Policy ID of the Rule
	Policyid *string `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an
	// invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority *int `pulumi:"priority"`
	// Policy Rule Status: ACTIVE or INACTIVE.
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

type PasswordPolicyRuleState struct {
	// Policy Rule Name
	Name pulumi.StringPtrInput
	// Network selection mode: ANYWHERE, ZONE, ON_NETWORK, or OFF_NETWORK.
	NetworkConnection pulumi.StringPtrInput
	// The zones to exclude
	NetworkExcludes pulumi.StringArrayInput
	// The zones to include
	NetworkIncludes pulumi.StringArrayInput
	// Allow or deny a user to change their password: ALLOW or DENY. Default = ALLOW
	PasswordChange pulumi.StringPtrInput
	// Allow or deny a user to reset their password: ALLOW or DENY. Default = ALLOW
	PasswordReset pulumi.StringPtrInput
	// Allow or deny a user to unlock. Default = DENY
	PasswordUnlock pulumi.StringPtrInput
	// Policy ID of the Rule
	Policyid pulumi.StringPtrInput
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an
	// invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrInput
	// Policy Rule Status: ACTIVE or INACTIVE.
	Status pulumi.StringPtrInput
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayInput
}

func (PasswordPolicyRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*passwordPolicyRuleState)(nil)).Elem()
}

type passwordPolicyRuleArgs struct {
	// Policy Rule Name
	Name *string `pulumi:"name"`
	// Network selection mode: ANYWHERE, ZONE, ON_NETWORK, or OFF_NETWORK.
	NetworkConnection *string `pulumi:"networkConnection"`
	// The zones to exclude
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// The zones to include
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Allow or deny a user to change their password: ALLOW or DENY. Default = ALLOW
	PasswordChange *string `pulumi:"passwordChange"`
	// Allow or deny a user to reset their password: ALLOW or DENY. Default = ALLOW
	PasswordReset *string `pulumi:"passwordReset"`
	// Allow or deny a user to unlock. Default = DENY
	PasswordUnlock *string `pulumi:"passwordUnlock"`
	// Policy ID of the Rule
	Policyid string `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an
	// invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority *int `pulumi:"priority"`
	// Policy Rule Status: ACTIVE or INACTIVE.
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

// The set of arguments for constructing a PasswordPolicyRule resource.
type PasswordPolicyRuleArgs struct {
	// Policy Rule Name
	Name pulumi.StringPtrInput
	// Network selection mode: ANYWHERE, ZONE, ON_NETWORK, or OFF_NETWORK.
	NetworkConnection pulumi.StringPtrInput
	// The zones to exclude
	NetworkExcludes pulumi.StringArrayInput
	// The zones to include
	NetworkIncludes pulumi.StringArrayInput
	// Allow or deny a user to change their password: ALLOW or DENY. Default = ALLOW
	PasswordChange pulumi.StringPtrInput
	// Allow or deny a user to reset their password: ALLOW or DENY. Default = ALLOW
	PasswordReset pulumi.StringPtrInput
	// Allow or deny a user to unlock. Default = DENY
	PasswordUnlock pulumi.StringPtrInput
	// Policy ID of the Rule
	Policyid pulumi.StringInput
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an
	// invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrInput
	// Policy Rule Status: ACTIVE or INACTIVE.
	Status pulumi.StringPtrInput
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayInput
}

func (PasswordPolicyRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*passwordPolicyRuleArgs)(nil)).Elem()
}

type PasswordPolicyRuleInput interface {
	pulumi.Input

	ToPasswordPolicyRuleOutput() PasswordPolicyRuleOutput
	ToPasswordPolicyRuleOutputWithContext(ctx context.Context) PasswordPolicyRuleOutput
}

func (*PasswordPolicyRule) ElementType() reflect.Type {
	return reflect.TypeOf((*PasswordPolicyRule)(nil))
}

func (i *PasswordPolicyRule) ToPasswordPolicyRuleOutput() PasswordPolicyRuleOutput {
	return i.ToPasswordPolicyRuleOutputWithContext(context.Background())
}

func (i *PasswordPolicyRule) ToPasswordPolicyRuleOutputWithContext(ctx context.Context) PasswordPolicyRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyRuleOutput)
}

func (i *PasswordPolicyRule) ToPasswordPolicyRulePtrOutput() PasswordPolicyRulePtrOutput {
	return i.ToPasswordPolicyRulePtrOutputWithContext(context.Background())
}

func (i *PasswordPolicyRule) ToPasswordPolicyRulePtrOutputWithContext(ctx context.Context) PasswordPolicyRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyRulePtrOutput)
}

type PasswordPolicyRulePtrInput interface {
	pulumi.Input

	ToPasswordPolicyRulePtrOutput() PasswordPolicyRulePtrOutput
	ToPasswordPolicyRulePtrOutputWithContext(ctx context.Context) PasswordPolicyRulePtrOutput
}

type passwordPolicyRulePtrType PasswordPolicyRuleArgs

func (*passwordPolicyRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**PasswordPolicyRule)(nil))
}

func (i *passwordPolicyRulePtrType) ToPasswordPolicyRulePtrOutput() PasswordPolicyRulePtrOutput {
	return i.ToPasswordPolicyRulePtrOutputWithContext(context.Background())
}

func (i *passwordPolicyRulePtrType) ToPasswordPolicyRulePtrOutputWithContext(ctx context.Context) PasswordPolicyRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyRulePtrOutput)
}

// PasswordPolicyRuleArrayInput is an input type that accepts PasswordPolicyRuleArray and PasswordPolicyRuleArrayOutput values.
// You can construct a concrete instance of `PasswordPolicyRuleArrayInput` via:
//
//          PasswordPolicyRuleArray{ PasswordPolicyRuleArgs{...} }
type PasswordPolicyRuleArrayInput interface {
	pulumi.Input

	ToPasswordPolicyRuleArrayOutput() PasswordPolicyRuleArrayOutput
	ToPasswordPolicyRuleArrayOutputWithContext(context.Context) PasswordPolicyRuleArrayOutput
}

type PasswordPolicyRuleArray []PasswordPolicyRuleInput

func (PasswordPolicyRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*PasswordPolicyRule)(nil))
}

func (i PasswordPolicyRuleArray) ToPasswordPolicyRuleArrayOutput() PasswordPolicyRuleArrayOutput {
	return i.ToPasswordPolicyRuleArrayOutputWithContext(context.Background())
}

func (i PasswordPolicyRuleArray) ToPasswordPolicyRuleArrayOutputWithContext(ctx context.Context) PasswordPolicyRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyRuleArrayOutput)
}

// PasswordPolicyRuleMapInput is an input type that accepts PasswordPolicyRuleMap and PasswordPolicyRuleMapOutput values.
// You can construct a concrete instance of `PasswordPolicyRuleMapInput` via:
//
//          PasswordPolicyRuleMap{ "key": PasswordPolicyRuleArgs{...} }
type PasswordPolicyRuleMapInput interface {
	pulumi.Input

	ToPasswordPolicyRuleMapOutput() PasswordPolicyRuleMapOutput
	ToPasswordPolicyRuleMapOutputWithContext(context.Context) PasswordPolicyRuleMapOutput
}

type PasswordPolicyRuleMap map[string]PasswordPolicyRuleInput

func (PasswordPolicyRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*PasswordPolicyRule)(nil))
}

func (i PasswordPolicyRuleMap) ToPasswordPolicyRuleMapOutput() PasswordPolicyRuleMapOutput {
	return i.ToPasswordPolicyRuleMapOutputWithContext(context.Background())
}

func (i PasswordPolicyRuleMap) ToPasswordPolicyRuleMapOutputWithContext(ctx context.Context) PasswordPolicyRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyRuleMapOutput)
}

type PasswordPolicyRuleOutput struct {
	*pulumi.OutputState
}

func (PasswordPolicyRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PasswordPolicyRule)(nil))
}

func (o PasswordPolicyRuleOutput) ToPasswordPolicyRuleOutput() PasswordPolicyRuleOutput {
	return o
}

func (o PasswordPolicyRuleOutput) ToPasswordPolicyRuleOutputWithContext(ctx context.Context) PasswordPolicyRuleOutput {
	return o
}

func (o PasswordPolicyRuleOutput) ToPasswordPolicyRulePtrOutput() PasswordPolicyRulePtrOutput {
	return o.ToPasswordPolicyRulePtrOutputWithContext(context.Background())
}

func (o PasswordPolicyRuleOutput) ToPasswordPolicyRulePtrOutputWithContext(ctx context.Context) PasswordPolicyRulePtrOutput {
	return o.ApplyT(func(v PasswordPolicyRule) *PasswordPolicyRule {
		return &v
	}).(PasswordPolicyRulePtrOutput)
}

type PasswordPolicyRulePtrOutput struct {
	*pulumi.OutputState
}

func (PasswordPolicyRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PasswordPolicyRule)(nil))
}

func (o PasswordPolicyRulePtrOutput) ToPasswordPolicyRulePtrOutput() PasswordPolicyRulePtrOutput {
	return o
}

func (o PasswordPolicyRulePtrOutput) ToPasswordPolicyRulePtrOutputWithContext(ctx context.Context) PasswordPolicyRulePtrOutput {
	return o
}

type PasswordPolicyRuleArrayOutput struct{ *pulumi.OutputState }

func (PasswordPolicyRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PasswordPolicyRule)(nil))
}

func (o PasswordPolicyRuleArrayOutput) ToPasswordPolicyRuleArrayOutput() PasswordPolicyRuleArrayOutput {
	return o
}

func (o PasswordPolicyRuleArrayOutput) ToPasswordPolicyRuleArrayOutputWithContext(ctx context.Context) PasswordPolicyRuleArrayOutput {
	return o
}

func (o PasswordPolicyRuleArrayOutput) Index(i pulumi.IntInput) PasswordPolicyRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PasswordPolicyRule {
		return vs[0].([]PasswordPolicyRule)[vs[1].(int)]
	}).(PasswordPolicyRuleOutput)
}

type PasswordPolicyRuleMapOutput struct{ *pulumi.OutputState }

func (PasswordPolicyRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]PasswordPolicyRule)(nil))
}

func (o PasswordPolicyRuleMapOutput) ToPasswordPolicyRuleMapOutput() PasswordPolicyRuleMapOutput {
	return o
}

func (o PasswordPolicyRuleMapOutput) ToPasswordPolicyRuleMapOutputWithContext(ctx context.Context) PasswordPolicyRuleMapOutput {
	return o
}

func (o PasswordPolicyRuleMapOutput) MapIndex(k pulumi.StringInput) PasswordPolicyRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) PasswordPolicyRule {
		return vs[0].(map[string]PasswordPolicyRule)[vs[1].(string)]
	}).(PasswordPolicyRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(PasswordPolicyRuleOutput{})
	pulumi.RegisterOutputType(PasswordPolicyRulePtrOutput{})
	pulumi.RegisterOutputType(PasswordPolicyRuleArrayOutput{})
	pulumi.RegisterOutputType(PasswordPolicyRuleMapOutput{})
}
