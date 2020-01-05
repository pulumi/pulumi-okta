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
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-terraform-bridge/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"

	"github.com/articulate/terraform-provider-okta/okta"
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

func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	p := okta.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "okta",
		GitHubOrg:   "articulate",
		Description: "A Pulumi package for creating and managing okta resources.",
		Keywords:    []string{"pulumi", "okta"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-okta",
		Config: map[string]*tfbridge.SchemaInfo{
			"org_name": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"OKTA_ORG_NAME",
					},
				},
			},
			"base_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"OKTA_BASE_URL",
					},
				},
			},
			"api_token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"OKTA_API_TOKEN",
					},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
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
			"okta_app_oauth_redirect_uri": {Tok: makeResource(appMod, "OAuthRedirectUri")},
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
			"okta_auth_server_policy_rule": {
				Tok:  makeResource(authMod, "ServerPolicyClaim"),
				Docs: &tfbridge.DocInfo{Source: "auth_server_policy_rule.html.markdown"},
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

			// Profile Resources
			"okta_profile_mapping": {
				Tok:  makeResource(profileMod, "Mapping"),
				Docs: &tfbridge.DocInfo{Source: "profile_mapping.html.markdown"},
			},

			// Deprecated Resources in Upstream Provider
			"okta_idp":                       {Tok: makeResource(deprecatedMod, "Idp")},
			"okta_auto_login_app":            {Tok: makeResource(deprecatedMod, "AuthLoginApp")},
			"okta_bookmark_app":              {Tok: makeResource(deprecatedMod, "BookmarkApp")},
			"okta_mfa_policy":                {Tok: makeResource(deprecatedMod, "MfaPolicy")},
			"okta_mfa_policy_rule":           {Tok: makeResource(deprecatedMod, "MfaPolicyRule")},
			"okta_oauth_app":                 {Tok: makeResource(deprecatedMod, "OauthApp")},
			"okta_oauth_app_redirect_uri":    {Tok: makeResource(deprecatedMod, "OauthAppRedirectUri")},
			"okta_password_policy":           {Tok: makeResource(deprecatedMod, "PasswordPolicy")},
			"okta_password_policy_rule":      {Tok: makeResource(deprecatedMod, "PasswordPolicyRule")},
			"okta_signon_policy":             {Tok: makeResource(deprecatedMod, "SignonPolicy")},
			"okta_signon_policy_rule":        {Tok: makeResource(deprecatedMod, "SignonPolicyRule")},
			"okta_swa_app":                   {Tok: makeResource(deprecatedMod, "SwaApp")},
			"okta_saml_app":                  {Tok: makeResource(deprecatedMod, "SamlApp")},
			"okta_saml_idp":                  {Tok: makeResource(deprecatedMod, "SamlIdp")},
			"okta_saml_idp_signing_key":      {Tok: makeResource(deprecatedMod, "SamlIdpSigningKey")},
			"okta_secure_password_store_app": {Tok: makeResource(deprecatedMod, "SecurePasswordStoreApp")},
			"okta_social_idp":                {Tok: makeResource(deprecatedMod, "SocialIdp")},
			"okta_three_field_app":           {Tok: makeResource(deprecatedMod, "ThreeFieldApp")},
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

			// Auth DataSources
			"okta_auth_server": {
				Tok:  makeDataSource(authMod, "getServer"),
				Docs: &tfbridge.DocInfo{Source: "auth_server.html.markdown"},
			},

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

			// Deprecated DataSources in Upstream Provider
			"okta_default_policies": {Tok: makeDataSource(deprecatedMod, "getDefaultPolicies")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^1.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.7.0-preview",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: namespaceMap,
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if resourceSchema := p.ResourcesMap[resname]; resourceSchema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := resourceSchema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
