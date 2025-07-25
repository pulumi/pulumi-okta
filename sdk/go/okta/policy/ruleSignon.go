// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a Sign On Policy Rule. In case `Invalid condition type specified: riskScore.` error is thrown, set `riscLevel` to an empty string, since this feature is not enabled.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta"
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/policy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := policy.NewSignon(ctx, "test", &policy.SignonArgs{
//				Name:        pulumi.String("Example Policy"),
//				Status:      pulumi.String("ACTIVE"),
//				Description: pulumi.String("Example Policy"),
//			})
//			if err != nil {
//				return err
//			}
//			newCity, err := okta.LookupBehaviour(ctx, &okta.LookupBehaviourArgs{
//				Name: pulumi.StringRef("New City"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = policy.NewRuleSignon(ctx, "example", &policy.RuleSignonArgs{
//				Access:            pulumi.String("CHALLENGE"),
//				Authtype:          pulumi.String("RADIUS"),
//				Name:              pulumi.String("Example Policy Rule"),
//				NetworkConnection: pulumi.String("ANYWHERE"),
//				PolicyId:          pulumi.Any(exampleOktaPolicySignon.Id),
//				Status:            pulumi.String("ACTIVE"),
//				RiscLevel:         pulumi.String("HIGH"),
//				Behaviors: pulumi.StringArray{
//					pulumi.String(newCity.Id),
//				},
//				FactorSequences: policy.RuleSignonFactorSequenceArray{
//					&policy.RuleSignonFactorSequenceArgs{
//						PrimaryCriteriaFactorType: pulumi.String("token:hotp"),
//						PrimaryCriteriaProvider:   pulumi.String("CUSTOM"),
//						SecondaryCriterias: policy.RuleSignonFactorSequenceSecondaryCriteriaArray{
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("token:software:totp"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("push"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("password"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("question"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("sms"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("token:software:totp"),
//								Provider:   pulumi.String("GOOGLE"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("email"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("call"),
//								Provider:   pulumi.String("OKTA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("webauthn"),
//								Provider:   pulumi.String("FIDO"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("token"),
//								Provider:   pulumi.String("RSA"),
//							},
//							&policy.RuleSignonFactorSequenceSecondaryCriteriaArgs{
//								FactorType: pulumi.String("token"),
//								Provider:   pulumi.String("SYMANTEC"),
//							},
//						},
//					},
//					&policy.RuleSignonFactorSequenceArgs{
//						PrimaryCriteriaFactorType: pulumi.String("token:software:totp"),
//						PrimaryCriteriaProvider:   pulumi.String("OKTA"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import okta:policy/ruleSignon:RuleSignon example <policy_id>/<rule_id>
// ```
type RuleSignon struct {
	pulumi.CustomResourceState

	// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
	Access pulumi.StringPtrOutput `pulumi:"access"`
	// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
	Authtype pulumi.StringPtrOutput `pulumi:"authtype"`
	// List of behavior IDs
	Behaviors pulumi.StringArrayOutput `pulumi:"behaviors"`
	// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
	// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
	// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
	// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
	FactorSequences RuleSignonFactorSequenceArrayOutput `pulumi:"factorSequences"`
	// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
	// `identityProvider` requires a feature flag to be enabled.
	IdentityProvider pulumi.StringPtrOutput `pulumi:"identityProvider"`
	// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
	IdentityProviderIds pulumi.StringArrayOutput `pulumi:"identityProviderIds"`
	// Elapsed time before the next MFA challenge
	MfaLifetime pulumi.IntPtrOutput `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
	// or`ALWAYS`.
	MfaPrompt pulumi.StringPtrOutput `pulumi:"mfaPrompt"`
	// Remember MFA device. Default: `false`
	MfaRememberDevice pulumi.BoolPtrOutput `pulumi:"mfaRememberDevice"`
	// Require MFA. Default: `false`
	MfaRequired pulumi.BoolPtrOutput `pulumi:"mfaRequired"`
	// Policy Rule Name
	Name pulumi.StringOutput `pulumi:"name"`
	// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
	NetworkConnection pulumi.StringPtrOutput `pulumi:"networkConnection"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
	NetworkExcludes pulumi.StringArrayOutput `pulumi:"networkExcludes"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
	NetworkIncludes pulumi.StringArrayOutput `pulumi:"networkIncludes"`
	// Policy ID of the Rule
	PolicyId pulumi.StringPtrOutput `pulumi:"policyId"`
	// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
	// `PASSWORD_IDP`.
	PrimaryFactor pulumi.StringOutput `pulumi:"primaryFactor"`
	// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
	// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	//
	// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
	RiscLevel pulumi.StringPtrOutput `pulumi:"riscLevel"`
	// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	RiskLevel pulumi.StringPtrOutput `pulumi:"riskLevel"`
	// Max minutes a session can be idle. Default: `120`
	SessionIdle pulumi.IntPtrOutput `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0. Default: `120`
	SessionLifetime pulumi.IntPtrOutput `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
	// cookies. Default: `false`
	SessionPersistent pulumi.BoolPtrOutput `pulumi:"sessionPersistent"`
	// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayOutput `pulumi:"usersExcludeds"`
}

// NewRuleSignon registers a new resource with the given unique name, arguments, and options.
func NewRuleSignon(ctx *pulumi.Context,
	name string, args *RuleSignonArgs, opts ...pulumi.ResourceOption) (*RuleSignon, error) {
	if args == nil {
		args = &RuleSignonArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
	Access *string `pulumi:"access"`
	// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
	Authtype *string `pulumi:"authtype"`
	// List of behavior IDs
	Behaviors []string `pulumi:"behaviors"`
	// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
	// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
	// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
	// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
	FactorSequences []RuleSignonFactorSequence `pulumi:"factorSequences"`
	// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
	// `identityProvider` requires a feature flag to be enabled.
	IdentityProvider *string `pulumi:"identityProvider"`
	// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
	IdentityProviderIds []string `pulumi:"identityProviderIds"`
	// Elapsed time before the next MFA challenge
	MfaLifetime *int `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
	// or`ALWAYS`.
	MfaPrompt *string `pulumi:"mfaPrompt"`
	// Remember MFA device. Default: `false`
	MfaRememberDevice *bool `pulumi:"mfaRememberDevice"`
	// Require MFA. Default: `false`
	MfaRequired *bool `pulumi:"mfaRequired"`
	// Policy Rule Name
	Name *string `pulumi:"name"`
	// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
	NetworkConnection *string `pulumi:"networkConnection"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Policy ID of the Rule
	PolicyId *string `pulumi:"policyId"`
	// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
	// `PASSWORD_IDP`.
	PrimaryFactor *string `pulumi:"primaryFactor"`
	// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
	// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
	Priority *int `pulumi:"priority"`
	// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	//
	// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
	RiscLevel *string `pulumi:"riscLevel"`
	// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	RiskLevel *string `pulumi:"riskLevel"`
	// Max minutes a session can be idle. Default: `120`
	SessionIdle *int `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0. Default: `120`
	SessionLifetime *int `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
	// cookies. Default: `false`
	SessionPersistent *bool `pulumi:"sessionPersistent"`
	// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

type RuleSignonState struct {
	// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
	Access pulumi.StringPtrInput
	// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
	Authtype pulumi.StringPtrInput
	// List of behavior IDs
	Behaviors pulumi.StringArrayInput
	// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
	// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
	// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
	// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
	FactorSequences RuleSignonFactorSequenceArrayInput
	// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
	// `identityProvider` requires a feature flag to be enabled.
	IdentityProvider pulumi.StringPtrInput
	// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
	IdentityProviderIds pulumi.StringArrayInput
	// Elapsed time before the next MFA challenge
	MfaLifetime pulumi.IntPtrInput
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
	// or`ALWAYS`.
	MfaPrompt pulumi.StringPtrInput
	// Remember MFA device. Default: `false`
	MfaRememberDevice pulumi.BoolPtrInput
	// Require MFA. Default: `false`
	MfaRequired pulumi.BoolPtrInput
	// Policy Rule Name
	Name pulumi.StringPtrInput
	// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
	NetworkConnection pulumi.StringPtrInput
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
	NetworkExcludes pulumi.StringArrayInput
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
	NetworkIncludes pulumi.StringArrayInput
	// Policy ID of the Rule
	PolicyId pulumi.StringPtrInput
	// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
	// `PASSWORD_IDP`.
	PrimaryFactor pulumi.StringPtrInput
	// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
	// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
	Priority pulumi.IntPtrInput
	// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	//
	// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
	RiscLevel pulumi.StringPtrInput
	// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	RiskLevel pulumi.StringPtrInput
	// Max minutes a session can be idle. Default: `120`
	SessionIdle pulumi.IntPtrInput
	// Max minutes a session is active: Disable = 0. Default: `120`
	SessionLifetime pulumi.IntPtrInput
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
	// cookies. Default: `false`
	SessionPersistent pulumi.BoolPtrInput
	// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
	Status pulumi.StringPtrInput
	// Set of User IDs to Exclude
	UsersExcludeds pulumi.StringArrayInput
}

func (RuleSignonState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleSignonState)(nil)).Elem()
}

type ruleSignonArgs struct {
	// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
	Access *string `pulumi:"access"`
	// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
	Authtype *string `pulumi:"authtype"`
	// List of behavior IDs
	Behaviors []string `pulumi:"behaviors"`
	// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
	// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
	// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
	// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
	FactorSequences []RuleSignonFactorSequence `pulumi:"factorSequences"`
	// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
	// `identityProvider` requires a feature flag to be enabled.
	IdentityProvider *string `pulumi:"identityProvider"`
	// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
	IdentityProviderIds []string `pulumi:"identityProviderIds"`
	// Elapsed time before the next MFA challenge
	MfaLifetime *int `pulumi:"mfaLifetime"`
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
	// or`ALWAYS`.
	MfaPrompt *string `pulumi:"mfaPrompt"`
	// Remember MFA device. Default: `false`
	MfaRememberDevice *bool `pulumi:"mfaRememberDevice"`
	// Require MFA. Default: `false`
	MfaRequired *bool `pulumi:"mfaRequired"`
	// Policy Rule Name
	Name *string `pulumi:"name"`
	// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
	NetworkConnection *string `pulumi:"networkConnection"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
	NetworkExcludes []string `pulumi:"networkExcludes"`
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
	NetworkIncludes []string `pulumi:"networkIncludes"`
	// Policy ID of the Rule
	PolicyId *string `pulumi:"policyId"`
	// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
	// `PASSWORD_IDP`.
	PrimaryFactor *string `pulumi:"primaryFactor"`
	// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
	// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
	Priority *int `pulumi:"priority"`
	// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	//
	// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
	RiscLevel *string `pulumi:"riscLevel"`
	// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	RiskLevel *string `pulumi:"riskLevel"`
	// Max minutes a session can be idle. Default: `120`
	SessionIdle *int `pulumi:"sessionIdle"`
	// Max minutes a session is active: Disable = 0. Default: `120`
	SessionLifetime *int `pulumi:"sessionLifetime"`
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
	// cookies. Default: `false`
	SessionPersistent *bool `pulumi:"sessionPersistent"`
	// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
	Status *string `pulumi:"status"`
	// Set of User IDs to Exclude
	UsersExcludeds []string `pulumi:"usersExcludeds"`
}

// The set of arguments for constructing a RuleSignon resource.
type RuleSignonArgs struct {
	// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
	Access pulumi.StringPtrInput
	// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
	Authtype pulumi.StringPtrInput
	// List of behavior IDs
	Behaviors pulumi.StringArrayInput
	// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
	// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
	// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
	// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
	FactorSequences RuleSignonFactorSequenceArrayInput
	// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
	// `identityProvider` requires a feature flag to be enabled.
	IdentityProvider pulumi.StringPtrInput
	// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
	IdentityProviderIds pulumi.StringArrayInput
	// Elapsed time before the next MFA challenge
	MfaLifetime pulumi.IntPtrInput
	// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
	// or`ALWAYS`.
	MfaPrompt pulumi.StringPtrInput
	// Remember MFA device. Default: `false`
	MfaRememberDevice pulumi.BoolPtrInput
	// Require MFA. Default: `false`
	MfaRequired pulumi.BoolPtrInput
	// Policy Rule Name
	Name pulumi.StringPtrInput
	// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
	NetworkConnection pulumi.StringPtrInput
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
	NetworkExcludes pulumi.StringArrayInput
	// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
	NetworkIncludes pulumi.StringArrayInput
	// Policy ID of the Rule
	PolicyId pulumi.StringPtrInput
	// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
	// `PASSWORD_IDP`.
	PrimaryFactor pulumi.StringPtrInput
	// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
	// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
	Priority pulumi.IntPtrInput
	// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	//
	// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
	RiscLevel pulumi.StringPtrInput
	// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
	RiskLevel pulumi.StringPtrInput
	// Max minutes a session can be idle. Default: `120`
	SessionIdle pulumi.IntPtrInput
	// Max minutes a session is active: Disable = 0. Default: `120`
	SessionLifetime pulumi.IntPtrInput
	// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
	// cookies. Default: `false`
	SessionPersistent pulumi.BoolPtrInput
	// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
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
	return reflect.TypeOf((**RuleSignon)(nil)).Elem()
}

func (i *RuleSignon) ToRuleSignonOutput() RuleSignonOutput {
	return i.ToRuleSignonOutputWithContext(context.Background())
}

func (i *RuleSignon) ToRuleSignonOutputWithContext(ctx context.Context) RuleSignonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonOutput)
}

// RuleSignonArrayInput is an input type that accepts RuleSignonArray and RuleSignonArrayOutput values.
// You can construct a concrete instance of `RuleSignonArrayInput` via:
//
//	RuleSignonArray{ RuleSignonArgs{...} }
type RuleSignonArrayInput interface {
	pulumi.Input

	ToRuleSignonArrayOutput() RuleSignonArrayOutput
	ToRuleSignonArrayOutputWithContext(context.Context) RuleSignonArrayOutput
}

type RuleSignonArray []RuleSignonInput

func (RuleSignonArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleSignon)(nil)).Elem()
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
//	RuleSignonMap{ "key": RuleSignonArgs{...} }
type RuleSignonMapInput interface {
	pulumi.Input

	ToRuleSignonMapOutput() RuleSignonMapOutput
	ToRuleSignonMapOutputWithContext(context.Context) RuleSignonMapOutput
}

type RuleSignonMap map[string]RuleSignonInput

func (RuleSignonMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleSignon)(nil)).Elem()
}

func (i RuleSignonMap) ToRuleSignonMapOutput() RuleSignonMapOutput {
	return i.ToRuleSignonMapOutputWithContext(context.Background())
}

func (i RuleSignonMap) ToRuleSignonMapOutputWithContext(ctx context.Context) RuleSignonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleSignonMapOutput)
}

