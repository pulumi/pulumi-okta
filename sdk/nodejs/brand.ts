// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.Brand("example", {name: "example"});
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/brand:Brand example <brand_id>
 * ```
 */
export class Brand extends pulumi.CustomResource {
    /**
     * Get an existing Brand resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BrandState, opts?: pulumi.CustomResourceOptions): Brand {
        return new Brand(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/brand:Brand';

    /**
     * Returns true if the given object is an instance of Brand.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Brand {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Brand.__pulumiType;
    }

    /**
     * Is a required input flag with when changing custom*privacy*url, shouldn't be considered as a readable property
     */
    public readonly agreeToCustomPrivacyPolicy!: pulumi.Output<boolean>;
    /**
     * Brand ID - Note: Okta API for brands only reads and updates therefore the okta*brand resource needs to act as a quasi data source. Do this by setting brand*id. `DEPRECATED`: Okta has fully support brand creation, this attribute is a no op and will be removed
     *
     * @deprecated Okta has fully support brand creation, this attribute is a no op and will be removed
     */
    public readonly brandId!: pulumi.Output<string>;
    /**
     * Custom privacy policy URL
     */
    public readonly customPrivacyPolicyUrl!: pulumi.Output<string>;
    /**
     * Default app app instance id
     */
    public readonly defaultAppAppInstanceId!: pulumi.Output<string | undefined>;
    /**
     * Default app app link name
     */
    public readonly defaultAppAppLinkName!: pulumi.Output<string | undefined>;
    /**
     * Default app classic application uri
     */
    public readonly defaultAppClassicApplicationUri!: pulumi.Output<string | undefined>;
    /**
     * Email Domain ID tied to this brand
     */
    public /*out*/ readonly emailDomainId!: pulumi.Output<string>;
    /**
     * Is this the default brand
     */
    public /*out*/ readonly isDefault!: pulumi.Output<boolean>;
    /**
     * Link relations for this object - JSON HAL - Discoverable resources related to the brand
     */
    public /*out*/ readonly links!: pulumi.Output<string>;
    /**
     * The language specified as an IETF BCP 47 language tag
     */
    public readonly locale!: pulumi.Output<string | undefined>;
    /**
     * Name of the brand
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Removes "Powered by Okta" from the Okta-hosted sign-in page and "© 2021 Okta, Inc." from the Okta End-User Dashboard
     */
    public readonly removePoweredByOkta!: pulumi.Output<boolean>;

    /**
     * Create a Brand resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BrandArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BrandArgs | BrandState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BrandState | undefined;
            resourceInputs["agreeToCustomPrivacyPolicy"] = state ? state.agreeToCustomPrivacyPolicy : undefined;
            resourceInputs["brandId"] = state ? state.brandId : undefined;
            resourceInputs["customPrivacyPolicyUrl"] = state ? state.customPrivacyPolicyUrl : undefined;
            resourceInputs["defaultAppAppInstanceId"] = state ? state.defaultAppAppInstanceId : undefined;
            resourceInputs["defaultAppAppLinkName"] = state ? state.defaultAppAppLinkName : undefined;
            resourceInputs["defaultAppClassicApplicationUri"] = state ? state.defaultAppClassicApplicationUri : undefined;
            resourceInputs["emailDomainId"] = state ? state.emailDomainId : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["links"] = state ? state.links : undefined;
            resourceInputs["locale"] = state ? state.locale : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["removePoweredByOkta"] = state ? state.removePoweredByOkta : undefined;
        } else {
            const args = argsOrState as BrandArgs | undefined;
            resourceInputs["agreeToCustomPrivacyPolicy"] = args ? args.agreeToCustomPrivacyPolicy : undefined;
            resourceInputs["brandId"] = args ? args.brandId : undefined;
            resourceInputs["customPrivacyPolicyUrl"] = args ? args.customPrivacyPolicyUrl : undefined;
            resourceInputs["defaultAppAppInstanceId"] = args ? args.defaultAppAppInstanceId : undefined;
            resourceInputs["defaultAppAppLinkName"] = args ? args.defaultAppAppLinkName : undefined;
            resourceInputs["defaultAppClassicApplicationUri"] = args ? args.defaultAppClassicApplicationUri : undefined;
            resourceInputs["locale"] = args ? args.locale : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["removePoweredByOkta"] = args ? args.removePoweredByOkta : undefined;
            resourceInputs["emailDomainId"] = undefined /*out*/;
            resourceInputs["isDefault"] = undefined /*out*/;
            resourceInputs["links"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Brand.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Brand resources.
 */
export interface BrandState {
    /**
     * Is a required input flag with when changing custom*privacy*url, shouldn't be considered as a readable property
     */
    agreeToCustomPrivacyPolicy?: pulumi.Input<boolean>;
    /**
     * Brand ID - Note: Okta API for brands only reads and updates therefore the okta*brand resource needs to act as a quasi data source. Do this by setting brand*id. `DEPRECATED`: Okta has fully support brand creation, this attribute is a no op and will be removed
     *
     * @deprecated Okta has fully support brand creation, this attribute is a no op and will be removed
     */
    brandId?: pulumi.Input<string>;
    /**
     * Custom privacy policy URL
     */
    customPrivacyPolicyUrl?: pulumi.Input<string>;
    /**
     * Default app app instance id
     */
    defaultAppAppInstanceId?: pulumi.Input<string>;
    /**
     * Default app app link name
     */
    defaultAppAppLinkName?: pulumi.Input<string>;
    /**
     * Default app classic application uri
     */
    defaultAppClassicApplicationUri?: pulumi.Input<string>;
    /**
     * Email Domain ID tied to this brand
     */
    emailDomainId?: pulumi.Input<string>;
    /**
     * Is this the default brand
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Link relations for this object - JSON HAL - Discoverable resources related to the brand
     */
    links?: pulumi.Input<string>;
    /**
     * The language specified as an IETF BCP 47 language tag
     */
    locale?: pulumi.Input<string>;
    /**
     * Name of the brand
     */
    name?: pulumi.Input<string>;
    /**
     * Removes "Powered by Okta" from the Okta-hosted sign-in page and "© 2021 Okta, Inc." from the Okta End-User Dashboard
     */
    removePoweredByOkta?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Brand resource.
 */
export interface BrandArgs {
    /**
     * Is a required input flag with when changing custom*privacy*url, shouldn't be considered as a readable property
     */
    agreeToCustomPrivacyPolicy?: pulumi.Input<boolean>;
    /**
     * Brand ID - Note: Okta API for brands only reads and updates therefore the okta*brand resource needs to act as a quasi data source. Do this by setting brand*id. `DEPRECATED`: Okta has fully support brand creation, this attribute is a no op and will be removed
     *
     * @deprecated Okta has fully support brand creation, this attribute is a no op and will be removed
     */
    brandId?: pulumi.Input<string>;
    /**
     * Custom privacy policy URL
     */
    customPrivacyPolicyUrl?: pulumi.Input<string>;
    /**
     * Default app app instance id
     */
    defaultAppAppInstanceId?: pulumi.Input<string>;
    /**
     * Default app app link name
     */
    defaultAppAppLinkName?: pulumi.Input<string>;
    /**
     * Default app classic application uri
     */
    defaultAppClassicApplicationUri?: pulumi.Input<string>;
    /**
     * The language specified as an IETF BCP 47 language tag
     */
    locale?: pulumi.Input<string>;
    /**
     * Name of the brand
     */
    name?: pulumi.Input<string>;
    /**
     * Removes "Powered by Okta" from the Okta-hosted sign-in page and "© 2021 Okta, Inc." from the Okta End-User Dashboard
     */
    removePoweredByOkta?: pulumi.Input<boolean>;
}
