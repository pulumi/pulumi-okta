// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEmailCustomizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEmailCustomizationArgs Empty = new GetEmailCustomizationArgs();

    /**
     * Brand ID
     * 
     */
    @Import(name="brandId", required=true)
    private Output<String> brandId;

    /**
     * @return Brand ID
     * 
     */
    public Output<String> brandId() {
        return this.brandId;
    }

    /**
     * The ID of the customization
     * 
     */
    @Import(name="customizationId", required=true)
    private Output<String> customizationId;

    /**
     * @return The ID of the customization
     * 
     */
    public Output<String> customizationId() {
        return this.customizationId;
    }

    /**
     * Template Name
     * 
     */
    @Import(name="templateName", required=true)
    private Output<String> templateName;

    /**
     * @return Template Name
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }

    private GetEmailCustomizationArgs() {}

    private GetEmailCustomizationArgs(GetEmailCustomizationArgs $) {
        this.brandId = $.brandId;
        this.customizationId = $.customizationId;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEmailCustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEmailCustomizationArgs $;

        public Builder() {
            $ = new GetEmailCustomizationArgs();
        }

        public Builder(GetEmailCustomizationArgs defaults) {
            $ = new GetEmailCustomizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brandId Brand ID
         * 
         * @return builder
         * 
         */
        public Builder brandId(Output<String> brandId) {
            $.brandId = brandId;
            return this;
        }

        /**
         * @param brandId Brand ID
         * 
         * @return builder
         * 
         */
        public Builder brandId(String brandId) {
            return brandId(Output.of(brandId));
        }

        /**
         * @param customizationId The ID of the customization
         * 
         * @return builder
         * 
         */
        public Builder customizationId(Output<String> customizationId) {
            $.customizationId = customizationId;
            return this;
        }

        /**
         * @param customizationId The ID of the customization
         * 
         * @return builder
         * 
         */
        public Builder customizationId(String customizationId) {
            return customizationId(Output.of(customizationId));
        }

        /**
         * @param templateName Template Name
         * 
         * @return builder
         * 
         */
        public Builder templateName(Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName Template Name
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public GetEmailCustomizationArgs build() {
            if ($.brandId == null) {
                throw new MissingRequiredPropertyException("GetEmailCustomizationArgs", "brandId");
            }
            if ($.customizationId == null) {
                throw new MissingRequiredPropertyException("GetEmailCustomizationArgs", "customizationId");
            }
            if ($.templateName == null) {
                throw new MissingRequiredPropertyException("GetEmailCustomizationArgs", "templateName");
            }
            return $;
        }
    }

}