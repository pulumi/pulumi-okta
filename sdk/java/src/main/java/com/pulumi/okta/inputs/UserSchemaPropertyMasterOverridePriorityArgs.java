// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserSchemaPropertyMasterOverridePriorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSchemaPropertyMasterOverridePriorityArgs Empty = new UserSchemaPropertyMasterOverridePriorityArgs();

    /**
     * - Type of profile source.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return - Type of profile source.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * - ID of profile source.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return - ID of profile source.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private UserSchemaPropertyMasterOverridePriorityArgs() {}

    private UserSchemaPropertyMasterOverridePriorityArgs(UserSchemaPropertyMasterOverridePriorityArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSchemaPropertyMasterOverridePriorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSchemaPropertyMasterOverridePriorityArgs $;

        public Builder() {
            $ = new UserSchemaPropertyMasterOverridePriorityArgs();
        }

        public Builder(UserSchemaPropertyMasterOverridePriorityArgs defaults) {
            $ = new UserSchemaPropertyMasterOverridePriorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type - Type of profile source.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type - Type of profile source.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value - ID of profile source.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value - ID of profile source.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public UserSchemaPropertyMasterOverridePriorityArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}