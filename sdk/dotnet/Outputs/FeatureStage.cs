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
    public sealed class FeatureStage
    {
        public readonly string State;
        public readonly string Value;

        [OutputConstructor]
        private FeatureStage(
            string state,

            string value)
        {
            State = state;
            Value = value;
        }
    }
}
