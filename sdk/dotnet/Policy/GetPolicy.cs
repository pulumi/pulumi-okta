// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy
{
    public static class GetPolicy
    {
        /// <summary>
        /// Get a policy from Okta.
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
        ///     var example = Okta.Policy.GetPolicy.Invoke(new()
        ///     {
        ///         Name = "Password Policy Example",
        ///         Type = "PASSWORD",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPolicyResult> InvokeAsync(GetPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPolicyResult>("okta:policy/getPolicy:getPolicy", args ?? new GetPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Get a policy from Okta.
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
        ///     var example = Okta.Policy.GetPolicy.Invoke(new()
        ///     {
        ///         Name = "Password Policy Example",
        ///         Type = "PASSWORD",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyResult> Invoke(GetPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyResult>("okta:policy/getPolicy:getPolicy", args ?? new GetPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a policy from Okta.
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
        ///     var example = Okta.Policy.GetPolicy.Invoke(new()
        ///     {
        ///         Name = "Password Policy Example",
        ///         Type = "PASSWORD",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyResult> Invoke(GetPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyResult>("okta:policy/getPolicy:getPolicy", args ?? new GetPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the policy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Policy type, see https://developer.okta.com/docs/reference/api/policy/#policy-object
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetPolicyArgs()
        {
        }
        public static new GetPolicyArgs Empty => new GetPolicyArgs();
    }

    public sealed class GetPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the policy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Policy type, see https://developer.okta.com/docs/reference/api/policy/#policy-object
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetPolicyInvokeArgs()
        {
        }
        public static new GetPolicyInvokeArgs Empty => new GetPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetPolicyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the policy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Status of the policy
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Policy type, see https://developer.okta.com/docs/reference/api/policy/#policy-object
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPolicyResult(
            string id,

            string name,

            string status,

            string type)
        {
            Id = id;
            Name = name;
            Status = status;
            Type = type;
        }
    }
}
