// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve a [Brand](https://developer.okta.com/docs/reference/api/brands/#brand-object) from Okta.
 */
export function getBrand(args: GetBrandArgs, opts?: pulumi.InvokeOptions): Promise<GetBrandResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("okta:index/getBrand:getBrand", {
        "brandId": args.brandId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBrand.
 */
export interface GetBrandArgs {
    /**
     * Brand ID
     */
    brandId: string;
}

/**
 * A collection of values returned by getBrand.
 */
export interface GetBrandResult {
    readonly brandId: string;
    /**
     * Custom privacy policy URL
     */
    readonly customPrivacyPolicyUrl: string;
    /**
     * Brand ID
     */
    readonly id: string;
    /**
     * Link relations for this object - JSON HAL - Discoverable resources related to the brand
     */
    readonly links: string;
    /**
     * Removes "Powered by Okta" from the Okta-hosted sign-in page, and "© 2021 Okta, Inc." from the Okta End-User Dashboard
     */
    readonly removePoweredByOkta: boolean;
}

export function getBrandOutput(args: GetBrandOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBrandResult> {
    return pulumi.output(args).apply(a => getBrand(a, opts))
}

/**
 * A collection of arguments for invoking getBrand.
 */
export interface GetBrandOutputArgs {
    /**
     * Brand ID
     */
    brandId: pulumi.Input<string>;
}