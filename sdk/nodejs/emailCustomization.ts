// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create an [email
 * customization](https://developer.okta.com/docs/reference/api/brands/#create-email-customization)
 * of an email template belonging to a brand in an Okta organization.
 */
export class EmailCustomization extends pulumi.CustomResource {
    /**
     * Get an existing EmailCustomization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailCustomizationState, opts?: pulumi.CustomResourceOptions): EmailCustomization {
        return new EmailCustomization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/emailCustomization:EmailCustomization';

    /**
     * Returns true if the given object is an instance of EmailCustomization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailCustomization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailCustomization.__pulumiType;
    }

    /**
     * The body of the customization
     */
    public readonly body!: pulumi.Output<string | undefined>;
    /**
     * Brand ID
     */
    public readonly brandId!: pulumi.Output<string>;
    /**
     * Whether the customization is the default. If `isDefault` is true and there is already a default customization when this resource is created will cause an error. Only set to true for updating a resource.
     */
    public readonly isDefault!: pulumi.Output<boolean | undefined>;
    /**
     * The language supported by the customization
     */
    public readonly language!: pulumi.Output<string | undefined>;
    /**
     * (Read-Only) Link relations for this object - JSON HAL - Discoverable resources related to the email template
     */
    public /*out*/ readonly links!: pulumi.Output<string>;
    /**
     * The subject of the customization
     */
    public readonly subject!: pulumi.Output<string | undefined>;
    /**
     * Template Name
     */
    public readonly templateName!: pulumi.Output<string>;

    /**
     * Create a EmailCustomization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailCustomizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailCustomizationArgs | EmailCustomizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailCustomizationState | undefined;
            resourceInputs["body"] = state ? state.body : undefined;
            resourceInputs["brandId"] = state ? state.brandId : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["language"] = state ? state.language : undefined;
            resourceInputs["links"] = state ? state.links : undefined;
            resourceInputs["subject"] = state ? state.subject : undefined;
            resourceInputs["templateName"] = state ? state.templateName : undefined;
        } else {
            const args = argsOrState as EmailCustomizationArgs | undefined;
            if ((!args || args.brandId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'brandId'");
            }
            if ((!args || args.templateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateName'");
            }
            resourceInputs["body"] = args ? args.body : undefined;
            resourceInputs["brandId"] = args ? args.brandId : undefined;
            resourceInputs["isDefault"] = args ? args.isDefault : undefined;
            resourceInputs["language"] = args ? args.language : undefined;
            resourceInputs["subject"] = args ? args.subject : undefined;
            resourceInputs["templateName"] = args ? args.templateName : undefined;
            resourceInputs["links"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailCustomization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailCustomization resources.
 */
export interface EmailCustomizationState {
    /**
     * The body of the customization
     */
    body?: pulumi.Input<string>;
    /**
     * Brand ID
     */
    brandId?: pulumi.Input<string>;
    /**
     * Whether the customization is the default. If `isDefault` is true and there is already a default customization when this resource is created will cause an error. Only set to true for updating a resource.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * The language supported by the customization
     */
    language?: pulumi.Input<string>;
    /**
     * (Read-Only) Link relations for this object - JSON HAL - Discoverable resources related to the email template
     */
    links?: pulumi.Input<string>;
    /**
     * The subject of the customization
     */
    subject?: pulumi.Input<string>;
    /**
     * Template Name
     */
    templateName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailCustomization resource.
 */
export interface EmailCustomizationArgs {
    /**
     * The body of the customization
     */
    body?: pulumi.Input<string>;
    /**
     * Brand ID
     */
    brandId: pulumi.Input<string>;
    /**
     * Whether the customization is the default. If `isDefault` is true and there is already a default customization when this resource is created will cause an error. Only set to true for updating a resource.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * The language supported by the customization
     */
    language?: pulumi.Input<string>;
    /**
     * The subject of the customization
     */
    subject?: pulumi.Input<string>;
    /**
     * Template Name
     */
    templateName: pulumi.Input<string>;
}