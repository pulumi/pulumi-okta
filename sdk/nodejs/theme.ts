// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to get and update an Okta
 * [Theme](https://developer.okta.com/docs/reference/api/brands/#theme-object).
 *
 * The Okta Management API does not have a true Create or Delete for a theme. Therefore, the theme resource must be imported
 * first into the pulumi state before updates can be applied to the theme.
 *
 * ## Import
 *
 * An Okta Brand can be imported via the ID.
 *
 * ```sh
 * $ pulumi import okta:index/theme:Theme example &#60;brand id&#62;/&#60;theme id&#62;
 * ```
 */
export class Theme extends pulumi.CustomResource {
    /**
     * Get an existing Theme resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ThemeState, opts?: pulumi.CustomResourceOptions): Theme {
        return new Theme(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/theme:Theme';

    /**
     * Returns true if the given object is an instance of Theme.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Theme {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Theme.__pulumiType;
    }

    /**
     * (Optional) Local path to background image file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    public readonly backgroundImage!: pulumi.Output<string | undefined>;
    /**
     * (Read-Only) Background image URL
     */
    public /*out*/ readonly backgroundImageUrl!: pulumi.Output<string>;
    /**
     * Brand ID
     */
    public readonly brandId!: pulumi.Output<string>;
    /**
     * (Required) Variant for email templates. Valid values: (`OKTA_DEFAULT`, `FULL_THEME`)
     */
    public readonly emailTemplateTouchPointVariant!: pulumi.Output<string | undefined>;
    /**
     * (Required) Variant for the Okta End-User Dashboard. Valid values: (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
     */
    public readonly endUserDashboardTouchPointVariant!: pulumi.Output<string | undefined>;
    /**
     * (Required) Variant for the error page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    public readonly errorPageTouchPointVariant!: pulumi.Output<string | undefined>;
    /**
     * (Optional) Local path to favicon file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    public readonly favicon!: pulumi.Output<string | undefined>;
    /**
     * (Read-Only) Favicon URL
     */
    public /*out*/ readonly faviconUrl!: pulumi.Output<string>;
    /**
     * Link relations for this object - JSON HAL - (Read-Only) Discoverable resources related to the brand
     */
    public /*out*/ readonly links!: pulumi.Output<string>;
    /**
     * (Optional) Local path to logo file. Setting the value to the blank string `""` will delete the logo on the theme at Okta but will not delete the local file.
     */
    public readonly logo!: pulumi.Output<string | undefined>;
    /**
     * (Read-Only) Logo URL
     */
    public /*out*/ readonly logoUrl!: pulumi.Output<string>;
    /**
     * (Optional) Primary color contrast hex code
     */
    public readonly primaryColorContrastHex!: pulumi.Output<string | undefined>;
    /**
     * (Required) Primary color hex code
     */
    public readonly primaryColorHex!: pulumi.Output<string | undefined>;
    /**
     * (Optional) Secondary color contrast hex code
     */
    public readonly secondaryColorContrastHex!: pulumi.Output<string | undefined>;
    /**
     * (Required) Secondary color hex code
     */
    public readonly secondaryColorHex!: pulumi.Output<string | undefined>;
    /**
     * (Required) Variant for the Okta Sign-In Page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    public readonly signInPageTouchPointVariant!: pulumi.Output<string | undefined>;
    /**
     * Theme ID, used for read (faux-create)
     */
    public readonly themeId!: pulumi.Output<string | undefined>;

    /**
     * Create a Theme resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ThemeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ThemeArgs | ThemeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ThemeState | undefined;
            resourceInputs["backgroundImage"] = state ? state.backgroundImage : undefined;
            resourceInputs["backgroundImageUrl"] = state ? state.backgroundImageUrl : undefined;
            resourceInputs["brandId"] = state ? state.brandId : undefined;
            resourceInputs["emailTemplateTouchPointVariant"] = state ? state.emailTemplateTouchPointVariant : undefined;
            resourceInputs["endUserDashboardTouchPointVariant"] = state ? state.endUserDashboardTouchPointVariant : undefined;
            resourceInputs["errorPageTouchPointVariant"] = state ? state.errorPageTouchPointVariant : undefined;
            resourceInputs["favicon"] = state ? state.favicon : undefined;
            resourceInputs["faviconUrl"] = state ? state.faviconUrl : undefined;
            resourceInputs["links"] = state ? state.links : undefined;
            resourceInputs["logo"] = state ? state.logo : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["primaryColorContrastHex"] = state ? state.primaryColorContrastHex : undefined;
            resourceInputs["primaryColorHex"] = state ? state.primaryColorHex : undefined;
            resourceInputs["secondaryColorContrastHex"] = state ? state.secondaryColorContrastHex : undefined;
            resourceInputs["secondaryColorHex"] = state ? state.secondaryColorHex : undefined;
            resourceInputs["signInPageTouchPointVariant"] = state ? state.signInPageTouchPointVariant : undefined;
            resourceInputs["themeId"] = state ? state.themeId : undefined;
        } else {
            const args = argsOrState as ThemeArgs | undefined;
            if ((!args || args.brandId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'brandId'");
            }
            resourceInputs["backgroundImage"] = args ? args.backgroundImage : undefined;
            resourceInputs["brandId"] = args ? args.brandId : undefined;
            resourceInputs["emailTemplateTouchPointVariant"] = args ? args.emailTemplateTouchPointVariant : undefined;
            resourceInputs["endUserDashboardTouchPointVariant"] = args ? args.endUserDashboardTouchPointVariant : undefined;
            resourceInputs["errorPageTouchPointVariant"] = args ? args.errorPageTouchPointVariant : undefined;
            resourceInputs["favicon"] = args ? args.favicon : undefined;
            resourceInputs["logo"] = args ? args.logo : undefined;
            resourceInputs["primaryColorContrastHex"] = args ? args.primaryColorContrastHex : undefined;
            resourceInputs["primaryColorHex"] = args ? args.primaryColorHex : undefined;
            resourceInputs["secondaryColorContrastHex"] = args ? args.secondaryColorContrastHex : undefined;
            resourceInputs["secondaryColorHex"] = args ? args.secondaryColorHex : undefined;
            resourceInputs["signInPageTouchPointVariant"] = args ? args.signInPageTouchPointVariant : undefined;
            resourceInputs["themeId"] = args ? args.themeId : undefined;
            resourceInputs["backgroundImageUrl"] = undefined /*out*/;
            resourceInputs["faviconUrl"] = undefined /*out*/;
            resourceInputs["links"] = undefined /*out*/;
            resourceInputs["logoUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Theme.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Theme resources.
 */
export interface ThemeState {
    /**
     * (Optional) Local path to background image file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    backgroundImage?: pulumi.Input<string>;
    /**
     * (Read-Only) Background image URL
     */
    backgroundImageUrl?: pulumi.Input<string>;
    /**
     * Brand ID
     */
    brandId?: pulumi.Input<string>;
    /**
     * (Required) Variant for email templates. Valid values: (`OKTA_DEFAULT`, `FULL_THEME`)
     */
    emailTemplateTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Required) Variant for the Okta End-User Dashboard. Valid values: (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
     */
    endUserDashboardTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Required) Variant for the error page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    errorPageTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Optional) Local path to favicon file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    favicon?: pulumi.Input<string>;
    /**
     * (Read-Only) Favicon URL
     */
    faviconUrl?: pulumi.Input<string>;
    /**
     * Link relations for this object - JSON HAL - (Read-Only) Discoverable resources related to the brand
     */
    links?: pulumi.Input<string>;
    /**
     * (Optional) Local path to logo file. Setting the value to the blank string `""` will delete the logo on the theme at Okta but will not delete the local file.
     */
    logo?: pulumi.Input<string>;
    /**
     * (Read-Only) Logo URL
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * (Optional) Primary color contrast hex code
     */
    primaryColorContrastHex?: pulumi.Input<string>;
    /**
     * (Required) Primary color hex code
     */
    primaryColorHex?: pulumi.Input<string>;
    /**
     * (Optional) Secondary color contrast hex code
     */
    secondaryColorContrastHex?: pulumi.Input<string>;
    /**
     * (Required) Secondary color hex code
     */
    secondaryColorHex?: pulumi.Input<string>;
    /**
     * (Required) Variant for the Okta Sign-In Page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    signInPageTouchPointVariant?: pulumi.Input<string>;
    /**
     * Theme ID, used for read (faux-create)
     */
    themeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Theme resource.
 */
export interface ThemeArgs {
    /**
     * (Optional) Local path to background image file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    backgroundImage?: pulumi.Input<string>;
    /**
     * Brand ID
     */
    brandId: pulumi.Input<string>;
    /**
     * (Required) Variant for email templates. Valid values: (`OKTA_DEFAULT`, `FULL_THEME`)
     */
    emailTemplateTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Required) Variant for the Okta End-User Dashboard. Valid values: (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
     */
    endUserDashboardTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Required) Variant for the error page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    errorPageTouchPointVariant?: pulumi.Input<string>;
    /**
     * (Optional) Local path to favicon file. Setting the value to the blank string `""` will delete the favicon on the theme at Okta but will not delete the local file.
     */
    favicon?: pulumi.Input<string>;
    /**
     * (Optional) Local path to logo file. Setting the value to the blank string `""` will delete the logo on the theme at Okta but will not delete the local file.
     */
    logo?: pulumi.Input<string>;
    /**
     * (Optional) Primary color contrast hex code
     */
    primaryColorContrastHex?: pulumi.Input<string>;
    /**
     * (Required) Primary color hex code
     */
    primaryColorHex?: pulumi.Input<string>;
    /**
     * (Optional) Secondary color contrast hex code
     */
    secondaryColorContrastHex?: pulumi.Input<string>;
    /**
     * (Required) Secondary color hex code
     */
    secondaryColorHex?: pulumi.Input<string>;
    /**
     * (Required) Variant for the Okta Sign-In Page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     */
    signInPageTouchPointVariant?: pulumi.Input<string>;
    /**
     * Theme ID, used for read (faux-create)
     */
    themeId?: pulumi.Input<string>;
}
