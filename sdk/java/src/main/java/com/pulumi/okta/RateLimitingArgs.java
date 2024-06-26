// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateLimitingArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitingArgs Empty = new RateLimitingArgs();

    /**
     * Called during authentication. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
     * 
     */
    @Import(name="authorize", required=true)
    private Output<String> authorize;

    /**
     * @return Called during authentication. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
     * 
     */
    public Output<String> authorize() {
        return this.authorize;
    }

    /**
     * Enable or disable rate limiting communications. By default, it is `true`.
     * 
     */
    @Import(name="communicationsEnabled")
    private @Nullable Output<Boolean> communicationsEnabled;

    /**
     * @return Enable or disable rate limiting communications. By default, it is `true`.
     * 
     */
    public Optional<Output<Boolean>> communicationsEnabled() {
        return Optional.ofNullable(this.communicationsEnabled);
    }

    /**
     * Called when accessing the Okta hosted login page. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
     * 
     */
    @Import(name="login", required=true)
    private Output<String> login;

    /**
     * @return Called when accessing the Okta hosted login page. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
     * 
     */
    public Output<String> login() {
        return this.login;
    }

    private RateLimitingArgs() {}

    private RateLimitingArgs(RateLimitingArgs $) {
        this.authorize = $.authorize;
        this.communicationsEnabled = $.communicationsEnabled;
        this.login = $.login;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitingArgs $;

        public Builder() {
            $ = new RateLimitingArgs();
        }

        public Builder(RateLimitingArgs defaults) {
            $ = new RateLimitingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorize Called during authentication. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
         * 
         * @return builder
         * 
         */
        public Builder authorize(Output<String> authorize) {
            $.authorize = authorize;
            return this;
        }

        /**
         * @param authorize Called during authentication. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
         * 
         * @return builder
         * 
         */
        public Builder authorize(String authorize) {
            return authorize(Output.of(authorize));
        }

        /**
         * @param communicationsEnabled Enable or disable rate limiting communications. By default, it is `true`.
         * 
         * @return builder
         * 
         */
        public Builder communicationsEnabled(@Nullable Output<Boolean> communicationsEnabled) {
            $.communicationsEnabled = communicationsEnabled;
            return this;
        }

        /**
         * @param communicationsEnabled Enable or disable rate limiting communications. By default, it is `true`.
         * 
         * @return builder
         * 
         */
        public Builder communicationsEnabled(Boolean communicationsEnabled) {
            return communicationsEnabled(Output.of(communicationsEnabled));
        }

        /**
         * @param login Called when accessing the Okta hosted login page. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
         * 
         * @return builder
         * 
         */
        public Builder login(Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Called when accessing the Okta hosted login page. Valid values: `ENFORCE` *(Enforce limit and log per client (recommended))*, `DISABLE` *(Do nothing (not recommended))*, `PREVIEW` *(Log per client)*.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        public RateLimitingArgs build() {
            if ($.authorize == null) {
                throw new MissingRequiredPropertyException("RateLimitingArgs", "authorize");
            }
            if ($.login == null) {
                throw new MissingRequiredPropertyException("RateLimitingArgs", "login");
            }
            return $;
        }
    }

}
