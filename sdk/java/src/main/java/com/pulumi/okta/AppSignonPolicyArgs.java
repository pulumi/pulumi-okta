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


public final class AppSignonPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSignonPolicyArgs Empty = new AppSignonPolicyArgs();

    /**
     * If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule&#39;s default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
     * 
     */
    @Import(name="catchAll")
    private @Nullable Output<Boolean> catchAll;

    /**
     * @return If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule&#39;s default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
     * 
     */
    public Optional<Output<Boolean>> catchAll() {
        return Optional.ofNullable(this.catchAll);
    }

    /**
     * Description of the policy.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of the policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Name of the policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the order in which this policy is evaluated in relation to the other policies.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Specifies the order in which this policy is evaluated in relation to the other policies.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    private AppSignonPolicyArgs() {}

    private AppSignonPolicyArgs(AppSignonPolicyArgs $) {
        this.catchAll = $.catchAll;
        this.description = $.description;
        this.name = $.name;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSignonPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSignonPolicyArgs $;

        public Builder() {
            $ = new AppSignonPolicyArgs();
        }

        public Builder(AppSignonPolicyArgs defaults) {
            $ = new AppSignonPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catchAll If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule&#39;s default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(@Nullable Output<Boolean> catchAll) {
            $.catchAll = catchAll;
            return this;
        }

        /**
         * @param catchAll If false, the default rule of the policy is set access to `DENY`. Otherwise default behavior of the default rule is to leave access at `ALLOW`.  **WARNING** setting this attribute to false changes policy rule&#39;s default behavior. Use at your own risk. This is only applied during creation and does not affect import or update.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(Boolean catchAll) {
            return catchAll(Output.of(catchAll));
        }

        /**
         * @param description Description of the policy.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Specifies the order in which this policy is evaluated in relation to the other policies.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Specifies the order in which this policy is evaluated in relation to the other policies.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public AppSignonPolicyArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("AppSignonPolicyArgs", "description");
            }
            return $;
        }
    }

}
