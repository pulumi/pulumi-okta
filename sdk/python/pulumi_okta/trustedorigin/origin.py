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
from .. import _utilities

__all__ = ['OriginArgs', 'Origin']

@pulumi.input_type
class OriginArgs:
    def __init__(__self__, *,
                 origin: pulumi.Input[_builtins.str],
                 scopes: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Origin resource.
        :param pulumi.Input[_builtins.str] origin: Unique origin URL for this trusted origin
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        :param pulumi.Input[_builtins.bool] active: Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        :param pulumi.Input[_builtins.str] name: Unique name for this trusted origin
        """
        pulumi.set(__self__, "origin", origin)
        pulumi.set(__self__, "scopes", scopes)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Input[_builtins.str]:
        """
        Unique origin URL for this trusted origin
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "scopes", value)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique name for this trusted origin
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _OriginState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Origin resources.
        :param pulumi.Input[_builtins.bool] active: Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        :param pulumi.Input[_builtins.str] name: Unique name for this trusted origin
        :param pulumi.Input[_builtins.str] origin: Unique origin URL for this trusted origin
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique name for this trusted origin
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique origin URL for this trusted origin
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "scopes", value)


@pulumi.type_token("okta:trustedorigin/origin:Origin")
class Origin(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Creates a Trusted Origin. This resource allows you to create and configure a Trusted Origin.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.trustedorigin.Origin("example",
            name="example",
            origin="https://example.com",
            scopes=["CORS"])
        ```

        ## Import

        ```sh
        $ pulumi import okta:trustedorigin/origin:Origin example <trusted_origin_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        :param pulumi.Input[_builtins.str] name: Unique name for this trusted origin
        :param pulumi.Input[_builtins.str] origin: Unique origin URL for this trusted origin
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OriginArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Trusted Origin. This resource allows you to create and configure a Trusted Origin.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.trustedorigin.Origin("example",
            name="example",
            origin="https://example.com",
            scopes=["CORS"])
        ```

        ## Import

        ```sh
        $ pulumi import okta:trustedorigin/origin:Origin example <trusted_origin_id>
        ```

        :param str resource_name: The name of the resource.
        :param OriginArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OriginArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OriginArgs.__new__(OriginArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["name"] = name
            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
        super(Origin, __self__).__init__(
            'okta:trustedorigin/origin:Origin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            origin: Optional[pulumi.Input[_builtins.str]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'Origin':
        """
        Get an existing Origin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        :param pulumi.Input[_builtins.str] name: Unique name for this trusted origin
        :param pulumi.Input[_builtins.str] origin: Unique origin URL for this trusted origin
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] scopes: Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OriginState.__new__(_OriginState)

        __props__.__dict__["active"] = active
        __props__.__dict__["name"] = name
        __props__.__dict__["origin"] = origin
        __props__.__dict__["scopes"] = scopes
        return Origin(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether the Trusted Origin is active or not - can only be issued post-creation. By default, it is `true`.
        """
        return pulumi.get(self, "active")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Unique name for this trusted origin
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Output[_builtins.str]:
        """
        Unique origin URL for this trusted origin
        """
        return pulumi.get(self, "origin")

    @_builtins.property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Scopes of the Trusted Origin - can either be `CORS` and/or `REDIRECT`
        """
        return pulumi.get(self, "scopes")

