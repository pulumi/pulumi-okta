// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Outputs
{

    [OutputType]
    public sealed class GetDeviceAssurancePolicyOsVersionConstraintResult
    {
        public readonly Outputs.GetDeviceAssurancePolicyOsVersionConstraintDynamicVersionRequirementResult DynamicVersionRequirement;
        public readonly string MajorVersionConstraint;

        [OutputConstructor]
        private GetDeviceAssurancePolicyOsVersionConstraintResult(
            Outputs.GetDeviceAssurancePolicyOsVersionConstraintDynamicVersionRequirementResult dynamicVersionRequirement,

            string majorVersionConstraint)
        {
            DynamicVersionRequirement = dynamicVersionRequirement;
            MajorVersionConstraint = majorVersionConstraint;
        }
    }
}