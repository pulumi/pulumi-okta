// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a Sign On Policy Rule.
//
// ## Import
//
// A Policy Rule can be imported via the Policy and Rule ID.
//
// ```sh
//  $ pulumi import okta:policy/ruleSignon:RuleSignon example <policy id>/<rule id>
// ```
type RuleSignon struct {
	pulumi.CustomResourceState

	// Allow or deny access based on the rule conditions: `"ALLOW"` or `"DENY"`. The default is `"ALLOW"`.
	Access pulumi.StringPtrOutput `pulumi:"access"`
	// Authentication entrypoint: `"ANY"` or `"RADIUS"`.
	Authtype pulumi.StringPtrOutput `pulumi:"authtype"`
	// Elapsed time before the next MFA challenge.
	MfaLifetime pulumi.IntPtrOutput `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `"DEVICE"`, `"SESSION"` or `"ALWAYS"`.
	MfaPrompt pulumi.StringPtrOutput `pulumi:"mfaPrompt"`
	// Remember MFA device. The default `false`.
	MfaRememberDevice pulumi.BoolPtrOutput `pulumi:"mfaRememberDevice"`
	// Require MFA. By default is `false`.
	MfaRequired pulumi.BoolPtrOutput `pulumi:"mfaRequired"`
	// Policy Rule Name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Network selection mode: `"ANYWHERE"`, `"ZONE"`, `"ON_NETWORK"`, or `"OFF_NETWORK"`.
	NetworkConnection pulumi.StringPtrOutput `pulumi:"networkConnection"`
	// The network zones to exclude. Conflicts with `networkIncludes`.
	NetworkExcludes pulumi.StringArrayOutput `pulumi:"networkExcludes"`
	// The network zones to include. Conflicts with `networkExcludes`.
	NetworkIncludes pulumi.StringArrayOutput `pulumi:"networkIncludes"`
	// Policy ID.
	Policyid pulumi.StringOutput `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Max minutes a session can be idle.,
	SessionIdle pulumi.IntPtrOutput `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0.
	SessionLifetime pulumi.IntPtrOutput `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session cookies.
	SessionPersistent pulumi.BoolPtrOutput `pulumi:"sessionPersistent"`
	// Policy Rule Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayOutput `pulumi:"usersExcludeds"`
}

