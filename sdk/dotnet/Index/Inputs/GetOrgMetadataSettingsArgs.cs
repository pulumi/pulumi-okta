// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Index.Inputs
{

    public sealed class GetOrgMetadataSettingsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("analyticsCollectionEnabled", required: true)]
        public Input<bool> AnalyticsCollectionEnabled { get; set; } = null!;

        [Input("bugReportingEnabled", required: true)]
        public Input<bool> BugReportingEnabled { get; set; } = null!;

        /// <summary>
        /// Whether the legacy Okta Mobile application is enabled for the org
        /// </summary>
        [Input("omEnabled", required: true)]
        public Input<bool> OmEnabled { get; set; } = null!;

        public GetOrgMetadataSettingsInputArgs()
        {
        }
        public static new GetOrgMetadataSettingsInputArgs Empty => new GetOrgMetadataSettingsInputArgs();
    }
}