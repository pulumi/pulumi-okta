// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get a group from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.group.getGroup({
 *     name: "Example App",
 * });
 * ```
 */
export function getGroup(args?: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:group/getGroup:getGroup", {
        "delayReadSeconds": args.delayReadSeconds,
        "id": args.id,
        "includeUsers": args.includeUsers,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupArgs {
    /**
     * Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
     */
    delayReadSeconds?: string;
    /**
     * ID of group.
     */
    id?: string;
    /**
     * Fetch group users, having default off cuts down on API calls.
     */
    includeUsers?: boolean;
    /**
     * Name of group.
     */
    name?: string;
    type?: string;
}

/**
 * A collection of values returned by getGroup.
 */
export interface GetGroupResult {
    /**
     * Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
     */
    readonly delayReadSeconds?: string;
    /**
     * Description of group.
     */
    readonly description: string;
    /**
     * ID of group.
     */
    readonly id: string;
    /**
     * Fetch group users, having default off cuts down on API calls.
     */
    readonly includeUsers?: boolean;
    /**
     * Name of group.
     */
    readonly name: string;
    readonly type?: string;
    /**
     * Users associated with the group. This can also be done per user.
     */
    readonly users: string[];
}
/**
 * Get a group from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.group.getGroup({
 *     name: "Example App",
 * });
 * ```
 */
export function getGroupOutput(args?: GetGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGroupResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:group/getGroup:getGroup", {
        "delayReadSeconds": args.delayReadSeconds,
        "id": args.id,
        "includeUsers": args.includeUsers,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupOutputArgs {
    /**
     * Force delay of the group read by N seconds. Useful when eventual consistency of group information needs to be allowed for; for instance, when group rules are known to have been applied.
     */
    delayReadSeconds?: pulumi.Input<string>;
    /**
     * ID of group.
     */
    id?: pulumi.Input<string>;
    /**
     * Fetch group users, having default off cuts down on API calls.
     */
    includeUsers?: pulumi.Input<boolean>;
    /**
     * Name of group.
     */
    name?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
