// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.idp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSocialResult {
    /**
     * @return Specifies the account linking action for an IdP user.
     * 
     */
    private String accountLinkAction;
    /**
     * @return Group memberships to determine link candidates.
     * 
     */
    private List<String> accountLinkGroupIncludes;
    /**
     * @return The method of making an authorization request.
     * 
     */
    private String authorizationBinding;
    /**
     * @return IdP Authorization Server (AS) endpoint to request consent from the user and obtain an authorization code grant.
     * 
     */
    private String authorizationUrl;
    /**
     * @return Unique identifier issued by AS for the Okta IdP instance.
     * 
     */
    private String clientId;
    /**
     * @return Client secret issued by AS for the Okta IdP instance.
     * 
     */
    private String clientSecret;
    /**
     * @return Action for a previously deprovisioned IdP user during authentication.
     * 
     */
    private String deprovisionedAction;
    /**
     * @return Provisioning action for IdP user&#39;s group memberships.
     * 
     */
    private String groupsAction;
    /**
     * @return List of Okta Group IDs.
     * 
     */
    private List<String> groupsAssignments;
    /**
     * @return IdP user profile attribute name for an array value that contains group memberships.
     * 
     */
    private String groupsAttribute;
    /**
     * @return Whitelist of Okta Group identifiers.
     * 
     */
    private List<String> groupsFilters;
    private @Nullable String id;
    /**
     * @return Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL.
     * 
     */
    private String issuerMode;
    /**
     * @return Maximum allowable clock-skew when processing messages from the IdP.
     * 
     */
    private Integer maxClockSkew;
    private @Nullable String name;
    /**
     * @return Determines if the IdP should act as a source of truth for user profile attributes.
     * 
     */
    private Boolean profileMaster;
    /**
     * @return The type of protocol to use.
     * 
     */
    private String protocolType;
    /**
     * @return Provisioning action for an IdP user during authentication.
     * 
     */
    private String provisioningAction;
    /**
     * @return The scopes of the IdP.
     * 
     */
    private List<String> scopes;
    /**
     * @return Status of the IdP.
     * 
     */
    private String status;
    /**
     * @return Okta user profile attribute for matching transformed IdP username.
     * 
     */
    private String subjectMatchAttribute;
    /**
     * @return Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username.
     * 
     */
    private String subjectMatchType;
    /**
     * @return Action for a previously suspended IdP user during authentication.
     * 
     */
    private String suspendedAction;
    /**
     * @return The method of making a token request.
     * 
     */
    private String tokenBinding;
    /**
     * @return IdP Authorization Server (AS) endpoint to exchange the authorization code grant for an access token.
     * 
     */
    private String tokenUrl;
    /**
     * @return The type of Social IdP. See API docs [Identity Provider Type](https://developer.okta.com/docs/reference/api/idps/#identity-provider-type)
     * 
     */
    private String type;
    /**
     * @return Okta EL Expression to generate or transform a unique username for the IdP user.
     * 
     */
    private String usernameTemplate;

    private GetSocialResult() {}
    /**
     * @return Specifies the account linking action for an IdP user.
     * 
     */
    public String accountLinkAction() {
        return this.accountLinkAction;
    }
    /**
     * @return Group memberships to determine link candidates.
     * 
     */
    public List<String> accountLinkGroupIncludes() {
        return this.accountLinkGroupIncludes;
    }
    /**
     * @return The method of making an authorization request.
     * 
     */
    public String authorizationBinding() {
        return this.authorizationBinding;
    }
    /**
     * @return IdP Authorization Server (AS) endpoint to request consent from the user and obtain an authorization code grant.
     * 
     */
    public String authorizationUrl() {
        return this.authorizationUrl;
    }
    /**
     * @return Unique identifier issued by AS for the Okta IdP instance.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Client secret issued by AS for the Okta IdP instance.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return Action for a previously deprovisioned IdP user during authentication.
     * 
     */
    public String deprovisionedAction() {
        return this.deprovisionedAction;
    }
    /**
     * @return Provisioning action for IdP user&#39;s group memberships.
     * 
     */
    public String groupsAction() {
        return this.groupsAction;
    }
    /**
     * @return List of Okta Group IDs.
     * 
     */
    public List<String> groupsAssignments() {
        return this.groupsAssignments;
    }
    /**
     * @return IdP user profile attribute name for an array value that contains group memberships.
     * 
     */
    public String groupsAttribute() {
        return this.groupsAttribute;
    }
    /**
     * @return Whitelist of Okta Group identifiers.
     * 
     */
    public List<String> groupsFilters() {
        return this.groupsFilters;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL.
     * 
     */
    public String issuerMode() {
        return this.issuerMode;
    }
    /**
     * @return Maximum allowable clock-skew when processing messages from the IdP.
     * 
     */
    public Integer maxClockSkew() {
        return this.maxClockSkew;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Determines if the IdP should act as a source of truth for user profile attributes.
     * 
     */
    public Boolean profileMaster() {
        return this.profileMaster;
    }
    /**
     * @return The type of protocol to use.
     * 
     */
    public String protocolType() {
        return this.protocolType;
    }
    /**
     * @return Provisioning action for an IdP user during authentication.
     * 
     */
    public String provisioningAction() {
        return this.provisioningAction;
    }
    /**
     * @return The scopes of the IdP.
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }
    /**
     * @return Status of the IdP.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Okta user profile attribute for matching transformed IdP username.
     * 
     */
    public String subjectMatchAttribute() {
        return this.subjectMatchAttribute;
    }
    /**
     * @return Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username.
     * 
     */
    public String subjectMatchType() {
        return this.subjectMatchType;
    }
    /**
     * @return Action for a previously suspended IdP user during authentication.
     * 
     */
    public String suspendedAction() {
        return this.suspendedAction;
    }
    /**
     * @return The method of making a token request.
     * 
     */
    public String tokenBinding() {
        return this.tokenBinding;
    }
    /**
     * @return IdP Authorization Server (AS) endpoint to exchange the authorization code grant for an access token.
     * 
     */
    public String tokenUrl() {
        return this.tokenUrl;
    }
    /**
     * @return The type of Social IdP. See API docs [Identity Provider Type](https://developer.okta.com/docs/reference/api/idps/#identity-provider-type)
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Okta EL Expression to generate or transform a unique username for the IdP user.
     * 
     */
    public String usernameTemplate() {
        return this.usernameTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSocialResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountLinkAction;
        private List<String> accountLinkGroupIncludes;
        private String authorizationBinding;
        private String authorizationUrl;
        private String clientId;
        private String clientSecret;
        private String deprovisionedAction;
        private String groupsAction;
        private List<String> groupsAssignments;
        private String groupsAttribute;
        private List<String> groupsFilters;
        private @Nullable String id;
        private String issuerMode;
        private Integer maxClockSkew;
        private @Nullable String name;
        private Boolean profileMaster;
        private String protocolType;
        private String provisioningAction;
        private List<String> scopes;
        private String status;
        private String subjectMatchAttribute;
        private String subjectMatchType;
        private String suspendedAction;
        private String tokenBinding;
        private String tokenUrl;
        private String type;
        private String usernameTemplate;
        public Builder() {}
        public Builder(GetSocialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLinkAction = defaults.accountLinkAction;
    	      this.accountLinkGroupIncludes = defaults.accountLinkGroupIncludes;
    	      this.authorizationBinding = defaults.authorizationBinding;
    	      this.authorizationUrl = defaults.authorizationUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.deprovisionedAction = defaults.deprovisionedAction;
    	      this.groupsAction = defaults.groupsAction;
    	      this.groupsAssignments = defaults.groupsAssignments;
    	      this.groupsAttribute = defaults.groupsAttribute;
    	      this.groupsFilters = defaults.groupsFilters;
    	      this.id = defaults.id;
    	      this.issuerMode = defaults.issuerMode;
    	      this.maxClockSkew = defaults.maxClockSkew;
    	      this.name = defaults.name;
    	      this.profileMaster = defaults.profileMaster;
    	      this.protocolType = defaults.protocolType;
    	      this.provisioningAction = defaults.provisioningAction;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
    	      this.subjectMatchAttribute = defaults.subjectMatchAttribute;
    	      this.subjectMatchType = defaults.subjectMatchType;
    	      this.suspendedAction = defaults.suspendedAction;
    	      this.tokenBinding = defaults.tokenBinding;
    	      this.tokenUrl = defaults.tokenUrl;
    	      this.type = defaults.type;
    	      this.usernameTemplate = defaults.usernameTemplate;
        }

        @CustomType.Setter
        public Builder accountLinkAction(String accountLinkAction) {
            this.accountLinkAction = Objects.requireNonNull(accountLinkAction);
            return this;
        }
        @CustomType.Setter
        public Builder accountLinkGroupIncludes(List<String> accountLinkGroupIncludes) {
            this.accountLinkGroupIncludes = Objects.requireNonNull(accountLinkGroupIncludes);
            return this;
        }
        public Builder accountLinkGroupIncludes(String... accountLinkGroupIncludes) {
            return accountLinkGroupIncludes(List.of(accountLinkGroupIncludes));
        }
        @CustomType.Setter
        public Builder authorizationBinding(String authorizationBinding) {
            this.authorizationBinding = Objects.requireNonNull(authorizationBinding);
            return this;
        }
        @CustomType.Setter
        public Builder authorizationUrl(String authorizationUrl) {
            this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder deprovisionedAction(String deprovisionedAction) {
            this.deprovisionedAction = Objects.requireNonNull(deprovisionedAction);
            return this;
        }
        @CustomType.Setter
        public Builder groupsAction(String groupsAction) {
            this.groupsAction = Objects.requireNonNull(groupsAction);
            return this;
        }
        @CustomType.Setter
        public Builder groupsAssignments(List<String> groupsAssignments) {
            this.groupsAssignments = Objects.requireNonNull(groupsAssignments);
            return this;
        }
        public Builder groupsAssignments(String... groupsAssignments) {
            return groupsAssignments(List.of(groupsAssignments));
        }
        @CustomType.Setter
        public Builder groupsAttribute(String groupsAttribute) {
            this.groupsAttribute = Objects.requireNonNull(groupsAttribute);
            return this;
        }
        @CustomType.Setter
        public Builder groupsFilters(List<String> groupsFilters) {
            this.groupsFilters = Objects.requireNonNull(groupsFilters);
            return this;
        }
        public Builder groupsFilters(String... groupsFilters) {
            return groupsFilters(List.of(groupsFilters));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder issuerMode(String issuerMode) {
            this.issuerMode = Objects.requireNonNull(issuerMode);
            return this;
        }
        @CustomType.Setter
        public Builder maxClockSkew(Integer maxClockSkew) {
            this.maxClockSkew = Objects.requireNonNull(maxClockSkew);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder profileMaster(Boolean profileMaster) {
            this.profileMaster = Objects.requireNonNull(profileMaster);
            return this;
        }
        @CustomType.Setter
        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningAction(String provisioningAction) {
            this.provisioningAction = Objects.requireNonNull(provisioningAction);
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subjectMatchAttribute(String subjectMatchAttribute) {
            this.subjectMatchAttribute = Objects.requireNonNull(subjectMatchAttribute);
            return this;
        }
        @CustomType.Setter
        public Builder subjectMatchType(String subjectMatchType) {
            this.subjectMatchType = Objects.requireNonNull(subjectMatchType);
            return this;
        }
        @CustomType.Setter
        public Builder suspendedAction(String suspendedAction) {
            this.suspendedAction = Objects.requireNonNull(suspendedAction);
            return this;
        }
        @CustomType.Setter
        public Builder tokenBinding(String tokenBinding) {
            this.tokenBinding = Objects.requireNonNull(tokenBinding);
            return this;
        }
        @CustomType.Setter
        public Builder tokenUrl(String tokenUrl) {
            this.tokenUrl = Objects.requireNonNull(tokenUrl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usernameTemplate(String usernameTemplate) {
            this.usernameTemplate = Objects.requireNonNull(usernameTemplate);
            return this;
        }
        public GetSocialResult build() {
            final var o = new GetSocialResult();
            o.accountLinkAction = accountLinkAction;
            o.accountLinkGroupIncludes = accountLinkGroupIncludes;
            o.authorizationBinding = authorizationBinding;
            o.authorizationUrl = authorizationUrl;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.deprovisionedAction = deprovisionedAction;
            o.groupsAction = groupsAction;
            o.groupsAssignments = groupsAssignments;
            o.groupsAttribute = groupsAttribute;
            o.groupsFilters = groupsFilters;
            o.id = id;
            o.issuerMode = issuerMode;
            o.maxClockSkew = maxClockSkew;
            o.name = name;
            o.profileMaster = profileMaster;
            o.protocolType = protocolType;
            o.provisioningAction = provisioningAction;
            o.scopes = scopes;
            o.status = status;
            o.subjectMatchAttribute = subjectMatchAttribute;
            o.subjectMatchType = subjectMatchType;
            o.suspendedAction = suspendedAction;
            o.tokenBinding = tokenBinding;
            o.tokenUrl = tokenUrl;
            o.type = type;
            o.usernameTemplate = usernameTemplate;
            return o;
        }
    }
}