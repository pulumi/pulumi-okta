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
    /// Creates different types of behavior.
    /// 
    /// This resource allows you to create and configure a behavior.
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
    ///         var myLocation = new Okta.Behaviour("myLocation", new Okta.BehaviourArgs
    ///         {
    ///             LocationGranularityType = "LAT_LONG",
    ///             NumberOfAuthentications = 50,
    ///             RadiusFromLocation = 20,
    ///             Type = "ANOMALOUS_LOCATION",
    ///         });
    ///         var myCity = new Okta.Behaviour("myCity", new Okta.BehaviourArgs
    ///         {
    ///             LocationGranularityType = "CITY",
    ///             NumberOfAuthentications = 50,
    ///             Type = "ANOMALOUS_LOCATION",
    ///         });
    ///         var myDevice = new Okta.Behaviour("myDevice", new Okta.BehaviourArgs
    ///         {
    ///             NumberOfAuthentications = 50,
    ///             Type = "ANOMALOUS_DEVICE",
    ///         });
    ///         var myIp = new Okta.Behaviour("myIp", new Okta.BehaviourArgs
    ///         {
    ///             NumberOfAuthentications = 50,
    ///             Type = "ANOMALOUS_IP",
    ///         });
    ///         var myVelocity = new Okta.Behaviour("myVelocity", new Okta.BehaviourArgs
    ///         {
    ///             Type = "VELOCITY",
    ///             Velocity = 25,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Behavior can be imported via the Okta ID.
    /// 
    /// ```sh
    ///  $ pulumi import okta:index/behaviour:Behaviour example &lt;behavior id&gt;
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/behaviour:Behaviour")]
    public partial class Behaviour : Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the method and level of detail used to evaluate the behavior.
        /// Required for `"ANOMALOUS_LOCATION"` behavior type. Can be set to `"LAT_LONG"`, `"CITY"`, `"COUNTRY"`
        /// or `"SUBDIVISION"`.
        /// </summary>
        [Output("locationGranularityType")]
        public Output<string?> LocationGranularityType { get; private set; } = null!;

        /// <summary>
        /// Name of the behavior.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of recent authentications used to evaluate the behavior. Required
        /// for `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"` and `"ANOMALOUS_IP"` behavior types.
        /// </summary>
        [Output("numberOfAuthentications")]
        public Output<int?> NumberOfAuthentications { get; private set; } = null!;

        /// <summary>
        /// Radius from location (in kilometers). Should be at least 5. Required
        /// when `location_granularity_type` is set to `"LAT_LONG"`.
        /// </summary>
        [Output("radiusFromLocation")]
        public Output<int?> RadiusFromLocation { get; private set; } = null!;

        /// <summary>
        /// The status of the behavior. By default, it is`"ACTIVE"`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Type of the behavior. Can be set to `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"`, `"ANOMALOUS_IP"`
        /// or `"VELOCITY"`. Resource will be recreated when the type changes.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Velocity (in kilometers per hour). Should be at least 1. Required for `"VELOCITY"` behavior
        /// type.
        /// </summary>
        [Output("velocity")]
        public Output<int?> Velocity { get; private set; } = null!;


        /// <summary>
        /// Create a Behaviour resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Behaviour(string name, BehaviourArgs args, CustomResourceOptions? options = null)
            : base("okta:index/behaviour:Behaviour", name, args ?? new BehaviourArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Behaviour(string name, Input<string> id, BehaviourState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/behaviour:Behaviour", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Behaviour resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Behaviour Get(string name, Input<string> id, BehaviourState? state = null, CustomResourceOptions? options = null)
        {
            return new Behaviour(name, id, state, options);
        }
    }

    public sealed class BehaviourArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the method and level of detail used to evaluate the behavior.
        /// Required for `"ANOMALOUS_LOCATION"` behavior type. Can be set to `"LAT_LONG"`, `"CITY"`, `"COUNTRY"`
        /// or `"SUBDIVISION"`.
        /// </summary>
        [Input("locationGranularityType")]
        public Input<string>? LocationGranularityType { get; set; }

        /// <summary>
        /// Name of the behavior.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of recent authentications used to evaluate the behavior. Required
        /// for `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"` and `"ANOMALOUS_IP"` behavior types.
        /// </summary>
        [Input("numberOfAuthentications")]
        public Input<int>? NumberOfAuthentications { get; set; }

        /// <summary>
        /// Radius from location (in kilometers). Should be at least 5. Required
        /// when `location_granularity_type` is set to `"LAT_LONG"`.
        /// </summary>
        [Input("radiusFromLocation")]
        public Input<int>? RadiusFromLocation { get; set; }

        /// <summary>
        /// The status of the behavior. By default, it is`"ACTIVE"`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the behavior. Can be set to `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"`, `"ANOMALOUS_IP"`
        /// or `"VELOCITY"`. Resource will be recreated when the type changes.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Velocity (in kilometers per hour). Should be at least 1. Required for `"VELOCITY"` behavior
        /// type.
        /// </summary>
        [Input("velocity")]
        public Input<int>? Velocity { get; set; }

        public BehaviourArgs()
        {
        }
    }

    public sealed class BehaviourState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the method and level of detail used to evaluate the behavior.
        /// Required for `"ANOMALOUS_LOCATION"` behavior type. Can be set to `"LAT_LONG"`, `"CITY"`, `"COUNTRY"`
        /// or `"SUBDIVISION"`.
        /// </summary>
        [Input("locationGranularityType")]
        public Input<string>? LocationGranularityType { get; set; }

        /// <summary>
        /// Name of the behavior.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of recent authentications used to evaluate the behavior. Required
        /// for `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"` and `"ANOMALOUS_IP"` behavior types.
        /// </summary>
        [Input("numberOfAuthentications")]
        public Input<int>? NumberOfAuthentications { get; set; }

        /// <summary>
        /// Radius from location (in kilometers). Should be at least 5. Required
        /// when `location_granularity_type` is set to `"LAT_LONG"`.
        /// </summary>
        [Input("radiusFromLocation")]
        public Input<int>? RadiusFromLocation { get; set; }

        /// <summary>
        /// The status of the behavior. By default, it is`"ACTIVE"`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the behavior. Can be set to `"ANOMALOUS_LOCATION"`, `"ANOMALOUS_DEVICE"`, `"ANOMALOUS_IP"`
        /// or `"VELOCITY"`. Resource will be recreated when the type changes.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Velocity (in kilometers per hour). Should be at least 1. Required for `"VELOCITY"` behavior
        /// type.
        /// </summary>
        [Input("velocity")]
        public Input<int>? Velocity { get; set; }

        public BehaviourState()
        {
        }
    }
}