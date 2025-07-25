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

__all__ = [
    'GetServerScopesScopeResult',
]

@pulumi.output_type
class GetServerScopesScopeResult(dict):
    def __init__(__self__, *,
                 consent: _builtins.str,
                 default: _builtins.bool,
                 description: _builtins.str,
                 display_name: _builtins.str,
                 id: _builtins.str,
                 metadata_publish: _builtins.str,
                 name: _builtins.str,
                 optional: _builtins.bool,
                 system: _builtins.bool):
        """
        :param _builtins.str consent: Indicates whether a consent dialog is needed for the Scope
        :param _builtins.bool default: Whether the Scope is a default Scope
        :param _builtins.str description: Description of the Scope
        :param _builtins.str display_name: Name of the end user displayed in a consent dialog box
        :param _builtins.str id: ID of the Scope
        :param _builtins.str metadata_publish: Whether the Scope should be included in the metadata
        :param _builtins.str name: Name of the Scope
        :param _builtins.bool optional: Whether the Scope is optional
        :param _builtins.bool system: Whether Okta created the Scope
        """
        pulumi.set(__self__, "consent", consent)
        pulumi.set(__self__, "default", default)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "metadata_publish", metadata_publish)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "optional", optional)
        pulumi.set(__self__, "system", system)

    @_builtins.property
    @pulumi.getter
    def consent(self) -> _builtins.str:
        """
        Indicates whether a consent dialog is needed for the Scope
        """
        return pulumi.get(self, "consent")

    @_builtins.property
    @pulumi.getter
    def default(self) -> _builtins.bool:
        """
        Whether the Scope is a default Scope
        """
        return pulumi.get(self, "default")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of the Scope
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        """
        Name of the end user displayed in a consent dialog box
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        ID of the Scope
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="metadataPublish")
    def metadata_publish(self) -> _builtins.str:
        """
        Whether the Scope should be included in the metadata
        """
        return pulumi.get(self, "metadata_publish")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the Scope
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def optional(self) -> _builtins.bool:
        """
        Whether the Scope is optional
        """
        return pulumi.get(self, "optional")

    @_builtins.property
    @pulumi.getter
    def system(self) -> _builtins.bool:
        """
        Whether Okta created the Scope
        """
        return pulumi.get(self, "system")