type RuleSignonOutput struct{ *pulumi.OutputState }

func (RuleSignonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleSignon)(nil)).Elem()
}

func (o RuleSignonOutput) ToRuleSignonOutput() RuleSignonOutput {
	return o
}

func (o RuleSignonOutput) ToRuleSignonOutputWithContext(ctx context.Context) RuleSignonOutput {
	return o
}

// Allow or deny access based on the rule conditions: `ALLOW`, `DENY` or `CHALLENGE`. Default: `ALLOW`
func (o RuleSignonOutput) Access() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.Access }).(pulumi.StringPtrOutput)
}

// Authentication entrypoint: `ANY`, `RADIUS` or `LDAP_INTERFACE`. Default: `ANY`
func (o RuleSignonOutput) Authtype() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.Authtype }).(pulumi.StringPtrOutput)
}

// List of behavior IDs
func (o RuleSignonOutput) Behaviors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringArrayOutput { return v.Behaviors }).(pulumi.StringArrayOutput)
}

// Auth factor sequences. Should be set if 'access = "CHALLENGE"'. - 'primary_criteria_provider' - (Required) Primary
// provider of the auth section. - 'primary_criteria_factor_type' - (Required) Primary factor type of the auth section. -
// 'secondary_criteria' - (Optional) Additional authentication steps. - 'provider' - (Required) Provider of the additional
// authentication step. - 'factor_type' - (Required) Factor type of the additional authentication step.
func (o RuleSignonOutput) FactorSequences() RuleSignonFactorSequenceArrayOutput {
	return o.ApplyT(func(v *RuleSignon) RuleSignonFactorSequenceArrayOutput { return v.FactorSequences }).(RuleSignonFactorSequenceArrayOutput)
}

