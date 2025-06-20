// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/auth"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth.NewServerPolicyRule(ctx, "example", &auth.ServerPolicyRuleArgs{
//				AuthServerId: pulumi.String("<auth server id>"),
//				PolicyId:     pulumi.String("<auth server policy id>"),
//				Status:       pulumi.String("ACTIVE"),
//				Name:         pulumi.String("example"),
//				Priority:     pulumi.Int(1),
//				GroupWhitelists: pulumi.StringArray{
//					pulumi.String("<group ids>"),
//				},
//				GrantTypeWhitelists: pulumi.StringArray{
//					pulumi.String("implicit"),
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
// $ pulumi import okta:auth/serverPolicyClaim:ServerPolicyClaim example <auth_server_id>/<policy_id>/<policy_rule_id>
// ```
//
// Deprecated: okta.auth/serverpolicyclaim.ServerPolicyClaim has been deprecated in favor of okta.auth/serverpolicyrule.ServerPolicyRule
type ServerPolicyClaim struct {
	pulumi.CustomResourceState

	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
	AccessTokenLifetimeMinutes pulumi.IntPtrOutput `pulumi:"accessTokenLifetimeMinutes"`
	// Auth server ID
	AuthServerId pulumi.StringOutput `pulumi:"authServerId"`
	// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayOutput `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayOutput `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
	GroupWhitelists pulumi.StringArrayOutput `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrOutput `pulumi:"inlineHookId"`
	// Auth server policy rule name
	Name pulumi.StringOutput `pulumi:"name"`
	// Auth server policy ID
	PolicyId pulumi.StringOutput `pulumi:"policyId"`
	// Priority of the auth server policy rule
	Priority pulumi.IntOutput `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrOutput `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
	RefreshTokenWindowMinutes pulumi.IntPtrOutput `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
	ScopeWhitelists pulumi.StringArrayOutput `pulumi:"scopeWhitelists"`
	// Default to `ACTIVE`
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The rule is the system (default) rule for its associated policy
	System pulumi.BoolOutput `pulumi:"system"`
	// Auth server policy rule type, unlikely this will be anything other then the default
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// Specifies a set of Users to be excluded.
	UserBlacklists pulumi.StringArrayOutput `pulumi:"userBlacklists"`
	// Specifies a set of Users to be included.
	UserWhitelists pulumi.StringArrayOutput `pulumi:"userWhitelists"`
}

