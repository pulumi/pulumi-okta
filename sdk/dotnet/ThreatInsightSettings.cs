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
    /// This resource allows you to configure Threat Insight Settings.
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
    ///         var ipNetworkZoneExample = new Okta.Network.Zone("ipNetworkZoneExample", new Okta.Network.ZoneArgs
    ///         {
    ///             Type = "IP",
    ///             Gateways = 
    ///             {
    ///                 "1.2.3.4/24",
    ///                 "2.3.4.5-2.3.4.15",
    ///             },
    ///             Proxies = 
    ///             {
    ///                 "2.2.3.4/24",
    ///                 "3.3.4.5-3.3.4.15",
    ///             },
    ///         });
    ///         var example = new Okta.ThreatInsightSettings("example", new Okta.ThreatInsightSettingsArgs
    ///         {
    ///             Action = "block",
    ///             NetworkExcludes = 
    ///             {
    ///                 ipNetworkZoneExample.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Threat Insight Settings can be imported without any parameters.
    /// 
    /// ```sh
    ///  $ pulumi import okta:index/threatInsightSettings:ThreatInsightSettings example _
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/threatInsightSettings:ThreatInsightSettings")]
    public partial class ThreatInsightSettings : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies how Okta responds to authentication requests from suspicious IPs. Valid values 
        /// are `"none"`, `"audit"`, or `"block"`. A value of `"none"` indicates that ThreatInsight is disabled. A value of `"audit"`
        /// indicates that Okta logs suspicious requests in the System Log. A value of `"block"` indicates that Okta logs suspicious
        /// requests in the System Log and blocks the requests.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Accepts a list of Network Zone IDs. Can only accept zones of `"IP"` type. 
        /// IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation.
        /// This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked.
        /// </summary>
        [Output("networkExcludes")]
        public Output<ImmutableArray<string>> NetworkExcludes { get; private set; } = null!;


        /// <summary>
        /// Create a ThreatInsightSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ThreatInsightSettings(string name, ThreatInsightSettingsArgs args, CustomResourceOptions? options = null)
            : base("okta:index/threatInsightSettings:ThreatInsightSettings", name, args ?? new ThreatInsightSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ThreatInsightSettings(string name, Input<string> id, ThreatInsightSettingsState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/threatInsightSettings:ThreatInsightSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ThreatInsightSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ThreatInsightSettings Get(string name, Input<string> id, ThreatInsightSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new ThreatInsightSettings(name, id, state, options);
        }
    }

    public sealed class ThreatInsightSettingsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies how Okta responds to authentication requests from suspicious IPs. Valid values 
        /// are `"none"`, `"audit"`, or `"block"`. A value of `"none"` indicates that ThreatInsight is disabled. A value of `"audit"`
        /// indicates that Okta logs suspicious requests in the System Log. A value of `"block"` indicates that Okta logs suspicious
        /// requests in the System Log and blocks the requests.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("networkExcludes")]
        private InputList<string>? _networkExcludes;

        /// <summary>
        /// Accepts a list of Network Zone IDs. Can only accept zones of `"IP"` type. 
        /// IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation.
        /// This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked.
        /// </summary>
        public InputList<string> NetworkExcludes
        {
            get => _networkExcludes ?? (_networkExcludes = new InputList<string>());
            set => _networkExcludes = value;
        }

        public ThreatInsightSettingsArgs()
        {
        }
    }

    public sealed class ThreatInsightSettingsState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies how Okta responds to authentication requests from suspicious IPs. Valid values 
        /// are `"none"`, `"audit"`, or `"block"`. A value of `"none"` indicates that ThreatInsight is disabled. A value of `"audit"`
        /// indicates that Okta logs suspicious requests in the System Log. A value of `"block"` indicates that Okta logs suspicious
        /// requests in the System Log and blocks the requests.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("networkExcludes")]
        private InputList<string>? _networkExcludes;

        /// <summary>
        /// Accepts a list of Network Zone IDs. Can only accept zones of `"IP"` type. 
        /// IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation.
        /// This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked.
        /// </summary>
        public InputList<string> NetworkExcludes
        {
            get => _networkExcludes ?? (_networkExcludes = new InputList<string>());
            set => _networkExcludes = value;
        }

        public ThreatInsightSettingsState()
        {
        }
    }
}