// Apply rule based on the IdP used: `ANY`, `OKTA` or `SPECIFIC_IDP`. Default: `ANY`. > **WARNING**: Use of
// `identityProvider` requires a feature flag to be enabled.
func (o RuleSignonOutput) IdentityProvider() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.IdentityProvider }).(pulumi.StringPtrOutput)
}

// When identityProvider is `SPECIFIC_IDP` then this is the list of IdP IDs to apply the rule on
func (o RuleSignonOutput) IdentityProviderIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringArrayOutput { return v.IdentityProviderIds }).(pulumi.StringArrayOutput)
}

// Elapsed time before the next MFA challenge
func (o RuleSignonOutput) MfaLifetime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.IntPtrOutput { return v.MfaLifetime }).(pulumi.IntPtrOutput)
}

// Prompt for MFA based on the device used, a factor session lifetime, or every sign-on attempt: `DEVICE`, `SESSION`
// or`ALWAYS`.
func (o RuleSignonOutput) MfaPrompt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.MfaPrompt }).(pulumi.StringPtrOutput)
}

// Remember MFA device. Default: `false`
func (o RuleSignonOutput) MfaRememberDevice() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.BoolPtrOutput { return v.MfaRememberDevice }).(pulumi.BoolPtrOutput)
}

// Require MFA. Default: `false`
func (o RuleSignonOutput) MfaRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.BoolPtrOutput { return v.MfaRequired }).(pulumi.BoolPtrOutput)
}

