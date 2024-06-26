// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEveryoneGroupResult {
    /**
     * @return Description of group.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Fetch group users, having default off cuts down on API calls.
     * 
     */
    private @Nullable Boolean includeUsers;

    private GetEveryoneGroupResult() {}
    /**
     * @return Description of group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Fetch group users, having default off cuts down on API calls.
     * 
     */
    public Optional<Boolean> includeUsers() {
        return Optional.ofNullable(this.includeUsers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEveryoneGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private @Nullable Boolean includeUsers;
        public Builder() {}
        public Builder(GetEveryoneGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.includeUsers = defaults.includeUsers;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetEveryoneGroupResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEveryoneGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeUsers(@Nullable Boolean includeUsers) {

            this.includeUsers = includeUsers;
            return this;
        }
        public GetEveryoneGroupResult build() {
            final var _resultValue = new GetEveryoneGroupResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.includeUsers = includeUsers;
            return _resultValue;
        }
    }
}
