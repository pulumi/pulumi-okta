// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get a behavior by name or ID.
 */
export function getBehaviour(args?: GetBehaviourArgs, opts?: pulumi.InvokeOptions): Promise<GetBehaviourResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getBehaviour:getBehaviour", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getBehaviour.
 */
export interface GetBehaviourArgs {
    /**
     * Behavior ID.
     */
    id?: string;
    /**
     * Behavior name.
     */
    name?: string;
}

/**
 * A collection of values returned by getBehaviour.
 */
export interface GetBehaviourResult {
    /**
     * Behavior ID.
     */
    readonly id?: string;
    /**
     * Behavior name.
     */
    readonly name?: string;
    /**
     * Map of behavior settings.
     */
    readonly settings: {[key: string]: string};
    /**
     * Behavior status.
     */
    readonly status: string;
    /**
     * Behavior type.
     */
    readonly type: string;
}
/**
 * Get a behavior by name or ID.
 */
export function getBehaviourOutput(args?: GetBehaviourOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBehaviourResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getBehaviour:getBehaviour", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getBehaviour.
 */
export interface GetBehaviourOutputArgs {
    /**
     * Behavior ID.
     */
    id?: pulumi.Input<string>;
    /**
     * Behavior name.
     */
    name?: pulumi.Input<string>;
}
