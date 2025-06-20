// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get a SAML IdP from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.idp.getSaml({
 *     name: "Example App",
 * });
 * ```
 */
export function getSaml(args?: GetSamlArgs, opts?: pulumi.InvokeOptions): Promise<GetSamlResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:idp/getSaml:getSaml", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSaml.
 */
export interface GetSamlArgs {
    /**
     * Id of idp.
     */
    id?: string;
    /**
     * Name of the idp.
     */
    name?: string;
}

/**
 * A collection of values returned by getSaml.
 */
export interface GetSamlResult {
    /**
     * ACS binding
     */
    readonly acsBinding: string;
    /**
     * Determines whether to publish an instance-specific (trust) or organization (shared) ACS endpoint in the SAML metadata.
     */
    readonly acsType: string;
    /**
     * URI that identifies the target Okta IdP instance (SP)
     */
    readonly audience: string;
    /**
     * Id of idp.
     */
    readonly id?: string;
    /**
     * URI that identifies the issuer (IdP).
     */
    readonly issuer: string;
    /**
     * Indicates whether Okta uses the original Okta org domain URL, or a custom domain URL in the request to the IdP.
     */
    readonly issuerMode: string;
    /**
     * Key ID reference to the IdP's X.509 signature certificate.
     */
    readonly kid: string;
    /**
     * Name of the idp.
     */
    readonly name?: string;
    /**
     * Single sign-on binding.
     */
    readonly ssoBinding: string;
    /**
     * SSO request binding, HTTP-POST or HTTP-REDIRECT.
     */
    readonly ssoDestination: string;
    /**
     * Single sign-on url.
     */
    readonly ssoUrl: string;
    /**
     * Regular expression pattern used to filter untrusted IdP usernames.
     */
    readonly subjectFilter: string;
    /**
     * Expression to generate or transform a unique username for the IdP user.
     */
    readonly subjectFormats: string[];
    /**
     * Type of idp.
     */
    readonly type: string;
}
/**
 * Get a SAML IdP from Okta.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.idp.getSaml({
 *     name: "Example App",
 * });
 * ```
 */
export function getSamlOutput(args?: GetSamlOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSamlResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:idp/getSaml:getSaml", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSaml.
 */
export interface GetSamlOutputArgs {
    /**
     * Id of idp.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the idp.
     */
    name?: pulumi.Input<string>;
}
