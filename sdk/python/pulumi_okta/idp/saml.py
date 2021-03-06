# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Saml']


class Saml(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_link_action: Optional[pulumi.Input[str]] = None,
                 account_link_group_includes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 acs_binding: Optional[pulumi.Input[str]] = None,
                 acs_type: Optional[pulumi.Input[str]] = None,
                 deprovisioned_action: Optional[pulumi.Input[str]] = None,
                 groups_action: Optional[pulumi.Input[str]] = None,
                 groups_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 groups_attribute: Optional[pulumi.Input[str]] = None,
                 groups_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 issuer_mode: Optional[pulumi.Input[str]] = None,
                 kid: Optional[pulumi.Input[str]] = None,
                 max_clock_skew: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_format: Optional[pulumi.Input[str]] = None,
                 profile_master: Optional[pulumi.Input[bool]] = None,
                 provisioning_action: Optional[pulumi.Input[str]] = None,
                 request_signature_algorithm: Optional[pulumi.Input[str]] = None,
                 request_signature_scope: Optional[pulumi.Input[str]] = None,
                 response_signature_algorithm: Optional[pulumi.Input[str]] = None,
                 response_signature_scope: Optional[pulumi.Input[str]] = None,
                 sso_binding: Optional[pulumi.Input[str]] = None,
                 sso_destination: Optional[pulumi.Input[str]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subject_filter: Optional[pulumi.Input[str]] = None,
                 subject_formats: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subject_match_attribute: Optional[pulumi.Input[str]] = None,
                 subject_match_type: Optional[pulumi.Input[str]] = None,
                 suspended_action: Optional[pulumi.Input[str]] = None,
                 username_template: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Creates a SAML Identity Provider.

        This resource allows you to create and configure a SAML Identity Provider.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_okta as okta

        example = okta.idp.Saml("example",
            acs_type="INSTANCE",
            issuer="https://idp.example.com",
            kid=okta_idp_saml_key["test"]["id"],
            request_signature_scope="REQUEST",
            response_signature_scope="ANY",
            sso_binding="HTTP-POST",
            sso_destination="https://idp.example.com",
            sso_url="https://idp.example.com",
            username_template="idpuser.email")
        ```

        ## Import

        An SAML IdP can be imported via the Okta ID.

        ```sh
         $ pulumi import okta:idp/saml:Saml example <idp id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_link_action: Specifies the account linking action for an IdP user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] account_link_group_includes: Group memberships to determine link candidates.
        :param pulumi.Input[str] acs_type: The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        :param pulumi.Input[str] deprovisioned_action: Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        :param pulumi.Input[str] groups_action: Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups_assignments: List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        :param pulumi.Input[str] groups_attribute: IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups_filters: Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        :param pulumi.Input[str] issuer: URI that identifies the issuer.
        :param pulumi.Input[str] issuer_mode: Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        :param pulumi.Input[str] kid: The ID of the signing key.
        :param pulumi.Input[int] max_clock_skew: Maximum allowable clock-skew when processing messages from the IdP.
        :param pulumi.Input[str] name: The Application's display name.
        :param pulumi.Input[str] name_format: The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        :param pulumi.Input[bool] profile_master: Determines if the IdP should act as a source of truth for user profile attributes.
        :param pulumi.Input[str] provisioning_action: Provisioning action for an IdP user during authentication.
        :param pulumi.Input[str] request_signature_algorithm: The XML digital signature algorithm used when signing an AuthnRequest message.
        :param pulumi.Input[str] request_signature_scope: Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        :param pulumi.Input[str] response_signature_algorithm: The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        :param pulumi.Input[str] response_signature_scope: Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        :param pulumi.Input[str] sso_binding: The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        :param pulumi.Input[str] sso_destination: URI reference indicating the address to which the AuthnRequest message is sent.
        :param pulumi.Input[str] sso_url: URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        :param pulumi.Input[str] status: Status of the IdP.
        :param pulumi.Input[str] subject_filter: Optional regular expression pattern used to filter untrusted IdP usernames.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subject_formats: The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        :param pulumi.Input[str] subject_match_attribute: Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        :param pulumi.Input[str] subject_match_type: Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        :param pulumi.Input[str] suspended_action: Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        :param pulumi.Input[str] username_template: Okta EL Expression to generate or transform a unique username for the IdP user.
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

            __props__['account_link_action'] = account_link_action
            __props__['account_link_group_includes'] = account_link_group_includes
            if acs_binding is not None and not opts.urn:
                warnings.warn("""This property will be removed in the future, as it can only be set to 'HTTP-POST'""", DeprecationWarning)
                pulumi.log.warn("acs_binding is deprecated: This property will be removed in the future, as it can only be set to 'HTTP-POST'")
            __props__['acs_binding'] = acs_binding
            __props__['acs_type'] = acs_type
            __props__['deprovisioned_action'] = deprovisioned_action
            __props__['groups_action'] = groups_action
            __props__['groups_assignments'] = groups_assignments
            __props__['groups_attribute'] = groups_attribute
            __props__['groups_filters'] = groups_filters
            if issuer is None and not opts.urn:
                raise TypeError("Missing required property 'issuer'")
            __props__['issuer'] = issuer
            __props__['issuer_mode'] = issuer_mode
            if kid is None and not opts.urn:
                raise TypeError("Missing required property 'kid'")
            __props__['kid'] = kid
            __props__['max_clock_skew'] = max_clock_skew
            __props__['name'] = name
            __props__['name_format'] = name_format
            __props__['profile_master'] = profile_master
            __props__['provisioning_action'] = provisioning_action
            __props__['request_signature_algorithm'] = request_signature_algorithm
            __props__['request_signature_scope'] = request_signature_scope
            __props__['response_signature_algorithm'] = response_signature_algorithm
            __props__['response_signature_scope'] = response_signature_scope
            __props__['sso_binding'] = sso_binding
            __props__['sso_destination'] = sso_destination
            if sso_url is None and not opts.urn:
                raise TypeError("Missing required property 'sso_url'")
            __props__['sso_url'] = sso_url
            __props__['status'] = status
            __props__['subject_filter'] = subject_filter
            __props__['subject_formats'] = subject_formats
            __props__['subject_match_attribute'] = subject_match_attribute
            __props__['subject_match_type'] = subject_match_type
            __props__['suspended_action'] = suspended_action
            __props__['username_template'] = username_template
            __props__['audience'] = None
            __props__['type'] = None
        super(Saml, __self__).__init__(
            'okta:idp/saml:Saml',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_link_action: Optional[pulumi.Input[str]] = None,
            account_link_group_includes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            acs_binding: Optional[pulumi.Input[str]] = None,
            acs_type: Optional[pulumi.Input[str]] = None,
            audience: Optional[pulumi.Input[str]] = None,
            deprovisioned_action: Optional[pulumi.Input[str]] = None,
            groups_action: Optional[pulumi.Input[str]] = None,
            groups_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            groups_attribute: Optional[pulumi.Input[str]] = None,
            groups_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            issuer_mode: Optional[pulumi.Input[str]] = None,
            kid: Optional[pulumi.Input[str]] = None,
            max_clock_skew: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_format: Optional[pulumi.Input[str]] = None,
            profile_master: Optional[pulumi.Input[bool]] = None,
            provisioning_action: Optional[pulumi.Input[str]] = None,
            request_signature_algorithm: Optional[pulumi.Input[str]] = None,
            request_signature_scope: Optional[pulumi.Input[str]] = None,
            response_signature_algorithm: Optional[pulumi.Input[str]] = None,
            response_signature_scope: Optional[pulumi.Input[str]] = None,
            sso_binding: Optional[pulumi.Input[str]] = None,
            sso_destination: Optional[pulumi.Input[str]] = None,
            sso_url: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subject_filter: Optional[pulumi.Input[str]] = None,
            subject_formats: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subject_match_attribute: Optional[pulumi.Input[str]] = None,
            subject_match_type: Optional[pulumi.Input[str]] = None,
            suspended_action: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            username_template: Optional[pulumi.Input[str]] = None) -> 'Saml':
        """
        Get an existing Saml resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_link_action: Specifies the account linking action for an IdP user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] account_link_group_includes: Group memberships to determine link candidates.
        :param pulumi.Input[str] acs_type: The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        :param pulumi.Input[str] audience: The audience restriction for the IdP.
        :param pulumi.Input[str] deprovisioned_action: Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        :param pulumi.Input[str] groups_action: Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups_assignments: List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        :param pulumi.Input[str] groups_attribute: IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups_filters: Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        :param pulumi.Input[str] issuer: URI that identifies the issuer.
        :param pulumi.Input[str] issuer_mode: Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        :param pulumi.Input[str] kid: The ID of the signing key.
        :param pulumi.Input[int] max_clock_skew: Maximum allowable clock-skew when processing messages from the IdP.
        :param pulumi.Input[str] name: The Application's display name.
        :param pulumi.Input[str] name_format: The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        :param pulumi.Input[bool] profile_master: Determines if the IdP should act as a source of truth for user profile attributes.
        :param pulumi.Input[str] provisioning_action: Provisioning action for an IdP user during authentication.
        :param pulumi.Input[str] request_signature_algorithm: The XML digital signature algorithm used when signing an AuthnRequest message.
        :param pulumi.Input[str] request_signature_scope: Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        :param pulumi.Input[str] response_signature_algorithm: The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        :param pulumi.Input[str] response_signature_scope: Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        :param pulumi.Input[str] sso_binding: The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        :param pulumi.Input[str] sso_destination: URI reference indicating the address to which the AuthnRequest message is sent.
        :param pulumi.Input[str] sso_url: URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        :param pulumi.Input[str] status: Status of the IdP.
        :param pulumi.Input[str] subject_filter: Optional regular expression pattern used to filter untrusted IdP usernames.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subject_formats: The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        :param pulumi.Input[str] subject_match_attribute: Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        :param pulumi.Input[str] subject_match_type: Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        :param pulumi.Input[str] suspended_action: Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        :param pulumi.Input[str] type: Type of the IdP.
        :param pulumi.Input[str] username_template: Okta EL Expression to generate or transform a unique username for the IdP user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_link_action"] = account_link_action
        __props__["account_link_group_includes"] = account_link_group_includes
        __props__["acs_binding"] = acs_binding
        __props__["acs_type"] = acs_type
        __props__["audience"] = audience
        __props__["deprovisioned_action"] = deprovisioned_action
        __props__["groups_action"] = groups_action
        __props__["groups_assignments"] = groups_assignments
        __props__["groups_attribute"] = groups_attribute
        __props__["groups_filters"] = groups_filters
        __props__["issuer"] = issuer
        __props__["issuer_mode"] = issuer_mode
        __props__["kid"] = kid
        __props__["max_clock_skew"] = max_clock_skew
        __props__["name"] = name
        __props__["name_format"] = name_format
        __props__["profile_master"] = profile_master
        __props__["provisioning_action"] = provisioning_action
        __props__["request_signature_algorithm"] = request_signature_algorithm
        __props__["request_signature_scope"] = request_signature_scope
        __props__["response_signature_algorithm"] = response_signature_algorithm
        __props__["response_signature_scope"] = response_signature_scope
        __props__["sso_binding"] = sso_binding
        __props__["sso_destination"] = sso_destination
        __props__["sso_url"] = sso_url
        __props__["status"] = status
        __props__["subject_filter"] = subject_filter
        __props__["subject_formats"] = subject_formats
        __props__["subject_match_attribute"] = subject_match_attribute
        __props__["subject_match_type"] = subject_match_type
        __props__["suspended_action"] = suspended_action
        __props__["type"] = type
        __props__["username_template"] = username_template
        return Saml(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountLinkAction")
    def account_link_action(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the account linking action for an IdP user.
        """
        return pulumi.get(self, "account_link_action")

    @property
    @pulumi.getter(name="accountLinkGroupIncludes")
    def account_link_group_includes(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Group memberships to determine link candidates.
        """
        return pulumi.get(self, "account_link_group_includes")

    @property
    @pulumi.getter(name="acsBinding")
    def acs_binding(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "acs_binding")

    @property
    @pulumi.getter(name="acsType")
    def acs_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        """
        return pulumi.get(self, "acs_type")

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Output[str]:
        """
        The audience restriction for the IdP.
        """
        return pulumi.get(self, "audience")

    @property
    @pulumi.getter(name="deprovisionedAction")
    def deprovisioned_action(self) -> pulumi.Output[Optional[str]]:
        """
        Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        """
        return pulumi.get(self, "deprovisioned_action")

    @property
    @pulumi.getter(name="groupsAction")
    def groups_action(self) -> pulumi.Output[Optional[str]]:
        """
        Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        """
        return pulumi.get(self, "groups_action")

    @property
    @pulumi.getter(name="groupsAssignments")
    def groups_assignments(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        """
        return pulumi.get(self, "groups_assignments")

    @property
    @pulumi.getter(name="groupsAttribute")
    def groups_attribute(self) -> pulumi.Output[Optional[str]]:
        """
        IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        """
        return pulumi.get(self, "groups_attribute")

    @property
    @pulumi.getter(name="groupsFilters")
    def groups_filters(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        """
        return pulumi.get(self, "groups_filters")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        """
        URI that identifies the issuer.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="issuerMode")
    def issuer_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        """
        return pulumi.get(self, "issuer_mode")

    @property
    @pulumi.getter
    def kid(self) -> pulumi.Output[str]:
        """
        The ID of the signing key.
        """
        return pulumi.get(self, "kid")

    @property
    @pulumi.getter(name="maxClockSkew")
    def max_clock_skew(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum allowable clock-skew when processing messages from the IdP.
        """
        return pulumi.get(self, "max_clock_skew")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Application's display name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameFormat")
    def name_format(self) -> pulumi.Output[Optional[str]]:
        """
        The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        """
        return pulumi.get(self, "name_format")

    @property
    @pulumi.getter(name="profileMaster")
    def profile_master(self) -> pulumi.Output[Optional[bool]]:
        """
        Determines if the IdP should act as a source of truth for user profile attributes.
        """
        return pulumi.get(self, "profile_master")

    @property
    @pulumi.getter(name="provisioningAction")
    def provisioning_action(self) -> pulumi.Output[Optional[str]]:
        """
        Provisioning action for an IdP user during authentication.
        """
        return pulumi.get(self, "provisioning_action")

    @property
    @pulumi.getter(name="requestSignatureAlgorithm")
    def request_signature_algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        The XML digital signature algorithm used when signing an AuthnRequest message.
        """
        return pulumi.get(self, "request_signature_algorithm")

    @property
    @pulumi.getter(name="requestSignatureScope")
    def request_signature_scope(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        """
        return pulumi.get(self, "request_signature_scope")

    @property
    @pulumi.getter(name="responseSignatureAlgorithm")
    def response_signature_algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        """
        return pulumi.get(self, "response_signature_algorithm")

    @property
    @pulumi.getter(name="responseSignatureScope")
    def response_signature_scope(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        """
        return pulumi.get(self, "response_signature_scope")

    @property
    @pulumi.getter(name="ssoBinding")
    def sso_binding(self) -> pulumi.Output[Optional[str]]:
        """
        The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        """
        return pulumi.get(self, "sso_binding")

    @property
    @pulumi.getter(name="ssoDestination")
    def sso_destination(self) -> pulumi.Output[Optional[str]]:
        """
        URI reference indicating the address to which the AuthnRequest message is sent.
        """
        return pulumi.get(self, "sso_destination")

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> pulumi.Output[str]:
        """
        URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        """
        return pulumi.get(self, "sso_url")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        Status of the IdP.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subjectFilter")
    def subject_filter(self) -> pulumi.Output[Optional[str]]:
        """
        Optional regular expression pattern used to filter untrusted IdP usernames.
        """
        return pulumi.get(self, "subject_filter")

    @property
    @pulumi.getter(name="subjectFormats")
    def subject_formats(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        """
        return pulumi.get(self, "subject_formats")

    @property
    @pulumi.getter(name="subjectMatchAttribute")
    def subject_match_attribute(self) -> pulumi.Output[Optional[str]]:
        """
        Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        """
        return pulumi.get(self, "subject_match_attribute")

    @property
    @pulumi.getter(name="subjectMatchType")
    def subject_match_type(self) -> pulumi.Output[Optional[str]]:
        """
        Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        """
        return pulumi.get(self, "subject_match_type")

    @property
    @pulumi.getter(name="suspendedAction")
    def suspended_action(self) -> pulumi.Output[Optional[str]]:
        """
        Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        """
        return pulumi.get(self, "suspended_action")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the IdP.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="usernameTemplate")
    def username_template(self) -> pulumi.Output[Optional[str]]:
        """
        Okta EL Expression to generate or transform a unique username for the IdP user.
        """
        return pulumi.get(self, "username_template")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

