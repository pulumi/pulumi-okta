// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource to manage the assignment and unassignment of Custom Roles
 * These operations allow the creation and manipulation of custom roles as custom collections of permissions.
 *
 * > **NOTE:** This an Early Access feature.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/adminRoleCustomAssignments:AdminRoleCustomAssignments example <resource_set_id>/<custom_role_id>
 * ```
 */
export class AdminRoleCustomAssignments extends pulumi.CustomResource {
    /**
     * Get an existing AdminRoleCustomAssignments resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AdminRoleCustomAssignmentsState, opts?: pulumi.CustomResourceOptions): AdminRoleCustomAssignments {
        return new AdminRoleCustomAssignments(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/adminRoleCustomAssignments:AdminRoleCustomAssignments';

    /**
     * Returns true if the given object is an instance of AdminRoleCustomAssignments.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AdminRoleCustomAssignments {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AdminRoleCustomAssignments.__pulumiType;
    }

    /**
     * ID of the Custom Role
     */
    public readonly customRoleId!: pulumi.Output<string>;
    /**
     * The hrefs that point to User(s) and/or Group(s) that receive the Role
     */
    public readonly members!: pulumi.Output<string[] | undefined>;
    /**
     * ID of the target Resource Set
     */
    public readonly resourceSetId!: pulumi.Output<string>;

    /**
     * Create a AdminRoleCustomAssignments resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AdminRoleCustomAssignmentsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AdminRoleCustomAssignmentsArgs | AdminRoleCustomAssignmentsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AdminRoleCustomAssignmentsState | undefined;
            resourceInputs["customRoleId"] = state ? state.customRoleId : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["resourceSetId"] = state ? state.resourceSetId : undefined;
        } else {
            const args = argsOrState as AdminRoleCustomAssignmentsArgs | undefined;
            if ((!args || args.customRoleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customRoleId'");
            }
            if ((!args || args.resourceSetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceSetId'");
            }
            resourceInputs["customRoleId"] = args ? args.customRoleId : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["resourceSetId"] = args ? args.resourceSetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AdminRoleCustomAssignments.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AdminRoleCustomAssignments resources.
 */
export interface AdminRoleCustomAssignmentsState {
    /**
     * ID of the Custom Role
     */
    customRoleId?: pulumi.Input<string>;
    /**
     * The hrefs that point to User(s) and/or Group(s) that receive the Role
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the target Resource Set
     */
    resourceSetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AdminRoleCustomAssignments resource.
 */
export interface AdminRoleCustomAssignmentsArgs {
    /**
     * ID of the Custom Role
     */
    customRoleId: pulumi.Input<string>;
    /**
     * The hrefs that point to User(s) and/or Group(s) that receive the Role
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the target Resource Set
     */
    resourceSetId: pulumi.Input<string>;
}
