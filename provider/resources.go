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
	"bytes"
	"context"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/okta/terraform-provider-okta/okta"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-okta/provider/v4/pkg/version"
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
	trustedOriginMod = "TrustedOrigin"
	userMod          = "User"
	mainMod          = "Index"
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

//go:embed cmd/pulumi-resource-okta/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	ctx := context.Background()
	p := pfbridge.MuxShimWithPF(ctx,
		shimv2.NewProvider(okta.Provider()),
		okta.NewFrameworkProvider(okta.OktaTerraformProviderVersion),
	)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "okta",
		Description: "A Pulumi package for creating and managing okta resources.",
		Keywords:    []string{"pulumi", "okta"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "okta",
		Repository:  "https://github.com/pulumi/pulumi-okta",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_token": {
				Secret: tfbridge.True(),
			},
			"access_token": {
				Secret: tfbridge.True(),
			},
			"private_key": {
				Secret: tfbridge.True(),
			},
		},
		UpstreamRepoPath:  "./upstream",
		Version:           version.Version,
		TFProviderVersion: okta.OktaTerraformProviderVersion,
		DocRules: &tfbridge.DocRuleInfo{
			EditRules: editRules,
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// App Resources
			"okta_app_oauth":                          {Tok: makeResource(appMod, "OAuth")},
			"okta_app_oauth_redirect_uri":             {Tok: makeResource(appMod, "OAuthRedirectUri")},
			"okta_app_oauth_post_logout_redirect_uri": {Tok: makeResource(appMod, "OAuthPostLogoutRedirectUri")},

			// Factor Resources
			"okta_factor": {Tok: makeResource(factorMod, "Factor")},

			// Group Resources
			"okta_group": {Tok: makeResource(groupMod, "Group")},

			// Inline Resources
			"okta_inline_hook": {Tok: makeResource(inlineMod, "Hook")},

			// Network Resources
			"okta_network_zone": {Tok: makeResource(networkMod, "Zone")},

			// Trusted Origin
			"okta_trusted_origin": {
				Tok: makeResource(trustedOriginMod, "Origin"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"origin": {
						CSharpName: "OriginName",
					},
				},
			},

			// User Resources
			"okta_user":      {Tok: makeResource(userMod, "User")},
			"okta_user_type": {Tok: makeResource(userMod, "UserType")},

			// Profile Resources
			"okta_profile_mapping": {Tok: makeResource(profileMod, "Mapping")},

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
			"okta_app_signon_policy":              {Tok: makeResource(mainMod, "AppSignonPolicy")},
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
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// App DataSources
			"okta_app": {
				Tok: makeDataSource(appMod, "getApp"),
			},
			"okta_app_metadata_saml": {
				Tok: makeDataSource(appMod, "getMetadataSaml"),
			},
			"okta_app_saml": {
				Tok: makeDataSource(appMod, "getSaml"),
			},
			"okta_app_oauth": {Tok: makeDataSource(appMod, "getOauth")},

			// Auth DataSources
			"okta_auth_server": {
				Tok: makeDataSource(authMod, "getServer"),
			},
			"okta_auth_server_policy": {Tok: makeDataSource(authMod, "getServerPolicy")},
			"okta_auth_server_scopes": {Tok: makeDataSource(authMod, "getServerScopes")},

			// Group DataSources
			"okta_group": {
				Tok: makeDataSource(groupMod, "getGroup"),
			},
			"okta_everyone_group": {Tok: makeDataSource(groupMod, "getEveryoneGroup")},

			// Idp DataSources
			"okta_idp_metadata_saml": {
				Tok: makeDataSource(idpMod, "getMetadataSaml"),
			},
			"okta_idp_saml": {
				Tok: makeDataSource(idpMod, "getSaml"),
			},
			"okta_idp_oidc":   {Tok: makeDataSource(idpMod, "getOidc")},
			"okta_idp_social": {Tok: makeDataSource(idpMod, "getSocial")},

			// Policy DataSources
			"okta_policy": {
				Tok: makeDataSource(policyMod, "getPolicy"),
			},
			"okta_default_policy": {Tok: makeDataSource(policyMod, "getDefaultPolicy")},

			// User DataSources
			"okta_user": {
				Tok: makeDataSource(userMod, "getUser"),
			},
			"okta_users": {
				Tok: makeDataSource(userMod, "getUsers"),
			},
			"okta_user_profile_mapping_source": {
				Tok: makeDataSource(userMod, "getUserProfileMappingSource"),
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
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tks.KnownModules("okta_", "index", []string{
		"app_",
		"auth_",
		"factor_",
		"group_",
		"idp_",
		"inline_",
		"network_",
		"policy_",
		"profile_",
		"template_",
		"trusted_origin_",
		"user_",
	}, tks.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	for _, r := range []string{
		"okta_customized_signin_page",
		"okta_policy_device_assurance_android",
		"okta_policy_device_assurance_chromeos",
		"okta_policy_device_assurance_ios",
		"okta_policy_device_assurance_macos",
		"okta_policy_device_assurance_windows",
		"okta_preview_signin_page",
		"okta_auth_server_policy_rule_legacy",
	} {
		prov.Resources[r].Docs = &tfbridge.DocInfo{AllowMissing: true}
	}

	for _, d := range []string{
		"okta_default_signin_page",
	} {
		prov.DataSources[d].Docs = &tfbridge.DocInfo{AllowMissing: true}
	}

	return prov
}

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		tfbridge.DocsEdit{
			Path: "*",
			Edit: func(_ string, content []byte) ([]byte, error) {
				b := bytes.ReplaceAll(content, []byte("terraform state"), []byte("pulumi state"))
				return b, nil
			},
		},
		tfbridge.DocsEdit{
			Path: "index.md",
			Edit: func(_ string, content []byte) ([]byte, error) {
				b := bytes.ReplaceAll(
					content,
					[]byte(" and run\n`pulumi state replace-provider oktadeveloper/okta okta/okta`"),
					[]byte(""),
				)
				return b, nil
			},
		},
	)
}
