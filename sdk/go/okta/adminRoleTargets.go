// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages targets for administrator roles.
//
// This resource allows you to define permissions for admin roles into a smaller subset of Groups or Apps within your org.
// You can define admin roles to target Groups, Applications, and Application Instances.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := okta.NewAdminRoleTargets(ctx, "example", &okta.AdminRoleTargetsArgs{
//				UserId:   pulumi.String("<user_id>"),
//				RoleType: pulumi.String("APP_ADMIN"),
//				Apps: pulumi.StringArray{
//					pulumi.String("oidc_client.<app_id>"),
//					pulumi.String("facebook"),
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
// $ pulumi import okta:index/adminRoleTargets:AdminRoleTargets example <user_id>/<role_type>
// ```
type AdminRoleTargets struct {
	pulumi.CustomResourceState

	// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
	Apps pulumi.StringArrayOutput `pulumi:"apps"`
	// List of group IDs. Conflicts with apps
	Groups pulumi.StringArrayOutput `pulumi:"groups"`
	// ID of a role
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
	RoleType pulumi.StringOutput `pulumi:"roleType"`
	// User associated with the role
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewAdminRoleTargets registers a new resource with the given unique name, arguments, and options.
func NewAdminRoleTargets(ctx *pulumi.Context,
	name string, args *AdminRoleTargetsArgs, opts ...pulumi.ResourceOption) (*AdminRoleTargets, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleType == nil {
		return nil, errors.New("invalid value for required argument 'RoleType'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AdminRoleTargets
	err := ctx.RegisterResource("okta:index/adminRoleTargets:AdminRoleTargets", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAdminRoleTargets gets an existing AdminRoleTargets resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAdminRoleTargets(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AdminRoleTargetsState, opts ...pulumi.ResourceOption) (*AdminRoleTargets, error) {
	var resource AdminRoleTargets
	err := ctx.ReadResource("okta:index/adminRoleTargets:AdminRoleTargets", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AdminRoleTargets resources.
type adminRoleTargetsState struct {
	// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
	Apps []string `pulumi:"apps"`
	// List of group IDs. Conflicts with apps
	Groups []string `pulumi:"groups"`
	// ID of a role
	RoleId *string `pulumi:"roleId"`
	// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
	RoleType *string `pulumi:"roleType"`
	// User associated with the role
	UserId *string `pulumi:"userId"`
}

type AdminRoleTargetsState struct {
	// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
	Apps pulumi.StringArrayInput
	// List of group IDs. Conflicts with apps
	Groups pulumi.StringArrayInput
	// ID of a role
	RoleId pulumi.StringPtrInput
	// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
	RoleType pulumi.StringPtrInput
	// User associated with the role
	UserId pulumi.StringPtrInput
}

func (AdminRoleTargetsState) ElementType() reflect.Type {
	return reflect.TypeOf((*adminRoleTargetsState)(nil)).Elem()
}

type adminRoleTargetsArgs struct {
	// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
	Apps []string `pulumi:"apps"`
	// List of group IDs. Conflicts with apps
	Groups []string `pulumi:"groups"`
	// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
	RoleType string `pulumi:"roleType"`
	// User associated with the role
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a AdminRoleTargets resource.
type AdminRoleTargetsArgs struct {
	// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
	Apps pulumi.StringArrayInput
	// List of group IDs. Conflicts with apps
	Groups pulumi.StringArrayInput
	// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
	RoleType pulumi.StringInput
	// User associated with the role
	UserId pulumi.StringInput
}

func (AdminRoleTargetsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*adminRoleTargetsArgs)(nil)).Elem()
}

type AdminRoleTargetsInput interface {
	pulumi.Input

	ToAdminRoleTargetsOutput() AdminRoleTargetsOutput
	ToAdminRoleTargetsOutputWithContext(ctx context.Context) AdminRoleTargetsOutput
}

func (*AdminRoleTargets) ElementType() reflect.Type {
	return reflect.TypeOf((**AdminRoleTargets)(nil)).Elem()
}

func (i *AdminRoleTargets) ToAdminRoleTargetsOutput() AdminRoleTargetsOutput {
	return i.ToAdminRoleTargetsOutputWithContext(context.Background())
}

func (i *AdminRoleTargets) ToAdminRoleTargetsOutputWithContext(ctx context.Context) AdminRoleTargetsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdminRoleTargetsOutput)
}

// AdminRoleTargetsArrayInput is an input type that accepts AdminRoleTargetsArray and AdminRoleTargetsArrayOutput values.
// You can construct a concrete instance of `AdminRoleTargetsArrayInput` via:
//
//	AdminRoleTargetsArray{ AdminRoleTargetsArgs{...} }
type AdminRoleTargetsArrayInput interface {
	pulumi.Input

	ToAdminRoleTargetsArrayOutput() AdminRoleTargetsArrayOutput
	ToAdminRoleTargetsArrayOutputWithContext(context.Context) AdminRoleTargetsArrayOutput
}

type AdminRoleTargetsArray []AdminRoleTargetsInput

func (AdminRoleTargetsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdminRoleTargets)(nil)).Elem()
}

func (i AdminRoleTargetsArray) ToAdminRoleTargetsArrayOutput() AdminRoleTargetsArrayOutput {
	return i.ToAdminRoleTargetsArrayOutputWithContext(context.Background())
}

func (i AdminRoleTargetsArray) ToAdminRoleTargetsArrayOutputWithContext(ctx context.Context) AdminRoleTargetsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdminRoleTargetsArrayOutput)
}