// Policy Rule Name
func (o RuleSignonOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Network selection mode: `ANYWHERE`, `ZONE`, `ON_NETWORK`, or `OFF_NETWORK`. Default: `ANYWHERE`
func (o RuleSignonOutput) NetworkConnection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.NetworkConnection }).(pulumi.StringPtrOutput)
}

// Required if `networkConnection` = `ZONE`. Indicates the network zones to exclude.
func (o RuleSignonOutput) NetworkExcludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringArrayOutput { return v.NetworkExcludes }).(pulumi.StringArrayOutput)
}

// Required if `networkConnection` = `ZONE`. Indicates the network zones to include.
func (o RuleSignonOutput) NetworkIncludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringArrayOutput { return v.NetworkIncludes }).(pulumi.StringArrayOutput)
}

// Policy ID of the Rule
func (o RuleSignonOutput) PolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.PolicyId }).(pulumi.StringPtrOutput)
}

// Rule's primary factor. **WARNING** Ony works as a part of the Identity Engine. Valid values: `PASSWORD_IDP_ANY_FACTOR`,
// `PASSWORD_IDP`.
func (o RuleSignonOutput) PrimaryFactor() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringOutput { return v.PrimaryFactor }).(pulumi.StringOutput)
}

// Rule priority. This attribute can be set to a valid priority. To avoid an endless diff situation an error is thrown if
// an invalid property is provided. The Okta API defaults to the last (lowest) if not provided.
func (o RuleSignonOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// Risc level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
//
// Deprecated: Attribute typo, switch to riskLevel instead. Default: `ANY`
func (o RuleSignonOutput) RiscLevel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.RiscLevel }).(pulumi.StringPtrOutput)
}

