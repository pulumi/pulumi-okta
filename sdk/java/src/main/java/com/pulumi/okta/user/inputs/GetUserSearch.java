// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserSearch extends com.pulumi.resources.InvokeArgs {

    public static final GetUserSearch Empty = new GetUserSearch();

    /**
     * Comparison to use. Comparitors for strings: [`eq`, `ge`, `gt`, `le`, `lt`, `ne`, `pr`, `sw`](https://developer.okta.com/docs/reference/core-okta-api/#operators).
     * 
     */
    @Import(name="comparison")
    private @Nullable String comparison;

    /**
     * @return Comparison to use. Comparitors for strings: [`eq`, `ge`, `gt`, `le`, `lt`, `ne`, `pr`, `sw`](https://developer.okta.com/docs/reference/core-okta-api/#operators).
     * 
     */
    public Optional<String> comparison() {
        return Optional.ofNullable(this.comparison);
    }

    /**
     * A raw search expression string. If present it will override name/comparison/value.
     * 
     */
    @Import(name="expression")
    private @Nullable String expression;

    /**
     * @return A raw search expression string. If present it will override name/comparison/value.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * Name of property to search against.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of property to search against.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value to compare with.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Value to compare with.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetUserSearch() {}

    private GetUserSearch(GetUserSearch $) {
        this.comparison = $.comparison;
        this.expression = $.expression;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserSearch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserSearch $;

        public Builder() {
            $ = new GetUserSearch();
        }

        public Builder(GetUserSearch defaults) {
            $ = new GetUserSearch(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparison Comparison to use. Comparitors for strings: [`eq`, `ge`, `gt`, `le`, `lt`, `ne`, `pr`, `sw`](https://developer.okta.com/docs/reference/core-okta-api/#operators).
         * 
         * @return builder
         * 
         */
        public Builder comparison(@Nullable String comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param expression A raw search expression string. If present it will override name/comparison/value.
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable String expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param name Name of property to search against.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Value to compare with.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetUserSearch build() {
            return $;
        }
    }

}
