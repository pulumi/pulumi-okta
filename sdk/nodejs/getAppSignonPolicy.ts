// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get a sign-on policy for the application.
 *
 * > **WARNING:** This feature is only available as a part of the
 * Identity Engine. Contact support
 * for further information.
 *
 * > Inside the product a sign-on policy is referenced as an _authentication
 * policy_, in the public API the policy is of type
 * [`ACCESS_POLICY`](https://developer.okta.com/docs/reference/api/policy/#policy-object).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.getAppSignonPolicy({
 *     appId: "app_id",
 * });
 * ```
 */
export function getAppSignonPolicy(args: GetAppSignonPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSignonPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getAppSignonPolicy:getAppSignonPolicy", {
        "appId": args.appId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSignonPolicy.
 */
export interface GetAppSignonPolicyArgs {
    /**
     * App ID
     */
    appId: string;
}

/**
 * A collection of values returned by getAppSignonPolicy.
 */
export interface GetAppSignonPolicyResult {
    /**
     * App ID
     */
    readonly appId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Policy name
     */
    readonly name: string;
}
/**
 * Get a sign-on policy for the application.
 *
 * > **WARNING:** This feature is only available as a part of the
 * Identity Engine. Contact support
 * for further information.
 *
 * > Inside the product a sign-on policy is referenced as an _authentication
 * policy_, in the public API the policy is of type
 * [`ACCESS_POLICY`](https://developer.okta.com/docs/reference/api/policy/#policy-object).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.getAppSignonPolicy({
 *     appId: "app_id",
 * });
 * ```
 */
export function getAppSignonPolicyOutput(args: GetAppSignonPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSignonPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getAppSignonPolicy:getAppSignonPolicy", {
        "appId": args.appId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSignonPolicy.
 */
export interface GetAppSignonPolicyOutputArgs {
    /**
     * App ID
     */
    appId: pulumi.Input<string>;
}
