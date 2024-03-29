// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package idp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a SAML Identity Provider.
//
// This resource allows you to create and configure a SAML Identity Provider.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/idp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := idp.NewSaml(ctx, "example", &idp.SamlArgs{
//				AcsType:                pulumi.String("INSTANCE"),
//				Issuer:                 pulumi.String("https://idp.example.com"),
//				Kid:                    pulumi.Any(okta_idp_saml_key.Test.Id),
//				RequestSignatureScope:  pulumi.String("REQUEST"),
//				ResponseSignatureScope: pulumi.String("ANY"),
//				SsoBinding:             pulumi.String("HTTP-POST"),
//				SsoDestination:         pulumi.String("https://idp.example.com"),
//				SsoUrl:                 pulumi.String("https://idp.example.com"),
//				UsernameTemplate:       pulumi.String("idpuser.email"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// An SAML IdP can be imported via the Okta ID.
//
// ```sh
// $ pulumi import okta:idp/saml:Saml example &#60;idp id&#62;
// ```
type Saml struct {
	pulumi.CustomResourceState

	// Specifies the account linking action for an IdP user.
	AccountLinkAction pulumi.StringPtrOutput `pulumi:"accountLinkAction"`
	// Group memberships to determine link candidates.
	AccountLinkGroupIncludes pulumi.StringArrayOutput `pulumi:"accountLinkGroupIncludes"`
	AcsBinding               pulumi.StringOutput      `pulumi:"acsBinding"`
	// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
	AcsType pulumi.StringPtrOutput `pulumi:"acsType"`
	// The audience restriction for the IdP.
	Audience pulumi.StringOutput `pulumi:"audience"`
	// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
	DeprovisionedAction pulumi.StringPtrOutput `pulumi:"deprovisionedAction"`
	// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
	GroupsAction pulumi.StringPtrOutput `pulumi:"groupsAction"`
	// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
	GroupsAssignments pulumi.StringArrayOutput `pulumi:"groupsAssignments"`
	// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
	GroupsAttribute pulumi.StringPtrOutput `pulumi:"groupsAttribute"`
	// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
	GroupsFilters pulumi.StringArrayOutput `pulumi:"groupsFilters"`
	// URI that identifies the issuer.
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
	IssuerMode pulumi.StringPtrOutput `pulumi:"issuerMode"`
	// The ID of the signing key.
	Kid pulumi.StringOutput `pulumi:"kid"`
	// Maximum allowable clock-skew when processing messages from the IdP.
	MaxClockSkew pulumi.IntPtrOutput `pulumi:"maxClockSkew"`
	// The Application's display name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	NameFormat pulumi.StringPtrOutput `pulumi:"nameFormat"`
	// Determines if the IdP should act as a source of truth for user profile attributes.
	ProfileMaster pulumi.BoolPtrOutput `pulumi:"profileMaster"`
	// Provisioning action for an IdP user during authentication.
	ProvisioningAction pulumi.StringPtrOutput `pulumi:"provisioningAction"`
	// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
	RequestSignatureAlgorithm pulumi.StringPtrOutput `pulumi:"requestSignatureAlgorithm"`
	// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
	RequestSignatureScope pulumi.StringPtrOutput `pulumi:"requestSignatureScope"`
	// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
	ResponseSignatureAlgorithm pulumi.StringPtrOutput `pulumi:"responseSignatureAlgorithm"`
	// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
	ResponseSignatureScope pulumi.StringPtrOutput `pulumi:"responseSignatureScope"`
	// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
	SsoBinding pulumi.StringPtrOutput `pulumi:"ssoBinding"`
	// URI reference indicating the address to which the AuthnRequest message is sent.
	SsoDestination pulumi.StringPtrOutput `pulumi:"ssoDestination"`
	// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
	SsoUrl pulumi.StringOutput `pulumi:"ssoUrl"`
	// Status of the IdP.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Optional regular expression pattern used to filter untrusted IdP usernames.
	SubjectFilter pulumi.StringPtrOutput `pulumi:"subjectFilter"`
	// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	SubjectFormats pulumi.StringArrayOutput `pulumi:"subjectFormats"`
	// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchAttribute pulumi.StringPtrOutput `pulumi:"subjectMatchAttribute"`
	// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchType pulumi.StringPtrOutput `pulumi:"subjectMatchType"`
	// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
	SuspendedAction pulumi.StringPtrOutput `pulumi:"suspendedAction"`
	// Type of the IdP.
	Type pulumi.StringOutput `pulumi:"type"`
	// User type ID. Can be used as `targetId` in the `profile.Mapping` resource.
	UserTypeId pulumi.StringOutput `pulumi:"userTypeId"`
	// Okta EL Expression to generate or transform a unique username for the IdP user.
	UsernameTemplate pulumi.StringPtrOutput `pulumi:"usernameTemplate"`
}