// NewRuleSignon registers a new resource with the given unique name, arguments, and options.
func NewRuleSignon(ctx *pulumi.Context,
	name string, args *RuleSignonArgs, opts ...pulumi.ResourceOption) (*RuleSignon, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policyid == nil {
		return nil, errors.New("invalid value for required argument 'Policyid'")
	}
	var resource RuleSignon
	err := ctx.RegisterResource("okta:policy/ruleSignon:RuleSignon", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleSignon gets an existing RuleSignon resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleSignon(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleSignonState, opts ...pulumi.ResourceOption) (*RuleSignon, error) {
	var resource RuleSignon
	err := ctx.ReadResource("okta:policy/ruleSignon:RuleSignon", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuleSignon resources.
type ruleSignonState struct {
	// Allow or deny access based on the rule conditions: `"ALLOW"` or `"DENY"`. The default is `"ALLOW"`.
	Access *string `pulumi:"access"`
	// Authentication entrypoint: `"ANY"` or `"RADIUS"`.
	Authtype *string `pulumi:"authtype"`
	// Elapsed time before the next MFA challenge.
	MfaLifetime *int `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `"DEVICE"`, `"SESSION"` or `"ALWAYS"`.
	MfaPrompt *string `pulumi:"mfaPrompt"`
	// Remember MFA device. The default `false`.
	MfaRememberDevice *bool `pulumi:"mfaRememberDevice"`
	// Require MFA. By default is `false`.
	MfaRequired *bool `pulumi:"mfaRequired"`
	// Policy Rule Name.
	Name *string `pulumi:"name"`
	// Network selection mode: `"ANYWHERE"`, `"ZONE"`, `"ON_NETWORK"`, or `"OFF_NETWORK"`.
	NetworkConnection *string `pulumi:"networkConnection"`
	// The network zones to exclude. Conflicts with `networkIncludes`.
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// The network zones to include. Conflicts with `networkExcludes`.
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Policy ID.
	Policyid *string `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority *int `pulumi:"priority"`
	// Max minutes a session can be idle.,
	SessionIdle *int `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0.
	SessionLifetime *int `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session cookies.
	SessionPersistent *bool `pulumi:"sessionPersistent"`
	// Policy Rule Status: `"ACTIVE"` or `"INACTIVE"`.
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

type RuleSignonState struct {
	// Allow or deny access based on the rule conditions: `"ALLOW"` or `"DENY"`. The default is `"ALLOW"`.
	Access pulumi.StringPtrInput
	// Authentication entrypoint: `"ANY"` or `"RADIUS"`.
	Authtype pulumi.StringPtrInput
	// Elapsed time before the next MFA challenge.
	MfaLifetime pulumi.IntPtrInput
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `"DEVICE"`, `"SESSION"` or `"ALWAYS"`.
	MfaPrompt pulumi.StringPtrInput
	// Remember MFA device. The default `false`.
	MfaRememberDevice pulumi.BoolPtrInput
	// Require MFA. By default is `false`.
	MfaRequired pulumi.BoolPtrInput
	// Policy Rule Name.
	Name pulumi.StringPtrInput
	// Network selection mode: `"ANYWHERE"`, `"ZONE"`, `"ON_NETWORK"`, or `"OFF_NETWORK"`.
	NetworkConnection pulumi.StringPtrInput
	// The network zones to exclude. Conflicts with `networkIncludes`.
	NetworkExcludes pulumi.StringArrayInput
	// The network zones to include. Conflicts with `networkExcludes`.
	NetworkIncludes pulumi.StringArrayInput
	// Policy ID.
	Policyid pulumi.StringPtrInput
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrInput
	// Max minutes a session can be idle.,
	SessionIdle pulumi.IntPtrInput
	// Max minutes a session is active: Disable = 0.
	SessionLifetime pulumi.IntPtrInput
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session cookies.
	SessionPersistent pulumi.BoolPtrInput
	// Policy Rule Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrInput
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayInput
}

func (RuleSignonState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleSignonState)(nil)).Elem()
}

type ruleSignonArgs struct {
	// Allow or deny access based on the rule conditions: `"ALLOW"` or `"DENY"`. The default is `"ALLOW"`.
	Access *string `pulumi:"access"`
	// Authentication entrypoint: `"ANY"` or `"RADIUS"`.
	Authtype *string `pulumi:"authtype"`
	// Elapsed time before the next MFA challenge.
	MfaLifetime *int `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `"DEVICE"`, `"SESSION"` or `"ALWAYS"`.
	MfaPrompt *string `pulumi:"mfaPrompt"`
	// Remember MFA device. The default `false`.
	MfaRememberDevice *bool `pulumi:"mfaRememberDevice"`
	// Require MFA. By default is `false`.
	MfaRequired *bool `pulumi:"mfaRequired"`
	// Policy Rule Name.
	Name *string `pulumi:"name"`
	// Network selection mode: `"ANYWHERE"`, `"ZONE"`, `"ON_NETWORK"`, or `"OFF_NETWORK"`.
	NetworkConnection *string `pulumi:"networkConnection"`
	// The network zones to exclude. Conflicts with `networkIncludes`.
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// The network zones to include. Conflicts with `networkExcludes`.
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Policy ID.
	Policyid string `pulumi:"policyid"`
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority *int `pulumi:"priority"`
	// Max minutes a session can be idle.,
	SessionIdle *int `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0.
	SessionLifetime *int `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session cookies.
	SessionPersistent *bool `pulumi:"sessionPersistent"`
	// Policy Rule Status: `"ACTIVE"` or `"INACTIVE"`.
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

// The set of arguments for constructing a RuleSignon resource.
type RuleSignonArgs struct {
	// Allow or deny access based on the rule conditions: `"ALLOW"` or `"DENY"`. The default is `"ALLOW"`.
	Access pulumi.StringPtrInput
	// Authentication entrypoint: `"ANY"` or `"RADIUS"`.
	Authtype pulumi.StringPtrInput
	// Elapsed time before the next MFA challenge.
	MfaLifetime pulumi.IntPtrInput
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `"DEVICE"`, `"SESSION"` or `"ALWAYS"`.
	MfaPrompt pulumi.StringPtrInput
	// Remember MFA device. The default `false`.
	MfaRememberDevice pulumi.BoolPtrInput
	// Require MFA. By default is `false`.
	MfaRequired pulumi.BoolPtrInput
	// Policy Rule Name.
	Name pulumi.StringPtrInput
	// Network selection mode: `"ANYWHERE"`, `"ZONE"`, `"ON_NETWORK"`, or `"OFF_NETWORK"`.
	NetworkConnection pulumi.StringPtrInput
	// The network zones to exclude. Conflicts with `networkIncludes`.
	NetworkExcludes pulumi.StringArrayInput
	// The network zones to include. Conflicts with `networkExcludes`.
	NetworkIncludes pulumi.StringArrayInput
	// Policy ID.
	Policyid pulumi.StringInput
	// Policy Rule Priority, this attribute can be set to a valid priority. To avoid endless diff situation we error if an invalid priority is provided. API defaults it to the last (lowest) if not there.
	Priority pulumi.IntPtrInput
	// Max minutes a session can be idle.,
	SessionIdle pulumi.IntPtrInput
	// Max minutes a session is active: Disable = 0.
	SessionLifetime pulumi.IntPtrInput
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session cookies.
	SessionPersistent pulumi.BoolPtrInput
	// Policy Rule Status: `"ACTIVE"` or `"INACTIVE"`.
	Status pulumi.StringPtrInput
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayInput
}

func (RuleSignonArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleSignonArgs)(nil)).Elem()
}

type RuleSignonInput interface {
	pulumi.Input

	ToRuleSignonOutput() RuleSignonOutput
	ToRuleSignonOutputWithContext(ctx context.Context) RuleSignonOutput
}

func (*RuleSignon) ElementType() reflect.Type {
	return reflect.TypeOf((*RuleSignon)(nil))
}

func (i *RuleSignon) ToRuleSignonOutput() RuleSignonOutput {
	return i.ToRuleSignonOutputWithContext(context.Background())
}

func (i *RuleSignon) ToRuleSignonOutputWithContext(ctx context.Context) RuleSignonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonOutput)
}

func (i *RuleSignon) ToRuleSignonPtrOutput() RuleSignonPtrOutput {
	return i.ToRuleSignonPtrOutputWithContext(context.Background())
}

func (i *RuleSignon) ToRuleSignonPtrOutputWithContext(ctx context.Context) RuleSignonPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonPtrOutput)
}

type RuleSignonPtrInput interface {
	pulumi.Input

	ToRuleSignonPtrOutput() RuleSignonPtrOutput
	ToRuleSignonPtrOutputWithContext(ctx context.Context) RuleSignonPtrOutput
}

type ruleSignonPtrType RuleSignonArgs

func (*ruleSignonPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleSignon)(nil))
}

func (i *ruleSignonPtrType) ToRuleSignonPtrOutput() RuleSignonPtrOutput {
	return i.ToRuleSignonPtrOutputWithContext(context.Background())
}

func (i *ruleSignonPtrType) ToRuleSignonPtrOutputWithContext(ctx context.Context) RuleSignonPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonPtrOutput)
}

// RuleSignonArrayInput is an input type that accepts RuleSignonArray and RuleSignonArrayOutput values.
// You can construct a concrete instance of `RuleSignonArrayInput` via:
//
//          RuleSignonArray{ RuleSignonArgs{...} }
type RuleSignonArrayInput interface {
	pulumi.Input

	ToRuleSignonArrayOutput() RuleSignonArrayOutput
	ToRuleSignonArrayOutputWithContext(context.Context) RuleSignonArrayOutput
}

type RuleSignonArray []RuleSignonInput

func (RuleSignonArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*RuleSignon)(nil))
}

func (i RuleSignonArray) ToRuleSignonArrayOutput() RuleSignonArrayOutput {
	return i.ToRuleSignonArrayOutputWithContext(context.Background())
}

func (i RuleSignonArray) ToRuleSignonArrayOutputWithContext(ctx context.Context) RuleSignonArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonArrayOutput)
}

// RuleSignonMapInput is an input type that accepts RuleSignonMap and RuleSignonMapOutput values.
// You can construct a concrete instance of `RuleSignonMapInput` via:
//
//          RuleSignonMap{ "key": RuleSignonArgs{...} }
type RuleSignonMapInput interface {
	pulumi.Input

	ToRuleSignonMapOutput() RuleSignonMapOutput
	ToRuleSignonMapOutputWithContext(context.Context) RuleSignonMapOutput
}

type RuleSignonMap map[string]RuleSignonInput

func (RuleSignonMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*RuleSignon)(nil))
}

func (i RuleSignonMap) ToRuleSignonMapOutput() RuleSignonMapOutput {
	return i.ToRuleSignonMapOutputWithContext(context.Background())
}

func (i RuleSignonMap) ToRuleSignonMapOutputWithContext(ctx context.Context) RuleSignonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonMapOutput)
}

type RuleSignonOutput struct {
	*pulumi.OutputState
}

func (RuleSignonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RuleSignon)(nil))
}

func (o RuleSignonOutput) ToRuleSignonOutput() RuleSignonOutput {
	return o
}

func (o RuleSignonOutput) ToRuleSignonOutputWithContext(ctx context.Context) RuleSignonOutput {
	return o
}

func (o RuleSignonOutput) ToRuleSignonPtrOutput() RuleSignonPtrOutput {
	return o.ToRuleSignonPtrOutputWithContext(context.Background())
}

func (o RuleSignonOutput) ToRuleSignonPtrOutputWithContext(ctx context.Context) RuleSignonPtrOutput {
	return o.ApplyT(func(v RuleSignon) *RuleSignon {
		return &v
	}).(RuleSignonPtrOutput)
}

type RuleSignonPtrOutput struct {
	*pulumi.OutputState
}

func (RuleSignonPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleSignon)(nil))
}

func (o RuleSignonPtrOutput) ToRuleSignonPtrOutput() RuleSignonPtrOutput {
	return o
}

func (o RuleSignonPtrOutput) ToRuleSignonPtrOutputWithContext(ctx context.Context) RuleSignonPtrOutput {
	return o
}

type RuleSignonArrayOutput struct{ *pulumi.OutputState }

func (RuleSignonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RuleSignon)(nil))
}

func (o RuleSignonArrayOutput) ToRuleSignonArrayOutput() RuleSignonArrayOutput {
	return o
}

func (o RuleSignonArrayOutput) ToRuleSignonArrayOutputWithContext(ctx context.Context) RuleSignonArrayOutput {
	return o
}

func (o RuleSignonArrayOutput) Index(i pulumi.IntInput) RuleSignonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RuleSignon {
		return vs[0].([]RuleSignon)[vs[1].(int)]
	}).(RuleSignonOutput)
}

type RuleSignonMapOutput struct{ *pulumi.OutputState }

func (RuleSignonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RuleSignon)(nil))
}

func (o RuleSignonMapOutput) ToRuleSignonMapOutput() RuleSignonMapOutput {
	return o
}

func (o RuleSignonMapOutput) ToRuleSignonMapOutputWithContext(ctx context.Context) RuleSignonMapOutput {
	return o
}

func (o RuleSignonMapOutput) MapIndex(k pulumi.StringInput) RuleSignonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RuleSignon {
		return vs[0].(map[string]RuleSignon)[vs[1].(string)]
	}).(RuleSignonOutput)
}

func init() {
	pulumi.RegisterOutputType(RuleSignonOutput{})
	pulumi.RegisterOutputType(RuleSignonPtrOutput{})
	pulumi.RegisterOutputType(RuleSignonArrayOutput{})
	pulumi.RegisterOutputType(RuleSignonMapOutput{})
}
