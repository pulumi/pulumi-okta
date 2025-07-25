// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetTemplate
    {
        /// <summary>
        /// Get a single Email Template for a Brand belonging to an Okta organization.
        /// </summary>
        public static Task<GetTemplateResult> InvokeAsync(GetTemplateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTemplateResult>("okta:index/getTemplate:getTemplate", args ?? new GetTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// Get a single Email Template for a Brand belonging to an Okta organization.
        /// </summary>
        public static Output<GetTemplateResult> Invoke(GetTemplateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTemplateResult>("okta:index/getTemplate:getTemplate", args ?? new GetTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a single Email Template for a Brand belonging to an Okta organization.
        /// </summary>
        public static Output<GetTemplateResult> Invoke(GetTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTemplateResult>("okta:index/getTemplate:getTemplate", args ?? new GetTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public string BrandId { get; set; } = null!;

        /// <summary>
        /// The name of the email template
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetTemplateArgs()
        {
        }
        public static new GetTemplateArgs Empty => new GetTemplateArgs();
    }

    public sealed class GetTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public Input<string> BrandId { get; set; } = null!;

        /// <summary>
        /// The name of the email template
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTemplateInvokeArgs()
        {
        }
        public static new GetTemplateInvokeArgs Empty => new GetTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetTemplateResult
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        public readonly string BrandId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Link relations for this object - JSON HAL - Discoverable resources related to the email template
        /// </summary>
        public readonly string Links;
        /// <summary>
        /// The name of the email template
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetTemplateResult(
            string brandId,

            string id,

            string links,

            string name)
        {
            BrandId = brandId;
            Id = id;
            Links = links;
            Name = name;
        }
    }
}
