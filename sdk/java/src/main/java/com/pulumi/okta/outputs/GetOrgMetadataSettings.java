// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetOrgMetadataSettings {
    private Boolean analyticsCollectionEnabled;
    private Boolean bugReportingEnabled;
    /**
     * @return Whether the legacy Okta Mobile application is enabled for the org
     * 
     */
    private Boolean omEnabled;

    private GetOrgMetadataSettings() {}
    public Boolean analyticsCollectionEnabled() {
        return this.analyticsCollectionEnabled;
    }
    public Boolean bugReportingEnabled() {
        return this.bugReportingEnabled;
    }
    /**
     * @return Whether the legacy Okta Mobile application is enabled for the org
     * 
     */
    public Boolean omEnabled() {
        return this.omEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrgMetadataSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean analyticsCollectionEnabled;
        private Boolean bugReportingEnabled;
        private Boolean omEnabled;
        public Builder() {}
        public Builder(GetOrgMetadataSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsCollectionEnabled = defaults.analyticsCollectionEnabled;
    	      this.bugReportingEnabled = defaults.bugReportingEnabled;
    	      this.omEnabled = defaults.omEnabled;
        }

        @CustomType.Setter
        public Builder analyticsCollectionEnabled(Boolean analyticsCollectionEnabled) {
            if (analyticsCollectionEnabled == null) {
              throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "analyticsCollectionEnabled");
            }
            this.analyticsCollectionEnabled = analyticsCollectionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder bugReportingEnabled(Boolean bugReportingEnabled) {
            if (bugReportingEnabled == null) {
              throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "bugReportingEnabled");
            }
            this.bugReportingEnabled = bugReportingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder omEnabled(Boolean omEnabled) {
            if (omEnabled == null) {
              throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "omEnabled");
            }
            this.omEnabled = omEnabled;
            return this;
        }
        public GetOrgMetadataSettings build() {
            final var _resultValue = new GetOrgMetadataSettings();
            _resultValue.analyticsCollectionEnabled = analyticsCollectionEnabled;
            _resultValue.bugReportingEnabled = bugReportingEnabled;
            _resultValue.omEnabled = omEnabled;
            return _resultValue;
        }
    }
}