// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get a SAML application's metadata from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.app.getMetadataSaml({
 *     appId: "<app id>",
 *     keyId: "<cert key id>",
 * });
 * ```
 */
export function getMetadataSaml(args: GetMetadataSamlArgs, opts?: pulumi.InvokeOptions): Promise<GetMetadataSamlResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:app/getMetadataSaml:getMetadataSaml", {
        "appId": args.appId,
        "keyId": args.keyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetadataSaml.
 */
export interface GetMetadataSamlArgs {
    /**
     * The application ID.
     */
    appId: string;
    /**
     * Certificate Key ID.
     */
    keyId?: string;
}

/**
 * A collection of values returned by getMetadataSaml.
 */
export interface GetMetadataSamlResult {
    /**
     * The application ID.
     */
    readonly appId: string;
    /**
     * Public certificate from application metadata.
     */
    readonly certificate: string;
    /**
     * Entity URL for instance https://www.okta.com/saml2/service-provider/sposcfdmlybtwkdcgtuf
     */
    readonly entityId: string;
    /**
     * urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Post location from the SAML metadata.
     */
    readonly httpPostBinding: string;
    /**
     * urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect location from the SAML metadata.
     */
    readonly httpRedirectBinding: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Certificate Key ID.
     */
    readonly keyId?: string;
    /**
     * Raw metadata of application.
     */
    readonly metadata: string;
    /**
     * Whether authn requests are signed.
     */
    readonly wantAuthnRequestsSigned: boolean;
}
/**
 * Get a SAML application's metadata from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.app.getMetadataSaml({
 *     appId: "<app id>",
 *     keyId: "<cert key id>",
 * });
 * ```
 */
export function getMetadataSamlOutput(args: GetMetadataSamlOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMetadataSamlResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:app/getMetadataSaml:getMetadataSaml", {
        "appId": args.appId,
        "keyId": args.keyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetadataSaml.
 */
export interface GetMetadataSamlOutputArgs {
    /**
     * The application ID.
     */
    appId: pulumi.Input<string>;
    /**
     * Certificate Key ID.
     */
    keyId?: pulumi.Input<string>;
}
