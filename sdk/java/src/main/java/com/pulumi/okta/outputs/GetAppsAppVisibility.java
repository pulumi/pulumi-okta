// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetAppsAppVisibilityHide;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAppsAppVisibility {
    private Boolean autoLaunch;
    private Boolean autoSubmitToolbar;
    private GetAppsAppVisibilityHide hide;

    private GetAppsAppVisibility() {}
    public Boolean autoLaunch() {
        return this.autoLaunch;
    }
    public Boolean autoSubmitToolbar() {
        return this.autoSubmitToolbar;
    }
    public GetAppsAppVisibilityHide hide() {
        return this.hide;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsAppVisibility defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoLaunch;
        private Boolean autoSubmitToolbar;
        private GetAppsAppVisibilityHide hide;
        public Builder() {}
        public Builder(GetAppsAppVisibility defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoLaunch = defaults.autoLaunch;
    	      this.autoSubmitToolbar = defaults.autoSubmitToolbar;
    	      this.hide = defaults.hide;
        }

        @CustomType.Setter
        public Builder autoLaunch(Boolean autoLaunch) {
            if (autoLaunch == null) {
              throw new MissingRequiredPropertyException("GetAppsAppVisibility", "autoLaunch");
            }
            this.autoLaunch = autoLaunch;
            return this;
        }
        @CustomType.Setter
        public Builder autoSubmitToolbar(Boolean autoSubmitToolbar) {
            if (autoSubmitToolbar == null) {
              throw new MissingRequiredPropertyException("GetAppsAppVisibility", "autoSubmitToolbar");
            }
            this.autoSubmitToolbar = autoSubmitToolbar;
            return this;
        }
        @CustomType.Setter
        public Builder hide(GetAppsAppVisibilityHide hide) {
            if (hide == null) {
              throw new MissingRequiredPropertyException("GetAppsAppVisibility", "hide");
            }
            this.hide = hide;
            return this;
        }
        public GetAppsAppVisibility build() {
            final var _resultValue = new GetAppsAppVisibility();
            _resultValue.autoLaunch = autoLaunch;
            _resultValue.autoSubmitToolbar = autoSubmitToolbar;
            _resultValue.hide = hide;
            return _resultValue;
        }
    }
}