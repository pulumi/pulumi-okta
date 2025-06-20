// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource allows you to create and configure a Bookmark Application.
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
 * const example = new okta.app.Bookmark("example", {
 *     label: "Example",
 *     url: "https://example.com",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:app/bookmark:Bookmark example <app_id>
 * ```
 */
export class Bookmark extends pulumi.CustomResource {
    /**
     * Get an existing Bookmark resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BookmarkState, opts?: pulumi.CustomResourceOptions): Bookmark {
        return new Bookmark(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:app/bookmark:Bookmark';

    /**
     * Returns true if the given object is an instance of Bookmark.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bookmark {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bookmark.__pulumiType;
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
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application.
     */
    public readonly authenticationPolicy!: pulumi.Output<string>;
    /**
     * Display auto submit toolbar
     */
    public readonly autoSubmitToolbar!: pulumi.Output<boolean | undefined>;
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
     * Would you like Okta to add an integration for this app?
     */
    public readonly requestIntegration!: pulumi.Output<boolean | undefined>;
    /**
     * Sign on mode of application.
     */
    public /*out*/ readonly signOnMode!: pulumi.Output<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * The URL of the bookmark.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a Bookmark resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BookmarkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BookmarkArgs | BookmarkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BookmarkState | undefined;
            resourceInputs["accessibilityErrorRedirectUrl"] = state ? state.accessibilityErrorRedirectUrl : undefined;
            resourceInputs["accessibilityLoginRedirectUrl"] = state ? state.accessibilityLoginRedirectUrl : undefined;
            resourceInputs["accessibilitySelfService"] = state ? state.accessibilitySelfService : undefined;
            resourceInputs["adminNote"] = state ? state.adminNote : undefined;
            resourceInputs["appLinksJson"] = state ? state.appLinksJson : undefined;
            resourceInputs["authenticationPolicy"] = state ? state.authenticationPolicy : undefined;
            resourceInputs["autoSubmitToolbar"] = state ? state.autoSubmitToolbar : undefined;
            resourceInputs["enduserNote"] = state ? state.enduserNote : undefined;
            resourceInputs["hideIos"] = state ? state.hideIos : undefined;
            resourceInputs["hideWeb"] = state ? state.hideWeb : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["logo"] = state ? state.logo : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requestIntegration"] = state ? state.requestIntegration : undefined;
            resourceInputs["signOnMode"] = state ? state.signOnMode : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as BookmarkArgs | undefined;
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
            resourceInputs["authenticationPolicy"] = args ? args.authenticationPolicy : undefined;
            resourceInputs["autoSubmitToolbar"] = args ? args.autoSubmitToolbar : undefined;
            resourceInputs["enduserNote"] = args ? args.enduserNote : undefined;
            resourceInputs["hideIos"] = args ? args.hideIos : undefined;
            resourceInputs["hideWeb"] = args ? args.hideWeb : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["logo"] = args ? args.logo : undefined;
            resourceInputs["requestIntegration"] = args ? args.requestIntegration : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["logoUrl"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["signOnMode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Bookmark.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bookmark resources.
 */
export interface BookmarkState {
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
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application.
     */
    authenticationPolicy?: pulumi.Input<string>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
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
     * Would you like Okta to add an integration for this app?
     */
    requestIntegration?: pulumi.Input<boolean>;
    /**
     * Sign on mode of application.
     */
    signOnMode?: pulumi.Input<string>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * The URL of the bookmark.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Bookmark resource.
 */
export interface BookmarkArgs {
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
     * The ID of the associated app*signon*policy. If this property is removed from the application the default sign-on-policy will be associated with this application.
     */
    authenticationPolicy?: pulumi.Input<string>;
    /**
     * Display auto submit toolbar
     */
    autoSubmitToolbar?: pulumi.Input<boolean>;
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
     * Would you like Okta to add an integration for this app?
     */
    requestIntegration?: pulumi.Input<boolean>;
    /**
     * Status of application. By default, it is `ACTIVE`
     */
    status?: pulumi.Input<string>;
    /**
     * The URL of the bookmark.
     */
    url: pulumi.Input<string>;
}
