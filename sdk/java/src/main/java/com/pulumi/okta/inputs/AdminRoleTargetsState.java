// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdminRoleTargetsState extends com.pulumi.resources.ResourceArgs {

    public static final AdminRoleTargetsState Empty = new AdminRoleTargetsState();

    /**
     * List of app names (name represents set of app instances) or a combination of app name and app instance ID (like &#39;salesforce&#39; or &#39;facebook.0oapsqQ6dv19pqyEo0g3&#39;).
     * 
     */
    @Import(name="apps")
    private @Nullable Output<List<String>> apps;

    /**
     * @return List of app names (name represents set of app instances) or a combination of app name and app instance ID (like &#39;salesforce&#39; or &#39;facebook.0oapsqQ6dv19pqyEo0g3&#39;).
     * 
     */
    public Optional<Output<List<String>>> apps() {
        return Optional.ofNullable(this.apps);
    }

    /**
     * List of group IDs. Conflicts with `apps`.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return List of group IDs. Conflicts with `apps`.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Role ID.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return Role ID.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    /**
     * Name of the role associated with the user. See [API Docs](https://developer.okta.com/docs/reference/api/roles/#role-types).
     * 
     */
    @Import(name="roleType")
    private @Nullable Output<String> roleType;

    /**
     * @return Name of the role associated with the user. See [API Docs](https://developer.okta.com/docs/reference/api/roles/#role-types).
     * 
     */
    public Optional<Output<String>> roleType() {
        return Optional.ofNullable(this.roleType);
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private AdminRoleTargetsState() {}

    private AdminRoleTargetsState(AdminRoleTargetsState $) {
        this.apps = $.apps;
        this.groups = $.groups;
        this.roleId = $.roleId;
        this.roleType = $.roleType;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdminRoleTargetsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdminRoleTargetsState $;

        public Builder() {
            $ = new AdminRoleTargetsState();
        }

        public Builder(AdminRoleTargetsState defaults) {
            $ = new AdminRoleTargetsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apps List of app names (name represents set of app instances) or a combination of app name and app instance ID (like &#39;salesforce&#39; or &#39;facebook.0oapsqQ6dv19pqyEo0g3&#39;).
         * 
         * @return builder
         * 
         */
        public Builder apps(@Nullable Output<List<String>> apps) {
            $.apps = apps;
            return this;
        }

        /**
         * @param apps List of app names (name represents set of app instances) or a combination of app name and app instance ID (like &#39;salesforce&#39; or &#39;facebook.0oapsqQ6dv19pqyEo0g3&#39;).
         * 
         * @return builder
         * 
         */
        public Builder apps(List<String> apps) {
            return apps(Output.of(apps));
        }

        /**
         * @param apps List of app names (name represents set of app instances) or a combination of app name and app instance ID (like &#39;salesforce&#39; or &#39;facebook.0oapsqQ6dv19pqyEo0g3&#39;).
         * 
         * @return builder
         * 
         */
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }

        /**
         * @param groups List of group IDs. Conflicts with `apps`.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups List of group IDs. Conflicts with `apps`.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups List of group IDs. Conflicts with `apps`.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param roleId Role ID.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId Role ID.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param roleType Name of the role associated with the user. See [API Docs](https://developer.okta.com/docs/reference/api/roles/#role-types).
         * 
         * @return builder
         * 
         */
        public Builder roleType(@Nullable Output<String> roleType) {
            $.roleType = roleType;
            return this;
        }

        /**
         * @param roleType Name of the role associated with the user. See [API Docs](https://developer.okta.com/docs/reference/api/roles/#role-types).
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            return roleType(Output.of(roleType));
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public AdminRoleTargetsState build() {
            return $;
        }
    }

}
