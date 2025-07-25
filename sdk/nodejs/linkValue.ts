// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages users relationships. Link value operations allow you to create relationships between primary and associated users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const padishah = new okta.LinkDefinition("padishah", {
 *     primaryName: "emperor",
 *     primaryTitle: "Emperor",
 *     primaryDescription: "Hereditary ruler of the Imperium and the Known Universe",
 *     associatedName: "sardaukar",
 *     associatedTitle: "Sardaukar",
 *     associatedDescription: "Elite military force member",
 * });
 * const emperor = new okta.user.User("emperor", {
 *     firstName: "Shaddam",
 *     lastName: "Corrino IV",
 *     login: "shaddam.corrino.iv@salusa-secundus.planet",
 *     email: "shaddam.corrino.iv@salusa-secundus.planet",
 * });
 * const sardaukars: okta.user.User[] = [];
 * for (const range = {value: 0}; range.value < 5; range.value++) {
 *     sardaukars.push(new okta.user.User(`sardaukars-${range.value}`, {
 *         firstName: "Amrit",
 *         lastName: `Sardaukar_${range.value}`,
 *         login: `amritsardaukar_${range.value}@salusa-secundus.planet`,
 *         email: `amritsardaukar_${range.value}@salusa-secundus.planet`,
 *     }));
 * }
 * const example = new okta.LinkValue("example", {
 *     primaryName: padishah.primaryName,
 *     primaryUserId: emperor.id,
 *     associatedUserIds: [
 *         sardaukars[0].id,
 *         sardaukars[1].id,
 *         sardaukars[2].id,
 *         sardaukars[3].id,
 *         sardaukars[4].id,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/linkValue:LinkValue example <primary_name>/<primary_user_id>
 * ```
 */
export class LinkValue extends pulumi.CustomResource {
    /**
     * Get an existing LinkValue resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LinkValueState, opts?: pulumi.CustomResourceOptions): LinkValue {
        return new LinkValue(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/linkValue:LinkValue';

    /**
     * Returns true if the given object is an instance of LinkValue.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LinkValue {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LinkValue.__pulumiType;
    }

    /**
     * Set of User IDs or login values of the users to be assigned the `associated` relationship.
     */
    public readonly associatedUserIds!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the `primary` relationship being assigned.
     */
    public readonly primaryName!: pulumi.Output<string>;
    /**
     * User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
     */
    public readonly primaryUserId!: pulumi.Output<string>;

    /**
     * Create a LinkValue resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LinkValueArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LinkValueArgs | LinkValueState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LinkValueState | undefined;
            resourceInputs["associatedUserIds"] = state ? state.associatedUserIds : undefined;
            resourceInputs["primaryName"] = state ? state.primaryName : undefined;
            resourceInputs["primaryUserId"] = state ? state.primaryUserId : undefined;
        } else {
            const args = argsOrState as LinkValueArgs | undefined;
            if ((!args || args.primaryName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryName'");
            }
            if ((!args || args.primaryUserId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryUserId'");
            }
            resourceInputs["associatedUserIds"] = args ? args.associatedUserIds : undefined;
            resourceInputs["primaryName"] = args ? args.primaryName : undefined;
            resourceInputs["primaryUserId"] = args ? args.primaryUserId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LinkValue.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LinkValue resources.
 */
export interface LinkValueState {
    /**
     * Set of User IDs or login values of the users to be assigned the `associated` relationship.
     */
    associatedUserIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the `primary` relationship being assigned.
     */
    primaryName?: pulumi.Input<string>;
    /**
     * User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
     */
    primaryUserId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LinkValue resource.
 */
export interface LinkValueArgs {
    /**
     * Set of User IDs or login values of the users to be assigned the `associated` relationship.
     */
    associatedUserIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the `primary` relationship being assigned.
     */
    primaryName: pulumi.Input<string>;
    /**
     * User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
     */
    primaryUserId: pulumi.Input<string>;
}
