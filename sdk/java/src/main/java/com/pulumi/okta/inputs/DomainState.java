// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.okta.inputs.DomainDnsRecordArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Certificate source type that indicates whether the certificate is provided by the user or Okta. Accepted values: `MANUAL`, `OKTA_MANAGED`. Default value = `MANUAL`
     * 
     */
    @Import(name="certificateSourceType")
    private @Nullable Output<String> certificateSourceType;

    /**
     * @return Certificate source type that indicates whether the certificate is provided by the user or Okta. Accepted values: `MANUAL`, `OKTA_MANAGED`. Default value = `MANUAL`
     * 
     */
    public Optional<Output<String>> certificateSourceType() {
        return Optional.ofNullable(this.certificateSourceType);
    }

    /**
     * TXT and CNAME records to be registered for the Domain.
     * 
     */
    @Import(name="dnsRecords")
    private @Nullable Output<List<DomainDnsRecordArgs>> dnsRecords;

    /**
     * @return TXT and CNAME records to be registered for the Domain.
     * 
     */
    public Optional<Output<List<DomainDnsRecordArgs>>> dnsRecords() {
        return Optional.ofNullable(this.dnsRecords);
    }

    /**
     * Custom Domain name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Custom Domain name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Status of the domain.
     * 
     */
    @Import(name="validationStatus")
    private @Nullable Output<String> validationStatus;

    /**
     * @return Status of the domain.
     * 
     */
    public Optional<Output<String>> validationStatus() {
        return Optional.ofNullable(this.validationStatus);
    }

    /**
     * Indicates whether the domain should be verified.
     * - `DEPRECATED`: Please use `okta.DomainVerification` resource instead.
     * 
     * @deprecated
     * The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality.
     * 
     */
    @Deprecated /* The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality. */
    @Import(name="verify")
    private @Nullable Output<Boolean> verify;

    /**
     * @return Indicates whether the domain should be verified.
     * - `DEPRECATED`: Please use `okta.DomainVerification` resource instead.
     * 
     * @deprecated
     * The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality.
     * 
     */
    @Deprecated /* The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality. */
    public Optional<Output<Boolean>> verify() {
        return Optional.ofNullable(this.verify);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.certificateSourceType = $.certificateSourceType;
        this.dnsRecords = $.dnsRecords;
        this.name = $.name;
        this.validationStatus = $.validationStatus;
        this.verify = $.verify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateSourceType Certificate source type that indicates whether the certificate is provided by the user or Okta. Accepted values: `MANUAL`, `OKTA_MANAGED`. Default value = `MANUAL`
         * 
         * @return builder
         * 
         */
        public Builder certificateSourceType(@Nullable Output<String> certificateSourceType) {
            $.certificateSourceType = certificateSourceType;
            return this;
        }

        /**
         * @param certificateSourceType Certificate source type that indicates whether the certificate is provided by the user or Okta. Accepted values: `MANUAL`, `OKTA_MANAGED`. Default value = `MANUAL`
         * 
         * @return builder
         * 
         */
        public Builder certificateSourceType(String certificateSourceType) {
            return certificateSourceType(Output.of(certificateSourceType));
        }

        /**
         * @param dnsRecords TXT and CNAME records to be registered for the Domain.
         * 
         * @return builder
         * 
         */
        public Builder dnsRecords(@Nullable Output<List<DomainDnsRecordArgs>> dnsRecords) {
            $.dnsRecords = dnsRecords;
            return this;
        }

        /**
         * @param dnsRecords TXT and CNAME records to be registered for the Domain.
         * 
         * @return builder
         * 
         */
        public Builder dnsRecords(List<DomainDnsRecordArgs> dnsRecords) {
            return dnsRecords(Output.of(dnsRecords));
        }

        /**
         * @param dnsRecords TXT and CNAME records to be registered for the Domain.
         * 
         * @return builder
         * 
         */
        public Builder dnsRecords(DomainDnsRecordArgs... dnsRecords) {
            return dnsRecords(List.of(dnsRecords));
        }

        /**
         * @param name Custom Domain name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom Domain name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param validationStatus Status of the domain.
         * 
         * @return builder
         * 
         */
        public Builder validationStatus(@Nullable Output<String> validationStatus) {
            $.validationStatus = validationStatus;
            return this;
        }

        /**
         * @param validationStatus Status of the domain.
         * 
         * @return builder
         * 
         */
        public Builder validationStatus(String validationStatus) {
            return validationStatus(Output.of(validationStatus));
        }

        /**
         * @param verify Indicates whether the domain should be verified.
         * - `DEPRECATED`: Please use `okta.DomainVerification` resource instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality.
         * 
         */
        @Deprecated /* The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality. */
        public Builder verify(@Nullable Output<Boolean> verify) {
            $.verify = verify;
            return this;
        }

        /**
         * @param verify Indicates whether the domain should be verified.
         * - `DEPRECATED`: Please use `okta.DomainVerification` resource instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality.
         * 
         */
        @Deprecated /* The direct validation for the domain resource is deprecated, please use the `okta_domain_verification` resource for this functionality. */
        public Builder verify(Boolean verify) {
            return verify(Output.of(verify));
        }

        public DomainState build() {
            return $;
        }
    }

}