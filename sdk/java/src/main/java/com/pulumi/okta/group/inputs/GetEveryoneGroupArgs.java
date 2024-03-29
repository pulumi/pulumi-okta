// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEveryoneGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEveryoneGroupArgs Empty = new GetEveryoneGroupArgs();

    /**
     * whether to retrieve all member ids.
     * 
     */
    @Import(name="includeUsers")
    private @Nullable Output<Boolean> includeUsers;

    /**
     * @return whether to retrieve all member ids.
     * 
     */
    public Optional<Output<Boolean>> includeUsers() {
        return Optional.ofNullable(this.includeUsers);
    }

    private GetEveryoneGroupArgs() {}

    private GetEveryoneGroupArgs(GetEveryoneGroupArgs $) {
        this.includeUsers = $.includeUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEveryoneGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEveryoneGroupArgs $;

        public Builder() {
            $ = new GetEveryoneGroupArgs();
        }

        public Builder(GetEveryoneGroupArgs defaults) {
            $ = new GetEveryoneGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeUsers whether to retrieve all member ids.
         * 
         * @return builder
         * 
         */
        public Builder includeUsers(@Nullable Output<Boolean> includeUsers) {
            $.includeUsers = includeUsers;
            return this;
        }

        /**
         * @param includeUsers whether to retrieve all member ids.
         * 
         * @return builder
         * 
         */
        public Builder includeUsers(Boolean includeUsers) {
            return includeUsers(Output.of(includeUsers));
        }

        public GetEveryoneGroupArgs build() {
            return $;
        }
    }

}
