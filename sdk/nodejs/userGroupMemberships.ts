// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const test = new okta.user.User("test", {
 *     firstName: "TestAcc",
 *     lastName: "Smith",
 *     login: "testAcc-replace_with_uuid@example.com",
 *     email: "testAcc-replace_with_uuid@example.com",
 * });
 * const testUserGroupMemberships = new okta.UserGroupMemberships("test", {
 *     userId: test.id,
 *     groups: [
 *         test1.id,
 *         test2.id,
 *     ],
 * });
 * ```
 */
export class UserGroupMemberships extends pulumi.CustomResource {
    /**
     * Get an existing UserGroupMemberships resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupMembershipsState, opts?: pulumi.CustomResourceOptions): UserGroupMemberships {
        return new UserGroupMemberships(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/userGroupMemberships:UserGroupMemberships';

    /**
     * Returns true if the given object is an instance of UserGroupMemberships.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserGroupMemberships {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserGroupMemberships.__pulumiType;
    }

    /**
     * The list of Okta group IDs which the user should have membership managed for.
     */
    public readonly groups!: pulumi.Output<string[]>;
    /**
     * ID of a Okta User
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserGroupMemberships resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupMembershipsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserGroupMembershipsArgs | UserGroupMembershipsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserGroupMembershipsState | undefined;
            resourceInputs["groups"] = state ? state.groups : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserGroupMembershipsArgs | undefined;
            if ((!args || args.groups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groups'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["groups"] = args ? args.groups : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserGroupMemberships.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroupMemberships resources.
 */
export interface UserGroupMembershipsState {
    /**
     * The list of Okta group IDs which the user should have membership managed for.
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of a Okta User
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserGroupMemberships resource.
 */
export interface UserGroupMembershipsArgs {
    /**
     * The list of Okta group IDs which the user should have membership managed for.
     */
    groups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of a Okta User
     */
    userId: pulumi.Input<string>;
}
