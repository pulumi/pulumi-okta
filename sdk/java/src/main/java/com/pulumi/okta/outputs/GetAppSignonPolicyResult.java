// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppSignonPolicyResult {
    /**
     * @return App ID
     * 
     */
    private String appId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Policy name
     * 
     */
    private String name;

    private GetAppSignonPolicyResult() {}
    /**
     * @return App ID
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Policy name
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSignonPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetAppSignonPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            if (appId == null) {
              throw new MissingRequiredPropertyException("GetAppSignonPolicyResult", "appId");
            }
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSignonPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppSignonPolicyResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetAppSignonPolicyResult build() {
            final var _resultValue = new GetAppSignonPolicyResult();
            _resultValue.appId = appId;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}