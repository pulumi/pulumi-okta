// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Deprecated
{
    [OktaResourceType("okta:deprecated/socialIdp:SocialIdp")]
    public partial class SocialIdp : Pulumi.CustomResource
    {
        [Output("accountLinkAction")]
        public Output<string?> AccountLinkAction { get; private set; } = null!;

        [Output("accountLinkGroupIncludes")]
        public Output<ImmutableArray<string>> AccountLinkGroupIncludes { get; private set; } = null!;

        [Output("authorizationBinding")]
        public Output<string> AuthorizationBinding { get; private set; } = null!;

        [Output("authorizationUrl")]
        public Output<string> AuthorizationUrl { get; private set; } = null!;

        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        [Output("clientSecret")]
        public Output<string?> ClientSecret { get; private set; } = null!;

        [Output("deprovisionedAction")]
        public Output<string?> DeprovisionedAction { get; private set; } = null!;

        [Output("groupsAction")]
        public Output<string?> GroupsAction { get; private set; } = null!;

        [Output("groupsAssignments")]
        public Output<ImmutableArray<string>> GroupsAssignments { get; private set; } = null!;

        [Output("groupsAttribute")]
        public Output<string?> GroupsAttribute { get; private set; } = null!;

        [Output("groupsFilters")]
        public Output<ImmutableArray<string>> GroupsFilters { get; private set; } = null!;

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL
        /// </summary>
        [Output("issuerMode")]
        public Output<string?> IssuerMode { get; private set; } = null!;

        [Output("matchAttribute")]
        public Output<string?> MatchAttribute { get; private set; } = null!;

        [Output("matchType")]
        public Output<string?> MatchType { get; private set; } = null!;

        [Output("maxClockSkew")]
        public Output<int?> MaxClockSkew { get; private set; } = null!;

        /// <summary>
        /// name of idp
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("profileMaster")]
        public Output<bool?> ProfileMaster { get; private set; } = null!;

        [Output("protocolType")]
        public Output<string?> ProtocolType { get; private set; } = null!;

        [Output("provisioningAction")]
        public Output<string?> ProvisioningAction { get; private set; } = null!;

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Output("requestSignatureAlgorithm")]
        public Output<string?> RequestSignatureAlgorithm { get; private set; } = null!;

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Output("requestSignatureScope")]
        public Output<string?> RequestSignatureScope { get; private set; } = null!;

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Output("responseSignatureAlgorithm")]
        public Output<string?> ResponseSignatureAlgorithm { get; private set; } = null!;

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Output("responseSignatureScope")]
        public Output<string?> ResponseSignatureScope { get; private set; } = null!;

        [Output("scopes")]
        public Output<ImmutableArray<string>> Scopes { get; private set; } = null!;

        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        [Output("subjectMatchAttribute")]
        public Output<string?> SubjectMatchAttribute { get; private set; } = null!;

        [Output("subjectMatchType")]
        public Output<string?> SubjectMatchType { get; private set; } = null!;

        [Output("suspendedAction")]
        public Output<string?> SuspendedAction { get; private set; } = null!;

        [Output("tokenBinding")]
        public Output<string> TokenBinding { get; private set; } = null!;

        [Output("tokenUrl")]
        public Output<string> TokenUrl { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("usernameTemplate")]
        public Output<string?> UsernameTemplate { get; private set; } = null!;


        /// <summary>
        /// Create a SocialIdp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SocialIdp(string name, SocialIdpArgs args, CustomResourceOptions? options = null)
            : base("okta:deprecated/socialIdp:SocialIdp", name, args ?? new SocialIdpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SocialIdp(string name, Input<string> id, SocialIdpState? state = null, CustomResourceOptions? options = null)
            : base("okta:deprecated/socialIdp:SocialIdp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SocialIdp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SocialIdp Get(string name, Input<string> id, SocialIdpState? state = null, CustomResourceOptions? options = null)
        {
            return new SocialIdp(name, id, state, options);
        }
    }

    public sealed class SocialIdpArgs : Pulumi.ResourceArgs
    {
        [Input("accountLinkAction")]
        public Input<string>? AccountLinkAction { get; set; }

        [Input("accountLinkGroupIncludes")]
        private InputList<string>? _accountLinkGroupIncludes;
        public InputList<string> AccountLinkGroupIncludes
        {
            get => _accountLinkGroupIncludes ?? (_accountLinkGroupIncludes = new InputList<string>());
            set => _accountLinkGroupIncludes = value;
        }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("deprovisionedAction")]
        public Input<string>? DeprovisionedAction { get; set; }

        [Input("groupsAction")]
        public Input<string>? GroupsAction { get; set; }

        [Input("groupsAssignments")]
        private InputList<string>? _groupsAssignments;
        public InputList<string> GroupsAssignments
        {
            get => _groupsAssignments ?? (_groupsAssignments = new InputList<string>());
            set => _groupsAssignments = value;
        }

        [Input("groupsAttribute")]
        public Input<string>? GroupsAttribute { get; set; }

        [Input("groupsFilters")]
        private InputList<string>? _groupsFilters;
        public InputList<string> GroupsFilters
        {
            get => _groupsFilters ?? (_groupsFilters = new InputList<string>());
            set => _groupsFilters = value;
        }

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        [Input("matchAttribute")]
        public Input<string>? MatchAttribute { get; set; }

        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("maxClockSkew")]
        public Input<int>? MaxClockSkew { get; set; }

        /// <summary>
        /// name of idp
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("profileMaster")]
        public Input<bool>? ProfileMaster { get; set; }

        [Input("protocolType")]
        public Input<string>? ProtocolType { get; set; }

        [Input("provisioningAction")]
        public Input<string>? ProvisioningAction { get; set; }

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Input("requestSignatureAlgorithm")]
        public Input<string>? RequestSignatureAlgorithm { get; set; }

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Input("requestSignatureScope")]
        public Input<string>? RequestSignatureScope { get; set; }

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Input("responseSignatureAlgorithm")]
        public Input<string>? ResponseSignatureAlgorithm { get; set; }

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Input("responseSignatureScope")]
        public Input<string>? ResponseSignatureScope { get; set; }

        [Input("scopes", required: true)]
        private InputList<string>? _scopes;
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("subjectMatchAttribute")]
        public Input<string>? SubjectMatchAttribute { get; set; }

        [Input("subjectMatchType")]
        public Input<string>? SubjectMatchType { get; set; }

        [Input("suspendedAction")]
        public Input<string>? SuspendedAction { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SocialIdpArgs()
        {
        }
    }

    public sealed class SocialIdpState : Pulumi.ResourceArgs
    {
        [Input("accountLinkAction")]
        public Input<string>? AccountLinkAction { get; set; }

        [Input("accountLinkGroupIncludes")]
        private InputList<string>? _accountLinkGroupIncludes;
        public InputList<string> AccountLinkGroupIncludes
        {
            get => _accountLinkGroupIncludes ?? (_accountLinkGroupIncludes = new InputList<string>());
            set => _accountLinkGroupIncludes = value;
        }

        [Input("authorizationBinding")]
        public Input<string>? AuthorizationBinding { get; set; }

        [Input("authorizationUrl")]
        public Input<string>? AuthorizationUrl { get; set; }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("deprovisionedAction")]
        public Input<string>? DeprovisionedAction { get; set; }

        [Input("groupsAction")]
        public Input<string>? GroupsAction { get; set; }

        [Input("groupsAssignments")]
        private InputList<string>? _groupsAssignments;
        public InputList<string> GroupsAssignments
        {
            get => _groupsAssignments ?? (_groupsAssignments = new InputList<string>());
            set => _groupsAssignments = value;
        }

        [Input("groupsAttribute")]
        public Input<string>? GroupsAttribute { get; set; }

        [Input("groupsFilters")]
        private InputList<string>? _groupsFilters;
        public InputList<string> GroupsFilters
        {
            get => _groupsFilters ?? (_groupsFilters = new InputList<string>());
            set => _groupsFilters = value;
        }

        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        [Input("matchAttribute")]
        public Input<string>? MatchAttribute { get; set; }

        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("maxClockSkew")]
        public Input<int>? MaxClockSkew { get; set; }

        /// <summary>
        /// name of idp
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("profileMaster")]
        public Input<bool>? ProfileMaster { get; set; }

        [Input("protocolType")]
        public Input<string>? ProtocolType { get; set; }

        [Input("provisioningAction")]
        public Input<string>? ProvisioningAction { get; set; }

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Input("requestSignatureAlgorithm")]
        public Input<string>? RequestSignatureAlgorithm { get; set; }

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Input("requestSignatureScope")]
        public Input<string>? RequestSignatureScope { get; set; }

        /// <summary>
        /// algorithm to use to sign requests
        /// </summary>
        [Input("responseSignatureAlgorithm")]
        public Input<string>? ResponseSignatureAlgorithm { get; set; }

        /// <summary>
        /// algorithm to use to sign response
        /// </summary>
        [Input("responseSignatureScope")]
        public Input<string>? ResponseSignatureScope { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("subjectMatchAttribute")]
        public Input<string>? SubjectMatchAttribute { get; set; }

        [Input("subjectMatchType")]
        public Input<string>? SubjectMatchType { get; set; }

        [Input("suspendedAction")]
        public Input<string>? SuspendedAction { get; set; }

        [Input("tokenBinding")]
        public Input<string>? TokenBinding { get; set; }

        [Input("tokenUrl")]
        public Input<string>? TokenUrl { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SocialIdpState()
        {
        }
    }
}
