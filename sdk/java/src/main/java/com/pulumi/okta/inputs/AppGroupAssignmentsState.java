// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.okta.inputs.AppGroupAssignmentsGroupArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppGroupAssignmentsState extends com.pulumi.resources.ResourceArgs {

    public static final AppGroupAssignmentsState Empty = new AppGroupAssignmentsState();

    /**
     * The ID of the application to assign a group to.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of the application to assign a group to.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * A group to assign to this application
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<AppGroupAssignmentsGroupArgs>> groups;

    /**
     * @return A group to assign to this application
     * 
     */
    public Optional<Output<List<AppGroupAssignmentsGroupArgs>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    private AppGroupAssignmentsState() {}

    private AppGroupAssignmentsState(AppGroupAssignmentsState $) {
        this.appId = $.appId;
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppGroupAssignmentsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppGroupAssignmentsState $;

        public Builder() {
            $ = new AppGroupAssignmentsState();
        }

        public Builder(AppGroupAssignmentsState defaults) {
            $ = new AppGroupAssignmentsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of the application to assign a group to.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of the application to assign a group to.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param groups A group to assign to this application
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<AppGroupAssignmentsGroupArgs>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups A group to assign to this application
         * 
         * @return builder
         * 
         */
        public Builder groups(List<AppGroupAssignmentsGroupArgs> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups A group to assign to this application
         * 
         * @return builder
         * 
         */
        public Builder groups(AppGroupAssignmentsGroupArgs... groups) {
            return groups(List.of(groups));
        }

        public AppGroupAssignmentsState build() {
            return $;
        }
    }

}
