// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOrgMetadataDomainsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetOrgMetadataDomainsArgs Empty = new GetOrgMetadataDomainsArgs();

    /**
     * Custom Domain Org URI
     * 
     */
    @Import(name="alternate", required=true)
    private Output<String> alternate;

    /**
     * @return Custom Domain Org URI
     * 
     */
    public Output<String> alternate() {
        return this.alternate;
    }

    /**
     * Standard Org URI
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    /**
     * @return Standard Org URI
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    private GetOrgMetadataDomainsArgs() {}

    private GetOrgMetadataDomainsArgs(GetOrgMetadataDomainsArgs $) {
        this.alternate = $.alternate;
        this.organization = $.organization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrgMetadataDomainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrgMetadataDomainsArgs $;

        public Builder() {
            $ = new GetOrgMetadataDomainsArgs();
        }

        public Builder(GetOrgMetadataDomainsArgs defaults) {
            $ = new GetOrgMetadataDomainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternate Custom Domain Org URI
         * 
         * @return builder
         * 
         */
        public Builder alternate(Output<String> alternate) {
            $.alternate = alternate;
            return this;
        }

        /**
         * @param alternate Custom Domain Org URI
         * 
         * @return builder
         * 
         */
        public Builder alternate(String alternate) {
            return alternate(Output.of(alternate));
        }

        /**
         * @param organization Standard Org URI
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Standard Org URI
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public GetOrgMetadataDomainsArgs build() {
            if ($.alternate == null) {
                throw new MissingRequiredPropertyException("GetOrgMetadataDomainsArgs", "alternate");
            }
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("GetOrgMetadataDomainsArgs", "organization");
            }
            return $;
        }
    }

}