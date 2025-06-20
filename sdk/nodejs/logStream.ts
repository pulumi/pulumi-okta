// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages log streams
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/logStream:LogStream example <stream_id>
 * ```
 */
export class LogStream extends pulumi.CustomResource {
    /**
     * Get an existing LogStream resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogStreamState, opts?: pulumi.CustomResourceOptions): LogStream {
        return new LogStream(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/logStream:LogStream';

    /**
     * Returns true if the given object is an instance of LogStream.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogStream {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogStream.__pulumiType;
    }

    /**
     * Unique name for the Log Stream object
     */
    public readonly name!: pulumi.Output<string>;
    public readonly settings!: pulumi.Output<outputs.LogStreamSettings | undefined>;
    /**
     * Stream status
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * Streaming provider used - 'aws*eventbridge' or 'splunk*cloud_logstreaming'
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a LogStream resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogStreamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogStreamArgs | LogStreamState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogStreamState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as LogStreamArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogStream.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogStream resources.
 */
export interface LogStreamState {
    /**
     * Unique name for the Log Stream object
     */
    name?: pulumi.Input<string>;
    settings?: pulumi.Input<inputs.LogStreamSettings>;
    /**
     * Stream status
     */
    status?: pulumi.Input<string>;
    /**
     * Streaming provider used - 'aws*eventbridge' or 'splunk*cloud_logstreaming'
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogStream resource.
 */
export interface LogStreamArgs {
    /**
     * Unique name for the Log Stream object
     */
    name?: pulumi.Input<string>;
    settings?: pulumi.Input<inputs.LogStreamSettings>;
    /**
     * Stream status
     */
    status?: pulumi.Input<string>;
    /**
     * Streaming provider used - 'aws*eventbridge' or 'splunk*cloud_logstreaming'
     */
    type: pulumi.Input<string>;
}
