// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceAssuranceMacosArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceAssuranceMacosArgs Empty = new DeviceAssuranceMacosArgs();

    /**
     * List of disk encryption type, can be ALL_INTERNAL_VOLUMES
     * 
     */
    @Import(name="diskEncryptionTypes")
    private @Nullable Output<List<String>> diskEncryptionTypes;

    /**
     * @return List of disk encryption type, can be ALL_INTERNAL_VOLUMES
     * 
     */
    public Optional<Output<List<String>>> diskEncryptionTypes() {
        return Optional.ofNullable(this.diskEncryptionTypes);
    }

    /**
     * Policy device assurance name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Policy device assurance name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The device os minimum version
     * 
     */
    @Import(name="osVersion")
    private @Nullable Output<String> osVersion;

    /**
     * @return The device os minimum version
     * 
     */
    public Optional<Output<String>> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    /**
     * List of screenlock type, can be BIOMETRIC or BIOMETRIC, PASSCODE
     * 
     */
    @Import(name="screenlockTypes")
    private @Nullable Output<List<String>> screenlockTypes;

    /**
     * @return List of screenlock type, can be BIOMETRIC or BIOMETRIC, PASSCODE
     * 
     */
    public Optional<Output<List<String>>> screenlockTypes() {
        return Optional.ofNullable(this.screenlockTypes);
    }

    /**
     * Indicates if the device constains a secure hardware functionality
     * 
     */
    @Import(name="secureHardwarePresent")
    private @Nullable Output<Boolean> secureHardwarePresent;

    /**
     * @return Indicates if the device constains a secure hardware functionality
     * 
     */
    public Optional<Output<Boolean>> secureHardwarePresent() {
        return Optional.ofNullable(this.secureHardwarePresent);
    }

    /**
     * Check to include third party signal provider
     * 
     */
    @Import(name="thirdPartySignalProviders")
    private @Nullable Output<Boolean> thirdPartySignalProviders;

    /**
     * @return Check to include third party signal provider
     * 
     */
    public Optional<Output<Boolean>> thirdPartySignalProviders() {
        return Optional.ofNullable(this.thirdPartySignalProviders);
    }

    /**
     * Third party signal provider minimum browser version
     * 
     */
    @Import(name="tpspBrowserVersion")
    private @Nullable Output<String> tpspBrowserVersion;

    /**
     * @return Third party signal provider minimum browser version
     * 
     */
    public Optional<Output<String>> tpspBrowserVersion() {
        return Optional.ofNullable(this.tpspBrowserVersion);
    }

    /**
     * Third party signal provider builtin dns client enable
     * 
     */
    @Import(name="tpspBuiltinDnsClientEnabled")
    private @Nullable Output<Boolean> tpspBuiltinDnsClientEnabled;

    /**
     * @return Third party signal provider builtin dns client enable
     * 
     */
    public Optional<Output<Boolean>> tpspBuiltinDnsClientEnabled() {
        return Optional.ofNullable(this.tpspBuiltinDnsClientEnabled);
    }

    /**
     * Third party signal provider chrome remote desktop app blocked
     * 
     */
    @Import(name="tpspChromeRemoteDesktopAppBlocked")
    private @Nullable Output<Boolean> tpspChromeRemoteDesktopAppBlocked;

    /**
     * @return Third party signal provider chrome remote desktop app blocked
     * 
     */
    public Optional<Output<Boolean>> tpspChromeRemoteDesktopAppBlocked() {
        return Optional.ofNullable(this.tpspChromeRemoteDesktopAppBlocked);
    }

    /**
     * Third party signal provider device enrollment domain
     * 
     */
    @Import(name="tpspDeviceEnrollmentDomain")
    private @Nullable Output<String> tpspDeviceEnrollmentDomain;

    /**
     * @return Third party signal provider device enrollment domain
     * 
     */
    public Optional<Output<String>> tpspDeviceEnrollmentDomain() {
        return Optional.ofNullable(this.tpspDeviceEnrollmentDomain);
    }

    /**
     * Third party signal provider disk encrypted
     * 
     */
    @Import(name="tpspDiskEncrypted")
    private @Nullable Output<Boolean> tpspDiskEncrypted;

    /**
     * @return Third party signal provider disk encrypted
     * 
     */
    public Optional<Output<Boolean>> tpspDiskEncrypted() {
        return Optional.ofNullable(this.tpspDiskEncrypted);
    }

    /**
     * Third party signal provider key trust level
     * 
     */
    @Import(name="tpspKeyTrustLevel")
    private @Nullable Output<String> tpspKeyTrustLevel;

    /**
     * @return Third party signal provider key trust level
     * 
     */
    public Optional<Output<String>> tpspKeyTrustLevel() {
        return Optional.ofNullable(this.tpspKeyTrustLevel);
    }

    /**
     * Third party signal provider os firewall
     * 
     */
    @Import(name="tpspOsFirewall")
    private @Nullable Output<Boolean> tpspOsFirewall;

    /**
     * @return Third party signal provider os firewall
     * 
     */
    public Optional<Output<Boolean>> tpspOsFirewall() {
        return Optional.ofNullable(this.tpspOsFirewall);
    }

    /**
     * Third party signal provider minimum os version
     * 
     */
    @Import(name="tpspOsVersion")
    private @Nullable Output<String> tpspOsVersion;

    /**
     * @return Third party signal provider minimum os version
     * 
     */
    public Optional<Output<String>> tpspOsVersion() {
        return Optional.ofNullable(this.tpspOsVersion);
    }

    /**
     * Third party signal provider password protection warning trigger
     * 
     */
    @Import(name="tpspPasswordProctectionWarningTrigger")
    private @Nullable Output<String> tpspPasswordProctectionWarningTrigger;

    /**
     * @return Third party signal provider password protection warning trigger
     * 
     */
    public Optional<Output<String>> tpspPasswordProctectionWarningTrigger() {
        return Optional.ofNullable(this.tpspPasswordProctectionWarningTrigger);
    }

    /**
     * Third party signal provider realtime url check mode
     * 
     */
    @Import(name="tpspRealtimeUrlCheckMode")
    private @Nullable Output<Boolean> tpspRealtimeUrlCheckMode;

    /**
     * @return Third party signal provider realtime url check mode
     * 
     */
    public Optional<Output<Boolean>> tpspRealtimeUrlCheckMode() {
        return Optional.ofNullable(this.tpspRealtimeUrlCheckMode);
    }

    /**
     * Third party signal provider safe browsing protection level
     * 
     */
    @Import(name="tpspSafeBrowsingProtectionLevel")
    private @Nullable Output<String> tpspSafeBrowsingProtectionLevel;

    /**
     * @return Third party signal provider safe browsing protection level
     * 
     */
    public Optional<Output<String>> tpspSafeBrowsingProtectionLevel() {
        return Optional.ofNullable(this.tpspSafeBrowsingProtectionLevel);
    }

    /**
     * Third party signal provider screen lock secure
     * 
     */
    @Import(name="tpspScreenLockSecured")
    private @Nullable Output<Boolean> tpspScreenLockSecured;

    /**
     * @return Third party signal provider screen lock secure
     * 
     */
    public Optional<Output<Boolean>> tpspScreenLockSecured() {
        return Optional.ofNullable(this.tpspScreenLockSecured);
    }

    /**
     * Third party signal provider site isolation enabled
     * 
     */
    @Import(name="tpspSiteIsolationEnabled")
    private @Nullable Output<Boolean> tpspSiteIsolationEnabled;

    /**
     * @return Third party signal provider site isolation enabled
     * 
     */
    public Optional<Output<Boolean>> tpspSiteIsolationEnabled() {
        return Optional.ofNullable(this.tpspSiteIsolationEnabled);
    }

    private DeviceAssuranceMacosArgs() {}

    private DeviceAssuranceMacosArgs(DeviceAssuranceMacosArgs $) {
        this.diskEncryptionTypes = $.diskEncryptionTypes;
        this.name = $.name;
        this.osVersion = $.osVersion;
        this.screenlockTypes = $.screenlockTypes;
        this.secureHardwarePresent = $.secureHardwarePresent;
        this.thirdPartySignalProviders = $.thirdPartySignalProviders;
        this.tpspBrowserVersion = $.tpspBrowserVersion;
        this.tpspBuiltinDnsClientEnabled = $.tpspBuiltinDnsClientEnabled;
        this.tpspChromeRemoteDesktopAppBlocked = $.tpspChromeRemoteDesktopAppBlocked;
        this.tpspDeviceEnrollmentDomain = $.tpspDeviceEnrollmentDomain;
        this.tpspDiskEncrypted = $.tpspDiskEncrypted;
        this.tpspKeyTrustLevel = $.tpspKeyTrustLevel;
        this.tpspOsFirewall = $.tpspOsFirewall;
        this.tpspOsVersion = $.tpspOsVersion;
        this.tpspPasswordProctectionWarningTrigger = $.tpspPasswordProctectionWarningTrigger;
        this.tpspRealtimeUrlCheckMode = $.tpspRealtimeUrlCheckMode;
        this.tpspSafeBrowsingProtectionLevel = $.tpspSafeBrowsingProtectionLevel;
        this.tpspScreenLockSecured = $.tpspScreenLockSecured;
        this.tpspSiteIsolationEnabled = $.tpspSiteIsolationEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceAssuranceMacosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceAssuranceMacosArgs $;

        public Builder() {
            $ = new DeviceAssuranceMacosArgs();
        }

        public Builder(DeviceAssuranceMacosArgs defaults) {
            $ = new DeviceAssuranceMacosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionTypes List of disk encryption type, can be ALL_INTERNAL_VOLUMES
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionTypes(@Nullable Output<List<String>> diskEncryptionTypes) {
            $.diskEncryptionTypes = diskEncryptionTypes;
            return this;
        }

        /**
         * @param diskEncryptionTypes List of disk encryption type, can be ALL_INTERNAL_VOLUMES
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionTypes(List<String> diskEncryptionTypes) {
            return diskEncryptionTypes(Output.of(diskEncryptionTypes));
        }

        /**
         * @param diskEncryptionTypes List of disk encryption type, can be ALL_INTERNAL_VOLUMES
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionTypes(String... diskEncryptionTypes) {
            return diskEncryptionTypes(List.of(diskEncryptionTypes));
        }

        /**
         * @param name Policy device assurance name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Policy device assurance name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osVersion The device os minimum version
         * 
         * @return builder
         * 
         */
        public Builder osVersion(@Nullable Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param osVersion The device os minimum version
         * 
         * @return builder
         * 
         */
        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        /**
         * @param screenlockTypes List of screenlock type, can be BIOMETRIC or BIOMETRIC, PASSCODE
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(@Nullable Output<List<String>> screenlockTypes) {
            $.screenlockTypes = screenlockTypes;
            return this;
        }

        /**
         * @param screenlockTypes List of screenlock type, can be BIOMETRIC or BIOMETRIC, PASSCODE
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(List<String> screenlockTypes) {
            return screenlockTypes(Output.of(screenlockTypes));
        }

        /**
         * @param screenlockTypes List of screenlock type, can be BIOMETRIC or BIOMETRIC, PASSCODE
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(String... screenlockTypes) {
            return screenlockTypes(List.of(screenlockTypes));
        }

        /**
         * @param secureHardwarePresent Indicates if the device constains a secure hardware functionality
         * 
         * @return builder
         * 
         */
        public Builder secureHardwarePresent(@Nullable Output<Boolean> secureHardwarePresent) {
            $.secureHardwarePresent = secureHardwarePresent;
            return this;
        }

        /**
         * @param secureHardwarePresent Indicates if the device constains a secure hardware functionality
         * 
         * @return builder
         * 
         */
        public Builder secureHardwarePresent(Boolean secureHardwarePresent) {
            return secureHardwarePresent(Output.of(secureHardwarePresent));
        }

        /**
         * @param thirdPartySignalProviders Check to include third party signal provider
         * 
         * @return builder
         * 
         */
        public Builder thirdPartySignalProviders(@Nullable Output<Boolean> thirdPartySignalProviders) {
            $.thirdPartySignalProviders = thirdPartySignalProviders;
            return this;
        }

        /**
         * @param thirdPartySignalProviders Check to include third party signal provider
         * 
         * @return builder
         * 
         */
        public Builder thirdPartySignalProviders(Boolean thirdPartySignalProviders) {
            return thirdPartySignalProviders(Output.of(thirdPartySignalProviders));
        }

        /**
         * @param tpspBrowserVersion Third party signal provider minimum browser version
         * 
         * @return builder
         * 
         */
        public Builder tpspBrowserVersion(@Nullable Output<String> tpspBrowserVersion) {
            $.tpspBrowserVersion = tpspBrowserVersion;
            return this;
        }

        /**
         * @param tpspBrowserVersion Third party signal provider minimum browser version
         * 
         * @return builder
         * 
         */
        public Builder tpspBrowserVersion(String tpspBrowserVersion) {
            return tpspBrowserVersion(Output.of(tpspBrowserVersion));
        }

        /**
         * @param tpspBuiltinDnsClientEnabled Third party signal provider builtin dns client enable
         * 
         * @return builder
         * 
         */
        public Builder tpspBuiltinDnsClientEnabled(@Nullable Output<Boolean> tpspBuiltinDnsClientEnabled) {
            $.tpspBuiltinDnsClientEnabled = tpspBuiltinDnsClientEnabled;
            return this;
        }

        /**
         * @param tpspBuiltinDnsClientEnabled Third party signal provider builtin dns client enable
         * 
         * @return builder
         * 
         */
        public Builder tpspBuiltinDnsClientEnabled(Boolean tpspBuiltinDnsClientEnabled) {
            return tpspBuiltinDnsClientEnabled(Output.of(tpspBuiltinDnsClientEnabled));
        }

        /**
         * @param tpspChromeRemoteDesktopAppBlocked Third party signal provider chrome remote desktop app blocked
         * 
         * @return builder
         * 
         */
        public Builder tpspChromeRemoteDesktopAppBlocked(@Nullable Output<Boolean> tpspChromeRemoteDesktopAppBlocked) {
            $.tpspChromeRemoteDesktopAppBlocked = tpspChromeRemoteDesktopAppBlocked;
            return this;
        }

        /**
         * @param tpspChromeRemoteDesktopAppBlocked Third party signal provider chrome remote desktop app blocked
         * 
         * @return builder
         * 
         */
        public Builder tpspChromeRemoteDesktopAppBlocked(Boolean tpspChromeRemoteDesktopAppBlocked) {
            return tpspChromeRemoteDesktopAppBlocked(Output.of(tpspChromeRemoteDesktopAppBlocked));
        }

        /**
         * @param tpspDeviceEnrollmentDomain Third party signal provider device enrollment domain
         * 
         * @return builder
         * 
         */
        public Builder tpspDeviceEnrollmentDomain(@Nullable Output<String> tpspDeviceEnrollmentDomain) {
            $.tpspDeviceEnrollmentDomain = tpspDeviceEnrollmentDomain;
            return this;
        }

        /**
         * @param tpspDeviceEnrollmentDomain Third party signal provider device enrollment domain
         * 
         * @return builder
         * 
         */
        public Builder tpspDeviceEnrollmentDomain(String tpspDeviceEnrollmentDomain) {
            return tpspDeviceEnrollmentDomain(Output.of(tpspDeviceEnrollmentDomain));
        }

        /**
         * @param tpspDiskEncrypted Third party signal provider disk encrypted
         * 
         * @return builder
         * 
         */
        public Builder tpspDiskEncrypted(@Nullable Output<Boolean> tpspDiskEncrypted) {
            $.tpspDiskEncrypted = tpspDiskEncrypted;
            return this;
        }

        /**
         * @param tpspDiskEncrypted Third party signal provider disk encrypted
         * 
         * @return builder
         * 
         */
        public Builder tpspDiskEncrypted(Boolean tpspDiskEncrypted) {
            return tpspDiskEncrypted(Output.of(tpspDiskEncrypted));
        }

        /**
         * @param tpspKeyTrustLevel Third party signal provider key trust level
         * 
         * @return builder
         * 
         */
        public Builder tpspKeyTrustLevel(@Nullable Output<String> tpspKeyTrustLevel) {
            $.tpspKeyTrustLevel = tpspKeyTrustLevel;
            return this;
        }

        /**
         * @param tpspKeyTrustLevel Third party signal provider key trust level
         * 
         * @return builder
         * 
         */
        public Builder tpspKeyTrustLevel(String tpspKeyTrustLevel) {
            return tpspKeyTrustLevel(Output.of(tpspKeyTrustLevel));
        }

        /**
         * @param tpspOsFirewall Third party signal provider os firewall
         * 
         * @return builder
         * 
         */
        public Builder tpspOsFirewall(@Nullable Output<Boolean> tpspOsFirewall) {
            $.tpspOsFirewall = tpspOsFirewall;
            return this;
        }

        /**
         * @param tpspOsFirewall Third party signal provider os firewall
         * 
         * @return builder
         * 
         */
        public Builder tpspOsFirewall(Boolean tpspOsFirewall) {
            return tpspOsFirewall(Output.of(tpspOsFirewall));
        }

        /**
         * @param tpspOsVersion Third party signal provider minimum os version
         * 
         * @return builder
         * 
         */
        public Builder tpspOsVersion(@Nullable Output<String> tpspOsVersion) {
            $.tpspOsVersion = tpspOsVersion;
            return this;
        }

        /**
         * @param tpspOsVersion Third party signal provider minimum os version
         * 
         * @return builder
         * 
         */
        public Builder tpspOsVersion(String tpspOsVersion) {
            return tpspOsVersion(Output.of(tpspOsVersion));
        }

        /**
         * @param tpspPasswordProctectionWarningTrigger Third party signal provider password protection warning trigger
         * 
         * @return builder
         * 
         */
        public Builder tpspPasswordProctectionWarningTrigger(@Nullable Output<String> tpspPasswordProctectionWarningTrigger) {
            $.tpspPasswordProctectionWarningTrigger = tpspPasswordProctectionWarningTrigger;
            return this;
        }

        /**
         * @param tpspPasswordProctectionWarningTrigger Third party signal provider password protection warning trigger
         * 
         * @return builder
         * 
         */
        public Builder tpspPasswordProctectionWarningTrigger(String tpspPasswordProctectionWarningTrigger) {
            return tpspPasswordProctectionWarningTrigger(Output.of(tpspPasswordProctectionWarningTrigger));
        }

        /**
         * @param tpspRealtimeUrlCheckMode Third party signal provider realtime url check mode
         * 
         * @return builder
         * 
         */
        public Builder tpspRealtimeUrlCheckMode(@Nullable Output<Boolean> tpspRealtimeUrlCheckMode) {
            $.tpspRealtimeUrlCheckMode = tpspRealtimeUrlCheckMode;
            return this;
        }

        /**
         * @param tpspRealtimeUrlCheckMode Third party signal provider realtime url check mode
         * 
         * @return builder
         * 
         */
        public Builder tpspRealtimeUrlCheckMode(Boolean tpspRealtimeUrlCheckMode) {
            return tpspRealtimeUrlCheckMode(Output.of(tpspRealtimeUrlCheckMode));
        }

        /**
         * @param tpspSafeBrowsingProtectionLevel Third party signal provider safe browsing protection level
         * 
         * @return builder
         * 
         */
        public Builder tpspSafeBrowsingProtectionLevel(@Nullable Output<String> tpspSafeBrowsingProtectionLevel) {
            $.tpspSafeBrowsingProtectionLevel = tpspSafeBrowsingProtectionLevel;
            return this;
        }

        /**
         * @param tpspSafeBrowsingProtectionLevel Third party signal provider safe browsing protection level
         * 
         * @return builder
         * 
         */
        public Builder tpspSafeBrowsingProtectionLevel(String tpspSafeBrowsingProtectionLevel) {
            return tpspSafeBrowsingProtectionLevel(Output.of(tpspSafeBrowsingProtectionLevel));
        }

        /**
         * @param tpspScreenLockSecured Third party signal provider screen lock secure
         * 
         * @return builder
         * 
         */
        public Builder tpspScreenLockSecured(@Nullable Output<Boolean> tpspScreenLockSecured) {
            $.tpspScreenLockSecured = tpspScreenLockSecured;
            return this;
        }

        /**
         * @param tpspScreenLockSecured Third party signal provider screen lock secure
         * 
         * @return builder
         * 
         */
        public Builder tpspScreenLockSecured(Boolean tpspScreenLockSecured) {
            return tpspScreenLockSecured(Output.of(tpspScreenLockSecured));
        }

        /**
         * @param tpspSiteIsolationEnabled Third party signal provider site isolation enabled
         * 
         * @return builder
         * 
         */
        public Builder tpspSiteIsolationEnabled(@Nullable Output<Boolean> tpspSiteIsolationEnabled) {
            $.tpspSiteIsolationEnabled = tpspSiteIsolationEnabled;
            return this;
        }

        /**
         * @param tpspSiteIsolationEnabled Third party signal provider site isolation enabled
         * 
         * @return builder
         * 
         */
        public Builder tpspSiteIsolationEnabled(Boolean tpspSiteIsolationEnabled) {
            return tpspSiteIsolationEnabled(Output.of(tpspSiteIsolationEnabled));
        }

        public DeviceAssuranceMacosArgs build() {
            return $;
        }
    }

}