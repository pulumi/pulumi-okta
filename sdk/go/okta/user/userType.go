// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package user

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a User type.
//
// This resource allows you to create and configure a User Type.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-okta/sdk/v2/go/okta/user"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := user.NewUserType(ctx, "example", &user.UserTypeArgs{
// 			Description: pulumi.String("example"),
// 			DisplayName: pulumi.String("example"),
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
// A User Type can be imported via the Okta ID.
//
// ```sh
//  $ pulumi import okta:user/userType:UserType example <user type id>
// ```
type UserType struct {
	pulumi.CustomResourceState

	// Description of the User Type.
	Description pulumi.StringOutput `pulumi:"description"`
	// Display Name of the User Type.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Name of the User Type.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewUserType registers a new resource with the given unique name, arguments, and options.
func NewUserType(ctx *pulumi.Context,
	name string, args *UserTypeArgs, opts ...pulumi.ResourceOption) (*UserType, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource UserType
	err := ctx.RegisterResource("okta:user/userType:UserType", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserType gets an existing UserType resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserType(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserTypeState, opts ...pulumi.ResourceOption) (*UserType, error) {
	var resource UserType
	err := ctx.ReadResource("okta:user/userType:UserType", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserType resources.
type userTypeState struct {
	// Description of the User Type.
	Description *string `pulumi:"description"`
	// Display Name of the User Type.
	DisplayName *string `pulumi:"displayName"`
	// Name of the User Type.
	Name *string `pulumi:"name"`
}

type UserTypeState struct {
	// Description of the User Type.
	Description pulumi.StringPtrInput
	// Display Name of the User Type.
	DisplayName pulumi.StringPtrInput
	// Name of the User Type.
	Name pulumi.StringPtrInput
}

func (UserTypeState) ElementType() reflect.Type {
	return reflect.TypeOf((*userTypeState)(nil)).Elem()
}

type userTypeArgs struct {
	// Description of the User Type.
	Description string `pulumi:"description"`
	// Display Name of the User Type.
	DisplayName string `pulumi:"displayName"`
	// Name of the User Type.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a UserType resource.
type UserTypeArgs struct {
	// Description of the User Type.
	Description pulumi.StringInput
	// Display Name of the User Type.
	DisplayName pulumi.StringInput
	// Name of the User Type.
	Name pulumi.StringPtrInput
}

func (UserTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userTypeArgs)(nil)).Elem()
}

type UserTypeInput interface {
	pulumi.Input

	ToUserTypeOutput() UserTypeOutput
	ToUserTypeOutputWithContext(ctx context.Context) UserTypeOutput
}

func (*UserType) ElementType() reflect.Type {
	return reflect.TypeOf((*UserType)(nil))
}

func (i *UserType) ToUserTypeOutput() UserTypeOutput {
	return i.ToUserTypeOutputWithContext(context.Background())
}

func (i *UserType) ToUserTypeOutputWithContext(ctx context.Context) UserTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserTypeOutput)
}

type UserTypeOutput struct {
	*pulumi.OutputState
}

func (UserTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*UserType)(nil))
}

func (o UserTypeOutput) ToUserTypeOutput() UserTypeOutput {
	return o
}

func (o UserTypeOutput) ToUserTypeOutputWithContext(ctx context.Context) UserTypeOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(UserTypeOutput{})
}