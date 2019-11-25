// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.App
{
    /// <summary>
    /// Creates an SAML Application.
    /// 
    /// This resource allows you to create and configure an SAML Application.
    /// 
    /// &gt; This content is derived from https://github.com/articulate/terraform-provider-okta/blob/master/website/docs/r/app_saml.html.markdown.
    /// </summary>
    public partial class Saml : Pulumi.CustomResource
    {
        /// <summary>
        /// Custom error page URL.
        /// </summary>
        [Output("accessibilityErrorRedirectUrl")]
        public Output<string?> AccessibilityErrorRedirectUrl { get; private set; } = null!;

        /// <summary>
        /// Custom login page URL.
        /// </summary>
        [Output("accessibilityLoginRedirectUrl")]
        public Output<string?> AccessibilityLoginRedirectUrl { get; private set; } = null!;

        /// <summary>
        /// Enable self service.
        /// </summary>
        [Output("accessibilitySelfService")]
        public Output<bool?> AccessibilitySelfService { get; private set; } = null!;

        /// <summary>
        /// Application settings in JSON format.
        /// </summary>
        [Output("appSettingsJson")]
        public Output<string?> AppSettingsJson { get; private set; } = null!;

        /// <summary>
        /// Determines whether the SAML assertion is digitally signed.
        /// </summary>
        [Output("assertionSigned")]
        public Output<bool?> AssertionSigned { get; private set; } = null!;

        /// <summary>
        /// List of SAML Attribute statements.
        /// </summary>
        [Output("attributeStatements")]
        public Output<ImmutableArray<Outputs.SamlAttributeStatements>> AttributeStatements { get; private set; } = null!;

        /// <summary>
        /// Audience restriction.
        /// </summary>
        [Output("audience")]
        public Output<string?> Audience { get; private set; } = null!;

        /// <summary>
        /// Identifies the SAML authentication context class for the assertion’s authentication statement.
        /// </summary>
        [Output("authnContextClassRef")]
        public Output<string?> AuthnContextClassRef { get; private set; } = null!;

        /// <summary>
        /// Display auto submit toolbar.
        /// </summary>
        [Output("autoSubmitToolbar")]
        public Output<bool?> AutoSubmitToolbar { get; private set; } = null!;

        /// <summary>
        /// The raw signing certificate.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Identifies a specific application resource in an IDP initiated SSO scenario.
        /// </summary>
        [Output("defaultRelayState")]
        public Output<string?> DefaultRelayState { get; private set; } = null!;

        /// <summary>
        /// Identifies the location where the SAML response is intended to be sent inside of the SAML assertion.
        /// </summary>
        [Output("destination")]
        public Output<string?> Destination { get; private set; } = null!;

        /// <summary>
        /// Determines the digest algorithm used to digitally sign the SAML assertion and response.
        /// </summary>
        [Output("digestAlgorithm")]
        public Output<string?> DigestAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Entity ID, the ID portion of the `entity_url`.
        /// </summary>
        [Output("entityKey")]
        public Output<string> EntityKey { get; private set; } = null!;

        /// <summary>
        /// Entity URL for instance http://www.okta.com/exk1fcia6d6EMsf331d8.
        /// </summary>
        [Output("entityUrl")]
        public Output<string> EntityUrl { get; private set; } = null!;

        /// <summary>
        /// features enabled.
        /// </summary>
        [Output("features")]
        public Output<ImmutableArray<string>> Features { get; private set; } = null!;

        /// <summary>
        /// Groups associated with the application
        /// </summary>
        [Output("groups")]
        public Output<ImmutableArray<string>> Groups { get; private set; } = null!;

        /// <summary>
        /// Do not display application icon on mobile app.
        /// </summary>
        [Output("hideIos")]
        public Output<bool?> HideIos { get; private set; } = null!;

        /// <summary>
        /// Do not display application icon to users
        /// </summary>
        [Output("hideWeb")]
        public Output<bool?> HideWeb { get; private set; } = null!;

        /// <summary>
        /// Prompt user to re-authenticate if SP asks for it.
        /// </summary>
        [Output("honorForceAuthn")]
        public Output<bool?> HonorForceAuthn { get; private set; } = null!;

        /// <summary>
        /// `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Post` location from the SAML metadata.
        /// </summary>
        [Output("httpPostBinding")]
        public Output<string> HttpPostBinding { get; private set; } = null!;

        /// <summary>
        /// `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect` location from the SAML metadata.
        /// </summary>
        [Output("httpRedirectBinding")]
        public Output<string> HttpRedirectBinding { get; private set; } = null!;

        /// <summary>
        /// SAML issuer ID.
        /// </summary>
        [Output("idpIssuer")]
        public Output<string?> IdpIssuer { get; private set; } = null!;

        /// <summary>
        /// Certificate key ID.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// Certificate name. This modulates the rotation of keys. New name == new key.
        /// </summary>
        [Output("keyName")]
        public Output<string?> KeyName { get; private set; } = null!;

        /// <summary>
        /// Number of years the certificate is valid.
        /// </summary>
        [Output("keyYearsValid")]
        public Output<int?> KeyYearsValid { get; private set; } = null!;

        /// <summary>
        /// label of application.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The raw SAML metadata in XML.
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of the attribute statement.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// name of application from the Okta Integration Network, if not included a custom app will be created.
        /// </summary>
        [Output("preconfiguredApp")]
        public Output<string?> PreconfiguredApp { get; private set; } = null!;

        /// <summary>
        /// The location where the app may present the SAML assertion.
        /// </summary>
        [Output("recipient")]
        public Output<string?> Recipient { get; private set; } = null!;

        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        [Output("requestCompressed")]
        public Output<bool?> RequestCompressed { get; private set; } = null!;

        /// <summary>
        /// Determines whether the SAML auth response message is digitally signed.
        /// </summary>
        [Output("responseSigned")]
        public Output<bool?> ResponseSigned { get; private set; } = null!;

        /// <summary>
        /// Sign on mode of application.
        /// </summary>
        [Output("signOnMode")]
        public Output<string> SignOnMode { get; private set; } = null!;

        /// <summary>
        /// Signature algorithm used ot digitally sign the assertion and response.
        /// </summary>
        [Output("signatureAlgorithm")]
        public Output<string?> SignatureAlgorithm { get; private set; } = null!;

        /// <summary>
        /// SAML service provider issuer.
        /// </summary>
        [Output("spIssuer")]
        public Output<string?> SpIssuer { get; private set; } = null!;

        /// <summary>
        /// Single Sign on Url.
        /// </summary>
        [Output("ssoUrl")]
        public Output<string?> SsoUrl { get; private set; } = null!;

        /// <summary>
        /// status of application.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Identifies the SAML processing rules.
        /// </summary>
        [Output("subjectNameIdFormat")]
        public Output<string?> SubjectNameIdFormat { get; private set; } = null!;

        /// <summary>
        /// Template for app user's username when a user is assigned to the app.
        /// </summary>
        [Output("subjectNameIdTemplate")]
        public Output<string?> SubjectNameIdTemplate { get; private set; } = null!;

        /// <summary>
        /// Username template.
        /// </summary>
        [Output("userNameTemplate")]
        public Output<string?> UserNameTemplate { get; private set; } = null!;

        /// <summary>
        /// Username template suffix.
        /// </summary>
        [Output("userNameTemplateSuffix")]
        public Output<string?> UserNameTemplateSuffix { get; private set; } = null!;

        /// <summary>
        /// Username template type.
        /// </summary>
        [Output("userNameTemplateType")]
        public Output<string?> UserNameTemplateType { get; private set; } = null!;

        /// <summary>
        /// Users associated with the application
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<Outputs.SamlUsers>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a Saml resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Saml(string name, SamlArgs args, CustomResourceOptions? options = null)
            : base("okta:app/saml:Saml", name, args, MakeResourceOptions(options, ""))
        {
        }

        private Saml(string name, Input<string> id, SamlState? state = null, CustomResourceOptions? options = null)
            : base("okta:app/saml:Saml", name, state, MakeResourceOptions(options, id))
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
        /// Custom error page URL.
        /// </summary>
        [Input("accessibilityErrorRedirectUrl")]
        public Input<string>? AccessibilityErrorRedirectUrl { get; set; }

        /// <summary>
        /// Custom login page URL.
        /// </summary>
        [Input("accessibilityLoginRedirectUrl")]
        public Input<string>? AccessibilityLoginRedirectUrl { get; set; }

        /// <summary>
        /// Enable self service.
        /// </summary>
        [Input("accessibilitySelfService")]
        public Input<bool>? AccessibilitySelfService { get; set; }

        /// <summary>
        /// Application settings in JSON format.
        /// </summary>
        [Input("appSettingsJson")]
        public Input<string>? AppSettingsJson { get; set; }

        /// <summary>
        /// Determines whether the SAML assertion is digitally signed.
        /// </summary>
        [Input("assertionSigned")]
        public Input<bool>? AssertionSigned { get; set; }

        [Input("attributeStatements")]
        private InputList<Inputs.SamlAttributeStatementsArgs>? _attributeStatements;

        /// <summary>
        /// List of SAML Attribute statements.
        /// </summary>
        public InputList<Inputs.SamlAttributeStatementsArgs> AttributeStatements
        {
            get => _attributeStatements ?? (_attributeStatements = new InputList<Inputs.SamlAttributeStatementsArgs>());
            set => _attributeStatements = value;
        }

        /// <summary>
        /// Audience restriction.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Identifies the SAML authentication context class for the assertion’s authentication statement.
        /// </summary>
        [Input("authnContextClassRef")]
        public Input<string>? AuthnContextClassRef { get; set; }

        /// <summary>
        /// Display auto submit toolbar.
        /// </summary>
        [Input("autoSubmitToolbar")]
        public Input<bool>? AutoSubmitToolbar { get; set; }

        /// <summary>
        /// Identifies a specific application resource in an IDP initiated SSO scenario.
        /// </summary>
        [Input("defaultRelayState")]
        public Input<string>? DefaultRelayState { get; set; }

        /// <summary>
        /// Identifies the location where the SAML response is intended to be sent inside of the SAML assertion.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// Determines the digest algorithm used to digitally sign the SAML assertion and response.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        [Input("features")]
        private InputList<string>? _features;

        /// <summary>
        /// features enabled.
        /// </summary>
        public InputList<string> Features
        {
            get => _features ?? (_features = new InputList<string>());
            set => _features = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// Groups associated with the application
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// Do not display application icon on mobile app.
        /// </summary>
        [Input("hideIos")]
        public Input<bool>? HideIos { get; set; }

        /// <summary>
        /// Do not display application icon to users
        /// </summary>
        [Input("hideWeb")]
        public Input<bool>? HideWeb { get; set; }

        /// <summary>
        /// Prompt user to re-authenticate if SP asks for it.
        /// </summary>
        [Input("honorForceAuthn")]
        public Input<bool>? HonorForceAuthn { get; set; }

        /// <summary>
        /// SAML issuer ID.
        /// </summary>
        [Input("idpIssuer")]
        public Input<string>? IdpIssuer { get; set; }

        /// <summary>
        /// Certificate name. This modulates the rotation of keys. New name == new key.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// Number of years the certificate is valid.
        /// </summary>
        [Input("keyYearsValid")]
        public Input<int>? KeyYearsValid { get; set; }

        /// <summary>
        /// label of application.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// name of application from the Okta Integration Network, if not included a custom app will be created.
        /// </summary>
        [Input("preconfiguredApp")]
        public Input<string>? PreconfiguredApp { get; set; }

        /// <summary>
        /// The location where the app may present the SAML assertion.
        /// </summary>
        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        [Input("requestCompressed")]
        public Input<bool>? RequestCompressed { get; set; }

        /// <summary>
        /// Determines whether the SAML auth response message is digitally signed.
        /// </summary>
        [Input("responseSigned")]
        public Input<bool>? ResponseSigned { get; set; }

        /// <summary>
        /// Signature algorithm used ot digitally sign the assertion and response.
        /// </summary>
        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        /// <summary>
        /// SAML service provider issuer.
        /// </summary>
        [Input("spIssuer")]
        public Input<string>? SpIssuer { get; set; }

        /// <summary>
        /// Single Sign on Url.
        /// </summary>
        [Input("ssoUrl")]
        public Input<string>? SsoUrl { get; set; }

        /// <summary>
        /// status of application.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Identifies the SAML processing rules.
        /// </summary>
        [Input("subjectNameIdFormat")]
        public Input<string>? SubjectNameIdFormat { get; set; }

        /// <summary>
        /// Template for app user's username when a user is assigned to the app.
        /// </summary>
        [Input("subjectNameIdTemplate")]
        public Input<string>? SubjectNameIdTemplate { get; set; }

        /// <summary>
        /// Username template.
        /// </summary>
        [Input("userNameTemplate")]
        public Input<string>? UserNameTemplate { get; set; }

        /// <summary>
        /// Username template suffix.
        /// </summary>
        [Input("userNameTemplateSuffix")]
        public Input<string>? UserNameTemplateSuffix { get; set; }

        /// <summary>
        /// Username template type.
        /// </summary>
        [Input("userNameTemplateType")]
        public Input<string>? UserNameTemplateType { get; set; }

        [Input("users")]
        private InputList<Inputs.SamlUsersArgs>? _users;

        /// <summary>
        /// Users associated with the application
        /// </summary>
        public InputList<Inputs.SamlUsersArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.SamlUsersArgs>());
            set => _users = value;
        }

        public SamlArgs()
        {
        }
    }

    public sealed class SamlState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom error page URL.
        /// </summary>
        [Input("accessibilityErrorRedirectUrl")]
        public Input<string>? AccessibilityErrorRedirectUrl { get; set; }

        /// <summary>
        /// Custom login page URL.
        /// </summary>
        [Input("accessibilityLoginRedirectUrl")]
        public Input<string>? AccessibilityLoginRedirectUrl { get; set; }

        /// <summary>
        /// Enable self service.
        /// </summary>
        [Input("accessibilitySelfService")]
        public Input<bool>? AccessibilitySelfService { get; set; }

        /// <summary>
        /// Application settings in JSON format.
        /// </summary>
        [Input("appSettingsJson")]
        public Input<string>? AppSettingsJson { get; set; }

        /// <summary>
        /// Determines whether the SAML assertion is digitally signed.
        /// </summary>
        [Input("assertionSigned")]
        public Input<bool>? AssertionSigned { get; set; }

        [Input("attributeStatements")]
        private InputList<Inputs.SamlAttributeStatementsGetArgs>? _attributeStatements;

        /// <summary>
        /// List of SAML Attribute statements.
        /// </summary>
        public InputList<Inputs.SamlAttributeStatementsGetArgs> AttributeStatements
        {
            get => _attributeStatements ?? (_attributeStatements = new InputList<Inputs.SamlAttributeStatementsGetArgs>());
            set => _attributeStatements = value;
        }

        /// <summary>
        /// Audience restriction.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Identifies the SAML authentication context class for the assertion’s authentication statement.
        /// </summary>
        [Input("authnContextClassRef")]
        public Input<string>? AuthnContextClassRef { get; set; }

        /// <summary>
        /// Display auto submit toolbar.
        /// </summary>
        [Input("autoSubmitToolbar")]
        public Input<bool>? AutoSubmitToolbar { get; set; }

        /// <summary>
        /// The raw signing certificate.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Identifies a specific application resource in an IDP initiated SSO scenario.
        /// </summary>
        [Input("defaultRelayState")]
        public Input<string>? DefaultRelayState { get; set; }

        /// <summary>
        /// Identifies the location where the SAML response is intended to be sent inside of the SAML assertion.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// Determines the digest algorithm used to digitally sign the SAML assertion and response.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        /// <summary>
        /// Entity ID, the ID portion of the `entity_url`.
        /// </summary>
        [Input("entityKey")]
        public Input<string>? EntityKey { get; set; }

        /// <summary>
        /// Entity URL for instance http://www.okta.com/exk1fcia6d6EMsf331d8.
        /// </summary>
        [Input("entityUrl")]
        public Input<string>? EntityUrl { get; set; }

        [Input("features")]
        private InputList<string>? _features;

        /// <summary>
        /// features enabled.
        /// </summary>
        public InputList<string> Features
        {
            get => _features ?? (_features = new InputList<string>());
            set => _features = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// Groups associated with the application
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// Do not display application icon on mobile app.
        /// </summary>
        [Input("hideIos")]
        public Input<bool>? HideIos { get; set; }

        /// <summary>
        /// Do not display application icon to users
        /// </summary>
        [Input("hideWeb")]
        public Input<bool>? HideWeb { get; set; }

        /// <summary>
        /// Prompt user to re-authenticate if SP asks for it.
        /// </summary>
        [Input("honorForceAuthn")]
        public Input<bool>? HonorForceAuthn { get; set; }

        /// <summary>
        /// `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Post` location from the SAML metadata.
        /// </summary>
        [Input("httpPostBinding")]
        public Input<string>? HttpPostBinding { get; set; }

        /// <summary>
        /// `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect` location from the SAML metadata.
        /// </summary>
        [Input("httpRedirectBinding")]
        public Input<string>? HttpRedirectBinding { get; set; }

        /// <summary>
        /// SAML issuer ID.
        /// </summary>
        [Input("idpIssuer")]
        public Input<string>? IdpIssuer { get; set; }

        /// <summary>
        /// Certificate key ID.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// Certificate name. This modulates the rotation of keys. New name == new key.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// Number of years the certificate is valid.
        /// </summary>
        [Input("keyYearsValid")]
        public Input<int>? KeyYearsValid { get; set; }

        /// <summary>
        /// label of application.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The raw SAML metadata in XML.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the attribute statement.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// name of application from the Okta Integration Network, if not included a custom app will be created.
        /// </summary>
        [Input("preconfiguredApp")]
        public Input<string>? PreconfiguredApp { get; set; }

        /// <summary>
        /// The location where the app may present the SAML assertion.
        /// </summary>
        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        /// <summary>
        /// Denotes whether the request is compressed or not.
        /// </summary>
        [Input("requestCompressed")]
        public Input<bool>? RequestCompressed { get; set; }

        /// <summary>
        /// Determines whether the SAML auth response message is digitally signed.
        /// </summary>
        [Input("responseSigned")]
        public Input<bool>? ResponseSigned { get; set; }

        /// <summary>
        /// Sign on mode of application.
        /// </summary>
        [Input("signOnMode")]
        public Input<string>? SignOnMode { get; set; }

        /// <summary>
        /// Signature algorithm used ot digitally sign the assertion and response.
        /// </summary>
        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        /// <summary>
        /// SAML service provider issuer.
        /// </summary>
        [Input("spIssuer")]
        public Input<string>? SpIssuer { get; set; }

        /// <summary>
        /// Single Sign on Url.
        /// </summary>
        [Input("ssoUrl")]
        public Input<string>? SsoUrl { get; set; }

        /// <summary>
        /// status of application.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Identifies the SAML processing rules.
        /// </summary>
        [Input("subjectNameIdFormat")]
        public Input<string>? SubjectNameIdFormat { get; set; }

        /// <summary>
        /// Template for app user's username when a user is assigned to the app.
        /// </summary>
        [Input("subjectNameIdTemplate")]
        public Input<string>? SubjectNameIdTemplate { get; set; }

        /// <summary>
        /// Username template.
        /// </summary>
        [Input("userNameTemplate")]
        public Input<string>? UserNameTemplate { get; set; }

        /// <summary>
        /// Username template suffix.
        /// </summary>
        [Input("userNameTemplateSuffix")]
        public Input<string>? UserNameTemplateSuffix { get; set; }

        /// <summary>
        /// Username template type.
        /// </summary>
        [Input("userNameTemplateType")]
        public Input<string>? UserNameTemplateType { get; set; }

        [Input("users")]
        private InputList<Inputs.SamlUsersGetArgs>? _users;

        /// <summary>
        /// Users associated with the application
        /// </summary>
        public InputList<Inputs.SamlUsersGetArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.SamlUsersGetArgs>());
            set => _users = value;
        }

        public SamlState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class SamlAttributeStatementsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of group attribute filter.
        /// </summary>
        [Input("filterType")]
        public Input<string>? FilterType { get; set; }

        /// <summary>
        /// Filter value to use.
        /// </summary>
        [Input("filterValue")]
        public Input<string>? FilterValue { get; set; }

        /// <summary>
        /// The name of the attribute statement.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The attribute namespace. It can be set to `"urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified"`, `"urn:oasis:names:tc:SAML:2.0:attrname-format:uri"`, or `"urn:oasis:names:tc:SAML:2.0:attrname-format:basic"`.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The type of attribute statement value. Can be `"EXPRESSION"` or `"GROUP"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Array of values to use.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public SamlAttributeStatementsArgs()
        {
        }
    }

    public sealed class SamlAttributeStatementsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of group attribute filter.
        /// </summary>
        [Input("filterType")]
        public Input<string>? FilterType { get; set; }

        /// <summary>
        /// Filter value to use.
        /// </summary>
        [Input("filterValue")]
        public Input<string>? FilterValue { get; set; }

        /// <summary>
        /// The name of the attribute statement.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The attribute namespace. It can be set to `"urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified"`, `"urn:oasis:names:tc:SAML:2.0:attrname-format:uri"`, or `"urn:oasis:names:tc:SAML:2.0:attrname-format:basic"`.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The type of attribute statement value. Can be `"EXPRESSION"` or `"GROUP"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Array of values to use.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public SamlAttributeStatementsGetArgs()
        {
        }
    }

    public sealed class SamlUsersArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// id of application.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public SamlUsersArgs()
        {
        }
    }

    public sealed class SamlUsersGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// id of application.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public SamlUsersGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class SamlAttributeStatements
    {
        /// <summary>
        /// Type of group attribute filter.
        /// </summary>
        public readonly string? FilterType;
        /// <summary>
        /// Filter value to use.
        /// </summary>
        public readonly string? FilterValue;
        /// <summary>
        /// The name of the attribute statement.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The attribute namespace. It can be set to `"urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified"`, `"urn:oasis:names:tc:SAML:2.0:attrname-format:uri"`, or `"urn:oasis:names:tc:SAML:2.0:attrname-format:basic"`.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// The type of attribute statement value. Can be `"EXPRESSION"` or `"GROUP"`.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Array of values to use.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private SamlAttributeStatements(
            string? filterType,
            string? filterValue,
            string name,
            string? @namespace,
            string? type,
            ImmutableArray<string> values)
        {
            FilterType = filterType;
            FilterValue = filterValue;
            Name = name;
            Namespace = @namespace;
            Type = type;
            Values = values;
        }
    }

    [OutputType]
    public sealed class SamlUsers
    {
        /// <summary>
        /// id of application.
        /// </summary>
        public readonly string? Id;
        public readonly string? Password;
        public readonly string Scope;
        public readonly string? Username;

        [OutputConstructor]
        private SamlUsers(
            string? id,
            string? password,
            string scope,
            string? username)
        {
            Id = id;
            Password = password;
            Scope = scope;
            Username = username;
        }
    }
    }
}