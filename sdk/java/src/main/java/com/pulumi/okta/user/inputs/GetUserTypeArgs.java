// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUserTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserTypeArgs Empty = new GetUserTypeArgs();

    /**
     * Name of user type to retrieve.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of user type to retrieve.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetUserTypeArgs() {}

    private GetUserTypeArgs(GetUserTypeArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserTypeArgs $;

        public Builder() {
            $ = new GetUserTypeArgs();
        }

        public Builder(GetUserTypeArgs defaults) {
            $ = new GetUserTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of user type to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of user type to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetUserTypeArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetUserTypeArgs", "name");
            }
            return $;
        }
    }

}
