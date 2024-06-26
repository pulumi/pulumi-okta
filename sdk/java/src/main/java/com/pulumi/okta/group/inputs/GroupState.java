// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * JSON formatted custom attributes for a group. It must be JSON due to various types Okta allows.
     * 
     */
    @Import(name="customProfileAttributes")
    private @Nullable Output<String> customProfileAttributes;

    /**
     * @return JSON formatted custom attributes for a group. It must be JSON due to various types Okta allows.
     * 
     */
    public Optional<Output<String>> customProfileAttributes() {
        return Optional.ofNullable(this.customProfileAttributes);
    }

    /**
     * The description of the Okta Group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Okta Group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Okta Group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Okta Group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Ignore users sync. This is a temporary solution until &#39;users&#39; field is supported in all the app-like resources
     * 
     * @deprecated
     * Because users has been removed, this attribute is a no op and will be removed
     * 
     */
    @Deprecated /* Because users has been removed, this attribute is a no op and will be removed */
    @Import(name="skipUsers")
    private @Nullable Output<Boolean> skipUsers;

    /**
     * @return Ignore users sync. This is a temporary solution until &#39;users&#39; field is supported in all the app-like resources
     * 
     * @deprecated
     * Because users has been removed, this attribute is a no op and will be removed
     * 
     */
    @Deprecated /* Because users has been removed, this attribute is a no op and will be removed */
    public Optional<Output<Boolean>> skipUsers() {
        return Optional.ofNullable(this.skipUsers);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.customProfileAttributes = $.customProfileAttributes;
        this.description = $.description;
        this.name = $.name;
        this.skipUsers = $.skipUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customProfileAttributes JSON formatted custom attributes for a group. It must be JSON due to various types Okta allows.
         * 
         * @return builder
         * 
         */
        public Builder customProfileAttributes(@Nullable Output<String> customProfileAttributes) {
            $.customProfileAttributes = customProfileAttributes;
            return this;
        }

        /**
         * @param customProfileAttributes JSON formatted custom attributes for a group. It must be JSON due to various types Okta allows.
         * 
         * @return builder
         * 
         */
        public Builder customProfileAttributes(String customProfileAttributes) {
            return customProfileAttributes(Output.of(customProfileAttributes));
        }

        /**
         * @param description The description of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param skipUsers Ignore users sync. This is a temporary solution until &#39;users&#39; field is supported in all the app-like resources
         * 
         * @return builder
         * 
         * @deprecated
         * Because users has been removed, this attribute is a no op and will be removed
         * 
         */
        @Deprecated /* Because users has been removed, this attribute is a no op and will be removed */
        public Builder skipUsers(@Nullable Output<Boolean> skipUsers) {
            $.skipUsers = skipUsers;
            return this;
        }

        /**
         * @param skipUsers Ignore users sync. This is a temporary solution until &#39;users&#39; field is supported in all the app-like resources
         * 
         * @return builder
         * 
         * @deprecated
         * Because users has been removed, this attribute is a no op and will be removed
         * 
         */
        @Deprecated /* Because users has been removed, this attribute is a no op and will be removed */
        public Builder skipUsers(Boolean skipUsers) {
            return skipUsers(Output.of(skipUsers));
        }

        public GroupState build() {
            return $;
        }
    }

}
