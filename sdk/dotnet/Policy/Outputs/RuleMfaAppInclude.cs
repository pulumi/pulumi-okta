// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Outputs
{

    [OutputType]
    public sealed class RuleMfaAppInclude
    {
        public readonly string? Id;
        public readonly string? Name;
        public readonly string Type;

        [OutputConstructor]
        private RuleMfaAppInclude(
            string? id,

            string? name,

            string type)
        {
            Id = id;
            Name = name;
            Type = type;
        }
    }
}
