# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
from .. import _utilities

__all__ = [
    'OAuthGroupsClaim',
    'OAuthJwk',
    'SamlAcsEndpointsIndex',
    'SamlAttributeStatement',
    'SamlKey',
    'GetSamlAttributeStatementResult',
]

@pulumi.output_type
class OAuthGroupsClaim(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "filterType":
            suggest = "filter_type"
        elif key == "issuerMode":
            suggest = "issuer_mode"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OAuthGroupsClaim. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OAuthGroupsClaim.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OAuthGroupsClaim.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: builtins.str,
                 type: builtins.str,
                 value: builtins.str,
                 filter_type: Optional[builtins.str] = None,
                 issuer_mode: Optional[builtins.str] = None):
        """
        :param builtins.str name: Name of the claim that will be used in the token.
        :param builtins.str type: Groups claim type.
        :param builtins.str value: Value of the claim. Can be an Okta Expression Language statement that evaluates at the time the token is minted.
        :param builtins.str filter_type: Groups claim filter. Can only be set if type is FILTER.
        :param builtins.str issuer_mode: Issuer mode inherited from OAuth App
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)
        if filter_type is not None:
            pulumi.set(__self__, "filter_type", filter_type)
        if issuer_mode is not None:
            pulumi.set(__self__, "issuer_mode", issuer_mode)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Name of the claim that will be used in the token.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        Groups claim type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> builtins.str:
        """
        Value of the claim. Can be an Okta Expression Language statement that evaluates at the time the token is minted.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="filterType")
    def filter_type(self) -> Optional[builtins.str]:
        """
        Groups claim filter. Can only be set if type is FILTER.
        """
        return pulumi.get(self, "filter_type")

    @property
    @pulumi.getter(name="issuerMode")
    def issuer_mode(self) -> Optional[builtins.str]:
        """
        Issuer mode inherited from OAuth App
        """
        return pulumi.get(self, "issuer_mode")


@pulumi.output_type
class OAuthJwk(dict):
    def __init__(__self__, *,
                 kid: builtins.str,
                 kty: builtins.str,
                 e: Optional[builtins.str] = None,
                 n: Optional[builtins.str] = None,
                 x: Optional[builtins.str] = None,
                 y: Optional[builtins.str] = None):
        """
        :param builtins.str kid: Key ID
        :param builtins.str kty: Key type
        :param builtins.str e: RSA Exponent
        :param builtins.str n: RSA Modulus
        :param builtins.str x: X coordinate of the elliptic curve point
        :param builtins.str y: Y coordinate of the elliptic curve point
        """
        pulumi.set(__self__, "kid", kid)
        pulumi.set(__self__, "kty", kty)
        if e is not None:
            pulumi.set(__self__, "e", e)
        if n is not None:
            pulumi.set(__self__, "n", n)
        if x is not None:
            pulumi.set(__self__, "x", x)
        if y is not None:
            pulumi.set(__self__, "y", y)

    @property
    @pulumi.getter
    def kid(self) -> builtins.str:
        """
        Key ID
        """
        return pulumi.get(self, "kid")

    @property
    @pulumi.getter
    def kty(self) -> builtins.str:
        """
        Key type
        """
        return pulumi.get(self, "kty")

    @property
    @pulumi.getter
    def e(self) -> Optional[builtins.str]:
        """
        RSA Exponent
        """
        return pulumi.get(self, "e")

    @property
    @pulumi.getter
    def n(self) -> Optional[builtins.str]:
        """
        RSA Modulus
        """
        return pulumi.get(self, "n")

    @property
    @pulumi.getter
    def x(self) -> Optional[builtins.str]:
        """
        X coordinate of the elliptic curve point
        """
        return pulumi.get(self, "x")

    @property
    @pulumi.getter
    def y(self) -> Optional[builtins.str]:
        """
        Y coordinate of the elliptic curve point
        """
        return pulumi.get(self, "y")


@pulumi.output_type
class SamlAcsEndpointsIndex(dict):
    def __init__(__self__, *,
                 index: builtins.int,
                 url: builtins.str):
        pulumi.set(__self__, "index", index)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def index(self) -> builtins.int:
        return pulumi.get(self, "index")

    @property
    @pulumi.getter
    def url(self) -> builtins.str:
        return pulumi.get(self, "url")


@pulumi.output_type
class SamlAttributeStatement(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "filterType":
            suggest = "filter_type"
        elif key == "filterValue":
            suggest = "filter_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SamlAttributeStatement. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SamlAttributeStatement.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SamlAttributeStatement.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: builtins.str,
                 filter_type: Optional[builtins.str] = None,
                 filter_value: Optional[builtins.str] = None,
                 namespace: Optional[builtins.str] = None,
                 type: Optional[builtins.str] = None,
                 values: Optional[Sequence[builtins.str]] = None):
        """
        :param builtins.str name: The reference name of the attribute statement
        :param builtins.str filter_type: Type of group attribute filter. Valid values are: `STARTS_WITH`, `EQUALS`, `CONTAINS`, or `REGEX`
        :param builtins.str filter_value: Filter value to use
        :param builtins.str namespace: The attribute namespace. It can be set to `urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified`, `urn:oasis:names:tc:SAML:2.0:attrname-format:uri`, or `urn:oasis:names:tc:SAML:2.0:attrname-format:basic`
        :param builtins.str type: The type of attribute statements object
        """
        pulumi.set(__self__, "name", name)
        if filter_type is not None:
            pulumi.set(__self__, "filter_type", filter_type)
        if filter_value is not None:
            pulumi.set(__self__, "filter_value", filter_value)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The reference name of the attribute statement
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="filterType")
    def filter_type(self) -> Optional[builtins.str]:
        """
        Type of group attribute filter. Valid values are: `STARTS_WITH`, `EQUALS`, `CONTAINS`, or `REGEX`
        """
        return pulumi.get(self, "filter_type")

    @property
    @pulumi.getter(name="filterValue")
    def filter_value(self) -> Optional[builtins.str]:
        """
        Filter value to use
        """
        return pulumi.get(self, "filter_value")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[builtins.str]:
        """
        The attribute namespace. It can be set to `urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified`, `urn:oasis:names:tc:SAML:2.0:attrname-format:uri`, or `urn:oasis:names:tc:SAML:2.0:attrname-format:basic`
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def type(self) -> Optional[builtins.str]:
        """
        The type of attribute statements object
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[builtins.str]]:
        return pulumi.get(self, "values")


