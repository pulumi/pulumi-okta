// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manage the preview signin page of a brand
type PreviewSigninPage struct {
	pulumi.CustomResourceState

	// brand id of the preview signin page
	BrandId                      pulumi.StringOutput                                    `pulumi:"brandId"`
	ContentSecurityPolicySetting PreviewSigninPageContentSecurityPolicySettingPtrOutput `pulumi:"contentSecurityPolicySetting"`
	// page content of the preview signin page
	PageContent          pulumi.StringOutput                            `pulumi:"pageContent"`
	WidgetCustomizations PreviewSigninPageWidgetCustomizationsPtrOutput `pulumi:"widgetCustomizations"`
	// widget version specified as a Semver. The following are currently supported
	// 		*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
	// 		2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
	// 		3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
	// 		5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
	// 		6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
	WidgetVersion pulumi.StringOutput `pulumi:"widgetVersion"`
}

// NewPreviewSigninPage registers a new resource with the given unique name, arguments, and options.
func NewPreviewSigninPage(ctx *pulumi.Context,
	name string, args *PreviewSigninPageArgs, opts ...pulumi.ResourceOption) (*PreviewSigninPage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BrandId == nil {
		return nil, errors.New("invalid value for required argument 'BrandId'")
	}
	if args.PageContent == nil {
		return nil, errors.New("invalid value for required argument 'PageContent'")
	}
	if args.WidgetVersion == nil {
		return nil, errors.New("invalid value for required argument 'WidgetVersion'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PreviewSigninPage
	err := ctx.RegisterResource("okta:index/previewSigninPage:PreviewSigninPage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPreviewSigninPage gets an existing PreviewSigninPage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPreviewSigninPage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PreviewSigninPageState, opts ...pulumi.ResourceOption) (*PreviewSigninPage, error) {
	var resource PreviewSigninPage
	err := ctx.ReadResource("okta:index/previewSigninPage:PreviewSigninPage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PreviewSigninPage resources.
type previewSigninPageState struct {
	// brand id of the preview signin page
	BrandId                      *string                                        `pulumi:"brandId"`
	ContentSecurityPolicySetting *PreviewSigninPageContentSecurityPolicySetting `pulumi:"contentSecurityPolicySetting"`
	// page content of the preview signin page
	PageContent          *string                                `pulumi:"pageContent"`
	WidgetCustomizations *PreviewSigninPageWidgetCustomizations `pulumi:"widgetCustomizations"`
	// widget version specified as a Semver. The following are currently supported
	// 		*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
	// 		2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
	// 		3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
	// 		5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
	// 		6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
	WidgetVersion *string `pulumi:"widgetVersion"`
}

type PreviewSigninPageState struct {
	// brand id of the preview signin page
	BrandId                      pulumi.StringPtrInput
	ContentSecurityPolicySetting PreviewSigninPageContentSecurityPolicySettingPtrInput
	// page content of the preview signin page
	PageContent          pulumi.StringPtrInput
	WidgetCustomizations PreviewSigninPageWidgetCustomizationsPtrInput
	// widget version specified as a Semver. The following are currently supported
	// 		*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
	// 		2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
	// 		3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
	// 		5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
	// 		6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
	WidgetVersion pulumi.StringPtrInput
}

func (PreviewSigninPageState) ElementType() reflect.Type {
	return reflect.TypeOf((*previewSigninPageState)(nil)).Elem()
}

type previewSigninPageArgs struct {
	// brand id of the preview signin page
	BrandId                      string                                         `pulumi:"brandId"`
	ContentSecurityPolicySetting *PreviewSigninPageContentSecurityPolicySetting `pulumi:"contentSecurityPolicySetting"`
	// page content of the preview signin page
	PageContent          string                                 `pulumi:"pageContent"`
	WidgetCustomizations *PreviewSigninPageWidgetCustomizations `pulumi:"widgetCustomizations"`
	// widget version specified as a Semver. The following are currently supported
	// 		*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
	// 		2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
	// 		3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
	// 		5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
	// 		6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
	WidgetVersion string `pulumi:"widgetVersion"`
}

// The set of arguments for constructing a PreviewSigninPage resource.
type PreviewSigninPageArgs struct {
	// brand id of the preview signin page
	BrandId                      pulumi.StringInput
	ContentSecurityPolicySetting PreviewSigninPageContentSecurityPolicySettingPtrInput
	// page content of the preview signin page
	PageContent          pulumi.StringInput
	WidgetCustomizations PreviewSigninPageWidgetCustomizationsPtrInput
	// widget version specified as a Semver. The following are currently supported
	// 		*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
	// 		2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
	// 		3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
	// 		5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
	// 		6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
	WidgetVersion pulumi.StringInput
}

func (PreviewSigninPageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*previewSigninPageArgs)(nil)).Elem()
}

type PreviewSigninPageInput interface {
	pulumi.Input

	ToPreviewSigninPageOutput() PreviewSigninPageOutput
	ToPreviewSigninPageOutputWithContext(ctx context.Context) PreviewSigninPageOutput
}

func (*PreviewSigninPage) ElementType() reflect.Type {
	return reflect.TypeOf((**PreviewSigninPage)(nil)).Elem()
}

func (i *PreviewSigninPage) ToPreviewSigninPageOutput() PreviewSigninPageOutput {
	return i.ToPreviewSigninPageOutputWithContext(context.Background())
}

func (i *PreviewSigninPage) ToPreviewSigninPageOutputWithContext(ctx context.Context) PreviewSigninPageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreviewSigninPageOutput)
}

// PreviewSigninPageArrayInput is an input type that accepts PreviewSigninPageArray and PreviewSigninPageArrayOutput values.
// You can construct a concrete instance of `PreviewSigninPageArrayInput` via:
//
//	PreviewSigninPageArray{ PreviewSigninPageArgs{...} }
type PreviewSigninPageArrayInput interface {
	pulumi.Input

	ToPreviewSigninPageArrayOutput() PreviewSigninPageArrayOutput
	ToPreviewSigninPageArrayOutputWithContext(context.Context) PreviewSigninPageArrayOutput
}

type PreviewSigninPageArray []PreviewSigninPageInput

func (PreviewSigninPageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PreviewSigninPage)(nil)).Elem()
}

