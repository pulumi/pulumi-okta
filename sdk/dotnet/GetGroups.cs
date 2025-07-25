// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetGroups
    {
        /// <summary>
        /// Get a list of groups from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.GetGroups.Invoke(new()
        ///     {
        ///         Q = "Engineering - ",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGroupsResult> InvokeAsync(GetGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupsResult>("okta:index/getGroups:getGroups", args ?? new GetGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of groups from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.GetGroups.Invoke(new()
        ///     {
        ///         Q = "Engineering - ",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGroupsResult> Invoke(GetGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupsResult>("okta:index/getGroups:getGroups", args ?? new GetGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a list of groups from Okta.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Okta.GetGroups.Invoke(new()
        ///     {
        ///         Q = "Engineering - ",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGroupsResult> Invoke(GetGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupsResult>("okta:index/getGroups:getGroups", args ?? new GetGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The maximum number of groups returned by the Okta API, between 1 and 10000.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// Searches the name property of groups for matching value
        /// </summary>
        [Input("q")]
        public string? Q { get; set; }

        /// <summary>
        /// Searches for groups with a supported filtering expression for all attributes except for '*embedded', '*links', and 'objectClass'
        /// </summary>
        [Input("search")]
        public string? Search { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetGroupsArgs()
        {
        }
        public static new GetGroupsArgs Empty => new GetGroupsArgs();
    }

    public sealed class GetGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The maximum number of groups returned by the Okta API, between 1 and 10000.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// Searches the name property of groups for matching value
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        /// <summary>
        /// Searches for groups with a supported filtering expression for all attributes except for '*embedded', '*links', and 'objectClass'
        /// </summary>
        [Input("search")]
        public Input<string>? Search { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetGroupsInvokeArgs()
        {
        }
        public static new GetGroupsInvokeArgs Empty => new GetGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupsResult
    {
        public readonly ImmutableArray<Outputs.GetGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The maximum number of groups returned by the Okta API, between 1 and 10000.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// Searches the name property of groups for matching value
        /// </summary>
        public readonly string? Q;
        /// <summary>
        /// Searches for groups with a supported filtering expression for all attributes except for '*embedded', '*links', and 'objectClass'
        /// </summary>
        public readonly string? Search;
        public readonly string? Type;

        [OutputConstructor]
        private GetGroupsResult(
            ImmutableArray<Outputs.GetGroupsGroupResult> groups,

            string id,

            int? limit,

            string? q,

            string? search,

            string? type)
        {
            Groups = groups;
            Id = id;
            Limit = limit;
            Q = q;
            Search = search;
            Type = type;
        }
    }
}
