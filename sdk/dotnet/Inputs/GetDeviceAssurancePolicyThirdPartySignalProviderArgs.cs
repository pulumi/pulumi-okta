// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Inputs
{

    public sealed class GetDeviceAssurancePolicyThirdPartySignalProviderInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dtc", required: true)]
        public Input<Inputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtcInputArgs> Dtc { get; set; } = null!;

        public GetDeviceAssurancePolicyThirdPartySignalProviderInputArgs()
        {
        }
        public static new GetDeviceAssurancePolicyThirdPartySignalProviderInputArgs Empty => new GetDeviceAssurancePolicyThirdPartySignalProviderInputArgs();
    }
}
