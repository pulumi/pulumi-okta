// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetAppsApp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsResult {
    /**
     * @return Search only active applications.
     * 
     */
    private @Nullable Boolean activeOnly;
    /**
     * @return The list of applications that match the search criteria.
     * 
     */
    private List<GetAppsApp> apps;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Specifies whether to include non-active, but not deleted apps in the results.
     * 
     */
    private @Nullable Boolean includeNonDeleted;
    /**
     * @return Searches for applications whose label or name property matches this value exactly.
     * 
     */
    private @Nullable String label;
    /**
     * @return Searches for applications whose label or name property begins with this value.
     * 
     */
    private @Nullable String labelPrefix;
    /**
     * @return Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
     * 
     */
    private @Nullable Boolean useOptimization;

    private GetAppsResult() {}
    /**
     * @return Search only active applications.
     * 
     */
    public Optional<Boolean> activeOnly() {
        return Optional.ofNullable(this.activeOnly);
    }
    /**
     * @return The list of applications that match the search criteria.
     * 
     */
    public List<GetAppsApp> apps() {
        return this.apps;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies whether to include non-active, but not deleted apps in the results.
     * 
     */
    public Optional<Boolean> includeNonDeleted() {
        return Optional.ofNullable(this.includeNonDeleted);
    }
    /**
     * @return Searches for applications whose label or name property matches this value exactly.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Searches for applications whose label or name property begins with this value.
     * 
     */
    public Optional<String> labelPrefix() {
        return Optional.ofNullable(this.labelPrefix);
    }
    /**
     * @return Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
     * 
     */
    public Optional<Boolean> useOptimization() {
        return Optional.ofNullable(this.useOptimization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean activeOnly;
        private List<GetAppsApp> apps;
        private String id;
        private @Nullable Boolean includeNonDeleted;
        private @Nullable String label;
        private @Nullable String labelPrefix;
        private @Nullable Boolean useOptimization;
        public Builder() {}
        public Builder(GetAppsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeOnly = defaults.activeOnly;
    	      this.apps = defaults.apps;
    	      this.id = defaults.id;
    	      this.includeNonDeleted = defaults.includeNonDeleted;
    	      this.label = defaults.label;
    	      this.labelPrefix = defaults.labelPrefix;
    	      this.useOptimization = defaults.useOptimization;
        }

        @CustomType.Setter
        public Builder activeOnly(@Nullable Boolean activeOnly) {

            this.activeOnly = activeOnly;
            return this;
        }
        @CustomType.Setter
        public Builder apps(List<GetAppsApp> apps) {
            if (apps == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "apps");
            }
            this.apps = apps;
            return this;
        }
        public Builder apps(GetAppsApp... apps) {
            return apps(List.of(apps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeNonDeleted(@Nullable Boolean includeNonDeleted) {

            this.includeNonDeleted = includeNonDeleted;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder labelPrefix(@Nullable String labelPrefix) {

            this.labelPrefix = labelPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder useOptimization(@Nullable Boolean useOptimization) {

            this.useOptimization = useOptimization;
            return this;
        }
        public GetAppsResult build() {
            final var _resultValue = new GetAppsResult();
            _resultValue.activeOnly = activeOnly;
            _resultValue.apps = apps;
            _resultValue.id = id;
            _resultValue.includeNonDeleted = includeNonDeleted;
            _resultValue.label = label;
            _resultValue.labelPrefix = labelPrefix;
            _resultValue.useOptimization = useOptimization;
            return _resultValue;
        }
    }
}