# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EmailSenderArgs', 'EmailSender']

@pulumi.input_type
class EmailSenderArgs:
    def __init__(__self__, *,
                 from_address: pulumi.Input[str],
                 from_name: pulumi.Input[str],
                 subdomain: pulumi.Input[str]):
        """
        The set of arguments for constructing a EmailSender resource.
        :param pulumi.Input[str] from_address: Email address to send from.
        :param pulumi.Input[str] from_name: Name of sender.
        :param pulumi.Input[str] subdomain: Mail domain to send from.
        """
        pulumi.set(__self__, "from_address", from_address)
        pulumi.set(__self__, "from_name", from_name)
        pulumi.set(__self__, "subdomain", subdomain)

    @property
    @pulumi.getter(name="fromAddress")
    def from_address(self) -> pulumi.Input[str]:
        """
        Email address to send from.
        """
        return pulumi.get(self, "from_address")

    @from_address.setter
    def from_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "from_address", value)

    @property
    @pulumi.getter(name="fromName")
    def from_name(self) -> pulumi.Input[str]:
        """
        Name of sender.
        """
        return pulumi.get(self, "from_name")

    @from_name.setter
    def from_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "from_name", value)

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Input[str]:
        """
        Mail domain to send from.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: pulumi.Input[str]):
        pulumi.set(self, "subdomain", value)


@pulumi.input_type
class _EmailSenderState:
    def __init__(__self__, *,
                 dns_records: Optional[pulumi.Input[Sequence[pulumi.Input['EmailSenderDnsRecordArgs']]]] = None,
                 from_address: Optional[pulumi.Input[str]] = None,
                 from_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EmailSender resources.
        :param pulumi.Input[Sequence[pulumi.Input['EmailSenderDnsRecordArgs']]] dns_records: TXT and CNAME records to be registered for the domain.
        :param pulumi.Input[str] from_address: Email address to send from.
        :param pulumi.Input[str] from_name: Name of sender.
        :param pulumi.Input[str] status: Status of the sender (shows whether the sender is verified).
        :param pulumi.Input[str] subdomain: Mail domain to send from.
        """
        if dns_records is not None:
            pulumi.set(__self__, "dns_records", dns_records)
        if from_address is not None:
            pulumi.set(__self__, "from_address", from_address)
        if from_name is not None:
            pulumi.set(__self__, "from_name", from_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)

    @property
    @pulumi.getter(name="dnsRecords")
    def dns_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailSenderDnsRecordArgs']]]]:
        """
        TXT and CNAME records to be registered for the domain.
        """
        return pulumi.get(self, "dns_records")

    @dns_records.setter
    def dns_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailSenderDnsRecordArgs']]]]):
        pulumi.set(self, "dns_records", value)

    @property
    @pulumi.getter(name="fromAddress")
    def from_address(self) -> Optional[pulumi.Input[str]]:
        """
        Email address to send from.
        """
        return pulumi.get(self, "from_address")

    @from_address.setter
    def from_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_address", value)

    @property
    @pulumi.getter(name="fromName")
    def from_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of sender.
        """
        return pulumi.get(self, "from_name")

    @from_name.setter
    def from_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the sender (shows whether the sender is verified).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        Mail domain to send from.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdomain", value)


class EmailSender(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 from_address: Optional[pulumi.Input[str]] = None,
                 from_name: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to create and configure a custom email sender.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailSender("example",
            from_address="no-reply@caladan.planet",
            from_name="Paul Atreides",
            subdomain="mail")
        ```

        ## Import

        Custom email sender can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:index/emailSender:EmailSender example <sender id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] from_address: Email address to send from.
        :param pulumi.Input[str] from_name: Name of sender.
        :param pulumi.Input[str] subdomain: Mail domain to send from.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailSenderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create and configure a custom email sender.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.EmailSender("example",
            from_address="no-reply@caladan.planet",
            from_name="Paul Atreides",
            subdomain="mail")
        ```

        ## Import

        Custom email sender can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:index/emailSender:EmailSender example <sender id>
        ```

        :param str resource_name: The name of the resource.
        :param EmailSenderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailSenderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 from_address: Optional[pulumi.Input[str]] = None,
                 from_name: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
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
            __props__ = EmailSenderArgs.__new__(EmailSenderArgs)

            if from_address is None and not opts.urn:
                raise TypeError("Missing required property 'from_address'")
            __props__.__dict__["from_address"] = from_address
            if from_name is None and not opts.urn:
                raise TypeError("Missing required property 'from_name'")
            __props__.__dict__["from_name"] = from_name
            if subdomain is None and not opts.urn:
                raise TypeError("Missing required property 'subdomain'")
            __props__.__dict__["subdomain"] = subdomain
            __props__.__dict__["dns_records"] = None
            __props__.__dict__["status"] = None
        super(EmailSender, __self__).__init__(
            'okta:index/emailSender:EmailSender',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dns_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailSenderDnsRecordArgs']]]]] = None,
            from_address: Optional[pulumi.Input[str]] = None,
            from_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subdomain: Optional[pulumi.Input[str]] = None) -> 'EmailSender':
        """
        Get an existing EmailSender resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailSenderDnsRecordArgs']]]] dns_records: TXT and CNAME records to be registered for the domain.
        :param pulumi.Input[str] from_address: Email address to send from.
        :param pulumi.Input[str] from_name: Name of sender.
        :param pulumi.Input[str] status: Status of the sender (shows whether the sender is verified).
        :param pulumi.Input[str] subdomain: Mail domain to send from.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailSenderState.__new__(_EmailSenderState)

        __props__.__dict__["dns_records"] = dns_records
        __props__.__dict__["from_address"] = from_address
        __props__.__dict__["from_name"] = from_name
        __props__.__dict__["status"] = status
        __props__.__dict__["subdomain"] = subdomain
        return EmailSender(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dnsRecords")
    def dns_records(self) -> pulumi.Output[Sequence['outputs.EmailSenderDnsRecord']]:
        """
        TXT and CNAME records to be registered for the domain.
        """
        return pulumi.get(self, "dns_records")

    @property
    @pulumi.getter(name="fromAddress")
    def from_address(self) -> pulumi.Output[str]:
        """
        Email address to send from.
        """
        return pulumi.get(self, "from_address")

    @property
    @pulumi.getter(name="fromName")
    def from_name(self) -> pulumi.Output[str]:
        """
        Name of sender.
        """
        return pulumi.get(self, "from_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the sender (shows whether the sender is verified).
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Output[str]:
        """
        Mail domain to send from.
        """
        return pulumi.get(self, "subdomain")
