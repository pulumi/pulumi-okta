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

// Gets, updates, a single Theme of a Brand of an Okta Organization.
//
// This resource allows you to get and update an Okta
// [Theme](https://developer.okta.com/docs/reference/api/brands/#theme-object).
//
// The Okta Management API does not have a true Create or Delete for a theme. Therefore, the theme resource must be imported
// first into the pulumi state before updates can be applied to the theme.
//
// ## Import
//
// ```sh
// $ pulumi import okta:index/theme:Theme example <brand_id>/<theme_id>
// ```
type Theme struct {
	pulumi.CustomResourceState

	// Path to local file
	BackgroundImage pulumi.StringPtrOutput `pulumi:"backgroundImage"`
	// Background image URL
	BackgroundImageUrl pulumi.StringOutput `pulumi:"backgroundImageUrl"`
	// Brand ID
	BrandId pulumi.StringOutput `pulumi:"brandId"`
	// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
	EmailTemplateTouchPointVariant pulumi.StringPtrOutput `pulumi:"emailTemplateTouchPointVariant"`
	// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
	EndUserDashboardTouchPointVariant pulumi.StringPtrOutput `pulumi:"endUserDashboardTouchPointVariant"`
	// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	ErrorPageTouchPointVariant pulumi.StringPtrOutput `pulumi:"errorPageTouchPointVariant"`
	// Path to local file
	Favicon pulumi.StringPtrOutput `pulumi:"favicon"`
	// Favicon URL
	FaviconUrl pulumi.StringOutput `pulumi:"faviconUrl"`
	// Link relations for this object - JSON HAL - Discoverable resources related to the email template
	Links pulumi.StringOutput `pulumi:"links"`
	// Path to local file
	Logo pulumi.StringPtrOutput `pulumi:"logo"`
	// Logo URL
	LogoUrl pulumi.StringOutput `pulumi:"logoUrl"`
	// Primary color contrast hex code
	PrimaryColorContrastHex pulumi.StringPtrOutput `pulumi:"primaryColorContrastHex"`
	// Primary color hex code
	PrimaryColorHex pulumi.StringPtrOutput `pulumi:"primaryColorHex"`
	// Secondary color contrast hex code
	SecondaryColorContrastHex pulumi.StringPtrOutput `pulumi:"secondaryColorContrastHex"`
	// Secondary color hex code
	SecondaryColorHex pulumi.StringPtrOutput `pulumi:"secondaryColorHex"`
	// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	SignInPageTouchPointVariant pulumi.StringPtrOutput `pulumi:"signInPageTouchPointVariant"`
	// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
	ThemeId pulumi.StringPtrOutput `pulumi:"themeId"`
}

