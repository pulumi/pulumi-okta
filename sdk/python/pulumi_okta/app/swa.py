# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Swa']


class Swa(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accessibility_error_redirect_url: Optional[pulumi.Input[str]] = None,
                 accessibility_self_service: Optional[pulumi.Input[bool]] = None,
                 auto_submit_toolbar: Optional[pulumi.Input[bool]] = None,
                 button_field: Optional[pulumi.Input[str]] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 hide_ios: Optional[pulumi.Input[bool]] = None,
                 hide_web: Optional[pulumi.Input[bool]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 password_field: Optional[pulumi.Input[str]] = None,
                 preconfigured_app: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 url_regex: Optional[pulumi.Input[str]] = None,
                 user_name_template: Optional[pulumi.Input[str]] = None,
                 user_name_template_suffix: Optional[pulumi.Input[str]] = None,
                 user_name_template_type: Optional[pulumi.Input[str]] = None,
                 username_field: Optional[pulumi.Input[str]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwaUserArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Creates an SWA Application.

        This resource allows you to create and configure an SWA Application.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.app.Swa("example",
            button_field="btn-login",
            label="example",
            password_field="txtbox-password",
            url="https://example.com/login.html",
            username_field="txtbox-username")
        ```

        ## Import

        Okta SWA App can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:app/swa:Swa example <app id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessibility_error_redirect_url: Custom error page URL.
        :param pulumi.Input[bool] accessibility_self_service: Enable self-service. By default, it is `false`.
        :param pulumi.Input[bool] auto_submit_toolbar: Display auto submit toolbar.
        :param pulumi.Input[str] button_field: Login button field.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Groups associated with the application. See `app.GroupAssignment` for a more flexible approach.
        :param pulumi.Input[bool] hide_ios: Do not display application icon on mobile app.
        :param pulumi.Input[bool] hide_web: Do not display application icon to users.
        :param pulumi.Input[str] label: The display name of the Application.
        :param pulumi.Input[str] password_field: Login password field.
        :param pulumi.Input[str] preconfigured_app: name of application from the Okta Integration Network, if not included a custom app will be created.
        :param pulumi.Input[str] status: Status of application. By default, it is `"ACTIVE"`.
        :param pulumi.Input[str] url: Login URL.
        :param pulumi.Input[str] url_regex: A regex that further restricts URL to the specified regex.
        :param pulumi.Input[str] user_name_template: The default username assigned to each user.
        :param pulumi.Input[str] user_name_template_suffix: Username template suffix
        :param pulumi.Input[str] user_name_template_type: The Username template type.
        :param pulumi.Input[str] username_field: Login username field.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwaUserArgs']]]] users: The users assigned to the application. See `app.User` for a more flexible approach.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['accessibility_error_redirect_url'] = accessibility_error_redirect_url
            __props__['accessibility_self_service'] = accessibility_self_service
            __props__['auto_submit_toolbar'] = auto_submit_toolbar
            __props__['button_field'] = button_field
            __props__['groups'] = groups
            __props__['hide_ios'] = hide_ios
            __props__['hide_web'] = hide_web
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            __props__['password_field'] = password_field
            __props__['preconfigured_app'] = preconfigured_app
            __props__['status'] = status
            __props__['url'] = url
            __props__['url_regex'] = url_regex
            __props__['user_name_template'] = user_name_template
            __props__['user_name_template_suffix'] = user_name_template_suffix
            __props__['user_name_template_type'] = user_name_template_type
            __props__['username_field'] = username_field
            __props__['users'] = users
            __props__['name'] = None
            __props__['sign_on_mode'] = None
        super(Swa, __self__).__init__(
            'okta:app/swa:Swa',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accessibility_error_redirect_url: Optional[pulumi.Input[str]] = None,
            accessibility_self_service: Optional[pulumi.Input[bool]] = None,
            auto_submit_toolbar: Optional[pulumi.Input[bool]] = None,
            button_field: Optional[pulumi.Input[str]] = None,
            groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            hide_ios: Optional[pulumi.Input[bool]] = None,
            hide_web: Optional[pulumi.Input[bool]] = None,
            label: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password_field: Optional[pulumi.Input[str]] = None,
            preconfigured_app: Optional[pulumi.Input[str]] = None,
            sign_on_mode: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            url_regex: Optional[pulumi.Input[str]] = None,
            user_name_template: Optional[pulumi.Input[str]] = None,
            user_name_template_suffix: Optional[pulumi.Input[str]] = None,
            user_name_template_type: Optional[pulumi.Input[str]] = None,
            username_field: Optional[pulumi.Input[str]] = None,
            users: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwaUserArgs']]]]] = None) -> 'Swa':
        """
        Get an existing Swa resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessibility_error_redirect_url: Custom error page URL.
        :param pulumi.Input[bool] accessibility_self_service: Enable self-service. By default, it is `false`.
        :param pulumi.Input[bool] auto_submit_toolbar: Display auto submit toolbar.
        :param pulumi.Input[str] button_field: Login button field.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Groups associated with the application. See `app.GroupAssignment` for a more flexible approach.
        :param pulumi.Input[bool] hide_ios: Do not display application icon on mobile app.
        :param pulumi.Input[bool] hide_web: Do not display application icon to users.
        :param pulumi.Input[str] label: The display name of the Application.
        :param pulumi.Input[str] name: Name assigned to the application by Okta.
        :param pulumi.Input[str] password_field: Login password field.
        :param pulumi.Input[str] preconfigured_app: name of application from the Okta Integration Network, if not included a custom app will be created.
        :param pulumi.Input[str] sign_on_mode: Sign-on mode of application.
        :param pulumi.Input[str] status: Status of application. By default, it is `"ACTIVE"`.
        :param pulumi.Input[str] url: Login URL.
        :param pulumi.Input[str] url_regex: A regex that further restricts URL to the specified regex.
        :param pulumi.Input[str] user_name_template: The default username assigned to each user.
        :param pulumi.Input[str] user_name_template_suffix: Username template suffix
        :param pulumi.Input[str] user_name_template_type: The Username template type.
        :param pulumi.Input[str] username_field: Login username field.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwaUserArgs']]]] users: The users assigned to the application. See `app.User` for a more flexible approach.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["accessibility_error_redirect_url"] = accessibility_error_redirect_url
        __props__["accessibility_self_service"] = accessibility_self_service
        __props__["auto_submit_toolbar"] = auto_submit_toolbar
        __props__["button_field"] = button_field
        __props__["groups"] = groups
        __props__["hide_ios"] = hide_ios
        __props__["hide_web"] = hide_web
        __props__["label"] = label
        __props__["name"] = name
        __props__["password_field"] = password_field
        __props__["preconfigured_app"] = preconfigured_app
        __props__["sign_on_mode"] = sign_on_mode
        __props__["status"] = status
        __props__["url"] = url
        __props__["url_regex"] = url_regex
        __props__["user_name_template"] = user_name_template
        __props__["user_name_template_suffix"] = user_name_template_suffix
        __props__["user_name_template_type"] = user_name_template_type
        __props__["username_field"] = username_field
        __props__["users"] = users
        return Swa(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessibilityErrorRedirectUrl")
    def accessibility_error_redirect_url(self) -> pulumi.Output[Optional[str]]:
        """
        Custom error page URL.
        """
        return pulumi.get(self, "accessibility_error_redirect_url")

    @property
    @pulumi.getter(name="accessibilitySelfService")
    def accessibility_self_service(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable self-service. By default, it is `false`.
        """
        return pulumi.get(self, "accessibility_self_service")

    @property
    @pulumi.getter(name="autoSubmitToolbar")
    def auto_submit_toolbar(self) -> pulumi.Output[Optional[bool]]:
        """
        Display auto submit toolbar.
        """
        return pulumi.get(self, "auto_submit_toolbar")

    @property
    @pulumi.getter(name="buttonField")
    def button_field(self) -> pulumi.Output[Optional[str]]:
        """
        Login button field.
        """
        return pulumi.get(self, "button_field")

    @property
    @pulumi.getter
    def groups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Groups associated with the application. See `app.GroupAssignment` for a more flexible approach.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter(name="hideIos")
    def hide_ios(self) -> pulumi.Output[Optional[bool]]:
        """
        Do not display application icon on mobile app.
        """
        return pulumi.get(self, "hide_ios")

    @property
    @pulumi.getter(name="hideWeb")
    def hide_web(self) -> pulumi.Output[Optional[bool]]:
        """
        Do not display application icon to users.
        """
        return pulumi.get(self, "hide_web")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The display name of the Application.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name assigned to the application by Okta.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="passwordField")
    def password_field(self) -> pulumi.Output[Optional[str]]:
        """
        Login password field.
        """
        return pulumi.get(self, "password_field")

    @property
    @pulumi.getter(name="preconfiguredApp")
    def preconfigured_app(self) -> pulumi.Output[Optional[str]]:
        """
        name of application from the Okta Integration Network, if not included a custom app will be created.
        """
        return pulumi.get(self, "preconfigured_app")

    @property
    @pulumi.getter(name="signOnMode")
    def sign_on_mode(self) -> pulumi.Output[str]:
        """
        Sign-on mode of application.
        """
        return pulumi.get(self, "sign_on_mode")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        Status of application. By default, it is `"ACTIVE"`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        Login URL.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="urlRegex")
    def url_regex(self) -> pulumi.Output[Optional[str]]:
        """
        A regex that further restricts URL to the specified regex.
        """
        return pulumi.get(self, "url_regex")

    @property
    @pulumi.getter(name="userNameTemplate")
    def user_name_template(self) -> pulumi.Output[Optional[str]]:
        """
        The default username assigned to each user.
        """
        return pulumi.get(self, "user_name_template")

    @property
    @pulumi.getter(name="userNameTemplateSuffix")
    def user_name_template_suffix(self) -> pulumi.Output[Optional[str]]:
        """
        Username template suffix
        """
        return pulumi.get(self, "user_name_template_suffix")

    @property
    @pulumi.getter(name="userNameTemplateType")
    def user_name_template_type(self) -> pulumi.Output[Optional[str]]:
        """
        The Username template type.
        """
        return pulumi.get(self, "user_name_template_type")

    @property
    @pulumi.getter(name="usernameField")
    def username_field(self) -> pulumi.Output[Optional[str]]:
        """
        Login username field.
        """
        return pulumi.get(self, "username_field")

    @property
    @pulumi.getter
    def users(self) -> pulumi.Output[Optional[Sequence['outputs.SwaUser']]]:
        """
        The users assigned to the application. See `app.User` for a more flexible approach.
        """
        return pulumi.get(self, "users")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

