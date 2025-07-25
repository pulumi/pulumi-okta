// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Verifies the Domain. This is replacement for the `verify` field from the `okta.Domain` resource. The resource won't be created if the domain could not be verified. The provider will make several requests to verify the domain until the API returns `VERIFIED` verification status.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.Domain("example", {name: "www.example.com"});
 * const exampleDomainVerification = new okta.DomainVerification("example", {domainId: test.id});
 * ```
 */
export class DomainVerification extends pulumi.CustomResource {
    /**
     * Get an existing DomainVerification resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainVerificationState, opts?: pulumi.CustomResourceOptions): DomainVerification {
        return new DomainVerification(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/domainVerification:DomainVerification';

    /**
     * Returns true if the given object is an instance of DomainVerification.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainVerification {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainVerification.__pulumiType;
    }

    /**
     * Domain's ID
     */
    public readonly domainId!: pulumi.Output<string>;

    /**
     * Create a DomainVerification resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainVerificationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainVerificationArgs | DomainVerificationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainVerificationState | undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
        } else {
            const args = argsOrState as DomainVerificationArgs | undefined;
            if ((!args || args.domainId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainId'");
            }
            resourceInputs["domainId"] = args ? args.domainId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DomainVerification.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainVerification resources.
 */
export interface DomainVerificationState {
    /**
     * Domain's ID
     */
    domainId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DomainVerification resource.
 */
export interface DomainVerificationArgs {
    /**
     * Domain's ID
     */
    domainId: pulumi.Input<string>;
}
