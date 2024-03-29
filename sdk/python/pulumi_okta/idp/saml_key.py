# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SamlKeyArgs', 'SamlKey']

@pulumi.input_type
class SamlKeyArgs:
    def __init__(__self__, *,
                 x5cs: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a SamlKey resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] x5cs: base64-encoded X.509 certificate chain with DER encoding.
        """
        pulumi.set(__self__, "x5cs", x5cs)

    @property
    @pulumi.getter
    def x5cs(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        base64-encoded X.509 certificate chain with DER encoding.
        """
        return pulumi.get(self, "x5cs")

    @x5cs.setter
    def x5cs(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "x5cs", value)


@pulumi.input_type
class _SamlKeyState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 kid: Optional[pulumi.Input[str]] = None,
                 kty: Optional[pulumi.Input[str]] = None,
                 use: Optional[pulumi.Input[str]] = None,
                 x5cs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 x5t_s256: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SamlKey resources.
        :param pulumi.Input[str] created: Date created.
        :param pulumi.Input[str] expires_at: Date the cert expires.
        :param pulumi.Input[str] kid: Key ID.
        :param pulumi.Input[str] kty: Identifies the cryptographic algorithm family used with the key.
        :param pulumi.Input[str] use: Intended use of the public key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] x5cs: base64-encoded X.509 certificate chain with DER encoding.
        :param pulumi.Input[str] x5t_s256: base64url-encoded SHA-256 thumbprint of the DER encoding of an X.509 certificate.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if kid is not None:
            pulumi.set(__self__, "kid", kid)
        if kty is not None:
            pulumi.set(__self__, "kty", kty)
        if use is not None:
            pulumi.set(__self__, "use", use)
        if x5cs is not None:
            pulumi.set(__self__, "x5cs", x5cs)
        if x5t_s256 is not None:
            pulumi.set(__self__, "x5t_s256", x5t_s256)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        Date created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        Date the cert expires.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter
    def kid(self) -> Optional[pulumi.Input[str]]:
        """
        Key ID.
        """
        return pulumi.get(self, "kid")

    @kid.setter
    def kid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kid", value)

    @property
    @pulumi.getter
    def kty(self) -> Optional[pulumi.Input[str]]:
        """
        Identifies the cryptographic algorithm family used with the key.
        """
        return pulumi.get(self, "kty")

    @kty.setter
    def kty(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kty", value)

    @property
    @pulumi.getter
    def use(self) -> Optional[pulumi.Input[str]]:
        """
        Intended use of the public key.
        """
        return pulumi.get(self, "use")

    @use.setter
    def use(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "use", value)

    @property
    @pulumi.getter
    def x5cs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        base64-encoded X.509 certificate chain with DER encoding.
        """
        return pulumi.get(self, "x5cs")

    @x5cs.setter
    def x5cs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "x5cs", value)

    @property
    @pulumi.getter(name="x5tS256")
    def x5t_s256(self) -> Optional[pulumi.Input[str]]:
        """
        base64url-encoded SHA-256 thumbprint of the DER encoding of an X.509 certificate.
        """
        return pulumi.get(self, "x5t_s256")

    @x5t_s256.setter
    def x5t_s256(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "x5t_s256", value)


class SamlKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 x5cs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        A SAML IdP Signing Key can be imported via the key id.

        ```sh
        $ pulumi import okta:idp/samlKey:SamlKey example &#60;key id&#62;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] x5cs: base64-encoded X.509 certificate chain with DER encoding.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SamlKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        A SAML IdP Signing Key can be imported via the key id.

        ```sh
        $ pulumi import okta:idp/samlKey:SamlKey example &#60;key id&#62;
        ```

        :param str resource_name: The name of the resource.
        :param SamlKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SamlKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 x5cs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SamlKeyArgs.__new__(SamlKeyArgs)

            if x5cs is None and not opts.urn:
                raise TypeError("Missing required property 'x5cs'")
            __props__.__dict__["x5cs"] = x5cs
            __props__.__dict__["created"] = None
            __props__.__dict__["expires_at"] = None
            __props__.__dict__["kid"] = None
            __props__.__dict__["kty"] = None
            __props__.__dict__["use"] = None
            __props__.__dict__["x5t_s256"] = None
        super(SamlKey, __self__).__init__(
            'okta:idp/samlKey:SamlKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            kid: Optional[pulumi.Input[str]] = None,
            kty: Optional[pulumi.Input[str]] = None,
            use: Optional[pulumi.Input[str]] = None,
            x5cs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            x5t_s256: Optional[pulumi.Input[str]] = None) -> 'SamlKey':
        """
        Get an existing SamlKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: Date created.
        :param pulumi.Input[str] expires_at: Date the cert expires.
        :param pulumi.Input[str] kid: Key ID.
        :param pulumi.Input[str] kty: Identifies the cryptographic algorithm family used with the key.
        :param pulumi.Input[str] use: Intended use of the public key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] x5cs: base64-encoded X.509 certificate chain with DER encoding.
        :param pulumi.Input[str] x5t_s256: base64url-encoded SHA-256 thumbprint of the DER encoding of an X.509 certificate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SamlKeyState.__new__(_SamlKeyState)

        __props__.__dict__["created"] = created
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["kid"] = kid
        __props__.__dict__["kty"] = kty
        __props__.__dict__["use"] = use
        __props__.__dict__["x5cs"] = x5cs
        __props__.__dict__["x5t_s256"] = x5t_s256
        return SamlKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        Date created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[str]:
        """
        Date the cert expires.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter
    def kid(self) -> pulumi.Output[str]:
        """
        Key ID.
        """
        return pulumi.get(self, "kid")

    @property
    @pulumi.getter
    def kty(self) -> pulumi.Output[str]:
        """
        Identifies the cryptographic algorithm family used with the key.
        """
        return pulumi.get(self, "kty")

    @property
    @pulumi.getter
    def use(self) -> pulumi.Output[str]:
        """
        Intended use of the public key.
        """
        return pulumi.get(self, "use")

    @property
    @pulumi.getter
    def x5cs(self) -> pulumi.Output[Sequence[str]]:
        """
        base64-encoded X.509 certificate chain with DER encoding.
        """
        return pulumi.get(self, "x5cs")

    @property
    @pulumi.getter(name="x5tS256")
    def x5t_s256(self) -> pulumi.Output[str]:
        """
        base64url-encoded SHA-256 thumbprint of the DER encoding of an X.509 certificate.
        """
        return pulumi.get(self, "x5t_s256")

