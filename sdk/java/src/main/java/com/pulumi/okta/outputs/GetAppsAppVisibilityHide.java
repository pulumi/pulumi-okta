// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAppsAppVisibilityHide {
    private Boolean ios;
    private Boolean web;

    private GetAppsAppVisibilityHide() {}
    public Boolean ios() {
        return this.ios;
    }
    public Boolean web() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsAppVisibilityHide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean ios;
        private Boolean web;
        public Builder() {}
        public Builder(GetAppsAppVisibilityHide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ios = defaults.ios;
    	      this.web = defaults.web;
        }

        @CustomType.Setter
        public Builder ios(Boolean ios) {
            if (ios == null) {
              throw new MissingRequiredPropertyException("GetAppsAppVisibilityHide", "ios");
            }
            this.ios = ios;
            return this;
        }
        @CustomType.Setter
        public Builder web(Boolean web) {
            if (web == null) {
              throw new MissingRequiredPropertyException("GetAppsAppVisibilityHide", "web");
            }
            this.web = web;
            return this;
        }
        public GetAppsAppVisibilityHide build() {
            final var _resultValue = new GetAppsAppVisibilityHide();
            _resultValue.ios = ios;
            _resultValue.web = web;
            return _resultValue;
        }
    }
}