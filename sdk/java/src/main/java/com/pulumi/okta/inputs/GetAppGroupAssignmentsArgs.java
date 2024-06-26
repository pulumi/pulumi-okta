// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAppGroupAssignmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppGroupAssignmentsArgs Empty = new GetAppGroupAssignmentsArgs();

    /**
     * ID of the Okta App being queried for groups
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the Okta App being queried for groups
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetAppGroupAssignmentsArgs() {}

    private GetAppGroupAssignmentsArgs(GetAppGroupAssignmentsArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppGroupAssignmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppGroupAssignmentsArgs $;

        public Builder() {
            $ = new GetAppGroupAssignmentsArgs();
        }

        public Builder(GetAppGroupAssignmentsArgs defaults) {
            $ = new GetAppGroupAssignmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the Okta App being queried for groups
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Okta App being queried for groups
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetAppGroupAssignmentsArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetAppGroupAssignmentsArgs", "id");
            }
            return $;
        }
    }

}
