// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource to manage a set of admin roles for a specific user.
//
// This resource allows you to manage admin roles for a single user, independent of the user schema itself.
//
// When using this with a `user.User` resource, you should add a lifecycle ignore for admin roles to avoid conflicts
// in desired state.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-okta/sdk/v3/go/okta"
// 	"github.com/pulumi/pulumi-okta/sdk/v3/go/okta/user"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testUser, err := user.NewUser(ctx, "testUser", &user.UserArgs{
// 			FirstName: pulumi.String("TestAcc"),
// 			LastName:  pulumi.String("Smith"),
// 			Login:     pulumi.String("testAcc-replace_with_uuid@example.com"),
// 			Email:     pulumi.String("testAcc-replace_with_uuid@example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = okta.NewUserAdminRoles(ctx, "testUserAdminRoles", &okta.UserAdminRolesArgs{
// 			UserId: testUser.ID(),
// 			AdminRoles: pulumi.StringArray{
// 				pulumi.String("APP_ADMIN"),
// 			},
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
// Existing user admin roles can be imported via the Okta User ID.
//
// ```sh
//  $ pulumi import okta:index/userAdminRoles:UserAdminRoles example <user id>
// ```
type UserAdminRoles struct {
	pulumi.CustomResourceState

	// The list of Okta user admin roles, e.g. `["APP_ADMIN", "USER_ADMIN"]`
	AdminRoles pulumi.StringArrayOutput `pulumi:"adminRoles"`
	// ID of a Okta User.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserAdminRoles registers a new resource with the given unique name, arguments, and options.
func NewUserAdminRoles(ctx *pulumi.Context,
	name string, args *UserAdminRolesArgs, opts ...pulumi.ResourceOption) (*UserAdminRoles, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AdminRoles == nil {
		return nil, errors.New("invalid value for required argument 'AdminRoles'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource UserAdminRoles
	err := ctx.RegisterResource("okta:index/userAdminRoles:UserAdminRoles", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserAdminRoles gets an existing UserAdminRoles resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserAdminRoles(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserAdminRolesState, opts ...pulumi.ResourceOption) (*UserAdminRoles, error) {
	var resource UserAdminRoles
	err := ctx.ReadResource("okta:index/userAdminRoles:UserAdminRoles", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserAdminRoles resources.
type userAdminRolesState struct {
	// The list of Okta user admin roles, e.g. `["APP_ADMIN", "USER_ADMIN"]`
	AdminRoles []string `pulumi:"adminRoles"`
	// ID of a Okta User.
	UserId *string `pulumi:"userId"`
}

type UserAdminRolesState struct {
	// The list of Okta user admin roles, e.g. `["APP_ADMIN", "USER_ADMIN"]`
	AdminRoles pulumi.StringArrayInput
	// ID of a Okta User.
	UserId pulumi.StringPtrInput
}

func (UserAdminRolesState) ElementType() reflect.Type {
	return reflect.TypeOf((*userAdminRolesState)(nil)).Elem()
}

type userAdminRolesArgs struct {
	// The list of Okta user admin roles, e.g. `["APP_ADMIN", "USER_ADMIN"]`
	AdminRoles []string `pulumi:"adminRoles"`
	// ID of a Okta User.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserAdminRoles resource.
type UserAdminRolesArgs struct {
	// The list of Okta user admin roles, e.g. `["APP_ADMIN", "USER_ADMIN"]`
	AdminRoles pulumi.StringArrayInput
	// ID of a Okta User.
	UserId pulumi.StringInput
}

func (UserAdminRolesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userAdminRolesArgs)(nil)).Elem()
}

type UserAdminRolesInput interface {
	pulumi.Input

	ToUserAdminRolesOutput() UserAdminRolesOutput
	ToUserAdminRolesOutputWithContext(ctx context.Context) UserAdminRolesOutput
}

func (*UserAdminRoles) ElementType() reflect.Type {
	return reflect.TypeOf((*UserAdminRoles)(nil))
}

func (i *UserAdminRoles) ToUserAdminRolesOutput() UserAdminRolesOutput {
	return i.ToUserAdminRolesOutputWithContext(context.Background())
}

func (i *UserAdminRoles) ToUserAdminRolesOutputWithContext(ctx context.Context) UserAdminRolesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAdminRolesOutput)
}

func (i *UserAdminRoles) ToUserAdminRolesPtrOutput() UserAdminRolesPtrOutput {
	return i.ToUserAdminRolesPtrOutputWithContext(context.Background())
}

func (i *UserAdminRoles) ToUserAdminRolesPtrOutputWithContext(ctx context.Context) UserAdminRolesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAdminRolesPtrOutput)
}

type UserAdminRolesPtrInput interface {
	pulumi.Input

	ToUserAdminRolesPtrOutput() UserAdminRolesPtrOutput
	ToUserAdminRolesPtrOutputWithContext(ctx context.Context) UserAdminRolesPtrOutput
}

type userAdminRolesPtrType UserAdminRolesArgs

func (*userAdminRolesPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**UserAdminRoles)(nil))
}

func (i *userAdminRolesPtrType) ToUserAdminRolesPtrOutput() UserAdminRolesPtrOutput {
	return i.ToUserAdminRolesPtrOutputWithContext(context.Background())
}

