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

__all__ = [
    'GetAppGroupAssignmentsResult',
    'AwaitableGetAppGroupAssignmentsResult',
    'get_app_group_assignments',
    'get_app_group_assignments_output',
]

@pulumi.output_type
class GetAppGroupAssignmentsResult:
    """
    A collection of values returned by getAppGroupAssignments.
    """
    def __init__(__self__, groups=None, id=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter
    def groups(self) -> Sequence[_builtins.str]:
        """
        List of groups IDs assigned to the app
        """
        return pulumi.get(self, "groups")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        ID of the Okta App being queried for groups
        """
        return pulumi.get(self, "id")


class AwaitableGetAppGroupAssignmentsResult(GetAppGroupAssignmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppGroupAssignmentsResult(
            groups=self.groups,
            id=self.id)


def get_app_group_assignments(id: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppGroupAssignmentsResult:
    """
    Get a set of groups assigned to an Okta application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    test = okta.get_app_group_assignments(id=test_okta_app_oauth["id"])
    ```


    :param _builtins.str id: ID of the Okta App being queried for groups
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('okta:index/getAppGroupAssignments:getAppGroupAssignments', __args__, opts=opts, typ=GetAppGroupAssignmentsResult).value

    return AwaitableGetAppGroupAssignmentsResult(
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'))
def get_app_group_assignments_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppGroupAssignmentsResult]:
    """
    Get a set of groups assigned to an Okta application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    test = okta.get_app_group_assignments(id=test_okta_app_oauth["id"])
    ```


    :param _builtins.str id: ID of the Okta App being queried for groups
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('okta:index/getAppGroupAssignments:getAppGroupAssignments', __args__, opts=opts, typ=GetAppGroupAssignmentsResult)
    return __ret__.apply(lambda __response__: GetAppGroupAssignmentsResult(
        groups=pulumi.get(__response__, 'groups'),
        id=pulumi.get(__response__, 'id')))
