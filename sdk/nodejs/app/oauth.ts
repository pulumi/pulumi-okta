// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource allows you to create and configure an OIDC Application.
 * > During an apply if there is change in status the app will first be
 * activated or deactivated in accordance with the status change. Then, all
 * other arguments that changed will be applied.
 *
 * > `okta.app.OAuthRedirectUri` has been marked deprecated and will be removed
 * in the v5 release of the provider. Operators should manage the redirect URIs for
 * an oauth app directly on that resource.
 *
 * ### Private Keys
 *
 * The private key format that an Okta OAuth app expects is PKCS#8 (unencrypted).
 * The operator either uploads their own private key or Okta can generate one in
 * the Admin UI Panel under the apps Client Credentials. PKCS#8 format can be
 * identified by a header that starts with `-----BEGIN PRIVATE KEY-----`. If the
 * operator has a PKCS#1 (unencrypted) format private key (the header starts with
 * `-----BEGIN RSA PRIVATE KEY-----`) they can generate a PKCS#8 format
 * key with `openssl`:
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:app/oAuth:OAuth example <app_id>
 * ```
 */
export class OAuth extends pulumi.CustomResource {
    /**
     * Get an existing OAuth resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OAuthState, opts?: pulumi.CustomResourceOptions): OAuth {
        return new OAuth(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:app/oAuth:OAuth';

    /**
     * Returns true if the given object is an instance of OAuth.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OAuth {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OAuth.__pulumiType;
    }

    /**
     * Custom error page URL
     */
    public readonly accessibilityErrorRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * Custom login page URL
     */
    public readonly accessibilityLoginRedirectUrl!: pulumi.Output<string | undefined>;
    /**
     * Enable self service. Default is `false`
     */
    public readonly accessibilitySelfService!: pulumi.Output<boolean | undefined>;
    /**
     * Application notes for admins.
     */
    public readonly adminNote!: pulumi.Output<string | undefined>;
    /**
     * Displays specific appLinks for the app. The value for each application link should be boolean.
     */
    public readonly appLinksJson!: pulumi.Output<string | undefined>;
    /**
     * Application settings in JSON format
     */
    public readonly appSettingsJson!: pulumi.Output<string | undefined>;
    /**
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application. From now on, there is no need to attach authenticationPolicy for applications of type `SERVICE` in the upcoming release.
     */
    public readonly authenticationPolicy!: pulumi.Output<string>;
    /**
     * Requested key rotation mode. If
     * 			auto*key*rotation isn't specified, the client automatically opts in for Okta's
     * 			key rotation. You can update this property via the API or via the administrator
     * 			UI.
     * 			See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object"
     */
    public readonly autoKeyRotation!: pulumi.Output<boolean | undefined>;
    /**
     * Display auto submit toolbar
     */
    public readonly autoSubmitToolbar!: pulumi.Output<boolean | undefined>;
    /**
     * The user provided OAuth client secret key value, this can be set when token*endpoint*auth*method is client*secret*basic. This does nothing when `omit*secret is set to true.
     */
    public readonly clientBasicSecret!: pulumi.Output<string | undefined>;
    /**
     * OAuth client ID. If set during creation, app is created with this id.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * OAuth client secret value, this is output only. This will be in plain text in your statefile unless you set omitSecret above.
     */
    public /*out*/ readonly clientSecret!: pulumi.Output<string>;
    /**
     * URI to a web page providing information about the client.
     */
    public readonly clientUri!: pulumi.Output<string | undefined>;
    /**
     * *Early Access Property*. Indicates whether user consent is required or implicit. Valid values: REQUIRED, TRUSTED. Default value is TRUSTED
     */
    public readonly consentMethod!: pulumi.Output<string | undefined>;
    /**
     * Application notes for end users.
     */
    public readonly enduserNote!: pulumi.Output<string | undefined>;
    /**
     * List of OAuth 2.0 grant types. Conditional validation params found here https://developer.okta.com/docs/api/resources/apps#credentials-settings-details. Defaults to minimum requirements per app type.
     */
    public readonly grantTypes!: pulumi.Output<string[]>;
    /**
     * Groups claim for an OpenID Connect client application (argument is ignored when API auth is done with OAuth 2.0 credentials)
     */
    public readonly groupsClaim!: pulumi.Output<outputs.app.OAuthGroupsClaim | undefined>;
    /**
     * Do not display application icon on mobile app
     */
    public readonly hideIos!: pulumi.Output<boolean | undefined>;
    /**
     * Do not display application icon to users
     */
    public readonly hideWeb!: pulumi.Output<boolean | undefined>;
    /**
     * *Early Access Property*. Enable Federation Broker Mode.
     */
    public readonly implicitAssignment!: pulumi.Output<boolean | undefined>;
    /**
     * *Early Access Property*. Indicates whether the Okta Authorization Server uses the original Okta org domain URL or a custom domain URL as the issuer of ID token for this client.
     */
    public readonly issuerMode!: pulumi.Output<string | undefined>;
    public readonly jwks!: pulumi.Output<outputs.app.OAuthJwk[] | undefined>;
    /**
     * URL reference to JWKS
     */
    public readonly jwksUri!: pulumi.Output<string | undefined>;
    /**
     * The Application's display name.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The type of Idp-Initiated login that the client supports, if any
     */
    public readonly loginMode!: pulumi.Output<string | undefined>;
    /**
     * List of scopes to use for the request
     */
    public readonly loginScopes!: pulumi.Output<string[] | undefined>;
    /**
     * URI that initiates login.
     */
    public readonly loginUri!: pulumi.Output<string | undefined>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    public readonly logo!: pulumi.Output<string | undefined>;
    /**
     * URI that references a logo for the client.
     */
    public readonly logoUri!: pulumi.Output<string | undefined>;
    /**
     * URL of the application's logo
     */
    public /*out*/ readonly logoUrl!: pulumi.Output<string>;
    /**
     * Name of the app.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * This tells the provider not manage the client*secret value in state. When this is false (the default), it will cause the auto-generated client*secret to be persisted in the clientSecret attribute in state. This also means that every time an update to this app is run, this value is also set on the API. If this changes from false => true, the `clientSecret` is dropped from state and the secret at the time of the apply is what remains. If this is ever changes from true => false your app will be recreated, due to the need to regenerate a secret we can store in state.
     */
    public readonly omitSecret!: pulumi.Output<boolean | undefined>;
    /**
     * Require Proof Key for Code Exchange (PKCE) for additional verification key rotation mode. See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object
     */
    public readonly pkceRequired!: pulumi.Output<boolean>;
    /**
     * URI to web page providing client policy document.
     */
    public readonly policyUri!: pulumi.Output<string | undefined>;
    /**
     * List of URIs for redirection after logout. Note: see okta*app*oauth*post*logout*redirect*uri for appending to this list in a decentralized way.
     */
    public readonly postLogoutRedirectUris!: pulumi.Output<string[] | undefined>;
    /**
     * Custom JSON that represents an OAuth application's profile
     */
    public readonly profile!: pulumi.Output<string | undefined>;
    /**
     * List of URIs for use in the redirect-based flow. This is required for all application types except service. Note: see okta*app*oauth*redirect*uri for appending to this list in a decentralized way.
     */
    public readonly redirectUris!: pulumi.Output<string[] | undefined>;
    /**
     * *Early Access Property* Grace period for token rotation, required with grant types refresh_token
     */
    public readonly refreshTokenLeeway!: pulumi.Output<number | undefined>;
    /**
     * *Early Access Property* Refresh token rotation behavior, required with grant types refresh_token
     */
    public readonly refreshTokenRotation!: pulumi.Output<string | undefined>;
    /**
     * List of OAuth 2.0 response type strings. Valid values are any combination of: `code`, `token`, and `idToken`.
     */
    public readonly responseTypes!: pulumi.Output<string[]>;
    /**
     * Sign on mode of application.
     */
    public /*out*/ readonly signOnMode!: pulumi.Output<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * Requested authentication method for the token endpoint, valid values include:  'client*secret*basic', 'client*secret*post', 'client*secret*jwt', 'private*key*jwt', 'none', etc.
     */
    public readonly tokenEndpointAuthMethod!: pulumi.Output<string | undefined>;
    /**
     * URI to web page providing client tos (terms of service).
     */
    public readonly tosUri!: pulumi.Output<string | undefined>;
    /**
     * The type of client application.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    public readonly userNameTemplate!: pulumi.Output<string | undefined>;
    /**
     * Push username on update. Valid values: `PUSH` and `DONT_PUSH`
     */
    public readonly userNameTemplatePushStatus!: pulumi.Output<string | undefined>;
    /**
     * Username template suffix
     */
    public readonly userNameTemplateSuffix!: pulumi.Output<string | undefined>;
    /**
     * Username template type. Default: `BUILT_IN`
     */
    public readonly userNameTemplateType!: pulumi.Output<string | undefined>;
    /**
     * *Early Access Property*. Indicates if the client is allowed to use wildcard matching of redirect_uris
     */
    public readonly wildcardRedirect!: pulumi.Output<string | undefined>;

    /**
     * Create a OAuth resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OAuthArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OAuthArgs | OAuthState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OAuthState | undefined;
            resourceInputs["accessibilityErrorRedirectUrl"] = state ? state.accessibilityErrorRedirectUrl : undefined;
            resourceInputs["accessibilityLoginRedirectUrl"] = state ? state.accessibilityLoginRedirectUrl : undefined;
            resourceInputs["accessibilitySelfService"] = state ? state.accessibilitySelfService : undefined;
            resourceInputs["adminNote"] = state ? state.adminNote : undefined;
            resourceInputs["appLinksJson"] = state ? state.appLinksJson : undefined;
            resourceInputs["appSettingsJson"] = state ? state.appSettingsJson : undefined;
            resourceInputs["authenticationPolicy"] = state ? state.authenticationPolicy : undefined;
            resourceInputs["autoKeyRotation"] = state ? state.autoKeyRotation : undefined;
            resourceInputs["autoSubmitToolbar"] = state ? state.autoSubmitToolbar : undefined;
            resourceInputs["clientBasicSecret"] = state ? state.clientBasicSecret : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["clientUri"] = state ? state.clientUri : undefined;
            resourceInputs["consentMethod"] = state ? state.consentMethod : undefined;
            resourceInputs["enduserNote"] = state ? state.enduserNote : undefined;
            resourceInputs["grantTypes"] = state ? state.grantTypes : undefined;
            resourceInputs["groupsClaim"] = state ? state.groupsClaim : undefined;
            resourceInputs["hideIos"] = state ? state.hideIos : undefined;
            resourceInputs["hideWeb"] = state ? state.hideWeb : undefined;
            resourceInputs["implicitAssignment"] = state ? state.implicitAssignment : undefined;
            resourceInputs["issuerMode"] = state ? state.issuerMode : undefined;
            resourceInputs["jwks"] = state ? state.jwks : undefined;
            resourceInputs["jwksUri"] = state ? state.jwksUri : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["loginMode"] = state ? state.loginMode : undefined;
            resourceInputs["loginScopes"] = state ? state.loginScopes : undefined;
            resourceInputs["loginUri"] = state ? state.loginUri : undefined;
            resourceInputs["logo"] = state ? state.logo : undefined;
            resourceInputs["logoUri"] = state ? state.logoUri : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["omitSecret"] = state ? state.omitSecret : undefined;
            resourceInputs["pkceRequired"] = state ? state.pkceRequired : undefined;
            resourceInputs["policyUri"] = state ? state.policyUri : undefined;
            resourceInputs["postLogoutRedirectUris"] = state ? state.postLogoutRedirectUris : undefined;
            resourceInputs["profile"] = state ? state.profile : undefined;
            resourceInputs["redirectUris"] = state ? state.redirectUris : undefined;
            resourceInputs["refreshTokenLeeway"] = state ? state.refreshTokenLeeway : undefined;
            resourceInputs["refreshTokenRotation"] = state ? state.refreshTokenRotation : undefined;
            resourceInputs["responseTypes"] = state ? state.responseTypes : undefined;
            resourceInputs["signOnMode"] = state ? state.signOnMode : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = state ? state.tokenEndpointAuthMethod : undefined;
            resourceInputs["tosUri"] = state ? state.tosUri : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["userNameTemplate"] = state ? state.userNameTemplate : undefined;
            resourceInputs["userNameTemplatePushStatus"] = state ? state.userNameTemplatePushStatus : undefined;
            resourceInputs["userNameTemplateSuffix"] = state ? state.userNameTemplateSuffix : undefined;
            resourceInputs["userNameTemplateType"] = state ? state.userNameTemplateType : undefined;
            resourceInputs["wildcardRedirect"] = state ? state.wildcardRedirect : undefined;
        } else {
            const args = argsOrState as OAuthArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accessibilityErrorRedirectUrl"] = args ? args.accessibilityErrorRedirectUrl : undefined;
            resourceInputs["accessibilityLoginRedirectUrl"] = args ? args.accessibilityLoginRedirectUrl : undefined;
            resourceInputs["accessibilitySelfService"] = args ? args.accessibilitySelfService : undefined;
            resourceInputs["adminNote"] = args ? args.adminNote : undefined;
            resourceInputs["appLinksJson"] = args ? args.appLinksJson : undefined;
            resourceInputs["appSettingsJson"] = args ? args.appSettingsJson : undefined;
            resourceInputs["authenticationPolicy"] = args ? args.authenticationPolicy : undefined;
            resourceInputs["autoKeyRotation"] = args ? args.autoKeyRotation : undefined;
            resourceInputs["autoSubmitToolbar"] = args ? args.autoSubmitToolbar : undefined;
            resourceInputs["clientBasicSecret"] = args?.clientBasicSecret ? pulumi.secret(args.clientBasicSecret) : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientUri"] = args ? args.clientUri : undefined;
            resourceInputs["consentMethod"] = args ? args.consentMethod : undefined;
            resourceInputs["enduserNote"] = args ? args.enduserNote : undefined;
            resourceInputs["grantTypes"] = args ? args.grantTypes : undefined;
            resourceInputs["groupsClaim"] = args ? args.groupsClaim : undefined;
            resourceInputs["hideIos"] = args ? args.hideIos : undefined;
            resourceInputs["hideWeb"] = args ? args.hideWeb : undefined;
            resourceInputs["implicitAssignment"] = args ? args.implicitAssignment : undefined;
            resourceInputs["issuerMode"] = args ? args.issuerMode : undefined;
            resourceInputs["jwks"] = args ? args.jwks : undefined;
            resourceInputs["jwksUri"] = args ? args.jwksUri : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["loginMode"] = args ? args.loginMode : undefined;
            resourceInputs["loginScopes"] = args ? args.loginScopes : undefined;
            resourceInputs["loginUri"] = args ? args.loginUri : undefined;
            resourceInputs["logo"] = args ? args.logo : undefined;
            resourceInputs["logoUri"] = args ? args.logoUri : undefined;
            resourceInputs["omitSecret"] = args ? args.omitSecret : undefined;
            resourceInputs["pkceRequired"] = args ? args.pkceRequired : undefined;
            resourceInputs["policyUri"] = args ? args.policyUri : undefined;
            resourceInputs["postLogoutRedirectUris"] = args ? args.postLogoutRedirectUris : undefined;
            resourceInputs["profile"] = args ? args.profile : undefined;
            resourceInputs["redirectUris"] = args ? args.redirectUris : undefined;
            resourceInputs["refreshTokenLeeway"] = args ? args.refreshTokenLeeway : undefined;
            resourceInputs["refreshTokenRotation"] = args ? args.refreshTokenRotation : undefined;
            resourceInputs["responseTypes"] = args ? args.responseTypes : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = args ? args.tokenEndpointAuthMethod : undefined;
            resourceInputs["tosUri"] = args ? args.tosUri : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["userNameTemplate"] = args ? args.userNameTemplate : undefined;
            resourceInputs["userNameTemplatePushStatus"] = args ? args.userNameTemplatePushStatus : undefined;
            resourceInputs["userNameTemplateSuffix"] = args ? args.userNameTemplateSuffix : undefined;
            resourceInputs["userNameTemplateType"] = args ? args.userNameTemplateType : undefined;
            resourceInputs["wildcardRedirect"] = args ? args.wildcardRedirect : undefined;
            resourceInputs["clientSecret"] = undefined /*out*/;
            resourceInputs["logoUrl"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["signOnMode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientBasicSecret", "clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(OAuth.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OAuth resources.
 */
export interface OAuthState {
    /**
     * Custom error page URL
     */
    accessibilityErrorRedirectUrl?: pulumi.Input<string>;
    /**
     * Custom login page URL
     */
    accessibilityLoginRedirectUrl?: pulumi.Input<string>;
    /**
     * Enable self service. Default is `false`
     */
    accessibilitySelfService?: pulumi.Input<boolean>;
    /**
     * Application notes for admins.
     */
    adminNote?: pulumi.Input<string>;
    /**
     * Displays specific appLinks for the app. The value for each application link should be boolean.
     */
    appLinksJson?: pulumi.Input<string>;
    /**
     * Application settings in JSON format
     */
    appSettingsJson?: pulumi.Input<string>;
    /**
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application. From now on, there is no need to attach authenticationPolicy for applications of type `SERVICE` in the upcoming release.
     */
    authenticationPolicy?: pulumi.Input<string>;
    /**
     * Requested key rotation mode. If
     * 			auto*key*rotation isn't specified, the client automatically opts in for Okta's
     * 			key rotation. You can update this property via the API or via the administrator
     * 			UI.
     * 			See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object"
     */
    autoKeyRotation?: pulumi.Input<boolean>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
    /**
     * The user provided OAuth client secret key value, this can be set when token*endpoint*auth*method is client*secret*basic. This does nothing when `omit*secret is set to true.
     */
    clientBasicSecret?: pulumi.Input<string>;
    /**
     * OAuth client ID. If set during creation, app is created with this id.
     */
    clientId?: pulumi.Input<string>;
    /**
     * OAuth client secret value, this is output only. This will be in plain text in your statefile unless you set omitSecret above.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * URI to a web page providing information about the client.
     */
    clientUri?: pulumi.Input<string>;
    /**
     * *Early Access Property*. Indicates whether user consent is required or implicit. Valid values: REQUIRED, TRUSTED. Default value is TRUSTED
     */
    consentMethod?: pulumi.Input<string>;
    /**
     * Application notes for end users.
     */
    enduserNote?: pulumi.Input<string>;
    /**
     * List of OAuth 2.0 grant types. Conditional validation params found here https://developer.okta.com/docs/api/resources/apps#credentials-settings-details. Defaults to minimum requirements per app type.
     */
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Groups claim for an OpenID Connect client application (argument is ignored when API auth is done with OAuth 2.0 credentials)
     */
    groupsClaim?: pulumi.Input<inputs.app.OAuthGroupsClaim>;
    /**
     * Do not display application icon on mobile app
     */
    hideIos?: pulumi.Input<boolean>;
    /**
     * Do not display application icon to users
     */
    hideWeb?: pulumi.Input<boolean>;
    /**
     * *Early Access Property*. Enable Federation Broker Mode.
     */
    implicitAssignment?: pulumi.Input<boolean>;
    /**
     * *Early Access Property*. Indicates whether the Okta Authorization Server uses the original Okta org domain URL or a custom domain URL as the issuer of ID token for this client.
     */
    issuerMode?: pulumi.Input<string>;
    jwks?: pulumi.Input<pulumi.Input<inputs.app.OAuthJwk>[]>;
    /**
     * URL reference to JWKS
     */
    jwksUri?: pulumi.Input<string>;
    /**
     * The Application's display name.
     */
    label?: pulumi.Input<string>;
    /**
     * The type of Idp-Initiated login that the client supports, if any
     */
    loginMode?: pulumi.Input<string>;
    /**
     * List of scopes to use for the request
     */
    loginScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URI that initiates login.
     */
    loginUri?: pulumi.Input<string>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    logo?: pulumi.Input<string>;
    /**
     * URI that references a logo for the client.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * URL of the application's logo
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Name of the app.
     */
    name?: pulumi.Input<string>;
    /**
     * This tells the provider not manage the client*secret value in state. When this is false (the default), it will cause the auto-generated client*secret to be persisted in the clientSecret attribute in state. This also means that every time an update to this app is run, this value is also set on the API. If this changes from false => true, the `clientSecret` is dropped from state and the secret at the time of the apply is what remains. If this is ever changes from true => false your app will be recreated, due to the need to regenerate a secret we can store in state.
     */
    omitSecret?: pulumi.Input<boolean>;
    /**
     * Require Proof Key for Code Exchange (PKCE) for additional verification key rotation mode. See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object
     */
    pkceRequired?: pulumi.Input<boolean>;
    /**
     * URI to web page providing client policy document.
     */
    policyUri?: pulumi.Input<string>;
    /**
     * List of URIs for redirection after logout. Note: see okta*app*oauth*post*logout*redirect*uri for appending to this list in a decentralized way.
     */
    postLogoutRedirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Custom JSON that represents an OAuth application's profile
     */
    profile?: pulumi.Input<string>;
    /**
     * List of URIs for use in the redirect-based flow. This is required for all application types except service. Note: see okta*app*oauth*redirect*uri for appending to this list in a decentralized way.
     */
    redirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * *Early Access Property* Grace period for token rotation, required with grant types refresh_token
     */
    refreshTokenLeeway?: pulumi.Input<number>;
    /**
     * *Early Access Property* Refresh token rotation behavior, required with grant types refresh_token
     */
    refreshTokenRotation?: pulumi.Input<string>;
    /**
     * List of OAuth 2.0 response type strings. Valid values are any combination of: `code`, `token`, and `idToken`.
     */
    responseTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Sign on mode of application.
     */
    signOnMode?: pulumi.Input<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * Requested authentication method for the token endpoint, valid values include:  'client*secret*basic', 'client*secret*post', 'client*secret*jwt', 'private*key*jwt', 'none', etc.
     */
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    /**
     * URI to web page providing client tos (terms of service).
     */
    tosUri?: pulumi.Input<string>;
    /**
     * The type of client application.
     */
    type?: pulumi.Input<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    userNameTemplate?: pulumi.Input<string>;
    /**
     * Push username on update. Valid values: `PUSH` and `DONT_PUSH`
     */
    userNameTemplatePushStatus?: pulumi.Input<string>;
    /**
     * Username template suffix
     */
    userNameTemplateSuffix?: pulumi.Input<string>;
    /**
     * Username template type. Default: `BUILT_IN`
     */
    userNameTemplateType?: pulumi.Input<string>;
    /**
     * *Early Access Property*. Indicates if the client is allowed to use wildcard matching of redirect_uris
     */
    wildcardRedirect?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OAuth resource.
 */
export interface OAuthArgs {
    /**
     * Custom error page URL
     */
    accessibilityErrorRedirectUrl?: pulumi.Input<string>;
    /**
     * Custom login page URL
     */
    accessibilityLoginRedirectUrl?: pulumi.Input<string>;
    /**
     * Enable self service. Default is `false`
     */
    accessibilitySelfService?: pulumi.Input<boolean>;
    /**
     * Application notes for admins.
     */
    adminNote?: pulumi.Input<string>;
    /**
     * Displays specific appLinks for the app. The value for each application link should be boolean.
     */
    appLinksJson?: pulumi.Input<string>;
    /**
     * Application settings in JSON format
     */
    appSettingsJson?: pulumi.Input<string>;
    /**
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application. From now on, there is no need to attach authenticationPolicy for applications of type `SERVICE` in the upcoming release.
     */
    authenticationPolicy?: pulumi.Input<string>;
    /**
     * Requested key rotation mode. If
     * 			auto*key*rotation isn't specified, the client automatically opts in for Okta's
     * 			key rotation. You can update this property via the API or via the administrator
     * 			UI.
     * 			See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object"
     */
    autoKeyRotation?: pulumi.Input<boolean>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
    /**
     * The user provided OAuth client secret key value, this can be set when token*endpoint*auth*method is client*secret*basic. This does nothing when `omit*secret is set to true.
     */
    clientBasicSecret?: pulumi.Input<string>;
    /**
     * OAuth client ID. If set during creation, app is created with this id.
     */
    clientId?: pulumi.Input<string>;
    /**
     * URI to a web page providing information about the client.
     */
    clientUri?: pulumi.Input<string>;
    /**
     * *Early Access Property*. Indicates whether user consent is required or implicit. Valid values: REQUIRED, TRUSTED. Default value is TRUSTED
     */
    consentMethod?: pulumi.Input<string>;
    /**
     * Application notes for end users.
     */
    enduserNote?: pulumi.Input<string>;
    /**
     * List of OAuth 2.0 grant types. Conditional validation params found here https://developer.okta.com/docs/api/resources/apps#credentials-settings-details. Defaults to minimum requirements per app type.
     */
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Groups claim for an OpenID Connect client application (argument is ignored when API auth is done with OAuth 2.0 credentials)
     */
    groupsClaim?: pulumi.Input<inputs.app.OAuthGroupsClaim>;
    /**
     * Do not display application icon on mobile app
     */
    hideIos?: pulumi.Input<boolean>;
    /**
     * Do not display application icon to users
     */
    hideWeb?: pulumi.Input<boolean>;
    /**
     * *Early Access Property*. Enable Federation Broker Mode.
     */
    implicitAssignment?: pulumi.Input<boolean>;
    /**
     * *Early Access Property*. Indicates whether the Okta Authorization Server uses the original Okta org domain URL or a custom domain URL as the issuer of ID token for this client.
     */
    issuerMode?: pulumi.Input<string>;
    jwks?: pulumi.Input<pulumi.Input<inputs.app.OAuthJwk>[]>;
    /**
     * URL reference to JWKS
     */
    jwksUri?: pulumi.Input<string>;
    /**
     * The Application's display name.
     */
    label: pulumi.Input<string>;
    /**
     * The type of Idp-Initiated login that the client supports, if any
     */
    loginMode?: pulumi.Input<string>;
    /**
     * List of scopes to use for the request
     */
    loginScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URI that initiates login.
     */
    loginUri?: pulumi.Input<string>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    logo?: pulumi.Input<string>;
    /**
     * URI that references a logo for the client.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * This tells the provider not manage the client*secret value in state. When this is false (the default), it will cause the auto-generated client*secret to be persisted in the clientSecret attribute in state. This also means that every time an update to this app is run, this value is also set on the API. If this changes from false => true, the `clientSecret` is dropped from state and the secret at the time of the apply is what remains. If this is ever changes from true => false your app will be recreated, due to the need to regenerate a secret we can store in state.
     */
    omitSecret?: pulumi.Input<boolean>;
    /**
     * Require Proof Key for Code Exchange (PKCE) for additional verification key rotation mode. See: https://developer.okta.com/docs/reference/api/apps/#oauth-credential-object
     */
    pkceRequired?: pulumi.Input<boolean>;
    /**
     * URI to web page providing client policy document.
     */
    policyUri?: pulumi.Input<string>;
    /**
     * List of URIs for redirection after logout. Note: see okta*app*oauth*post*logout*redirect*uri for appending to this list in a decentralized way.
     */
    postLogoutRedirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Custom JSON that represents an OAuth application's profile
     */
    profile?: pulumi.Input<string>;
    /**
     * List of URIs for use in the redirect-based flow. This is required for all application types except service. Note: see okta*app*oauth*redirect*uri for appending to this list in a decentralized way.
     */
    redirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * *Early Access Property* Grace period for token rotation, required with grant types refresh_token
     */
    refreshTokenLeeway?: pulumi.Input<number>;
    /**
     * *Early Access Property* Refresh token rotation behavior, required with grant types refresh_token
     */
    refreshTokenRotation?: pulumi.Input<string>;
    /**
     * List of OAuth 2.0 response type strings. Valid values are any combination of: `code`, `token`, and `idToken`.
     */
    responseTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * Requested authentication method for the token endpoint, valid values include:  'client*secret*basic', 'client*secret*post', 'client*secret*jwt', 'private*key*jwt', 'none', etc.
     */
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    /**
     * URI to web page providing client tos (terms of service).
     */
    tosUri?: pulumi.Input<string>;
    /**
     * The type of client application.
     */
    type: pulumi.Input<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    userNameTemplate?: pulumi.Input<string>;
    /**
     * Push username on update. Valid values: `PUSH` and `DONT_PUSH`
     */
    userNameTemplatePushStatus?: pulumi.Input<string>;
    /**
     * Username template suffix
     */
    userNameTemplateSuffix?: pulumi.Input<string>;
    /**
     * Username template type. Default: `BUILT_IN`
     */
    userNameTemplateType?: pulumi.Input<string>;
    /**
     * *Early Access Property*. Indicates if the client is allowed to use wildcard matching of redirect_uris
     */
    wildcardRedirect?: pulumi.Input<string>;
}
