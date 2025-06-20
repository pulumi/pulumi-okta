// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages Profile Enrollment Policy Apps
 * > **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * This resource allows you to manage the apps in the Profile Enrollment Policy.
 * **Important Notes:**
 *  - Default Enrollment Policy can not be used in this resource since it is used as a policy to re-assign apps to when they are unassigned from this one.
 *  - When re-assigning the app to another policy, please use 'depends_on' in the policy to which the app will be assigned. This is necessary to avoid
 *      unexpected behavior, since if the app is unassigned from the policy it is just assigned to the 'Default' one.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = okta.policy.getPolicy({
 *     name: "My Policy",
 *     type: "PROFILE_ENROLLMENT",
 * });
 * const test = okta.app.getApp({
 *     label: "My App",
 * });
 * const examplePolicyProfileEnrollmentApps = new okta.PolicyProfileEnrollmentApps("example", {
 *     policyId: exampleOktaPolicy.id,
 *     apps: [id],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/policyProfileEnrollmentApps:PolicyProfileEnrollmentApps example <policy_id>
 * ```
 */
export class PolicyProfileEnrollmentApps extends pulumi.CustomResource {
    /**
     * Get an existing PolicyProfileEnrollmentApps resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyProfileEnrollmentAppsState, opts?: pulumi.CustomResourceOptions): PolicyProfileEnrollmentApps {
        return new PolicyProfileEnrollmentApps(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/policyProfileEnrollmentApps:PolicyProfileEnrollmentApps';

    /**
     * Returns true if the given object is an instance of PolicyProfileEnrollmentApps.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyProfileEnrollmentApps {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyProfileEnrollmentApps.__pulumiType;
    }

    /**
     * List of app IDs to be added to this policy
     */
    public readonly apps!: pulumi.Output<string[] | undefined>;
    /**
     * ID of the Default Enrollment Policy. This policy is used as a policy to re-assign apps to when they are unassigned from this one
     */
    public /*out*/ readonly defaultPolicyId!: pulumi.Output<string>;
    /**
     * ID of the enrollment policy.
     */
    public readonly policyId!: pulumi.Output<string>;

    /**
     * Create a PolicyProfileEnrollmentApps resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyProfileEnrollmentAppsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyProfileEnrollmentAppsArgs | PolicyProfileEnrollmentAppsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyProfileEnrollmentAppsState | undefined;
            resourceInputs["apps"] = state ? state.apps : undefined;
            resourceInputs["defaultPolicyId"] = state ? state.defaultPolicyId : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
        } else {
            const args = argsOrState as PolicyProfileEnrollmentAppsArgs | undefined;
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["apps"] = args ? args.apps : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["defaultPolicyId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyProfileEnrollmentApps.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyProfileEnrollmentApps resources.
 */
export interface PolicyProfileEnrollmentAppsState {
    /**
     * List of app IDs to be added to this policy
     */
    apps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the Default Enrollment Policy. This policy is used as a policy to re-assign apps to when they are unassigned from this one
     */
    defaultPolicyId?: pulumi.Input<string>;
    /**
     * ID of the enrollment policy.
     */
    policyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyProfileEnrollmentApps resource.
 */
export interface PolicyProfileEnrollmentAppsArgs {
    /**
     * List of app IDs to be added to this policy
     */
    apps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the enrollment policy.
     */
    policyId: pulumi.Input<string>;
}
