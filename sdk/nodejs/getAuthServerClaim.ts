// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get authorization server claim from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const test = okta.getAuthServerClaim({
 *     authServerId: "default",
 *     name: "birthdate",
 * });
 * ```
 */
export function getAuthServerClaim(args: GetAuthServerClaimArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthServerClaimResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getAuthServerClaim:getAuthServerClaim", {
        "authServerId": args.authServerId,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthServerClaim.
 */
export interface GetAuthServerClaimArgs {
    /**
     * Auth server ID
     */
    authServerId: string;
    /**
     * Name of the claim. Conflicts with `name`.
     */
    id?: string;
    /**
     * Name of the claim. Conflicts with `id`.
     */
    name?: string;
}

/**
 * A collection of values returned by getAuthServerClaim.
 */
export interface GetAuthServerClaimResult {
    /**
     * Specifies whether to include Claims in the token.
     */
    readonly alwaysIncludeInToken: boolean;
    /**
     * Auth server ID
     */
    readonly authServerId: string;
    /**
     * Specifies whether the Claim is for an access token (`RESOURCE`) or ID token (`IDENTITY`).
     */
    readonly claimType: string;
    /**
     * Name of the claim. Conflicts with `name`.
     */
    readonly id?: string;
    /**
     * Name of the claim. Conflicts with `id`.
     */
    readonly name?: string;
    /**
     * Auth server claim list of scopes
     */
    readonly scopes: string[];
    /**
     * Status of the claim.
     */
    readonly status: string;
    /**
     * Value of the claim.
     */
    readonly value: string;
    /**
     * Specifies whether the Claim is an Okta EL expression (`EXPRESSION`), a set of groups (`GROUPS`), or a system claim (`SYSTEM`)
     */
    readonly valueType: string;
}
/**
 * Get authorization server claim from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const test = okta.getAuthServerClaim({
 *     authServerId: "default",
 *     name: "birthdate",
 * });
 * ```
 */
export function getAuthServerClaimOutput(args: GetAuthServerClaimOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAuthServerClaimResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getAuthServerClaim:getAuthServerClaim", {
        "authServerId": args.authServerId,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthServerClaim.
 */
export interface GetAuthServerClaimOutputArgs {
    /**
     * Auth server ID
     */
    authServerId: pulumi.Input<string>;
    /**
     * Name of the claim. Conflicts with `name`.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the claim. Conflicts with `id`.
     */
    name?: pulumi.Input<string>;
}
