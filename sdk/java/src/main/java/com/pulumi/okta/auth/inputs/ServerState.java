// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.auth.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerState extends com.pulumi.resources.ResourceArgs {

    public static final ServerState Empty = new ServerState();

    /**
     * The recipients that the tokens are intended for. This becomes the `aud` claim in an access token. Currently Okta only supports a single value here.
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<List<String>> audiences;

    /**
     * @return The recipients that the tokens are intended for. This becomes the `aud` claim in an access token. Currently Okta only supports a single value here.
     * 
     */
    public Optional<Output<List<String>>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * The timestamp when the authorization server started to use the `kid` for signing tokens.
     * 
     */
    @Import(name="credentialsLastRotated")
    private @Nullable Output<String> credentialsLastRotated;

    /**
     * @return The timestamp when the authorization server started to use the `kid` for signing tokens.
     * 
     */
    public Optional<Output<String>> credentialsLastRotated() {
        return Optional.ofNullable(this.credentialsLastRotated);
    }

    /**
     * The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `AUTO`.
     * 
     */
    @Import(name="credentialsNextRotation")
    private @Nullable Output<String> credentialsNextRotation;

    /**
     * @return The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `AUTO`.
     * 
     */
    public Optional<Output<String>> credentialsNextRotation() {
        return Optional.ofNullable(this.credentialsNextRotation);
    }

    /**
     * The key rotation mode for the authorization server. Can be `AUTO` or `MANUAL`. Default: `AUTO`
     * 
     */
    @Import(name="credentialsRotationMode")
    private @Nullable Output<String> credentialsRotationMode;

    /**
     * @return The key rotation mode for the authorization server. Can be `AUTO` or `MANUAL`. Default: `AUTO`
     * 
     */
    public Optional<Output<String>> credentialsRotationMode() {
        return Optional.ofNullable(this.credentialsRotationMode);
    }

    /**
     * The description of the authorization server.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the authorization server.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * *Early Access Property*. Allows you to use a custom issuer URL. It can be set to `CUSTOM_URL`, `ORG_URL`, or `DYNAMIC`. Default: `ORG_URL`
     * 
     */
    @Import(name="issuerMode")
    private @Nullable Output<String> issuerMode;

    /**
     * @return *Early Access Property*. Allows you to use a custom issuer URL. It can be set to `CUSTOM_URL`, `ORG_URL`, or `DYNAMIC`. Default: `ORG_URL`
     * 
     */
    public Optional<Output<String>> issuerMode() {
        return Optional.ofNullable(this.issuerMode);
    }

    /**
     * The ID of the JSON Web Key used for signing tokens issued by the authorization server.
     * 
     */
    @Import(name="kid")
    private @Nullable Output<String> kid;

    /**
     * @return The ID of the JSON Web Key used for signing tokens issued by the authorization server.
     * 
     */
    public Optional<Output<String>> kid() {
        return Optional.ofNullable(this.kid);
    }

    /**
     * The name of the authorization server.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the authorization server.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Default to `ACTIVE`
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Default to `ACTIVE`
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ServerState() {}

    private ServerState(ServerState $) {
        this.audiences = $.audiences;
        this.credentialsLastRotated = $.credentialsLastRotated;
        this.credentialsNextRotation = $.credentialsNextRotation;
        this.credentialsRotationMode = $.credentialsRotationMode;
        this.description = $.description;
        this.issuer = $.issuer;
        this.issuerMode = $.issuerMode;
        this.kid = $.kid;
        this.name = $.name;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerState $;

        public Builder() {
            $ = new ServerState();
        }

        public Builder(ServerState defaults) {
            $ = new ServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param audiences The recipients that the tokens are intended for. This becomes the `aud` claim in an access token. Currently Okta only supports a single value here.
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences The recipients that the tokens are intended for. This becomes the `aud` claim in an access token. Currently Okta only supports a single value here.
         * 
         * @return builder
         * 
         */
        public Builder audiences(List<String> audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param audiences The recipients that the tokens are intended for. This becomes the `aud` claim in an access token. Currently Okta only supports a single value here.
         * 
         * @return builder
         * 
         */
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        /**
         * @param credentialsLastRotated The timestamp when the authorization server started to use the `kid` for signing tokens.
         * 
         * @return builder
         * 
         */
        public Builder credentialsLastRotated(@Nullable Output<String> credentialsLastRotated) {
            $.credentialsLastRotated = credentialsLastRotated;
            return this;
        }

        /**
         * @param credentialsLastRotated The timestamp when the authorization server started to use the `kid` for signing tokens.
         * 
         * @return builder
         * 
         */
        public Builder credentialsLastRotated(String credentialsLastRotated) {
            return credentialsLastRotated(Output.of(credentialsLastRotated));
        }

        /**
         * @param credentialsNextRotation The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `AUTO`.
         * 
         * @return builder
         * 
         */
        public Builder credentialsNextRotation(@Nullable Output<String> credentialsNextRotation) {
            $.credentialsNextRotation = credentialsNextRotation;
            return this;
        }

        /**
         * @param credentialsNextRotation The timestamp when the authorization server changes the key for signing tokens. Only returned when `credentials_rotation_mode` is `AUTO`.
         * 
         * @return builder
         * 
         */
        public Builder credentialsNextRotation(String credentialsNextRotation) {
            return credentialsNextRotation(Output.of(credentialsNextRotation));
        }

        /**
         * @param credentialsRotationMode The key rotation mode for the authorization server. Can be `AUTO` or `MANUAL`. Default: `AUTO`
         * 
         * @return builder
         * 
         */
        public Builder credentialsRotationMode(@Nullable Output<String> credentialsRotationMode) {
            $.credentialsRotationMode = credentialsRotationMode;
            return this;
        }

        /**
         * @param credentialsRotationMode The key rotation mode for the authorization server. Can be `AUTO` or `MANUAL`. Default: `AUTO`
         * 
         * @return builder
         * 
         */
        public Builder credentialsRotationMode(String credentialsRotationMode) {
            return credentialsRotationMode(Output.of(credentialsRotationMode));
        }

        /**
         * @param description The description of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param issuer The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The complete URL for a Custom Authorization Server. This becomes the `iss` claim in an access token.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param issuerMode *Early Access Property*. Allows you to use a custom issuer URL. It can be set to `CUSTOM_URL`, `ORG_URL`, or `DYNAMIC`. Default: `ORG_URL`
         * 
         * @return builder
         * 
         */
        public Builder issuerMode(@Nullable Output<String> issuerMode) {
            $.issuerMode = issuerMode;
            return this;
        }

        /**
         * @param issuerMode *Early Access Property*. Allows you to use a custom issuer URL. It can be set to `CUSTOM_URL`, `ORG_URL`, or `DYNAMIC`. Default: `ORG_URL`
         * 
         * @return builder
         * 
         */
        public Builder issuerMode(String issuerMode) {
            return issuerMode(Output.of(issuerMode));
        }

        /**
         * @param kid The ID of the JSON Web Key used for signing tokens issued by the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder kid(@Nullable Output<String> kid) {
            $.kid = kid;
            return this;
        }

        /**
         * @param kid The ID of the JSON Web Key used for signing tokens issued by the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder kid(String kid) {
            return kid(Output.of(kid));
        }

        /**
         * @param name The name of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status Default to `ACTIVE`
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Default to `ACTIVE`
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ServerState build() {
            return $;
        }
    }

}