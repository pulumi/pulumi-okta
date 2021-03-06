// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Creates an event hook.
 *
 * This resource allows you to create and configure an event hook.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.EventHook("example", {
 *     auth: {
 *         key: "Authorization",
 *         type: "HEADER",
 *         value: "123",
 *     },
 *     channel: {
 *         type: "HTTP",
 *         uri: "https://example.com/test",
 *         version: "1.0.0",
 *     },
 *     events: [
 *         "user.lifecycle.create",
 *         "user.lifecycle.delete.initiated",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * An event hook can be imported via the Okta ID.
 *
 * ```sh
 *  $ pulumi import okta:index/eventHook:EventHook example <hook id>
 * ```
 */
export class EventHook extends pulumi.CustomResource {
    /**
     * Get an existing EventHook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventHookState, opts?: pulumi.CustomResourceOptions): EventHook {
        return new EventHook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/eventHook:EventHook';

    /**
     * Returns true if the given object is an instance of EventHook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventHook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventHook.__pulumiType;
    }

    /**
     * Authentication required for event hook request.
     */
    public readonly auth!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Details of the endpoint the event hook will hit.
     */
    public readonly channel!: pulumi.Output<{[key: string]: string}>;
    /**
     * The events that will be delivered to this hook. [See here for a list of supported events](https://developer.okta.com/docs/reference/api/event-types/?q=event-hook-eligible).
     */
    public readonly events!: pulumi.Output<string[]>;
    /**
     * Map of headers to send along in event hook request.
     */
    public readonly headers!: pulumi.Output<outputs.EventHookHeader[] | undefined>;
    /**
     * The event hook display name.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a EventHook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventHookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventHookArgs | EventHookState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventHookState | undefined;
            inputs["auth"] = state ? state.auth : undefined;
            inputs["channel"] = state ? state.channel : undefined;
            inputs["events"] = state ? state.events : undefined;
            inputs["headers"] = state ? state.headers : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EventHookArgs | undefined;
            if ((!args || args.channel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'channel'");
            }
            if ((!args || args.events === undefined) && !opts.urn) {
                throw new Error("Missing required property 'events'");
            }
            inputs["auth"] = args ? args.auth : undefined;
            inputs["channel"] = args ? args.channel : undefined;
            inputs["events"] = args ? args.events : undefined;
            inputs["headers"] = args ? args.headers : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["status"] = args ? args.status : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EventHook.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventHook resources.
 */
export interface EventHookState {
    /**
     * Authentication required for event hook request.
     */
    readonly auth?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Details of the endpoint the event hook will hit.
     */
    readonly channel?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The events that will be delivered to this hook. [See here for a list of supported events](https://developer.okta.com/docs/reference/api/event-types/?q=event-hook-eligible).
     */
    readonly events?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of headers to send along in event hook request.
     */
    readonly headers?: pulumi.Input<pulumi.Input<inputs.EventHookHeader>[]>;
    /**
     * The event hook display name.
     */
    readonly name?: pulumi.Input<string>;
    readonly status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventHook resource.
 */
export interface EventHookArgs {
    /**
     * Authentication required for event hook request.
     */
    readonly auth?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Details of the endpoint the event hook will hit.
     */
    readonly channel: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The events that will be delivered to this hook. [See here for a list of supported events](https://developer.okta.com/docs/reference/api/event-types/?q=event-hook-eligible).
     */
    readonly events: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of headers to send along in event hook request.
     */
    readonly headers?: pulumi.Input<pulumi.Input<inputs.EventHookHeader>[]>;
    /**
     * The event hook display name.
     */
    readonly name?: pulumi.Input<string>;
    readonly status?: pulumi.Input<string>;
}
