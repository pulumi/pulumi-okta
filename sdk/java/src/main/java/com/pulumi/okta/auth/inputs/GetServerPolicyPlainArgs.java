// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.auth.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPolicyPlainArgs Empty = new GetServerPolicyPlainArgs();

    /**
     * The ID of the Auth Server.
     * 
     */
    @Import(name="authServerId", required=true)
    private String authServerId;

    /**
     * @return The ID of the Auth Server.
     * 
     */
    public String authServerId() {
        return this.authServerId;
    }

    /**
     * Name of policy to retrieve.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of policy to retrieve.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetServerPolicyPlainArgs() {}

    private GetServerPolicyPlainArgs(GetServerPolicyPlainArgs $) {
        this.authServerId = $.authServerId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPolicyPlainArgs $;

        public Builder() {
            $ = new GetServerPolicyPlainArgs();
        }

        public Builder(GetServerPolicyPlainArgs defaults) {
            $ = new GetServerPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authServerId The ID of the Auth Server.
         * 
         * @return builder
         * 
         */
        public Builder authServerId(String authServerId) {
            $.authServerId = authServerId;
            return this;
        }

        /**
         * @param name Name of policy to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetServerPolicyPlainArgs build() {
            $.authServerId = Objects.requireNonNull($.authServerId, "expected parameter 'authServerId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}