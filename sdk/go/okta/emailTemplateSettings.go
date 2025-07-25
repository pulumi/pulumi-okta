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

// Manages email template settings
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := okta.NewEmailTemplateSettings(ctx, "example", &okta.EmailTemplateSettingsArgs{
//				BrandId:      pulumi.String("<brand id>"),
//				TemplateName: pulumi.String("ForgotPassword"),
//				Recipients:   pulumi.String("ADMINS_ONLY"),
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
// $ pulumi import okta:index/emailTemplateSettings:EmailTemplateSettings example <brand_id>/<template_name>
// ```
type EmailTemplateSettings struct {
	pulumi.CustomResourceState

	// The ID of the brand.
	BrandId pulumi.StringOutput `pulumi:"brandId"`
	// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
	Recipients pulumi.StringOutput `pulumi:"recipients"`
	// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
}

// NewEmailTemplateSettings registers a new resource with the given unique name, arguments, and options.
func NewEmailTemplateSettings(ctx *pulumi.Context,
	name string, args *EmailTemplateSettingsArgs, opts ...pulumi.ResourceOption) (*EmailTemplateSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BrandId == nil {
		return nil, errors.New("invalid value for required argument 'BrandId'")
	}
	if args.Recipients == nil {
		return nil, errors.New("invalid value for required argument 'Recipients'")
	}
	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailTemplateSettings
	err := ctx.RegisterResource("okta:index/emailTemplateSettings:EmailTemplateSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailTemplateSettings gets an existing EmailTemplateSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailTemplateSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailTemplateSettingsState, opts ...pulumi.ResourceOption) (*EmailTemplateSettings, error) {
	var resource EmailTemplateSettings
	err := ctx.ReadResource("okta:index/emailTemplateSettings:EmailTemplateSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailTemplateSettings resources.
type emailTemplateSettingsState struct {
	// The ID of the brand.
	BrandId *string `pulumi:"brandId"`
	// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
	Recipients *string `pulumi:"recipients"`
	// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
	TemplateName *string `pulumi:"templateName"`
}

type EmailTemplateSettingsState struct {
	// The ID of the brand.
	BrandId pulumi.StringPtrInput
	// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
	Recipients pulumi.StringPtrInput
	// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
	TemplateName pulumi.StringPtrInput
}

func (EmailTemplateSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailTemplateSettingsState)(nil)).Elem()
}

type emailTemplateSettingsArgs struct {
	// The ID of the brand.
	BrandId string `pulumi:"brandId"`
	// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
	Recipients string `pulumi:"recipients"`
	// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
	TemplateName string `pulumi:"templateName"`
}

// The set of arguments for constructing a EmailTemplateSettings resource.
type EmailTemplateSettingsArgs struct {
	// The ID of the brand.
	BrandId pulumi.StringInput
	// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
	Recipients pulumi.StringInput
	// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
	TemplateName pulumi.StringInput
}

func (EmailTemplateSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailTemplateSettingsArgs)(nil)).Elem()
}

type EmailTemplateSettingsInput interface {
	pulumi.Input

	ToEmailTemplateSettingsOutput() EmailTemplateSettingsOutput
	ToEmailTemplateSettingsOutputWithContext(ctx context.Context) EmailTemplateSettingsOutput
}

func (*EmailTemplateSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailTemplateSettings)(nil)).Elem()
}

func (i *EmailTemplateSettings) ToEmailTemplateSettingsOutput() EmailTemplateSettingsOutput {
	return i.ToEmailTemplateSettingsOutputWithContext(context.Background())
}

func (i *EmailTemplateSettings) ToEmailTemplateSettingsOutputWithContext(ctx context.Context) EmailTemplateSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateSettingsOutput)
}

// EmailTemplateSettingsArrayInput is an input type that accepts EmailTemplateSettingsArray and EmailTemplateSettingsArrayOutput values.
// You can construct a concrete instance of `EmailTemplateSettingsArrayInput` via:
//
//	EmailTemplateSettingsArray{ EmailTemplateSettingsArgs{...} }
type EmailTemplateSettingsArrayInput interface {
	pulumi.Input

	ToEmailTemplateSettingsArrayOutput() EmailTemplateSettingsArrayOutput
	ToEmailTemplateSettingsArrayOutputWithContext(context.Context) EmailTemplateSettingsArrayOutput
}

type EmailTemplateSettingsArray []EmailTemplateSettingsInput

func (EmailTemplateSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailTemplateSettings)(nil)).Elem()
}

