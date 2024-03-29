// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.App
{
    public static class GetSaml
    {
        /// <summary>
        /// Use this data source to retrieve an SAML application from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.App.GetSaml.Invoke(new()
        ///     {
        ///         Label = "Example App",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSamlResult> InvokeAsync(GetSamlArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSamlResult>("okta:app/getSaml:getSaml", args ?? new GetSamlArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve an SAML application from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.App.GetSaml.Invoke(new()
        ///     {
        ///         Label = "Example App",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSamlResult> Invoke(GetSamlInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSamlResult>("okta:app/getSaml:getSaml", args ?? new GetSamlInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSamlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// tells the provider to query for only `ACTIVE` applications.
        /// </summary>
        [Input("activeOnly")]
        public bool? ActiveOnly { get; set; }

        /// <summary>
        /// `id` of application to retrieve, conflicts with `label` and `label_prefix`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The label of the app to retrieve, conflicts with `label_prefix` and `id`. Label uses
        /// the `?q=&lt;label&gt;` query parameter exposed by Okta's API. It should be noted that at this time this searches both `name`
        /// and `label`. This is used to avoid paginating through all applications.
        /// </summary>
        [Input("label")]
        public string? Label { get; set; }

        /// <summary>
        /// Label prefix of the app to retrieve, conflicts with `label` and `id`. This will tell the
        /// provider to do a `starts with` query as opposed to an `equals` query.
        /// </summary>
        [Input("labelPrefix")]
        public string? LabelPrefix { get; set; }

        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        [Input("requestCompressed")]
        public bool? RequestCompressed { get; set; }

        [Input("skipGroups")]
        public bool? SkipGroups { get; set; }

        [Input("skipUsers")]
        public bool? SkipUsers { get; set; }

        public GetSamlArgs()
        {
        }
        public static new GetSamlArgs Empty => new GetSamlArgs();
    }

    public sealed class GetSamlInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// tells the provider to query for only `ACTIVE` applications.
        /// </summary>
        [Input("activeOnly")]
        public Input<bool>? ActiveOnly { get; set; }

        /// <summary>
        /// `id` of application to retrieve, conflicts with `label` and `label_prefix`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The label of the app to retrieve, conflicts with `label_prefix` and `id`. Label uses
        /// the `?q=&lt;label&gt;` query parameter exposed by Okta's API. It should be noted that at this time this searches both `name`
        /// and `label`. This is used to avoid paginating through all applications.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Label prefix of the app to retrieve, conflicts with `label` and `id`. This will tell the
        /// provider to do a `starts with` query as opposed to an `equals` query.
        /// </summary>
        [Input("labelPrefix")]
        public Input<string>? LabelPrefix { get; set; }

        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        [Input("requestCompressed")]
        public Input<bool>? RequestCompressed { get; set; }

        [Input("skipGroups")]
        public Input<bool>? SkipGroups { get; set; }

        [Input("skipUsers")]
        public Input<bool>? SkipUsers { get; set; }

        public GetSamlInvokeArgs()
        {
        }
        public static new GetSamlInvokeArgs Empty => new GetSamlInvokeArgs();
    }


    [OutputType]
    public sealed class GetSamlResult
    {
        /// <summary>
        /// Custom error page URL.
        /// </summary>
        public readonly string AccessibilityErrorRedirectUrl;
        /// <summary>
        /// Custom login page URL.
        /// </summary>
        public readonly string AccessibilityLoginRedirectUrl;
        /// <summary>
        /// Enable self-service.
        /// </summary>
        public readonly bool AccessibilitySelfService;
        /// <summary>
        /// An array of ACS endpoints. You can configure a maximum of 100 endpoints.
        /// </summary>
        public readonly ImmutableArray<string> AcsEndpoints;
        public readonly bool? ActiveOnly;
        /// <summary>
        /// Application settings in JSON format.
        /// </summary>
        public readonly string AppSettingsJson;
        /// <summary>
        /// Determines whether the SAML assertion is digitally signed.
        /// </summary>
        public readonly bool AssertionSigned;
        /// <summary>
        /// List of SAML Attribute statements.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSamlAttributeStatementResult> AttributeStatements;
        /// <summary>
        /// Audience restriction.
        /// </summary>
        public readonly string Audience;
        /// <summary>
        /// Identifies the SAML authentication context class for the assertion’s authentication statement.
        /// </summary>
        public readonly string AuthnContextClassRef;
        /// <summary>
        /// Display auto submit toolbar.
        /// </summary>
        public readonly bool AutoSubmitToolbar;
        /// <summary>
        /// Identifies a specific application resource in an IDP initiated SSO scenario.
        /// </summary>
        public readonly string DefaultRelayState;
        /// <summary>
        /// Identifies the location where the SAML response is intended to be sent inside the SAML assertion.
        /// </summary>
        public readonly string Destination;
        /// <summary>
        /// Determines the digest algorithm used to digitally sign the SAML assertion and response.
        /// </summary>
        public readonly string DigestAlgorithm;
        /// <summary>
        /// features enabled.
        /// </summary>
        public readonly ImmutableArray<string> Features;
        /// <summary>
        /// List of groups IDs assigned to the application.
        /// </summary>
        public readonly ImmutableArray<string> Groups;
        /// <summary>
        /// Do not display application icon on mobile app.
        /// </summary>
        public readonly bool HideIos;
        /// <summary>
        /// Do not display application icon to users
        /// </summary>
        public readonly bool HideWeb;
        /// <summary>
        /// Prompt user to re-authenticate if SP asks for it.
        /// </summary>
        public readonly bool HonorForceAuthn;
        /// <summary>
        /// id of application.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// SAML issuer ID.
        /// </summary>
        public readonly string IdpIssuer;
        /// <summary>
        /// Saml Inline Hook associated with the application.
        /// </summary>
        public readonly string InlineHookId;
        /// <summary>
        /// Certificate key ID.
        /// </summary>
        public readonly string KeyId;
        /// <summary>
        /// label of application.
        /// </summary>
        public readonly string? Label;
        public readonly string? LabelPrefix;
        /// <summary>
        /// Generic JSON containing discoverable resources related to the app.
        /// </summary>
        public readonly string Links;
        /// <summary>
        /// name of application.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The location where the app may present the SAML assertion.
        /// </summary>
        public readonly string Recipient;
        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        public readonly bool? RequestCompressed;
        /// <summary>
        /// Determines whether the SAML auth response message is digitally signed.
        /// </summary>
        public readonly bool ResponseSigned;
        /// <summary>
        /// SAML Signed Request enabled
        /// </summary>
        public readonly bool SamlSignedRequestEnabled;
        /// <summary>
        /// Signature algorithm used ot digitally sign the assertion and response.
        /// </summary>
        public readonly string SignatureAlgorithm;
        /// <summary>
        /// x509 encoded certificate that the Service Provider uses to sign Single Logout requests.
        /// </summary>
        public readonly string SingleLogoutCertificate;
        /// <summary>
        /// The issuer of the Service Provider that generates the Single Logout request.
        /// </summary>
        public readonly string SingleLogoutIssuer;
        /// <summary>
        /// The location where the logout response is sent.
        /// </summary>
        public readonly string SingleLogoutUrl;
        public readonly bool? SkipGroups;
        public readonly bool? SkipUsers;
        /// <summary>
        /// SAML service provider issuer.
        /// </summary>
        public readonly string SpIssuer;
        /// <summary>
        /// Single Sign-on Url.
        /// </summary>
        public readonly string SsoUrl;
        /// <summary>
        /// status of application.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Identifies the SAML processing rules.
        /// </summary>
        public readonly string SubjectNameIdFormat;
        /// <summary>
        /// Template for app user's username when a user is assigned to the app.
        /// </summary>
        public readonly string SubjectNameIdTemplate;
        /// <summary>
        /// Username template.
        /// </summary>
        public readonly string UserNameTemplate;
        /// <summary>
        /// Push username on update.
        /// </summary>
        public readonly string UserNameTemplatePushStatus;
        /// <summary>
        /// Username template suffix.
        /// </summary>
        public readonly string UserNameTemplateSuffix;
        /// <summary>
        /// Username template type.
        /// </summary>
        public readonly string UserNameTemplateType;
        public readonly ImmutableArray<string> Users;

        [OutputConstructor]
        private GetSamlResult(
            string accessibilityErrorRedirectUrl,

            string accessibilityLoginRedirectUrl,

            bool accessibilitySelfService,

            ImmutableArray<string> acsEndpoints,

            bool? activeOnly,

            string appSettingsJson,

            bool assertionSigned,

            ImmutableArray<Outputs.GetSamlAttributeStatementResult> attributeStatements,

            string audience,

            string authnContextClassRef,

            bool autoSubmitToolbar,

            string defaultRelayState,

            string destination,

            string digestAlgorithm,

            ImmutableArray<string> features,

            ImmutableArray<string> groups,

            bool hideIos,

            bool hideWeb,

            bool honorForceAuthn,

            string? id,

            string idpIssuer,

            string inlineHookId,

            string keyId,

            string? label,

            string? labelPrefix,

            string links,

            string name,

            string recipient,

            bool? requestCompressed,

            bool responseSigned,

            bool samlSignedRequestEnabled,

            string signatureAlgorithm,

            string singleLogoutCertificate,

            string singleLogoutIssuer,

            string singleLogoutUrl,

            bool? skipGroups,

            bool? skipUsers,

            string spIssuer,

            string ssoUrl,

            string status,

            string subjectNameIdFormat,

            string subjectNameIdTemplate,

            string userNameTemplate,

            string userNameTemplatePushStatus,

            string userNameTemplateSuffix,

            string userNameTemplateType,

            ImmutableArray<string> users)
        {
            AccessibilityErrorRedirectUrl = accessibilityErrorRedirectUrl;
            AccessibilityLoginRedirectUrl = accessibilityLoginRedirectUrl;
            AccessibilitySelfService = accessibilitySelfService;
            AcsEndpoints = acsEndpoints;
            ActiveOnly = activeOnly;
            AppSettingsJson = appSettingsJson;
            AssertionSigned = assertionSigned;
            AttributeStatements = attributeStatements;
            Audience = audience;
            AuthnContextClassRef = authnContextClassRef;
            AutoSubmitToolbar = autoSubmitToolbar;
            DefaultRelayState = defaultRelayState;
            Destination = destination;
            DigestAlgorithm = digestAlgorithm;
            Features = features;
            Groups = groups;
            HideIos = hideIos;
            HideWeb = hideWeb;
            HonorForceAuthn = honorForceAuthn;
            Id = id;
            IdpIssuer = idpIssuer;
            InlineHookId = inlineHookId;
            KeyId = keyId;
            Label = label;
            LabelPrefix = labelPrefix;
            Links = links;
            Name = name;
            Recipient = recipient;
            RequestCompressed = requestCompressed;
            ResponseSigned = responseSigned;
            SamlSignedRequestEnabled = samlSignedRequestEnabled;
            SignatureAlgorithm = signatureAlgorithm;
            SingleLogoutCertificate = singleLogoutCertificate;
            SingleLogoutIssuer = singleLogoutIssuer;
            SingleLogoutUrl = singleLogoutUrl;
            SkipGroups = skipGroups;
            SkipUsers = skipUsers;
            SpIssuer = spIssuer;
            SsoUrl = ssoUrl;
            Status = status;
            SubjectNameIdFormat = subjectNameIdFormat;
            SubjectNameIdTemplate = subjectNameIdTemplate;
            UserNameTemplate = userNameTemplate;
            UserNameTemplatePushStatus = userNameTemplatePushStatus;
            UserNameTemplateSuffix = userNameTemplateSuffix;
            UserNameTemplateType = userNameTemplateType;
            Users = users;
        }
    }
}
