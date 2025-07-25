# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['EmailTemplateSettingsArgs', 'EmailTemplateSettings']

@pulumi.input_type
class EmailTemplateSettingsArgs:
    def __init__(__self__, *,
                 brand_id: pulumi.Input[_builtins.str],
                 recipients: pulumi.Input[_builtins.str],
                 template_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a EmailTemplateSettings resource.
        :param pulumi.Input[_builtins.str] brand_id: The ID of the brand.
        :param pulumi.Input[_builtins.str] recipients: The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        :param pulumi.Input[_builtins.str] template_name: Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        pulumi.set(__self__, "brand_id", brand_id)
        pulumi.set(__self__, "recipients", recipients)
        pulumi.set(__self__, "template_name", template_name)

    @_builtins.property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the brand.
        """
        return pulumi.get(self, "brand_id")

    @brand_id.setter
    def brand_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "brand_id", value)

    @_builtins.property
    @pulumi.getter
    def recipients(self) -> pulumi.Input[_builtins.str]:
        """
        The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        """
        return pulumi.get(self, "recipients")

    @recipients.setter
    def recipients(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "recipients", value)

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> pulumi.Input[_builtins.str]:
        """
        Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        return pulumi.get(self, "template_name")

    @template_name.setter
    def template_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "template_name", value)


@pulumi.input_type
class _EmailTemplateSettingsState:
    def __init__(__self__, *,
                 brand_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recipients: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EmailTemplateSettings resources.
        :param pulumi.Input[_builtins.str] brand_id: The ID of the brand.
        :param pulumi.Input[_builtins.str] recipients: The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        :param pulumi.Input[_builtins.str] template_name: Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        if brand_id is not None:
            pulumi.set(__self__, "brand_id", brand_id)
        if recipients is not None:
            pulumi.set(__self__, "recipients", recipients)
        if template_name is not None:
            pulumi.set(__self__, "template_name", template_name)

    @_builtins.property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the brand.
        """
        return pulumi.get(self, "brand_id")

    @brand_id.setter
    def brand_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "brand_id", value)

    @_builtins.property
    @pulumi.getter
    def recipients(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        """
        return pulumi.get(self, "recipients")

    @recipients.setter
    def recipients(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recipients", value)

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        return pulumi.get(self, "template_name")

    @template_name.setter
    def template_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_name", value)


@pulumi.type_token("okta:index/emailTemplateSettings:EmailTemplateSettings")
class EmailTemplateSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 brand_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recipients: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages email template settings

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailTemplateSettings("example",
            brand_id="<brand id>",
            template_name="ForgotPassword",
            recipients="ADMINS_ONLY")
        ```

        ## Import

        ```sh
        $ pulumi import okta:index/emailTemplateSettings:EmailTemplateSettings example <brand_id>/<template_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] brand_id: The ID of the brand.
        :param pulumi.Input[_builtins.str] recipients: The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        :param pulumi.Input[_builtins.str] template_name: Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailTemplateSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages email template settings

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailTemplateSettings("example",
            brand_id="<brand id>",
            template_name="ForgotPassword",
            recipients="ADMINS_ONLY")
        ```

        ## Import

        ```sh
        $ pulumi import okta:index/emailTemplateSettings:EmailTemplateSettings example <brand_id>/<template_name>
        ```

        :param str resource_name: The name of the resource.
        :param EmailTemplateSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailTemplateSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 brand_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recipients: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailTemplateSettingsArgs.__new__(EmailTemplateSettingsArgs)

            if brand_id is None and not opts.urn:
                raise TypeError("Missing required property 'brand_id'")
            __props__.__dict__["brand_id"] = brand_id
            if recipients is None and not opts.urn:
                raise TypeError("Missing required property 'recipients'")
            __props__.__dict__["recipients"] = recipients
            if template_name is None and not opts.urn:
                raise TypeError("Missing required property 'template_name'")
            __props__.__dict__["template_name"] = template_name
        super(EmailTemplateSettings, __self__).__init__(
            'okta:index/emailTemplateSettings:EmailTemplateSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            brand_id: Optional[pulumi.Input[_builtins.str]] = None,
            recipients: Optional[pulumi.Input[_builtins.str]] = None,
            template_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'EmailTemplateSettings':
        """
        Get an existing EmailTemplateSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] brand_id: The ID of the brand.
        :param pulumi.Input[_builtins.str] recipients: The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        :param pulumi.Input[_builtins.str] template_name: Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailTemplateSettingsState.__new__(_EmailTemplateSettingsState)

        __props__.__dict__["brand_id"] = brand_id
        __props__.__dict__["recipients"] = recipients
        __props__.__dict__["template_name"] = template_name
        return EmailTemplateSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the brand.
        """
        return pulumi.get(self, "brand_id")

    @_builtins.property
    @pulumi.getter
    def recipients(self) -> pulumi.Output[_builtins.str]:
        """
        The recipients the emails of this template will be sent to - Valid values: `ALL_USERS`, `ADMINS_ONLY`, `NO_USERS`
        """
        return pulumi.get(self, "recipients")

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> pulumi.Output[_builtins.str]:
        """
        Email template name - Example values: `AccountLockout`,`ADForgotPassword`,`ADForgotPasswordDenied`,`ADSelfServiceUnlock`,`ADUserActivation`,`AuthenticatorEnrolled`,`AuthenticatorReset`,`ChangeEmailConfirmation`,`EmailChallenge`,`EmailChangeConfirmation`,`EmailFactorVerification`,`ForgotPassword`,`ForgotPasswordDenied`,`IGAReviewerEndNotification`,`IGAReviewerNotification`,`IGAReviewerPendingNotification`,`IGAReviewerReassigned`,`LDAPForgotPassword`,`LDAPForgotPasswordDenied`,`LDAPSelfServiceUnlock`,`LDAPUserActivation`,`MyAccountChangeConfirmation`,`NewSignOnNotification`,`OktaVerifyActivation`,`PasswordChanged`,`PasswordResetByAdmin`,`PendingEmailChange`,`RegistrationActivation`,`RegistrationEmailVerification`,`SelfServiceUnlock`,`SelfServiceUnlockOnUnlockedAccount`,`UserActivation`
        """
        return pulumi.get(self, "template_name")