// NewTheme registers a new resource with the given unique name, arguments, and options.
func NewTheme(ctx *pulumi.Context,
	name string, args *ThemeArgs, opts ...pulumi.ResourceOption) (*Theme, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BrandId == nil {
		return nil, errors.New("invalid value for required argument 'BrandId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Theme
	err := ctx.RegisterResource("okta:index/theme:Theme", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTheme gets an existing Theme resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTheme(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThemeState, opts ...pulumi.ResourceOption) (*Theme, error) {
	var resource Theme
	err := ctx.ReadResource("okta:index/theme:Theme", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Theme resources.
type themeState struct {
	// Path to local file
	BackgroundImage *string `pulumi:"backgroundImage"`
	// Background image URL
	BackgroundImageUrl *string `pulumi:"backgroundImageUrl"`
	// Brand ID
	BrandId *string `pulumi:"brandId"`
	// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
	EmailTemplateTouchPointVariant *string `pulumi:"emailTemplateTouchPointVariant"`
	// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
	EndUserDashboardTouchPointVariant *string `pulumi:"endUserDashboardTouchPointVariant"`
	// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	ErrorPageTouchPointVariant *string `pulumi:"errorPageTouchPointVariant"`
	// Path to local file
	Favicon *string `pulumi:"favicon"`
	// Favicon URL
	FaviconUrl *string `pulumi:"faviconUrl"`
	// Link relations for this object - JSON HAL - Discoverable resources related to the email template
	Links *string `pulumi:"links"`
	// Path to local file
	Logo *string `pulumi:"logo"`
	// Logo URL
	LogoUrl *string `pulumi:"logoUrl"`
	// Primary color contrast hex code
	PrimaryColorContrastHex *string `pulumi:"primaryColorContrastHex"`
	// Primary color hex code
	PrimaryColorHex *string `pulumi:"primaryColorHex"`
	// Secondary color contrast hex code
	SecondaryColorContrastHex *string `pulumi:"secondaryColorContrastHex"`
	// Secondary color hex code
	SecondaryColorHex *string `pulumi:"secondaryColorHex"`
	// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	SignInPageTouchPointVariant *string `pulumi:"signInPageTouchPointVariant"`
	// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
	ThemeId *string `pulumi:"themeId"`
}

type ThemeState struct {
	// Path to local file
	BackgroundImage pulumi.StringPtrInput
	// Background image URL
	BackgroundImageUrl pulumi.StringPtrInput
	// Brand ID
	BrandId pulumi.StringPtrInput
	// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
	EmailTemplateTouchPointVariant pulumi.StringPtrInput
	// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
	EndUserDashboardTouchPointVariant pulumi.StringPtrInput
	// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	ErrorPageTouchPointVariant pulumi.StringPtrInput
	// Path to local file
	Favicon pulumi.StringPtrInput
	// Favicon URL
	FaviconUrl pulumi.StringPtrInput
	// Link relations for this object - JSON HAL - Discoverable resources related to the email template
	Links pulumi.StringPtrInput
	// Path to local file
	Logo pulumi.StringPtrInput
	// Logo URL
	LogoUrl pulumi.StringPtrInput
	// Primary color contrast hex code
	PrimaryColorContrastHex pulumi.StringPtrInput
	// Primary color hex code
	PrimaryColorHex pulumi.StringPtrInput
	// Secondary color contrast hex code
	SecondaryColorContrastHex pulumi.StringPtrInput
	// Secondary color hex code
	SecondaryColorHex pulumi.StringPtrInput
	// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	SignInPageTouchPointVariant pulumi.StringPtrInput
	// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
	ThemeId pulumi.StringPtrInput
}

func (ThemeState) ElementType() reflect.Type {
	return reflect.TypeOf((*themeState)(nil)).Elem()
}

type themeArgs struct {
	// Path to local file
	BackgroundImage *string `pulumi:"backgroundImage"`
	// Brand ID
	BrandId string `pulumi:"brandId"`
	// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
	EmailTemplateTouchPointVariant *string `pulumi:"emailTemplateTouchPointVariant"`
	// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
	EndUserDashboardTouchPointVariant *string `pulumi:"endUserDashboardTouchPointVariant"`
	// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	ErrorPageTouchPointVariant *string `pulumi:"errorPageTouchPointVariant"`
	// Path to local file
	Favicon *string `pulumi:"favicon"`
	// Path to local file
	Logo *string `pulumi:"logo"`
	// Primary color contrast hex code
	PrimaryColorContrastHex *string `pulumi:"primaryColorContrastHex"`
	// Primary color hex code
	PrimaryColorHex *string `pulumi:"primaryColorHex"`
	// Secondary color contrast hex code
	SecondaryColorContrastHex *string `pulumi:"secondaryColorContrastHex"`
	// Secondary color hex code
	SecondaryColorHex *string `pulumi:"secondaryColorHex"`
	// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	SignInPageTouchPointVariant *string `pulumi:"signInPageTouchPointVariant"`
	// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
	ThemeId *string `pulumi:"themeId"`
}

// The set of arguments for constructing a Theme resource.
type ThemeArgs struct {
	// Path to local file
	BackgroundImage pulumi.StringPtrInput
	// Brand ID
	BrandId pulumi.StringInput
	// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
	EmailTemplateTouchPointVariant pulumi.StringPtrInput
	// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
	EndUserDashboardTouchPointVariant pulumi.StringPtrInput
	// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	ErrorPageTouchPointVariant pulumi.StringPtrInput
	// Path to local file
	Favicon pulumi.StringPtrInput
	// Path to local file
	Logo pulumi.StringPtrInput
	// Primary color contrast hex code
	PrimaryColorContrastHex pulumi.StringPtrInput
	// Primary color hex code
	PrimaryColorHex pulumi.StringPtrInput
	// Secondary color contrast hex code
	SecondaryColorContrastHex pulumi.StringPtrInput
	// Secondary color hex code
	SecondaryColorHex pulumi.StringPtrInput
	// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
	SignInPageTouchPointVariant pulumi.StringPtrInput
	// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
	ThemeId pulumi.StringPtrInput
}

func (ThemeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*themeArgs)(nil)).Elem()
}

type ThemeInput interface {
	pulumi.Input

	ToThemeOutput() ThemeOutput
	ToThemeOutputWithContext(ctx context.Context) ThemeOutput
}

func (*Theme) ElementType() reflect.Type {
	return reflect.TypeOf((**Theme)(nil)).Elem()
}

func (i *Theme) ToThemeOutput() ThemeOutput {
	return i.ToThemeOutputWithContext(context.Background())
}

func (i *Theme) ToThemeOutputWithContext(ctx context.Context) ThemeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThemeOutput)
}

// ThemeArrayInput is an input type that accepts ThemeArray and ThemeArrayOutput values.
// You can construct a concrete instance of `ThemeArrayInput` via:
//
//	ThemeArray{ ThemeArgs{...} }
type ThemeArrayInput interface {
	pulumi.Input

	ToThemeArrayOutput() ThemeArrayOutput
	ToThemeArrayOutputWithContext(context.Context) ThemeArrayOutput
}

type ThemeArray []ThemeInput

func (ThemeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Theme)(nil)).Elem()
}

