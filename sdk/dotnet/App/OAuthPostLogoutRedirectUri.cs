// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.App
{
    /// <summary>
    /// This resource allows you to manage post logout redirection URI for use in redirect-based flows.
    /// 
    /// &gt; `okta.app.OAuthPostLogoutRedirectUri` has been marked deprecated and will
    /// be removed in the v5 release of the provider. Operators should manage the post
    /// logout redirect URIs for an oauth app directly on that resource.
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
    ///     var test = new Okta.App.OAuth("test", new()
    ///     {
    ///         Label = "testAcc_replace_with_uuid",
    ///         Type = "web",
    ///         GrantTypes = new[]
    ///         {
    ///             "authorization_code",
    ///         },
    ///         ResponseTypes = new[]
    ///         {
    ///             "code",
    ///         },
    ///         RedirectUris = new[]
    ///         {
    ///             "myapp://callback",
    ///         },
    ///         PostLogoutRedirectUris = new[]
    ///         {
    ///             "https://www.example.com",
    ///         },
    ///     });
    /// 
    ///     var testOAuthPostLogoutRedirectUri = new Okta.App.OAuthPostLogoutRedirectUri("test", new()
    ///     {
    ///         AppId = test.Id,
    ///         Uri = "https://www.example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import okta:app/oAuthPostLogoutRedirectUri:OAuthPostLogoutRedirectUri example &lt;app_id&gt;/&lt;uri&gt;
    /// ```
    /// </summary>
    [OktaResourceType("okta:app/oAuthPostLogoutRedirectUri:OAuthPostLogoutRedirectUri")]
    public partial class OAuthPostLogoutRedirectUri : global::Pulumi.CustomResource
    {
        /// <summary>
        /// OAuth application ID.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// Post Logout Redirect URI to append to Okta OIDC application.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;


        /// <summary>
        /// Create a OAuthPostLogoutRedirectUri resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OAuthPostLogoutRedirectUri(string name, OAuthPostLogoutRedirectUriArgs args, CustomResourceOptions? options = null)
            : base("okta:app/oAuthPostLogoutRedirectUri:OAuthPostLogoutRedirectUri", name, args ?? new OAuthPostLogoutRedirectUriArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OAuthPostLogoutRedirectUri(string name, Input<string> id, OAuthPostLogoutRedirectUriState? state = null, CustomResourceOptions? options = null)
            : base("okta:app/oAuthPostLogoutRedirectUri:OAuthPostLogoutRedirectUri", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OAuthPostLogoutRedirectUri resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OAuthPostLogoutRedirectUri Get(string name, Input<string> id, OAuthPostLogoutRedirectUriState? state = null, CustomResourceOptions? options = null)
        {
            return new OAuthPostLogoutRedirectUri(name, id, state, options);
        }
    }

    public sealed class OAuthPostLogoutRedirectUriArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OAuth application ID.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Post Logout Redirect URI to append to Okta OIDC application.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public OAuthPostLogoutRedirectUriArgs()
        {
        }
        public static new OAuthPostLogoutRedirectUriArgs Empty => new OAuthPostLogoutRedirectUriArgs();
    }

    public sealed class OAuthPostLogoutRedirectUriState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OAuth application ID.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// Post Logout Redirect URI to append to Okta OIDC application.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public OAuthPostLogoutRedirectUriState()
        {
        }
        public static new OAuthPostLogoutRedirectUriState Empty => new OAuthPostLogoutRedirectUriState();
    }
}
