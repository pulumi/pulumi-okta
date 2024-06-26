// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.idp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SamlKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SamlKeyArgs Empty = new SamlKeyArgs();

    /**
     * base64-encoded X.509 certificate chain with DER encoding
     * 
     */
    @Import(name="x5cs", required=true)
    private Output<List<String>> x5cs;

    /**
     * @return base64-encoded X.509 certificate chain with DER encoding
     * 
     */
    public Output<List<String>> x5cs() {
        return this.x5cs;
    }

    private SamlKeyArgs() {}

    private SamlKeyArgs(SamlKeyArgs $) {
        this.x5cs = $.x5cs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamlKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamlKeyArgs $;

        public Builder() {
            $ = new SamlKeyArgs();
        }

        public Builder(SamlKeyArgs defaults) {
            $ = new SamlKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param x5cs base64-encoded X.509 certificate chain with DER encoding
         * 
         * @return builder
         * 
         */
        public Builder x5cs(Output<List<String>> x5cs) {
            $.x5cs = x5cs;
            return this;
        }

        /**
         * @param x5cs base64-encoded X.509 certificate chain with DER encoding
         * 
         * @return builder
         * 
         */
        public Builder x5cs(List<String> x5cs) {
            return x5cs(Output.of(x5cs));
        }

        /**
         * @param x5cs base64-encoded X.509 certificate chain with DER encoding
         * 
         * @return builder
         * 
         */
        public Builder x5cs(String... x5cs) {
            return x5cs(List.of(x5cs));
        }

        public SamlKeyArgs build() {
            if ($.x5cs == null) {
                throw new MissingRequiredPropertyException("SamlKeyArgs", "x5cs");
            }
            return $;
        }
    }

}
