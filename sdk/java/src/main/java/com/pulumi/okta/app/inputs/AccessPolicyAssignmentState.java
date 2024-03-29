// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyAssignmentState Empty = new AccessPolicyAssignmentState();

    /**
     * The application ID; this value is immutable and can not be updated.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The application ID; this value is immutable and can not be updated.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The access policy ID.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The access policy ID.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    private AccessPolicyAssignmentState() {}

    private AccessPolicyAssignmentState(AccessPolicyAssignmentState $) {
        this.appId = $.appId;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyAssignmentState $;

        public Builder() {
            $ = new AccessPolicyAssignmentState();
        }

        public Builder(AccessPolicyAssignmentState defaults) {
            $ = new AccessPolicyAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The application ID; this value is immutable and can not be updated.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The application ID; this value is immutable and can not be updated.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param policyId The access policy ID.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The access policy ID.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public AccessPolicyAssignmentState build() {
            return $;
        }
    }

}
