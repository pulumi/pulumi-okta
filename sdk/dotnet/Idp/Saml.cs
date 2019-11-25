// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Idp
{
    /// <summary>
    /// Creates a SAML Identity Provider.
    /// 
    /// This resource allows you to create and configure a SAML Identity Provider.
    /// 
    /// &gt; This content is derived from https://github.com/articulate/terraform-provider-okta/blob/master/website/docs/r/idp_saml.html.markdown.
    /// </summary>
    public partial class Saml : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the account linking action for an IdP user.
        /// </summary>
        [Output("accountLinkAction")]
        public Output<string?> AccountLinkAction { get; private set; } = null!;

        /// <summary>
        /// Group memberships to determine link candidates.
        /// </summary>
        [Output("accountLinkGroupIncludes")]
        public Output<ImmutableArray<string>> AccountLinkGroupIncludes { get; private set; } = null!;

        /// <summary>
        /// The method of making an ACS request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Output("acsBinding")]
        public Output<string> AcsBinding { get; private set; } = null!;

        /// <summary>
        /// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        /// </summary>
        [Output("acsType")]
        public Output<string?> AcsType { get; private set; } = null!;

        /// <summary>
        /// The audience restriction for the IdP.
        /// </summary>
        [Output("audience")]
        public Output<string> Audience { get; private set; } = null!;

        /// <summary>
        /// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        /// </summary>
        [Output("deprovisionedAction")]
        public Output<string?> DeprovisionedAction { get; private set; } = null!;

        /// <summary>
        /// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        /// </summary>
        [Output("groupsAction")]
        public Output<string?> GroupsAction { get; private set; } = null!;

        /// <summary>
        /// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        /// </summary>
        [Output("groupsAssignments")]
        public Output<ImmutableArray<string>> GroupsAssignments { get; private set; } = null!;

        /// <summary>
        /// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        /// </summary>
        [Output("groupsAttribute")]
        public Output<string?> GroupsAttribute { get; private set; } = null!;

        /// <summary>
        /// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        /// </summary>
        [Output("groupsFilters")]
        public Output<ImmutableArray<string>> GroupsFilters { get; private set; } = null!;

        /// <summary>
        /// URI that identifies the issuer.
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        /// </summary>
        [Output("issuerMode")]
        public Output<string?> IssuerMode { get; private set; } = null!;

        /// <summary>
        /// The ID of the signing key.
        /// </summary>
        [Output("kid")]
        public Output<string> Kid { get; private set; } = null!;

        /// <summary>
        /// The Application's display name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        [Output("nameFormat")]
        public Output<string?> NameFormat { get; private set; } = null!;

        /// <summary>
        /// Determines if the IdP should act as a source of truth for user profile attributes.
        /// </summary>
        [Output("profileMaster")]
        public Output<bool?> ProfileMaster { get; private set; } = null!;

        /// <summary>
        /// Provisioning action for an IdP user during authentication.
        /// </summary>
        [Output("provisioningAction")]
        public Output<string?> ProvisioningAction { get; private set; } = null!;

        /// <summary>
        /// The XML digital signature algorithm used when signing an AuthnRequest message.
        /// </summary>
        [Output("requestSignatureAlgorithm")]
        public Output<string?> RequestSignatureAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Specifies whether or not to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        /// </summary>
        [Output("requestSignatureScope")]
        public Output<string?> RequestSignatureScope { get; private set; } = null!;

        /// <summary>
        /// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        /// </summary>
        [Output("responseSignatureAlgorithm")]
        public Output<string?> ResponseSignatureAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        /// </summary>
        [Output("responseSignatureScope")]
        public Output<string?> ResponseSignatureScope { get; private set; } = null!;

        /// <summary>
        /// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Output("ssoBinding")]
        public Output<string?> SsoBinding { get; private set; } = null!;

        /// <summary>
        /// URI reference indicating the address to which the AuthnRequest message is sent.
        /// </summary>
        [Output("ssoDestination")]
        public Output<string?> SsoDestination { get; private set; } = null!;

        /// <summary>
        /// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        /// </summary>
        [Output("ssoUrl")]
        public Output<string> SsoUrl { get; private set; } = null!;

        /// <summary>
        /// Status of the IdP.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Optional regular expression pattern used to filter untrusted IdP usernames.
        /// </summary>
        [Output("subjectFilter")]
        public Output<string?> SubjectFilter { get; private set; } = null!;

        /// <summary>
        /// The name formate. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        [Output("subjectFormats")]
        public Output<ImmutableArray<string>> SubjectFormats { get; private set; } = null!;

        /// <summary>
        /// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Output("subjectMatchAttribute")]
        public Output<string?> SubjectMatchAttribute { get; private set; } = null!;

        /// <summary>
        /// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Output("subjectMatchType")]
        public Output<string?> SubjectMatchType { get; private set; } = null!;

        /// <summary>
        /// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        /// </summary>
        [Output("suspendedAction")]
        public Output<string?> SuspendedAction { get; private set; } = null!;

        /// <summary>
        /// Type of the IdP.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Okta EL Expression to generate or transform a unique username for the IdP user.
        /// </summary>
        [Output("usernameTemplate")]
        public Output<string?> UsernameTemplate { get; private set; } = null!;


        /// <summary>
        /// Create a Saml resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Saml(string name, SamlArgs args, CustomResourceOptions? options = null)
            : base("okta:idp/saml:Saml", name, args, MakeResourceOptions(options, ""))
        {
        }

        private Saml(string name, Input<string> id, SamlState? state = null, CustomResourceOptions? options = null)
            : base("okta:idp/saml:Saml", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Saml resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Saml Get(string name, Input<string> id, SamlState? state = null, CustomResourceOptions? options = null)
        {
            return new Saml(name, id, state, options);
        }
    }

    public sealed class SamlArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the account linking action for an IdP user.
        /// </summary>
        [Input("accountLinkAction")]
        public Input<string>? AccountLinkAction { get; set; }

        [Input("accountLinkGroupIncludes")]
        private InputList<string>? _accountLinkGroupIncludes;

        /// <summary>
        /// Group memberships to determine link candidates.
        /// </summary>
        public InputList<string> AccountLinkGroupIncludes
        {
            get => _accountLinkGroupIncludes ?? (_accountLinkGroupIncludes = new InputList<string>());
            set => _accountLinkGroupIncludes = value;
        }

        /// <summary>
        /// The method of making an ACS request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Input("acsBinding", required: true)]
        public Input<string> AcsBinding { get; set; } = null!;

        /// <summary>
        /// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        /// </summary>
        [Input("acsType")]
        public Input<string>? AcsType { get; set; }

        /// <summary>
        /// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        /// </summary>
        [Input("deprovisionedAction")]
        public Input<string>? DeprovisionedAction { get; set; }

        /// <summary>
        /// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        /// </summary>
        [Input("groupsAction")]
        public Input<string>? GroupsAction { get; set; }

        [Input("groupsAssignments")]
        private InputList<string>? _groupsAssignments;

        /// <summary>
        /// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        /// </summary>
        public InputList<string> GroupsAssignments
        {
            get => _groupsAssignments ?? (_groupsAssignments = new InputList<string>());
            set => _groupsAssignments = value;
        }

        /// <summary>
        /// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        /// </summary>
        [Input("groupsAttribute")]
        public Input<string>? GroupsAttribute { get; set; }

        [Input("groupsFilters")]
        private InputList<string>? _groupsFilters;

        /// <summary>
        /// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        /// </summary>
        public InputList<string> GroupsFilters
        {
            get => _groupsFilters ?? (_groupsFilters = new InputList<string>());
            set => _groupsFilters = value;
        }

        /// <summary>
        /// URI that identifies the issuer.
        /// </summary>
        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        /// <summary>
        /// The ID of the signing key.
        /// </summary>
        [Input("kid", required: true)]
        public Input<string> Kid { get; set; } = null!;

        /// <summary>
        /// The Application's display name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        [Input("nameFormat")]
        public Input<string>? NameFormat { get; set; }

        /// <summary>
        /// Determines if the IdP should act as a source of truth for user profile attributes.
        /// </summary>
        [Input("profileMaster")]
        public Input<bool>? ProfileMaster { get; set; }

        /// <summary>
        /// Provisioning action for an IdP user during authentication.
        /// </summary>
        [Input("provisioningAction")]
        public Input<string>? ProvisioningAction { get; set; }

        /// <summary>
        /// The XML digital signature algorithm used when signing an AuthnRequest message.
        /// </summary>
        [Input("requestSignatureAlgorithm")]
        public Input<string>? RequestSignatureAlgorithm { get; set; }

        /// <summary>
        /// Specifies whether or not to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        /// </summary>
        [Input("requestSignatureScope")]
        public Input<string>? RequestSignatureScope { get; set; }

        /// <summary>
        /// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        /// </summary>
        [Input("responseSignatureAlgorithm")]
        public Input<string>? ResponseSignatureAlgorithm { get; set; }

        /// <summary>
        /// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        /// </summary>
        [Input("responseSignatureScope")]
        public Input<string>? ResponseSignatureScope { get; set; }

        /// <summary>
        /// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Input("ssoBinding")]
        public Input<string>? SsoBinding { get; set; }

        /// <summary>
        /// URI reference indicating the address to which the AuthnRequest message is sent.
        /// </summary>
        [Input("ssoDestination")]
        public Input<string>? SsoDestination { get; set; }

        /// <summary>
        /// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        /// </summary>
        [Input("ssoUrl", required: true)]
        public Input<string> SsoUrl { get; set; } = null!;

        /// <summary>
        /// Status of the IdP.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Optional regular expression pattern used to filter untrusted IdP usernames.
        /// </summary>
        [Input("subjectFilter")]
        public Input<string>? SubjectFilter { get; set; }

        [Input("subjectFormats")]
        private InputList<string>? _subjectFormats;

        /// <summary>
        /// The name formate. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        public InputList<string> SubjectFormats
        {
            get => _subjectFormats ?? (_subjectFormats = new InputList<string>());
            set => _subjectFormats = value;
        }

        /// <summary>
        /// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Input("subjectMatchAttribute")]
        public Input<string>? SubjectMatchAttribute { get; set; }

        /// <summary>
        /// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Input("subjectMatchType")]
        public Input<string>? SubjectMatchType { get; set; }

        /// <summary>
        /// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        /// </summary>
        [Input("suspendedAction")]
        public Input<string>? SuspendedAction { get; set; }

        /// <summary>
        /// Okta EL Expression to generate or transform a unique username for the IdP user.
        /// </summary>
        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SamlArgs()
        {
        }
    }

    public sealed class SamlState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the account linking action for an IdP user.
        /// </summary>
        [Input("accountLinkAction")]
        public Input<string>? AccountLinkAction { get; set; }

        [Input("accountLinkGroupIncludes")]
        private InputList<string>? _accountLinkGroupIncludes;

        /// <summary>
        /// Group memberships to determine link candidates.
        /// </summary>
        public InputList<string> AccountLinkGroupIncludes
        {
            get => _accountLinkGroupIncludes ?? (_accountLinkGroupIncludes = new InputList<string>());
            set => _accountLinkGroupIncludes = value;
        }

        /// <summary>
        /// The method of making an ACS request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Input("acsBinding")]
        public Input<string>? AcsBinding { get; set; }

        /// <summary>
        /// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
        /// </summary>
        [Input("acsType")]
        public Input<string>? AcsType { get; set; }

        /// <summary>
        /// The audience restriction for the IdP.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
        /// </summary>
        [Input("deprovisionedAction")]
        public Input<string>? DeprovisionedAction { get; set; }

        /// <summary>
        /// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
        /// </summary>
        [Input("groupsAction")]
        public Input<string>? GroupsAction { get; set; }

        [Input("groupsAssignments")]
        private InputList<string>? _groupsAssignments;

        /// <summary>
        /// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groups_action`.
        /// </summary>
        public InputList<string> GroupsAssignments
        {
            get => _groupsAssignments ?? (_groupsAssignments = new InputList<string>());
            set => _groupsAssignments = value;
        }

        /// <summary>
        /// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
        /// </summary>
        [Input("groupsAttribute")]
        public Input<string>? GroupsAttribute { get; set; }

        [Input("groupsFilters")]
        private InputList<string>? _groupsFilters;

        /// <summary>
        /// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groups_action`.
        /// </summary>
        public InputList<string> GroupsFilters
        {
            get => _groupsFilters ?? (_groupsFilters = new InputList<string>());
            set => _groupsFilters = value;
        }

        /// <summary>
        /// URI that identifies the issuer.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        /// <summary>
        /// The ID of the signing key.
        /// </summary>
        [Input("kid")]
        public Input<string>? Kid { get; set; }

        /// <summary>
        /// The Application's display name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        [Input("nameFormat")]
        public Input<string>? NameFormat { get; set; }

        /// <summary>
        /// Determines if the IdP should act as a source of truth for user profile attributes.
        /// </summary>
        [Input("profileMaster")]
        public Input<bool>? ProfileMaster { get; set; }

        /// <summary>
        /// Provisioning action for an IdP user during authentication.
        /// </summary>
        [Input("provisioningAction")]
        public Input<string>? ProvisioningAction { get; set; }

        /// <summary>
        /// The XML digital signature algorithm used when signing an AuthnRequest message.
        /// </summary>
        [Input("requestSignatureAlgorithm")]
        public Input<string>? RequestSignatureAlgorithm { get; set; }

        /// <summary>
        /// Specifies whether or not to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
        /// </summary>
        [Input("requestSignatureScope")]
        public Input<string>? RequestSignatureScope { get; set; }

        /// <summary>
        /// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element.
        /// </summary>
        [Input("responseSignatureAlgorithm")]
        public Input<string>? ResponseSignatureAlgorithm { get; set; }

        /// <summary>
        /// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
        /// </summary>
        [Input("responseSignatureScope")]
        public Input<string>? ResponseSignatureScope { get; set; }

        /// <summary>
        /// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
        /// </summary>
        [Input("ssoBinding")]
        public Input<string>? SsoBinding { get; set; }

        /// <summary>
        /// URI reference indicating the address to which the AuthnRequest message is sent.
        /// </summary>
        [Input("ssoDestination")]
        public Input<string>? SsoDestination { get; set; }

        /// <summary>
        /// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
        /// </summary>
        [Input("ssoUrl")]
        public Input<string>? SsoUrl { get; set; }

        /// <summary>
        /// Status of the IdP.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Optional regular expression pattern used to filter untrusted IdP usernames.
        /// </summary>
        [Input("subjectFilter")]
        public Input<string>? SubjectFilter { get; set; }

        [Input("subjectFormats")]
        private InputList<string>? _subjectFormats;

        /// <summary>
        /// The name formate. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
        /// </summary>
        public InputList<string> SubjectFormats
        {
            get => _subjectFormats ?? (_subjectFormats = new InputList<string>());
            set => _subjectFormats = value;
        }

        /// <summary>
        /// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Input("subjectMatchAttribute")]
        public Input<string>? SubjectMatchAttribute { get; set; }

        /// <summary>
        /// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
        /// </summary>
        [Input("subjectMatchType")]
        public Input<string>? SubjectMatchType { get; set; }

        /// <summary>
        /// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
        /// </summary>
        [Input("suspendedAction")]
        public Input<string>? SuspendedAction { get; set; }

        /// <summary>
        /// Type of the IdP.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Okta EL Expression to generate or transform a unique username for the IdP user.
        /// </summary>
        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SamlState()
        {
        }
    }
}