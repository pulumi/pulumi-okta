// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Creates an Okta Email Template.
 *
 * This resource allows you to create and configure an Okta Email Template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.template.Email("example", {
 *     translations: [
 *         {
 *             language: "en",
 *             subject: "Stuff",
 *             template: "Hi ${user.firstName},<br/><br/>Blah blah ${resetPasswordLink}",
 *         },
 *         {
 *             language: "es",
 *             subject: "Cosas",
 *             template: "Hola ${user.firstName},<br/><br/>Puedo ir al bano ${resetPasswordLink}",
 *         },
 *     ],
 *     type: "email.forgotPassword",
 * });
 * ```
 *
 * ## Import
 *
 * An Okta Email Template can be imported via the template type.
 *
 * ```sh
 *  $ pulumi import okta:template/email:Email example <template type>
 * ```
 */
export class Email extends pulumi.CustomResource {
    /**
     * Get an existing Email resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailState, opts?: pulumi.CustomResourceOptions): Email {
        return new Email(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:template/email:Email';

    /**
     * Returns true if the given object is an instance of Email.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Email {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Email.__pulumiType;
    }

    /**
     * The default language, by default is set to `"en"`.
     */
    public readonly defaultLanguage!: pulumi.Output<string | undefined>;
    /**
     * Set of translations for a particular template.
     */
    public readonly translations!: pulumi.Output<outputs.template.EmailTranslation[]>;
    /**
     * Email template type
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Email resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailArgs | EmailState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailState | undefined;
            inputs["defaultLanguage"] = state ? state.defaultLanguage : undefined;
            inputs["translations"] = state ? state.translations : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as EmailArgs | undefined;
            if ((!args || args.translations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'translations'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["defaultLanguage"] = args ? args.defaultLanguage : undefined;
            inputs["translations"] = args ? args.translations : undefined;
            inputs["type"] = args ? args.type : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Email.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Email resources.
 */
export interface EmailState {
    /**
     * The default language, by default is set to `"en"`.
     */
    readonly defaultLanguage?: pulumi.Input<string>;
    /**
     * Set of translations for a particular template.
     */
    readonly translations?: pulumi.Input<pulumi.Input<inputs.template.EmailTranslation>[]>;
    /**
     * Email template type
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Email resource.
 */
export interface EmailArgs {
    /**
     * The default language, by default is set to `"en"`.
     */
    readonly defaultLanguage?: pulumi.Input<string>;
    /**
     * Set of translations for a particular template.
     */
    readonly translations: pulumi.Input<pulumi.Input<inputs.template.EmailTranslation>[]>;
    /**
     * Email template type
     */
    readonly type: pulumi.Input<string>;
}
