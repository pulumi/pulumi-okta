// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Inputs
{

    public sealed class GroupSchemaPropertyArrayOneOfArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value mapping to member of `array_enum`
        /// </summary>
        [Input("const", required: true)]
        public Input<string> Const { get; set; } = null!;

        /// <summary>
        /// Display name for the enum value.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        public GroupSchemaPropertyArrayOneOfArgs()
        {
        }
        public static new GroupSchemaPropertyArrayOneOfArgs Empty => new GroupSchemaPropertyArrayOneOfArgs();
    }
}