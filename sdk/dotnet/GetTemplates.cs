// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetTemplates
    {
        /// <summary>
        /// Get the email templates belonging to a brand in an Okta organization.
        /// </summary>
        public static Task<GetTemplatesResult> InvokeAsync(GetTemplatesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTemplatesResult>("okta:index/getTemplates:getTemplates", args ?? new GetTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// Get the email templates belonging to a brand in an Okta organization.
        /// </summary>
        public static Output<GetTemplatesResult> Invoke(GetTemplatesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTemplatesResult>("okta:index/getTemplates:getTemplates", args ?? new GetTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTemplatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public string BrandId { get; set; } = null!;

        public GetTemplatesArgs()
        {
        }
        public static new GetTemplatesArgs Empty => new GetTemplatesArgs();
    }

    public sealed class GetTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public Input<string> BrandId { get; set; } = null!;

        public GetTemplatesInvokeArgs()
        {
        }
        public static new GetTemplatesInvokeArgs Empty => new GetTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTemplatesResult
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        public readonly string BrandId;
        /// <summary>
        /// List of `okta.getTemplate` belonging to a brand in the organization
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTemplatesEmailTemplateResult> EmailTemplates;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetTemplatesResult(
            string brandId,

            ImmutableArray<Outputs.GetTemplatesEmailTemplateResult> emailTemplates,

            string id)
        {
            BrandId = brandId;
            EmailTemplates = emailTemplates;
            Id = id;
        }
    }
}