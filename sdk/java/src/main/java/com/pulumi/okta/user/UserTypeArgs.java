// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserTypeArgs Empty = new UserTypeArgs();

    /**
     * Description of the User Type.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of the User Type.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Display Name of the User Type.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display Name of the User Type.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Name of the User Type.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the User Type.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private UserTypeArgs() {}

    private UserTypeArgs(UserTypeArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserTypeArgs $;

        public Builder() {
            $ = new UserTypeArgs();
        }

        public Builder(UserTypeArgs defaults) {
            $ = new UserTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display Name of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display Name of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Name of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the User Type.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public UserTypeArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("UserTypeArgs", "description");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("UserTypeArgs", "displayName");
            }
            return $;
        }
    }

}