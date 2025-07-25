// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupEmailSmtpServer(ctx *pulumi.Context, args *LookupEmailSmtpServerArgs, opts ...pulumi.InvokeOption) (*LookupEmailSmtpServerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEmailSmtpServerResult
	err := ctx.Invoke("okta:index/getEmailSmtpServer:getEmailSmtpServer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEmailSmtpServer.
type LookupEmailSmtpServerArgs struct {
	Id string `pulumi:"id"`
}

// A collection of values returned by getEmailSmtpServer.
type LookupEmailSmtpServerResult struct {
	Alias    string `pulumi:"alias"`
	Enabled  bool   `pulumi:"enabled"`
	Host     string `pulumi:"host"`
	Id       string `pulumi:"id"`
	Port     int    `pulumi:"port"`
	Username string `pulumi:"username"`
}

func LookupEmailSmtpServerOutput(ctx *pulumi.Context, args LookupEmailSmtpServerOutputArgs, opts ...pulumi.InvokeOption) LookupEmailSmtpServerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEmailSmtpServerResultOutput, error) {
			args := v.(LookupEmailSmtpServerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("okta:index/getEmailSmtpServer:getEmailSmtpServer", args, LookupEmailSmtpServerResultOutput{}, options).(LookupEmailSmtpServerResultOutput), nil
		}).(LookupEmailSmtpServerResultOutput)
}

// A collection of arguments for invoking getEmailSmtpServer.
type LookupEmailSmtpServerOutputArgs struct {
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupEmailSmtpServerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEmailSmtpServerArgs)(nil)).Elem()
}

// A collection of values returned by getEmailSmtpServer.
type LookupEmailSmtpServerResultOutput struct{ *pulumi.OutputState }

func (LookupEmailSmtpServerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEmailSmtpServerResult)(nil)).Elem()
}

func (o LookupEmailSmtpServerResultOutput) ToLookupEmailSmtpServerResultOutput() LookupEmailSmtpServerResultOutput {
	return o
}

func (o LookupEmailSmtpServerResultOutput) ToLookupEmailSmtpServerResultOutputWithContext(ctx context.Context) LookupEmailSmtpServerResultOutput {
	return o
}

func (o LookupEmailSmtpServerResultOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) string { return v.Alias }).(pulumi.StringOutput)
}

func (o LookupEmailSmtpServerResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o LookupEmailSmtpServerResultOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) string { return v.Host }).(pulumi.StringOutput)
}

func (o LookupEmailSmtpServerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEmailSmtpServerResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) int { return v.Port }).(pulumi.IntOutput)
}

func (o LookupEmailSmtpServerResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailSmtpServerResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEmailSmtpServerResultOutput{})
}
