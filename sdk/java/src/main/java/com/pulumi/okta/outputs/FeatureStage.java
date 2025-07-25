// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FeatureStage {
    private String state;
    private String value;

    private FeatureStage() {}
    public String state() {
        return this.state;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureStage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String state;
        private String value;
        public Builder() {}
        public Builder(FeatureStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("FeatureStage", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("FeatureStage", "value");
            }
            this.value = value;
            return this;
        }
        public FeatureStage build() {
            final var _resultValue = new FeatureStage();
            _resultValue.state = state;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