// Risk level: ANY, LOW, MEDIUM or HIGH. Default: `ANY`
func (o RuleSignonOutput) RiskLevel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.RiskLevel }).(pulumi.StringPtrOutput)
}

// Max minutes a session can be idle. Default: `120`
func (o RuleSignonOutput) SessionIdle() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.IntPtrOutput { return v.SessionIdle }).(pulumi.IntPtrOutput)
}

// Max minutes a session is active: Disable = 0. Default: `120`
func (o RuleSignonOutput) SessionLifetime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.IntPtrOutput { return v.SessionLifetime }).(pulumi.IntPtrOutput)
}

// Whether session cookies will last across browser sessions. Okta Administrators can never have persistent session
// cookies. Default: `false`
func (o RuleSignonOutput) SessionPersistent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.BoolPtrOutput { return v.SessionPersistent }).(pulumi.BoolPtrOutput)
}

// Policy Rule Status: `ACTIVE` or `INACTIVE`. Default: `ACTIVE`
func (o RuleSignonOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Set of User IDs to Exclude
func (o RuleSignonOutput) UsersExcludeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RuleSignon) pulumi.StringArrayOutput { return v.UsersExcludeds }).(pulumi.StringArrayOutput)
}

type RuleSignonArrayOutput struct{ *pulumi.OutputState }

func (RuleSignonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleSignon)(nil)).Elem()
}

func (o RuleSignonArrayOutput) ToRuleSignonArrayOutput() RuleSignonArrayOutput {
	return o
}

func (o RuleSignonArrayOutput) ToRuleSignonArrayOutputWithContext(ctx context.Context) RuleSignonArrayOutput {
	return o
}

func (o RuleSignonArrayOutput) Index(i pulumi.IntInput) RuleSignonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuleSignon {
		return vs[0].([]*RuleSignon)[vs[1].(int)]
	}).(RuleSignonOutput)
}

type RuleSignonMapOutput struct{ *pulumi.OutputState }

func (RuleSignonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleSignon)(nil)).Elem()
}

func (o RuleSignonMapOutput) ToRuleSignonMapOutput() RuleSignonMapOutput {
	return o
}

func (o RuleSignonMapOutput) ToRuleSignonMapOutputWithContext(ctx context.Context) RuleSignonMapOutput {
	return o
}

func (o RuleSignonMapOutput) MapIndex(k pulumi.StringInput) RuleSignonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuleSignon {
		return vs[0].(map[string]*RuleSignon)[vs[1].(string)]
	}).(RuleSignonOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleSignonInput)(nil)).Elem(), &RuleSignon{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleSignonArrayInput)(nil)).Elem(), RuleSignonArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleSignonMapInput)(nil)).Elem(), RuleSignonMap{})
	pulumi.RegisterOutputType(RuleSignonOutput{})
	pulumi.RegisterOutputType(RuleSignonArrayOutput{})
	pulumi.RegisterOutputType(RuleSignonMapOutput{})
}
