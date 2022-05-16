// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package okta

import (
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/okta/terraform-provider-okta/okta"
	"github.com/pulumi/pulumi-okta/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "okta"

	// modules:
	appMod           = "App"
	authMod          = "Auth"
	factorMod        = "Factor"
	groupMod         = "Group"
	idpMod           = "Idp"
	inlineMod        = "Inline"
	networkMod       = "Network"
	policyMod        = "Policy"
	profileMod       = "Profile"
	templateMod      = "Template"
	trustedOriginMod = "TrustedOrigin"
	userMod          = "User"
	mainMod          = "Index"

	// DeprecatedResourcesMod - these are resources that were renamed upstream and exist only to satisfy tfgen warnings
	deprecatedMod = "Deprecated"
)

var namespaceMap = map[string]string{
	mainPkg: "Okta",
}

func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	return makeMember(mod, res)
}

func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(okta.Provider())
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "okta",
		Description: "A Pulumi package for creating and managing okta resources.",
		Keywords:    []string{"pulumi", "okta"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "okta",
		Repository:  "https://github.com/pulumi/pulumi-okta",
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			// App Resources
			"okta_app_auto_login": {
				Tok:  makeResource(appMod, "AutoLogin"),
				Docs: &tfbridge.DocInfo{Source: "app_auto_login.html.markdown"},
			},
			"okta_app_bookmark": {
				Tok:  makeResource(appMod, "Bookmark"),
				Docs: &tfbridge.DocInfo{Source: "app_bookmark.html.markdown"},
			},
			"okta_app_group_assignment": {
				Tok:  makeResource(appMod, "GroupAssignment"),
				Docs: &tfbridge.DocInfo{Source: "app_group_assignment.html.markdown"},
			},
			"okta_app_oauth": {
				Tok:  makeResource(appMod, "OAuth"),
				Docs: &tfbridge.DocInfo{Source: "app_oauth.html.markdown"},
			},
			"okta_app_oauth_redirect_uri":             {Tok: makeResource(appMod, "OAuthRedirectUri")},
			"okta_app_oauth_post_logout_redirect_uri": {Tok: makeResource(appMod, "OAuthPostLogoutRedirectUri")},
			"okta_app_saml": {
				Tok:  makeResource(appMod, "Saml"),
				Docs: &tfbridge.DocInfo{Source: "app_saml.html.markdown"},
			},
			"okta_app_secure_password_store": {
				Tok:  makeResource(appMod, "SecurePasswordStore"),
				Docs: &tfbridge.DocInfo{Source: "app_secure_password_store.html.markdown"},
			},
			"okta_app_swa": {
				Tok:  makeResource(appMod, "Swa"),
				Docs: &tfbridge.DocInfo{Source: "app_swa.html.markdown"},
			},
			"okta_app_three_field": {
				Tok:  makeResource(appMod, "ThreeField"),
				Docs: &tfbridge.DocInfo{Source: "app_three_field.html.markdown"},
			},
			"okta_app_user": {
				Tok:  makeResource(appMod, "User"),
				Docs: &tfbridge.DocInfo{Source: "app_user.html.markdown"},
			},
			"okta_app_user_base_schema": {
				Tok:  makeResource(appMod, "UserBaseSchema"),
				Docs: &tfbridge.DocInfo{Source: "app_user_base_schema.html.markdown"},
			},
			"okta_app_user_schema": {
				Tok:  makeResource(appMod, "UserSchema"),
				Docs: &tfbridge.DocInfo{Source: "app_user_schema.html.markdown"},
			},
			"okta_app_basic_auth": {
				Tok:  makeResource(appMod, "BasicAuth"),
				Docs: &tfbridge.DocInfo{Source: "app_basic_auth.html.markdown"},
			},

			// Auth Resources
			"okta_auth_server": {
				Tok:  makeResource(authMod, "Server"),
				Docs: &tfbridge.DocInfo{Source: "auth_server.html.markdown"},
			},
			"okta_auth_server_claim": {
				Tok:  makeResource(authMod, "ServerClaim"),
				Docs: &tfbridge.DocInfo{Source: "auth_server_claim.html.markdown"},
			},
			"okta_auth_server_policy": {
				Tok:  makeResource(authMod, "ServerPolicy"),
				Docs: &tfbridge.DocInfo{Source: "auth_server_policy.html.markdown"},
			},
			"okta_auth_server_scope": {
				Tok:  makeResource(authMod, "ServerScope"),
				Docs: &tfbridge.DocInfo{Source: "auth_server_scope.html.markdown"},
			},

			// Factor Resources
			"okta_factor": {
				Tok:  makeResource(factorMod, "Factor"),
				Docs: &tfbridge.DocInfo{Source: "factor.html.markdown"},
			},

			// Group Resources
			"okta_group": {
				Tok:  makeResource(groupMod, "Group"),
				Docs: &tfbridge.DocInfo{Source: "group.html.markdown"},
			},
			"okta_group_roles": {
				Tok:  makeResource(groupMod, "Roles"),
				Docs: &tfbridge.DocInfo{Source: "group_roles.html.markdown"},
			},
			"okta_group_rule": {
				Tok:  makeResource(groupMod, "Rule"),
				Docs: &tfbridge.DocInfo{Source: "group_rule.html.markdown"},
			},
			"okta_group_membership": {Tok: makeResource(groupMod, "Membership")},
			"okta_group_role":       {Tok: makeResource(groupMod, "Role")},

			// Idp Resources
			"okta_idp_oidc": {
				Tok:  makeResource(idpMod, "Oidc"),
				Docs: &tfbridge.DocInfo{Source: "idp_oidc.html.markdown"},
			},
			"okta_idp_saml": {
				Tok:  makeResource(idpMod, "Saml"),
				Docs: &tfbridge.DocInfo{Source: "idp_saml.html.markdown"},
			},
			"okta_idp_saml_key": {
				Tok:  makeResource(idpMod, "SamlKey"),
				Docs: &tfbridge.DocInfo{Source: "idp_saml_signing_key.html.markdown"},
			},
			"okta_idp_social": {
				Tok:  makeResource(idpMod, "Social"),
				Docs: &tfbridge.DocInfo{Source: "idp_social.html.markdown"},
			},

			// Inline Resources
			"okta_inline_hook": {
				Tok:  makeResource(inlineMod, "Hook"),
				Docs: &tfbridge.DocInfo{Source: "inline_hook.html.markdown"},
			},

			// Network Resources
			"okta_network_zone": {
				Tok:  makeResource(networkMod, "Zone"),
				Docs: &tfbridge.DocInfo{Source: "network_zone.html.markdown"},
			},

			// Policy Resources
			"okta_policy_mfa": {
				Tok:  makeResource(policyMod, "Mfa"),
				Docs: &tfbridge.DocInfo{Source: "policy_mfa.html.markdown"},
			},
			"okta_policy_password": {
				Tok:  makeResource(policyMod, "Password"),
				Docs: &tfbridge.DocInfo{Source: "policy_password.html.markdown"},
			},
			"okta_policy_rule_idp_discovery": {
				Tok:  makeResource(policyMod, "RuleIdpDiscovery"),
				Docs: &tfbridge.DocInfo{Source: "policy_rule_idp_discovery.html.markdown"},
			},
			"okta_policy_rule_mfa": {
				Tok:  makeResource(policyMod, "RuleMfa"),
				Docs: &tfbridge.DocInfo{Source: "policy_rule_mfa.html.markdown"},
			},
			"okta_policy_rule_password": {
				Tok:  makeResource(policyMod, "RulePassword"),
				Docs: &tfbridge.DocInfo{Source: "policy_rule_password.html.markdown"},
			},
			"okta_policy_rule_signon": {
				Tok:  makeResource(policyMod, "RuleSignon"),
				Docs: &tfbridge.DocInfo{Source: "policy_rule_signon.html.markdown"},
			},
			"okta_policy_signon": {
				Tok:  makeResource(policyMod, "Signon"),
				Docs: &tfbridge.DocInfo{Source: "policy_signon.html.markdown"},
			},

			// Template Resources
			"okta_template_email": {
				Tok:  makeResource(templateMod, "Email"),
				Docs: &tfbridge.DocInfo{Source: "template_email.html.markdown"},
			},

			// Trusted Origin
			"okta_trusted_origin": {
				Tok:  makeResource(trustedOriginMod, "Origin"),
				Docs: &tfbridge.DocInfo{Source: "trusted_origin.html.markdown"},
				Fields: map[string]*tfbridge.SchemaInfo{
					"origin": {
						CSharpName: "OriginName",
					},
				},
			},

			// User Resources
			"okta_user": {
				Tok:  makeResource(userMod, "User"),
				Docs: &tfbridge.DocInfo{Source: "user.html.markdown"},
			},
			"okta_user_base_schema": {
				Tok:  makeResource(userMod, "BaseSchema"),
				Docs: &tfbridge.DocInfo{Source: "user_base_schema.html.markdown"},
			},
			"okta_user_schema": {
				Tok:  makeResource(userMod, "Schema"),
				Docs: &tfbridge.DocInfo{Source: "user_schema.html.markdown"},
			},
			"okta_user_type": {Tok: makeResource(userMod, "UserType")},

			// Profile Resources
			"okta_profile_mapping": {
				Tok:  makeResource(profileMod, "Mapping"),
				Docs: &tfbridge.DocInfo{Source: "profile_mapping.html.markdown"},
			},

			// All new resources will be put in top level package i.e. mainMod
			"okta_event_hook":                     {Tok: makeResource(mainMod, "EventHook")},
			"okta_template_sms":                   {Tok: makeResource(mainMod, "TemplateSms")},
			"okta_admin_role_targets":             {Tok: makeResource(mainMod, "AdminRoleTargets")},
			"okta_app_oauth_api_scope":            {Tok: makeResource(mainMod, "AppOauthApiScope")},
			"okta_auth_server_default":            {Tok: makeResource(mainMod, "AuthServerDefault")},
			"okta_policy_mfa_default":             {Tok: makeResource(mainMod, "PolicyMfaDefault")},
			"okta_policy_password_default":        {Tok: makeResource(mainMod, "PolicyPasswordDefault")},
			"okta_auth_server_claim_default":      {Tok: makeResource(mainMod, "AuthServerClaimDefault")},
			"okta_behavior":                       {Tok: makeResource(mainMod, "Behaviour")},
			"okta_app_shared_credentials":         {Tok: makeResource(mainMod, "AppSharedCredentials")},
			"okta_app_user_base_schema_property":  {Tok: makeResource(mainMod, "AppUserBaseSchemaProperty")},
			"okta_app_user_schema_property":       {Tok: makeResource(mainMod, "AppUserSchemaProperty")},
			"okta_domain":                         {Tok: makeResource(mainMod, "Domain")},
			"okta_app_group_assignments":          {Tok: makeResource(mainMod, "AppGroupAssignments")},
			"okta_factor_totp":                    {Tok: makeResource(mainMod, "FactorTotp")},
			"okta_group_memberships":              {Tok: makeResource(mainMod, "GroupMemberships")},
			"okta_user_admin_roles":               {Tok: makeResource(mainMod, "UserAdminRoles")},
			"okta_user_base_schema_property":      {Tok: makeResource(mainMod, "UserBaseSchemaProperty")},
			"okta_user_factor_question":           {Tok: makeResource(mainMod, "UserFactorQuestion")},
			"okta_user_group_memberships":         {Tok: makeResource(mainMod, "UserGroupMemberships")},
			"okta_user_schema_property":           {Tok: makeResource(mainMod, "UserSchemaProperty")},
			"okta_authenticator":                  {Tok: makeResource(mainMod, "Authenticator")},
			"okta_app_saml_app_settings":          {Tok: makeResource(mainMod, "AppSamlAppSettings")},
			"okta_app_signon_policy_rule":         {Tok: makeResource(mainMod, "AppSignonPolicyRule")},
			"okta_domain_certificate":             {Tok: makeResource(mainMod, "DomainCertificate")},
			"okta_domain_verification":            {Tok: makeResource(mainMod, "DomainVerification")},
			"okta_email_sender":                   {Tok: makeResource(mainMod, "EmailSender")},
			"okta_email_sender_verification":      {Tok: makeResource(mainMod, "EmailSenderVerification")},
			"okta_group_schema_property":          {Tok: makeResource(mainMod, "GroupSchemaProperty")},
			"okta_org_configuration":              {Tok: makeResource(mainMod, "OrgConfiguration")},
			"okta_org_support":                    {Tok: makeResource(mainMod, "OrgSupport")},
			"okta_policy_profile_enrollment":      {Tok: makeResource(mainMod, "PolicyProfileEnrollment")},
			"okta_policy_rule_profile_enrollment": {Tok: makeResource(mainMod, "PolicyRuleProfileEnrollment")},
			"okta_role_subscription":              {Tok: makeResource(mainMod, "RoleSubscription")},
			"okta_security_notification_emails":   {Tok: makeResource(mainMod, "SecurityNotificationEmails")},
			"okta_threat_insight_settings":        {Tok: makeResource(mainMod, "ThreatInsightSettings")},
			"okta_event_hook_verification":        {Tok: makeResource(mainMod, "EventHookVerification")},
			"okta_admin_role_custom":              {Tok: makeResource(mainMod, "AdminRoleCustom")},
			"okta_admin_role_custom_assignments":  {Tok: makeResource(mainMod, "AdminRoleCustomAssignments")},
			"okta_captcha":                        {Tok: makeResource(mainMod, "Captcha")},
			"okta_captcha_org_wide_settings":      {Tok: makeResource(mainMod, "CaptchaOrgWideSettings")},
			"okta_link_definition":                {Tok: makeResource(mainMod, "LinkDefinition")},
			"okta_link_value":                     {Tok: makeResource(mainMod, "LinkValue")},
			"okta_rate_limiting":                  {Tok: makeResource(mainMod, "RateLimiting")},
			"okta_resource_set":                   {Tok: makeResource(mainMod, "ResourceSet")},
			"okta_policy_profile_enrollment_apps": {Tok: makeResource(mainMod, "PolicyProfileEnrollmentApps")},
			"okta_brand":                          {Tok: makeResource(mainMod, "Brand")},
			"okta_email_customization":            {Tok: makeResource(mainMod, "EmailCustomization")},
			"okta_theme":                          {Tok: makeResource(mainMod, "Theme")},

			// Deprecated Resources in Upstream Provider
			"okta_idp": {
				Tok:                makeResource(deprecatedMod, "Idp"),
				DeprecationMessage: formatDeprecationMessage("idp.*"),
				Docs:               noUpstreamDocs(),
			},
			"okta_auto_login_app": {
				Tok:                makeResource(deprecatedMod, "AuthLoginApp"),
				DeprecationMessage: formatDeprecationMessage("app.AutoLogin"),
				Docs:               noUpstreamDocs(),
			},
			"okta_bookmark_app": {
				Tok:                makeResource(deprecatedMod, "BookmarkApp"),
				DeprecationMessage: formatDeprecationMessage("app.Bookmark"),
				Docs:               noUpstreamDocs(),
			},
			"okta_mfa_policy": {
				Tok:                makeResource(deprecatedMod, "MfaPolicy"),
				DeprecationMessage: formatDeprecationMessage("policy.Mfa"),
				Docs:               noUpstreamDocs(),
			},
			"okta_mfa_policy_rule": {
				Tok:                makeResource(deprecatedMod, "MfaPolicyRule"),
				DeprecationMessage: formatDeprecationMessage("policy.RuleMfa"),
				Docs:               noUpstreamDocs(),
			},
			"okta_oauth_app": {
				Tok:                makeResource(deprecatedMod, "OauthApp"),
				DeprecationMessage: formatDeprecationMessage("app.OAuth"),
				Docs:               noUpstreamDocs(),
			},
			"okta_oauth_app_redirect_uri": {
				Tok:                makeResource(deprecatedMod, "OauthAppRedirectUri"),
				DeprecationMessage: formatDeprecationMessage("app.OAuthRedirectUri"),
				Docs:               noUpstreamDocs(),
			},
			"okta_password_policy": {
				Tok:                makeResource(deprecatedMod, "PasswordPolicy"),
				DeprecationMessage: formatDeprecationMessage("policy.Password"),
				Docs:               noUpstreamDocs(),
			},
			"okta_password_policy_rule": {
				Tok:                makeResource(deprecatedMod, "PasswordPolicyRule"),
				DeprecationMessage: formatDeprecationMessage("policy.RulePassword"),
				Docs:               noUpstreamDocs(),
			},
			"okta_signon_policy": {
				Tok:                makeResource(deprecatedMod, "SignonPolicy"),
				DeprecationMessage: formatDeprecationMessage("policy.Signon"),
				Docs:               noUpstreamDocs(),
			},
			"okta_signon_policy_rule": {
				Tok:                makeResource(deprecatedMod, "SignonPolicyRule"),
				DeprecationMessage: formatDeprecationMessage("policy.RuleSignon"),
				Docs:               noUpstreamDocs(),
			},
			"okta_swa_app": {
				Tok:                makeResource(deprecatedMod, "SwaApp"),
				DeprecationMessage: formatDeprecationMessage("app.Swa"),
				Docs:               noUpstreamDocs(),
			},
			"okta_saml_app": {
				Tok:                makeResource(deprecatedMod, "SamlApp"),
				DeprecationMessage: formatDeprecationMessage("app.Saml"),
				Docs:               noUpstreamDocs(),
			},
			"okta_saml_idp": {
				Tok:                makeResource(deprecatedMod, "SamlIdp"),
				DeprecationMessage: formatDeprecationMessage("idp.Saml"),
				Docs:               noUpstreamDocs(),
			},
			"okta_saml_idp_signing_key": {
				Tok:                makeResource(deprecatedMod, "SamlIdpSigningKey"),
				DeprecationMessage: formatDeprecationMessage("idp.SamlKey"),
				Docs:               noUpstreamDocs(),
			},
			"okta_secure_password_store_app": {
				Tok:                makeResource(deprecatedMod, "SecurePasswordStoreApp"),
				DeprecationMessage: formatDeprecationMessage("app.SecurePasswordStore"),
				Docs:               noUpstreamDocs(),
			},
			"okta_social_idp": {
				Tok:                makeResource(deprecatedMod, "SocialIdp"),
				DeprecationMessage: formatDeprecationMessage("idp.Social"),
				Docs:               noUpstreamDocs(),
			},
			"okta_three_field_app": {
				Tok:                makeResource(deprecatedMod, "ThreeFieldApp"),
				DeprecationMessage: formatDeprecationMessage("app.ThreeField"),
				Docs:               noUpstreamDocs(),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// App DataSources
			"okta_app": {
				Tok:  makeDataSource(appMod, "getApp"),
				Docs: &tfbridge.DocInfo{Source: "app.html.markdown"},
			},
			"okta_app_metadata_saml": {
				Tok:  makeDataSource(appMod, "getMetadataSaml"),
				Docs: &tfbridge.DocInfo{Source: "app_saml_metadata.html.markdown"},
			},
			"okta_app_saml": {
				Tok:  makeDataSource(appMod, "getSaml"),
				Docs: &tfbridge.DocInfo{Source: "app_saml.html.markdown"},
			},
			"okta_app_oauth": {Tok: makeDataSource(appMod, "getOauth")},

			// Auth DataSources
			"okta_auth_server": {
				Tok:  makeDataSource(authMod, "getServer"),
				Docs: &tfbridge.DocInfo{Source: "auth_server.html.markdown"},
			},
			"okta_auth_server_policy": {Tok: makeDataSource(authMod, "getServerPolicy")},
			"okta_auth_server_scopes": {Tok: makeDataSource(authMod, "getServerScopes")},

			// Group DataSources
			"okta_group": {
				Tok:  makeDataSource(groupMod, "getGroup"),
				Docs: &tfbridge.DocInfo{Source: "group.html.markdown"},
			},
			"okta_everyone_group": {Tok: makeDataSource(groupMod, "getEveryoneGroup")},

			// Idp DataSources
			"okta_idp_metadata_saml": {
				Tok:  makeDataSource(idpMod, "getMetadataSaml"),
				Docs: &tfbridge.DocInfo{Source: "idp_saml_metadata.html.markdown"},
			},
			"okta_idp_saml": {
				Tok:  makeDataSource(idpMod, "getSaml"),
				Docs: &tfbridge.DocInfo{Source: "idp_saml.html.markdown"},
			},
			"okta_idp_oidc":   {Tok: makeDataSource(idpMod, "getOidc")},
			"okta_idp_social": {Tok: makeDataSource(idpMod, "getSocial")},

			// Policy DataSources
			"okta_policy": {
				Tok:  makeDataSource(policyMod, "getPolicy"),
				Docs: &tfbridge.DocInfo{Source: "policy.html.markdown"},
			},
			"okta_default_policy": {Tok: makeDataSource(policyMod, "getDefaultPolicy")},

			// User DataSources
			"okta_user": {
				Tok:  makeDataSource(userMod, "getUser"),
				Docs: &tfbridge.DocInfo{Source: "user.html.markdown"},
			},
			"okta_users": {
				Tok:  makeDataSource(userMod, "getUsers"),
				Docs: &tfbridge.DocInfo{Source: "users.html.markdown"},
			},
			"okta_user_profile_mapping_source": {
				Tok:  makeDataSource(userMod, "getUserProfileMappingSource"),
				Docs: &tfbridge.DocInfo{Source: "user_profile_mapping_source.html.markdown"},
			},
			"okta_user_type": {Tok: makeDataSource(userMod, "getUserType")},

			// all new data sources will go in the mainmod
			"okta_groups":                  {Tok: makeDataSource(mainMod, "getGroups")},
			"okta_app_group_assignments":   {Tok: makeDataSource(mainMod, "getAppGroupAssignments")},
			"okta_app_user_assignments":    {Tok: makeDataSource(mainMod, "getAppUserAssignments")},
			"okta_behavior":                {Tok: makeDataSource(mainMod, "getBehaviour")},
			"okta_behaviors":               {Tok: makeDataSource(mainMod, "getBehaviours")},
			"okta_user_security_questions": {Tok: makeDataSource(mainMod, "getUserSecurityQuestions")},
			"okta_app_signon_policy":       {Tok: makeDataSource(mainMod, "getAppSignonPolicy")},
			"okta_auth_server_claim":       {Tok: makeDataSource(mainMod, "getAuthServerClaim")},
			"okta_auth_server_claims":      {Tok: makeDataSource(mainMod, "getAuthServerClaims")},
			"okta_authenticator":           {Tok: makeDataSource(mainMod, "getAuthenticator")},
			"okta_network_zone":            {Tok: makeDataSource(mainMod, "getNetworkZone")},
			"okta_role_subscription":       {Tok: makeDataSource(mainMod, "getRoleSubscription")},
			"okta_trusted_origins":         {Tok: makeDataSource(mainMod, "getTrustedOrigins")},
			"okta_brand":                   {Tok: makeDataSource(mainMod, "getBrand")},
			"okta_brands":                  {Tok: makeDataSource(mainMod, "getBrands")},
			"okta_email_customization":     {Tok: makeDataSource(mainMod, "getEmailCustomization")},
			"okta_email_customizations":    {Tok: makeDataSource(mainMod, "getEmailCustomizations")},
			"okta_email_template":          {Tok: makeDataSource(mainMod, "getTemplate")},
			"okta_email_templates":         {Tok: makeDataSource(mainMod, "getTemplates")},
			"okta_theme":                   {Tok: makeDataSource(mainMod, "getTheme")},
			"okta_themes":                  {Tok: makeDataSource(mainMod, "getThemes")},

			// Deprecated DataSources in Upstream Provider
			"okta_default_policies": {
				Tok:                makeDataSource(deprecatedMod, "getDefaultPolicies"),
				DeprecationMessage: formatDeprecationMessage("policy.getDefaultPolicy"),
				Docs:               noUpstreamDocs(),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.RenameResourceWithAlias("okta_auth_server_policy_rule",
		makeResource(authMod, "ServerPolicyClaim"), makeResource(authMod, "ServerPolicyRule"),
		authMod, authMod, &tfbridge.ResourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "auth_server_policy_rule.html.markdown"},
		})

	prov.SetAutonaming(255, "-")

	return prov
}

func noUpstreamDocs() *tfbridge.DocInfo {
	return &tfbridge.DocInfo{
		Markdown: []byte(" "),
	}
}

func formatDeprecationMessage(newResourceName string) string {
	return fmt.Sprintf("Deprecated. Use %s instead. This resource will be removed in version 4.0 of this provider.",
		newResourceName)
}
