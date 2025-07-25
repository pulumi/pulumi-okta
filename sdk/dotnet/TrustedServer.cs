// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    /// <summary>
    /// Associated (Trusted) authorization servers allow you to designate a trusted authorization server that you associate with another authorization server.
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
    ///     var test1 = new Okta.Auth.Server("test1", new()
    ///     {
    ///         Audiences = new[]
    ///         {
    ///             "whatever.rise.zone",
    ///         },
    ///         CredentialsRotationMode = "AUTO",
    ///         Description = "The best way to find out if you can trust somebody is to trust them.",
    ///         Name = "testAcc-replace_with_uuid",
    ///     });
    /// 
    ///     var test2 = new Okta.Auth.Server("test2", new()
    ///     {
    ///         Audiences = new[]
    ///         {
    ///             "whatever.rise.zone",
    ///         },
    ///         CredentialsRotationMode = "AUTO",
    ///         Description = "The best way to find out if you can trust somebody is to trust them.",
    ///         Name = "testAcc-replace_with_uuid",
    ///     });
    /// 
    ///     var test3 = new Okta.Auth.Server("test3", new()
    ///     {
    ///         Audiences = new[]
    ///         {
    ///             "whatever.rise.zone",
    ///         },
    ///         CredentialsRotationMode = "AUTO",
    ///         Description = "The best way to find out if you can trust somebody is to trust them.",
    ///         Name = "testAcc-replace_with_uuid",
    ///     });
    /// 
    ///     var example = new Okta.TrustedServer("example", new()
    ///     {
    ///         AuthServerId = oktaAuthServer.Test1.Id,
    ///         Trusteds = new[]
    ///         {
    ///             oktaAuthServer.Test2.Id,
    ///             oktaAuthServer.Test3.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/trustedServer:TrustedServer")]
    public partial class TrustedServer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Authorization server ID
        /// </summary>
        [Output("authServerId")]
        public Output<string> AuthServerId { get; private set; } = null!;

        /// <summary>
        /// A list of the authorization server IDs user want to trust
        /// </summary>
        [Output("trusteds")]
        public Output<ImmutableArray<string>> Trusteds { get; private set; } = null!;


        /// <summary>
        /// Create a TrustedServer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrustedServer(string name, TrustedServerArgs args, CustomResourceOptions? options = null)
            : base("okta:index/trustedServer:TrustedServer", name, args ?? new TrustedServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrustedServer(string name, Input<string> id, TrustedServerState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/trustedServer:TrustedServer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TrustedServer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrustedServer Get(string name, Input<string> id, TrustedServerState? state = null, CustomResourceOptions? options = null)
        {
            return new TrustedServer(name, id, state, options);
        }
    }

    public sealed class TrustedServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authorization server ID
        /// </summary>
        [Input("authServerId", required: true)]
        public Input<string> AuthServerId { get; set; } = null!;

        [Input("trusteds", required: true)]
        private InputList<string>? _trusteds;

        /// <summary>
        /// A list of the authorization server IDs user want to trust
        /// </summary>
        public InputList<string> Trusteds
        {
            get => _trusteds ?? (_trusteds = new InputList<string>());
            set => _trusteds = value;
        }

        public TrustedServerArgs()
        {
        }
        public static new TrustedServerArgs Empty => new TrustedServerArgs();
    }

    public sealed class TrustedServerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authorization server ID
        /// </summary>
        [Input("authServerId")]
        public Input<string>? AuthServerId { get; set; }

        [Input("trusteds")]
        private InputList<string>? _trusteds;

        /// <summary>
        /// A list of the authorization server IDs user want to trust
        /// </summary>
        public InputList<string> Trusteds
        {
            get => _trusteds ?? (_trusteds = new InputList<string>());
            set => _trusteds = value;
        }

        public TrustedServerState()
        {
        }
        public static new TrustedServerState Empty => new TrustedServerState();
    }
}
