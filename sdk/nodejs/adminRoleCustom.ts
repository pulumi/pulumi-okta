// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * These operations allow the creation and manipulation of custom roles as custom collections of permissions.
 *
 * > **NOTE:** This an `Early Access` feature.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.AdminRoleCustom("example", {
 *     description: "This role allows app assignment management",
 *     label: "AppAssignmentManager",
 *     permissions: ["okta.apps.assignment.manage"],
 * });
 * ```
 *
 * ## Import
 *
 * Okta Custom Admin Role can be imported via the Okta ID.
 *
 * ```sh
 *  $ pulumi import okta:index/adminRoleCustom:AdminRoleCustom example <custom role id>
 * ```
 */
export class AdminRoleCustom extends pulumi.CustomResource {
    /**
     * Get an existing AdminRoleCustom resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AdminRoleCustomState, opts?: pulumi.CustomResourceOptions): AdminRoleCustom {
        return new AdminRoleCustom(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/adminRoleCustom:AdminRoleCustom';

    /**
     * Returns true if the given object is an instance of AdminRoleCustom.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AdminRoleCustom {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AdminRoleCustom.__pulumiType;
    }

    /**
     * A human-readable description of the new Role.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The name given to the new Role.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The permissions that the new Role grants. At least one
     * permission must be specified when creating custom role. Valid values:`"okta.users.manage"`,
     * `"okta.users.create"`,`"okta.users.read"`,`"okta.users.credentials.manage"`,`"okta.users.userprofile.manage"`,
     * `"okta.users.lifecycle.manage"`,`"okta.users.groupMembership.manage"`,`"okta.users.appAssignment.manage"`,
     * `"okta.groups.manage"`,`"okta.groups.create"`,`"okta.groups.members.manage"`,`"okta.groups.read"`,
     * `"okta.groups.appAssignment.manage"`,`"okta.apps.read"`,`"okta.apps.manage"`,`"okta.apps.assignment.manage"`.
     */
    public readonly permissions!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AdminRoleCustom resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AdminRoleCustomArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AdminRoleCustomArgs | AdminRoleCustomState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AdminRoleCustomState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["permissions"] = state ? state.permissions : undefined;
        } else {
            const args = argsOrState as AdminRoleCustomArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["permissions"] = args ? args.permissions : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AdminRoleCustom.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AdminRoleCustom resources.
 */
export interface AdminRoleCustomState {
    /**
     * A human-readable description of the new Role.
     */
    description?: pulumi.Input<string>;
    /**
     * The name given to the new Role.
     */
    label?: pulumi.Input<string>;
    /**
     * The permissions that the new Role grants. At least one
     * permission must be specified when creating custom role. Valid values:`"okta.users.manage"`,
     * `"okta.users.create"`,`"okta.users.read"`,`"okta.users.credentials.manage"`,`"okta.users.userprofile.manage"`,
     * `"okta.users.lifecycle.manage"`,`"okta.users.groupMembership.manage"`,`"okta.users.appAssignment.manage"`,
     * `"okta.groups.manage"`,`"okta.groups.create"`,`"okta.groups.members.manage"`,`"okta.groups.read"`,
     * `"okta.groups.appAssignment.manage"`,`"okta.apps.read"`,`"okta.apps.manage"`,`"okta.apps.assignment.manage"`.
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AdminRoleCustom resource.
 */
export interface AdminRoleCustomArgs {
    /**
     * A human-readable description of the new Role.
     */
    description: pulumi.Input<string>;
    /**
     * The name given to the new Role.
     */
    label: pulumi.Input<string>;
    /**
     * The permissions that the new Role grants. At least one
     * permission must be specified when creating custom role. Valid values:`"okta.users.manage"`,
     * `"okta.users.create"`,`"okta.users.read"`,`"okta.users.credentials.manage"`,`"okta.users.userprofile.manage"`,
     * `"okta.users.lifecycle.manage"`,`"okta.users.groupMembership.manage"`,`"okta.users.appAssignment.manage"`,
     * `"okta.groups.manage"`,`"okta.groups.create"`,`"okta.groups.members.manage"`,`"okta.groups.read"`,
     * `"okta.groups.appAssignment.manage"`,`"okta.apps.read"`,`"okta.apps.manage"`,`"okta.apps.assignment.manage"`.
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
}