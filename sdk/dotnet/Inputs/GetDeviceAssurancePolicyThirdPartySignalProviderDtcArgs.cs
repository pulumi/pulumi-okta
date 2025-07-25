// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Inputs
{

    public sealed class GetDeviceAssurancePolicyThirdPartySignalProviderDtcInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowScreenLock", required: true)]
        public Input<bool> AllowScreenLock { get; set; } = null!;

        [Input("browserVersion", required: true)]
        public Input<Inputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersionInputArgs> BrowserVersion { get; set; } = null!;

        [Input("builtInDnsClientEnabled", required: true)]
        public Input<bool> BuiltInDnsClientEnabled { get; set; } = null!;

        [Input("chromeRemoteDesktopAppBlocked", required: true)]
        public Input<bool> ChromeRemoteDesktopAppBlocked { get; set; } = null!;

        [Input("crowdStrikeAgentId", required: true)]
        public Input<string> CrowdStrikeAgentId { get; set; } = null!;

        [Input("crowdStrikeCustomerId", required: true)]
        public Input<string> CrowdStrikeCustomerId { get; set; } = null!;

        [Input("deviceEnrollmentDomain", required: true)]
        public Input<string> DeviceEnrollmentDomain { get; set; } = null!;

        [Input("diskEncrypted", required: true)]
        public Input<bool> DiskEncrypted { get; set; } = null!;

        [Input("keyTrustLevel", required: true)]
        public Input<string> KeyTrustLevel { get; set; } = null!;

        [Input("managedDevice", required: true)]
        public Input<bool> ManagedDevice { get; set; } = null!;

        [Input("osFirewall", required: true)]
        public Input<bool> OsFirewall { get; set; } = null!;

        [Input("osVersion", required: true)]
        public Input<Inputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersionInputArgs> OsVersion { get; set; } = null!;

        [Input("passwordProtectionWarningTrigger", required: true)]
        public Input<string> PasswordProtectionWarningTrigger { get; set; } = null!;

        [Input("realtimeUrlCheckMode", required: true)]
        public Input<bool> RealtimeUrlCheckMode { get; set; } = null!;

        [Input("safeBrowsingProtectionLevel", required: true)]
        public Input<string> SafeBrowsingProtectionLevel { get; set; } = null!;

        [Input("screenLockSecured", required: true)]
        public Input<bool> ScreenLockSecured { get; set; } = null!;

        [Input("siteIsolationEnabled", required: true)]
        public Input<bool> SiteIsolationEnabled { get; set; } = null!;

        [Input("thirdPartyBlockingEnabled", required: true)]
        public Input<bool> ThirdPartyBlockingEnabled { get; set; } = null!;

        [Input("windowsMachineDomain", required: true)]
        public Input<string> WindowsMachineDomain { get; set; } = null!;

        [Input("windowsUserDomain", required: true)]
        public Input<string> WindowsUserDomain { get; set; } = null!;

        public GetDeviceAssurancePolicyThirdPartySignalProviderDtcInputArgs()
        {
        }
        public static new GetDeviceAssurancePolicyThirdPartySignalProviderDtcInputArgs Empty => new GetDeviceAssurancePolicyThirdPartySignalProviderDtcInputArgs();
    }
}
