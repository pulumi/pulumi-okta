// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Profile.Inputs
{

    public sealed class MappingMappingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// The mapping property key.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("pushStatus")]
        public Input<string>? PushStatus { get; set; }

        public MappingMappingGetArgs()
        {
        }
        public static new MappingMappingGetArgs Empty => new MappingMappingGetArgs();
    }
}