func (i ThemeArray) ToThemeArrayOutput() ThemeArrayOutput {
	return i.ToThemeArrayOutputWithContext(context.Background())
}

func (i ThemeArray) ToThemeArrayOutputWithContext(ctx context.Context) ThemeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThemeArrayOutput)
}

// ThemeMapInput is an input type that accepts ThemeMap and ThemeMapOutput values.
// You can construct a concrete instance of `ThemeMapInput` via:
//
//	ThemeMap{ "key": ThemeArgs{...} }
type ThemeMapInput interface {
	pulumi.Input

	ToThemeMapOutput() ThemeMapOutput
	ToThemeMapOutputWithContext(context.Context) ThemeMapOutput
}

type ThemeMap map[string]ThemeInput

func (ThemeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Theme)(nil)).Elem()
}

func (i ThemeMap) ToThemeMapOutput() ThemeMapOutput {
	return i.ToThemeMapOutputWithContext(context.Background())
}

func (i ThemeMap) ToThemeMapOutputWithContext(ctx context.Context) ThemeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThemeMapOutput)
}

type ThemeOutput struct{ *pulumi.OutputState }

func (ThemeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Theme)(nil)).Elem()
}

func (o ThemeOutput) ToThemeOutput() ThemeOutput {
	return o
}

func (o ThemeOutput) ToThemeOutputWithContext(ctx context.Context) ThemeOutput {
	return o
}

// Path to local file
func (o ThemeOutput) BackgroundImage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.BackgroundImage }).(pulumi.StringPtrOutput)
}

// Background image URL
func (o ThemeOutput) BackgroundImageUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringOutput { return v.BackgroundImageUrl }).(pulumi.StringOutput)
}

// Brand ID
func (o ThemeOutput) BrandId() pulumi.StringOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringOutput { return v.BrandId }).(pulumi.StringOutput)
}

