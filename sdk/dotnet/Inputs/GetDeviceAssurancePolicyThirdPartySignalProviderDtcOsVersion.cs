// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Inputs
{

    public sealed class GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersionArgs : global::Pulumi.InvokeArgs
    {
        [Input("minimum", required: true)]
        public string Minimum { get; set; } = null!;

        public GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersionArgs()
        {
        }
        public static new GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersionArgs Empty => new GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersionArgs();
    }
}