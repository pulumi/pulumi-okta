// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.app;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupAssignmentArgs Empty = new GroupAssignmentArgs();

    /**
     * App to associate group with
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return App to associate group with
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Group associated with the application
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return Group associated with the application
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * Priority of group assignment.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of group assignment.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * Retain the group assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
     * 
     */
    @Import(name="retainAssignment")
    private @Nullable Output<Boolean> retainAssignment;

    /**
     * @return Retain the group assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
     * 
     */
    public Optional<Output<Boolean>> retainAssignment() {
        return Optional.ofNullable(this.retainAssignment);
    }

    private GroupAssignmentArgs() {}

    private GroupAssignmentArgs(GroupAssignmentArgs $) {
        this.appId = $.appId;
        this.groupId = $.groupId;
        this.priority = $.priority;
        this.profile = $.profile;
        this.retainAssignment = $.retainAssignment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupAssignmentArgs $;

        public Builder() {
            $ = new GroupAssignmentArgs();
        }

        public Builder(GroupAssignmentArgs defaults) {
            $ = new GroupAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId App to associate group with
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId App to associate group with
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param groupId Group associated with the application
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Group associated with the application
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param priority Priority of group assignment.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of group assignment.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param profile JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param retainAssignment Retain the group assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
         * 
         * @return builder
         * 
         */
        public Builder retainAssignment(@Nullable Output<Boolean> retainAssignment) {
            $.retainAssignment = retainAssignment;
            return this;
        }

        /**
         * @param retainAssignment Retain the group assignment on destroy. If set to true, the resource will be removed from state but not from the Okta app.
         * 
         * @return builder
         * 
         */
        public Builder retainAssignment(Boolean retainAssignment) {
            return retainAssignment(Output.of(retainAssignment));
        }

        public GroupAssignmentArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("GroupAssignmentArgs", "appId");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("GroupAssignmentArgs", "groupId");
            }
            return $;
        }
    }

}