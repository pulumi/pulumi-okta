// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and configure a custom email sender.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.EmailSender("example", {
 *     fromAddress: "no-reply@caladan.planet",
 *     fromName: "Paul Atreides",
 *     subdomain: "mail",
 * });
 * ```
 *
 * ## Import
 *
 * Custom email sender can be imported via the Okta ID.
 *
 * ```sh
 *  $ pulumi import okta:index/emailSender:EmailSender example <sender id>
 * ```
 */
export class EmailSender extends pulumi.CustomResource {
    /**
     * Get an existing EmailSender resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailSenderState, opts?: pulumi.CustomResourceOptions): EmailSender {
        return new EmailSender(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/emailSender:EmailSender';

    /**
     * Returns true if the given object is an instance of EmailSender.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailSender {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailSender.__pulumiType;
    }

    /**
     * TXT and CNAME records to be registered for the domain.
     */
    public /*out*/ readonly dnsRecords!: pulumi.Output<outputs.EmailSenderDnsRecord[]>;
    /**
     * Email address to send from.
     */
    public readonly fromAddress!: pulumi.Output<string>;
    /**
     * Name of sender.
     */
    public readonly fromName!: pulumi.Output<string>;
    /**
     * Status of the sender (shows whether the sender is verified).
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Mail domain to send from.
     */
    public readonly subdomain!: pulumi.Output<string>;

    /**
     * Create a EmailSender resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailSenderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailSenderArgs | EmailSenderState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailSenderState | undefined;
            inputs["dnsRecords"] = state ? state.dnsRecords : undefined;
            inputs["fromAddress"] = state ? state.fromAddress : undefined;
            inputs["fromName"] = state ? state.fromName : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["subdomain"] = state ? state.subdomain : undefined;
        } else {
            const args = argsOrState as EmailSenderArgs | undefined;
            if ((!args || args.fromAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fromAddress'");
            }
            if ((!args || args.fromName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fromName'");
            }
            if ((!args || args.subdomain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subdomain'");
            }
            inputs["fromAddress"] = args ? args.fromAddress : undefined;
            inputs["fromName"] = args ? args.fromName : undefined;
            inputs["subdomain"] = args ? args.subdomain : undefined;
            inputs["dnsRecords"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EmailSender.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailSender resources.
 */
export interface EmailSenderState {
    /**
     * TXT and CNAME records to be registered for the domain.
     */
    dnsRecords?: pulumi.Input<pulumi.Input<inputs.EmailSenderDnsRecord>[]>;
    /**
     * Email address to send from.
     */
    fromAddress?: pulumi.Input<string>;
    /**
     * Name of sender.
     */
    fromName?: pulumi.Input<string>;
    /**
     * Status of the sender (shows whether the sender is verified).
     */
    status?: pulumi.Input<string>;
    /**
     * Mail domain to send from.
     */
    subdomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailSender resource.
 */
export interface EmailSenderArgs {
    /**
     * Email address to send from.
     */
    fromAddress: pulumi.Input<string>;
    /**
     * Name of sender.
     */
    fromName: pulumi.Input<string>;
    /**
     * Mail domain to send from.
     */
    subdomain: pulumi.Input<string>;
}