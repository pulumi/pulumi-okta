// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package app

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a SWA Application.
//
// This resource allows you to create and configure a SWA Application.
// > During an apply if there is change in 'status' the app will first be
// activated or deactivated in accordance with the 'status' change. Then, all
// other arguments that changed will be applied.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/app"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := app.NewSwa(ctx, "example", &app.SwaArgs{
//				Label:         pulumi.String("example"),
//				ButtonField:   pulumi.String("btn-login"),
//				PasswordField: pulumi.String("txtbox-password"),
//				UsernameField: pulumi.String("txtbox-username"),
//				Url:           pulumi.String("https://example.com/login.html"),
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
// $ pulumi import okta:app/swa:Swa example <app_id>
// ```
type Swa struct {
	pulumi.CustomResourceState

	// Custom error page URL
	AccessibilityErrorRedirectUrl pulumi.StringPtrOutput `pulumi:"accessibilityErrorRedirectUrl"`
	// Custom login page URL
	AccessibilityLoginRedirectUrl pulumi.StringPtrOutput `pulumi:"accessibilityLoginRedirectUrl"`
	// Enable self service. Default is `false`
	AccessibilitySelfService pulumi.BoolPtrOutput `pulumi:"accessibilitySelfService"`
	// Application notes for admins.
	AdminNote pulumi.StringPtrOutput `pulumi:"adminNote"`
	// Displays specific appLinks for the app. The value for each application link should be boolean.
	AppLinksJson pulumi.StringPtrOutput `pulumi:"appLinksJson"`
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrOutput `pulumi:"autoSubmitToolbar"`
	// Login button field
	ButtonField pulumi.StringPtrOutput `pulumi:"buttonField"`
	// CSS selector for the checkbox
	Checkbox pulumi.StringPtrOutput `pulumi:"checkbox"`
	// Application notes for end users.
	EnduserNote pulumi.StringPtrOutput `pulumi:"enduserNote"`
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrOutput `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrOutput `pulumi:"hideWeb"`
	// The Application's display name.
	Label pulumi.StringOutput `pulumi:"label"`
	// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
	Logo pulumi.StringPtrOutput `pulumi:"logo"`
	// URL of the application's logo
	LogoUrl pulumi.StringOutput `pulumi:"logoUrl"`
	// Name of the app.
	Name pulumi.StringOutput `pulumi:"name"`
	// Login password field
	PasswordField pulumi.StringPtrOutput `pulumi:"passwordField"`
	// Preconfigured app name
	PreconfiguredApp pulumi.StringPtrOutput `pulumi:"preconfiguredApp"`
	// If going to the login page URL redirects to another page, then enter that URL here
	RedirectUrl pulumi.StringPtrOutput `pulumi:"redirectUrl"`
	// Sign on mode of application.
	SignOnMode pulumi.StringOutput `pulumi:"signOnMode"`
	// Status of application. By default, it is `ACTIVE`
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Login URL
	Url pulumi.StringPtrOutput `pulumi:"url"`
	// A regex that further restricts URL to the specified regex
	UrlRegex pulumi.StringPtrOutput `pulumi:"urlRegex"`
	// Username template. Default: `${source.login}`
	UserNameTemplate pulumi.StringPtrOutput `pulumi:"userNameTemplate"`
	// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
	UserNameTemplatePushStatus pulumi.StringPtrOutput `pulumi:"userNameTemplatePushStatus"`
	// Username template suffix
	UserNameTemplateSuffix pulumi.StringPtrOutput `pulumi:"userNameTemplateSuffix"`
	// Username template type. Default: `BUILT_IN`
	UserNameTemplateType pulumi.StringPtrOutput `pulumi:"userNameTemplateType"`
	// Login username field
	UsernameField pulumi.StringPtrOutput `pulumi:"usernameField"`
}

// NewSwa registers a new resource with the given unique name, arguments, and options.
func NewSwa(ctx *pulumi.Context,
	name string, args *SwaArgs, opts ...pulumi.ResourceOption) (*Swa, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Swa
	err := ctx.RegisterResource("okta:app/swa:Swa", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwa gets an existing Swa resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwa(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwaState, opts ...pulumi.ResourceOption) (*Swa, error) {
	var resource Swa
	err := ctx.ReadResource("okta:app/swa:Swa", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Swa resources.
type swaState struct {
	// Custom error page URL
	AccessibilityErrorRedirectUrl *string `pulumi:"accessibilityErrorRedirectUrl"`
	// Custom login page URL
	AccessibilityLoginRedirectUrl *string `pulumi:"accessibilityLoginRedirectUrl"`
	// Enable self service. Default is `false`
	AccessibilitySelfService *bool `pulumi:"accessibilitySelfService"`
	// Application notes for admins.
	AdminNote *string `pulumi:"adminNote"`
	// Displays specific appLinks for the app. The value for each application link should be boolean.
	AppLinksJson *string `pulumi:"appLinksJson"`
	// Display auto submit toolbar
	AutoSubmitToolbar *bool `pulumi:"autoSubmitToolbar"`
	// Login button field
	ButtonField *string `pulumi:"buttonField"`
	// CSS selector for the checkbox
	Checkbox *string `pulumi:"checkbox"`
	// Application notes for end users.
	EnduserNote *string `pulumi:"enduserNote"`
	// Do not display application icon on mobile app
	HideIos *bool `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb *bool `pulumi:"hideWeb"`
	// The Application's display name.
	Label *string `pulumi:"label"`
	// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
	Logo *string `pulumi:"logo"`
	// URL of the application's logo
	LogoUrl *string `pulumi:"logoUrl"`
	// Name of the app.
	Name *string `pulumi:"name"`
	// Login password field
	PasswordField *string `pulumi:"passwordField"`
	// Preconfigured app name
	PreconfiguredApp *string `pulumi:"preconfiguredApp"`
	// If going to the login page URL redirects to another page, then enter that URL here
	RedirectUrl *string `pulumi:"redirectUrl"`
	// Sign on mode of application.
	SignOnMode *string `pulumi:"signOnMode"`
	// Status of application. By default, it is `ACTIVE`
	Status *string `pulumi:"status"`
	// Login URL
	Url *string `pulumi:"url"`
	// A regex that further restricts URL to the specified regex
	UrlRegex *string `pulumi:"urlRegex"`
	// Username template. Default: `${source.login}`
	UserNameTemplate *string `pulumi:"userNameTemplate"`
	// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
	UserNameTemplatePushStatus *string `pulumi:"userNameTemplatePushStatus"`
	// Username template suffix
	UserNameTemplateSuffix *string `pulumi:"userNameTemplateSuffix"`
	// Username template type. Default: `BUILT_IN`
	UserNameTemplateType *string `pulumi:"userNameTemplateType"`
	// Login username field
	UsernameField *string `pulumi:"usernameField"`
}

