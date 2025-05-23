// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailSmtpServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailSmtpServerArgs Empty = new EmailSmtpServerArgs();

    /**
     * Human-readable name for your SMTP server.
     * 
     */
    @Import(name="alias", required=true)
    private Output<String> alias;

    /**
     * @return Human-readable name for your SMTP server.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }

    /**
     * If true, routes all email traffic through your SMTP server.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If true, routes all email traffic through your SMTP server.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Hostname or IP address of your SMTP server.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Hostname or IP address of your SMTP server.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * User name of the email domain.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return User name of the email domain.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Port number of your SMTP server.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port number of your SMTP server.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Display name of the email domain.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Display name of the email domain.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private EmailSmtpServerArgs() {}

    private EmailSmtpServerArgs(EmailSmtpServerArgs $) {
        this.alias = $.alias;
        this.enabled = $.enabled;
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailSmtpServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailSmtpServerArgs $;

        public Builder() {
            $ = new EmailSmtpServerArgs();
        }

        public Builder(EmailSmtpServerArgs defaults) {
            $ = new EmailSmtpServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias Human-readable name for your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder alias(Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Human-readable name for your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param enabled If true, routes all email traffic through your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If true, routes all email traffic through your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param host Hostname or IP address of your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname or IP address of your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param password User name of the email domain.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password User name of the email domain.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port number of your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of your SMTP server.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param username Display name of the email domain.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Display name of the email domain.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public EmailSmtpServerArgs build() {
            if ($.alias == null) {
                throw new MissingRequiredPropertyException("EmailSmtpServerArgs", "alias");
            }
            if ($.host == null) {
                throw new MissingRequiredPropertyException("EmailSmtpServerArgs", "host");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("EmailSmtpServerArgs", "password");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("EmailSmtpServerArgs", "port");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("EmailSmtpServerArgs", "username");
            }
            return $;
        }
    }

}