// NewSaml registers a new resource with the given unique name, arguments, and options.
func NewSaml(ctx *pulumi.Context,
	name string, args *SamlArgs, opts ...pulumi.ResourceOption) (*Saml, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Issuer == nil {
		return nil, errors.New("invalid value for required argument 'Issuer'")
	}
	if args.Kid == nil {
		return nil, errors.New("invalid value for required argument 'Kid'")
	}
	if args.SsoUrl == nil {
		return nil, errors.New("invalid value for required argument 'SsoUrl'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Saml
	err := ctx.RegisterResource("okta:idp/saml:Saml", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSaml gets an existing Saml resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSaml(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SamlState, opts ...pulumi.ResourceOption) (*Saml, error) {
	var resource Saml
	err := ctx.ReadResource("okta:idp/saml:Saml", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Saml resources.
type samlState struct {
	// Specifies the account linking action for an IdP user.
	AccountLinkAction *string `pulumi:"accountLinkAction"`
	// Group memberships to determine link candidates.
	AccountLinkGroupIncludes []string `pulumi:"accountLinkGroupIncludes"`
	AcsBinding               *string  `pulumi:"acsBinding"`
	// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
	AcsType *string `pulumi:"acsType"`
	// The audience restriction for the IdP.
	Audience *string `pulumi:"audience"`
	// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
	DeprovisionedAction *string `pulumi:"deprovisionedAction"`
	// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
	GroupsAction *string `pulumi:"groupsAction"`
	// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
	GroupsAssignments []string `pulumi:"groupsAssignments"`
	// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
	GroupsAttribute *string `pulumi:"groupsAttribute"`
	// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
	GroupsFilters []string `pulumi:"groupsFilters"`
	// URI that identifies the issuer.
	Issuer *string `pulumi:"issuer"`
	// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
	IssuerMode *string `pulumi:"issuerMode"`
	// The ID of the signing key.
	Kid *string `pulumi:"kid"`
	// Maximum allowable clock-skew when processing messages from the IdP.
	MaxClockSkew *int `pulumi:"maxClockSkew"`
	// The Application's display name.
	Name *string `pulumi:"name"`
	// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	NameFormat *string `pulumi:"nameFormat"`
	// Determines if the IdP should act as a source of truth for user profile attributes.
	ProfileMaster *bool `pulumi:"profileMaster"`
	// Provisioning action for an IdP user during authentication.
	ProvisioningAction *string `pulumi:"provisioningAction"`
	// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
	RequestSignatureAlgorithm *string `pulumi:"requestSignatureAlgorithm"`
	// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
	RequestSignatureScope *string `pulumi:"requestSignatureScope"`
	// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
	ResponseSignatureAlgorithm *string `pulumi:"responseSignatureAlgorithm"`
	// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
	ResponseSignatureScope *string `pulumi:"responseSignatureScope"`
	// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
	SsoBinding *string `pulumi:"ssoBinding"`
	// URI reference indicating the address to which the AuthnRequest message is sent.
	SsoDestination *string `pulumi:"ssoDestination"`
	// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
	SsoUrl *string `pulumi:"ssoUrl"`
	// Status of the IdP.
	Status *string `pulumi:"status"`
	// Optional regular expression pattern used to filter untrusted IdP usernames.
	SubjectFilter *string `pulumi:"subjectFilter"`
	// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	SubjectFormats []string `pulumi:"subjectFormats"`
	// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchAttribute *string `pulumi:"subjectMatchAttribute"`
	// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchType *string `pulumi:"subjectMatchType"`
	// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
	SuspendedAction *string `pulumi:"suspendedAction"`
	// Type of the IdP.
	Type *string `pulumi:"type"`
	// User type ID. Can be used as `targetId` in the `profile.Mapping` resource.
	UserTypeId *string `pulumi:"userTypeId"`
	// Okta EL Expression to generate or transform a unique username for the IdP user.
	UsernameTemplate *string `pulumi:"usernameTemplate"`
}

type SamlState struct {
	// Specifies the account linking action for an IdP user.
	AccountLinkAction pulumi.StringPtrInput
	// Group memberships to determine link candidates.
	AccountLinkGroupIncludes pulumi.StringArrayInput
	AcsBinding               pulumi.StringPtrInput
	// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
	AcsType pulumi.StringPtrInput
	// The audience restriction for the IdP.
	Audience pulumi.StringPtrInput
	// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
	DeprovisionedAction pulumi.StringPtrInput
	// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
	GroupsAction pulumi.StringPtrInput
	// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
	GroupsAssignments pulumi.StringArrayInput
	// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
	GroupsAttribute pulumi.StringPtrInput
	// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
	GroupsFilters pulumi.StringArrayInput
	// URI that identifies the issuer.
	Issuer pulumi.StringPtrInput
	// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
	IssuerMode pulumi.StringPtrInput
	// The ID of the signing key.
	Kid pulumi.StringPtrInput
	// Maximum allowable clock-skew when processing messages from the IdP.
	MaxClockSkew pulumi.IntPtrInput
	// The Application's display name.
	Name pulumi.StringPtrInput
	// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	NameFormat pulumi.StringPtrInput
	// Determines if the IdP should act as a source of truth for user profile attributes.
	ProfileMaster pulumi.BoolPtrInput
	// Provisioning action for an IdP user during authentication.
	ProvisioningAction pulumi.StringPtrInput
	// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
	RequestSignatureAlgorithm pulumi.StringPtrInput
	// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
	RequestSignatureScope pulumi.StringPtrInput
	// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
	ResponseSignatureAlgorithm pulumi.StringPtrInput
	// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
	ResponseSignatureScope pulumi.StringPtrInput
	// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
	SsoBinding pulumi.StringPtrInput
	// URI reference indicating the address to which the AuthnRequest message is sent.
	SsoDestination pulumi.StringPtrInput
	// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
	SsoUrl pulumi.StringPtrInput
	// Status of the IdP.
	Status pulumi.StringPtrInput
	// Optional regular expression pattern used to filter untrusted IdP usernames.
	SubjectFilter pulumi.StringPtrInput
	// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	SubjectFormats pulumi.StringArrayInput
	// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchAttribute pulumi.StringPtrInput
	// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchType pulumi.StringPtrInput
	// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
	SuspendedAction pulumi.StringPtrInput
	// Type of the IdP.
	Type pulumi.StringPtrInput
	// User type ID. Can be used as `targetId` in the `profile.Mapping` resource.
	UserTypeId pulumi.StringPtrInput
	// Okta EL Expression to generate or transform a unique username for the IdP user.
	UsernameTemplate pulumi.StringPtrInput
}

func (SamlState) ElementType() reflect.Type {
	return reflect.TypeOf((*samlState)(nil)).Elem()
}

type samlArgs struct {
	// Specifies the account linking action for an IdP user.
	AccountLinkAction *string `pulumi:"accountLinkAction"`
	// Group memberships to determine link candidates.
	AccountLinkGroupIncludes []string `pulumi:"accountLinkGroupIncludes"`
	// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
	AcsType *string `pulumi:"acsType"`
	// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
	DeprovisionedAction *string `pulumi:"deprovisionedAction"`
	// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
	GroupsAction *string `pulumi:"groupsAction"`
	// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
	GroupsAssignments []string `pulumi:"groupsAssignments"`
	// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
	GroupsAttribute *string `pulumi:"groupsAttribute"`
	// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
	GroupsFilters []string `pulumi:"groupsFilters"`
	// URI that identifies the issuer.
	Issuer string `pulumi:"issuer"`
	// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
	IssuerMode *string `pulumi:"issuerMode"`
	// The ID of the signing key.
	Kid string `pulumi:"kid"`
	// Maximum allowable clock-skew when processing messages from the IdP.
	MaxClockSkew *int `pulumi:"maxClockSkew"`
	// The Application's display name.
	Name *string `pulumi:"name"`
	// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	NameFormat *string `pulumi:"nameFormat"`
	// Determines if the IdP should act as a source of truth for user profile attributes.
	ProfileMaster *bool `pulumi:"profileMaster"`
	// Provisioning action for an IdP user during authentication.
	ProvisioningAction *string `pulumi:"provisioningAction"`
	// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
	RequestSignatureAlgorithm *string `pulumi:"requestSignatureAlgorithm"`
	// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
	RequestSignatureScope *string `pulumi:"requestSignatureScope"`
	// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
	ResponseSignatureAlgorithm *string `pulumi:"responseSignatureAlgorithm"`
	// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
	ResponseSignatureScope *string `pulumi:"responseSignatureScope"`
	// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
	SsoBinding *string `pulumi:"ssoBinding"`
	// URI reference indicating the address to which the AuthnRequest message is sent.
	SsoDestination *string `pulumi:"ssoDestination"`
	// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
	SsoUrl string `pulumi:"ssoUrl"`
	// Status of the IdP.
	Status *string `pulumi:"status"`
	// Optional regular expression pattern used to filter untrusted IdP usernames.
	SubjectFilter *string `pulumi:"subjectFilter"`
	// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	SubjectFormats []string `pulumi:"subjectFormats"`
	// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchAttribute *string `pulumi:"subjectMatchAttribute"`
	// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchType *string `pulumi:"subjectMatchType"`
	// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
	SuspendedAction *string `pulumi:"suspendedAction"`
	// Okta EL Expression to generate or transform a unique username for the IdP user.
	UsernameTemplate *string `pulumi:"usernameTemplate"`
}

// The set of arguments for constructing a Saml resource.
type SamlArgs struct {
	// Specifies the account linking action for an IdP user.
	AccountLinkAction pulumi.StringPtrInput
	// Group memberships to determine link candidates.
	AccountLinkGroupIncludes pulumi.StringArrayInput
	// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
	AcsType pulumi.StringPtrInput
	// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
	DeprovisionedAction pulumi.StringPtrInput
	// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
	GroupsAction pulumi.StringPtrInput
	// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
	GroupsAssignments pulumi.StringArrayInput
	// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
	GroupsAttribute pulumi.StringPtrInput
	// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
	GroupsFilters pulumi.StringArrayInput
	// URI that identifies the issuer.
	Issuer pulumi.StringInput
	// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
	IssuerMode pulumi.StringPtrInput
	// The ID of the signing key.
	Kid pulumi.StringInput
	// Maximum allowable clock-skew when processing messages from the IdP.
	MaxClockSkew pulumi.IntPtrInput
	// The Application's display name.
	Name pulumi.StringPtrInput
	// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	NameFormat pulumi.StringPtrInput
	// Determines if the IdP should act as a source of truth for user profile attributes.
	ProfileMaster pulumi.BoolPtrInput
	// Provisioning action for an IdP user during authentication.
	ProvisioningAction pulumi.StringPtrInput
	// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
	RequestSignatureAlgorithm pulumi.StringPtrInput
	// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
	RequestSignatureScope pulumi.StringPtrInput
	// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
	ResponseSignatureAlgorithm pulumi.StringPtrInput
	// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
	ResponseSignatureScope pulumi.StringPtrInput
	// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
	SsoBinding pulumi.StringPtrInput
	// URI reference indicating the address to which the AuthnRequest message is sent.
	SsoDestination pulumi.StringPtrInput
	// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
	SsoUrl pulumi.StringInput
	// Status of the IdP.
	Status pulumi.StringPtrInput
	// Optional regular expression pattern used to filter untrusted IdP usernames.
	SubjectFilter pulumi.StringPtrInput
	// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
	SubjectFormats pulumi.StringArrayInput
	// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchAttribute pulumi.StringPtrInput
	// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
	SubjectMatchType pulumi.StringPtrInput
	// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
	SuspendedAction pulumi.StringPtrInput
	// Okta EL Expression to generate or transform a unique username for the IdP user.
	UsernameTemplate pulumi.StringPtrInput
}

func (SamlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*samlArgs)(nil)).Elem()
}

type SamlInput interface {
	pulumi.Input

	ToSamlOutput() SamlOutput
	ToSamlOutputWithContext(ctx context.Context) SamlOutput
}

func (*Saml) ElementType() reflect.Type {
	return reflect.TypeOf((**Saml)(nil)).Elem()
}

func (i *Saml) ToSamlOutput() SamlOutput {
	return i.ToSamlOutputWithContext(context.Background())
}

func (i *Saml) ToSamlOutputWithContext(ctx context.Context) SamlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlOutput)
}

// SamlArrayInput is an input type that accepts SamlArray and SamlArrayOutput values.
// You can construct a concrete instance of `SamlArrayInput` via:
//
//	SamlArray{ SamlArgs{...} }
type SamlArrayInput interface {
	pulumi.Input

	ToSamlArrayOutput() SamlArrayOutput
	ToSamlArrayOutputWithContext(context.Context) SamlArrayOutput
}

type SamlArray []SamlInput

func (SamlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Saml)(nil)).Elem()
}