type SwaState struct {
	// Custom error page URL
	AccessibilityErrorRedirectUrl pulumi.StringPtrInput
	// Custom login page URL
	AccessibilityLoginRedirectUrl pulumi.StringPtrInput
	// Enable self service. Default is `false`
	AccessibilitySelfService pulumi.BoolPtrInput
	// Application notes for admins.
	AdminNote pulumi.StringPtrInput
	// Displays specific appLinks for the app. The value for each application link should be boolean.
	AppLinksJson pulumi.StringPtrInput
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrInput
	// Login button field
	ButtonField pulumi.StringPtrInput
	// CSS selector for the checkbox
	Checkbox pulumi.StringPtrInput
	// Application notes for end users.
	EnduserNote pulumi.StringPtrInput
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrInput
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrInput
	// The Application's display name.
	Label pulumi.StringPtrInput
	// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
	Logo pulumi.StringPtrInput
	// URL of the application's logo
	LogoUrl pulumi.StringPtrInput
	// Name of the app.
	Name pulumi.StringPtrInput
	// Login password field
	PasswordField pulumi.StringPtrInput
	// Preconfigured app name
	PreconfiguredApp pulumi.StringPtrInput
	// If going to the login page URL redirects to another page, then enter that URL here
	RedirectUrl pulumi.StringPtrInput
	// Sign on mode of application.
	SignOnMode pulumi.StringPtrInput
	// Status of application. By default, it is `ACTIVE`
	Status pulumi.StringPtrInput
	// Login URL
	Url pulumi.StringPtrInput
	// A regex that further restricts URL to the specified regex
	UrlRegex pulumi.StringPtrInput
	// Username template. Default: `${source.login}`
	UserNameTemplate pulumi.StringPtrInput
	// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
	UserNameTemplatePushStatus pulumi.StringPtrInput
	// Username template suffix
	UserNameTemplateSuffix pulumi.StringPtrInput
	// Username template type. Default: `BUILT_IN`
	UserNameTemplateType pulumi.StringPtrInput
	// Login username field
	UsernameField pulumi.StringPtrInput
}

