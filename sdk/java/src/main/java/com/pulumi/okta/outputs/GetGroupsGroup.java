// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupsGroup {
    /**
     * @return raw JSON containing all custom profile attributes. Likely only useful on groups of type `APP_GROUP`.
     * 
     */
    private String customProfileAttributes;
    /**
     * @return Group description.
     * 
     */
    private String description;
    /**
     * @return Group ID.
     * 
     */
    private String id;
    /**
     * @return Group name.
     * 
     */
    private String name;
    /**
     * @return type of the group to retrieve. Can only be one of `OKTA_GROUP` (Native Okta Groups), `APP_GROUP`
     * (Imported App Groups), or `BUILT_IN` (Okta System Groups).
     * 
     */
    private String type;

    private GetGroupsGroup() {}
    /**
     * @return raw JSON containing all custom profile attributes. Likely only useful on groups of type `APP_GROUP`.
     * 
     */
    public String customProfileAttributes() {
        return this.customProfileAttributes;
    }
    /**
     * @return Group description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Group ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return type of the group to retrieve. Can only be one of `OKTA_GROUP` (Native Okta Groups), `APP_GROUP`
     * (Imported App Groups), or `BUILT_IN` (Okta System Groups).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customProfileAttributes;
        private String description;
        private String id;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customProfileAttributes = defaults.customProfileAttributes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder customProfileAttributes(String customProfileAttributes) {
            this.customProfileAttributes = Objects.requireNonNull(customProfileAttributes);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGroupsGroup build() {
            final var o = new GetGroupsGroup();
            o.customProfileAttributes = customProfileAttributes;
            o.description = description;
            o.id = id;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}