// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrgSupportState extends com.pulumi.resources.ResourceArgs {

    public static final OrgSupportState Empty = new OrgSupportState();

    /**
     * Expiration of Okta Support
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return Expiration of Okta Support
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * Number of days the support should be extended by in addition to the standard eight hours.
     * 
     */
    @Import(name="extendBy")
    private @Nullable Output<Integer> extendBy;

    /**
     * @return Number of days the support should be extended by in addition to the standard eight hours.
     * 
     */
    public Optional<Output<Integer>> extendBy() {
        return Optional.ofNullable(this.extendBy);
    }

    /**
     * Status of Okta Support
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of Okta Support
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private OrgSupportState() {}

    private OrgSupportState(OrgSupportState $) {
        this.expiration = $.expiration;
        this.extendBy = $.extendBy;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrgSupportState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrgSupportState $;

        public Builder() {
            $ = new OrgSupportState();
        }

        public Builder(OrgSupportState defaults) {
            $ = new OrgSupportState(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiration Expiration of Okta Support
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration Expiration of Okta Support
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param extendBy Number of days the support should be extended by in addition to the standard eight hours.
         * 
         * @return builder
         * 
         */
        public Builder extendBy(@Nullable Output<Integer> extendBy) {
            $.extendBy = extendBy;
            return this;
        }

        /**
         * @param extendBy Number of days the support should be extended by in addition to the standard eight hours.
         * 
         * @return builder
         * 
         */
        public Builder extendBy(Integer extendBy) {
            return extendBy(Output.of(extendBy));
        }

        /**
         * @param status Status of Okta Support
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of Okta Support
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public OrgSupportState build() {
            return $;
        }
    }

}