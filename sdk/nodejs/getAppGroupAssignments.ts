// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve the list of groups assigned to the given Okta application (by ID).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const test = okta.getAppGroupAssignments({
 *     id: okta_app_oauth.test.id,
 * });
 * ```
 */
export function getAppGroupAssignments(args: GetAppGroupAssignmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppGroupAssignmentsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("okta:index/getAppGroupAssignments:getAppGroupAssignments", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppGroupAssignments.
 */
export interface GetAppGroupAssignmentsArgs {
    /**
     * The ID of the Okta application you want to retrieve the groups for.
     */
    readonly id: string;
}

/**
 * A collection of values returned by getAppGroupAssignments.
 */
export interface GetAppGroupAssignmentsResult {
    /**
     * List of groups IDs assigned to the application.
     */
    readonly groups: string[];
    /**
     * ID of application.
     */
    readonly id: string;
}