func (i SamlArray) ToSamlArrayOutput() SamlArrayOutput {
	return i.ToSamlArrayOutputWithContext(context.Background())
}

func (i SamlArray) ToSamlArrayOutputWithContext(ctx context.Context) SamlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlArrayOutput)
}

// SamlMapInput is an input type that accepts SamlMap and SamlMapOutput values.
// You can construct a concrete instance of `SamlMapInput` via:
//
//	SamlMap{ "key": SamlArgs{...} }
type SamlMapInput interface {
	pulumi.Input

	ToSamlMapOutput() SamlMapOutput
	ToSamlMapOutputWithContext(context.Context) SamlMapOutput
}

type SamlMap map[string]SamlInput

func (SamlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Saml)(nil)).Elem()
}

func (i SamlMap) ToSamlMapOutput() SamlMapOutput {
	return i.ToSamlMapOutputWithContext(context.Background())
}

func (i SamlMap) ToSamlMapOutputWithContext(ctx context.Context) SamlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlMapOutput)
}

type SamlOutput struct{ *pulumi.OutputState }

func (SamlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Saml)(nil)).Elem()
}

func (o SamlOutput) ToSamlOutput() SamlOutput {
	return o
}

func (o SamlOutput) ToSamlOutputWithContext(ctx context.Context) SamlOutput {
	return o
}

