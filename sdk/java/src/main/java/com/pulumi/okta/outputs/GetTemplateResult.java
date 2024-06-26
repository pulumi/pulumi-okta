// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTemplateResult {
    /**
     * @return Brand ID
     * 
     */
    private String brandId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Link relations for this object - JSON HAL - Discoverable resources related to the email template
     * 
     */
    private String links;
    /**
     * @return The name of the email template
     * 
     */
    private String name;

    private GetTemplateResult() {}
    /**
     * @return Brand ID
     * 
     */
    public String brandId() {
        return this.brandId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Link relations for this object - JSON HAL - Discoverable resources related to the email template
     * 
     */
    public String links() {
        return this.links;
    }
    /**
     * @return The name of the email template
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String brandId;
        private String id;
        private String links;
        private String name;
        public Builder() {}
        public Builder(GetTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brandId = defaults.brandId;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder brandId(String brandId) {
            if (brandId == null) {
              throw new MissingRequiredPropertyException("GetTemplateResult", "brandId");
            }
            this.brandId = brandId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTemplateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder links(String links) {
            if (links == null) {
              throw new MissingRequiredPropertyException("GetTemplateResult", "links");
            }
            this.links = links;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTemplateResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetTemplateResult build() {
            final var _resultValue = new GetTemplateResult();
            _resultValue.brandId = brandId;
            _resultValue.id = id;
            _resultValue.links = links;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
