// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Index.Inputs
{

    public sealed class GetOrgMetadataSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("analyticsCollectionEnabled", required: true)]
        public bool AnalyticsCollectionEnabled { get; set; }

        [Input("bugReportingEnabled", required: true)]
        public bool BugReportingEnabled { get; set; }

        /// <summary>
        /// Whether the legacy Okta Mobile application is enabled for the org
        /// </summary>
        [Input("omEnabled", required: true)]
        public bool OmEnabled { get; set; }

        public GetOrgMetadataSettingsArgs()
        {
        }
        public static new GetOrgMetadataSettingsArgs Empty => new GetOrgMetadataSettingsArgs();
    }
}