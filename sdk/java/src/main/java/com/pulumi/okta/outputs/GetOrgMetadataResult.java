// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.outputs.GetOrgMetadataDomains;
import com.pulumi.okta.outputs.GetOrgMetadataSettings;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrgMetadataResult {
    /**
     * @return The URIs for the org&#39;s configured domains.
     * 
     */
    private @Nullable GetOrgMetadataDomains domains;
    /**
     * @return The unique identifier of the Org.
     * 
     */
    private String id;
    /**
     * @return The authentication pipeline of the org. idx means the org is using the Identity Engine, while v1 means the org is using the Classic authentication pipeline.
     * 
     */
    private String pipeline;
    /**
     * @return The wellknown org settings (safe for public consumption).
     * 
     */
    private @Nullable GetOrgMetadataSettings settings;

    private GetOrgMetadataResult() {}
    /**
     * @return The URIs for the org&#39;s configured domains.
     * 
     */
    public Optional<GetOrgMetadataDomains> domains() {
        return Optional.ofNullable(this.domains);
    }
    /**
     * @return The unique identifier of the Org.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The authentication pipeline of the org. idx means the org is using the Identity Engine, while v1 means the org is using the Classic authentication pipeline.
     * 
     */
    public String pipeline() {
        return this.pipeline;
    }
    /**
     * @return The wellknown org settings (safe for public consumption).
     * 
     */
    public Optional<GetOrgMetadataSettings> settings() {
        return Optional.ofNullable(this.settings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrgMetadataResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetOrgMetadataDomains domains;
        private String id;
        private String pipeline;
        private @Nullable GetOrgMetadataSettings settings;
        public Builder() {}
        public Builder(GetOrgMetadataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.id = defaults.id;
    	      this.pipeline = defaults.pipeline;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder domains(@Nullable GetOrgMetadataDomains domains) {

            this.domains = domains;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrgMetadataResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pipeline(String pipeline) {
            if (pipeline == null) {
              throw new MissingRequiredPropertyException("GetOrgMetadataResult", "pipeline");
            }
            this.pipeline = pipeline;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable GetOrgMetadataSettings settings) {

            this.settings = settings;
            return this;
        }
        public GetOrgMetadataResult build() {
            final var _resultValue = new GetOrgMetadataResult();
            _resultValue.domains = domains;
            _resultValue.id = id;
            _resultValue.pipeline = pipeline;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
