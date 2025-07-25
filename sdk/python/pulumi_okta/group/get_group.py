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
    'GetGroupResult',
    'AwaitableGetGroupResult',
    'get_group',
    'get_group_output',
]

@pulumi.output_type
class GetGroupResult:
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, delay_read_seconds=None, description=None, id=None, include_users=None, name=None, type=None, users=None):
        if delay_read_seconds and not isinstance(delay_read_seconds, str):
            raise TypeError("Expected argument 'delay_read_seconds' to be a str")
        pulumi.set(__self__, "delay_read_seconds", delay_read_seconds)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_users and not isinstance(include_users, bool):
            raise TypeError("Expected argument 'include_users' to be a bool")
        pulumi.set(__self__, "include_users", include_users)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @_builtins.property
    @pulumi.getter(name="delayReadSeconds")
    def delay_read_seconds(self) -> Optional[_builtins.str]:
        """
        Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
        """
        return pulumi.get(self, "delay_read_seconds")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of group.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        ID of group.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="includeUsers")
    def include_users(self) -> Optional[_builtins.bool]:
        """
        Fetch group users, having default off cuts down on API calls.
        """
        return pulumi.get(self, "include_users")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of group.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def users(self) -> Sequence[_builtins.str]:
        """
        Users associated with the group. This can also be done per user.
        """
        return pulumi.get(self, "users")


class AwaitableGetGroupResult(GetGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupResult(
            delay_read_seconds=self.delay_read_seconds,
            description=self.description,
            id=self.id,
            include_users=self.include_users,
            name=self.name,
            type=self.type,
            users=self.users)


def get_group(delay_read_seconds: Optional[_builtins.str] = None,
              id: Optional[_builtins.str] = None,
              include_users: Optional[_builtins.bool] = None,
              name: Optional[_builtins.str] = None,
              type: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupResult:
    """
    Get a group from Okta.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    example = okta.group.get_group(name="Example App")
    ```


    :param _builtins.str delay_read_seconds: Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
    :param _builtins.str id: ID of group.
    :param _builtins.bool include_users: Fetch group users, having default off cuts down on API calls.
    :param _builtins.str name: Name of group.
    """
    __args__ = dict()
    __args__['delayReadSeconds'] = delay_read_seconds
    __args__['id'] = id
    __args__['includeUsers'] = include_users
    __args__['name'] = name
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('okta:group/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult).value

    return AwaitableGetGroupResult(
        delay_read_seconds=pulumi.get(__ret__, 'delay_read_seconds'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        include_users=pulumi.get(__ret__, 'include_users'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'),
        users=pulumi.get(__ret__, 'users'))
def get_group_output(delay_read_seconds: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     include_users: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                     name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGroupResult]:
    """
    Get a group from Okta.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    example = okta.group.get_group(name="Example App")
    ```


    :param _builtins.str delay_read_seconds: Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
    :param _builtins.str id: ID of group.
    :param _builtins.bool include_users: Fetch group users, having default off cuts down on API calls.
    :param _builtins.str name: Name of group.
    """
    __args__ = dict()
    __args__['delayReadSeconds'] = delay_read_seconds
    __args__['id'] = id
    __args__['includeUsers'] = include_users
    __args__['name'] = name
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('okta:group/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult)
    return __ret__.apply(lambda __response__: GetGroupResult(
        delay_read_seconds=pulumi.get(__response__, 'delay_read_seconds'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        include_users=pulumi.get(__response__, 'include_users'),
        name=pulumi.get(__response__, 'name'),
        type=pulumi.get(__response__, 'type'),
        users=pulumi.get(__response__, 'users')))
