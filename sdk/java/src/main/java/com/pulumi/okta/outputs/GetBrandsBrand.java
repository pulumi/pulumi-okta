// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrandsBrand {
    private String customPrivacyPolicyUrl;
    private String id;
    private String links;
    private Boolean removePoweredByOkta;

    private GetBrandsBrand() {}
    public String customPrivacyPolicyUrl() {
        return this.customPrivacyPolicyUrl;
    }
    public String id() {
        return this.id;
    }
    public String links() {
        return this.links;
    }
    public Boolean removePoweredByOkta() {
        return this.removePoweredByOkta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandsBrand defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customPrivacyPolicyUrl;
        private String id;
        private String links;
        private Boolean removePoweredByOkta;
        public Builder() {}
        public Builder(GetBrandsBrand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPrivacyPolicyUrl = defaults.customPrivacyPolicyUrl;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.removePoweredByOkta = defaults.removePoweredByOkta;
        }

        @CustomType.Setter
        public Builder customPrivacyPolicyUrl(String customPrivacyPolicyUrl) {
            this.customPrivacyPolicyUrl = Objects.requireNonNull(customPrivacyPolicyUrl);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder links(String links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }
        @CustomType.Setter
        public Builder removePoweredByOkta(Boolean removePoweredByOkta) {
            this.removePoweredByOkta = Objects.requireNonNull(removePoweredByOkta);
            return this;
        }
        public GetBrandsBrand build() {
            final var o = new GetBrandsBrand();
            o.customPrivacyPolicyUrl = customPrivacyPolicyUrl;
            o.id = id;
            o.links = links;
            o.removePoweredByOkta = removePoweredByOkta;
            return o;
        }
    }
}