// NewServerPolicyClaim registers a new resource with the given unique name, arguments, and options.
func NewServerPolicyClaim(ctx *pulumi.Context,
	name string, args *ServerPolicyClaimArgs, opts ...pulumi.ResourceOption) (*ServerPolicyClaim, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthServerId == nil {
		return nil, errors.New("invalid value for required argument 'AuthServerId'")
	}
	if args.GrantTypeWhitelists == nil {
		return nil, errors.New("invalid value for required argument 'GrantTypeWhitelists'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerPolicyClaim
	err := ctx.RegisterResource("okta:auth/serverPolicyClaim:ServerPolicyClaim", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerPolicyClaim gets an existing ServerPolicyClaim resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerPolicyClaim(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerPolicyClaimState, opts ...pulumi.ResourceOption) (*ServerPolicyClaim, error) {
	var resource ServerPolicyClaim
	err := ctx.ReadResource("okta:auth/serverPolicyClaim:ServerPolicyClaim", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerPolicyClaim resources.
type serverPolicyClaimState struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
	AccessTokenLifetimeMinutes *int `pulumi:"accessTokenLifetimeMinutes"`
	// Auth server ID
	AuthServerId *string `pulumi:"authServerId"`
	// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists []string `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists []string `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
	GroupWhitelists []string `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId *string `pulumi:"inlineHookId"`
	// Auth server policy rule name
	Name *string `pulumi:"name"`
	// Auth server policy ID
	PolicyId *string `pulumi:"policyId"`
	// Priority of the auth server policy rule
	Priority *int `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes *int `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
	RefreshTokenWindowMinutes *int `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
	ScopeWhitelists []string `pulumi:"scopeWhitelists"`
	// Default to `ACTIVE`
	Status *string `pulumi:"status"`
	// The rule is the system (default) rule for its associated policy
	System *bool `pulumi:"system"`
	// Auth server policy rule type, unlikely this will be anything other then the default
	Type *string `pulumi:"type"`
	// Specifies a set of Users to be excluded.
	UserBlacklists []string `pulumi:"userBlacklists"`
	// Specifies a set of Users to be included.
	UserWhitelists []string `pulumi:"userWhitelists"`
}

type ServerPolicyClaimState struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
	AccessTokenLifetimeMinutes pulumi.IntPtrInput
	// Auth server ID
	AuthServerId pulumi.StringPtrInput
	// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
	GroupWhitelists pulumi.StringArrayInput
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrInput
	// Auth server policy rule name
	Name pulumi.StringPtrInput
	// Auth server policy ID
	PolicyId pulumi.StringPtrInput
	// Priority of the auth server policy rule
	Priority pulumi.IntPtrInput
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrInput
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
	RefreshTokenWindowMinutes pulumi.IntPtrInput
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
	ScopeWhitelists pulumi.StringArrayInput
	// Default to `ACTIVE`
	Status pulumi.StringPtrInput
	// The rule is the system (default) rule for its associated policy
	System pulumi.BoolPtrInput
	// Auth server policy rule type, unlikely this will be anything other then the default
	Type pulumi.StringPtrInput
	// Specifies a set of Users to be excluded.
	UserBlacklists pulumi.StringArrayInput
	// Specifies a set of Users to be included.
	UserWhitelists pulumi.StringArrayInput
}

func (ServerPolicyClaimState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverPolicyClaimState)(nil)).Elem()
}

type serverPolicyClaimArgs struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
	AccessTokenLifetimeMinutes *int `pulumi:"accessTokenLifetimeMinutes"`
	// Auth server ID
	AuthServerId string `pulumi:"authServerId"`
	// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists []string `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists []string `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
	GroupWhitelists []string `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId *string `pulumi:"inlineHookId"`
	// Auth server policy rule name
	Name *string `pulumi:"name"`
	// Auth server policy ID
	PolicyId string `pulumi:"policyId"`
	// Priority of the auth server policy rule
	Priority int `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes *int `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
	RefreshTokenWindowMinutes *int `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
	ScopeWhitelists []string `pulumi:"scopeWhitelists"`
	// Default to `ACTIVE`
	Status *string `pulumi:"status"`
	// Auth server policy rule type, unlikely this will be anything other then the default
	Type *string `pulumi:"type"`
	// Specifies a set of Users to be excluded.
	UserBlacklists []string `pulumi:"userBlacklists"`
	// Specifies a set of Users to be included.
	UserWhitelists []string `pulumi:"userWhitelists"`
}

// The set of arguments for constructing a ServerPolicyClaim resource.
type ServerPolicyClaimArgs struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
	AccessTokenLifetimeMinutes pulumi.IntPtrInput
	// Auth server ID
	AuthServerId pulumi.StringInput
	// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
	GroupWhitelists pulumi.StringArrayInput
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrInput
	// Auth server policy rule name
	Name pulumi.StringPtrInput
	// Auth server policy ID
	PolicyId pulumi.StringInput
	// Priority of the auth server policy rule
	Priority pulumi.IntInput
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrInput
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
	RefreshTokenWindowMinutes pulumi.IntPtrInput
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
	ScopeWhitelists pulumi.StringArrayInput
	// Default to `ACTIVE`
	Status pulumi.StringPtrInput
	// Auth server policy rule type, unlikely this will be anything other then the default
	Type pulumi.StringPtrInput
	// Specifies a set of Users to be excluded.
	UserBlacklists pulumi.StringArrayInput
	// Specifies a set of Users to be included.
	UserWhitelists pulumi.StringArrayInput
}

func (ServerPolicyClaimArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverPolicyClaimArgs)(nil)).Elem()
}

type ServerPolicyClaimInput interface {
	pulumi.Input

	ToServerPolicyClaimOutput() ServerPolicyClaimOutput
	ToServerPolicyClaimOutputWithContext(ctx context.Context) ServerPolicyClaimOutput
}

