// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.EmailDomain("example", {
 *     brandId: "abc123",
 *     domain: "example.com",
 *     displayName: "test",
 *     userName: "paul_atreides",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/emailDomain:EmailDomain example <domain_id>
 * ```
 */
export class EmailDomain extends pulumi.CustomResource {
    /**
     * Get an existing EmailDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailDomainState, opts?: pulumi.CustomResourceOptions): EmailDomain {
        return new EmailDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/emailDomain:EmailDomain';

    /**
     * Returns true if the given object is an instance of EmailDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailDomain.__pulumiType;
    }

    /**
     * Brand id of the email domain.
     */
    public readonly brandId!: pulumi.Output<string>;
    /**
     * Display name of the email domain.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * TXT and cname records to be registered for the email Domain
     */
    public /*out*/ readonly dnsValidationRecords!: pulumi.Output<outputs.EmailDomainDnsValidationRecord[]>;
    /**
     * Mail domain to send from.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * User name of the email domain.
     */
    public readonly userName!: pulumi.Output<string>;
    /**
     * Status of the email domain. Values: NOT*STARTED, IN*PROGRESS, VERIFIED, COMPLETED
     */
    public /*out*/ readonly validationStatus!: pulumi.Output<string>;

    /**
     * Create a EmailDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailDomainArgs | EmailDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailDomainState | undefined;
            resourceInputs["brandId"] = state ? state.brandId : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["dnsValidationRecords"] = state ? state.dnsValidationRecords : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
            resourceInputs["validationStatus"] = state ? state.validationStatus : undefined;
        } else {
            const args = argsOrState as EmailDomainArgs | undefined;
            if ((!args || args.brandId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'brandId'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.userName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userName'");
            }
            resourceInputs["brandId"] = args ? args.brandId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
            resourceInputs["dnsValidationRecords"] = undefined /*out*/;
            resourceInputs["validationStatus"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailDomain resources.
 */
export interface EmailDomainState {
    /**
     * Brand id of the email domain.
     */
    brandId?: pulumi.Input<string>;
    /**
     * Display name of the email domain.
     */
    displayName?: pulumi.Input<string>;
    /**
     * TXT and cname records to be registered for the email Domain
     */
    dnsValidationRecords?: pulumi.Input<pulumi.Input<inputs.EmailDomainDnsValidationRecord>[]>;
    /**
     * Mail domain to send from.
     */
    domain?: pulumi.Input<string>;
    /**
     * User name of the email domain.
     */
    userName?: pulumi.Input<string>;
    /**
     * Status of the email domain. Values: NOT*STARTED, IN*PROGRESS, VERIFIED, COMPLETED
     */
    validationStatus?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailDomain resource.
 */
export interface EmailDomainArgs {
    /**
     * Brand id of the email domain.
     */
    brandId: pulumi.Input<string>;
    /**
     * Display name of the email domain.
     */
    displayName: pulumi.Input<string>;
    /**
     * Mail domain to send from.
     */
    domain: pulumi.Input<string>;
    /**
     * User name of the email domain.
     */
    userName: pulumi.Input<string>;
}
