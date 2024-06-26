// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final DomainCertificateState Empty = new DomainCertificateState();

    /**
     * Certificate content
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return Certificate content
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Certificate chain
     * 
     */
    @Import(name="certificateChain")
    private @Nullable Output<String> certificateChain;

    /**
     * @return Certificate chain
     * 
     */
    public Optional<Output<String>> certificateChain() {
        return Optional.ofNullable(this.certificateChain);
    }

    /**
     * Domain&#39;s ID
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    /**
     * @return Domain&#39;s ID
     * 
     */
    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * Certificate private key
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Certificate private key
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Certificate type. Valid value is `PEM`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Certificate type. Valid value is `PEM`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DomainCertificateState() {}

    private DomainCertificateState(DomainCertificateState $) {
        this.certificate = $.certificate;
        this.certificateChain = $.certificateChain;
        this.domainId = $.domainId;
        this.privateKey = $.privateKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainCertificateState $;

        public Builder() {
            $ = new DomainCertificateState();
        }

        public Builder(DomainCertificateState defaults) {
            $ = new DomainCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate Certificate content
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate Certificate content
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateChain Certificate chain
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            $.certificateChain = certificateChain;
            return this;
        }

        /**
         * @param certificateChain Certificate chain
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(String certificateChain) {
            return certificateChain(Output.of(certificateChain));
        }

        /**
         * @param domainId Domain&#39;s ID
         * 
         * @return builder
         * 
         */
        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId Domain&#39;s ID
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param privateKey Certificate private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Certificate private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param type Certificate type. Valid value is `PEM`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Certificate type. Valid value is `PEM`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainCertificateState build() {
            return $;
        }
    }

}
