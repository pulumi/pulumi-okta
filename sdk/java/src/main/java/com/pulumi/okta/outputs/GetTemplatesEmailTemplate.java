// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTemplatesEmailTemplate {
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

    private GetTemplatesEmailTemplate() {}
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

    public static Builder builder(GetTemplatesEmailTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String links;
        private String name;
        public Builder() {}
        public Builder(GetTemplatesEmailTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.links = defaults.links;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder links(String links) {
            if (links == null) {
              throw new MissingRequiredPropertyException("GetTemplatesEmailTemplate", "links");
            }
            this.links = links;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTemplatesEmailTemplate", "name");
            }
            this.name = name;
            return this;
        }
        public GetTemplatesEmailTemplate build() {
            final var _resultValue = new GetTemplatesEmailTemplate();
            _resultValue.links = links;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
