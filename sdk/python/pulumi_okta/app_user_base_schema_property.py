# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AppUserBaseSchemaPropertyArgs', 'AppUserBaseSchemaProperty']

@pulumi.input_type
class AppUserBaseSchemaPropertyArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 index: pulumi.Input[str],
                 title: pulumi.Input[str],
                 type: pulumi.Input[str],
                 master: Optional[pulumi.Input[str]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 required: Optional[pulumi.Input[bool]] = None,
                 user_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AppUserBaseSchemaProperty resource.
        :param pulumi.Input[str] app_id: The Application's ID the user schema property should be assigned to.
        :param pulumi.Input[str] index: The property name.
        :param pulumi.Input[str] title: The property display name.
        :param pulumi.Input[str] type: The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        :param pulumi.Input[str] master: Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        :param pulumi.Input[str] pattern: The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        :param pulumi.Input[str] permissions: Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        :param pulumi.Input[bool] required: Whether the property is required for this application's users.
        :param pulumi.Input[str] user_type: Custom subschema user type
        """
        pulumi.set(__self__, "app_id", app_id)
        pulumi.set(__self__, "index", index)
        pulumi.set(__self__, "title", title)
        pulumi.set(__self__, "type", type)
        if master is not None:
            pulumi.set(__self__, "master", master)
        if pattern is not None:
            pulumi.set(__self__, "pattern", pattern)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if required is not None:
            pulumi.set(__self__, "required", required)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        The Application's ID the user schema property should be assigned to.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def index(self) -> pulumi.Input[str]:
        """
        The property name.
        """
        return pulumi.get(self, "index")

    @index.setter
    def index(self, value: pulumi.Input[str]):
        pulumi.set(self, "index", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        The property display name.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def master(self) -> Optional[pulumi.Input[str]]:
        """
        Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        """
        return pulumi.get(self, "master")

    @master.setter
    def master(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master", value)

    @property
    @pulumi.getter
    def pattern(self) -> Optional[pulumi.Input[str]]:
        """
        The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pattern", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[str]]:
        """
        Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter
    def required(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the property is required for this application's users.
        """
        return pulumi.get(self, "required")

    @required.setter
    def required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "required", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[str]]:
        """
        Custom subschema user type
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_type", value)


@pulumi.input_type
class _AppUserBaseSchemaPropertyState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 index: Optional[pulumi.Input[str]] = None,
                 master: Optional[pulumi.Input[str]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 required: Optional[pulumi.Input[bool]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AppUserBaseSchemaProperty resources.
        :param pulumi.Input[str] app_id: The Application's ID the user schema property should be assigned to.
        :param pulumi.Input[str] index: The property name.
        :param pulumi.Input[str] master: Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        :param pulumi.Input[str] pattern: The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        :param pulumi.Input[str] permissions: Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        :param pulumi.Input[bool] required: Whether the property is required for this application's users.
        :param pulumi.Input[str] title: The property display name.
        :param pulumi.Input[str] type: The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        :param pulumi.Input[str] user_type: Custom subschema user type
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if index is not None:
            pulumi.set(__self__, "index", index)
        if master is not None:
            pulumi.set(__self__, "master", master)
        if pattern is not None:
            pulumi.set(__self__, "pattern", pattern)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if required is not None:
            pulumi.set(__self__, "required", required)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Application's ID the user schema property should be assigned to.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def index(self) -> Optional[pulumi.Input[str]]:
        """
        The property name.
        """
        return pulumi.get(self, "index")

    @index.setter
    def index(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index", value)

    @property
    @pulumi.getter
    def master(self) -> Optional[pulumi.Input[str]]:
        """
        Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        """
        return pulumi.get(self, "master")

    @master.setter
    def master(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master", value)

    @property
    @pulumi.getter
    def pattern(self) -> Optional[pulumi.Input[str]]:
        """
        The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pattern", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[str]]:
        """
        Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter
    def required(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the property is required for this application's users.
        """
        return pulumi.get(self, "required")

    @required.setter
    def required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "required", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The property display name.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[str]]:
        """
        Custom subschema user type
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_type", value)


class AppUserBaseSchemaProperty(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 index: Optional[pulumi.Input[str]] = None,
                 master: Optional[pulumi.Input[str]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 required: Optional[pulumi.Input[bool]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Application User Base Schema property.

        This resource allows you to configure a base app user schema property.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.AppUserBaseSchemaProperty("example",
            app_id="<app id>",
            index="customPropertyName",
            master="OKTA",
            title="customPropertyName",
            type="string")
        ```

        ## Import

        App user base schema property can be imported via the property index and app id.

        ```sh
         $ pulumi import okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty example <app id>/<property name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The Application's ID the user schema property should be assigned to.
        :param pulumi.Input[str] index: The property name.
        :param pulumi.Input[str] master: Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        :param pulumi.Input[str] pattern: The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        :param pulumi.Input[str] permissions: Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        :param pulumi.Input[bool] required: Whether the property is required for this application's users.
        :param pulumi.Input[str] title: The property display name.
        :param pulumi.Input[str] type: The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        :param pulumi.Input[str] user_type: Custom subschema user type
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppUserBaseSchemaPropertyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Application User Base Schema property.

        This resource allows you to configure a base app user schema property.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.AppUserBaseSchemaProperty("example",
            app_id="<app id>",
            index="customPropertyName",
            master="OKTA",
            title="customPropertyName",
            type="string")
        ```

        ## Import

        App user base schema property can be imported via the property index and app id.

        ```sh
         $ pulumi import okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty example <app id>/<property name>
        ```

        :param str resource_name: The name of the resource.
        :param AppUserBaseSchemaPropertyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppUserBaseSchemaPropertyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 index: Optional[pulumi.Input[str]] = None,
                 master: Optional[pulumi.Input[str]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 required: Optional[pulumi.Input[bool]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppUserBaseSchemaPropertyArgs.__new__(AppUserBaseSchemaPropertyArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if index is None and not opts.urn:
                raise TypeError("Missing required property 'index'")
            __props__.__dict__["index"] = index
            __props__.__dict__["master"] = master
            __props__.__dict__["pattern"] = pattern
            __props__.__dict__["permissions"] = permissions
            __props__.__dict__["required"] = required
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["user_type"] = user_type
        super(AppUserBaseSchemaProperty, __self__).__init__(
            'okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            index: Optional[pulumi.Input[str]] = None,
            master: Optional[pulumi.Input[str]] = None,
            pattern: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[str]] = None,
            required: Optional[pulumi.Input[bool]] = None,
            title: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            user_type: Optional[pulumi.Input[str]] = None) -> 'AppUserBaseSchemaProperty':
        """
        Get an existing AppUserBaseSchemaProperty resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The Application's ID the user schema property should be assigned to.
        :param pulumi.Input[str] index: The property name.
        :param pulumi.Input[str] master: Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        :param pulumi.Input[str] pattern: The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        :param pulumi.Input[str] permissions: Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        :param pulumi.Input[bool] required: Whether the property is required for this application's users.
        :param pulumi.Input[str] title: The property display name.
        :param pulumi.Input[str] type: The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        :param pulumi.Input[str] user_type: Custom subschema user type
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppUserBaseSchemaPropertyState.__new__(_AppUserBaseSchemaPropertyState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["index"] = index
        __props__.__dict__["master"] = master
        __props__.__dict__["pattern"] = pattern
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["required"] = required
        __props__.__dict__["title"] = title
        __props__.__dict__["type"] = type
        __props__.__dict__["user_type"] = user_type
        return AppUserBaseSchemaProperty(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        The Application's ID the user schema property should be assigned to.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def index(self) -> pulumi.Output[str]:
        """
        The property name.
        """
        return pulumi.get(self, "index")

    @property
    @pulumi.getter
    def master(self) -> pulumi.Output[Optional[str]]:
        """
        Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
        """
        return pulumi.get(self, "master")

    @property
    @pulumi.getter
    def pattern(self) -> pulumi.Output[Optional[str]]:
        """
        The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
        """
        return pulumi.get(self, "pattern")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional[str]]:
        """
        Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter
    def required(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the property is required for this application's users.
        """
        return pulumi.get(self, "required")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The property display name.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> pulumi.Output[Optional[str]]:
        """
        Custom subschema user type
        """
        return pulumi.get(self, "user_type")
