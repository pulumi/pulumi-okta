// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppGroupAssignmentsGroup {
    /**
     * @return A group to associate with the application
     * 
     */
    private String id;
    /**
     * @return Priority of group assignment
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
     * 
     */
    private String profile;

    private AppGroupAssignmentsGroup() {}
    /**
     * @return A group to associate with the application
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Priority of group assignment
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return JSON document containing [application profile](https://developer.okta.com/docs/reference/api/apps/#profile-object)
     * 
     */
    public String profile() {
        return this.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppGroupAssignmentsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer priority;
        private String profile;
        public Builder() {}
        public Builder(AppGroupAssignmentsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
    	      this.profile = defaults.profile;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("AppGroupAssignmentsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder profile(String profile) {
            if (profile == null) {
              throw new MissingRequiredPropertyException("AppGroupAssignmentsGroup", "profile");
            }
            this.profile = profile;
            return this;
        }
        public AppGroupAssignmentsGroup build() {
            final var _resultValue = new AppGroupAssignmentsGroup();
            _resultValue.id = id;
            _resultValue.priority = priority;
            _resultValue.profile = profile;
            return _resultValue;
        }
    }
}