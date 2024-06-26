// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppUserBaseSchemaPropertyState extends com.pulumi.resources.ResourceArgs {

    public static final AppUserBaseSchemaPropertyState Empty = new AppUserBaseSchemaPropertyState();

    /**
     * The Application&#39;s ID the user schema property should be assigned to.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The Application&#39;s ID the user schema property should be assigned to.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * Subschema unique string identifier
     * 
     */
    @Import(name="index")
    private @Nullable Output<String> index;

    /**
     * @return Subschema unique string identifier
     * 
     */
    public Optional<Output<String>> index() {
        return Optional.ofNullable(this.index);
    }

    /**
     * Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
     * 
     */
    @Import(name="master")
    private @Nullable Output<String> master;

    /**
     * @return Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
     * 
     */
    public Optional<Output<String>> master() {
        return Optional.ofNullable(this.master);
    }

    /**
     * The validation pattern to use for the subschema. Must be in form of &#39;.+&#39;, or &#39;[\n\n]+&#39; if present.&#39;
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return The validation pattern to use for the subschema. Must be in form of &#39;.+&#39;, or &#39;[\n\n]+&#39; if present.&#39;
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Whether the subschema is required
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Whether the subschema is required
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Subschema title (display name)
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Subschema title (display name)
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User type ID. By default, it is `default`
     * 
     */
    @Import(name="userType")
    private @Nullable Output<String> userType;

    /**
     * @return User type ID. By default, it is `default`
     * 
     */
    public Optional<Output<String>> userType() {
        return Optional.ofNullable(this.userType);
    }

    private AppUserBaseSchemaPropertyState() {}

    private AppUserBaseSchemaPropertyState(AppUserBaseSchemaPropertyState $) {
        this.appId = $.appId;
        this.index = $.index;
        this.master = $.master;
        this.pattern = $.pattern;
        this.permissions = $.permissions;
        this.required = $.required;
        this.title = $.title;
        this.type = $.type;
        this.userType = $.userType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppUserBaseSchemaPropertyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppUserBaseSchemaPropertyState $;

        public Builder() {
            $ = new AppUserBaseSchemaPropertyState();
        }

        public Builder(AppUserBaseSchemaPropertyState defaults) {
            $ = new AppUserBaseSchemaPropertyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The Application&#39;s ID the user schema property should be assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The Application&#39;s ID the user schema property should be assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param index Subschema unique string identifier
         * 
         * @return builder
         * 
         */
        public Builder index(@Nullable Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index Subschema unique string identifier
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param master Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
         * 
         * @return builder
         * 
         */
        public Builder master(@Nullable Output<String> master) {
            $.master = master;
            return this;
        }

        /**
         * @param master Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
         * 
         * @return builder
         * 
         */
        public Builder master(String master) {
            return master(Output.of(master));
        }

        /**
         * @param pattern The validation pattern to use for the subschema. Must be in form of &#39;.+&#39;, or &#39;[\n\n]+&#39; if present.&#39;
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The validation pattern to use for the subschema. Must be in form of &#39;.+&#39;, or &#39;[\n\n]+&#39; if present.&#39;
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param permissions Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param required Whether the subschema is required
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Whether the subschema is required
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param title Subschema title (display name)
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Subschema title (display name)
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param type The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userType User type ID. By default, it is `default`
         * 
         * @return builder
         * 
         */
        public Builder userType(@Nullable Output<String> userType) {
            $.userType = userType;
            return this;
        }

        /**
         * @param userType User type ID. By default, it is `default`
         * 
         * @return builder
         * 
         */
        public Builder userType(String userType) {
            return userType(Output.of(userType));
        }

        public AppUserBaseSchemaPropertyState build() {
            return $;
        }
    }

}
