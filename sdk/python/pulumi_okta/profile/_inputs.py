# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'MappingMappingArgs',
]

@pulumi.input_type
class MappingMappingArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 id: pulumi.Input[str],
                 push_status: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] expression: Combination or single source properties that will be mapped to the target property.
        :param pulumi.Input[str] id: Key of mapping.
        :param pulumi.Input[str] push_status: Whether to update target properties on user create & update or just on create.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "id", id)
        if push_status is not None:
            pulumi.set(__self__, "push_status", push_status)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        Combination or single source properties that will be mapped to the target property.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def id(self) -> pulumi.Input[str]:
        """
        Key of mapping.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[str]):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter(name="pushStatus")
    def push_status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to update target properties on user create & update or just on create.
        """
        return pulumi.get(self, "push_status")

    @push_status.setter
    def push_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "push_status", value)


