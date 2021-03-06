// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package group

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Assigns Admin roles to Okta Groups.
//
// This resource allows you to assign Okta administrator roles to Okta Groups. This resource provides a one-to-one
// interface between the Okta group and the admin role.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-okta/sdk/v2/go/okta/group"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := group.NewRole(ctx, "example", &group.RoleArgs{
// 			GroupId:  pulumi.String("<group id>"),
// 			RoleType: pulumi.String("READ_ONLY_ADMIN"),
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
// Individual admin role assignment can be imported by passing the group and role assignment IDs as follows
//
// ```sh
//  $ pulumi import okta:group/role:Role example <group id>/<role id>
// ```
type Role struct {
	pulumi.CustomResourceState

	// The ID of group to attach admin roles to.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
	// , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
	// , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
	RoleType pulumi.StringOutput `pulumi:"roleType"`
	// A list of app names (name represents set of app instances, like 'salesforce' or '
	// facebook'), or a combination of app name and app instance ID (like 'facebook.0oapsqQ6dv19pqyEo0g3') you would like as
	// the targets of the admin role.
	// - Only supported when used with the role type `"APP_ADMIN"`.
	TargetAppLists pulumi.StringArrayOutput `pulumi:"targetAppLists"`
	// A list of group IDs you would like as the targets of the admin role.
	// - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
	TargetGroupLists pulumi.StringArrayOutput `pulumi:"targetGroupLists"`
}

// NewRole registers a new resource with the given unique name, arguments, and options.
func NewRole(ctx *pulumi.Context,
	name string, args *RoleArgs, opts ...pulumi.ResourceOption) (*Role, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.RoleType == nil {
		return nil, errors.New("invalid value for required argument 'RoleType'")
	}
	var resource Role
	err := ctx.RegisterResource("okta:group/role:Role", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRole gets an existing Role resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleState, opts ...pulumi.ResourceOption) (*Role, error) {
	var resource Role
	err := ctx.ReadResource("okta:group/role:Role", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Role resources.
type roleState struct {
	// The ID of group to attach admin roles to.
	GroupId *string `pulumi:"groupId"`
	// Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
	// , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
	// , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
	RoleType *string `pulumi:"roleType"`
	// A list of app names (name represents set of app instances, like 'salesforce' or '
	// facebook'), or a combination of app name and app instance ID (like 'facebook.0oapsqQ6dv19pqyEo0g3') you would like as
	// the targets of the admin role.
	// - Only supported when used with the role type `"APP_ADMIN"`.
	TargetAppLists []string `pulumi:"targetAppLists"`
	// A list of group IDs you would like as the targets of the admin role.
	// - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
	TargetGroupLists []string `pulumi:"targetGroupLists"`
}

type RoleState struct {
	// The ID of group to attach admin roles to.
	GroupId pulumi.StringPtrInput
	// Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
	// , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
	// , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
	RoleType pulumi.StringPtrInput
	// A list of app names (name represents set of app instances, like 'salesforce' or '
	// facebook'), or a combination of app name and app instance ID (like 'facebook.0oapsqQ6dv19pqyEo0g3') you would like as
	// the targets of the admin role.
	// - Only supported when used with the role type `"APP_ADMIN"`.
	TargetAppLists pulumi.StringArrayInput
	// A list of group IDs you would like as the targets of the admin role.
	// - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
	TargetGroupLists pulumi.StringArrayInput
}

func (RoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleState)(nil)).Elem()
}

type roleArgs struct {
	// The ID of group to attach admin roles to.
	GroupId string `pulumi:"groupId"`
	// Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
	// , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
	// , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
	RoleType string `pulumi:"roleType"`
	// A list of app names (name represents set of app instances, like 'salesforce' or '
	// facebook'), or a combination of app name and app instance ID (like 'facebook.0oapsqQ6dv19pqyEo0g3') you would like as
	// the targets of the admin role.
	// - Only supported when used with the role type `"APP_ADMIN"`.
	TargetAppLists []string `pulumi:"targetAppLists"`
	// A list of group IDs you would like as the targets of the admin role.
	// - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
	TargetGroupLists []string `pulumi:"targetGroupLists"`
}

// The set of arguments for constructing a Role resource.
type RoleArgs struct {
	// The ID of group to attach admin roles to.
	GroupId pulumi.StringInput
	// Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
	// , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
	// , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
	RoleType pulumi.StringInput
	// A list of app names (name represents set of app instances, like 'salesforce' or '
	// facebook'), or a combination of app name and app instance ID (like 'facebook.0oapsqQ6dv19pqyEo0g3') you would like as
	// the targets of the admin role.
	// - Only supported when used with the role type `"APP_ADMIN"`.
	TargetAppLists pulumi.StringArrayInput
	// A list of group IDs you would like as the targets of the admin role.
	// - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
	TargetGroupLists pulumi.StringArrayInput
}

func (RoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleArgs)(nil)).Elem()
}

