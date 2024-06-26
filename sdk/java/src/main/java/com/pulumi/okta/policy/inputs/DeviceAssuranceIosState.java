// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceAssuranceIosState extends com.pulumi.resources.ResourceArgs {

    public static final DeviceAssuranceIosState Empty = new DeviceAssuranceIosState();

    /**
     * Created by of the device assurance polic
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return Created by of the device assurance polic
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Created date of the device assurance polic
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return Created date of the device assurance polic
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * Is the device jailbroken in the device assurance policy.
     * 
     */
    @Import(name="jailbreak")
    private @Nullable Output<Boolean> jailbreak;

    /**
     * @return Is the device jailbroken in the device assurance policy.
     * 
     */
    public Optional<Output<Boolean>> jailbreak() {
        return Optional.ofNullable(this.jailbreak);
    }

    /**
     * Last update of the device assurance polic
     * 
     */
    @Import(name="lastUpdate")
    private @Nullable Output<String> lastUpdate;

    /**
     * @return Last update of the device assurance polic
     * 
     */
    public Optional<Output<String>> lastUpdate() {
        return Optional.ofNullable(this.lastUpdate);
    }

    /**
     * Last updated by of the device assurance polic
     * 
     */
    @Import(name="lastUpdatedBy")
    private @Nullable Output<String> lastUpdatedBy;

    /**
     * @return Last updated by of the device assurance polic
     * 
     */
    public Optional<Output<String>> lastUpdatedBy() {
        return Optional.ofNullable(this.lastUpdatedBy);
    }

    /**
     * Name of the device assurance policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the device assurance policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Minimum os version of the device in the device assurance policy.
     * 
     */
    @Import(name="osVersion")
    private @Nullable Output<String> osVersion;

    /**
     * @return Minimum os version of the device in the device assurance policy.
     * 
     */
    public Optional<Output<String>> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    /**
     * Policy device assurance platform
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return Policy device assurance platform
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * List of screenlock type, can be `BIOMETRIC` or `BIOMETRIC, PASSCODE`
     * 
     */
    @Import(name="screenlockTypes")
    private @Nullable Output<List<String>> screenlockTypes;

    /**
     * @return List of screenlock type, can be `BIOMETRIC` or `BIOMETRIC, PASSCODE`
     * 
     */
    public Optional<Output<List<String>>> screenlockTypes() {
        return Optional.ofNullable(this.screenlockTypes);
    }

    private DeviceAssuranceIosState() {}

    private DeviceAssuranceIosState(DeviceAssuranceIosState $) {
        this.createdBy = $.createdBy;
        this.createdDate = $.createdDate;
        this.jailbreak = $.jailbreak;
        this.lastUpdate = $.lastUpdate;
        this.lastUpdatedBy = $.lastUpdatedBy;
        this.name = $.name;
        this.osVersion = $.osVersion;
        this.platform = $.platform;
        this.screenlockTypes = $.screenlockTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceAssuranceIosState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceAssuranceIosState $;

        public Builder() {
            $ = new DeviceAssuranceIosState();
        }

        public Builder(DeviceAssuranceIosState defaults) {
            $ = new DeviceAssuranceIosState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdBy Created by of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy Created by of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param createdDate Created date of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate Created date of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param jailbreak Is the device jailbroken in the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder jailbreak(@Nullable Output<Boolean> jailbreak) {
            $.jailbreak = jailbreak;
            return this;
        }

        /**
         * @param jailbreak Is the device jailbroken in the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder jailbreak(Boolean jailbreak) {
            return jailbreak(Output.of(jailbreak));
        }

        /**
         * @param lastUpdate Last update of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(@Nullable Output<String> lastUpdate) {
            $.lastUpdate = lastUpdate;
            return this;
        }

        /**
         * @param lastUpdate Last update of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(String lastUpdate) {
            return lastUpdate(Output.of(lastUpdate));
        }

        /**
         * @param lastUpdatedBy Last updated by of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedBy(@Nullable Output<String> lastUpdatedBy) {
            $.lastUpdatedBy = lastUpdatedBy;
            return this;
        }

        /**
         * @param lastUpdatedBy Last updated by of the device assurance polic
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            return lastUpdatedBy(Output.of(lastUpdatedBy));
        }

        /**
         * @param name Name of the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osVersion Minimum os version of the device in the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(@Nullable Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param osVersion Minimum os version of the device in the device assurance policy.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        /**
         * @param platform Policy device assurance platform
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Policy device assurance platform
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param screenlockTypes List of screenlock type, can be `BIOMETRIC` or `BIOMETRIC, PASSCODE`
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(@Nullable Output<List<String>> screenlockTypes) {
            $.screenlockTypes = screenlockTypes;
            return this;
        }

        /**
         * @param screenlockTypes List of screenlock type, can be `BIOMETRIC` or `BIOMETRIC, PASSCODE`
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(List<String> screenlockTypes) {
            return screenlockTypes(Output.of(screenlockTypes));
        }

        /**
         * @param screenlockTypes List of screenlock type, can be `BIOMETRIC` or `BIOMETRIC, PASSCODE`
         * 
         * @return builder
         * 
         */
        public Builder screenlockTypes(String... screenlockTypes) {
            return screenlockTypes(List.of(screenlockTypes));
        }

        public DeviceAssuranceIosState build() {
            return $;
        }
    }

}
