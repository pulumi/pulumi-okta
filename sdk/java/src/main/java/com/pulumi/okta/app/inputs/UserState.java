// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * App to associate user with
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return App to associate user with
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    @Import(name="hasSharedUsername")
    private @Nullable Output<Boolean> hasSharedUsername;

    public Optional<Output<Boolean>> hasSharedUsername() {
        return Optional.ofNullable(this.hasSharedUsername);
    }

    /**
     * The password to use.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to use.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The JSON profile of the App User.
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return The JSON profile of the App User.
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * Retain the user assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
     * 
     */
    @Import(name="retainAssignment")
    private @Nullable Output<Boolean> retainAssignment;

    /**
     * @return Retain the user assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
     * 
     */
    public Optional<Output<Boolean>> retainAssignment() {
        return Optional.ofNullable(this.retainAssignment);
    }

    /**
     * User associated with the application
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return User associated with the application
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The username to use for the app user. In case the user is assigned to the app with `SHARED_USERNAME_AND_PASSWORD` credentials scheme, this field will be computed and should not be set.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username to use for the app user. In case the user is assigned to the app with `SHARED_USERNAME_AND_PASSWORD` credentials scheme, this field will be computed and should not be set.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.appId = $.appId;
        this.hasSharedUsername = $.hasSharedUsername;
        this.password = $.password;
        this.profile = $.profile;
        this.retainAssignment = $.retainAssignment;
        this.userId = $.userId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId App to associate user with
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId App to associate user with
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder hasSharedUsername(@Nullable Output<Boolean> hasSharedUsername) {
            $.hasSharedUsername = hasSharedUsername;
            return this;
        }

        public Builder hasSharedUsername(Boolean hasSharedUsername) {
            return hasSharedUsername(Output.of(hasSharedUsername));
        }

        /**
         * @param password The password to use.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to use.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param profile The JSON profile of the App User.
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile The JSON profile of the App User.
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param retainAssignment Retain the user assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
         * 
         * @return builder
         * 
         */
        public Builder retainAssignment(@Nullable Output<Boolean> retainAssignment) {
            $.retainAssignment = retainAssignment;
            return this;
        }

        /**
         * @param retainAssignment Retain the user assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
         * 
         * @return builder
         * 
         */
        public Builder retainAssignment(Boolean retainAssignment) {
            return retainAssignment(Output.of(retainAssignment));
        }

        /**
         * @param userId User associated with the application
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User associated with the application
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param username The username to use for the app user. In case the user is assigned to the app with `SHARED_USERNAME_AND_PASSWORD` credentials scheme, this field will be computed and should not be set.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to use for the app user. In case the user is assigned to the app with `SHARED_USERNAME_AND_PASSWORD` credentials scheme, this field will be computed and should not be set.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public UserState build() {
            return $;
        }
    }

}