// Specifies the account linking action for an IdP user.
func (o SamlOutput) AccountLinkAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.AccountLinkAction }).(pulumi.StringPtrOutput)
}

// Group memberships to determine link candidates.
func (o SamlOutput) AccountLinkGroupIncludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringArrayOutput { return v.AccountLinkGroupIncludes }).(pulumi.StringArrayOutput)
}

func (o SamlOutput) AcsBinding() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.AcsBinding }).(pulumi.StringOutput)
}

// The type of ACS. It can be `"INSTANCE"` or `"ORG"`.
func (o SamlOutput) AcsType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.AcsType }).(pulumi.StringPtrOutput)
}

// The audience restriction for the IdP.
func (o SamlOutput) Audience() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.Audience }).(pulumi.StringOutput)
}

// Action for a previously deprovisioned IdP user during authentication. Can be `"NONE"` or `"REACTIVATE"`.
func (o SamlOutput) DeprovisionedAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.DeprovisionedAction }).(pulumi.StringPtrOutput)
}

// Provisioning action for IdP user's group memberships. It can be `"NONE"`, `"SYNC"`, `"APPEND"`, or `"ASSIGN"`.
func (o SamlOutput) GroupsAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.GroupsAction }).(pulumi.StringPtrOutput)
}

// List of Okta Group IDs to add an IdP user as a member with the `"ASSIGN"` `groupsAction`.
func (o SamlOutput) GroupsAssignments() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringArrayOutput { return v.GroupsAssignments }).(pulumi.StringArrayOutput)
}

