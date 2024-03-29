// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve a SAML IdP from Okta.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.idp.getSaml({
 *     name: "Example App",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
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
     * The id of the idp to retrieve, conflicts with `name`.
     */
    id?: string;
    /**
     * The name of the idp to retrieve, conflicts with `id`.
     */
    name?: string;
}

/**
 * A collection of values returned by getSaml.
 */
export interface GetSamlResult {
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
     * id of idp.
     */
    readonly id?: string;
    /**
     * URI that identifies the issuer (IdP).
     */
    readonly issuer: string;
    /**
     * indicates whether Okta uses the original Okta org domain URL, or a custom domain URL in the request to the IdP.
     */
    readonly issuerMode: string;
    /**
     * Key ID reference to the IdP's X.509 signature certificate.
     */
    readonly kid: string;
    /**
     * name of the idp.
     */
    readonly name?: string;
    /**
     * single sign-on binding.
     */
    readonly ssoBinding: string;
    /**
     * SSO request binding, HTTP-POST or HTTP-REDIRECT.
     */
    readonly ssoDestination: string;
    /**
     * single sign-on url.
     */
    readonly ssoUrl: string;
    /**
     * regular expression pattern used to filter untrusted IdP usernames.
     */
    readonly subjectFilter: string;
    /**
     * Expression to generate or transform a unique username for the IdP user.
     */
    readonly subjectFormats: string[];
    /**
     * type of idp.
     */
    readonly type: string;
}
/**
 * Use this data source to retrieve a SAML IdP from Okta.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.idp.getSaml({
 *     name: "Example App",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSamlOutput(args?: GetSamlOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSamlResult> {
    return pulumi.output(args).apply((a: any) => getSaml(a, opts))
}

/**
 * A collection of arguments for invoking getSaml.
 */
export interface GetSamlOutputArgs {
    /**
     * The id of the idp to retrieve, conflicts with `name`.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the idp to retrieve, conflicts with `id`.
     */
    name?: pulumi.Input<string>;
}