func (i *userAdminRolesPtrType) ToUserAdminRolesPtrOutputWithContext(ctx context.Context) UserAdminRolesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAdminRolesPtrOutput)
}

// UserAdminRolesArrayInput is an input type that accepts UserAdminRolesArray and UserAdminRolesArrayOutput values.
// You can construct a concrete instance of `UserAdminRolesArrayInput` via:
//
//          UserAdminRolesArray{ UserAdminRolesArgs{...} }
type UserAdminRolesArrayInput interface {
	pulumi.Input

	ToUserAdminRolesArrayOutput() UserAdminRolesArrayOutput
	ToUserAdminRolesArrayOutputWithContext(context.Context) UserAdminRolesArrayOutput
}

type UserAdminRolesArray []UserAdminRolesInput

func (UserAdminRolesArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*UserAdminRoles)(nil))
}

func (i UserAdminRolesArray) ToUserAdminRolesArrayOutput() UserAdminRolesArrayOutput {
	return i.ToUserAdminRolesArrayOutputWithContext(context.Background())
}

func (i UserAdminRolesArray) ToUserAdminRolesArrayOutputWithContext(ctx context.Context) UserAdminRolesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAdminRolesArrayOutput)
}

// UserAdminRolesMapInput is an input type that accepts UserAdminRolesMap and UserAdminRolesMapOutput values.
// You can construct a concrete instance of `UserAdminRolesMapInput` via:
//
//          UserAdminRolesMap{ "key": UserAdminRolesArgs{...} }
type UserAdminRolesMapInput interface {
	pulumi.Input

	ToUserAdminRolesMapOutput() UserAdminRolesMapOutput
	ToUserAdminRolesMapOutputWithContext(context.Context) UserAdminRolesMapOutput
}

type UserAdminRolesMap map[string]UserAdminRolesInput

func (UserAdminRolesMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*UserAdminRoles)(nil))
}

func (i UserAdminRolesMap) ToUserAdminRolesMapOutput() UserAdminRolesMapOutput {
	return i.ToUserAdminRolesMapOutputWithContext(context.Background())
}

func (i UserAdminRolesMap) ToUserAdminRolesMapOutputWithContext(ctx context.Context) UserAdminRolesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAdminRolesMapOutput)
}

type UserAdminRolesOutput struct {
	*pulumi.OutputState
}

func (UserAdminRolesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*UserAdminRoles)(nil))
}

func (o UserAdminRolesOutput) ToUserAdminRolesOutput() UserAdminRolesOutput {
	return o
}

func (o UserAdminRolesOutput) ToUserAdminRolesOutputWithContext(ctx context.Context) UserAdminRolesOutput {
	return o
}

func (o UserAdminRolesOutput) ToUserAdminRolesPtrOutput() UserAdminRolesPtrOutput {
	return o.ToUserAdminRolesPtrOutputWithContext(context.Background())
}

func (o UserAdminRolesOutput) ToUserAdminRolesPtrOutputWithContext(ctx context.Context) UserAdminRolesPtrOutput {
	return o.ApplyT(func(v UserAdminRoles) *UserAdminRoles {
		return &v
	}).(UserAdminRolesPtrOutput)
}

type UserAdminRolesPtrOutput struct {
	*pulumi.OutputState
}

func (UserAdminRolesPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserAdminRoles)(nil))
}

func (o UserAdminRolesPtrOutput) ToUserAdminRolesPtrOutput() UserAdminRolesPtrOutput {
	return o
}

func (o UserAdminRolesPtrOutput) ToUserAdminRolesPtrOutputWithContext(ctx context.Context) UserAdminRolesPtrOutput {
	return o
}

type UserAdminRolesArrayOutput struct{ *pulumi.OutputState }

func (UserAdminRolesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]UserAdminRoles)(nil))
}

func (o UserAdminRolesArrayOutput) ToUserAdminRolesArrayOutput() UserAdminRolesArrayOutput {
	return o
}

func (o UserAdminRolesArrayOutput) ToUserAdminRolesArrayOutputWithContext(ctx context.Context) UserAdminRolesArrayOutput {
	return o
}

func (o UserAdminRolesArrayOutput) Index(i pulumi.IntInput) UserAdminRolesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) UserAdminRoles {
		return vs[0].([]UserAdminRoles)[vs[1].(int)]
	}).(UserAdminRolesOutput)
}

type UserAdminRolesMapOutput struct{ *pulumi.OutputState }

func (UserAdminRolesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]UserAdminRoles)(nil))
}

func (o UserAdminRolesMapOutput) ToUserAdminRolesMapOutput() UserAdminRolesMapOutput {
	return o
}

func (o UserAdminRolesMapOutput) ToUserAdminRolesMapOutputWithContext(ctx context.Context) UserAdminRolesMapOutput {
	return o
}

func (o UserAdminRolesMapOutput) MapIndex(k pulumi.StringInput) UserAdminRolesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) UserAdminRoles {
		return vs[0].(map[string]UserAdminRoles)[vs[1].(string)]
	}).(UserAdminRolesOutput)
}

func init() {
	pulumi.RegisterOutputType(UserAdminRolesOutput{})
	pulumi.RegisterOutputType(UserAdminRolesPtrOutput{})
	pulumi.RegisterOutputType(UserAdminRolesArrayOutput{})
	pulumi.RegisterOutputType(UserAdminRolesMapOutput{})
}