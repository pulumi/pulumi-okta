// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getApps(args?: GetAppsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getApps:getApps", {
        "activeOnly": args.activeOnly,
        "includeNonDeleted": args.includeNonDeleted,
        "label": args.label,
        "labelPrefix": args.labelPrefix,
        "useOptimization": args.useOptimization,
    }, opts);
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsArgs {
    /**
     * Search only active applications.
     */
    activeOnly?: boolean;
    /**
     * Specifies whether to include non-active, but not deleted apps in the results.
     */
    includeNonDeleted?: boolean;
    /**
     * Searches for applications whose label or name property matches this value exactly.
     */
    label?: string;
    /**
     * Searches for applications whose label or name property begins with this value.
     */
    labelPrefix?: string;
    /**
     * Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
     */
    useOptimization?: boolean;
}

/**
 * A collection of values returned by getApps.
 */
export interface GetAppsResult {
    /**
     * Search only active applications.
     */
    readonly activeOnly?: boolean;
    /**
     * The list of applications that match the search criteria.
     */
    readonly apps: outputs.GetAppsApp[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies whether to include non-active, but not deleted apps in the results.
     */
    readonly includeNonDeleted?: boolean;
    /**
     * Searches for applications whose label or name property matches this value exactly.
     */
    readonly label?: string;
    /**
     * Searches for applications whose label or name property begins with this value.
     */
    readonly labelPrefix?: string;
    /**
     * Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
     */
    readonly useOptimization?: boolean;
}
export function getAppsOutput(args?: GetAppsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getApps:getApps", {
        "activeOnly": args.activeOnly,
        "includeNonDeleted": args.includeNonDeleted,
        "label": args.label,
        "labelPrefix": args.labelPrefix,
        "useOptimization": args.useOptimization,
    }, opts);
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsOutputArgs {
    /**
     * Search only active applications.
     */
    activeOnly?: pulumi.Input<boolean>;
    /**
     * Specifies whether to include non-active, but not deleted apps in the results.
     */
    includeNonDeleted?: pulumi.Input<boolean>;
    /**
     * Searches for applications whose label or name property matches this value exactly.
     */
    label?: pulumi.Input<string>;
    /**
     * Searches for applications whose label or name property begins with this value.
     */
    labelPrefix?: pulumi.Input<string>;
    /**
     * Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
     */
    useOptimization?: pulumi.Input<boolean>;
}