func (SwaState) ElementType() reflect.Type {
	return reflect.TypeOf((*swaState)(nil)).Elem()
}

type swaArgs struct {
	// Custom error page URL
	AccessibilityErrorRedirectUrl *string `pulumi:"accessibilityErrorRedirectUrl"`
	// Custom login page URL
	AccessibilityLoginRedirectUrl *string `pulumi:"accessibilityLoginRedirectUrl"`
	// Enable self service. Default is `false`
	AccessibilitySelfService *bool `pulumi:"accessibilitySelfService"`
	// Application notes for admins.
	AdminNote *string `pulumi:"adminNote"`
	// Displays specific appLinks for the app. The value for each application link should be boolean.
	AppLinksJson *string `pulumi:"appLinksJson"`
	// Display auto submit toolbar
	AutoSubmitToolbar *bool `pulumi:"autoSubmitToolbar"`
	// Login button field
	ButtonField *string `pulumi:"buttonField"`
	// CSS selector for the checkbox
	Checkbox *string `pulumi:"checkbox"`
	// Application notes for end users.
	EnduserNote *string `pulumi:"enduserNote"`
	// Do not display application icon on mobile app
	HideIos *bool `pulumi:"hideIos"`
	// Do not display application icon to users
	HideWeb *bool `pulumi:"hideWeb"`
	// The Application's display name.
	Label string `pulumi:"label"`
	// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
	Logo *string `pulumi:"logo"`
	// Login password field
	PasswordField *string `pulumi:"passwordField"`
	// Preconfigured app name
	PreconfiguredApp *string `pulumi:"preconfiguredApp"`
	// If going to the login page URL redirects to another page, then enter that URL here
	RedirectUrl *string `pulumi:"redirectUrl"`
	// Status of application. By default, it is `ACTIVE`
	Status *string `pulumi:"status"`
	// Login URL
	Url *string `pulumi:"url"`
	// A regex that further restricts URL to the specified regex
	UrlRegex *string `pulumi:"urlRegex"`
	// Username template. Default: `${source.login}`
	UserNameTemplate *string `pulumi:"userNameTemplate"`
	// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
	UserNameTemplatePushStatus *string `pulumi:"userNameTemplatePushStatus"`
	// Username template suffix
	UserNameTemplateSuffix *string `pulumi:"userNameTemplateSuffix"`
	// Username template type. Default: `BUILT_IN`
	UserNameTemplateType *string `pulumi:"userNameTemplateType"`
	// Login username field
	UsernameField *string `pulumi:"usernameField"`
}

// The set of arguments for constructing a Swa resource.
type SwaArgs struct {
	// Custom error page URL
	AccessibilityErrorRedirectUrl pulumi.StringPtrInput
	// Custom login page URL
	AccessibilityLoginRedirectUrl pulumi.StringPtrInput
	// Enable self service. Default is `false`
	AccessibilitySelfService pulumi.BoolPtrInput
	// Application notes for admins.
	AdminNote pulumi.StringPtrInput
	// Displays specific appLinks for the app. The value for each application link should be boolean.
	AppLinksJson pulumi.StringPtrInput
	// Display auto submit toolbar
	AutoSubmitToolbar pulumi.BoolPtrInput
	// Login button field
	ButtonField pulumi.StringPtrInput
	// CSS selector for the checkbox
	Checkbox pulumi.StringPtrInput
	// Application notes for end users.
	EnduserNote pulumi.StringPtrInput
	// Do not display application icon on mobile app
	HideIos pulumi.BoolPtrInput
	// Do not display application icon to users
	HideWeb pulumi.BoolPtrInput
	// The Application's display name.
	Label pulumi.StringInput
	// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
	Logo pulumi.StringPtrInput
	// Login password field
	PasswordField pulumi.StringPtrInput
	// Preconfigured app name
	PreconfiguredApp pulumi.StringPtrInput
	// If going to the login page URL redirects to another page, then enter that URL here
	RedirectUrl pulumi.StringPtrInput
	// Status of application. By default, it is `ACTIVE`
	Status pulumi.StringPtrInput
	// Login URL
	Url pulumi.StringPtrInput
	// A regex that further restricts URL to the specified regex
	UrlRegex pulumi.StringPtrInput
	// Username template. Default: `${source.login}`
	UserNameTemplate pulumi.StringPtrInput
	// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
	UserNameTemplatePushStatus pulumi.StringPtrInput
	// Username template suffix
	UserNameTemplateSuffix pulumi.StringPtrInput
	// Username template type. Default: `BUILT_IN`
	UserNameTemplateType pulumi.StringPtrInput
	// Login username field
	UsernameField pulumi.StringPtrInput
}

