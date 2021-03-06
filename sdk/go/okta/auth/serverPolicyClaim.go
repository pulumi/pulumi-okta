// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates an Authorization Server Policy Rule.
//
// This resource allows you to create and configure an Authorization Server Policy Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-okta/sdk/v2/go/okta/auth"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth.NewServerPolicyRule(ctx, "example", &auth.ServerPolicyRuleArgs{
// 			AuthServerId: pulumi.String("<auth server id>"),
// 			GrantTypeWhitelists: pulumi.StringArray{
// 				pulumi.String("implicit"),
// 			},
// 			GroupWhitelists: pulumi.StringArray{
// 				pulumi.String("<group ids>"),
// 			},
// 			PolicyId: pulumi.String("<auth server policy id>"),
// 			Priority: pulumi.Int(1),
// 			Status:   pulumi.String("ACTIVE"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Authorization Server Policy Rule can be imported via the Auth Server ID, Policy ID, and Policy Rule ID.
//
// ```sh
//  $ pulumi import okta:auth/serverPolicyClaim:ServerPolicyClaim example <auth server id>/<policy id>/<policy rule id>
// ```
//
// Deprecated: okta.auth.ServerPolicyClaim has been deprecated in favor of okta.auth.ServerPolicyRule
type ServerPolicyClaim struct {
	pulumi.CustomResourceState

	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes.
	AccessTokenLifetimeMinutes pulumi.IntPtrOutput `pulumi:"accessTokenLifetimeMinutes"`
	// Auth Server ID.
	AuthServerId pulumi.StringOutput `pulumi:"authServerId"`
	// Accepted grant type values, `"authorizationCode"`, `"implicit"`, `"password"` or `"clientCredentials"`. For `"implicit"` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayOutput `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayOutput `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: "EVERYONE".
	GroupWhitelists pulumi.StringArrayOutput `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrOutput `pulumi:"inlineHookId"`
	// Auth Server Policy Rule name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Auth Server Policy ID.
	PolicyId pulumi.StringOutput `pulumi:"policyId"`
	// Priority of the auth server policy rule.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrOutput `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes.
	// `"refreshTokenWindowMinutes"` must be between `"accessTokenLifetimeMinutes"` and `"refreshTokenLifetimeMinutes"`.
	RefreshTokenWindowMinutes pulumi.IntPtrOutput `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `"*"`.
	ScopeWhitelists pulumi.StringArrayOutput `pulumi:"scopeWhitelists"`
	// The status of the Auth Server Policy Rule.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The type of the Auth Server Policy Rule.
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
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes.
	AccessTokenLifetimeMinutes *int `pulumi:"accessTokenLifetimeMinutes"`
	// Auth Server ID.
	AuthServerId *string `pulumi:"authServerId"`
	// Accepted grant type values, `"authorizationCode"`, `"implicit"`, `"password"` or `"clientCredentials"`. For `"implicit"` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists []string `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists []string `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: "EVERYONE".
	GroupWhitelists []string `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId *string `pulumi:"inlineHookId"`
	// Auth Server Policy Rule name.
	Name *string `pulumi:"name"`
	// Auth Server Policy ID.
	PolicyId *string `pulumi:"policyId"`
	// Priority of the auth server policy rule.
	Priority *int `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes *int `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes.
	// `"refreshTokenWindowMinutes"` must be between `"accessTokenLifetimeMinutes"` and `"refreshTokenLifetimeMinutes"`.
	RefreshTokenWindowMinutes *int `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `"*"`.
	ScopeWhitelists []string `pulumi:"scopeWhitelists"`
	// The status of the Auth Server Policy Rule.
	Status *string `pulumi:"status"`
	// The type of the Auth Server Policy Rule.
	Type *string `pulumi:"type"`
	// Specifies a set of Users to be excluded.
	UserBlacklists []string `pulumi:"userBlacklists"`
	// Specifies a set of Users to be included.
	UserWhitelists []string `pulumi:"userWhitelists"`
}

type ServerPolicyClaimState struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes.
	AccessTokenLifetimeMinutes pulumi.IntPtrInput
	// Auth Server ID.
	AuthServerId pulumi.StringPtrInput
	// Accepted grant type values, `"authorizationCode"`, `"implicit"`, `"password"` or `"clientCredentials"`. For `"implicit"` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: "EVERYONE".
	GroupWhitelists pulumi.StringArrayInput
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrInput
	// Auth Server Policy Rule name.
	Name pulumi.StringPtrInput
	// Auth Server Policy ID.
	PolicyId pulumi.StringPtrInput
	// Priority of the auth server policy rule.
	Priority pulumi.IntPtrInput
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrInput
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes.
	// `"refreshTokenWindowMinutes"` must be between `"accessTokenLifetimeMinutes"` and `"refreshTokenLifetimeMinutes"`.
	RefreshTokenWindowMinutes pulumi.IntPtrInput
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `"*"`.
	ScopeWhitelists pulumi.StringArrayInput
	// The status of the Auth Server Policy Rule.
	Status pulumi.StringPtrInput
	// The type of the Auth Server Policy Rule.
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
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes.
	AccessTokenLifetimeMinutes *int `pulumi:"accessTokenLifetimeMinutes"`
	// Auth Server ID.
	AuthServerId string `pulumi:"authServerId"`
	// Accepted grant type values, `"authorizationCode"`, `"implicit"`, `"password"` or `"clientCredentials"`. For `"implicit"` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists []string `pulumi:"grantTypeWhitelists"`
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists []string `pulumi:"groupBlacklists"`
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: "EVERYONE".
	GroupWhitelists []string `pulumi:"groupWhitelists"`
	// The ID of the inline token to trigger.
	InlineHookId *string `pulumi:"inlineHookId"`
	// Auth Server Policy Rule name.
	Name *string `pulumi:"name"`
	// Auth Server Policy ID.
	PolicyId string `pulumi:"policyId"`
	// Priority of the auth server policy rule.
	Priority int `pulumi:"priority"`
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes *int `pulumi:"refreshTokenLifetimeMinutes"`
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes.
	// `"refreshTokenWindowMinutes"` must be between `"accessTokenLifetimeMinutes"` and `"refreshTokenLifetimeMinutes"`.
	RefreshTokenWindowMinutes *int `pulumi:"refreshTokenWindowMinutes"`
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `"*"`.
	ScopeWhitelists []string `pulumi:"scopeWhitelists"`
	// The status of the Auth Server Policy Rule.
	Status *string `pulumi:"status"`
	// The type of the Auth Server Policy Rule.
	Type *string `pulumi:"type"`
	// Specifies a set of Users to be excluded.
	UserBlacklists []string `pulumi:"userBlacklists"`
	// Specifies a set of Users to be included.
	UserWhitelists []string `pulumi:"userWhitelists"`
}

// The set of arguments for constructing a ServerPolicyClaim resource.
type ServerPolicyClaimArgs struct {
	// Lifetime of access token. Can be set to a value between 5 and 1440 minutes.
	AccessTokenLifetimeMinutes pulumi.IntPtrInput
	// Auth Server ID.
	AuthServerId pulumi.StringInput
	// Accepted grant type values, `"authorizationCode"`, `"implicit"`, `"password"` or `"clientCredentials"`. For `"implicit"` value either `userWhitelist` or `groupWhitelist` should be set.
	GrantTypeWhitelists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be excluded.
	GroupBlacklists pulumi.StringArrayInput
	// Specifies a set of Groups whose Users are to be included. Can be set to Group ID or to the following: "EVERYONE".
	GroupWhitelists pulumi.StringArrayInput
	// The ID of the inline token to trigger.
	InlineHookId pulumi.StringPtrInput
	// Auth Server Policy Rule name.
	Name pulumi.StringPtrInput
	// Auth Server Policy ID.
	PolicyId pulumi.StringInput
	// Priority of the auth server policy rule.
	Priority pulumi.IntInput
	// Lifetime of refresh token.
	RefreshTokenLifetimeMinutes pulumi.IntPtrInput
	// Window in which a refresh token can be used. It can be a value between 5 and 2628000 (5 years) minutes.
	// `"refreshTokenWindowMinutes"` must be between `"accessTokenLifetimeMinutes"` and `"refreshTokenLifetimeMinutes"`.
	RefreshTokenWindowMinutes pulumi.IntPtrInput
	// Scopes allowed for this policy rule. They can be whitelisted by name or all can be whitelisted with `"*"`.
	ScopeWhitelists pulumi.StringArrayInput
	// The status of the Auth Server Policy Rule.
	Status pulumi.StringPtrInput
	// The type of the Auth Server Policy Rule.
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
	return reflect.TypeOf((*ServerPolicyClaim)(nil))
}

func (i *ServerPolicyClaim) ToServerPolicyClaimOutput() ServerPolicyClaimOutput {
	return i.ToServerPolicyClaimOutputWithContext(context.Background())
}

func (i *ServerPolicyClaim) ToServerPolicyClaimOutputWithContext(ctx context.Context) ServerPolicyClaimOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimOutput)
}

func (i *ServerPolicyClaim) ToServerPolicyClaimPtrOutput() ServerPolicyClaimPtrOutput {
	return i.ToServerPolicyClaimPtrOutputWithContext(context.Background())
}

func (i *ServerPolicyClaim) ToServerPolicyClaimPtrOutputWithContext(ctx context.Context) ServerPolicyClaimPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimPtrOutput)
}

type ServerPolicyClaimPtrInput interface {
	pulumi.Input

	ToServerPolicyClaimPtrOutput() ServerPolicyClaimPtrOutput
	ToServerPolicyClaimPtrOutputWithContext(ctx context.Context) ServerPolicyClaimPtrOutput
}

type serverPolicyClaimPtrType ServerPolicyClaimArgs

func (*serverPolicyClaimPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerPolicyClaim)(nil))
}

func (i *serverPolicyClaimPtrType) ToServerPolicyClaimPtrOutput() ServerPolicyClaimPtrOutput {
	return i.ToServerPolicyClaimPtrOutputWithContext(context.Background())
}

func (i *serverPolicyClaimPtrType) ToServerPolicyClaimPtrOutputWithContext(ctx context.Context) ServerPolicyClaimPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimPtrOutput)
}

// ServerPolicyClaimArrayInput is an input type that accepts ServerPolicyClaimArray and ServerPolicyClaimArrayOutput values.
// You can construct a concrete instance of `ServerPolicyClaimArrayInput` via:
//
//          ServerPolicyClaimArray{ ServerPolicyClaimArgs{...} }
type ServerPolicyClaimArrayInput interface {
	pulumi.Input

	ToServerPolicyClaimArrayOutput() ServerPolicyClaimArrayOutput
	ToServerPolicyClaimArrayOutputWithContext(context.Context) ServerPolicyClaimArrayOutput
}

type ServerPolicyClaimArray []ServerPolicyClaimInput

func (ServerPolicyClaimArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ServerPolicyClaim)(nil))
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
//          ServerPolicyClaimMap{ "key": ServerPolicyClaimArgs{...} }
type ServerPolicyClaimMapInput interface {
	pulumi.Input

	ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput
	ToServerPolicyClaimMapOutputWithContext(context.Context) ServerPolicyClaimMapOutput
}

type ServerPolicyClaimMap map[string]ServerPolicyClaimInput

func (ServerPolicyClaimMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ServerPolicyClaim)(nil))
}

func (i ServerPolicyClaimMap) ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput {
	return i.ToServerPolicyClaimMapOutputWithContext(context.Background())
}

func (i ServerPolicyClaimMap) ToServerPolicyClaimMapOutputWithContext(ctx context.Context) ServerPolicyClaimMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerPolicyClaimMapOutput)
}

type ServerPolicyClaimOutput struct {
	*pulumi.OutputState
}

func (ServerPolicyClaimOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerPolicyClaim)(nil))
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimOutput() ServerPolicyClaimOutput {
	return o
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimOutputWithContext(ctx context.Context) ServerPolicyClaimOutput {
	return o
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimPtrOutput() ServerPolicyClaimPtrOutput {
	return o.ToServerPolicyClaimPtrOutputWithContext(context.Background())
}

func (o ServerPolicyClaimOutput) ToServerPolicyClaimPtrOutputWithContext(ctx context.Context) ServerPolicyClaimPtrOutput {
	return o.ApplyT(func(v ServerPolicyClaim) *ServerPolicyClaim {
		return &v
	}).(ServerPolicyClaimPtrOutput)
}

type ServerPolicyClaimPtrOutput struct {
	*pulumi.OutputState
}

func (ServerPolicyClaimPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerPolicyClaim)(nil))
}

func (o ServerPolicyClaimPtrOutput) ToServerPolicyClaimPtrOutput() ServerPolicyClaimPtrOutput {
	return o
}

func (o ServerPolicyClaimPtrOutput) ToServerPolicyClaimPtrOutputWithContext(ctx context.Context) ServerPolicyClaimPtrOutput {
	return o
}

type ServerPolicyClaimArrayOutput struct{ *pulumi.OutputState }

func (ServerPolicyClaimArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServerPolicyClaim)(nil))
}

func (o ServerPolicyClaimArrayOutput) ToServerPolicyClaimArrayOutput() ServerPolicyClaimArrayOutput {
	return o
}

func (o ServerPolicyClaimArrayOutput) ToServerPolicyClaimArrayOutputWithContext(ctx context.Context) ServerPolicyClaimArrayOutput {
	return o
}

func (o ServerPolicyClaimArrayOutput) Index(i pulumi.IntInput) ServerPolicyClaimOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServerPolicyClaim {
		return vs[0].([]ServerPolicyClaim)[vs[1].(int)]
	}).(ServerPolicyClaimOutput)
}

type ServerPolicyClaimMapOutput struct{ *pulumi.OutputState }

func (ServerPolicyClaimMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ServerPolicyClaim)(nil))
}

func (o ServerPolicyClaimMapOutput) ToServerPolicyClaimMapOutput() ServerPolicyClaimMapOutput {
	return o
}

func (o ServerPolicyClaimMapOutput) ToServerPolicyClaimMapOutputWithContext(ctx context.Context) ServerPolicyClaimMapOutput {
	return o
}

func (o ServerPolicyClaimMapOutput) MapIndex(k pulumi.StringInput) ServerPolicyClaimOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ServerPolicyClaim {
		return vs[0].(map[string]ServerPolicyClaim)[vs[1].(string)]
	}).(ServerPolicyClaimOutput)
}

func init() {
	pulumi.RegisterOutputType(ServerPolicyClaimOutput{})
	pulumi.RegisterOutputType(ServerPolicyClaimPtrOutput{})
	pulumi.RegisterOutputType(ServerPolicyClaimArrayOutput{})
	pulumi.RegisterOutputType(ServerPolicyClaimMapOutput{})
}
