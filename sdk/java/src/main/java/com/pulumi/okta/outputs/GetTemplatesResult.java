// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.okta.outputs.GetTemplatesEmailTemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTemplatesResult {
    private String brandId;
    /**
     * @return List of `okta.getTemplate` belonging to the brand
     * 
     */
    private List<GetTemplatesEmailTemplate> emailTemplates;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetTemplatesResult() {}
    public String brandId() {
        return this.brandId;
    }
    /**
     * @return List of `okta.getTemplate` belonging to the brand
     * 
     */
    public List<GetTemplatesEmailTemplate> emailTemplates() {
        return this.emailTemplates;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String brandId;
        private List<GetTemplatesEmailTemplate> emailTemplates;
        private String id;
        public Builder() {}
        public Builder(GetTemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brandId = defaults.brandId;
    	      this.emailTemplates = defaults.emailTemplates;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder brandId(String brandId) {
            this.brandId = Objects.requireNonNull(brandId);
            return this;
        }
        @CustomType.Setter
        public Builder emailTemplates(List<GetTemplatesEmailTemplate> emailTemplates) {
            this.emailTemplates = Objects.requireNonNull(emailTemplates);
            return this;
        }
        public Builder emailTemplates(GetTemplatesEmailTemplate... emailTemplates) {
            return emailTemplates(List.of(emailTemplates));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetTemplatesResult build() {
            final var o = new GetTemplatesResult();
            o.brandId = brandId;
            o.emailTemplates = emailTemplates;
            o.id = id;
            return o;
        }
    }
}