func (*ServerPolicyClaim) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerPolicyClaim)(nil)).Elem()
}

func (i *ServerPolicyClaim) ToServerPolicyClaimOutput() ServerPolicyClaimOutput {
	return i.ToServerPolicyClaimOutputWithContext(context.Background())
}

func (i *ServerPolicyClaim) ToServerPolicyClaimOutputWithContext(ctx context.Context) ServerPolicyClaimOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimOutput)
}

// ServerPolicyClaimArrayInput is an input type that accepts ServerPolicyClaimArray and ServerPolicyClaimArrayOutput values.
// You can construct a concrete instance of `ServerPolicyClaimArrayInput` via:
//
//	ServerPolicyClaimArray{ ServerPolicyClaimArgs{...} }
type ServerPolicyClaimArrayInput interface {
	pulumi.Input

	ToServerPolicyClaimArrayOutput() ServerPolicyClaimArrayOutput
	ToServerPolicyClaimArrayOutputWithContext(context.Context) ServerPolicyClaimArrayOutput
}

type ServerPolicyClaimArray []ServerPolicyClaimInput

func (ServerPolicyClaimArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerPolicyClaim)(nil)).Elem()
}

func (i ServerPolicyClaimArray) ToServerPolicyClaimArrayOutput() ServerPolicyClaimArrayOutput {
	return i.ToServerPolicyClaimArrayOutputWithContext(context.Background())
}

func (i ServerPolicyClaimArray) ToServerPolicyClaimArrayOutputWithContext(ctx context.Context) ServerPolicyClaimArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimArrayOutput)
}

// ServerPolicyClaimMapInput is an input type that accepts ServerPolicyClaimMap and ServerPolicyClaimMapOutput values.
// You can construct a concrete instance of `ServerPolicyClaimMapInput` via:
//
//	ServerPolicyClaimMap{ "key": ServerPolicyClaimArgs{...} }
type ServerPolicyClaimMapInput interface {
	pulumi.Input

	ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput
	ToServerPolicyClaimMapOutputWithContext(context.Context) ServerPolicyClaimMapOutput
}

type ServerPolicyClaimMap map[string]ServerPolicyClaimInput

func (ServerPolicyClaimMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerPolicyClaim)(nil)).Elem()
}

func (i ServerPolicyClaimMap) ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput {
	return i.ToServerPolicyClaimMapOutputWithContext(context.Background())
}

func (i ServerPolicyClaimMap) ToServerPolicyClaimMapOutputWithContext(ctx context.Context) ServerPolicyClaimMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimMapOutput)
}

type ServerPolicyClaimOutput struct{ *pulumi.OutputState }

func (ServerPolicyClaimOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerPolicyClaim)(nil)).Elem()
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimOutput() ServerPolicyClaimOutput {
	return o
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimOutputWithContext(ctx context.Context) ServerPolicyClaimOutput {
	return o
}

// Lifetime of access token. Can be set to a value between 5 and 1440 minutes. Default is `60`.
func (o ServerPolicyClaimOutput) AccessTokenLifetimeMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.IntPtrOutput { return v.AccessTokenLifetimeMinutes }).(pulumi.IntPtrOutput)
}

// Auth server ID
func (o ServerPolicyClaimOutput) AuthServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringOutput { return v.AuthServerId }).(pulumi.StringOutput)
}

// Accepted grant type values, `authorizationCode`, `implicit`, `password`, `clientCredentials`, `urn:ietf:params:oauth:grant-type:saml2-bearer` (*Early Access Property*), `urn:ietf:params:oauth:grant-type:token-exchange` (*Early Access Property*),`urn:ietf:params:oauth:grant-type:device_code` (*Early Access Property*), `interactionCode` (*OIE only*). For `implicit` value either `userWhitelist` or `groupWhitelist` should be set.
func (o ServerPolicyClaimOutput) GrantTypeWhitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.GrantTypeWhitelists }).(pulumi.StringArrayOutput)
}

// Specifies a set of Groups whose Users are to be excluded.
func (o ServerPolicyClaimOutput) GroupBlacklists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.GroupBlacklists }).(pulumi.StringArrayOutput)
}

// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: `EVERYONE`.
func (o ServerPolicyClaimOutput) GroupWhitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.GroupWhitelists }).(pulumi.StringArrayOutput)
}

// The ID of the inline token to trigger.
func (o ServerPolicyClaimOutput) InlineHookId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringPtrOutput { return v.InlineHookId }).(pulumi.StringPtrOutput)
}

// Auth server policy rule name
func (o ServerPolicyClaimOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Auth server policy ID
func (o ServerPolicyClaimOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringOutput { return v.PolicyId }).(pulumi.StringOutput)
}

// Priority of the auth server policy rule
func (o ServerPolicyClaimOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// Lifetime of refresh token.
func (o ServerPolicyClaimOutput) RefreshTokenLifetimeMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.IntPtrOutput { return v.RefreshTokenLifetimeMinutes }).(pulumi.IntPtrOutput)
}

// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes. Default is `10080` (7 days).`refreshTokenWindowMinutes` must be between `accessTokenLifetimeMinutes` and `refreshTokenLifetimeMinutes`.
func (o ServerPolicyClaimOutput) RefreshTokenWindowMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.IntPtrOutput { return v.RefreshTokenWindowMinutes }).(pulumi.IntPtrOutput)
}

// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `*`
func (o ServerPolicyClaimOutput) ScopeWhitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.ScopeWhitelists }).(pulumi.StringArrayOutput)
}

// Default to `ACTIVE`
func (o ServerPolicyClaimOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// The rule is the system (default) rule for its associated policy
func (o ServerPolicyClaimOutput) System() pulumi.BoolOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.BoolOutput { return v.System }).(pulumi.BoolOutput)
}

// Auth server policy rule type, unlikely this will be anything other then the default
func (o ServerPolicyClaimOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// Specifies a set of Users to be excluded.
func (o ServerPolicyClaimOutput) UserBlacklists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.UserBlacklists }).(pulumi.StringArrayOutput)
}

// Specifies a set of Users to be included.
func (o ServerPolicyClaimOutput) UserWhitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerPolicyClaim) pulumi.StringArrayOutput { return v.UserWhitelists }).(pulumi.StringArrayOutput)
}

type ServerPolicyClaimArrayOutput struct{ *pulumi.OutputState }

func (ServerPolicyClaimArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerPolicyClaim)(nil)).Elem()
}

func (o ServerPolicyClaimArrayOutput) ToServerPolicyClaimArrayOutput() ServerPolicyClaimArrayOutput {
	return o
}

func (o ServerPolicyClaimArrayOutput) ToServerPolicyClaimArrayOutputWithContext(ctx context.Context) ServerPolicyClaimArrayOutput {
	return o
}

func (o ServerPolicyClaimArrayOutput) Index(i pulumi.IntInput) ServerPolicyClaimOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerPolicyClaim {
		return vs[0].([]*ServerPolicyClaim)[vs[1].(int)]
	}).(ServerPolicyClaimOutput)
}

type ServerPolicyClaimMapOutput struct{ *pulumi.OutputState }

func (ServerPolicyClaimMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerPolicyClaim)(nil)).Elem()
}

func (o ServerPolicyClaimMapOutput) ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput {
	return o
}

func (o ServerPolicyClaimMapOutput) ToServerPolicyClaimMapOutputWithContext(ctx context.Context) ServerPolicyClaimMapOutput {
	return o
}

func (o ServerPolicyClaimMapOutput) MapIndex(k pulumi.StringInput) ServerPolicyClaimOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerPolicyClaim {
		return vs[0].(map[string]*ServerPolicyClaim)[vs[1].(string)]
	}).(ServerPolicyClaimOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerPolicyClaimInput)(nil)).Elem(), &ServerPolicyClaim{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerPolicyClaimArrayInput)(nil)).Elem(), ServerPolicyClaimArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerPolicyClaimMapInput)(nil)).Elem(), ServerPolicyClaimMap{})
	pulumi.RegisterOutputType(ServerPolicyClaimOutput{})
	pulumi.RegisterOutputType(ServerPolicyClaimArrayOutput{})
	pulumi.RegisterOutputType(ServerPolicyClaimMapOutput{})
}
