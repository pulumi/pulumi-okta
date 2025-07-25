// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates an Authorization Server Policy. This resource allows you to create and configure an Authorization Server Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.auth.ServerPolicy("example", {
 *     authServerId: "<auth server id>",
 *     status: "ACTIVE",
 *     name: "example",
 *     description: "example",
 *     priority: 1,
 *     clientWhitelists: ["ALL_CLIENTS"],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:auth/serverPolicy:ServerPolicy example <auth_server_id>/<policy_id>
 * ```
 */
export class ServerPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ServerPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerPolicyState, opts?: pulumi.CustomResourceOptions): ServerPolicy {
        return new ServerPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:auth/serverPolicy:ServerPolicy';

    /**
     * Returns true if the given object is an instance of ServerPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerPolicy.__pulumiType;
    }

    /**
     * The ID of the Auth Server.
     */
    public readonly authServerId!: pulumi.Output<string>;
    /**
     * The clients to whitelist the policy for. `[ALL_CLIENTS]` is a special value that can be used to whitelist all clients, otherwise it is a list of client ids.
     */
    public readonly clientWhitelists!: pulumi.Output<string[]>;
    /**
     * The description of the Auth Server Policy.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The name of the Auth Server Policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Priority of the auth server policy
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * Default to `ACTIVE`
     */
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a ServerPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerPolicyArgs | ServerPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerPolicyState | undefined;
            resourceInputs["authServerId"] = state ? state.authServerId : undefined;
            resourceInputs["clientWhitelists"] = state ? state.clientWhitelists : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ServerPolicyArgs | undefined;
            if ((!args || args.authServerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authServerId'");
            }
            if ((!args || args.clientWhitelists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientWhitelists'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            resourceInputs["authServerId"] = args ? args.authServerId : undefined;
            resourceInputs["clientWhitelists"] = args ? args.clientWhitelists : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerPolicy resources.
 */
export interface ServerPolicyState {
    /**
     * The ID of the Auth Server.
     */
    authServerId?: pulumi.Input<string>;
    /**
     * The clients to whitelist the policy for. `[ALL_CLIENTS]` is a special value that can be used to whitelist all clients, otherwise it is a list of client ids.
     */
    clientWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the Auth Server Policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Auth Server Policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Priority of the auth server policy
     */
    priority?: pulumi.Input<number>;
    /**
     * Default to `ACTIVE`
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerPolicy resource.
 */
export interface ServerPolicyArgs {
    /**
     * The ID of the Auth Server.
     */
    authServerId: pulumi.Input<string>;
    /**
     * The clients to whitelist the policy for. `[ALL_CLIENTS]` is a special value that can be used to whitelist all clients, otherwise it is a list of client ids.
     */
    clientWhitelists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the Auth Server Policy.
     */
    description: pulumi.Input<string>;
    /**
     * The name of the Auth Server Policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Priority of the auth server policy
     */
    priority: pulumi.Input<number>;
    /**
     * Default to `ACTIVE`
     */
    status?: pulumi.Input<string>;
}
