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
    'GetDefaultPolicyResult',
    'AwaitableGetDefaultPolicyResult',
    'get_default_policy',
    'get_default_policy_output',
]

@pulumi.output_type
class GetDefaultPolicyResult:
    """
    A collection of values returned by getDefaultPolicy.
    """
    def __init__(__self__, id=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
        """
        return pulumi.get(self, "type")


class AwaitableGetDefaultPolicyResult(GetDefaultPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDefaultPolicyResult(
            id=self.id,
            type=self.type)


def get_default_policy(type: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDefaultPolicyResult:
    """
    Use this data source to retrieve a default policy from Okta. This
    same thing can be achieved using the `policy_get_policy` with default
    names, this is simply a shortcut.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    example = okta.policy.get_default_policy(type="PASSWORD")
    ```


    :param _builtins.str type: Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
    """
    __args__ = dict()
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('okta:policy/getDefaultPolicy:getDefaultPolicy', __args__, opts=opts, typ=GetDefaultPolicyResult).value

    return AwaitableGetDefaultPolicyResult(
        id=pulumi.get(__ret__, 'id'),
        type=pulumi.get(__ret__, 'type'))
def get_default_policy_output(type: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDefaultPolicyResult]:
    """
    Use this data source to retrieve a default policy from Okta. This
    same thing can be achieved using the `policy_get_policy` with default
    names, this is simply a shortcut.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    example = okta.policy.get_default_policy(type="PASSWORD")
    ```


    :param _builtins.str type: Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
    """
    __args__ = dict()
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('okta:policy/getDefaultPolicy:getDefaultPolicy', __args__, opts=opts, typ=GetDefaultPolicyResult)
    return __ret__.apply(lambda __response__: GetDefaultPolicyResult(
        id=pulumi.get(__response__, 'id'),
        type=pulumi.get(__response__, 'type')))
