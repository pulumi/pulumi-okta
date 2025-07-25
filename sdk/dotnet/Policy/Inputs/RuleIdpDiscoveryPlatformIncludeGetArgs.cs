// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Inputs
{

    public sealed class RuleIdpDiscoveryPlatformIncludeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only available with OTHER OS type
        /// </summary>
        [Input("osExpression")]
        public Input<string>? OsExpression { get; set; }

        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public RuleIdpDiscoveryPlatformIncludeGetArgs()
        {
        }
        public static new RuleIdpDiscoveryPlatformIncludeGetArgs Empty => new RuleIdpDiscoveryPlatformIncludeGetArgs();
    }
}
