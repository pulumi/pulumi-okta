// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainPlainArgs Empty = new GetDomainPlainArgs();

    /**
     * The Okta ID of the domain or the domain name itself.
     * 
     */
    @Import(name="domainIdOrName", required=true)
    private String domainIdOrName;

    /**
     * @return The Okta ID of the domain or the domain name itself.
     * 
     */
    public String domainIdOrName() {
        return this.domainIdOrName;
    }

    private GetDomainPlainArgs() {}

    private GetDomainPlainArgs(GetDomainPlainArgs $) {
        this.domainIdOrName = $.domainIdOrName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainPlainArgs $;

        public Builder() {
            $ = new GetDomainPlainArgs();
        }

        public Builder(GetDomainPlainArgs defaults) {
            $ = new GetDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainIdOrName The Okta ID of the domain or the domain name itself.
         * 
         * @return builder
         * 
         */
        public Builder domainIdOrName(String domainIdOrName) {
            $.domainIdOrName = domainIdOrName;
            return this;
        }

        public GetDomainPlainArgs build() {
            if ($.domainIdOrName == null) {
                throw new MissingRequiredPropertyException("GetDomainPlainArgs", "domainIdOrName");
            }
            return $;
        }
    }

}
