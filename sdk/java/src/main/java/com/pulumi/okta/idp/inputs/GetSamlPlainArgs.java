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
     * The id of the idp to retrieve, conflicts with `name`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The id of the idp to retrieve, conflicts with `name`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the idp to retrieve, conflicts with `id`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the idp to retrieve, conflicts with `id`.
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
         * @param id The id of the idp to retrieve, conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the idp to retrieve, conflicts with `id`.
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