// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppUserSchemaPropertyArrayOneOf {
    /**
     * @return value mapping to member of `enum`.
     * 
     */
    private String const_;
    /**
     * @return display name for the enum value.
     * 
     */
    private String title;

    private AppUserSchemaPropertyArrayOneOf() {}
    /**
     * @return value mapping to member of `enum`.
     * 
     */
    public String const_() {
        return this.const_;
    }
    /**
     * @return display name for the enum value.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppUserSchemaPropertyArrayOneOf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String const_;
        private String title;
        public Builder() {}
        public Builder(AppUserSchemaPropertyArrayOneOf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.const_ = defaults.const_;
    	      this.title = defaults.title;
        }

        @CustomType.Setter("const")
        public Builder const_(String const_) {
            this.const_ = Objects.requireNonNull(const_);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public AppUserSchemaPropertyArrayOneOf build() {
            final var o = new AppUserSchemaPropertyArrayOneOf();
            o.const_ = const_;
            o.title = title;
            return o;
        }
    }
}