func (i EmailTemplateSettingsArray) ToEmailTemplateSettingsArrayOutput() EmailTemplateSettingsArrayOutput {
	return i.ToEmailTemplateSettingsArrayOutputWithContext(context.Background())
}

func (i EmailTemplateSettingsArray) ToEmailTemplateSettingsArrayOutputWithContext(ctx context.Context) EmailTemplateSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateSettingsArrayOutput)
}

// EmailTemplateSettingsMapInput is an input type that accepts EmailTemplateSettingsMap and EmailTemplateSettingsMapOutput values.
// You can construct a concrete instance of `EmailTemplateSettingsMapInput` via:
//
//	EmailTemplateSettingsMap{ "key": EmailTemplateSettingsArgs{...} }
type EmailTemplateSettingsMapInput interface {
	pulumi.Input

	ToEmailTemplateSettingsMapOutput() EmailTemplateSettingsMapOutput
	ToEmailTemplateSettingsMapOutputWithContext(context.Context) EmailTemplateSettingsMapOutput
}

type EmailTemplateSettingsMap map[string]EmailTemplateSettingsInput

func (EmailTemplateSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailTemplateSettings)(nil)).Elem()
}

func (i EmailTemplateSettingsMap) ToEmailTemplateSettingsMapOutput() EmailTemplateSettingsMapOutput {
	return i.ToEmailTemplateSettingsMapOutputWithContext(context.Background())
}

func (i EmailTemplateSettingsMap) ToEmailTemplateSettingsMapOutputWithContext(ctx context.Context) EmailTemplateSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateSettingsMapOutput)
}

type EmailTemplateSettingsOutput struct{ *pulumi.OutputState }

func (EmailTemplateSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailTemplateSettings)(nil)).Elem()
}

func (o EmailTemplateSettingsOutput) ToEmailTemplateSettingsOutput() EmailTemplateSettingsOutput {
	return o
}

func (o EmailTemplateSettingsOutput) ToEmailTemplateSettingsOutputWithContext(ctx context.Context) EmailTemplateSettingsOutput {
	return o
}

// The ID of the brand.
func (o EmailTemplateSettingsOutput) BrandId() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplateSettings) pulumi.StringOutput { return v.BrandId }).(pulumi.StringOutput)
}

// The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
func (o EmailTemplateSettingsOutput) Recipients() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplateSettings) pulumi.StringOutput { return v.Recipients }).(pulumi.StringOutput)
}

// Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
func (o EmailTemplateSettingsOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplateSettings) pulumi.StringOutput { return v.TemplateName }).(pulumi.StringOutput)
}

type EmailTemplateSettingsArrayOutput struct{ *pulumi.OutputState }

func (EmailTemplateSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailTemplateSettings)(nil)).Elem()
}

func (o EmailTemplateSettingsArrayOutput) ToEmailTemplateSettingsArrayOutput() EmailTemplateSettingsArrayOutput {
	return o
}

func (o EmailTemplateSettingsArrayOutput) ToEmailTemplateSettingsArrayOutputWithContext(ctx context.Context) EmailTemplateSettingsArrayOutput {
	return o
}

func (o EmailTemplateSettingsArrayOutput) Index(i pulumi.IntInput) EmailTemplateSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailTemplateSettings {
		return vs[0].([]*EmailTemplateSettings)[vs[1].(int)]
	}).(EmailTemplateSettingsOutput)
}

type EmailTemplateSettingsMapOutput struct{ *pulumi.OutputState }

func (EmailTemplateSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailTemplateSettings)(nil)).Elem()
}

func (o EmailTemplateSettingsMapOutput) ToEmailTemplateSettingsMapOutput() EmailTemplateSettingsMapOutput {
	return o
}

func (o EmailTemplateSettingsMapOutput) ToEmailTemplateSettingsMapOutputWithContext(ctx context.Context) EmailTemplateSettingsMapOutput {
	return o
}

func (o EmailTemplateSettingsMapOutput) MapIndex(k pulumi.StringInput) EmailTemplateSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailTemplateSettings {
		return vs[0].(map[string]*EmailTemplateSettings)[vs[1].(string)]
	}).(EmailTemplateSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateSettingsInput)(nil)).Elem(), &EmailTemplateSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateSettingsArrayInput)(nil)).Elem(), EmailTemplateSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateSettingsMapInput)(nil)).Elem(), EmailTemplateSettingsMap{})
	pulumi.RegisterOutputType(EmailTemplateSettingsOutput{})
	pulumi.RegisterOutputType(EmailTemplateSettingsArrayOutput{})
	pulumi.RegisterOutputType(EmailTemplateSettingsMapOutput{})
}
