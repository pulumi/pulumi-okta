# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'AuthLoginAppUser',
    'BookmarkAppUser',
    'MfaPolicyDuo',
    'MfaPolicyFidoU2f',
    'MfaPolicyFidoWebauthn',
    'MfaPolicyGoogleOtp',
    'MfaPolicyOktaCall',
    'MfaPolicyOktaOtp',
    'MfaPolicyOktaPassword',
    'MfaPolicyOktaPush',
    'MfaPolicyOktaQuestion',
    'MfaPolicyOktaSms',
    'MfaPolicyRsaToken',
    'MfaPolicySymantecVip',
    'MfaPolicyYubikeyToken',
    'OauthAppUser',
    'SamlAppAttributeStatement',
    'SamlAppUser',
    'SecurePasswordStoreAppUser',
    'SwaAppUser',
    'ThreeFieldAppUser',
]

@pulumi.output_type
class AuthLoginAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class BookmarkAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyDuo(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyFidoU2f(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyFidoWebauthn(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyGoogleOtp(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaCall(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaOtp(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaPassword(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaPush(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaQuestion(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyOktaSms(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyRsaToken(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicySymantecVip(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MfaPolicyYubikeyToken(dict):
    def __init__(__self__, *,
                 consent_type: Optional[str] = None,
                 enroll: Optional[str] = None):
        if consent_type is not None:
            pulumi.set(__self__, "consent_type", consent_type)
        if enroll is not None:
            pulumi.set(__self__, "enroll", enroll)

    @property
    @pulumi.getter(name="consentType")
    def consent_type(self) -> Optional[str]:
        return pulumi.get(self, "consent_type")

    @property
    @pulumi.getter
    def enroll(self) -> Optional[str]:
        return pulumi.get(self, "enroll")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OauthAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SamlAppAttributeStatement(dict):
    def __init__(__self__, *,
                 name: str,
                 filter_type: Optional[str] = None,
                 filter_value: Optional[str] = None,
                 namespace: Optional[str] = None,
                 type: Optional[str] = None,
                 values: Optional[List[str]] = None):
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
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="filterType")
    def filter_type(self) -> Optional[str]:
        return pulumi.get(self, "filter_type")

    @property
    @pulumi.getter(name="filterValue")
    def filter_value(self) -> Optional[str]:
        return pulumi.get(self, "filter_value")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> Optional[List[str]]:
        return pulumi.get(self, "values")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SamlAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SecurePasswordStoreAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SwaAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ThreeFieldAppUser(dict):
    def __init__(__self__, *,
                 id: Optional[str] = None,
                 password: Optional[str] = None,
                 scope: Optional[str] = None,
                 username: Optional[str] = None):
        if id is not None:
            pulumi.set(__self__, "id", id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

