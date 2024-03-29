// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.okta.inputs.GroupSchemaPropertyArrayOneOfArgs;
import com.pulumi.okta.inputs.GroupSchemaPropertyMasterOverridePriorityArgs;
import com.pulumi.okta.inputs.GroupSchemaPropertyOneOfArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupSchemaPropertyState extends com.pulumi.resources.ResourceArgs {

    public static final GroupSchemaPropertyState Empty = new GroupSchemaPropertyState();

    /**
     * Array of values that an array property&#39;s items can be set to.
     * 
     */
    @Import(name="arrayEnums")
    private @Nullable Output<List<String>> arrayEnums;

    /**
     * @return Array of values that an array property&#39;s items can be set to.
     * 
     */
    public Optional<Output<List<String>>> arrayEnums() {
        return Optional.ofNullable(this.arrayEnums);
    }

    /**
     * Display name and value an enum array can be set to.
     * 
     */
    @Import(name="arrayOneOfs")
    private @Nullable Output<List<GroupSchemaPropertyArrayOneOfArgs>> arrayOneOfs;

    /**
     * @return Display name and value an enum array can be set to.
     * 
     */
    public Optional<Output<List<GroupSchemaPropertyArrayOneOfArgs>>> arrayOneOfs() {
        return Optional.ofNullable(this.arrayOneOfs);
    }

    /**
     * The type of the array elements if `type` is set to `&#34;array&#34;`.
     * 
     */
    @Import(name="arrayType")
    private @Nullable Output<String> arrayType;

    /**
     * @return The type of the array elements if `type` is set to `&#34;array&#34;`.
     * 
     */
    public Optional<Output<String>> arrayType() {
        return Optional.ofNullable(this.arrayType);
    }

    /**
     * The description of the group schema property.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the group schema property.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Array of values a primitive property can be set to. See `array_enum` for arrays.
     * 
     */
    @Import(name="enums")
    private @Nullable Output<List<String>> enums;

    /**
     * @return Array of values a primitive property can be set to. See `array_enum` for arrays.
     * 
     */
    public Optional<Output<List<String>>> enums() {
        return Optional.ofNullable(this.enums);
    }

    /**
     * External name of the group schema property.
     * 
     */
    @Import(name="externalName")
    private @Nullable Output<String> externalName;

    /**
     * @return External name of the group schema property.
     * 
     */
    public Optional<Output<String>> externalName() {
        return Optional.ofNullable(this.externalName);
    }

    /**
     * External name of the group schema property.
     * 
     */
    @Import(name="externalNamespace")
    private @Nullable Output<String> externalNamespace;

    /**
     * @return External name of the group schema property.
     * 
     */
    public Optional<Output<String>> externalNamespace() {
        return Optional.ofNullable(this.externalNamespace);
    }

    /**
     * The property name.
     * 
     */
    @Import(name="index")
    private @Nullable Output<String> index;

    /**
     * @return The property name.
     * 
     */
    public Optional<Output<String>> index() {
        return Optional.ofNullable(this.index);
    }

    /**
     * Master priority for the group schema property. It can be set to `&#34;PROFILE_MASTER&#34;`, `&#34;OVERRIDE&#34;` or `&#34;OKTA&#34;`.
     * 
     */
    @Import(name="master")
    private @Nullable Output<String> master;

    /**
     * @return Master priority for the group schema property. It can be set to `&#34;PROFILE_MASTER&#34;`, `&#34;OVERRIDE&#34;` or `&#34;OKTA&#34;`.
     * 
     */
    public Optional<Output<String>> master() {
        return Optional.ofNullable(this.master);
    }

    /**
     * Prioritized list of profile sources (required when `master` is `&#34;OVERRIDE&#34;`).
     * 
     */
    @Import(name="masterOverridePriorities")
    private @Nullable Output<List<GroupSchemaPropertyMasterOverridePriorityArgs>> masterOverridePriorities;

    /**
     * @return Prioritized list of profile sources (required when `master` is `&#34;OVERRIDE&#34;`).
     * 
     */
    public Optional<Output<List<GroupSchemaPropertyMasterOverridePriorityArgs>>> masterOverridePriorities() {
        return Optional.ofNullable(this.masterOverridePriorities);
    }

    /**
     * The maximum length of the group property value. Only applies to type `&#34;string&#34;`.
     * 
     */
    @Import(name="maxLength")
    private @Nullable Output<Integer> maxLength;

    /**
     * @return The maximum length of the group property value. Only applies to type `&#34;string&#34;`.
     * 
     */
    public Optional<Output<Integer>> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }

    /**
     * The minimum length of the group property value. Only applies to type `&#34;string&#34;`.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return The minimum length of the group property value. Only applies to type `&#34;string&#34;`.
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * Array of maps containing a mapping for display name to enum value.
     * 
     */
    @Import(name="oneOfs")
    private @Nullable Output<List<GroupSchemaPropertyOneOfArgs>> oneOfs;

    /**
     * @return Array of maps containing a mapping for display name to enum value.
     * 
     */
    public Optional<Output<List<GroupSchemaPropertyOneOfArgs>>> oneOfs() {
        return Optional.ofNullable(this.oneOfs);
    }

    /**
     * Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Whether the property is required for this group.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Whether the property is required for this group.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * determines whether an app user attribute can be set at the Individual or Group Level.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return determines whether an app user attribute can be set at the Individual or Group Level.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * display name for the enum value.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return display name for the enum value.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Type of profile source.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of profile source.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Whether the property should be unique. It can be set to `&#34;UNIQUE_VALIDATED&#34;` or `&#34;NOT_UNIQUE&#34;`.
     * 
     */
    @Import(name="unique")
    private @Nullable Output<String> unique;

    /**
     * @return Whether the property should be unique. It can be set to `&#34;UNIQUE_VALIDATED&#34;` or `&#34;NOT_UNIQUE&#34;`.
     * 
     */
    public Optional<Output<String>> unique() {
        return Optional.ofNullable(this.unique);
    }

    private GroupSchemaPropertyState() {}

    private GroupSchemaPropertyState(GroupSchemaPropertyState $) {
        this.arrayEnums = $.arrayEnums;
        this.arrayOneOfs = $.arrayOneOfs;
        this.arrayType = $.arrayType;
        this.description = $.description;
        this.enums = $.enums;
        this.externalName = $.externalName;
        this.externalNamespace = $.externalNamespace;
        this.index = $.index;
        this.master = $.master;
        this.masterOverridePriorities = $.masterOverridePriorities;
        this.maxLength = $.maxLength;
        this.minLength = $.minLength;
        this.oneOfs = $.oneOfs;
        this.permissions = $.permissions;
        this.required = $.required;
        this.scope = $.scope;
        this.title = $.title;
        this.type = $.type;
        this.unique = $.unique;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupSchemaPropertyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupSchemaPropertyState $;

        public Builder() {
            $ = new GroupSchemaPropertyState();
        }

        public Builder(GroupSchemaPropertyState defaults) {
            $ = new GroupSchemaPropertyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arrayEnums Array of values that an array property&#39;s items can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayEnums(@Nullable Output<List<String>> arrayEnums) {
            $.arrayEnums = arrayEnums;
            return this;
        }

        /**
         * @param arrayEnums Array of values that an array property&#39;s items can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayEnums(List<String> arrayEnums) {
            return arrayEnums(Output.of(arrayEnums));
        }

        /**
         * @param arrayEnums Array of values that an array property&#39;s items can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayEnums(String... arrayEnums) {
            return arrayEnums(List.of(arrayEnums));
        }

        /**
         * @param arrayOneOfs Display name and value an enum array can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayOneOfs(@Nullable Output<List<GroupSchemaPropertyArrayOneOfArgs>> arrayOneOfs) {
            $.arrayOneOfs = arrayOneOfs;
            return this;
        }

        /**
         * @param arrayOneOfs Display name and value an enum array can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayOneOfs(List<GroupSchemaPropertyArrayOneOfArgs> arrayOneOfs) {
            return arrayOneOfs(Output.of(arrayOneOfs));
        }

        /**
         * @param arrayOneOfs Display name and value an enum array can be set to.
         * 
         * @return builder
         * 
         */
        public Builder arrayOneOfs(GroupSchemaPropertyArrayOneOfArgs... arrayOneOfs) {
            return arrayOneOfs(List.of(arrayOneOfs));
        }

        /**
         * @param arrayType The type of the array elements if `type` is set to `&#34;array&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder arrayType(@Nullable Output<String> arrayType) {
            $.arrayType = arrayType;
            return this;
        }

        /**
         * @param arrayType The type of the array elements if `type` is set to `&#34;array&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder arrayType(String arrayType) {
            return arrayType(Output.of(arrayType));
        }

        /**
         * @param description The description of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enums Array of values a primitive property can be set to. See `array_enum` for arrays.
         * 
         * @return builder
         * 
         */
        public Builder enums(@Nullable Output<List<String>> enums) {
            $.enums = enums;
            return this;
        }

        /**
         * @param enums Array of values a primitive property can be set to. See `array_enum` for arrays.
         * 
         * @return builder
         * 
         */
        public Builder enums(List<String> enums) {
            return enums(Output.of(enums));
        }

        /**
         * @param enums Array of values a primitive property can be set to. See `array_enum` for arrays.
         * 
         * @return builder
         * 
         */
        public Builder enums(String... enums) {
            return enums(List.of(enums));
        }

        /**
         * @param externalName External name of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder externalName(@Nullable Output<String> externalName) {
            $.externalName = externalName;
            return this;
        }

        /**
         * @param externalName External name of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder externalName(String externalName) {
            return externalName(Output.of(externalName));
        }

        /**
         * @param externalNamespace External name of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder externalNamespace(@Nullable Output<String> externalNamespace) {
            $.externalNamespace = externalNamespace;
            return this;
        }

        /**
         * @param externalNamespace External name of the group schema property.
         * 
         * @return builder
         * 
         */
        public Builder externalNamespace(String externalNamespace) {
            return externalNamespace(Output.of(externalNamespace));
        }

        /**
         * @param index The property name.
         * 
         * @return builder
         * 
         */
        public Builder index(@Nullable Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index The property name.
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param master Master priority for the group schema property. It can be set to `&#34;PROFILE_MASTER&#34;`, `&#34;OVERRIDE&#34;` or `&#34;OKTA&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder master(@Nullable Output<String> master) {
            $.master = master;
            return this;
        }

        /**
         * @param master Master priority for the group schema property. It can be set to `&#34;PROFILE_MASTER&#34;`, `&#34;OVERRIDE&#34;` or `&#34;OKTA&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder master(String master) {
            return master(Output.of(master));
        }

        /**
         * @param masterOverridePriorities Prioritized list of profile sources (required when `master` is `&#34;OVERRIDE&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder masterOverridePriorities(@Nullable Output<List<GroupSchemaPropertyMasterOverridePriorityArgs>> masterOverridePriorities) {
            $.masterOverridePriorities = masterOverridePriorities;
            return this;
        }

        /**
         * @param masterOverridePriorities Prioritized list of profile sources (required when `master` is `&#34;OVERRIDE&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder masterOverridePriorities(List<GroupSchemaPropertyMasterOverridePriorityArgs> masterOverridePriorities) {
            return masterOverridePriorities(Output.of(masterOverridePriorities));
        }

        /**
         * @param masterOverridePriorities Prioritized list of profile sources (required when `master` is `&#34;OVERRIDE&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder masterOverridePriorities(GroupSchemaPropertyMasterOverridePriorityArgs... masterOverridePriorities) {
            return masterOverridePriorities(List.of(masterOverridePriorities));
        }

        /**
         * @param maxLength The maximum length of the group property value. Only applies to type `&#34;string&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder maxLength(@Nullable Output<Integer> maxLength) {
            $.maxLength = maxLength;
            return this;
        }

        /**
         * @param maxLength The maximum length of the group property value. Only applies to type `&#34;string&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder maxLength(Integer maxLength) {
            return maxLength(Output.of(maxLength));
        }

        /**
         * @param minLength The minimum length of the group property value. Only applies to type `&#34;string&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength The minimum length of the group property value. Only applies to type `&#34;string&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        /**
         * @param oneOfs Array of maps containing a mapping for display name to enum value.
         * 
         * @return builder
         * 
         */
        public Builder oneOfs(@Nullable Output<List<GroupSchemaPropertyOneOfArgs>> oneOfs) {
            $.oneOfs = oneOfs;
            return this;
        }

        /**
         * @param oneOfs Array of maps containing a mapping for display name to enum value.
         * 
         * @return builder
         * 
         */
        public Builder oneOfs(List<GroupSchemaPropertyOneOfArgs> oneOfs) {
            return oneOfs(Output.of(oneOfs));
        }

        /**
         * @param oneOfs Array of maps containing a mapping for display name to enum value.
         * 
         * @return builder
         * 
         */
        public Builder oneOfs(GroupSchemaPropertyOneOfArgs... oneOfs) {
            return oneOfs(List.of(oneOfs));
        }

        /**
         * @param permissions Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param required Whether the property is required for this group.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Whether the property is required for this group.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param scope determines whether an app user attribute can be set at the Individual or Group Level.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope determines whether an app user attribute can be set at the Individual or Group Level.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param title display name for the enum value.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title display name for the enum value.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param type Type of profile source.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of profile source.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unique Whether the property should be unique. It can be set to `&#34;UNIQUE_VALIDATED&#34;` or `&#34;NOT_UNIQUE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unique(@Nullable Output<String> unique) {
            $.unique = unique;
            return this;
        }

        /**
         * @param unique Whether the property should be unique. It can be set to `&#34;UNIQUE_VALIDATED&#34;` or `&#34;NOT_UNIQUE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unique(String unique) {
            return unique(Output.of(unique));
        }

        public GroupSchemaPropertyState build() {
            return $;
        }
    }

}
