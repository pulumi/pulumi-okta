// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    /// <summary>
    /// Configures Default Authorization Server.
    /// 
    /// This resource allows you to configure Default Authorization Server.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Okta = Pulumi.Okta;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Okta.AuthServerDefault("example", new Okta.AuthServerDefaultArgs
    ///         {
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Authorization Server can be imported via the Okta ID.
    /// 
    /// ```sh
    ///  $ pulumi import okta:index/authServerDefault:AuthServerDefault example &lt;auth server name&gt;
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/authServerDefault:AuthServerDefault")]
    public partial class AuthServerDefault : Pulumi.CustomResource
    {
        /// <summary>
        /// The recipients that the tokens are intended for. This becomes the `aud` claim in an access token.
        /// </summary>
        [Output("audiences")]
        public Output<ImmutableArray<string>> Audiences { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the authorization server started to use the `kid` for signing tokens.
        /// </summary>
        [Output("credentialsLastRotated")]
        public Output<string> CredentialsLastRotated { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `"AUTO"`.
        /// </summary>
        [Output("credentialsNextRotation")]
        public Output<string> CredentialsNextRotation { get; private set; } = null!;

        /// <summary>
        /// The key rotation mode for the authorization server. Can be `"AUTO"` or `"MANUAL"`.
        /// </summary>
        [Output("credentialsRotationMode")]
        public Output<string?> CredentialsRotationMode { get; private set; } = null!;

        /// <summary>
        /// The description of the authorization server.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// Allows you to use a custom issuer URL. It can be set to `"CUSTOM_URL"` or `"ORG_URL"`
        /// </summary>
        [Output("issuerMode")]
        public Output<string?> IssuerMode { get; private set; } = null!;

        /// <summary>
        /// The ID of the JSON Web Key used for signing tokens issued by the authorization server.
        /// </summary>
        [Output("kid")]
        public Output<string> Kid { get; private set; } = null!;

        /// <summary>
        /// The name of the authorization server.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The status of the auth server.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AuthServerDefault resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthServerDefault(string name, AuthServerDefaultArgs? args = null, CustomResourceOptions? options = null)
            : base("okta:index/authServerDefault:AuthServerDefault", name, args ?? new AuthServerDefaultArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthServerDefault(string name, Input<string> id, AuthServerDefaultState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/authServerDefault:AuthServerDefault", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthServerDefault resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthServerDefault Get(string name, Input<string> id, AuthServerDefaultState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthServerDefault(name, id, state, options);
        }
    }

    public sealed class AuthServerDefaultArgs : Pulumi.ResourceArgs
    {
        [Input("audiences")]
        private InputList<string>? _audiences;

        /// <summary>
        /// The recipients that the tokens are intended for. This becomes the `aud` claim in an access token.
        /// </summary>
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        /// <summary>
        /// The key rotation mode for the authorization server. Can be `"AUTO"` or `"MANUAL"`.
        /// </summary>
        [Input("credentialsRotationMode")]
        public Input<string>? CredentialsRotationMode { get; set; }

        /// <summary>
        /// The description of the authorization server.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Allows you to use a custom issuer URL. It can be set to `"CUSTOM_URL"` or `"ORG_URL"`
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        /// <summary>
        /// The name of the authorization server.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The status of the auth server.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AuthServerDefaultArgs()
        {
        }
    }

    public sealed class AuthServerDefaultState : Pulumi.ResourceArgs
    {
        [Input("audiences")]
        private InputList<string>? _audiences;

        /// <summary>
        /// The recipients that the tokens are intended for. This becomes the `aud` claim in an access token.
        /// </summary>
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        /// <summary>
        /// The timestamp when the authorization server started to use the `kid` for signing tokens.
        /// </summary>
        [Input("credentialsLastRotated")]
        public Input<string>? CredentialsLastRotated { get; set; }

        /// <summary>
        /// The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `"AUTO"`.
        /// </summary>
        [Input("credentialsNextRotation")]
        public Input<string>? CredentialsNextRotation { get; set; }

        /// <summary>
        /// The key rotation mode for the authorization server. Can be `"AUTO"` or `"MANUAL"`.
        /// </summary>
        [Input("credentialsRotationMode")]
        public Input<string>? CredentialsRotationMode { get; set; }

        /// <summary>
        /// The description of the authorization server.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// Allows you to use a custom issuer URL. It can be set to `"CUSTOM_URL"` or `"ORG_URL"`
        /// </summary>
        [Input("issuerMode")]
        public Input<string>? IssuerMode { get; set; }

        /// <summary>
        /// The ID of the JSON Web Key used for signing tokens issued by the authorization server.
        /// </summary>
        [Input("kid")]
        public Input<string>? Kid { get; set; }

        /// <summary>
        /// The name of the authorization server.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The status of the auth server.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AuthServerDefaultState()
        {
        }
    }
}