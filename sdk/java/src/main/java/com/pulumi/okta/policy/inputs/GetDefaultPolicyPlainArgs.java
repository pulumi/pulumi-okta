// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultPolicyPlainArgs Empty = new GetDefaultPolicyPlainArgs();

    /**
     * Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
     * 
     */
    public String type() {
        return this.type;
    }

    private GetDefaultPolicyPlainArgs() {}

    private GetDefaultPolicyPlainArgs(GetDefaultPolicyPlainArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultPolicyPlainArgs $;

        public Builder() {
            $ = new GetDefaultPolicyPlainArgs();
        }

        public Builder(GetDefaultPolicyPlainArgs defaults) {
            $ = new GetDefaultPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Policy type: OKTA*SIGN*ON, PASSWORD, MFA*ENROLL, or IDP*DISCOVERY
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetDefaultPolicyPlainArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetDefaultPolicyPlainArgs", "type");
            }
            return $;
        }
    }

}