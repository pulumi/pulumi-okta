# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Role']


class Role(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 role_type: Optional[pulumi.Input[str]] = None,
                 target_group_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Assigns Admin roles to Okta Groups.

        This resource allows you to assign Okta administrator roles to Okta Groups. This resource provides a one-to-one
        interface between the Okta group and the admin role.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.group.Role("example",
            group_id="<group id>",
            role_type="READ_ONLY_ADMIN")
        ```

        ## Import

        Individual admin role assignment can be imported by passing the group and role assignment IDs as follows

        ```sh
         $ pulumi import okta:group/role:Role example <group id>/<role id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The ID of group to attach admin roles to.
        :param pulumi.Input[str] role_type: Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
               , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
               , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] target_group_lists: A list of group IDs you would like as the targets of the admin role.
               - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            if role_type is None and not opts.urn:
                raise TypeError("Missing required property 'role_type'")
            __props__['role_type'] = role_type
            __props__['target_group_lists'] = target_group_lists
        super(Role, __self__).__init__(
            'okta:group/role:Role',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            role_type: Optional[pulumi.Input[str]] = None,
            target_group_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Role':
        """
        Get an existing Role resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The ID of group to attach admin roles to.
        :param pulumi.Input[str] role_type: Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
               , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
               , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] target_group_lists: A list of group IDs you would like as the targets of the admin role.
               - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["group_id"] = group_id
        __props__["role_type"] = role_type
        __props__["target_group_lists"] = target_group_lists
        return Role(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The ID of group to attach admin roles to.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Output[str]:
        """
        Admin role assigned to the group. It can be any one of the following values `"SUPER_ADMIN"`
        , `"ORG_ADMIN"`, `"APP_ADMIN"`, `"USER_ADMIN"`, `"HELP_DESK_ADMIN"`, `"READ_ONLY_ADMIN"`
        , `"MOBILE_ADMIN"`, `"API_ACCESS_MANAGEMENT_ADMIN"`, `"REPORT_ADMIN"`, `"GROUP_MEMBERSHIP_ADMIN"`.
        """
        return pulumi.get(self, "role_type")

    @property
    @pulumi.getter(name="targetGroupLists")
    def target_group_lists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of group IDs you would like as the targets of the admin role.
        - Only supported when used with the role types: `GROUP_MEMBERSHIP_ADMIN`, `HELP_DESK_ADMIN`, or `USER_ADMIN`.
        """
        return pulumi.get(self, "target_group_lists")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
