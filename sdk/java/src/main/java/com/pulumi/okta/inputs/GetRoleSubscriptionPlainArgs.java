// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRoleSubscriptionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleSubscriptionPlainArgs Empty = new GetRoleSubscriptionPlainArgs();

    /**
     * Type of the notification. Valid values: `&#34;CONNECTOR_AGENT&#34;`, `&#34;USER_LOCKED_OUT&#34;`,
     * `&#34;APP_IMPORT&#34;`, `&#34;LDAP_AGENT&#34;`, `&#34;AD_AGENT&#34;`, `&#34;OKTA_ANNOUNCEMENT&#34;`, `&#34;OKTA_ISSUE&#34;`, `&#34;OKTA_UPDATE&#34;`, `&#34;IWA_AGENT&#34;`,
     * `&#34;USER_DEPROVISION&#34;`, `&#34;REPORT_SUSPICIOUS_ACTIVITY&#34;`, `&#34;RATELIMIT_NOTIFICATION&#34;`.
     * 
     */
    @Import(name="notificationType", required=true)
    private String notificationType;

    /**
     * @return Type of the notification. Valid values: `&#34;CONNECTOR_AGENT&#34;`, `&#34;USER_LOCKED_OUT&#34;`,
     * `&#34;APP_IMPORT&#34;`, `&#34;LDAP_AGENT&#34;`, `&#34;AD_AGENT&#34;`, `&#34;OKTA_ANNOUNCEMENT&#34;`, `&#34;OKTA_ISSUE&#34;`, `&#34;OKTA_UPDATE&#34;`, `&#34;IWA_AGENT&#34;`,
     * `&#34;USER_DEPROVISION&#34;`, `&#34;REPORT_SUSPICIOUS_ACTIVITY&#34;`, `&#34;RATELIMIT_NOTIFICATION&#34;`.
     * 
     */
    public String notificationType() {
        return this.notificationType;
    }

    /**
     * Type of the role. Valid values:
     * `&#34;API_ADMIN&#34;`,
     * `&#34;APP_ADMIN&#34;`,
     * `&#34;CUSTOM&#34;`,
     * `&#34;GROUP_MEMBERSHIP_ADMIN&#34;`,
     * `&#34;HELP_DESK_ADMIN&#34;`,
     * `&#34;MOBILE_ADMIN&#34;`,
     * `&#34;ORG_ADMIN&#34;`,
     * `&#34;READ_ONLY_ADMIN&#34;`,
     * `&#34;REPORT_ADMIN&#34;`,
     * `&#34;SUPER_ADMIN&#34;`,
     * `&#34;USER_ADMIN&#34;`
     * .
     * 
     */
    @Import(name="roleType", required=true)
    private String roleType;

    /**
     * @return Type of the role. Valid values:
     * `&#34;API_ADMIN&#34;`,
     * `&#34;APP_ADMIN&#34;`,
     * `&#34;CUSTOM&#34;`,
     * `&#34;GROUP_MEMBERSHIP_ADMIN&#34;`,
     * `&#34;HELP_DESK_ADMIN&#34;`,
     * `&#34;MOBILE_ADMIN&#34;`,
     * `&#34;ORG_ADMIN&#34;`,
     * `&#34;READ_ONLY_ADMIN&#34;`,
     * `&#34;REPORT_ADMIN&#34;`,
     * `&#34;SUPER_ADMIN&#34;`,
     * `&#34;USER_ADMIN&#34;`
     * .
     * 
     */
    public String roleType() {
        return this.roleType;
    }

    private GetRoleSubscriptionPlainArgs() {}

    private GetRoleSubscriptionPlainArgs(GetRoleSubscriptionPlainArgs $) {
        this.notificationType = $.notificationType;
        this.roleType = $.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleSubscriptionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleSubscriptionPlainArgs $;

        public Builder() {
            $ = new GetRoleSubscriptionPlainArgs();
        }

        public Builder(GetRoleSubscriptionPlainArgs defaults) {
            $ = new GetRoleSubscriptionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param notificationType Type of the notification. Valid values: `&#34;CONNECTOR_AGENT&#34;`, `&#34;USER_LOCKED_OUT&#34;`,
         * `&#34;APP_IMPORT&#34;`, `&#34;LDAP_AGENT&#34;`, `&#34;AD_AGENT&#34;`, `&#34;OKTA_ANNOUNCEMENT&#34;`, `&#34;OKTA_ISSUE&#34;`, `&#34;OKTA_UPDATE&#34;`, `&#34;IWA_AGENT&#34;`,
         * `&#34;USER_DEPROVISION&#34;`, `&#34;REPORT_SUSPICIOUS_ACTIVITY&#34;`, `&#34;RATELIMIT_NOTIFICATION&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder notificationType(String notificationType) {
            $.notificationType = notificationType;
            return this;
        }

        /**
         * @param roleType Type of the role. Valid values:
         * `&#34;API_ADMIN&#34;`,
         * `&#34;APP_ADMIN&#34;`,
         * `&#34;CUSTOM&#34;`,
         * `&#34;GROUP_MEMBERSHIP_ADMIN&#34;`,
         * `&#34;HELP_DESK_ADMIN&#34;`,
         * `&#34;MOBILE_ADMIN&#34;`,
         * `&#34;ORG_ADMIN&#34;`,
         * `&#34;READ_ONLY_ADMIN&#34;`,
         * `&#34;REPORT_ADMIN&#34;`,
         * `&#34;SUPER_ADMIN&#34;`,
         * `&#34;USER_ADMIN&#34;`
         * .
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            $.roleType = roleType;
            return this;
        }

        public GetRoleSubscriptionPlainArgs build() {
            if ($.notificationType == null) {
                throw new MissingRequiredPropertyException("GetRoleSubscriptionPlainArgs", "notificationType");
            }
            if ($.roleType == null) {
                throw new MissingRequiredPropertyException("GetRoleSubscriptionPlainArgs", "roleType");
            }
            return $;
        }
    }

}
