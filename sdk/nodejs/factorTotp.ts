// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Allows you to manage the time-based one-time password (TOTP) factors. A time-based one-time password (TOTP) is a
 * temporary passcode that is generated for user authentication. Examples of TOTP include hardware authenticators and
 * mobile app authenticators.
 *
 * Once saved, the settings cannot be changed (except for the `name` field). Any other change would force resource
 * recreation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.FactorTotp("example", {
 *     clockDriftInterval: 10,
 *     hmacAlgorithm: "HMacSHA256",
 *     otpLength: 10,
 *     sharedSecretEncoding: "hexadecimal",
 *     timeStep: 30,
 * });
 * ```
 */
export class FactorTotp extends pulumi.CustomResource {
    /**
     * Get an existing FactorTotp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FactorTotpState, opts?: pulumi.CustomResourceOptions): FactorTotp {
        return new FactorTotp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/factorTotp:FactorTotp';

    /**
     * Returns true if the given object is an instance of FactorTotp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FactorTotp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FactorTotp.__pulumiType;
    }

    /**
     * - Clock drift interval. This setting allows you to build in tolerance for any
     * drift between the token's current time and the server's current time. Valid values: `3`, `5`, `10`. Default is `3`.
     */
    public readonly clockDriftInterval!: pulumi.Output<number | undefined>;
    /**
     * - HMAC Algorithm. Valid values: `"HMacSHA1"`, `"HMacSHA256"`, `"HMacSHA512"`. Default
     * is `"HMacSHA512"`.
     */
    public readonly hmacAlgorithm!: pulumi.Output<string | undefined>;
    /**
     * The TOTP name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Length of the password. Default is `6`.
     */
    public readonly otpLength!: pulumi.Output<number | undefined>;
    /**
     * - Shared secret encoding. Valid values: `"base32"`, `"base64"`, `"hexadecimal"`.
     * Default is `"base32"`.
     */
    public readonly sharedSecretEncoding!: pulumi.Output<string | undefined>;
    /**
     * - Time step in seconds. Valid values: `15`, `30`, `60`. Default is `15`.
     */
    public readonly timeStep!: pulumi.Output<number | undefined>;

    /**
     * Create a FactorTotp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FactorTotpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FactorTotpArgs | FactorTotpState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FactorTotpState | undefined;
            inputs["clockDriftInterval"] = state ? state.clockDriftInterval : undefined;
            inputs["hmacAlgorithm"] = state ? state.hmacAlgorithm : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["otpLength"] = state ? state.otpLength : undefined;
            inputs["sharedSecretEncoding"] = state ? state.sharedSecretEncoding : undefined;
            inputs["timeStep"] = state ? state.timeStep : undefined;
        } else {
            const args = argsOrState as FactorTotpArgs | undefined;
            inputs["clockDriftInterval"] = args ? args.clockDriftInterval : undefined;
            inputs["hmacAlgorithm"] = args ? args.hmacAlgorithm : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["otpLength"] = args ? args.otpLength : undefined;
            inputs["sharedSecretEncoding"] = args ? args.sharedSecretEncoding : undefined;
            inputs["timeStep"] = args ? args.timeStep : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(FactorTotp.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FactorTotp resources.
 */
export interface FactorTotpState {
    /**
     * - Clock drift interval. This setting allows you to build in tolerance for any
     * drift between the token's current time and the server's current time. Valid values: `3`, `5`, `10`. Default is `3`.
     */
    readonly clockDriftInterval?: pulumi.Input<number>;
    /**
     * - HMAC Algorithm. Valid values: `"HMacSHA1"`, `"HMacSHA256"`, `"HMacSHA512"`. Default
     * is `"HMacSHA512"`.
     */
    readonly hmacAlgorithm?: pulumi.Input<string>;
    /**
     * The TOTP name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Length of the password. Default is `6`.
     */
    readonly otpLength?: pulumi.Input<number>;
    /**
     * - Shared secret encoding. Valid values: `"base32"`, `"base64"`, `"hexadecimal"`.
     * Default is `"base32"`.
     */
    readonly sharedSecretEncoding?: pulumi.Input<string>;
    /**
     * - Time step in seconds. Valid values: `15`, `30`, `60`. Default is `15`.
     */
    readonly timeStep?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FactorTotp resource.
 */
export interface FactorTotpArgs {
    /**
     * - Clock drift interval. This setting allows you to build in tolerance for any
     * drift between the token's current time and the server's current time. Valid values: `3`, `5`, `10`. Default is `3`.
     */
    readonly clockDriftInterval?: pulumi.Input<number>;
    /**
     * - HMAC Algorithm. Valid values: `"HMacSHA1"`, `"HMacSHA256"`, `"HMacSHA512"`. Default
     * is `"HMacSHA512"`.
     */
    readonly hmacAlgorithm?: pulumi.Input<string>;
    /**
     * The TOTP name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Length of the password. Default is `6`.
     */
    readonly otpLength?: pulumi.Input<number>;
    /**
     * - Shared secret encoding. Valid values: `"base32"`, `"base64"`, `"hexadecimal"`.
     * Default is `"base32"`.
     */
    readonly sharedSecretEncoding?: pulumi.Input<string>;
    /**
     * - Time step in seconds. Valid values: `15`, `30`, `60`. Default is `15`.
     */
    readonly timeStep?: pulumi.Input<number>;
}