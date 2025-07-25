// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages Okta Threat Insight Settings. This resource allows you to configure Threat Insight Settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const ipNetworkZoneExample = new okta.network.Zone("ip_network_zone_example", {
 *     name: "example",
 *     type: "IP",
 *     gateways: [
 *         "1.2.3.4/24",
 *         "2.3.4.5-2.3.4.15",
 *     ],
 *     proxies: [
 *         "2.2.3.4/24",
 *         "3.3.4.5-3.3.4.15",
 *     ],
 * });
 * const example = new okta.ThreatInsightSettings("example", {
 *     action: "block",
 *     networkExcludes: [ipNetworkZoneExample.id],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/threatInsightSettings:ThreatInsightSettings example _
 * ```
 */
export class ThreatInsightSettings extends pulumi.CustomResource {
    /**
     * Get an existing ThreatInsightSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ThreatInsightSettingsState, opts?: pulumi.CustomResourceOptions): ThreatInsightSettings {
        return new ThreatInsightSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/threatInsightSettings:ThreatInsightSettings';

    /**
     * Returns true if the given object is an instance of ThreatInsightSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ThreatInsightSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ThreatInsightSettings.__pulumiType;
    }

    /**
     * Specifies how Okta responds to authentication requests from suspicious IPs. Valid values are `none`, `audit`, or `block`. A value of `none` indicates that ThreatInsight is disabled. A value of `audit` indicates that Okta logs suspicious requests in the System Log. A value of `block` indicates that Okta logs suspicious requests in the System Log and blocks the requests.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * Accepts a list of Network Zone IDs. Can only accept zones of `IP` type. IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation. This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked. The ordering of the network zone is not guarantee from the API sides
     */
    public readonly networkExcludes!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ThreatInsightSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ThreatInsightSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ThreatInsightSettingsArgs | ThreatInsightSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ThreatInsightSettingsState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["networkExcludes"] = state ? state.networkExcludes : undefined;
        } else {
            const args = argsOrState as ThreatInsightSettingsArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["networkExcludes"] = args ? args.networkExcludes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ThreatInsightSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ThreatInsightSettings resources.
 */
export interface ThreatInsightSettingsState {
    /**
     * Specifies how Okta responds to authentication requests from suspicious IPs. Valid values are `none`, `audit`, or `block`. A value of `none` indicates that ThreatInsight is disabled. A value of `audit` indicates that Okta logs suspicious requests in the System Log. A value of `block` indicates that Okta logs suspicious requests in the System Log and blocks the requests.
     */
    action?: pulumi.Input<string>;
    /**
     * Accepts a list of Network Zone IDs. Can only accept zones of `IP` type. IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation. This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked. The ordering of the network zone is not guarantee from the API sides
     */
    networkExcludes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ThreatInsightSettings resource.
 */
export interface ThreatInsightSettingsArgs {
    /**
     * Specifies how Okta responds to authentication requests from suspicious IPs. Valid values are `none`, `audit`, or `block`. A value of `none` indicates that ThreatInsight is disabled. A value of `audit` indicates that Okta logs suspicious requests in the System Log. A value of `block` indicates that Okta logs suspicious requests in the System Log and blocks the requests.
     */
    action: pulumi.Input<string>;
    /**
     * Accepts a list of Network Zone IDs. Can only accept zones of `IP` type. IPs in the excluded Network Zones aren't logged or blocked by Okta ThreatInsight and proceed to Sign On rules evaluation. This ensures that traffic from known, trusted IPs isn't accidentally logged or blocked. The ordering of the network zone is not guarantee from the API sides
     */
    networkExcludes?: pulumi.Input<pulumi.Input<string>[]>;
}
