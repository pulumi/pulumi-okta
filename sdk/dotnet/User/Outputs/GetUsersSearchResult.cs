// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.User.Outputs
{

    [OutputType]
    public sealed class GetUsersSearchResult
    {
        public readonly string? Comparison;
        /// <summary>
        /// A raw search expression string. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
        /// </summary>
        public readonly string? Expression;
        /// <summary>
        /// Property name to search for. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
        /// </summary>
        public readonly string? Name;
        public readonly string? Value;

        [OutputConstructor]
        private GetUsersSearchResult(
            string? comparison,

            string? expression,

            string? name,

            string? value)
        {
            Comparison = comparison;
            Expression = expression;
            Name = name;
            Value = value;
        }
    }
}
