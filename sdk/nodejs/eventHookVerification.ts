// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Verifies the Event Hook. The resource won't be created unless the URI provided in the event hook returns a valid JSON object with verification. See [Event Hooks](https://developer.okta.com/docs/concepts/event-hooks/#one-time-verification-request) documentation for details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.EventHook("example", {
 *     name: "example",
 *     events: [
 *         "user.lifecycle.create",
 *         "user.lifecycle.delete.initiated",
 *     ],
 *     channel: {
 *         type: "HTTP",
 *         version: "1.0.0",
 *         uri: "https://example.com/test",
 *     },
 *     auth: {
 *         type: "HEADER",
 *         key: "Authorization",
 *         value: "123",
 *     },
 * });
 * const exampleEventHookVerification = new okta.EventHookVerification("example", {eventHookId: example.id});
 * ```
 */
export class EventHookVerification extends pulumi.CustomResource {
    /**
     * Get an existing EventHookVerification resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventHookVerificationState, opts?: pulumi.CustomResourceOptions): EventHookVerification {
        return new EventHookVerification(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/eventHookVerification:EventHookVerification';

    /**
     * Returns true if the given object is an instance of EventHookVerification.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventHookVerification {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventHookVerification.__pulumiType;
    }

    /**
     * Event hook ID
     */
    public readonly eventHookId!: pulumi.Output<string>;

    /**
     * Create a EventHookVerification resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventHookVerificationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventHookVerificationArgs | EventHookVerificationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventHookVerificationState | undefined;
            resourceInputs["eventHookId"] = state ? state.eventHookId : undefined;
        } else {
            const args = argsOrState as EventHookVerificationArgs | undefined;
            if ((!args || args.eventHookId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventHookId'");
            }
            resourceInputs["eventHookId"] = args ? args.eventHookId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventHookVerification.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventHookVerification resources.
 */
export interface EventHookVerificationState {
    /**
     * Event hook ID
     */
    eventHookId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventHookVerification resource.
 */
export interface EventHookVerificationArgs {
    /**
     * Event hook ID
     */
    eventHookId: pulumi.Input<string>;
}
