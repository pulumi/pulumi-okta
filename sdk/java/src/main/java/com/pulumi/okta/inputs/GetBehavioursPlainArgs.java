// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBehavioursPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBehavioursPlainArgs Empty = new GetBehavioursPlainArgs();

    /**
     * Searches query to look up behaviors.
     * 
     */
    @Import(name="q")
    private @Nullable String q;

    /**
     * @return Searches query to look up behaviors.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }

    private GetBehavioursPlainArgs() {}

    private GetBehavioursPlainArgs(GetBehavioursPlainArgs $) {
        this.q = $.q;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBehavioursPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBehavioursPlainArgs $;

        public Builder() {
            $ = new GetBehavioursPlainArgs();
        }

        public Builder(GetBehavioursPlainArgs defaults) {
            $ = new GetBehavioursPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param q Searches query to look up behaviors.
         * 
         * @return builder
         * 
         */
        public Builder q(@Nullable String q) {
            $.q = q;
            return this;
        }

        public GetBehavioursPlainArgs build() {
            return $;
        }
    }

}