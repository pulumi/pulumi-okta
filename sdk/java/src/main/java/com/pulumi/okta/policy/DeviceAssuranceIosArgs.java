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


public final class DeviceAssuranceIosArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceAssuranceIosArgs Empty = new DeviceAssuranceIosArgs();

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

    private DeviceAssuranceIosArgs() {}

    private DeviceAssuranceIosArgs(DeviceAssuranceIosArgs $) {
        this.jailbreak = $.jailbreak;
        this.name = $.name;
        this.osVersion = $.osVersion;
        this.screenlockTypes = $.screenlockTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceAssuranceIosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceAssuranceIosArgs $;

        public Builder() {
            $ = new DeviceAssuranceIosArgs();
        }

        public Builder(DeviceAssuranceIosArgs defaults) {
            $ = new DeviceAssuranceIosArgs(Objects.requireNonNull(defaults));
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

        public DeviceAssuranceIosArgs build() {
            return $;
        }
    }

}
