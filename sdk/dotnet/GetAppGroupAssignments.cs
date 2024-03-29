// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetAppGroupAssignments
    {
        /// <summary>
        /// Use this data source to retrieve the list of groups assigned to the given Okta application (by ID).
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Okta.GetAppGroupAssignments.Invoke(new()
        ///     {
        ///         Id = okta_app_oauth.Test.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetAppGroupAssignmentsResult> InvokeAsync(GetAppGroupAssignmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppGroupAssignmentsResult>("okta:index/getAppGroupAssignments:getAppGroupAssignments", args ?? new GetAppGroupAssignmentsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve the list of groups assigned to the given Okta application (by ID).
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Okta = Pulumi.Okta;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Okta.GetAppGroupAssignments.Invoke(new()
        ///     {
        ///         Id = okta_app_oauth.Test.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetAppGroupAssignmentsResult> Invoke(GetAppGroupAssignmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppGroupAssignmentsResult>("okta:index/getAppGroupAssignments:getAppGroupAssignments", args ?? new GetAppGroupAssignmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppGroupAssignmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Okta application you want to retrieve the groups for.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetAppGroupAssignmentsArgs()
        {
        }
        public static new GetAppGroupAssignmentsArgs Empty => new GetAppGroupAssignmentsArgs();
    }

    public sealed class GetAppGroupAssignmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Okta application you want to retrieve the groups for.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetAppGroupAssignmentsInvokeArgs()
        {
        }
        public static new GetAppGroupAssignmentsInvokeArgs Empty => new GetAppGroupAssignmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppGroupAssignmentsResult
    {
        /// <summary>
        /// List of groups IDs assigned to the application.
        /// </summary>
        public readonly ImmutableArray<string> Groups;
        /// <summary>
        /// ID of application.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAppGroupAssignmentsResult(
            ImmutableArray<string> groups,

            string id)
        {
            Groups = groups;
            Id = id;
        }
    }
}
