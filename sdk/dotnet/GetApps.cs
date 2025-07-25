// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetApps
    {
        public static Task<GetAppsResult> InvokeAsync(GetAppsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppsResult>("okta:index/getApps:getApps", args ?? new GetAppsArgs(), options.WithDefaults());

        public static Output<GetAppsResult> Invoke(GetAppsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppsResult>("okta:index/getApps:getApps", args ?? new GetAppsInvokeArgs(), options.WithDefaults());

        public static Output<GetAppsResult> Invoke(GetAppsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppsResult>("okta:index/getApps:getApps", args ?? new GetAppsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Search only active applications.
        /// </summary>
        [Input("activeOnly")]
        public bool? ActiveOnly { get; set; }

        /// <summary>
        /// Specifies whether to include non-active, but not deleted apps in the results.
        /// </summary>
        [Input("includeNonDeleted")]
        public bool? IncludeNonDeleted { get; set; }

        /// <summary>
        /// Searches for applications whose label or name property matches this value exactly.
        /// </summary>
        [Input("label")]
        public string? Label { get; set; }

        /// <summary>
        /// Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
        /// </summary>
        [Input("labelPrefix")]
        public string? LabelPrefix { get; set; }

        /// <summary>
        /// Searches for apps with name or label properties that starts with the `q` value.
        /// </summary>
        [Input("q")]
        public string? Q { get; set; }

        /// <summary>
        /// Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
        /// </summary>
        [Input("useOptimization")]
        public bool? UseOptimization { get; set; }

        public GetAppsArgs()
        {
        }
        public static new GetAppsArgs Empty => new GetAppsArgs();
    }

    public sealed class GetAppsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Search only active applications.
        /// </summary>
        [Input("activeOnly")]
        public Input<bool>? ActiveOnly { get; set; }

        /// <summary>
        /// Specifies whether to include non-active, but not deleted apps in the results.
        /// </summary>
        [Input("includeNonDeleted")]
        public Input<bool>? IncludeNonDeleted { get; set; }

        /// <summary>
        /// Searches for applications whose label or name property matches this value exactly.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
        /// </summary>
        [Input("labelPrefix")]
        public Input<string>? LabelPrefix { get; set; }

        /// <summary>
        /// Searches for apps with name or label properties that starts with the `q` value.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        /// <summary>
        /// Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
        /// </summary>
        [Input("useOptimization")]
        public Input<bool>? UseOptimization { get; set; }

        public GetAppsInvokeArgs()
        {
        }
        public static new GetAppsInvokeArgs Empty => new GetAppsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppsResult
    {
        /// <summary>
        /// Search only active applications.
        /// </summary>
        public readonly bool? ActiveOnly;
        /// <summary>
        /// The list of applications that match the search criteria.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppsAppResult> Apps;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies whether to include non-active, but not deleted apps in the results.
        /// </summary>
        public readonly bool? IncludeNonDeleted;
        /// <summary>
        /// Searches for applications whose label or name property matches this value exactly.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
        /// </summary>
        public readonly string? LabelPrefix;
        /// <summary>
        /// Searches for apps with name or label properties that starts with the `q` value.
        /// </summary>
        public readonly string? Q;
        /// <summary>
        /// Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
        /// </summary>
        public readonly bool? UseOptimization;

        [OutputConstructor]
        private GetAppsResult(
            bool? activeOnly,

            ImmutableArray<Outputs.GetAppsAppResult> apps,

            string id,

            bool? includeNonDeleted,

            string? label,

            string? labelPrefix,

            string? q,

            bool? useOptimization)
        {
            ActiveOnly = activeOnly;
            Apps = apps;
            Id = id;
            IncludeNonDeleted = includeNonDeleted;
            Label = label;
            LabelPrefix = labelPrefix;
            Q = q;
            UseOptimization = useOptimization;
        }
    }
}
