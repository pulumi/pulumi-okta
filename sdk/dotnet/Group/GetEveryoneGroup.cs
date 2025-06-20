// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Group
{
    public static class GetEveryoneGroup
    {
        /// <summary>
        /// Use this data source to retrieve the `Everyone` group from Okta. The 
        /// same can be achieved with the `okta.group.Group` data
        /// source with `name = "Everyone"`. This is simply a shortcut.
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
        ///     var example = Okta.Group.GetEveryoneGroup.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEveryoneGroupResult> InvokeAsync(GetEveryoneGroupArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEveryoneGroupResult>("okta:group/getEveryoneGroup:getEveryoneGroup", args ?? new GetEveryoneGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve the `Everyone` group from Okta. The 
        /// same can be achieved with the `okta.group.Group` data
        /// source with `name = "Everyone"`. This is simply a shortcut.
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
        ///     var example = Okta.Group.GetEveryoneGroup.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEveryoneGroupResult> Invoke(GetEveryoneGroupInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEveryoneGroupResult>("okta:group/getEveryoneGroup:getEveryoneGroup", args ?? new GetEveryoneGroupInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve the `Everyone` group from Okta. The 
        /// same can be achieved with the `okta.group.Group` data
        /// source with `name = "Everyone"`. This is simply a shortcut.
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
        ///     var example = Okta.Group.GetEveryoneGroup.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEveryoneGroupResult> Invoke(GetEveryoneGroupInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEveryoneGroupResult>("okta:group/getEveryoneGroup:getEveryoneGroup", args ?? new GetEveryoneGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEveryoneGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Fetch group users, having default off cuts down on API calls.
        /// </summary>
        [Input("includeUsers")]
        public bool? IncludeUsers { get; set; }

        public GetEveryoneGroupArgs()
        {
        }
        public static new GetEveryoneGroupArgs Empty => new GetEveryoneGroupArgs();
    }

    public sealed class GetEveryoneGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Fetch group users, having default off cuts down on API calls.
        /// </summary>
        [Input("includeUsers")]
        public Input<bool>? IncludeUsers { get; set; }

        public GetEveryoneGroupInvokeArgs()
        {
        }
        public static new GetEveryoneGroupInvokeArgs Empty => new GetEveryoneGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetEveryoneGroupResult
    {
        /// <summary>
        /// Description of group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Fetch group users, having default off cuts down on API calls.
        /// </summary>
        public readonly bool? IncludeUsers;

        [OutputConstructor]
        private GetEveryoneGroupResult(
            string description,

            string id,

            bool? includeUsers)
        {
            Description = description;
            Id = id;
            IncludeUsers = includeUsers;
        }
    }
}
