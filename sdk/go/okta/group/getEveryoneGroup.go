// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package group

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve the `Everyone` group from Okta. The
// same can be achieved with the `group.Group` data
// source with `name = "Everyone"`. This is simply a shortcut.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/group"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := group.GetEveryoneGroup(ctx, &group.GetEveryoneGroupArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetEveryoneGroup(ctx *pulumi.Context, args *GetEveryoneGroupArgs, opts ...pulumi.InvokeOption) (*GetEveryoneGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEveryoneGroupResult
	err := ctx.Invoke("okta:group/getEveryoneGroup:getEveryoneGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEveryoneGroup.
type GetEveryoneGroupArgs struct {
	// Fetch group users, having default off cuts down on API calls.
	IncludeUsers *bool `pulumi:"includeUsers"`
}

// A collection of values returned by getEveryoneGroup.
type GetEveryoneGroupResult struct {
	// Description of group.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Fetch group users, having default off cuts down on API calls.
	IncludeUsers *bool `pulumi:"includeUsers"`
}

func GetEveryoneGroupOutput(ctx *pulumi.Context, args GetEveryoneGroupOutputArgs, opts ...pulumi.InvokeOption) GetEveryoneGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEveryoneGroupResultOutput, error) {
			args := v.(GetEveryoneGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("okta:group/getEveryoneGroup:getEveryoneGroup", args, GetEveryoneGroupResultOutput{}, options).(GetEveryoneGroupResultOutput), nil
		}).(GetEveryoneGroupResultOutput)
}

// A collection of arguments for invoking getEveryoneGroup.
type GetEveryoneGroupOutputArgs struct {
	// Fetch group users, having default off cuts down on API calls.
	IncludeUsers pulumi.BoolPtrInput `pulumi:"includeUsers"`
}

func (GetEveryoneGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEveryoneGroupArgs)(nil)).Elem()
}

// A collection of values returned by getEveryoneGroup.
type GetEveryoneGroupResultOutput struct{ *pulumi.OutputState }

func (GetEveryoneGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEveryoneGroupResult)(nil)).Elem()
}

func (o GetEveryoneGroupResultOutput) ToGetEveryoneGroupResultOutput() GetEveryoneGroupResultOutput {
	return o
}

func (o GetEveryoneGroupResultOutput) ToGetEveryoneGroupResultOutputWithContext(ctx context.Context) GetEveryoneGroupResultOutput {
	return o
}

// Description of group.
func (o GetEveryoneGroupResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetEveryoneGroupResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEveryoneGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEveryoneGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// Fetch group users, having default off cuts down on API calls.
func (o GetEveryoneGroupResultOutput) IncludeUsers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetEveryoneGroupResult) *bool { return v.IncludeUsers }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEveryoneGroupResultOutput{})
}
