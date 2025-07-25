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

__all__ = ['EmailSenderVerificationArgs', 'EmailSenderVerification']

@pulumi.input_type
class EmailSenderVerificationArgs:
    def __init__(__self__, *,
                 sender_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a EmailSenderVerification resource.
        :param pulumi.Input[_builtins.str] sender_id: Email sender ID
        """
        pulumi.set(__self__, "sender_id", sender_id)

    @_builtins.property
    @pulumi.getter(name="senderId")
    def sender_id(self) -> pulumi.Input[_builtins.str]:
        """
        Email sender ID
        """
        return pulumi.get(self, "sender_id")

    @sender_id.setter
    def sender_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "sender_id", value)


@pulumi.input_type
class _EmailSenderVerificationState:
    def __init__(__self__, *,
                 sender_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EmailSenderVerification resources.
        :param pulumi.Input[_builtins.str] sender_id: Email sender ID
        """
        if sender_id is not None:
            pulumi.set(__self__, "sender_id", sender_id)

    @_builtins.property
    @pulumi.getter(name="senderId")
    def sender_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Email sender ID
        """
        return pulumi.get(self, "sender_id")

    @sender_id.setter
    def sender_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "sender_id", value)


@pulumi.type_token("okta:index/emailSenderVerification:EmailSenderVerification")
class EmailSenderVerification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 sender_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Verifies the email sender. The resource won't be created if the email sender could not be verified.

        > **DEPRECATED** The api for this resource has been deprecated. Please use `EmailDomainVerification` instead.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailSender("example",
            from_name="Paul Atreides",
            from_address="no-reply@caladan.planet",
            subdomain="mail")
        example_email_sender_verification = okta.EmailSenderVerification("example", sender_id=valid["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] sender_id: Email sender ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailSenderVerificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Verifies the email sender. The resource won't be created if the email sender could not be verified.

        > **DEPRECATED** The api for this resource has been deprecated. Please use `EmailDomainVerification` instead.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailSender("example",
            from_name="Paul Atreides",
            from_address="no-reply@caladan.planet",
            subdomain="mail")
        example_email_sender_verification = okta.EmailSenderVerification("example", sender_id=valid["id"])
        ```

        :param str resource_name: The name of the resource.
        :param EmailSenderVerificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailSenderVerificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 sender_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailSenderVerificationArgs.__new__(EmailSenderVerificationArgs)

            if sender_id is None and not opts.urn:
                raise TypeError("Missing required property 'sender_id'")
            __props__.__dict__["sender_id"] = sender_id
        super(EmailSenderVerification, __self__).__init__(
            'okta:index/emailSenderVerification:EmailSenderVerification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            sender_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'EmailSenderVerification':
        """
        Get an existing EmailSenderVerification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] sender_id: Email sender ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailSenderVerificationState.__new__(_EmailSenderVerificationState)

        __props__.__dict__["sender_id"] = sender_id
        return EmailSenderVerification(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="senderId")
    def sender_id(self) -> pulumi.Output[_builtins.str]:
        """
        Email sender ID
        """
        return pulumi.get(self, "sender_id")

