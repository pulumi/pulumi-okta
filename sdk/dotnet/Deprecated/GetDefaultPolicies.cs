// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Deprecated
{
    public static partial class Invokes
    {
        public static Task<GetDefaultPoliciesResult> GetDefaultPolicies(GetDefaultPoliciesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDefaultPoliciesResult>("okta:deprecated/getDefaultPolicies:getDefaultPolicies", args, options.WithVersion());
    }

    public sealed class GetDefaultPoliciesArgs : Pulumi.ResourceArgs
    {
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetDefaultPoliciesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetDefaultPoliciesResult
    {
        public readonly string Type;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDefaultPoliciesResult(
            string type,
            string id)
        {
            Type = type;
            Id = id;
        }
    }
}