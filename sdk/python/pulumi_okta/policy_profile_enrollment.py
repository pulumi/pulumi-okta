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

__all__ = ['PolicyProfileEnrollmentArgs', 'PolicyProfileEnrollment']

@pulumi.input_type
class PolicyProfileEnrollmentArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PolicyProfileEnrollment resource.
        :param pulumi.Input[_builtins.str] name: Name of the policy
        :param pulumi.Input[_builtins.str] status: Status of the policy
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the policy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Status of the policy
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _PolicyProfileEnrollmentState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PolicyProfileEnrollment resources.
        :param pulumi.Input[_builtins.str] name: Name of the policy
        :param pulumi.Input[_builtins.str] status: Status of the policy
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the policy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Status of the policy
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("okta:index/policyProfileEnrollment:PolicyProfileEnrollment")
class PolicyProfileEnrollment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Creates a Profile Enrollment Policy

        > **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
        This resource allows you to create and configure a Profile Enrollment Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.PolicyProfileEnrollment("example",
            name="example",
            status="ACTIVE")
        ```

        ## Import

        ```sh
        $ pulumi import okta:index/policyProfileEnrollment:PolicyProfileEnrollment example <policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Name of the policy
        :param pulumi.Input[_builtins.str] status: Status of the policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PolicyProfileEnrollmentArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Profile Enrollment Policy

        > **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
        This resource allows you to create and configure a Profile Enrollment Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.PolicyProfileEnrollment("example",
            name="example",
            status="ACTIVE")
        ```

        ## Import

        ```sh
        $ pulumi import okta:index/policyProfileEnrollment:PolicyProfileEnrollment example <policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param PolicyProfileEnrollmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyProfileEnrollmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyProfileEnrollmentArgs.__new__(PolicyProfileEnrollmentArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["status"] = status
        super(PolicyProfileEnrollment, __self__).__init__(
            'okta:index/policyProfileEnrollment:PolicyProfileEnrollment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'PolicyProfileEnrollment':
        """
        Get an existing PolicyProfileEnrollment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Name of the policy
        :param pulumi.Input[_builtins.str] status: Status of the policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyProfileEnrollmentState.__new__(_PolicyProfileEnrollmentState)

        __props__.__dict__["name"] = name
        __props__.__dict__["status"] = status
        return PolicyProfileEnrollment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the policy
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Status of the policy
        """
        return pulumi.get(self, "status")

