// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.auth.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    /**
     * The name of the auth server to retrieve.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the auth server to retrieve.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetServerArgs() {}

    private GetServerArgs(GetServerArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerArgs $;

        public Builder() {
            $ = new GetServerArgs();
        }

        public Builder(GetServerArgs defaults) {
            $ = new GetServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the auth server to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the auth server to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetServerArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetServerArgs", "name");
            }
            return $;
        }
    }

}
