// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetLogStreamSettings;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLogStreamResult {
    /**
     * @return ID of the log stream.
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the log stream.
     * 
     */
    private @Nullable String name;
    /**
     * @return Provider specific configuration.
     * 
     */
    private @Nullable GetLogStreamSettings settings;
    /**
     * @return Log Stream Status - can either be ACTIVE or INACTIVE only.
     * 
     */
    private String status;
    /**
     * @return Type of the Log Stream.
     * 
     */
    private String type;

    private GetLogStreamResult() {}
    /**
     * @return ID of the log stream.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the log stream.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Provider specific configuration.
     * 
     */
    public Optional<GetLogStreamSettings> settings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * @return Log Stream Status - can either be ACTIVE or INACTIVE only.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type of the Log Stream.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogStreamResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable GetLogStreamSettings settings;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetLogStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.settings = defaults.settings;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable GetLogStreamSettings settings) {

            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLogStreamResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetLogStreamResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetLogStreamResult build() {
            final var _resultValue = new GetLogStreamResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.settings = settings;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}