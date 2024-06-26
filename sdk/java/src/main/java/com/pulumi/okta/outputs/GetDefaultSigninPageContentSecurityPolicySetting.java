// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDefaultSigninPageContentSecurityPolicySetting {
    /**
     * @return enforced or report_only
     * 
     */
    private String mode;
    private String reportUri;
    private List<String> srcLists;

    private GetDefaultSigninPageContentSecurityPolicySetting() {}
    /**
     * @return enforced or report_only
     * 
     */
    public String mode() {
        return this.mode;
    }
    public String reportUri() {
        return this.reportUri;
    }
    public List<String> srcLists() {
        return this.srcLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultSigninPageContentSecurityPolicySetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private String reportUri;
        private List<String> srcLists;
        public Builder() {}
        public Builder(GetDefaultSigninPageContentSecurityPolicySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.reportUri = defaults.reportUri;
    	      this.srcLists = defaults.srcLists;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder reportUri(String reportUri) {
            if (reportUri == null) {
              throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "reportUri");
            }
            this.reportUri = reportUri;
            return this;
        }
        @CustomType.Setter
        public Builder srcLists(List<String> srcLists) {
            if (srcLists == null) {
              throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "srcLists");
            }
            this.srcLists = srcLists;
            return this;
        }
        public Builder srcLists(String... srcLists) {
            return srcLists(List.of(srcLists));
        }
        public GetDefaultSigninPageContentSecurityPolicySetting build() {
            final var _resultValue = new GetDefaultSigninPageContentSecurityPolicySetting();
            _resultValue.mode = mode;
            _resultValue.reportUri = reportUri;
            _resultValue.srcLists = srcLists;
            return _resultValue;
        }
    }
}
