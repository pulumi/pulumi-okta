// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Idp
{
    public static class GetSaml
    {
        /// <summary>
        /// Get a SAML IdP from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.Idp.GetSaml.Invoke(new()
        ///     {
        ///         Name = "Example App",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSamlResult> InvokeAsync(GetSamlArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSamlResult>("okta:idp/getSaml:getSaml", args ?? new GetSamlArgs(), options.WithDefaults());

        /// <summary>
        /// Get a SAML IdP from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.Idp.GetSaml.Invoke(new()
        ///     {
        ///         Name = "Example App",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSamlResult> Invoke(GetSamlInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSamlResult>("okta:idp/getSaml:getSaml", args ?? new GetSamlInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a SAML IdP from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.Idp.GetSaml.Invoke(new()
        ///     {
        ///         Name = "Example App",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSamlResult> Invoke(GetSamlInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSamlResult>("okta:idp/getSaml:getSaml", args ?? new GetSamlInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSamlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of idp.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name of the idp.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetSamlArgs()
        {
        }
        public static new GetSamlArgs Empty => new GetSamlArgs();
    }

    public sealed class GetSamlInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of idp.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the idp.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetSamlInvokeArgs()
        {
        }
        public static new GetSamlInvokeArgs Empty => new GetSamlInvokeArgs();
    }


    [OutputType]
    public sealed class GetSamlResult
    {
        /// <summary>
        /// ACS binding
        /// </summary>
        public readonly string AcsBinding;
        /// <summary>
        /// Determines whether to publish an instance-specific (trust) or organization (shared) ACS endpoint in the SAML metadata.
        /// </summary>
        public readonly string AcsType;
        /// <summary>
        /// URI that identifies the target Okta IdP instance (SP)
        /// </summary>
        public readonly string Audience;
        /// <summary>
        /// Id of idp.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// URI that identifies the issuer (IdP).
        /// </summary>
        public readonly string Issuer;
        /// <summary>
        /// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL in the request to the IdP.
        /// </summary>
        public readonly string IssuerMode;
        /// <summary>
        /// Key ID reference to the IdP's X.509 signature certificate.
        /// </summary>
        public readonly string Kid;
        /// <summary>
        /// Name of the idp.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Single sign-on binding.
        /// </summary>
        public readonly string SsoBinding;
        /// <summary>
        /// SSO request binding, HTTP-POST or HTTP-REDIRECT.
        /// </summary>
        public readonly string SsoDestination;
        /// <summary>
        /// Single sign-on url.
        /// </summary>
        public readonly string SsoUrl;
        /// <summary>
        /// Regular expression pattern used to filter untrusted IdP usernames.
        /// </summary>
        public readonly string SubjectFilter;
        /// <summary>
        /// Expression to generate or transform a unique username for the IdP user.
        /// </summary>
        public readonly ImmutableArray<string> SubjectFormats;
        /// <summary>
        /// Type of idp.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetSamlResult(
            string acsBinding,

            string acsType,

            string audience,

            string? id,

            string issuer,

            string issuerMode,

            string kid,

            string? name,

            string ssoBinding,

            string ssoDestination,

            string ssoUrl,

            string subjectFilter,

            ImmutableArray<string> subjectFormats,

            string type)
        {
            AcsBinding = acsBinding;
            AcsType = acsType;
            Audience = audience;
            Id = id;
            Issuer = issuer;
            IssuerMode = issuerMode;
            Kid = kid;
            Name = name;
            SsoBinding = ssoBinding;
            SsoDestination = ssoDestination;
            SsoUrl = ssoUrl;
            SubjectFilter = subjectFilter;
            SubjectFormats = subjectFormats;
            Type = type;
        }
    }
}
