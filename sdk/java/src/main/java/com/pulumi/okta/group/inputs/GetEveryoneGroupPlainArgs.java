// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEveryoneGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEveryoneGroupPlainArgs Empty = new GetEveryoneGroupPlainArgs();

    /**
     * Fetch group users, having default off cuts down on API calls.
     * 
     */
    @Import(name="includeUsers")
    private @Nullable Boolean includeUsers;

    /**
     * @return Fetch group users, having default off cuts down on API calls.
     * 
     */
    public Optional<Boolean> includeUsers() {
        return Optional.ofNullable(this.includeUsers);
    }

    private GetEveryoneGroupPlainArgs() {}

    private GetEveryoneGroupPlainArgs(GetEveryoneGroupPlainArgs $) {
        this.includeUsers = $.includeUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEveryoneGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEveryoneGroupPlainArgs $;

        public Builder() {
            $ = new GetEveryoneGroupPlainArgs();
        }

        public Builder(GetEveryoneGroupPlainArgs defaults) {
            $ = new GetEveryoneGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeUsers Fetch group users, having default off cuts down on API calls.
         * 
         * @return builder
         * 
         */
        public Builder includeUsers(@Nullable Boolean includeUsers) {
            $.includeUsers = includeUsers;
            return this;
        }

        public GetEveryoneGroupPlainArgs build() {
            return $;
        }
    }

}
