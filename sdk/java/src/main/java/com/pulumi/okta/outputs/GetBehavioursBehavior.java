// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBehavioursBehavior {
    /**
     * @return Behavior ID.
     * 
     */
    private String id;
    /**
     * @return Behavior name.
     * 
     */
    private String name;
    /**
     * @return Map of behavior settings.
     * 
     */
    private Map<String,String> settings;
    /**
     * @return Behavior status.
     * 
     */
    private String status;
    /**
     * @return Behavior type.
     * 
     */
    private String type;

    private GetBehavioursBehavior() {}
    /**
     * @return Behavior ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Behavior name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Map of behavior settings.
     * 
     */
    public Map<String,String> settings() {
        return this.settings;
    }
    /**
     * @return Behavior status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Behavior type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBehavioursBehavior defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private Map<String,String> settings;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetBehavioursBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.settings = defaults.settings;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBehavioursBehavior", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetBehavioursBehavior", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder settings(Map<String,String> settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetBehavioursBehavior", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetBehavioursBehavior", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetBehavioursBehavior", "type");
            }
            this.type = type;
            return this;
        }
        public GetBehavioursBehavior build() {
            final var _resultValue = new GetBehavioursBehavior();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.settings = settings;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}