// IdP user profile attribute name (case-insensitive) for an array value that contains group memberships.
func (o SamlOutput) GroupsAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.GroupsAttribute }).(pulumi.StringPtrOutput)
}

// Whitelist of Okta Group identifiers that are allowed for the `"APPEND"` or `"SYNC"` `groupsAction`.
func (o SamlOutput) GroupsFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringArrayOutput { return v.GroupsFilters }).(pulumi.StringArrayOutput)
}

// URI that identifies the issuer.
func (o SamlOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL. It can be `"ORG_URL"` or `"CUSTOM_URL"`.
func (o SamlOutput) IssuerMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.IssuerMode }).(pulumi.StringPtrOutput)
}

// The ID of the signing key.
func (o SamlOutput) Kid() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.Kid }).(pulumi.StringOutput)
}

// Maximum allowable clock-skew when processing messages from the IdP.
func (o SamlOutput) MaxClockSkew() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.IntPtrOutput { return v.MaxClockSkew }).(pulumi.IntPtrOutput)
}

// The Application's display name.
func (o SamlOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name identifier format to use. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
func (o SamlOutput) NameFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.NameFormat }).(pulumi.StringPtrOutput)
}

// Determines if the IdP should act as a source of truth for user profile attributes.
func (o SamlOutput) ProfileMaster() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.BoolPtrOutput { return v.ProfileMaster }).(pulumi.BoolPtrOutput)
}

