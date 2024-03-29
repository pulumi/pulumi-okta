// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTemplatesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplatesPlainArgs Empty = new GetTemplatesPlainArgs();

    /**
     * Brand ID
     * 
     */
    @Import(name="brandId", required=true)
    private String brandId;

    /**
     * @return Brand ID
     * 
     */
    public String brandId() {
        return this.brandId;
    }

    private GetTemplatesPlainArgs() {}

    private GetTemplatesPlainArgs(GetTemplatesPlainArgs $) {
        this.brandId = $.brandId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplatesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplatesPlainArgs $;

        public Builder() {
            $ = new GetTemplatesPlainArgs();
        }

        public Builder(GetTemplatesPlainArgs defaults) {
            $ = new GetTemplatesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brandId Brand ID
         * 
         * @return builder
         * 
         */
        public Builder brandId(String brandId) {
            $.brandId = brandId;
            return this;
        }

        public GetTemplatesPlainArgs build() {
            if ($.brandId == null) {
                throw new MissingRequiredPropertyException("GetTemplatesPlainArgs", "brandId");
            }
            return $;
        }
    }

}
