// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve an auth server from Okta.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.auth.getServer({
 *     name: "Example Auth",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServer(args: GetServerArgs, opts?: pulumi.InvokeOptions): Promise<GetServerResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:auth/getServer:getServer", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getServer.
 */
export interface GetServerArgs {
    /**
     * The name of the auth server to retrieve.
     */
    name: string;
}

/**
 * A collection of values returned by getServer.
 */
export interface GetServerResult {
    /**
     * array of audiences.
     */
    readonly audiences: string[];
    /**
     * last time credentials were rotated.
     */
    readonly credentialsLastRotated: string;
    /**
     * next time credentials will be rotated
     */
    readonly credentialsNextRotation: string;
    /**
     * mode of credential rotation, auto or manual.
     */
    readonly credentialsRotationMode: string;
    /**
     * description of Authorization server.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The complete URL of the authorization server. This becomes the `iss` claim in an access token.
     */
    readonly issuer: string;
    /**
     * Can be set to `"CUSTOM_URL"` or `"ORG_URL"`
     */
    readonly issuerMode: string;
    /**
     * auth server key id.
     */
    readonly kid: string;
    /**
     * The name of the auth server.
     */
    readonly name: string;
    /**
     * the activation status of the authorization server.
     */
    readonly status: string;
}
/**
 * Use this data source to retrieve an auth server from Okta.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.auth.getServer({
 *     name: "Example Auth",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServerOutput(args: GetServerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerResult> {
    return pulumi.output(args).apply((a: any) => getServer(a, opts))
}

/**
 * A collection of arguments for invoking getServer.
 */
export interface GetServerOutputArgs {
    /**
     * The name of the auth server to retrieve.
     */
    name: pulumi.Input<string>;
}