// Provisioning action for an IdP user during authentication.
func (o SamlOutput) ProvisioningAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.ProvisioningAction }).(pulumi.StringPtrOutput)
}

// The XML digital signature algorithm used when signing an AuthnRequest message. It can be `"SHA-256"` or `"SHA-1"`.
func (o SamlOutput) RequestSignatureAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.RequestSignatureAlgorithm }).(pulumi.StringPtrOutput)
}

// Specifies whether to digitally sign an AuthnRequest messages to the IdP. It can be `"REQUEST"` or `"NONE"`.
func (o SamlOutput) RequestSignatureScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.RequestSignatureScope }).(pulumi.StringPtrOutput)
}

// The minimum XML digital signature algorithm allowed when verifying a SAMLResponse message or Assertion element. It can be `"SHA-256"` or `"SHA-1"`.
func (o SamlOutput) ResponseSignatureAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.ResponseSignatureAlgorithm }).(pulumi.StringPtrOutput)
}

// Specifies whether to verify a SAMLResponse message or Assertion element XML digital signature. It can be `"RESPONSE"`, `"ASSERTION"`, or `"ANY"`.
func (o SamlOutput) ResponseSignatureScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.ResponseSignatureScope }).(pulumi.StringPtrOutput)
}

// The method of making an SSO request. It can be set to `"HTTP-POST"` or `"HTTP-REDIRECT"`.
func (o SamlOutput) SsoBinding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SsoBinding }).(pulumi.StringPtrOutput)
}

