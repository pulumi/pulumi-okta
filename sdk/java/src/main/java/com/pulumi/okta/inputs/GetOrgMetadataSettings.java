// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class GetOrgMetadataSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetOrgMetadataSettings Empty = new GetOrgMetadataSettings();

    @Import(name="analyticsCollectionEnabled", required=true)
    private Boolean analyticsCollectionEnabled;

    public Boolean analyticsCollectionEnabled() {
        return this.analyticsCollectionEnabled;
    }

    @Import(name="bugReportingEnabled", required=true)
    private Boolean bugReportingEnabled;

    public Boolean bugReportingEnabled() {
        return this.bugReportingEnabled;
    }

    /**
     * Whether the legacy Okta Mobile application is enabled for the org
     * 
     */
    @Import(name="omEnabled", required=true)
    private Boolean omEnabled;

    /**
     * @return Whether the legacy Okta Mobile application is enabled for the org
     * 
     */
    public Boolean omEnabled() {
        return this.omEnabled;
    }

    private GetOrgMetadataSettings() {}

    private GetOrgMetadataSettings(GetOrgMetadataSettings $) {
        this.analyticsCollectionEnabled = $.analyticsCollectionEnabled;
        this.bugReportingEnabled = $.bugReportingEnabled;
        this.omEnabled = $.omEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrgMetadataSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrgMetadataSettings $;

        public Builder() {
            $ = new GetOrgMetadataSettings();
        }

        public Builder(GetOrgMetadataSettings defaults) {
            $ = new GetOrgMetadataSettings(Objects.requireNonNull(defaults));
        }

        public Builder analyticsCollectionEnabled(Boolean analyticsCollectionEnabled) {
            $.analyticsCollectionEnabled = analyticsCollectionEnabled;
            return this;
        }

        public Builder bugReportingEnabled(Boolean bugReportingEnabled) {
            $.bugReportingEnabled = bugReportingEnabled;
            return this;
        }

        /**
         * @param omEnabled Whether the legacy Okta Mobile application is enabled for the org
         * 
         * @return builder
         * 
         */
        public Builder omEnabled(Boolean omEnabled) {
            $.omEnabled = omEnabled;
            return this;
        }

        public GetOrgMetadataSettings build() {
            if ($.analyticsCollectionEnabled == null) {
                throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "analyticsCollectionEnabled");
            }
            if ($.bugReportingEnabled == null) {
                throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "bugReportingEnabled");
            }
            if ($.omEnabled == null) {
                throw new MissingRequiredPropertyException("GetOrgMetadataSettings", "omEnabled");
            }
            return $;
        }
    }

}