// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.deprecated.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultPoliciesPlainArgs Empty = new GetDefaultPoliciesPlainArgs();

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetDefaultPoliciesPlainArgs() {}

    private GetDefaultPoliciesPlainArgs(GetDefaultPoliciesPlainArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultPoliciesPlainArgs $;

        public Builder() {
            $ = new GetDefaultPoliciesPlainArgs();
        }

        public Builder(GetDefaultPoliciesPlainArgs defaults) {
            $ = new GetDefaultPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetDefaultPoliciesPlainArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}