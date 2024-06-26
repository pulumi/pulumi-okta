// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyProfileEnrollmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyProfileEnrollmentArgs Empty = new PolicyProfileEnrollmentArgs();

    /**
     * Name of the policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Status of the policy
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the policy
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private PolicyProfileEnrollmentArgs() {}

    private PolicyProfileEnrollmentArgs(PolicyProfileEnrollmentArgs $) {
        this.name = $.name;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyProfileEnrollmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyProfileEnrollmentArgs $;

        public Builder() {
            $ = new PolicyProfileEnrollmentArgs();
        }

        public Builder(PolicyProfileEnrollmentArgs defaults) {
            $ = new PolicyProfileEnrollmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status Status of the policy
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the policy
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public PolicyProfileEnrollmentArgs build() {
            return $;
        }
    }

}
