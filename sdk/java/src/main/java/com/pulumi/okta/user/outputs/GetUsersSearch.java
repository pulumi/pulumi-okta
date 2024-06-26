// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUsersSearch {
    private @Nullable String comparison;
    /**
     * @return A raw search expression string. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
     * 
     */
    private @Nullable String expression;
    /**
     * @return Property name to search for. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
     * 
     */
    private @Nullable String name;
    private @Nullable String value;

    private GetUsersSearch() {}
    public Optional<String> comparison() {
        return Optional.ofNullable(this.comparison);
    }
    /**
     * @return A raw search expression string. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Property name to search for. This requires the search feature be on. Please see Okta documentation on their filter API for users. https://developer.okta.com/docs/api/resources/users#list-users-with-search
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersSearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparison;
        private @Nullable String expression;
        private @Nullable String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetUsersSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder comparison(@Nullable String comparison) {

            this.comparison = comparison;
            return this;
        }
        @CustomType.Setter
        public Builder expression(@Nullable String expression) {

            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetUsersSearch build() {
            final var _resultValue = new GetUsersSearch();
            _resultValue.comparison = comparison;
            _resultValue.expression = expression;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
