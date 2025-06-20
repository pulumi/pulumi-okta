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
    /// Manages Okta Support access your org
    /// This resource allows you to temporarily allow Okta Support to access your org as an administrator. By default,
    /// access will be granted for eight hours. Removing this resource will revoke Okta Support access to your org.
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
    ///     var example = new Okta.OrgSupport("example", new()
    ///     {
    ///         ExtendBy = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/orgSupport:OrgSupport")]
    public partial class OrgSupport : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Expiration of Okta Support
        /// </summary>
        [Output("expiration")]
        public Output<string> Expiration { get; private set; } = null!;

        /// <summary>
        /// Number of days the support should be extended by
        /// </summary>
        [Output("extendBy")]
        public Output<int?> ExtendBy { get; private set; } = null!;

        /// <summary>
        /// Status of Okta Support
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a OrgSupport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrgSupport(string name, OrgSupportArgs? args = null, CustomResourceOptions? options = null)
            : base("okta:index/orgSupport:OrgSupport", name, args ?? new OrgSupportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrgSupport(string name, Input<string> id, OrgSupportState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/orgSupport:OrgSupport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrgSupport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrgSupport Get(string name, Input<string> id, OrgSupportState? state = null, CustomResourceOptions? options = null)
        {
            return new OrgSupport(name, id, state, options);
        }
    }

    public sealed class OrgSupportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of days the support should be extended by
        /// </summary>
        [Input("extendBy")]
        public Input<int>? ExtendBy { get; set; }

        public OrgSupportArgs()
        {
        }
        public static new OrgSupportArgs Empty => new OrgSupportArgs();
    }

    public sealed class OrgSupportState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expiration of Okta Support
        /// </summary>
        [Input("expiration")]
        public Input<string>? Expiration { get; set; }

        /// <summary>
        /// Number of days the support should be extended by
        /// </summary>
        [Input("extendBy")]
        public Input<int>? ExtendBy { get; set; }

        /// <summary>
        /// Status of Okta Support
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public OrgSupportState()
        {
        }
        public static new OrgSupportState Empty => new OrgSupportState();
    }
}
