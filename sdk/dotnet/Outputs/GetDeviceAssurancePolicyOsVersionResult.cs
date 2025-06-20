// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Outputs
{

    [OutputType]
    public sealed class GetDeviceAssurancePolicyOsVersionResult
    {
        public readonly Outputs.GetDeviceAssurancePolicyOsVersionDynamicVersionRequirementResult DynamicVersionRequirement;
        public readonly string Minimum;

        [OutputConstructor]
        private GetDeviceAssurancePolicyOsVersionResult(
            Outputs.GetDeviceAssurancePolicyOsVersionDynamicVersionRequirementResult dynamicVersionRequirement,

            string minimum)
        {
            DynamicVersionRequirement = dynamicVersionRequirement;
            Minimum = minimum;
        }
    }
}
