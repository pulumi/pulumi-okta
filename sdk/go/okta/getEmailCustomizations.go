// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get the email customizations of an email template belonging to a brand in an Okta organization.
func GetEmailCustomizations(ctx *pulumi.Context, args *GetEmailCustomizationsArgs, opts ...pulumi.InvokeOption) (*GetEmailCustomizationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEmailCustomizationsResult
	err := ctx.Invoke("okta:index/getEmailCustomizations:getEmailCustomizations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEmailCustomizations.
type GetEmailCustomizationsArgs struct {
	// Brand ID
	BrandId string `pulumi:"brandId"`
	// Template Name
	TemplateName string `pulumi:"templateName"`
}

// A collection of values returned by getEmailCustomizations.
type GetEmailCustomizationsResult struct {
	// Brand ID
	BrandId string `pulumi:"brandId"`
	// List of `EmailCustomization` belonging to the named email template of the brand in the organization
	EmailCustomizations []GetEmailCustomizationsEmailCustomization `pulumi:"emailCustomizations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Template Name
	TemplateName string `pulumi:"templateName"`
}

func GetEmailCustomizationsOutput(ctx *pulumi.Context, args GetEmailCustomizationsOutputArgs, opts ...pulumi.InvokeOption) GetEmailCustomizationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEmailCustomizationsResultOutput, error) {
			args := v.(GetEmailCustomizationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("okta:index/getEmailCustomizations:getEmailCustomizations", args, GetEmailCustomizationsResultOutput{}, options).(GetEmailCustomizationsResultOutput), nil
		}).(GetEmailCustomizationsResultOutput)
}

// A collection of arguments for invoking getEmailCustomizations.
type GetEmailCustomizationsOutputArgs struct {
	// Brand ID
	BrandId pulumi.StringInput `pulumi:"brandId"`
	// Template Name
	TemplateName pulumi.StringInput `pulumi:"templateName"`
}

func (GetEmailCustomizationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEmailCustomizationsArgs)(nil)).Elem()
}

// A collection of values returned by getEmailCustomizations.
type GetEmailCustomizationsResultOutput struct{ *pulumi.OutputState }

func (GetEmailCustomizationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEmailCustomizationsResult)(nil)).Elem()
}

func (o GetEmailCustomizationsResultOutput) ToGetEmailCustomizationsResultOutput() GetEmailCustomizationsResultOutput {
	return o
}

func (o GetEmailCustomizationsResultOutput) ToGetEmailCustomizationsResultOutputWithContext(ctx context.Context) GetEmailCustomizationsResultOutput {
	return o
}

// Brand ID
func (o GetEmailCustomizationsResultOutput) BrandId() pulumi.StringOutput {
	return o.ApplyT(func(v GetEmailCustomizationsResult) string { return v.BrandId }).(pulumi.StringOutput)
}

// List of `EmailCustomization` belonging to the named email template of the brand in the organization
func (o GetEmailCustomizationsResultOutput) EmailCustomizations() GetEmailCustomizationsEmailCustomizationArrayOutput {
	return o.ApplyT(func(v GetEmailCustomizationsResult) []GetEmailCustomizationsEmailCustomization {
		return v.EmailCustomizations
	}).(GetEmailCustomizationsEmailCustomizationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEmailCustomizationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEmailCustomizationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Template Name
func (o GetEmailCustomizationsResultOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v GetEmailCustomizationsResult) string { return v.TemplateName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEmailCustomizationsResultOutput{})
}
