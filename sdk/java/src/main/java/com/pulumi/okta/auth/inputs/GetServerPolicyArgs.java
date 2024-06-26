// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.auth.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServerPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPolicyArgs Empty = new GetServerPolicyArgs();

    /**
     * Auth server ID
     * 
     */
    @Import(name="authServerId", required=true)
    private Output<String> authServerId;

    /**
     * @return Auth server ID
     * 
     */
    public Output<String> authServerId() {
        return this.authServerId;
    }

    /**
     * Name of the policy
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the policy
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetServerPolicyArgs() {}

    private GetServerPolicyArgs(GetServerPolicyArgs $) {
        this.authServerId = $.authServerId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPolicyArgs $;

        public Builder() {
            $ = new GetServerPolicyArgs();
        }

        public Builder(GetServerPolicyArgs defaults) {
            $ = new GetServerPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authServerId Auth server ID
         * 
         * @return builder
         * 
         */
        public Builder authServerId(Output<String> authServerId) {
            $.authServerId = authServerId;
            return this;
        }

        /**
         * @param authServerId Auth server ID
         * 
         * @return builder
         * 
         */
        public Builder authServerId(String authServerId) {
            return authServerId(Output.of(authServerId));
        }

        /**
         * @param name Name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
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

        public GetServerPolicyArgs build() {
            if ($.authServerId == null) {
                throw new MissingRequiredPropertyException("GetServerPolicyArgs", "authServerId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetServerPolicyArgs", "name");
            }
            return $;
        }
    }

}
