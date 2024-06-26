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
     * Searches the name property of behaviors for matching value
     * 
     */
    @Import(name="q")
    private @Nullable String q;

    /**
     * @return Searches the name property of behaviors for matching value
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
         * @param q Searches the name property of behaviors for matching value
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
