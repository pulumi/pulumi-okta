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

__all__ = ['TrustedServerArgs', 'TrustedServer']

@pulumi.input_type
class TrustedServerArgs:
    def __init__(__self__, *,
                 auth_server_id: pulumi.Input[str],
                 trusteds: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a TrustedServer resource.
        :param pulumi.Input[str] auth_server_id: Authorization server ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] trusteds: A list of the authorization server IDs user want to trust
        """
        pulumi.set(__self__, "auth_server_id", auth_server_id)
        pulumi.set(__self__, "trusteds", trusteds)

    @property
    @pulumi.getter(name="authServerId")
    def auth_server_id(self) -> pulumi.Input[str]:
        """
        Authorization server ID
        """
        return pulumi.get(self, "auth_server_id")

    @auth_server_id.setter
    def auth_server_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_server_id", value)

    @property
    @pulumi.getter
    def trusteds(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of the authorization server IDs user want to trust
        """
        return pulumi.get(self, "trusteds")

    @trusteds.setter
    def trusteds(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "trusteds", value)


@pulumi.input_type
class _TrustedServerState:
    def __init__(__self__, *,
                 auth_server_id: Optional[pulumi.Input[str]] = None,
                 trusteds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering TrustedServer resources.
        :param pulumi.Input[str] auth_server_id: Authorization server ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] trusteds: A list of the authorization server IDs user want to trust
        """
        if auth_server_id is not None:
            pulumi.set(__self__, "auth_server_id", auth_server_id)
        if trusteds is not None:
            pulumi.set(__self__, "trusteds", trusteds)

    @property
    @pulumi.getter(name="authServerId")
    def auth_server_id(self) -> Optional[pulumi.Input[str]]:
        """
        Authorization server ID
        """
        return pulumi.get(self, "auth_server_id")

    @auth_server_id.setter
    def auth_server_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_server_id", value)

    @property
    @pulumi.getter
    def trusteds(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the authorization server IDs user want to trust
        """
        return pulumi.get(self, "trusteds")

    @trusteds.setter
    def trusteds(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "trusteds", value)


class TrustedServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_server_id: Optional[pulumi.Input[str]] = None,
                 trusteds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Associated (Trusted) authorization servers allow you to designate a trusted authorization server that you associate with another authorization server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        test1 = okta.auth.Server("test1",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        test2 = okta.auth.Server("test2",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        test3 = okta.auth.Server("test3",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        example = okta.TrustedServer("example",
            auth_server_id=okta_auth_server["test1"]["id"],
            trusteds=[
                okta_auth_server["test2"]["id"],
                okta_auth_server["test3"]["id"],
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_server_id: Authorization server ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] trusteds: A list of the authorization server IDs user want to trust
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TrustedServerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associated (Trusted) authorization servers allow you to designate a trusted authorization server that you associate with another authorization server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        test1 = okta.auth.Server("test1",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        test2 = okta.auth.Server("test2",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        test3 = okta.auth.Server("test3",
            audiences=["whatever.rise.zone"],
            credentials_rotation_mode="AUTO",
            description="The best way to find out if you can trust somebody is to trust them.",
            name="testAcc-replace_with_uuid")
        example = okta.TrustedServer("example",
            auth_server_id=okta_auth_server["test1"]["id"],
            trusteds=[
                okta_auth_server["test2"]["id"],
                okta_auth_server["test3"]["id"],
            ])
        ```

        :param str resource_name: The name of the resource.
        :param TrustedServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrustedServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_server_id: Optional[pulumi.Input[str]] = None,
                 trusteds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrustedServerArgs.__new__(TrustedServerArgs)

            if auth_server_id is None and not opts.urn:
                raise TypeError("Missing required property 'auth_server_id'")
            __props__.__dict__["auth_server_id"] = auth_server_id
            if trusteds is None and not opts.urn:
                raise TypeError("Missing required property 'trusteds'")
            __props__.__dict__["trusteds"] = trusteds
        super(TrustedServer, __self__).__init__(
            'okta:index/trustedServer:TrustedServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth_server_id: Optional[pulumi.Input[str]] = None,
            trusteds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'TrustedServer':
        """
        Get an existing TrustedServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_server_id: Authorization server ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] trusteds: A list of the authorization server IDs user want to trust
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrustedServerState.__new__(_TrustedServerState)

        __props__.__dict__["auth_server_id"] = auth_server_id
        __props__.__dict__["trusteds"] = trusteds
        return TrustedServer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authServerId")
    def auth_server_id(self) -> pulumi.Output[str]:
        """
        Authorization server ID
        """
        return pulumi.get(self, "auth_server_id")

    @property
    @pulumi.getter
    def trusteds(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of the authorization server IDs user want to trust
        """
        return pulumi.get(self, "trusteds")
