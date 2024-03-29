// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Inputs
{

    public sealed class RuleSignonFactorSequenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Primary factor type of the auth section.
        /// </summary>
        [Input("primaryCriteriaFactorType", required: true)]
        public Input<string> PrimaryCriteriaFactorType { get; set; } = null!;

        /// <summary>
        /// Primary provider of the auth section.
        /// </summary>
        [Input("primaryCriteriaProvider", required: true)]
        public Input<string> PrimaryCriteriaProvider { get; set; } = null!;

        [Input("secondaryCriterias")]
        private InputList<Inputs.RuleSignonFactorSequenceSecondaryCriteriaGetArgs>? _secondaryCriterias;

        /// <summary>
        /// Additional authentication steps.
        /// </summary>
        public InputList<Inputs.RuleSignonFactorSequenceSecondaryCriteriaGetArgs> SecondaryCriterias
        {
            get => _secondaryCriterias ?? (_secondaryCriterias = new InputList<Inputs.RuleSignonFactorSequenceSecondaryCriteriaGetArgs>());
            set => _secondaryCriterias = value;
        }

        public RuleSignonFactorSequenceGetArgs()
        {
        }
        public static new RuleSignonFactorSequenceGetArgs Empty => new RuleSignonFactorSequenceGetArgs();
    }
}