// AdminRoleTargetsMapInput is an input type that accepts AdminRoleTargetsMap and AdminRoleTargetsMapOutput values.
// You can construct a concrete instance of `AdminRoleTargetsMapInput` via:
//
//	AdminRoleTargetsMap{ "key": AdminRoleTargetsArgs{...} }
type AdminRoleTargetsMapInput interface {
	pulumi.Input

	ToAdminRoleTargetsMapOutput() AdminRoleTargetsMapOutput
	ToAdminRoleTargetsMapOutputWithContext(context.Context) AdminRoleTargetsMapOutput
}

type AdminRoleTargetsMap map[string]AdminRoleTargetsInput

func (AdminRoleTargetsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdminRoleTargets)(nil)).Elem()
}

func (i AdminRoleTargetsMap) ToAdminRoleTargetsMapOutput() AdminRoleTargetsMapOutput {
	return i.ToAdminRoleTargetsMapOutputWithContext(context.Background())
}

func (i AdminRoleTargetsMap) ToAdminRoleTargetsMapOutputWithContext(ctx context.Context) AdminRoleTargetsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdminRoleTargetsMapOutput)
}

type AdminRoleTargetsOutput struct{ *pulumi.OutputState }

func (AdminRoleTargetsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AdminRoleTargets)(nil)).Elem()
}

func (o AdminRoleTargetsOutput) ToAdminRoleTargetsOutput() AdminRoleTargetsOutput {
	return o
}

func (o AdminRoleTargetsOutput) ToAdminRoleTargetsOutputWithContext(ctx context.Context) AdminRoleTargetsOutput {
	return o
}

// List of app names (name represents set of app instances) or a combination of app name and app instance ID (like 'salesforce' or 'facebook.0oapsqQ6dv19pqyEo0g3')
func (o AdminRoleTargetsOutput) Apps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AdminRoleTargets) pulumi.StringArrayOutput { return v.Apps }).(pulumi.StringArrayOutput)
}

// List of group IDs. Conflicts with apps
func (o AdminRoleTargetsOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AdminRoleTargets) pulumi.StringArrayOutput { return v.Groups }).(pulumi.StringArrayOutput)
}

// ID of a role
func (o AdminRoleTargetsOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdminRoleTargets) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

// Type of the role that is assigned to the user and supports optional targets. See [API Docs](https://developer.okta.com/docs/api/openapi/okta-management/guides/roles/#standard-roles)
func (o AdminRoleTargetsOutput) RoleType() pulumi.StringOutput {
	return o.ApplyT(func(v *AdminRoleTargets) pulumi.StringOutput { return v.RoleType }).(pulumi.StringOutput)
}

// User associated with the role
func (o AdminRoleTargetsOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdminRoleTargets) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type AdminRoleTargetsArrayOutput struct{ *pulumi.OutputState }

func (AdminRoleTargetsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdminRoleTargets)(nil)).Elem()
}

func (o AdminRoleTargetsArrayOutput) ToAdminRoleTargetsArrayOutput() AdminRoleTargetsArrayOutput {
	return o
}

func (o AdminRoleTargetsArrayOutput) ToAdminRoleTargetsArrayOutputWithContext(ctx context.Context) AdminRoleTargetsArrayOutput {
	return o
}

func (o AdminRoleTargetsArrayOutput) Index(i pulumi.IntInput) AdminRoleTargetsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AdminRoleTargets {
		return vs[0].([]*AdminRoleTargets)[vs[1].(int)]
	}).(AdminRoleTargetsOutput)
}

type AdminRoleTargetsMapOutput struct{ *pulumi.OutputState }

func (AdminRoleTargetsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdminRoleTargets)(nil)).Elem()
}

func (o AdminRoleTargetsMapOutput) ToAdminRoleTargetsMapOutput() AdminRoleTargetsMapOutput {
	return o
}

func (o AdminRoleTargetsMapOutput) ToAdminRoleTargetsMapOutputWithContext(ctx context.Context) AdminRoleTargetsMapOutput {
	return o
}

func (o AdminRoleTargetsMapOutput) MapIndex(k pulumi.StringInput) AdminRoleTargetsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AdminRoleTargets {
		return vs[0].(map[string]*AdminRoleTargets)[vs[1].(string)]
	}).(AdminRoleTargetsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AdminRoleTargetsInput)(nil)).Elem(), &AdminRoleTargets{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdminRoleTargetsArrayInput)(nil)).Elem(), AdminRoleTargetsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdminRoleTargetsMapInput)(nil)).Elem(), AdminRoleTargetsMap{})
	pulumi.RegisterOutputType(AdminRoleTargetsOutput{})
	pulumi.RegisterOutputType(AdminRoleTargetsArrayOutput{})
	pulumi.RegisterOutputType(AdminRoleTargetsMapOutput{})
}
