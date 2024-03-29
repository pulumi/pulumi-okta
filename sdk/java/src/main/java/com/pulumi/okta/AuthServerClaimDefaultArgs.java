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


public final class AuthServerClaimDefaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthServerClaimDefaultArgs Empty = new AuthServerClaimDefaultArgs();

    /**
     * Specifies whether to include claims in token.
     * 
     */
    @Import(name="alwaysIncludeInToken")
    private @Nullable Output<Boolean> alwaysIncludeInToken;

    /**
     * @return Specifies whether to include claims in token.
     * 
     */
    public Optional<Output<Boolean>> alwaysIncludeInToken() {
        return Optional.ofNullable(this.alwaysIncludeInToken);
    }

    /**
     * ID of the authorization server.
     * 
     */
    @Import(name="authServerId", required=true)
    private Output<String> authServerId;

    /**
     * @return ID of the authorization server.
     * 
     */
    public Output<String> authServerId() {
        return this.authServerId;
    }

    /**
     * The name of the claim. Can be set to `&#34;sub&#34;`, `&#34;address&#34;`, `&#34;birthdate&#34;`, `&#34;email&#34;`,
     * `&#34;email_verified&#34;`, `&#34;family_name&#34;`, `&#34;gender&#34;`, `&#34;given_name&#34;`, `&#34;locale&#34;`, `&#34;middle_name&#34;`, `&#34;name&#34;`, `&#34;nickname&#34;`,
     * `&#34;phone_number&#34;`, `&#34;picture&#34;`, `&#34;preferred_username&#34;`, `&#34;profile&#34;`, `&#34;updated_at&#34;`, `&#34;website&#34;`, `&#34;zoneinfo&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the claim. Can be set to `&#34;sub&#34;`, `&#34;address&#34;`, `&#34;birthdate&#34;`, `&#34;email&#34;`,
     * `&#34;email_verified&#34;`, `&#34;family_name&#34;`, `&#34;gender&#34;`, `&#34;given_name&#34;`, `&#34;locale&#34;`, `&#34;middle_name&#34;`, `&#34;name&#34;`, `&#34;nickname&#34;`,
     * `&#34;phone_number&#34;`, `&#34;picture&#34;`, `&#34;preferred_username&#34;`, `&#34;profile&#34;`, `&#34;updated_at&#34;`, `&#34;website&#34;`, `&#34;zoneinfo&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the claim. Only required for `&#34;sub&#34;` claim.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the claim. Only required for `&#34;sub&#34;` claim.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AuthServerClaimDefaultArgs() {}

    private AuthServerClaimDefaultArgs(AuthServerClaimDefaultArgs $) {
        this.alwaysIncludeInToken = $.alwaysIncludeInToken;
        this.authServerId = $.authServerId;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthServerClaimDefaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthServerClaimDefaultArgs $;

        public Builder() {
            $ = new AuthServerClaimDefaultArgs();
        }

        public Builder(AuthServerClaimDefaultArgs defaults) {
            $ = new AuthServerClaimDefaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysIncludeInToken Specifies whether to include claims in token.
         * 
         * @return builder
         * 
         */
        public Builder alwaysIncludeInToken(@Nullable Output<Boolean> alwaysIncludeInToken) {
            $.alwaysIncludeInToken = alwaysIncludeInToken;
            return this;
        }

        /**
         * @param alwaysIncludeInToken Specifies whether to include claims in token.
         * 
         * @return builder
         * 
         */
        public Builder alwaysIncludeInToken(Boolean alwaysIncludeInToken) {
            return alwaysIncludeInToken(Output.of(alwaysIncludeInToken));
        }

        /**
         * @param authServerId ID of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder authServerId(Output<String> authServerId) {
            $.authServerId = authServerId;
            return this;
        }

        /**
         * @param authServerId ID of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder authServerId(String authServerId) {
            return authServerId(Output.of(authServerId));
        }

        /**
         * @param name The name of the claim. Can be set to `&#34;sub&#34;`, `&#34;address&#34;`, `&#34;birthdate&#34;`, `&#34;email&#34;`,
         * `&#34;email_verified&#34;`, `&#34;family_name&#34;`, `&#34;gender&#34;`, `&#34;given_name&#34;`, `&#34;locale&#34;`, `&#34;middle_name&#34;`, `&#34;name&#34;`, `&#34;nickname&#34;`,
         * `&#34;phone_number&#34;`, `&#34;picture&#34;`, `&#34;preferred_username&#34;`, `&#34;profile&#34;`, `&#34;updated_at&#34;`, `&#34;website&#34;`, `&#34;zoneinfo&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the claim. Can be set to `&#34;sub&#34;`, `&#34;address&#34;`, `&#34;birthdate&#34;`, `&#34;email&#34;`,
         * `&#34;email_verified&#34;`, `&#34;family_name&#34;`, `&#34;gender&#34;`, `&#34;given_name&#34;`, `&#34;locale&#34;`, `&#34;middle_name&#34;`, `&#34;name&#34;`, `&#34;nickname&#34;`,
         * `&#34;phone_number&#34;`, `&#34;picture&#34;`, `&#34;preferred_username&#34;`, `&#34;profile&#34;`, `&#34;updated_at&#34;`, `&#34;website&#34;`, `&#34;zoneinfo&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the claim. Only required for `&#34;sub&#34;` claim.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the claim. Only required for `&#34;sub&#34;` claim.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AuthServerClaimDefaultArgs build() {
            if ($.authServerId == null) {
                throw new MissingRequiredPropertyException("AuthServerClaimDefaultArgs", "authServerId");
            }
            return $;
        }
    }

}
