// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource allows you to create and configure an Auto Login Okta Application.
 * > During an apply if there is change in status the app will first be
 * activated or deactivated in accordance with the status change. Then, all
 * other arguments that changed will be applied.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.app.BasicAuth("example", {
 *     label: "Example",
 *     url: "https://example.com/login.html",
 *     authUrl: "https://example.com/auth.html",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:app/basicAuth:BasicAuth example <app_id>
 * ```
 */
export class BasicAuth extends pulumi.CustomResource {
    /**
     * Get an existing BasicAuth resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BasicAuthState, opts?: pulumi.CustomResourceOptions): BasicAuth {
        return new BasicAuth(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:app/basicAuth:BasicAuth';

    /**
     * Returns true if the given object is an instance of BasicAuth.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BasicAuth {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BasicAuth.__pulumiType;
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
     * The URL of the authenticating site for this app.
     */
    public readonly authUrl!: pulumi.Output<string>;
    /**
     * Display auto submit toolbar
     */
    public readonly autoSubmitToolbar!: pulumi.Output<boolean | undefined>;
    /**
     * Application credentials scheme. One of: `EDIT_USERNAME_AND_PASSWORD`, `ADMIN_SETS_CREDENTIALS`, `EDIT_PASSWORD_ONLY`,
     * `EXTERNAL_PASSWORD_SYNC`, or `SHARED_USERNAME_AND_PASSWORD`
     */
    public readonly credentialsScheme!: pulumi.Output<string | undefined>;
    /**
     * Application notes for end users.
     */
    public readonly enduserNote!: pulumi.Output<string | undefined>;
    /**
     * Do not display application icon on mobile app
     */
    public readonly hideIos!: pulumi.Output<boolean | undefined>;
    /**
     * Do not display application icon to users
     */
    public readonly hideWeb!: pulumi.Output<boolean | undefined>;
    /**
     * The Application's display name.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    public readonly logo!: pulumi.Output<string | undefined>;
    /**
     * URL of the application's logo
     */
    public /*out*/ readonly logoUrl!: pulumi.Output<string>;
    /**
     * Name of the app.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Allow user to reveal password. Default is false. It can not be set to true if credentialsScheme is
     * "ADMIN_SETS_CREDENTIALS", "SHARED_USERNAME_AND_PASSWORD" or "EXTERNAL_PASSWORD_SYNC".
     */
    public readonly revealPassword!: pulumi.Output<boolean | undefined>;
    /**
     * Shared password, required for certain schemes.
     */
    public readonly sharedPassword!: pulumi.Output<string | undefined>;
    /**
     * Shared username, required for certain schemes.
     */
    public readonly sharedUsername!: pulumi.Output<string | undefined>;
    /**
     * Sign on mode of application.
     */
    public /*out*/ readonly signOnMode!: pulumi.Output<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * The URL of the sign-in page for this app.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    public readonly userNameTemplate!: pulumi.Output<string | undefined>;
    /**
     * Push username on update. Valid values: `PUSH`, `DONT_PUSH` and `NOT_CONFIGURED`
     */
    public readonly userNameTemplatePushStatus!: pulumi.Output<string | undefined>;
    /**
     * Username template suffix
     */
    public readonly userNameTemplateSuffix!: pulumi.Output<string | undefined>;
    /**
     * Username template type. Default: `BUILT_IN`. Valid values: `NONE`, `CUSTOM`, `BUILT_IN`
     */
    public readonly userNameTemplateType!: pulumi.Output<string | undefined>;

    /**
     * Create a BasicAuth resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BasicAuthArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BasicAuthArgs | BasicAuthState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BasicAuthState | undefined;
            resourceInputs["accessibilityErrorRedirectUrl"] = state ? state.accessibilityErrorRedirectUrl : undefined;
            resourceInputs["accessibilityLoginRedirectUrl"] = state ? state.accessibilityLoginRedirectUrl : undefined;
            resourceInputs["accessibilitySelfService"] = state ? state.accessibilitySelfService : undefined;
            resourceInputs["adminNote"] = state ? state.adminNote : undefined;
            resourceInputs["appLinksJson"] = state ? state.appLinksJson : undefined;
            resourceInputs["authUrl"] = state ? state.authUrl : undefined;
            resourceInputs["autoSubmitToolbar"] = state ? state.autoSubmitToolbar : undefined;
            resourceInputs["credentialsScheme"] = state ? state.credentialsScheme : undefined;
            resourceInputs["enduserNote"] = state ? state.enduserNote : undefined;
            resourceInputs["hideIos"] = state ? state.hideIos : undefined;
            resourceInputs["hideWeb"] = state ? state.hideWeb : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["logo"] = state ? state.logo : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["revealPassword"] = state ? state.revealPassword : undefined;
            resourceInputs["sharedPassword"] = state ? state.sharedPassword : undefined;
            resourceInputs["sharedUsername"] = state ? state.sharedUsername : undefined;
            resourceInputs["signOnMode"] = state ? state.signOnMode : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["userNameTemplate"] = state ? state.userNameTemplate : undefined;
            resourceInputs["userNameTemplatePushStatus"] = state ? state.userNameTemplatePushStatus : undefined;
            resourceInputs["userNameTemplateSuffix"] = state ? state.userNameTemplateSuffix : undefined;
            resourceInputs["userNameTemplateType"] = state ? state.userNameTemplateType : undefined;
        } else {
            const args = argsOrState as BasicAuthArgs | undefined;
            if ((!args || args.authUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authUrl'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["accessibilityErrorRedirectUrl"] = args ? args.accessibilityErrorRedirectUrl : undefined;
            resourceInputs["accessibilityLoginRedirectUrl"] = args ? args.accessibilityLoginRedirectUrl : undefined;
            resourceInputs["accessibilitySelfService"] = args ? args.accessibilitySelfService : undefined;
            resourceInputs["adminNote"] = args ? args.adminNote : undefined;
            resourceInputs["appLinksJson"] = args ? args.appLinksJson : undefined;
            resourceInputs["authUrl"] = args ? args.authUrl : undefined;
            resourceInputs["autoSubmitToolbar"] = args ? args.autoSubmitToolbar : undefined;
            resourceInputs["credentialsScheme"] = args ? args.credentialsScheme : undefined;
            resourceInputs["enduserNote"] = args ? args.enduserNote : undefined;
            resourceInputs["hideIos"] = args ? args.hideIos : undefined;
            resourceInputs["hideWeb"] = args ? args.hideWeb : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["logo"] = args ? args.logo : undefined;
            resourceInputs["revealPassword"] = args ? args.revealPassword : undefined;
            resourceInputs["sharedPassword"] = args ? args.sharedPassword : undefined;
            resourceInputs["sharedUsername"] = args ? args.sharedUsername : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["userNameTemplate"] = args ? args.userNameTemplate : undefined;
            resourceInputs["userNameTemplatePushStatus"] = args ? args.userNameTemplatePushStatus : undefined;
            resourceInputs["userNameTemplateSuffix"] = args ? args.userNameTemplateSuffix : undefined;
            resourceInputs["userNameTemplateType"] = args ? args.userNameTemplateType : undefined;
            resourceInputs["logoUrl"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["signOnMode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BasicAuth.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BasicAuth resources.
 */
export interface BasicAuthState {
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
     * The URL of the authenticating site for this app.
     */
    authUrl?: pulumi.Input<string>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
    /**
     * Application credentials scheme. One of: `EDIT_USERNAME_AND_PASSWORD`, `ADMIN_SETS_CREDENTIALS`, `EDIT_PASSWORD_ONLY`,
     * `EXTERNAL_PASSWORD_SYNC`, or `SHARED_USERNAME_AND_PASSWORD`
     */
    credentialsScheme?: pulumi.Input<string>;
    /**
     * Application notes for end users.
     */
    enduserNote?: pulumi.Input<string>;
    /**
     * Do not display application icon on mobile app
     */
    hideIos?: pulumi.Input<boolean>;
    /**
     * Do not display application icon to users
     */
    hideWeb?: pulumi.Input<boolean>;
    /**
     * The Application's display name.
     */
    label?: pulumi.Input<string>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    logo?: pulumi.Input<string>;
    /**
     * URL of the application's logo
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Name of the app.
     */
    name?: pulumi.Input<string>;
    /**
     * Allow user to reveal password. Default is false. It can not be set to true if credentialsScheme is
     * "ADMIN_SETS_CREDENTIALS", "SHARED_USERNAME_AND_PASSWORD" or "EXTERNAL_PASSWORD_SYNC".
     */
    revealPassword?: pulumi.Input<boolean>;
    /**
     * Shared password, required for certain schemes.
     */
    sharedPassword?: pulumi.Input<string>;
    /**
     * Shared username, required for certain schemes.
     */
    sharedUsername?: pulumi.Input<string>;
    /**
     * Sign on mode of application.
     */
    signOnMode?: pulumi.Input<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * The URL of the sign-in page for this app.
     */
    url?: pulumi.Input<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    userNameTemplate?: pulumi.Input<string>;
    /**
     * Push username on update. Valid values: `PUSH`, `DONT_PUSH` and `NOT_CONFIGURED`
     */
    userNameTemplatePushStatus?: pulumi.Input<string>;
    /**
     * Username template suffix
     */
    userNameTemplateSuffix?: pulumi.Input<string>;
    /**
     * Username template type. Default: `BUILT_IN`. Valid values: `NONE`, `CUSTOM`, `BUILT_IN`
     */
    userNameTemplateType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BasicAuth resource.
 */
export interface BasicAuthArgs {
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
     * The URL of the authenticating site for this app.
     */
    authUrl: pulumi.Input<string>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
    /**
     * Application credentials scheme. One of: `EDIT_USERNAME_AND_PASSWORD`, `ADMIN_SETS_CREDENTIALS`, `EDIT_PASSWORD_ONLY`,
     * `EXTERNAL_PASSWORD_SYNC`, or `SHARED_USERNAME_AND_PASSWORD`
     */
    credentialsScheme?: pulumi.Input<string>;
    /**
     * Application notes for end users.
     */
    enduserNote?: pulumi.Input<string>;
    /**
     * Do not display application icon on mobile app
     */
    hideIos?: pulumi.Input<boolean>;
    /**
     * Do not display application icon to users
     */
    hideWeb?: pulumi.Input<boolean>;
    /**
     * The Application's display name.
     */
    label: pulumi.Input<string>;
    /**
     * Local file path to the logo. The file must be in PNG, JPG, or GIF format, and less than 1 MB in size.
     */
    logo?: pulumi.Input<string>;
    /**
     * Allow user to reveal password. Default is false. It can not be set to true if credentialsScheme is
     * "ADMIN_SETS_CREDENTIALS", "SHARED_USERNAME_AND_PASSWORD" or "EXTERNAL_PASSWORD_SYNC".
     */
    revealPassword?: pulumi.Input<boolean>;
    /**
     * Shared password, required for certain schemes.
     */
    sharedPassword?: pulumi.Input<string>;
    /**
     * Shared username, required for certain schemes.
     */
    sharedUsername?: pulumi.Input<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * The URL of the sign-in page for this app.
     */
    url: pulumi.Input<string>;
    /**
     * Username template. Default: `${source.login}`
     */
    userNameTemplate?: pulumi.Input<string>;
    /**
     * Push username on update. Valid values: `PUSH`, `DONT_PUSH` and `NOT_CONFIGURED`
     */
    userNameTemplatePushStatus?: pulumi.Input<string>;
    /**
     * Username template suffix
     */
    userNameTemplateSuffix?: pulumi.Input<string>;
    /**
     * Username template type. Default: `BUILT_IN`. Valid values: `NONE`, `CUSTOM`, `BUILT_IN`
     */
    userNameTemplateType?: pulumi.Input<string>;
}
