// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you manage org settings, logo, support and communication options.
 *
 * > **IMPORTANT:** You must specify all Org Setting properties when you update an org's profile. Any property not specified in the script will be deleted.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.OrgConfiguration("example", {
 *     companyName: "Umbrella Corporation",
 *     website: "https://terraform.io",
 * });
 * ```
 *
 * ## Import
 *
 * Okta Org Configuration can be imported even without specifying the Org ID.
 *
 * ```sh
 *  $ pulumi import okta:index/orgConfiguration:OrgConfiguration example _
 * ```
 */
export class OrgConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing OrgConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrgConfigurationState, opts?: pulumi.CustomResourceOptions): OrgConfiguration {
        return new OrgConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/orgConfiguration:OrgConfiguration';

    /**
     * Returns true if the given object is an instance of OrgConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrgConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrgConfiguration.__pulumiType;
    }

    /**
     * Primary address of org
     */
    public readonly address1!: pulumi.Output<string | undefined>;
    /**
     * Secondary address of org
     */
    public readonly address2!: pulumi.Output<string | undefined>;
    /**
     * User ID representing the billing contact
     */
    public readonly billingContactUser!: pulumi.Output<string | undefined>;
    /**
     * City of org
     */
    public readonly city!: pulumi.Output<string | undefined>;
    /**
     * Name of org
     */
    public readonly companyName!: pulumi.Output<string>;
    /**
     * Country of org
     */
    public readonly country!: pulumi.Output<string | undefined>;
    /**
     * Support link of org
     */
    public readonly endUserSupportHelpUrl!: pulumi.Output<string | undefined>;
    /**
     * Expiration of org
     */
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    /**
     * Local path to logo of the org.
     */
    public readonly logo!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the org's users receive Okta Communication emails
     */
    public readonly optOutCommunicationEmails!: pulumi.Output<boolean | undefined>;
    /**
     * Support help phone of org
     */
    public readonly phoneNumber!: pulumi.Output<string | undefined>;
    /**
     * Postal code of org
     */
    public readonly postalCode!: pulumi.Output<string | undefined>;
    /**
     * State of org
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * Subdomain of org
     */
    public /*out*/ readonly subdomain!: pulumi.Output<string>;
    /**
     * Support help phone of org
     */
    public readonly supportPhoneNumber!: pulumi.Output<string | undefined>;
    /**
     * User ID representing the technical contact
     */
    public readonly technicalContactUser!: pulumi.Output<string | undefined>;
    /**
     * The org's website
     */
    public readonly website!: pulumi.Output<string | undefined>;

    /**
     * Create a OrgConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrgConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrgConfigurationArgs | OrgConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrgConfigurationState | undefined;
            inputs["address1"] = state ? state.address1 : undefined;
            inputs["address2"] = state ? state.address2 : undefined;
            inputs["billingContactUser"] = state ? state.billingContactUser : undefined;
            inputs["city"] = state ? state.city : undefined;
            inputs["companyName"] = state ? state.companyName : undefined;
            inputs["country"] = state ? state.country : undefined;
            inputs["endUserSupportHelpUrl"] = state ? state.endUserSupportHelpUrl : undefined;
            inputs["expiresAt"] = state ? state.expiresAt : undefined;
            inputs["logo"] = state ? state.logo : undefined;
            inputs["optOutCommunicationEmails"] = state ? state.optOutCommunicationEmails : undefined;
            inputs["phoneNumber"] = state ? state.phoneNumber : undefined;
            inputs["postalCode"] = state ? state.postalCode : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["subdomain"] = state ? state.subdomain : undefined;
            inputs["supportPhoneNumber"] = state ? state.supportPhoneNumber : undefined;
            inputs["technicalContactUser"] = state ? state.technicalContactUser : undefined;
            inputs["website"] = state ? state.website : undefined;
        } else {
            const args = argsOrState as OrgConfigurationArgs | undefined;
            if ((!args || args.companyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'companyName'");
            }
            inputs["address1"] = args ? args.address1 : undefined;
            inputs["address2"] = args ? args.address2 : undefined;
            inputs["billingContactUser"] = args ? args.billingContactUser : undefined;
            inputs["city"] = args ? args.city : undefined;
            inputs["companyName"] = args ? args.companyName : undefined;
            inputs["country"] = args ? args.country : undefined;
            inputs["endUserSupportHelpUrl"] = args ? args.endUserSupportHelpUrl : undefined;
            inputs["logo"] = args ? args.logo : undefined;
            inputs["optOutCommunicationEmails"] = args ? args.optOutCommunicationEmails : undefined;
            inputs["phoneNumber"] = args ? args.phoneNumber : undefined;
            inputs["postalCode"] = args ? args.postalCode : undefined;
            inputs["state"] = args ? args.state : undefined;
            inputs["supportPhoneNumber"] = args ? args.supportPhoneNumber : undefined;
            inputs["technicalContactUser"] = args ? args.technicalContactUser : undefined;
            inputs["website"] = args ? args.website : undefined;
            inputs["expiresAt"] = undefined /*out*/;
            inputs["subdomain"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OrgConfiguration.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrgConfiguration resources.
 */
export interface OrgConfigurationState {
    /**
     * Primary address of org
     */
    address1?: pulumi.Input<string>;
    /**
     * Secondary address of org
     */
    address2?: pulumi.Input<string>;
    /**
     * User ID representing the billing contact
     */
    billingContactUser?: pulumi.Input<string>;
    /**
     * City of org
     */
    city?: pulumi.Input<string>;
    /**
     * Name of org
     */
    companyName?: pulumi.Input<string>;
    /**
     * Country of org
     */
    country?: pulumi.Input<string>;
    /**
     * Support link of org
     */
    endUserSupportHelpUrl?: pulumi.Input<string>;
    /**
     * Expiration of org
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * Local path to logo of the org.
     */
    logo?: pulumi.Input<string>;
    /**
     * Indicates whether the org's users receive Okta Communication emails
     */
    optOutCommunicationEmails?: pulumi.Input<boolean>;
    /**
     * Support help phone of org
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Postal code of org
     */
    postalCode?: pulumi.Input<string>;
    /**
     * State of org
     */
    state?: pulumi.Input<string>;
    /**
     * Subdomain of org
     */
    subdomain?: pulumi.Input<string>;
    /**
     * Support help phone of org
     */
    supportPhoneNumber?: pulumi.Input<string>;
    /**
     * User ID representing the technical contact
     */
    technicalContactUser?: pulumi.Input<string>;
    /**
     * The org's website
     */
    website?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrgConfiguration resource.
 */
export interface OrgConfigurationArgs {
    /**
     * Primary address of org
     */
    address1?: pulumi.Input<string>;
    /**
     * Secondary address of org
     */
    address2?: pulumi.Input<string>;
    /**
     * User ID representing the billing contact
     */
    billingContactUser?: pulumi.Input<string>;
    /**
     * City of org
     */
    city?: pulumi.Input<string>;
    /**
     * Name of org
     */
    companyName: pulumi.Input<string>;
    /**
     * Country of org
     */
    country?: pulumi.Input<string>;
    /**
     * Support link of org
     */
    endUserSupportHelpUrl?: pulumi.Input<string>;
    /**
     * Local path to logo of the org.
     */
    logo?: pulumi.Input<string>;
    /**
     * Indicates whether the org's users receive Okta Communication emails
     */
    optOutCommunicationEmails?: pulumi.Input<boolean>;
    /**
     * Support help phone of org
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Postal code of org
     */
    postalCode?: pulumi.Input<string>;
    /**
     * State of org
     */
    state?: pulumi.Input<string>;
    /**
     * Support help phone of org
     */
    supportPhoneNumber?: pulumi.Input<string>;
    /**
     * User ID representing the technical contact
     */
    technicalContactUser?: pulumi.Input<string>;
    /**
     * The org's website
     */
    website?: pulumi.Input<string>;
}