func (SwaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*swaArgs)(nil)).Elem()
}

type SwaInput interface {
	pulumi.Input

	ToSwaOutput() SwaOutput
	ToSwaOutputWithContext(ctx context.Context) SwaOutput
}

func (*Swa) ElementType() reflect.Type {
	return reflect.TypeOf((**Swa)(nil)).Elem()
}

func (i *Swa) ToSwaOutput() SwaOutput {
	return i.ToSwaOutputWithContext(context.Background())
}

func (i *Swa) ToSwaOutputWithContext(ctx context.Context) SwaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwaOutput)
}

// SwaArrayInput is an input type that accepts SwaArray and SwaArrayOutput values.
// You can construct a concrete instance of `SwaArrayInput` via:
//
//	SwaArray{ SwaArgs{...} }
type SwaArrayInput interface {
	pulumi.Input

	ToSwaArrayOutput() SwaArrayOutput
	ToSwaArrayOutputWithContext(context.Context) SwaArrayOutput
}

type SwaArray []SwaInput

func (SwaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Swa)(nil)).Elem()
}

func (i SwaArray) ToSwaArrayOutput() SwaArrayOutput {
	return i.ToSwaArrayOutputWithContext(context.Background())
}

func (i SwaArray) ToSwaArrayOutputWithContext(ctx context.Context) SwaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwaArrayOutput)
}

// SwaMapInput is an input type that accepts SwaMap and SwaMapOutput values.
// You can construct a concrete instance of `SwaMapInput` via:
//
//	SwaMap{ "key": SwaArgs{...} }
type SwaMapInput interface {
	pulumi.Input

	ToSwaMapOutput() SwaMapOutput
	ToSwaMapOutputWithContext(context.Context) SwaMapOutput
}

type SwaMap map[string]SwaInput

func (SwaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Swa)(nil)).Elem()
}

func (i SwaMap) ToSwaMapOutput() SwaMapOutput {
	return i.ToSwaMapOutputWithContext(context.Background())
}

func (i SwaMap) ToSwaMapOutputWithContext(ctx context.Context) SwaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwaMapOutput)
}

type SwaOutput struct{ *pulumi.OutputState }

func (SwaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Swa)(nil)).Elem()
}

func (o SwaOutput) ToSwaOutput() SwaOutput {
	return o
}

func (o SwaOutput) ToSwaOutputWithContext(ctx context.Context) SwaOutput {
	return o
}

// Custom error page URL
func (o SwaOutput) AccessibilityErrorRedirectUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.AccessibilityErrorRedirectUrl }).(pulumi.StringPtrOutput)
}

// Custom login page URL
func (o SwaOutput) AccessibilityLoginRedirectUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.AccessibilityLoginRedirectUrl }).(pulumi.StringPtrOutput)
}

// Enable self service. Default is `false`
func (o SwaOutput) AccessibilitySelfService() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.BoolPtrOutput { return v.AccessibilitySelfService }).(pulumi.BoolPtrOutput)
}

// Application notes for admins.
func (o SwaOutput) AdminNote() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.AdminNote }).(pulumi.StringPtrOutput)
}

// Displays specific appLinks for the app. The value for each application link should be boolean.
func (o SwaOutput) AppLinksJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.AppLinksJson }).(pulumi.StringPtrOutput)
}

// Display auto submit toolbar
func (o SwaOutput) AutoSubmitToolbar() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.BoolPtrOutput { return v.AutoSubmitToolbar }).(pulumi.BoolPtrOutput)
}

