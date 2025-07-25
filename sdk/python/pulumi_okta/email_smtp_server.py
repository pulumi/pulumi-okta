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

__all__ = ['EmailSmtpServerArgs', 'EmailSmtpServer']

@pulumi.input_type
class EmailSmtpServerArgs:
    def __init__(__self__, *,
                 alias: pulumi.Input[_builtins.str],
                 host: pulumi.Input[_builtins.str],
                 password: pulumi.Input[_builtins.str],
                 port: pulumi.Input[_builtins.int],
                 username: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a EmailSmtpServer resource.
        :param pulumi.Input[_builtins.str] alias: Human-readable name for your SMTP server.
        :param pulumi.Input[_builtins.str] host: Hostname or IP address of your SMTP server.
        :param pulumi.Input[_builtins.str] password: User name of the email domain.
        :param pulumi.Input[_builtins.int] port: Port number of your SMTP server.
        :param pulumi.Input[_builtins.str] username: Display name of the email domain.
        :param pulumi.Input[_builtins.bool] enabled: If true, routes all email traffic through your SMTP server.
        """
        pulumi.set(__self__, "alias", alias)
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "username", username)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> pulumi.Input[_builtins.str]:
        """
        Human-readable name for your SMTP server.
        """
        return pulumi.get(self, "alias")

    @alias.setter
    def alias(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "alias", value)

    @_builtins.property
    @pulumi.getter
    def host(self) -> pulumi.Input[_builtins.str]:
        """
        Hostname or IP address of your SMTP server.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "host", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Input[_builtins.str]:
        """
        User name of the email domain.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def port(self) -> pulumi.Input[_builtins.int]:
        """
        Port number of your SMTP server.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "port", value)

    @_builtins.property
    @pulumi.getter
    def username(self) -> pulumi.Input[_builtins.str]:
        """
        Display name of the email domain.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "username", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If true, routes all email traffic through your SMTP server.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _EmailSmtpServerState:
    def __init__(__self__, *,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EmailSmtpServer resources.
        :param pulumi.Input[_builtins.str] alias: Human-readable name for your SMTP server.
        :param pulumi.Input[_builtins.bool] enabled: If true, routes all email traffic through your SMTP server.
        :param pulumi.Input[_builtins.str] host: Hostname or IP address of your SMTP server.
        :param pulumi.Input[_builtins.str] password: User name of the email domain.
        :param pulumi.Input[_builtins.int] port: Port number of your SMTP server.
        :param pulumi.Input[_builtins.str] username: Display name of the email domain.
        """
        if alias is not None:
            pulumi.set(__self__, "alias", alias)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Human-readable name for your SMTP server.
        """
        return pulumi.get(self, "alias")

    @alias.setter
    def alias(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "alias", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If true, routes all email traffic through your SMTP server.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Hostname or IP address of your SMTP server.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "host", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User name of the email domain.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Port number of your SMTP server.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "port", value)

    @_builtins.property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Display name of the email domain.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username", value)


@pulumi.type_token("okta:index/emailSmtpServer:EmailSmtpServer")
class EmailSmtpServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Create a EmailSmtpServer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] alias: Human-readable name for your SMTP server.
        :param pulumi.Input[_builtins.bool] enabled: If true, routes all email traffic through your SMTP server.
        :param pulumi.Input[_builtins.str] host: Hostname or IP address of your SMTP server.
        :param pulumi.Input[_builtins.str] password: User name of the email domain.
        :param pulumi.Input[_builtins.int] port: Port number of your SMTP server.
        :param pulumi.Input[_builtins.str] username: Display name of the email domain.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailSmtpServerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a EmailSmtpServer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param EmailSmtpServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailSmtpServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailSmtpServerArgs.__new__(EmailSmtpServerArgs)

            if alias is None and not opts.urn:
                raise TypeError("Missing required property 'alias'")
            __props__.__dict__["alias"] = alias
            __props__.__dict__["enabled"] = enabled
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__.__dict__["host"] = host
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = password
            if port is None and not opts.urn:
                raise TypeError("Missing required property 'port'")
            __props__.__dict__["port"] = port
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
        super(EmailSmtpServer, __self__).__init__(
            'okta:index/emailSmtpServer:EmailSmtpServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alias: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            host: Optional[pulumi.Input[_builtins.str]] = None,
            password: Optional[pulumi.Input[_builtins.str]] = None,
            port: Optional[pulumi.Input[_builtins.int]] = None,
            username: Optional[pulumi.Input[_builtins.str]] = None) -> 'EmailSmtpServer':
        """
        Get an existing EmailSmtpServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] alias: Human-readable name for your SMTP server.
        :param pulumi.Input[_builtins.bool] enabled: If true, routes all email traffic through your SMTP server.
        :param pulumi.Input[_builtins.str] host: Hostname or IP address of your SMTP server.
        :param pulumi.Input[_builtins.str] password: User name of the email domain.
        :param pulumi.Input[_builtins.int] port: Port number of your SMTP server.
        :param pulumi.Input[_builtins.str] username: Display name of the email domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailSmtpServerState.__new__(_EmailSmtpServerState)

        __props__.__dict__["alias"] = alias
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["host"] = host
        __props__.__dict__["password"] = password
        __props__.__dict__["port"] = port
        __props__.__dict__["username"] = username
        return EmailSmtpServer(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> pulumi.Output[_builtins.str]:
        """
        Human-readable name for your SMTP server.
        """
        return pulumi.get(self, "alias")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        If true, routes all email traffic through your SMTP server.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def host(self) -> pulumi.Output[_builtins.str]:
        """
        Hostname or IP address of your SMTP server.
        """
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Output[_builtins.str]:
        """
        User name of the email domain.
        """
        return pulumi.get(self, "password")

    @_builtins.property
    @pulumi.getter
    def port(self) -> pulumi.Output[_builtins.int]:
        """
        Port number of your SMTP server.
        """
        return pulumi.get(self, "port")

    @_builtins.property
    @pulumi.getter
    def username(self) -> pulumi.Output[_builtins.str]:
        """
        Display name of the email domain.
        """
        return pulumi.get(self, "username")

