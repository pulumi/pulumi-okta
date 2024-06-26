// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUserSecurityQuestionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserSecurityQuestionsArgs Empty = new GetUserSecurityQuestionsArgs();

    /**
     * ID of a Okta User
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return ID of a Okta User
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private GetUserSecurityQuestionsArgs() {}

    private GetUserSecurityQuestionsArgs(GetUserSecurityQuestionsArgs $) {
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserSecurityQuestionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserSecurityQuestionsArgs $;

        public Builder() {
            $ = new GetUserSecurityQuestionsArgs();
        }

        public Builder(GetUserSecurityQuestionsArgs defaults) {
            $ = new GetUserSecurityQuestionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userId ID of a Okta User
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of a Okta User
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetUserSecurityQuestionsArgs build() {
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetUserSecurityQuestionsArgs", "userId");
            }
            return $;
        }
    }

}
