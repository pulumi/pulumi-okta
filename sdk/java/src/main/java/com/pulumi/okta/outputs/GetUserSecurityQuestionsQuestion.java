// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserSecurityQuestionsQuestion {
    private String key;
    private String text;

    private GetUserSecurityQuestionsQuestion() {}
    public String key() {
        return this.key;
    }
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSecurityQuestionsQuestion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String text;
        public Builder() {}
        public Builder(GetUserSecurityQuestionsQuestion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetUserSecurityQuestionsQuestion", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            if (text == null) {
              throw new MissingRequiredPropertyException("GetUserSecurityQuestionsQuestion", "text");
            }
            this.text = text;
            return this;
        }
        public GetUserSecurityQuestionsQuestion build() {
            final var _resultValue = new GetUserSecurityQuestionsQuestion();
            _resultValue.key = key;
            _resultValue.text = text;
            return _resultValue;
        }
    }
}