// URI reference indicating the address to which the AuthnRequest message is sent.
func (o SamlOutput) SsoDestination() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SsoDestination }).(pulumi.StringPtrOutput)
}

// URL of binding-specific endpoint to send an AuthnRequest message to IdP.
func (o SamlOutput) SsoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.SsoUrl }).(pulumi.StringOutput)
}

// Status of the IdP.
func (o SamlOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Optional regular expression pattern used to filter untrusted IdP usernames.
func (o SamlOutput) SubjectFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SubjectFilter }).(pulumi.StringPtrOutput)
}

// The name format. By default `"urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified"`.
func (o SamlOutput) SubjectFormats() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringArrayOutput { return v.SubjectFormats }).(pulumi.StringArrayOutput)
}

// Okta user profile attribute for matching transformed IdP username. Only for matchType `"CUSTOM_ATTRIBUTE"`.
func (o SamlOutput) SubjectMatchAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SubjectMatchAttribute }).(pulumi.StringPtrOutput)
}

// Determines the Okta user profile attribute match conditions for account linking and authentication of the transformed IdP username. By default, it is set to `"USERNAME"`. It can be set to `"USERNAME"`, `"EMAIL"`, `"USERNAME_OR_EMAIL"` or `"CUSTOM_ATTRIBUTE"`.
func (o SamlOutput) SubjectMatchType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SubjectMatchType }).(pulumi.StringPtrOutput)
}

// Action for a previously suspended IdP user during authentication. Can be set to `"NONE"` or `"UNSUSPEND"`
func (o SamlOutput) SuspendedAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.SuspendedAction }).(pulumi.StringPtrOutput)
}

// Type of the IdP.
func (o SamlOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User type ID. Can be used as `targetId` in the `profile.Mapping` resource.
func (o SamlOutput) UserTypeId() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.UserTypeId }).(pulumi.StringOutput)
}

// Okta EL Expression to generate or transform a unique username for the IdP user.
func (o SamlOutput) UsernameTemplate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringPtrOutput { return v.UsernameTemplate }).(pulumi.StringPtrOutput)
}

type SamlArrayOutput struct{ *pulumi.OutputState }

func (SamlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Saml)(nil)).Elem()
}

func (o SamlArrayOutput) ToSamlArrayOutput() SamlArrayOutput {
	return o
}

func (o SamlArrayOutput) ToSamlArrayOutputWithContext(ctx context.Context) SamlArrayOutput {
	return o
}

func (o SamlArrayOutput) Index(i pulumi.IntInput) SamlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Saml {
		return vs[0].([]*Saml)[vs[1].(int)]
	}).(SamlOutput)
}

type SamlMapOutput struct{ *pulumi.OutputState }

func (SamlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Saml)(nil)).Elem()
}

func (o SamlMapOutput) ToSamlMapOutput() SamlMapOutput {
	return o
}

func (o SamlMapOutput) ToSamlMapOutputWithContext(ctx context.Context) SamlMapOutput {
	return o
}

func (o SamlMapOutput) MapIndex(k pulumi.StringInput) SamlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Saml {
		return vs[0].(map[string]*Saml)[vs[1].(string)]
	}).(SamlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SamlInput)(nil)).Elem(), &Saml{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlArrayInput)(nil)).Elem(), SamlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlMapInput)(nil)).Elem(), SamlMap{})
	pulumi.RegisterOutputType(SamlOutput{})
	pulumi.RegisterOutputType(SamlArrayOutput{})
	pulumi.RegisterOutputType(SamlMapOutput{})
}