// Variant for email templates (`OKTA_DEFAULT`, `FULL_THEME`)
func (o ThemeOutput) EmailTemplateTouchPointVariant() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.EmailTemplateTouchPointVariant }).(pulumi.StringPtrOutput)
}

// Variant for the Okta End-User Dashboard (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
func (o ThemeOutput) EndUserDashboardTouchPointVariant() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.EndUserDashboardTouchPointVariant }).(pulumi.StringPtrOutput)
}

// Variant for the error page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
func (o ThemeOutput) ErrorPageTouchPointVariant() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.ErrorPageTouchPointVariant }).(pulumi.StringPtrOutput)
}

// Path to local file
func (o ThemeOutput) Favicon() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.Favicon }).(pulumi.StringPtrOutput)
}

// Favicon URL
func (o ThemeOutput) FaviconUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringOutput { return v.FaviconUrl }).(pulumi.StringOutput)
}

// Link relations for this object - JSON HAL - Discoverable resources related to the email template
func (o ThemeOutput) Links() pulumi.StringOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringOutput { return v.Links }).(pulumi.StringOutput)
}

// Path to local file
func (o ThemeOutput) Logo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.Logo }).(pulumi.StringPtrOutput)
}

// Logo URL
func (o ThemeOutput) LogoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringOutput { return v.LogoUrl }).(pulumi.StringOutput)
}

// Primary color contrast hex code
func (o ThemeOutput) PrimaryColorContrastHex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.PrimaryColorContrastHex }).(pulumi.StringPtrOutput)
}

// Primary color hex code
func (o ThemeOutput) PrimaryColorHex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.PrimaryColorHex }).(pulumi.StringPtrOutput)
}

// Secondary color contrast hex code
func (o ThemeOutput) SecondaryColorContrastHex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.SecondaryColorContrastHex }).(pulumi.StringPtrOutput)
}

// Secondary color hex code
func (o ThemeOutput) SecondaryColorHex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.SecondaryColorHex }).(pulumi.StringPtrOutput)
}

// Variant for the Okta Sign-In Page (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
func (o ThemeOutput) SignInPageTouchPointVariant() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.SignInPageTouchPointVariant }).(pulumi.StringPtrOutput)
}

// Theme ID - Note: Okta API for theme only reads and updates therefore the okta*theme resource needs to act as a quasi data source. Do this by setting theme*id.
func (o ThemeOutput) ThemeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Theme) pulumi.StringPtrOutput { return v.ThemeId }).(pulumi.StringPtrOutput)
}

type ThemeArrayOutput struct{ *pulumi.OutputState }

func (ThemeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Theme)(nil)).Elem()
}

func (o ThemeArrayOutput) ToThemeArrayOutput() ThemeArrayOutput {
	return o
}

func (o ThemeArrayOutput) ToThemeArrayOutputWithContext(ctx context.Context) ThemeArrayOutput {
	return o
}

func (o ThemeArrayOutput) Index(i pulumi.IntInput) ThemeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Theme {
		return vs[0].([]*Theme)[vs[1].(int)]
	}).(ThemeOutput)
}

type ThemeMapOutput struct{ *pulumi.OutputState }

func (ThemeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Theme)(nil)).Elem()
}

func (o ThemeMapOutput) ToThemeMapOutput() ThemeMapOutput {
	return o
}

func (o ThemeMapOutput) ToThemeMapOutputWithContext(ctx context.Context) ThemeMapOutput {
	return o
}

func (o ThemeMapOutput) MapIndex(k pulumi.StringInput) ThemeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Theme {
		return vs[0].(map[string]*Theme)[vs[1].(string)]
	}).(ThemeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThemeInput)(nil)).Elem(), &Theme{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThemeArrayInput)(nil)).Elem(), ThemeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThemeMapInput)(nil)).Elem(), ThemeMap{})
	pulumi.RegisterOutputType(ThemeOutput{})
	pulumi.RegisterOutputType(ThemeArrayOutput{})
	pulumi.RegisterOutputType(ThemeMapOutput{})
}
