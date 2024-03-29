// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Outputs
{

    [OutputType]
    public sealed class RuleSignonFactorSequence
    {
        /// <summary>
        /// Primary factor type of the auth section.
        /// </summary>
        public readonly string PrimaryCriteriaFactorType;
        /// <summary>
        /// Primary provider of the auth section.
        /// </summary>
        public readonly string PrimaryCriteriaProvider;
        /// <summary>
        /// Additional authentication steps.
        /// </summary>
        public readonly ImmutableArray<Outputs.RuleSignonFactorSequenceSecondaryCriteria> SecondaryCriterias;

        [OutputConstructor]
        private RuleSignonFactorSequence(
            string primaryCriteriaFactorType,

            string primaryCriteriaProvider,

            ImmutableArray<Outputs.RuleSignonFactorSequenceSecondaryCriteria> secondaryCriterias)
        {
            PrimaryCriteriaFactorType = primaryCriteriaFactorType;
            PrimaryCriteriaProvider = primaryCriteriaProvider;
            SecondaryCriterias = secondaryCriterias;
        }
    }
}
