// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Index.Outputs
{

    [OutputType]
    public sealed class GetLogStreamSettingsResult
    {
        /// <summary>
        /// AWS account ID. Required only for 'aws_eventbridge' type
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Edition of the Splunk Cloud instance. Could be one of: 'aws', 'aws_govcloud', 'gcp'. Required only for 'splunk_cloud_logstreaming' type
        /// </summary>
        public readonly string Edition;
        /// <summary>
        /// An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for 'aws_eventbridge' type
        /// </summary>
        public readonly string EventSourceName;
        /// <summary>
        /// The domain name for Splunk Cloud instance. Don't include http or https in the string. For example: 'acme.splunkcloud.com'. Required only for 'splunk_cloud_logstreaming' type
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The destination AWS region where event source is located. Required only for 'aws_eventbridge' type
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The HEC token for your Splunk Cloud HTTP Event Collector. Required only for 'splunk_cloud_logstreaming' type
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private GetLogStreamSettingsResult(
            string accountId,

            string edition,

            string eventSourceName,

            string host,

            string region,

            string token)
        {
            AccountId = accountId;
            Edition = edition;
            EventSourceName = eventSourceName;
            Host = host;
            Region = region;
            Token = token;
        }
    }
}