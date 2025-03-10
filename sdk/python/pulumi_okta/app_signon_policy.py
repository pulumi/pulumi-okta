# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['AppSignonPolicyArgs', 'AppSignonPolicy']

@pulumi.input_type
class AppSignonPolicyArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 catch_all: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AppSignonPolicy resource.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[bool] catch_all: If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        :param pulumi.Input[str] name: Name of the policy.
        """
        pulumi.set(__self__, "description", description)
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input[bool]]:
        """
        If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AppSignonPolicyState:
    def __init__(__self__, *,
                 catch_all: Optional[pulumi.Input[bool]] = None,
                 default_rule_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AppSignonPolicy resources.
        :param pulumi.Input[bool] catch_all: If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        :param pulumi.Input[str] default_rule_id: Default rule (system=true) id of the policy
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        """
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if default_rule_id is not None:
            pulumi.set(__self__, "default_rule_id", default_rule_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input[bool]]:
        """
        If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="defaultRuleId")
    def default_rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        Default rule (system=true) id of the policy
        """
        return pulumi.get(self, "default_rule_id")

    @default_rule_id.setter
    def default_rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_rule_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class AppSignonPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import okta:index/appSignonPolicy:AppSignonPolicy example <policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] catch_all: If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSignonPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import okta:index/appSignonPolicy:AppSignonPolicy example <policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param AppSignonPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSignonPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSignonPolicyArgs.__new__(AppSignonPolicyArgs)

            __props__.__dict__["catch_all"] = catch_all
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["default_rule_id"] = None
        super(AppSignonPolicy, __self__).__init__(
            'okta:index/appSignonPolicy:AppSignonPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catch_all: Optional[pulumi.Input[bool]] = None,
            default_rule_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'AppSignonPolicy':
        """
        Get an existing AppSignonPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] catch_all: If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        :param pulumi.Input[str] default_rule_id: Default rule (system=true) id of the policy
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSignonPolicyState.__new__(_AppSignonPolicyState)

        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["default_rule_id"] = default_rule_id
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        return AppSignonPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output[bool]:
        """
        If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule's default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="defaultRuleId")
    def default_rule_id(self) -> pulumi.Output[str]:
        """
        Default rule (system=true) id of the policy
        """
        return pulumi.get(self, "default_rule_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

