// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Outputs
{

    [OutputType]
    public sealed class UserSchemaPropertyArrayOneOf
    {
        /// <summary>
        /// Value mapping to member of `array_enum`
        /// </summary>
        public readonly string Const;
        /// <summary>
        /// Display name for the enum value.
        /// </summary>
        public readonly string Title;

        [OutputConstructor]
        private UserSchemaPropertyArrayOneOf(
            string @const,

            string title)
        {
            Const = @const;
            Title = title;
        }
    }
}