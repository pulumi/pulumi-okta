# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RoleSubscriptionArgs', 'RoleSubscription']

@pulumi.input_type
class RoleSubscriptionArgs:
    def __init__(__self__, *,
                 notification_type: pulumi.Input[str],
                 role_type: pulumi.Input[str],
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RoleSubscription resource.
        :param pulumi.Input[str] notification_type: Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
               `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
               `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        :param pulumi.Input[str] role_type: Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
               `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
               `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[str] status: Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        pulumi.set(__self__, "notification_type", notification_type)
        pulumi.set(__self__, "role_type", role_type)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Input[str]:
        """
        Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
        `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
        `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "notification_type", value)

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Input[str]:
        """
        Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
        `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
        `"GROUP_MEMBERSHIP_ADMIN"`.
        """
        return pulumi.get(self, "role_type")

    @role_type.setter
    def role_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _RoleSubscriptionState:
    def __init__(__self__, *,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 role_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RoleSubscription resources.
        :param pulumi.Input[str] notification_type: Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
               `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
               `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        :param pulumi.Input[str] role_type: Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
               `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
               `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[str] status: Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        if notification_type is not None:
            pulumi.set(__self__, "notification_type", notification_type)
        if role_type is not None:
            pulumi.set(__self__, "role_type", role_type)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
        `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
        `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_type", value)

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
        `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
        `"GROUP_MEMBERSHIP_ADMIN"`.
        """
        return pulumi.get(self, "role_type")

    @role_type.setter
    def role_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class RoleSubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 role_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to configure subscriptions of a Role with a specific type.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        test = okta.RoleSubscription("test",
            notification_type="APP_IMPORT",
            role_type="SUPER_ADMIN",
            status="unsubscribed")
        ```

        ## Import

        A role subscription can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:index/roleSubscription:RoleSubscription example <role_type>/<notification_type>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] notification_type: Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
               `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
               `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        :param pulumi.Input[str] role_type: Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
               `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
               `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[str] status: Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleSubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to configure subscriptions of a Role with a specific type.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        test = okta.RoleSubscription("test",
            notification_type="APP_IMPORT",
            role_type="SUPER_ADMIN",
            status="unsubscribed")
        ```

        ## Import

        A role subscription can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:index/roleSubscription:RoleSubscription example <role_type>/<notification_type>
        ```

        :param str resource_name: The name of the resource.
        :param RoleSubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleSubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 role_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleSubscriptionArgs.__new__(RoleSubscriptionArgs)

            if notification_type is None and not opts.urn:
                raise TypeError("Missing required property 'notification_type'")
            __props__.__dict__["notification_type"] = notification_type
            if role_type is None and not opts.urn:
                raise TypeError("Missing required property 'role_type'")
            __props__.__dict__["role_type"] = role_type
            __props__.__dict__["status"] = status
        super(RoleSubscription, __self__).__init__(
            'okta:index/roleSubscription:RoleSubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            notification_type: Optional[pulumi.Input[str]] = None,
            role_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'RoleSubscription':
        """
        Get an existing RoleSubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] notification_type: Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
               `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
               `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        :param pulumi.Input[str] role_type: Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
               `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
               `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[str] status: Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleSubscriptionState.__new__(_RoleSubscriptionState)

        __props__.__dict__["notification_type"] = notification_type
        __props__.__dict__["role_type"] = role_type
        __props__.__dict__["status"] = status
        return RoleSubscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Output[str]:
        """
        Type of the notification. Valid values: `"CONNECTOR_AGENT"`, `"USER_LOCKED_OUT"`,
        `"APP_IMPORT"`, `"LDAP_AGENT"`, `"AD_AGENT"`, `"OKTA_ANNOUNCEMENT"`, `"OKTA_ISSUE"`, `"OKTA_UPDATE"`, `"IWA_AGENT"`,
        `"USER_DEPROVISION"`, `"REPORT_SUSPICIOUS_ACTIVITY"`, `"RATELIMIT_NOTIFICATION"`.
        """
        return pulumi.get(self, "notification_type")

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Output[str]:
        """
        Type of the role. Valid values: `"SUPER_ADMIN"`, `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`,
        `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`, `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`,
        `"GROUP_MEMBERSHIP_ADMIN"`.
        """
        return pulumi.get(self, "role_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        Subscription status. Valid values: `"subscribed"`, `"unsubscribed"`.
        """
        return pulumi.get(self, "status")
