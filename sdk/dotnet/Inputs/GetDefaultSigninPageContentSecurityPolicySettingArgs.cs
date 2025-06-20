// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Inputs
{

    public sealed class GetDefaultSigninPageContentSecurityPolicySettingInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enforced or report_only
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("reportUri", required: true)]
        public Input<string> ReportUri { get; set; } = null!;

        [Input("srcLists", required: true)]
        private InputList<string>? _srcLists;
        public InputList<string> SrcLists
        {
            get => _srcLists ?? (_srcLists = new InputList<string>());
            set => _srcLists = value;
        }

        public GetDefaultSigninPageContentSecurityPolicySettingInputArgs()
        {
        }
        public static new GetDefaultSigninPageContentSecurityPolicySettingInputArgs Empty => new GetDefaultSigninPageContentSecurityPolicySettingInputArgs();
    }
}
