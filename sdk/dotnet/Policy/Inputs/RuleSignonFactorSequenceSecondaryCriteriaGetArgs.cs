// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Inputs
{

    public sealed class RuleSignonFactorSequenceSecondaryCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of a Factor
        /// </summary>
        [Input("factorType", required: true)]
        public Input<string> FactorType { get; set; } = null!;

        /// <summary>
        /// Factor provider
        /// </summary>
        [Input("provider", required: true)]
        public Input<string> Provider { get; set; } = null!;

        public RuleSignonFactorSequenceSecondaryCriteriaGetArgs()
        {
        }
        public static new RuleSignonFactorSequenceSecondaryCriteriaGetArgs Empty => new RuleSignonFactorSequenceSecondaryCriteriaGetArgs();
    }
}
