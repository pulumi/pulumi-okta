// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetAppsAppVisibility;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppsApp {
    private String adminNote;
    private String created;
    private String enduserNote;
    private List<String> features;
    private String id;
    private String label;
    private String lastUpdated;
    private String name;
    private String signOnMode;
    private String status;
    private GetAppsAppVisibility visibility;

    private GetAppsApp() {}
    public String adminNote() {
        return this.adminNote;
    }
    public String created() {
        return this.created;
    }
    public String enduserNote() {
        return this.enduserNote;
    }
    public List<String> features() {
        return this.features;
    }
    public String id() {
        return this.id;
    }
    public String label() {
        return this.label;
    }
    public String lastUpdated() {
        return this.lastUpdated;
    }
    public String name() {
        return this.name;
    }
    public String signOnMode() {
        return this.signOnMode;
    }
    public String status() {
        return this.status;
    }
    public GetAppsAppVisibility visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adminNote;
        private String created;
        private String enduserNote;
        private List<String> features;
        private String id;
        private String label;
        private String lastUpdated;
        private String name;
        private String signOnMode;
        private String status;
        private GetAppsAppVisibility visibility;
        public Builder() {}
        public Builder(GetAppsApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNote = defaults.adminNote;
    	      this.created = defaults.created;
    	      this.enduserNote = defaults.enduserNote;
    	      this.features = defaults.features;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.name = defaults.name;
    	      this.signOnMode = defaults.signOnMode;
    	      this.status = defaults.status;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder adminNote(String adminNote) {
            if (adminNote == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "adminNote");
            }
            this.adminNote = adminNote;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder enduserNote(String enduserNote) {
            if (enduserNote == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "enduserNote");
            }
            this.enduserNote = enduserNote;
            return this;
        }
        @CustomType.Setter
        public Builder features(List<String> features) {
            if (features == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "features");
            }
            this.features = features;
            return this;
        }
        public Builder features(String... features) {
            return features(List.of(features));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdated(String lastUpdated) {
            if (lastUpdated == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "lastUpdated");
            }
            this.lastUpdated = lastUpdated;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder signOnMode(String signOnMode) {
            if (signOnMode == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "signOnMode");
            }
            this.signOnMode = signOnMode;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder visibility(GetAppsAppVisibility visibility) {
            if (visibility == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "visibility");
            }
            this.visibility = visibility;
            return this;
        }
        public GetAppsApp build() {
            final var _resultValue = new GetAppsApp();
            _resultValue.adminNote = adminNote;
            _resultValue.created = created;
            _resultValue.enduserNote = enduserNote;
            _resultValue.features = features;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.lastUpdated = lastUpdated;
            _resultValue.name = name;
            _resultValue.signOnMode = signOnMode;
            _resultValue.status = status;
            _resultValue.visibility = visibility;
            return _resultValue;
        }
    }
}