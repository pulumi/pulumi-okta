// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Deprecated.Inputs
{

    public sealed class SamlAppKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("created")]
        public Input<string>? Created { get; set; }

        [Input("e")]
        public Input<string>? E { get; set; }

        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        [Input("kid")]
        public Input<string>? Kid { get; set; }

        [Input("kty")]
        public Input<string>? Kty { get; set; }

        [Input("lastUpdated")]
        public Input<string>? LastUpdated { get; set; }

        [Input("n")]
        public Input<string>? N { get; set; }

        [Input("use")]
        public Input<string>? Use { get; set; }

        [Input("x5cs")]
        private InputList<string>? _x5cs;
        public InputList<string> X5cs
        {
            get => _x5cs ?? (_x5cs = new InputList<string>());
            set => _x5cs = value;
        }

        [Input("x5tS256")]
        public Input<string>? X5tS256 { get; set; }

        public SamlAppKeyArgs()
        {
        }
        public static new SamlAppKeyArgs Empty => new SamlAppKeyArgs();
    }
}