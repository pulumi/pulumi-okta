// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDefaultSigninPageContentSecurityPolicySetting extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultSigninPageContentSecurityPolicySetting Empty = new GetDefaultSigninPageContentSecurityPolicySetting();

    /**
     * enforced or report_only
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return enforced or report_only
     * 
     */
    public String mode() {
        return this.mode;
    }

    @Import(name="reportUri", required=true)
    private String reportUri;

    public String reportUri() {
        return this.reportUri;
    }

    @Import(name="srcLists", required=true)
    private List<String> srcLists;

    public List<String> srcLists() {
        return this.srcLists;
    }

    private GetDefaultSigninPageContentSecurityPolicySetting() {}

    private GetDefaultSigninPageContentSecurityPolicySetting(GetDefaultSigninPageContentSecurityPolicySetting $) {
        this.mode = $.mode;
        this.reportUri = $.reportUri;
        this.srcLists = $.srcLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultSigninPageContentSecurityPolicySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultSigninPageContentSecurityPolicySetting $;

        public Builder() {
            $ = new GetDefaultSigninPageContentSecurityPolicySetting();
        }

        public Builder(GetDefaultSigninPageContentSecurityPolicySetting defaults) {
            $ = new GetDefaultSigninPageContentSecurityPolicySetting(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode enforced or report_only
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        public Builder reportUri(String reportUri) {
            $.reportUri = reportUri;
            return this;
        }

        public Builder srcLists(List<String> srcLists) {
            $.srcLists = srcLists;
            return this;
        }

        public Builder srcLists(String... srcLists) {
            return srcLists(List.of(srcLists));
        }

        public GetDefaultSigninPageContentSecurityPolicySetting build() {
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "mode");
            }
            if ($.reportUri == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "reportUri");
            }
            if ($.srcLists == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageContentSecurityPolicySetting", "srcLists");
            }
            return $;
        }
    }

}