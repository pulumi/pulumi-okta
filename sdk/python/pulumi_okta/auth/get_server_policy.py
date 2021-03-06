# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = [
    'GetServerPolicyResult',
    'AwaitableGetServerPolicyResult',
    'get_server_policy',
]

@pulumi.output_type
class GetServerPolicyResult:
    """
    A collection of values returned by getServerPolicy.
    """
    def __init__(__self__, assigned_clients=None, auth_server_id=None, description=None, id=None, name=None):
        if assigned_clients and not isinstance(assigned_clients, list):
            raise TypeError("Expected argument 'assigned_clients' to be a list")
        pulumi.set(__self__, "assigned_clients", assigned_clients)
        if auth_server_id and not isinstance(auth_server_id, str):
            raise TypeError("Expected argument 'auth_server_id' to be a str")
        pulumi.set(__self__, "auth_server_id", auth_server_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="assignedClients")
    def assigned_clients(self) -> Sequence[str]:
        """
        list of clients this policy is assigned to. `["ALL_CLIENTS"]` is a special value when policy is assigned to all clients.
        """
        return pulumi.get(self, "assigned_clients")

    @property
    @pulumi.getter(name="authServerId")
    def auth_server_id(self) -> str:
        return pulumi.get(self, "auth_server_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        description of authorization server policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetServerPolicyResult(GetServerPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerPolicyResult(
            assigned_clients=self.assigned_clients,
            auth_server_id=self.auth_server_id,
            description=self.description,
            id=self.id,
            name=self.name)


def get_server_policy(auth_server_id: Optional[str] = None,
                      name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerPolicyResult:
    """
    Use this data source to retrieve a authorization server policy from Okta.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_okta as okta

    example = okta.auth.get_server_policy(auth_server_id="<auth server id>",
        name="staff")
    ```


    :param str auth_server_id: The ID of the Auth Server.
    :param str name: Name of policy to retrieve.
    """
    __args__ = dict()
    __args__['authServerId'] = auth_server_id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('okta:auth/getServerPolicy:getServerPolicy', __args__, opts=opts, typ=GetServerPolicyResult).value

    return AwaitableGetServerPolicyResult(
        assigned_clients=__ret__.assigned_clients,
        auth_server_id=__ret__.auth_server_id,
        description=__ret__.description,
        id=__ret__.id,
        name=__ret__.name)
