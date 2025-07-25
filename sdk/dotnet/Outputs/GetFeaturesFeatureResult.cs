// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Outputs
{

    [OutputType]
    public sealed class GetFeaturesFeatureResult
    {
        public readonly string Description;
        public readonly string Id;
        public readonly string Name;
        public readonly Outputs.GetFeaturesFeatureStageResult Stage;
        public readonly string Status;
        public readonly string Type;

        [OutputConstructor]
        private GetFeaturesFeatureResult(
            string description,

            string id,

            string name,

            Outputs.GetFeaturesFeatureStageResult stage,

            string status,

            string type)
        {
            Description = description;
            Id = id;
            Name = name;
            Stage = stage;
            Status = status;
            Type = type;
        }
    }
}
