// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersion;
import com.pulumi.okta.outputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersion;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceAssurancePolicyThirdPartySignalProviderDtc {
    private Boolean allowScreenLock;
    private GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersion browserVersion;
    private Boolean builtInDnsClientEnabled;
    private Boolean chromeRemoteDesktopAppBlocked;
    private String crowdStrikeAgentId;
    private String crowdStrikeCustomerId;
    private String deviceEnrollmentDomain;
    private Boolean diskEncrypted;
    private String keyTrustLevel;
    private Boolean managedDevice;
    private Boolean osFirewall;
    private GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersion osVersion;
    private String passwordProtectionWarningTrigger;
    private Boolean realtimeUrlCheckMode;
    private String safeBrowsingProtectionLevel;
    private Boolean screenLockSecured;
    private Boolean siteIsolationEnabled;
    private Boolean thirdPartyBlockingEnabled;
    private String windowsMachineDomain;
    private String windowsUserDomain;

    private GetDeviceAssurancePolicyThirdPartySignalProviderDtc() {}
    public Boolean allowScreenLock() {
        return this.allowScreenLock;
    }
    public GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersion browserVersion() {
        return this.browserVersion;
    }
    public Boolean builtInDnsClientEnabled() {
        return this.builtInDnsClientEnabled;
    }
    public Boolean chromeRemoteDesktopAppBlocked() {
        return this.chromeRemoteDesktopAppBlocked;
    }
    public String crowdStrikeAgentId() {
        return this.crowdStrikeAgentId;
    }
    public String crowdStrikeCustomerId() {
        return this.crowdStrikeCustomerId;
    }
    public String deviceEnrollmentDomain() {
        return this.deviceEnrollmentDomain;
    }
    public Boolean diskEncrypted() {
        return this.diskEncrypted;
    }
    public String keyTrustLevel() {
        return this.keyTrustLevel;
    }
    public Boolean managedDevice() {
        return this.managedDevice;
    }
    public Boolean osFirewall() {
        return this.osFirewall;
    }
    public GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersion osVersion() {
        return this.osVersion;
    }
    public String passwordProtectionWarningTrigger() {
        return this.passwordProtectionWarningTrigger;
    }
    public Boolean realtimeUrlCheckMode() {
        return this.realtimeUrlCheckMode;
    }
    public String safeBrowsingProtectionLevel() {
        return this.safeBrowsingProtectionLevel;
    }
    public Boolean screenLockSecured() {
        return this.screenLockSecured;
    }
    public Boolean siteIsolationEnabled() {
        return this.siteIsolationEnabled;
    }
    public Boolean thirdPartyBlockingEnabled() {
        return this.thirdPartyBlockingEnabled;
    }
    public String windowsMachineDomain() {
        return this.windowsMachineDomain;
    }
    public String windowsUserDomain() {
        return this.windowsUserDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceAssurancePolicyThirdPartySignalProviderDtc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowScreenLock;
        private GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersion browserVersion;
        private Boolean builtInDnsClientEnabled;
        private Boolean chromeRemoteDesktopAppBlocked;
        private String crowdStrikeAgentId;
        private String crowdStrikeCustomerId;
        private String deviceEnrollmentDomain;
        private Boolean diskEncrypted;
        private String keyTrustLevel;
        private Boolean managedDevice;
        private Boolean osFirewall;
        private GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersion osVersion;
        private String passwordProtectionWarningTrigger;
        private Boolean realtimeUrlCheckMode;
        private String safeBrowsingProtectionLevel;
        private Boolean screenLockSecured;
        private Boolean siteIsolationEnabled;
        private Boolean thirdPartyBlockingEnabled;
        private String windowsMachineDomain;
        private String windowsUserDomain;
        public Builder() {}
        public Builder(GetDeviceAssurancePolicyThirdPartySignalProviderDtc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowScreenLock = defaults.allowScreenLock;
    	      this.browserVersion = defaults.browserVersion;
    	      this.builtInDnsClientEnabled = defaults.builtInDnsClientEnabled;
    	      this.chromeRemoteDesktopAppBlocked = defaults.chromeRemoteDesktopAppBlocked;
    	      this.crowdStrikeAgentId = defaults.crowdStrikeAgentId;
    	      this.crowdStrikeCustomerId = defaults.crowdStrikeCustomerId;
    	      this.deviceEnrollmentDomain = defaults.deviceEnrollmentDomain;
    	      this.diskEncrypted = defaults.diskEncrypted;
    	      this.keyTrustLevel = defaults.keyTrustLevel;
    	      this.managedDevice = defaults.managedDevice;
    	      this.osFirewall = defaults.osFirewall;
    	      this.osVersion = defaults.osVersion;
    	      this.passwordProtectionWarningTrigger = defaults.passwordProtectionWarningTrigger;
    	      this.realtimeUrlCheckMode = defaults.realtimeUrlCheckMode;
    	      this.safeBrowsingProtectionLevel = defaults.safeBrowsingProtectionLevel;
    	      this.screenLockSecured = defaults.screenLockSecured;
    	      this.siteIsolationEnabled = defaults.siteIsolationEnabled;
    	      this.thirdPartyBlockingEnabled = defaults.thirdPartyBlockingEnabled;
    	      this.windowsMachineDomain = defaults.windowsMachineDomain;
    	      this.windowsUserDomain = defaults.windowsUserDomain;
        }

        @CustomType.Setter
        public Builder allowScreenLock(Boolean allowScreenLock) {
            if (allowScreenLock == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "allowScreenLock");
            }
            this.allowScreenLock = allowScreenLock;
            return this;
        }
        @CustomType.Setter
        public Builder browserVersion(GetDeviceAssurancePolicyThirdPartySignalProviderDtcBrowserVersion browserVersion) {
            if (browserVersion == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "browserVersion");
            }
            this.browserVersion = browserVersion;
            return this;
        }
        @CustomType.Setter
        public Builder builtInDnsClientEnabled(Boolean builtInDnsClientEnabled) {
            if (builtInDnsClientEnabled == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "builtInDnsClientEnabled");
            }
            this.builtInDnsClientEnabled = builtInDnsClientEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder chromeRemoteDesktopAppBlocked(Boolean chromeRemoteDesktopAppBlocked) {
            if (chromeRemoteDesktopAppBlocked == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "chromeRemoteDesktopAppBlocked");
            }
            this.chromeRemoteDesktopAppBlocked = chromeRemoteDesktopAppBlocked;
            return this;
        }
        @CustomType.Setter
        public Builder crowdStrikeAgentId(String crowdStrikeAgentId) {
            if (crowdStrikeAgentId == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "crowdStrikeAgentId");
            }
            this.crowdStrikeAgentId = crowdStrikeAgentId;
            return this;
        }
        @CustomType.Setter
        public Builder crowdStrikeCustomerId(String crowdStrikeCustomerId) {
            if (crowdStrikeCustomerId == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "crowdStrikeCustomerId");
            }
            this.crowdStrikeCustomerId = crowdStrikeCustomerId;
            return this;
        }
        @CustomType.Setter
        public Builder deviceEnrollmentDomain(String deviceEnrollmentDomain) {
            if (deviceEnrollmentDomain == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "deviceEnrollmentDomain");
            }
            this.deviceEnrollmentDomain = deviceEnrollmentDomain;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncrypted(Boolean diskEncrypted) {
            if (diskEncrypted == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "diskEncrypted");
            }
            this.diskEncrypted = diskEncrypted;
            return this;
        }
        @CustomType.Setter
        public Builder keyTrustLevel(String keyTrustLevel) {
            if (keyTrustLevel == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "keyTrustLevel");
            }
            this.keyTrustLevel = keyTrustLevel;
            return this;
        }
        @CustomType.Setter
        public Builder managedDevice(Boolean managedDevice) {
            if (managedDevice == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "managedDevice");
            }
            this.managedDevice = managedDevice;
            return this;
        }
        @CustomType.Setter
        public Builder osFirewall(Boolean osFirewall) {
            if (osFirewall == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "osFirewall");
            }
            this.osFirewall = osFirewall;
            return this;
        }
        @CustomType.Setter
        public Builder osVersion(GetDeviceAssurancePolicyThirdPartySignalProviderDtcOsVersion osVersion) {
            if (osVersion == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "osVersion");
            }
            this.osVersion = osVersion;
            return this;
        }
        @CustomType.Setter
        public Builder passwordProtectionWarningTrigger(String passwordProtectionWarningTrigger) {
            if (passwordProtectionWarningTrigger == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "passwordProtectionWarningTrigger");
            }
            this.passwordProtectionWarningTrigger = passwordProtectionWarningTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder realtimeUrlCheckMode(Boolean realtimeUrlCheckMode) {
            if (realtimeUrlCheckMode == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "realtimeUrlCheckMode");
            }
            this.realtimeUrlCheckMode = realtimeUrlCheckMode;
            return this;
        }
        @CustomType.Setter
        public Builder safeBrowsingProtectionLevel(String safeBrowsingProtectionLevel) {
            if (safeBrowsingProtectionLevel == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "safeBrowsingProtectionLevel");
            }
            this.safeBrowsingProtectionLevel = safeBrowsingProtectionLevel;
            return this;
        }
        @CustomType.Setter
        public Builder screenLockSecured(Boolean screenLockSecured) {
            if (screenLockSecured == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "screenLockSecured");
            }
            this.screenLockSecured = screenLockSecured;
            return this;
        }
        @CustomType.Setter
        public Builder siteIsolationEnabled(Boolean siteIsolationEnabled) {
            if (siteIsolationEnabled == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "siteIsolationEnabled");
            }
            this.siteIsolationEnabled = siteIsolationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder thirdPartyBlockingEnabled(Boolean thirdPartyBlockingEnabled) {
            if (thirdPartyBlockingEnabled == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "thirdPartyBlockingEnabled");
            }
            this.thirdPartyBlockingEnabled = thirdPartyBlockingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder windowsMachineDomain(String windowsMachineDomain) {
            if (windowsMachineDomain == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "windowsMachineDomain");
            }
            this.windowsMachineDomain = windowsMachineDomain;
            return this;
        }
        @CustomType.Setter
        public Builder windowsUserDomain(String windowsUserDomain) {
            if (windowsUserDomain == null) {
              throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProviderDtc", "windowsUserDomain");
            }
            this.windowsUserDomain = windowsUserDomain;
            return this;
        }
        public GetDeviceAssurancePolicyThirdPartySignalProviderDtc build() {
            final var _resultValue = new GetDeviceAssurancePolicyThirdPartySignalProviderDtc();
            _resultValue.allowScreenLock = allowScreenLock;
            _resultValue.browserVersion = browserVersion;
            _resultValue.builtInDnsClientEnabled = builtInDnsClientEnabled;
            _resultValue.chromeRemoteDesktopAppBlocked = chromeRemoteDesktopAppBlocked;
            _resultValue.crowdStrikeAgentId = crowdStrikeAgentId;
            _resultValue.crowdStrikeCustomerId = crowdStrikeCustomerId;
            _resultValue.deviceEnrollmentDomain = deviceEnrollmentDomain;
            _resultValue.diskEncrypted = diskEncrypted;
            _resultValue.keyTrustLevel = keyTrustLevel;
            _resultValue.managedDevice = managedDevice;
            _resultValue.osFirewall = osFirewall;
            _resultValue.osVersion = osVersion;
            _resultValue.passwordProtectionWarningTrigger = passwordProtectionWarningTrigger;
            _resultValue.realtimeUrlCheckMode = realtimeUrlCheckMode;
            _resultValue.safeBrowsingProtectionLevel = safeBrowsingProtectionLevel;
            _resultValue.screenLockSecured = screenLockSecured;
            _resultValue.siteIsolationEnabled = siteIsolationEnabled;
            _resultValue.thirdPartyBlockingEnabled = thirdPartyBlockingEnabled;
            _resultValue.windowsMachineDomain = windowsMachineDomain;
            _resultValue.windowsUserDomain = windowsUserDomain;
            return _resultValue;
        }
    }
}