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
    /// This resource allows you to configure the client-based rate limit and rate limiting communications settings.
    /// 
    /// &gt; **WARNING:** This resource is available only when using api token in the provider config.
    /// 
    /// ## Import
    /// 
    /// Rate limit settings can be imported without any parameters.
    /// 
    /// ```sh
    ///  $ pulumi import okta:index/rateLimiting:RateLimiting example .
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/rateLimiting:RateLimiting")]
    public partial class RateLimiting : Pulumi.CustomResource
    {
        /// <summary>
        /// Called during authentication. Valid values: `"ENFORCE"` _(Enforce limit and
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Output("authorize")]
        public Output<string> Authorize { get; private set; } = null!;

        /// <summary>
        /// Enable or disable rate limiting communications. By default, it is `true`.
        /// </summary>
        [Output("communicationsEnabled")]
        public Output<bool?> CommunicationsEnabled { get; private set; } = null!;

        /// <summary>
        /// Called when accessing the Okta hosted login page. Valid values: `"ENFORCE"` _(Enforce limit and 
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Output("login")]
        public Output<string> Login { get; private set; } = null!;


        /// <summary>
        /// Create a RateLimiting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RateLimiting(string name, RateLimitingArgs args, CustomResourceOptions? options = null)
            : base("okta:index/rateLimiting:RateLimiting", name, args ?? new RateLimitingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RateLimiting(string name, Input<string> id, RateLimitingState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/rateLimiting:RateLimiting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RateLimiting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RateLimiting Get(string name, Input<string> id, RateLimitingState? state = null, CustomResourceOptions? options = null)
        {
            return new RateLimiting(name, id, state, options);
        }
    }

    public sealed class RateLimitingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Called during authentication. Valid values: `"ENFORCE"` _(Enforce limit and
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Input("authorize", required: true)]
        public Input<string> Authorize { get; set; } = null!;

        /// <summary>
        /// Enable or disable rate limiting communications. By default, it is `true`.
        /// </summary>
        [Input("communicationsEnabled")]
        public Input<bool>? CommunicationsEnabled { get; set; }

        /// <summary>
        /// Called when accessing the Okta hosted login page. Valid values: `"ENFORCE"` _(Enforce limit and 
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Input("login", required: true)]
        public Input<string> Login { get; set; } = null!;

        public RateLimitingArgs()
        {
        }
    }

    public sealed class RateLimitingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Called during authentication. Valid values: `"ENFORCE"` _(Enforce limit and
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Input("authorize")]
        public Input<string>? Authorize { get; set; }

        /// <summary>
        /// Enable or disable rate limiting communications. By default, it is `true`.
        /// </summary>
        [Input("communicationsEnabled")]
        public Input<bool>? CommunicationsEnabled { get; set; }

        /// <summary>
        /// Called when accessing the Okta hosted login page. Valid values: `"ENFORCE"` _(Enforce limit and 
        /// log per client (recommended))_, `"DISABLE"` _(Do nothing (not recommended))_, `"PREVIEW"` _(Log per client)_.
        /// </summary>
        [Input("login")]
        public Input<string>? Login { get; set; }

        public RateLimitingState()
        {
        }
    }
}