func (i PreviewSigninPageArray) ToPreviewSigninPageArrayOutput() PreviewSigninPageArrayOutput {
	return i.ToPreviewSigninPageArrayOutputWithContext(context.Background())
}

func (i PreviewSigninPageArray) ToPreviewSigninPageArrayOutputWithContext(ctx context.Context) PreviewSigninPageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreviewSigninPageArrayOutput)
}

// PreviewSigninPageMapInput is an input type that accepts PreviewSigninPageMap and PreviewSigninPageMapOutput values.
// You can construct a concrete instance of `PreviewSigninPageMapInput` via:
//
//	PreviewSigninPageMap{ "key": PreviewSigninPageArgs{...} }
type PreviewSigninPageMapInput interface {
	pulumi.Input

	ToPreviewSigninPageMapOutput() PreviewSigninPageMapOutput
	ToPreviewSigninPageMapOutputWithContext(context.Context) PreviewSigninPageMapOutput
}

type PreviewSigninPageMap map[string]PreviewSigninPageInput

func (PreviewSigninPageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PreviewSigninPage)(nil)).Elem()
}

func (i PreviewSigninPageMap) ToPreviewSigninPageMapOutput() PreviewSigninPageMapOutput {
	return i.ToPreviewSigninPageMapOutputWithContext(context.Background())
}

func (i PreviewSigninPageMap) ToPreviewSigninPageMapOutputWithContext(ctx context.Context) PreviewSigninPageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PreviewSigninPageMapOutput)
}

type PreviewSigninPageOutput struct{ *pulumi.OutputState }

func (PreviewSigninPageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PreviewSigninPage)(nil)).Elem()
}

func (o PreviewSigninPageOutput) ToPreviewSigninPageOutput() PreviewSigninPageOutput {
	return o
}

