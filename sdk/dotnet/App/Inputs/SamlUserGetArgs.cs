// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.App.Inputs
{

    public sealed class SamlUserGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// id of application.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public SamlUserGetArgs()
        {
        }
    }
}