// Login button field
func (o SwaOutput) ButtonField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.ButtonField }).(pulumi.StringPtrOutput)
}

// CSS selector for the checkbox
func (o SwaOutput) Checkbox() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.Checkbox }).(pulumi.StringPtrOutput)
}

// Application notes for end users.
func (o SwaOutput) EnduserNote() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.EnduserNote }).(pulumi.StringPtrOutput)
}

// Do not display application icon on mobile app
func (o SwaOutput) HideIos() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.BoolPtrOutput { return v.HideIos }).(pulumi.BoolPtrOutput)
}

// Do not display application icon to users
func (o SwaOutput) HideWeb() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.BoolPtrOutput { return v.HideWeb }).(pulumi.BoolPtrOutput)
}

// The Application's display name.
func (o SwaOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
func (o SwaOutput) Logo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.Logo }).(pulumi.StringPtrOutput)
}

// URL of the application's logo
func (o SwaOutput) LogoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringOutput { return v.LogoUrl }).(pulumi.StringOutput)
}

// Name of the app.
func (o SwaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Login password field
func (o SwaOutput) PasswordField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.PasswordField }).(pulumi.StringPtrOutput)
}

// Preconfigured app name
func (o SwaOutput) PreconfiguredApp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.PreconfiguredApp }).(pulumi.StringPtrOutput)
}

// If going to the login page URL redirects to another page, then enter that URL here
func (o SwaOutput) RedirectUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.RedirectUrl }).(pulumi.StringPtrOutput)
}

// Sign on mode of application.
func (o SwaOutput) SignOnMode() pulumi.StringOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringOutput { return v.SignOnMode }).(pulumi.StringOutput)
}

// Status of application. By default, it is `ACTIVE`
func (o SwaOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Login URL
func (o SwaOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

// A regex that further restricts URL to the specified regex
func (o SwaOutput) UrlRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UrlRegex }).(pulumi.StringPtrOutput)
}

// Username template. Default: `${source.login}`
func (o SwaOutput) UserNameTemplate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UserNameTemplate }).(pulumi.StringPtrOutput)
}

// Push username on update. Valid values: `PUSH` and `DONT_PUSH`
func (o SwaOutput) UserNameTemplatePushStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UserNameTemplatePushStatus }).(pulumi.StringPtrOutput)
}

// Username template suffix
func (o SwaOutput) UserNameTemplateSuffix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UserNameTemplateSuffix }).(pulumi.StringPtrOutput)
}

// Username template type. Default: `BUILT_IN`
func (o SwaOutput) UserNameTemplateType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UserNameTemplateType }).(pulumi.StringPtrOutput)
}

// Login username field
func (o SwaOutput) UsernameField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Swa) pulumi.StringPtrOutput { return v.UsernameField }).(pulumi.StringPtrOutput)
}

type SwaArrayOutput struct{ *pulumi.OutputState }

func (SwaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Swa)(nil)).Elem()
}

func (o SwaArrayOutput) ToSwaArrayOutput() SwaArrayOutput {
	return o
}

func (o SwaArrayOutput) ToSwaArrayOutputWithContext(ctx context.Context) SwaArrayOutput {
	return o
}

func (o SwaArrayOutput) Index(i pulumi.IntInput) SwaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Swa {
		return vs[0].([]*Swa)[vs[1].(int)]
	}).(SwaOutput)
}

type SwaMapOutput struct{ *pulumi.OutputState }

func (SwaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Swa)(nil)).Elem()
}

func (o SwaMapOutput) ToSwaMapOutput() SwaMapOutput {
	return o
}

func (o SwaMapOutput) ToSwaMapOutputWithContext(ctx context.Context) SwaMapOutput {
	return o
}

func (o SwaMapOutput) MapIndex(k pulumi.StringInput) SwaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Swa {
		return vs[0].(map[string]*Swa)[vs[1].(string)]
	}).(SwaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwaInput)(nil)).Elem(), &Swa{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwaArrayInput)(nil)).Elem(), SwaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwaMapInput)(nil)).Elem(), SwaMap{})
	pulumi.RegisterOutputType(SwaOutput{})
	pulumi.RegisterOutputType(SwaArrayOutput{})
	pulumi.RegisterOutputType(SwaMapOutput{})
}
