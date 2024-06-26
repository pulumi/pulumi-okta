// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
     * 
     */
    @Import(name="expressionType")
    private @Nullable Output<String> expressionType;

    /**
     * @return The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
     * 
     */
    public Optional<Output<String>> expressionType() {
        return Optional.ofNullable(this.expressionType);
    }

    /**
     * The expression value.
     * 
     */
    @Import(name="expressionValue", required=true)
    private Output<String> expressionValue;

    /**
     * @return The expression value.
     * 
     */
    public Output<String> expressionValue() {
        return this.expressionValue;
    }

    /**
     * The list of group ids to assign the users to.
     * 
     */
    @Import(name="groupAssignments", required=true)
    private Output<List<String>> groupAssignments;

    /**
     * @return The list of group ids to assign the users to.
     * 
     */
    public Output<List<String>> groupAssignments() {
        return this.groupAssignments;
    }

    /**
     * The name of the Group Rule (min character 1; max characters 50).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Group Rule (min character 1; max characters 50).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
     * 
     */
    @Import(name="removeAssignedUsers")
    private @Nullable Output<Boolean> removeAssignedUsers;

    /**
     * @return Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
     * 
     */
    public Optional<Output<Boolean>> removeAssignedUsers() {
        return Optional.ofNullable(this.removeAssignedUsers);
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

    /**
     * The list of user IDs that would be excluded when rules are processed
     * 
     */
    @Import(name="usersExcludeds")
    private @Nullable Output<List<String>> usersExcludeds;

    /**
     * @return The list of user IDs that would be excluded when rules are processed
     * 
     */
    public Optional<Output<List<String>>> usersExcludeds() {
        return Optional.ofNullable(this.usersExcludeds);
    }

    private RuleArgs() {}

    private RuleArgs(RuleArgs $) {
        this.expressionType = $.expressionType;
        this.expressionValue = $.expressionValue;
        this.groupAssignments = $.groupAssignments;
        this.name = $.name;
        this.removeAssignedUsers = $.removeAssignedUsers;
        this.status = $.status;
        this.usersExcludeds = $.usersExcludeds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleArgs $;

        public Builder() {
            $ = new RuleArgs();
        }

        public Builder(RuleArgs defaults) {
            $ = new RuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressionType The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
         * 
         * @return builder
         * 
         */
        public Builder expressionType(@Nullable Output<String> expressionType) {
            $.expressionType = expressionType;
            return this;
        }

        /**
         * @param expressionType The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
         * 
         * @return builder
         * 
         */
        public Builder expressionType(String expressionType) {
            return expressionType(Output.of(expressionType));
        }

        /**
         * @param expressionValue The expression value.
         * 
         * @return builder
         * 
         */
        public Builder expressionValue(Output<String> expressionValue) {
            $.expressionValue = expressionValue;
            return this;
        }

        /**
         * @param expressionValue The expression value.
         * 
         * @return builder
         * 
         */
        public Builder expressionValue(String expressionValue) {
            return expressionValue(Output.of(expressionValue));
        }

        /**
         * @param groupAssignments The list of group ids to assign the users to.
         * 
         * @return builder
         * 
         */
        public Builder groupAssignments(Output<List<String>> groupAssignments) {
            $.groupAssignments = groupAssignments;
            return this;
        }

        /**
         * @param groupAssignments The list of group ids to assign the users to.
         * 
         * @return builder
         * 
         */
        public Builder groupAssignments(List<String> groupAssignments) {
            return groupAssignments(Output.of(groupAssignments));
        }

        /**
         * @param groupAssignments The list of group ids to assign the users to.
         * 
         * @return builder
         * 
         */
        public Builder groupAssignments(String... groupAssignments) {
            return groupAssignments(List.of(groupAssignments));
        }

        /**
         * @param name The name of the Group Rule (min character 1; max characters 50).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Group Rule (min character 1; max characters 50).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param removeAssignedUsers Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
         * 
         * @return builder
         * 
         */
        public Builder removeAssignedUsers(@Nullable Output<Boolean> removeAssignedUsers) {
            $.removeAssignedUsers = removeAssignedUsers;
            return this;
        }

        /**
         * @param removeAssignedUsers Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
         * 
         * @return builder
         * 
         */
        public Builder removeAssignedUsers(Boolean removeAssignedUsers) {
            return removeAssignedUsers(Output.of(removeAssignedUsers));
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

        /**
         * @param usersExcludeds The list of user IDs that would be excluded when rules are processed
         * 
         * @return builder
         * 
         */
        public Builder usersExcludeds(@Nullable Output<List<String>> usersExcludeds) {
            $.usersExcludeds = usersExcludeds;
            return this;
        }

        /**
         * @param usersExcludeds The list of user IDs that would be excluded when rules are processed
         * 
         * @return builder
         * 
         */
        public Builder usersExcludeds(List<String> usersExcludeds) {
            return usersExcludeds(Output.of(usersExcludeds));
        }

        /**
         * @param usersExcludeds The list of user IDs that would be excluded when rules are processed
         * 
         * @return builder
         * 
         */
        public Builder usersExcludeds(String... usersExcludeds) {
            return usersExcludeds(List.of(usersExcludeds));
        }

        public RuleArgs build() {
            if ($.expressionValue == null) {
                throw new MissingRequiredPropertyException("RuleArgs", "expressionValue");
            }
            if ($.groupAssignments == null) {
                throw new MissingRequiredPropertyException("RuleArgs", "groupAssignments");
            }
            return $;
        }
    }

}
