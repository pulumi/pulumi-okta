// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    public static class GetLogStream
    {
        /// <summary>
        /// Log Streams
        /// </summary>
        public static Task<GetLogStreamResult> InvokeAsync(GetLogStreamArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogStreamResult>("okta:index/getLogStream:getLogStream", args ?? new GetLogStreamArgs(), options.WithDefaults());

        /// <summary>
        /// Log Streams
        /// </summary>
        public static Output<GetLogStreamResult> Invoke(GetLogStreamInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogStreamResult>("okta:index/getLogStream:getLogStream", args ?? new GetLogStreamInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Log Streams
        /// </summary>
        public static Output<GetLogStreamResult> Invoke(GetLogStreamInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogStreamResult>("okta:index/getLogStream:getLogStream", args ?? new GetLogStreamInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLogStreamArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the log stream to retrieve, conflicts with `name`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Unique name for the Log Stream object, conflicts with `id`.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("settings")]
        public Inputs.GetLogStreamSettingsArgs? Settings { get; set; }

        public GetLogStreamArgs()
        {
        }
        public static new GetLogStreamArgs Empty => new GetLogStreamArgs();
    }

    public sealed class GetLogStreamInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the log stream to retrieve, conflicts with `name`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Unique name for the Log Stream object, conflicts with `id`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("settings")]
        public Input<Inputs.GetLogStreamSettingsInputArgs>? Settings { get; set; }

        public GetLogStreamInvokeArgs()
        {
        }
        public static new GetLogStreamInvokeArgs Empty => new GetLogStreamInvokeArgs();
    }


    [OutputType]
    public sealed class GetLogStreamResult
    {
        /// <summary>
        /// ID of the log stream to retrieve, conflicts with `name`.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Unique name for the Log Stream object, conflicts with `id`.
        /// </summary>
        public readonly string? Name;
        public readonly Outputs.GetLogStreamSettingsResult? Settings;
        /// <summary>
        /// Log Stream Status - can either be ACTIVE or INACTIVE only
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Streaming provider used - aws*eventbridge or splunk*cloud_logstreaming
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetLogStreamResult(
            string? id,

            string? name,

            Outputs.GetLogStreamSettingsResult? settings,

            string status,

            string type)
        {
            Id = id;
            Name = name;
            Settings = settings;
            Status = status;
            Type = type;
        }
    }
}
