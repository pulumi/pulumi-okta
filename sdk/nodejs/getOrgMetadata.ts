// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
 */
export function getOrgMetadata(args?: GetOrgMetadataArgs, opts?: pulumi.InvokeOptions): Promise<GetOrgMetadataResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getOrgMetadata:getOrgMetadata", {
        "domains": args.domains,
        "settings": args.settings,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrgMetadata.
 */
export interface GetOrgMetadataArgs {
    /**
     * The URIs for the org's configured domains.
     */
    domains?: inputs.GetOrgMetadataDomains;
    /**
     * The wellknown org settings (safe for public consumption).
     */
    settings?: inputs.GetOrgMetadataSettings;
}

/**
 * A collection of values returned by getOrgMetadata.
 */
export interface GetOrgMetadataResult {
    /**
     * The URIs for the org's configured domains.
     */
    readonly domains?: outputs.GetOrgMetadataDomains;
    /**
     * The unique identifier of the Org.
     */
    readonly id: string;
    /**
     * The authentication pipeline of the org. idx means the org is using the Identity Engine, while v1 means the org is using the Classic authentication pipeline.
     */
    readonly pipeline: string;
    /**
     * The wellknown org settings (safe for public consumption).
     */
    readonly settings?: outputs.GetOrgMetadataSettings;
}
/**
 * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
 */
export function getOrgMetadataOutput(args?: GetOrgMetadataOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOrgMetadataResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getOrgMetadata:getOrgMetadata", {
        "domains": args.domains,
        "settings": args.settings,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrgMetadata.
 */
export interface GetOrgMetadataOutputArgs {
    /**
     * The URIs for the org's configured domains.
     */
    domains?: pulumi.Input<inputs.GetOrgMetadataDomainsArgs>;
    /**
     * The wellknown org settings (safe for public consumption).
     */
    settings?: pulumi.Input<inputs.GetOrgMetadataSettingsArgs>;
}
