// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetEmailCustomizations
    {
        /// <summary>
        /// Get the email customizations of an email template belonging to a brand in an Okta organization.
        /// </summary>
        public static Task<GetEmailCustomizationsResult> InvokeAsync(GetEmailCustomizationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEmailCustomizationsResult>("okta:index/getEmailCustomizations:getEmailCustomizations", args ?? new GetEmailCustomizationsArgs(), options.WithDefaults());

        /// <summary>
        /// Get the email customizations of an email template belonging to a brand in an Okta organization.
        /// </summary>
        public static Output<GetEmailCustomizationsResult> Invoke(GetEmailCustomizationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEmailCustomizationsResult>("okta:index/getEmailCustomizations:getEmailCustomizations", args ?? new GetEmailCustomizationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEmailCustomizationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public string BrandId { get; set; } = null!;

        /// <summary>
        /// Template Name
        /// </summary>
        [Input("templateName", required: true)]
        public string TemplateName { get; set; } = null!;

        public GetEmailCustomizationsArgs()
        {
        }
        public static new GetEmailCustomizationsArgs Empty => new GetEmailCustomizationsArgs();
    }

    public sealed class GetEmailCustomizationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        [Input("brandId", required: true)]
        public Input<string> BrandId { get; set; } = null!;

        /// <summary>
        /// Template Name
        /// </summary>
        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public GetEmailCustomizationsInvokeArgs()
        {
        }
        public static new GetEmailCustomizationsInvokeArgs Empty => new GetEmailCustomizationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEmailCustomizationsResult
    {
        /// <summary>
        /// Brand ID
        /// </summary>
        public readonly string BrandId;
        /// <summary>
        /// List of `okta.EmailCustomization` belonging to the named email template of the brand in the organization
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEmailCustomizationsEmailCustomizationResult> EmailCustomizations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Template Name
        /// </summary>
        public readonly string TemplateName;

        [OutputConstructor]
        private GetEmailCustomizationsResult(
            string brandId,

            ImmutableArray<Outputs.GetEmailCustomizationsEmailCustomizationResult> emailCustomizations,

            string id,

            string templateName)
        {
            BrandId = brandId;
            EmailCustomizations = emailCustomizations;
            Id = id;
            TemplateName = templateName;
        }
    }
}