@pulumi.output_type
class SamlKey(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "expiresAt":
            suggest = "expires_at"
        elif key == "lastUpdated":
            suggest = "last_updated"
        elif key == "x5tS256":
            suggest = "x5t_s256"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SamlKey. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SamlKey.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SamlKey.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 created: Optional[builtins.str] = None,
                 e: Optional[builtins.str] = None,
                 expires_at: Optional[builtins.str] = None,
                 kid: Optional[builtins.str] = None,
                 kty: Optional[builtins.str] = None,
                 last_updated: Optional[builtins.str] = None,
                 n: Optional[builtins.str] = None,
                 use: Optional[builtins.str] = None,
                 x5cs: Optional[Sequence[builtins.str]] = None,
                 x5t_s256: Optional[builtins.str] = None):
        """
        :param builtins.str created: Created date
        :param builtins.str e: RSA exponent
        :param builtins.str expires_at: Expiration date
        :param builtins.str kid: Key ID
        :param builtins.str kty: Key type. Identifies the cryptographic algorithm family used with the key.
        :param builtins.str last_updated: Last updated date
        :param builtins.str n: RSA modulus
        :param builtins.str use: Intended use of the public key.
        :param Sequence[builtins.str] x5cs: X.509 Certificate Chain
        :param builtins.str x5t_s256: X.509 certificate SHA-256 thumbprint
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if e is not None:
            pulumi.set(__self__, "e", e)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if kid is not None:
            pulumi.set(__self__, "kid", kid)
        if kty is not None:
            pulumi.set(__self__, "kty", kty)
        if last_updated is not None:
            pulumi.set(__self__, "last_updated", last_updated)
        if n is not None:
            pulumi.set(__self__, "n", n)
        if use is not None:
            pulumi.set(__self__, "use", use)
        if x5cs is not None:
            pulumi.set(__self__, "x5cs", x5cs)
        if x5t_s256 is not None:
            pulumi.set(__self__, "x5t_s256", x5t_s256)

    @property
    @pulumi.getter
    def created(self) -> Optional[builtins.str]:
        """
        Created date
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def e(self) -> Optional[builtins.str]:
        """
        RSA exponent
        """
        return pulumi.get(self, "e")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[builtins.str]:
        """
        Expiration date
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter
    def kid(self) -> Optional[builtins.str]:
        """
        Key ID
        """
        return pulumi.get(self, "kid")

    @property
    @pulumi.getter
    def kty(self) -> Optional[builtins.str]:
        """
        Key type. Identifies the cryptographic algorithm family used with the key.
        """
        return pulumi.get(self, "kty")

    @property
    @pulumi.getter(name="lastUpdated")
    def last_updated(self) -> Optional[builtins.str]:
        """
        Last updated date
        """
        return pulumi.get(self, "last_updated")

    @property
    @pulumi.getter
    def n(self) -> Optional[builtins.str]:
        """
        RSA modulus
        """
        return pulumi.get(self, "n")

    @property
    @pulumi.getter
    def use(self) -> Optional[builtins.str]:
        """
        Intended use of the public key.
        """
        return pulumi.get(self, "use")

    @property
    @pulumi.getter
    def x5cs(self) -> Optional[Sequence[builtins.str]]:
        """
        X.509 Certificate Chain
        """
        return pulumi.get(self, "x5cs")

    @property
    @pulumi.getter(name="x5tS256")
    def x5t_s256(self) -> Optional[builtins.str]:
        """
        X.509 certificate SHA-256 thumbprint
        """
        return pulumi.get(self, "x5t_s256")


@pulumi.output_type
class GetSamlAttributeStatementResult(dict):
    def __init__(__self__, *,
                 filter_type: builtins.str,
                 filter_value: builtins.str,
                 name: builtins.str,
                 namespace: builtins.str,
                 type: builtins.str,
                 values: Sequence[builtins.str]):
        """
        :param builtins.str filter_type: Type of group attribute filter
        :param builtins.str filter_value: Filter value to use
        :param builtins.str name: The reference name of the attribute statement
        :param builtins.str namespace: The name format of the attribute
        :param builtins.str type: The type of attribute statements object
        """
        pulumi.set(__self__, "filter_type", filter_type)
        pulumi.set(__self__, "filter_value", filter_value)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter(name="filterType")
    def filter_type(self) -> builtins.str:
        """
        Type of group attribute filter
        """
        return pulumi.get(self, "filter_type")

    @property
    @pulumi.getter(name="filterValue")
    def filter_value(self) -> builtins.str:
        """
        Filter value to use
        """
        return pulumi.get(self, "filter_value")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The reference name of the attribute statement
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> builtins.str:
        """
        The name format of the attribute
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        The type of attribute statements object
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "values")


