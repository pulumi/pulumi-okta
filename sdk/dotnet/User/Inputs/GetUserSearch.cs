// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.User.Inputs
{

    public sealed class GetUserSearchArgs : global::Pulumi.InvokeArgs
    {
        [Input("comparison")]
        public string? Comparison { get; set; }

        /// <summary>
        /// A raw search expression string. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
        /// </summary>
        [Input("expression")]
        public string? Expression { get; set; }

        /// <summary>
        /// Property name to search for. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetUserSearchArgs()
        {
        }
        public static new GetUserSearchArgs Empty => new GetUserSearchArgs();
    }
}