func (o PreviewSigninPageOutput) ToPreviewSigninPageOutputWithContext(ctx context.Context) PreviewSigninPageOutput {
	return o
}

// brand id of the preview signin page
func (o PreviewSigninPageOutput) BrandId() pulumi.StringOutput {
	return o.ApplyT(func(v *PreviewSigninPage) pulumi.StringOutput { return v.BrandId }).(pulumi.StringOutput)
}

func (o PreviewSigninPageOutput) ContentSecurityPolicySetting() PreviewSigninPageContentSecurityPolicySettingPtrOutput {
	return o.ApplyT(func(v *PreviewSigninPage) PreviewSigninPageContentSecurityPolicySettingPtrOutput {
		return v.ContentSecurityPolicySetting
	}).(PreviewSigninPageContentSecurityPolicySettingPtrOutput)
}

// page content of the preview signin page
func (o PreviewSigninPageOutput) PageContent() pulumi.StringOutput {
	return o.ApplyT(func(v *PreviewSigninPage) pulumi.StringOutput { return v.PageContent }).(pulumi.StringOutput)
}

func (o PreviewSigninPageOutput) WidgetCustomizations() PreviewSigninPageWidgetCustomizationsPtrOutput {
	return o.ApplyT(func(v *PreviewSigninPage) PreviewSigninPageWidgetCustomizationsPtrOutput {
		return v.WidgetCustomizations
	}).(PreviewSigninPageWidgetCustomizationsPtrOutput)
}

// widget version specified as a Semver. The following are currently supported
//
//	*, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4,
//	2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16, 2.17, 2.18, 2.19, 2.20, 2.21,
//	3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1, 5.2, 5.3,
//	5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5,
//	6.6, 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
func (o PreviewSigninPageOutput) WidgetVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *PreviewSigninPage) pulumi.StringOutput { return v.WidgetVersion }).(pulumi.StringOutput)
}

type PreviewSigninPageArrayOutput struct{ *pulumi.OutputState }

func (PreviewSigninPageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PreviewSigninPage)(nil)).Elem()
}

func (o PreviewSigninPageArrayOutput) ToPreviewSigninPageArrayOutput() PreviewSigninPageArrayOutput {
	return o
}

func (o PreviewSigninPageArrayOutput) ToPreviewSigninPageArrayOutputWithContext(ctx context.Context) PreviewSigninPageArrayOutput {
	return o
}

func (o PreviewSigninPageArrayOutput) Index(i pulumi.IntInput) PreviewSigninPageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PreviewSigninPage {
		return vs[0].([]*PreviewSigninPage)[vs[1].(int)]
	}).(PreviewSigninPageOutput)
}

type PreviewSigninPageMapOutput struct{ *pulumi.OutputState }

func (PreviewSigninPageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PreviewSigninPage)(nil)).Elem()
}

func (o PreviewSigninPageMapOutput) ToPreviewSigninPageMapOutput() PreviewSigninPageMapOutput {
	return o
}

func (o PreviewSigninPageMapOutput) ToPreviewSigninPageMapOutputWithContext(ctx context.Context) PreviewSigninPageMapOutput {
	return o
}

func (o PreviewSigninPageMapOutput) MapIndex(k pulumi.StringInput) PreviewSigninPageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PreviewSigninPage {
		return vs[0].(map[string]*PreviewSigninPage)[vs[1].(string)]
	}).(PreviewSigninPageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PreviewSigninPageInput)(nil)).Elem(), &PreviewSigninPage{})
	pulumi.RegisterInputType(reflect.TypeOf((*PreviewSigninPageArrayInput)(nil)).Elem(), PreviewSigninPageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PreviewSigninPageMapInput)(nil)).Elem(), PreviewSigninPageMap{})
	pulumi.RegisterOutputType(PreviewSigninPageOutput{})
	pulumi.RegisterOutputType(PreviewSigninPageArrayOutput{})
	pulumi.RegisterOutputType(PreviewSigninPageMapOutput{})
}