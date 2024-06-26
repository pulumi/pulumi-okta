// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EmailDomainVerificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailDomainVerificationArgs Empty = new EmailDomainVerificationArgs();

    /**
     * Email domain ID
     * 
     */
    @Import(name="emailDomainId", required=true)
    private Output<String> emailDomainId;

    /**
     * @return Email domain ID
     * 
     */
    public Output<String> emailDomainId() {
        return this.emailDomainId;
    }

    private EmailDomainVerificationArgs() {}

    private EmailDomainVerificationArgs(EmailDomainVerificationArgs $) {
        this.emailDomainId = $.emailDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailDomainVerificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailDomainVerificationArgs $;

        public Builder() {
            $ = new EmailDomainVerificationArgs();
        }

        public Builder(EmailDomainVerificationArgs defaults) {
            $ = new EmailDomainVerificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailDomainId Email domain ID
         * 
         * @return builder
         * 
         */
        public Builder emailDomainId(Output<String> emailDomainId) {
            $.emailDomainId = emailDomainId;
            return this;
        }

        /**
         * @param emailDomainId Email domain ID
         * 
         * @return builder
         * 
         */
        public Builder emailDomainId(String emailDomainId) {
            return emailDomainId(Output.of(emailDomainId));
        }

        public EmailDomainVerificationArgs build() {
            if ($.emailDomainId == null) {
                throw new MissingRequiredPropertyException("EmailDomainVerificationArgs", "emailDomainId");
            }
            return $;
        }
    }

}
