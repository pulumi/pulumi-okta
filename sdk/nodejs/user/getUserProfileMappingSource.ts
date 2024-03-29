// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
 *
 * > **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.user.getUserProfileMappingSource({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getUserProfileMappingSource(opts?: pulumi.InvokeOptions): Promise<GetUserProfileMappingSourceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:user/getUserProfileMappingSource:getUserProfileMappingSource", {
    }, opts);
}

/**
 * A collection of values returned by getUserProfileMappingSource.
 */
export interface GetUserProfileMappingSourceResult {
    /**
     * id of the source.
     */
    readonly id: string;
    /**
     * name of source.
     */
    readonly name: string;
    /**
     * type of source.
     */
    readonly type: string;
}
/**
 * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
 *
 * > **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.user.getUserProfileMappingSource({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getUserProfileMappingSourceOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetUserProfileMappingSourceResult> {
    return pulumi.output(getUserProfileMappingSource(opts))
}
