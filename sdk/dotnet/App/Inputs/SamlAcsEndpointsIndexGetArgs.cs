// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.App.Inputs
{

    public sealed class SamlAcsEndpointsIndexGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("index", required: true)]
        public Input<int> Index { get; set; } = null!;

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public SamlAcsEndpointsIndexGetArgs()
        {
        }
        public static new SamlAcsEndpointsIndexGetArgs Empty => new SamlAcsEndpointsIndexGetArgs();
    }
}
