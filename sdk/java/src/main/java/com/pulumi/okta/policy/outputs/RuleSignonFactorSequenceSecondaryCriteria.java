// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleSignonFactorSequenceSecondaryCriteria {
    /**
     * @return Type of a Factor
     * 
     */
    private String factorType;
    /**
     * @return Factor provider
     * 
     */
    private String provider;

    private RuleSignonFactorSequenceSecondaryCriteria() {}
    /**
     * @return Type of a Factor
     * 
     */
    public String factorType() {
        return this.factorType;
    }
    /**
     * @return Factor provider
     * 
     */
    public String provider() {
        return this.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSignonFactorSequenceSecondaryCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String factorType;
        private String provider;
        public Builder() {}
        public Builder(RuleSignonFactorSequenceSecondaryCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factorType = defaults.factorType;
    	      this.provider = defaults.provider;
        }

        @CustomType.Setter
        public Builder factorType(String factorType) {
            if (factorType == null) {
              throw new MissingRequiredPropertyException("RuleSignonFactorSequenceSecondaryCriteria", "factorType");
            }
            this.factorType = factorType;
            return this;
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            if (provider == null) {
              throw new MissingRequiredPropertyException("RuleSignonFactorSequenceSecondaryCriteria", "provider");
            }
            this.provider = provider;
            return this;
        }
        public RuleSignonFactorSequenceSecondaryCriteria build() {
            final var _resultValue = new RuleSignonFactorSequenceSecondaryCriteria();
            _resultValue.factorType = factorType;
            _resultValue.provider = provider;
            return _resultValue;
        }
    }
}