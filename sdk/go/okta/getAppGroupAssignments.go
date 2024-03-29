// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve the list of groups assigned to the given Okta application (by ID).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := okta.LookupAppGroupAssignments(ctx, &okta.LookupAppGroupAssignmentsArgs{
//				Id: okta_app_oauth.Test.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupAppGroupAssignments(ctx *pulumi.Context, args *LookupAppGroupAssignmentsArgs, opts ...pulumi.InvokeOption) (*LookupAppGroupAssignmentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppGroupAssignmentsResult
	err := ctx.Invoke("okta:index/getAppGroupAssignments:getAppGroupAssignments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppGroupAssignments.
type LookupAppGroupAssignmentsArgs struct {
	// The ID of the Okta application you want to retrieve the groups for.
	Id string `pulumi:"id"`
}

// A collection of values returned by getAppGroupAssignments.
type LookupAppGroupAssignmentsResult struct {
	// List of groups IDs assigned to the application.
	Groups []string `pulumi:"groups"`
	// ID of application.
	Id string `pulumi:"id"`
}

func LookupAppGroupAssignmentsOutput(ctx *pulumi.Context, args LookupAppGroupAssignmentsOutputArgs, opts ...pulumi.InvokeOption) LookupAppGroupAssignmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAppGroupAssignmentsResult, error) {
			args := v.(LookupAppGroupAssignmentsArgs)
			r, err := LookupAppGroupAssignments(ctx, &args, opts...)
			var s LookupAppGroupAssignmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAppGroupAssignmentsResultOutput)
}

// A collection of arguments for invoking getAppGroupAssignments.
type LookupAppGroupAssignmentsOutputArgs struct {
	// The ID of the Okta application you want to retrieve the groups for.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupAppGroupAssignmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppGroupAssignmentsArgs)(nil)).Elem()
}

// A collection of values returned by getAppGroupAssignments.
type LookupAppGroupAssignmentsResultOutput struct{ *pulumi.OutputState }

func (LookupAppGroupAssignmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppGroupAssignmentsResult)(nil)).Elem()
}

func (o LookupAppGroupAssignmentsResultOutput) ToLookupAppGroupAssignmentsResultOutput() LookupAppGroupAssignmentsResultOutput {
	return o
}

func (o LookupAppGroupAssignmentsResultOutput) ToLookupAppGroupAssignmentsResultOutputWithContext(ctx context.Context) LookupAppGroupAssignmentsResultOutput {
	return o
}

// List of groups IDs assigned to the application.
func (o LookupAppGroupAssignmentsResultOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAppGroupAssignmentsResult) []string { return v.Groups }).(pulumi.StringArrayOutput)
}

// ID of application.
func (o LookupAppGroupAssignmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppGroupAssignmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppGroupAssignmentsResultOutput{})
}
