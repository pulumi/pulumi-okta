// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppUserAssignmentsResult {
    /**
     * @return ID of the Okta App being queried for groups
     * 
     */
    private String id;
    /**
     * @return List of user IDs assigned to the app
     * 
     */
    private List<String> users;

    private GetAppUserAssignmentsResult() {}
    /**
     * @return ID of the Okta App being queried for groups
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of user IDs assigned to the app
     * 
     */
    public List<String> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppUserAssignmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> users;
        public Builder() {}
        public Builder(GetAppUserAssignmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppUserAssignmentsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<String> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("GetAppUserAssignmentsResult", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public GetAppUserAssignmentsResult build() {
            final var _resultValue = new GetAppUserAssignmentsResult();
            _resultValue.id = id;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}