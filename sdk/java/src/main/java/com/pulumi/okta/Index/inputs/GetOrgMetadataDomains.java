// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrgMetadataDomains extends com.pulumi.resources.InvokeArgs {

    public static final GetOrgMetadataDomains Empty = new GetOrgMetadataDomains();

    /**
     * Custom Domain Org URI
     * 
     */
    @Import(name="alternate", required=true)
    private String alternate;

    /**
     * @return Custom Domain Org URI
     * 
     */
    public String alternate() {
        return this.alternate;
    }

    /**
     * Standard Org URI
     * 
     */
    @Import(name="organization", required=true)
    private String organization;

    /**
     * @return Standard Org URI
     * 
     */
    public String organization() {
        return this.organization;
    }

    private GetOrgMetadataDomains() {}

    private GetOrgMetadataDomains(GetOrgMetadataDomains $) {
        this.alternate = $.alternate;
        this.organization = $.organization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrgMetadataDomains defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrgMetadataDomains $;

        public Builder() {
            $ = new GetOrgMetadataDomains();
        }

        public Builder(GetOrgMetadataDomains defaults) {
            $ = new GetOrgMetadataDomains(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternate Custom Domain Org URI
         * 
         * @return builder
         * 
         */
        public Builder alternate(String alternate) {
            $.alternate = alternate;
            return this;
        }

        /**
         * @param organization Standard Org URI
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            $.organization = organization;
            return this;
        }

        public GetOrgMetadataDomains build() {
            $.alternate = Objects.requireNonNull($.alternate, "expected parameter 'alternate' to be non-null");
            $.organization = Objects.requireNonNull($.organization, "expected parameter 'organization' to be non-null");
            return $;
        }
    }

}