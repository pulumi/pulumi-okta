// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.idp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSamlPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSamlPlainArgs Empty = new GetSamlPlainArgs();

    /**
     * Id of idp.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Id of idp.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the idp.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the idp.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSamlPlainArgs() {}

    private GetSamlPlainArgs(GetSamlPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSamlPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSamlPlainArgs $;

        public Builder() {
            $ = new GetSamlPlainArgs();
        }

        public Builder(GetSamlPlainArgs defaults) {
            $ = new GetSamlPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of idp.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Name of the idp.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetSamlPlainArgs build() {
            return $;
        }
    }

}