type RoleInput interface {
	pulumi.Input

	ToRoleOutput() RoleOutput
	ToRoleOutputWithContext(ctx context.Context) RoleOutput
}

func (*Role) ElementType() reflect.Type {
	return reflect.TypeOf((*Role)(nil))
}

func (i *Role) ToRoleOutput() RoleOutput {
	return i.ToRoleOutputWithContext(context.Background())
}

func (i *Role) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOutput)
}

func (i *Role) ToRolePtrOutput() RolePtrOutput {
	return i.ToRolePtrOutputWithContext(context.Background())
}

func (i *Role) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePtrOutput)
}

type RolePtrInput interface {
	pulumi.Input

	ToRolePtrOutput() RolePtrOutput
	ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput
}

type rolePtrType RoleArgs

func (*rolePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil))
}

func (i *rolePtrType) ToRolePtrOutput() RolePtrOutput {
	return i.ToRolePtrOutputWithContext(context.Background())
}

func (i *rolePtrType) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePtrOutput)
}

// RoleArrayInput is an input type that accepts RoleArray and RoleArrayOutput values.
// You can construct a concrete instance of `RoleArrayInput` via:
//
//          RoleArray{ RoleArgs{...} }
type RoleArrayInput interface {
	pulumi.Input

	ToRoleArrayOutput() RoleArrayOutput
	ToRoleArrayOutputWithContext(context.Context) RoleArrayOutput
}

type RoleArray []RoleInput

func (RoleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Role)(nil))
}

func (i RoleArray) ToRoleArrayOutput() RoleArrayOutput {
	return i.ToRoleArrayOutputWithContext(context.Background())
}

func (i RoleArray) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleArrayOutput)
}

// RoleMapInput is an input type that accepts RoleMap and RoleMapOutput values.
// You can construct a concrete instance of `RoleMapInput` via:
//
//          RoleMap{ "key": RoleArgs{...} }
type RoleMapInput interface {
	pulumi.Input

	ToRoleMapOutput() RoleMapOutput
	ToRoleMapOutputWithContext(context.Context) RoleMapOutput
}

type RoleMap map[string]RoleInput

func (RoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Role)(nil))
}

func (i RoleMap) ToRoleMapOutput() RoleMapOutput {
	return i.ToRoleMapOutputWithContext(context.Background())
}

func (i RoleMap) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMapOutput)
}

type RoleOutput struct {
	*pulumi.OutputState
}

func (RoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Role)(nil))
}

func (o RoleOutput) ToRoleOutput() RoleOutput {
	return o
}

func (o RoleOutput) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return o
}

func (o RoleOutput) ToRolePtrOutput() RolePtrOutput {
	return o.ToRolePtrOutputWithContext(context.Background())
}

func (o RoleOutput) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return o.ApplyT(func(v Role) *Role {
		return &v
	}).(RolePtrOutput)
}

type RolePtrOutput struct {
	*pulumi.OutputState
}

func (RolePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil))
}

func (o RolePtrOutput) ToRolePtrOutput() RolePtrOutput {
	return o
}

func (o RolePtrOutput) ToRolePtrOutputWithContext(ctx context.Context) RolePtrOutput {
	return o
}

type RoleArrayOutput struct{ *pulumi.OutputState }

func (RoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Role)(nil))
}

func (o RoleArrayOutput) ToRoleArrayOutput() RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) Index(i pulumi.IntInput) RoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Role {
		return vs[0].([]Role)[vs[1].(int)]
	}).(RoleOutput)
}

type RoleMapOutput struct{ *pulumi.OutputState }

func (RoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Role)(nil))
}

func (o RoleMapOutput) ToRoleMapOutput() RoleMapOutput {
	return o
}

func (o RoleMapOutput) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return o
}

func (o RoleMapOutput) MapIndex(k pulumi.StringInput) RoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Role {
		return vs[0].(map[string]Role)[vs[1].(string)]
	}).(RoleOutput)
}

func init() {
	pulumi.RegisterOutputType(RoleOutput{})
	pulumi.RegisterOutputType(RolePtrOutput{})
	pulumi.RegisterOutputType(RoleArrayOutput{})
	pulumi.RegisterOutputType(RoleMapOutput{})
}
