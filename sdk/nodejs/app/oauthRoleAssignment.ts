// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages assignment of an admin role to an OAuth application.
 *
 * This resource allows you to assign an Okta admin role to a OAuth service application. This requires the Okta tenant feature flag for this function to be enabled.
 *
 * ## Import
 *
 * OAuth Role assignment can be imported by passing the Client ID and Role Assignment ID for the specific client role.
 *
 * ```sh
 *  $ pulumi import okta:app/oauthRoleAssignment:OauthRoleAssignment test <clientID>/<roleAssignmentID>`
 * ```
 */
export class OauthRoleAssignment extends pulumi.CustomResource {
    /**
     * Get an existing OauthRoleAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OauthRoleAssignmentState, opts?: pulumi.CustomResourceOptions): OauthRoleAssignment {
        return new OauthRoleAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:app/oauthRoleAssignment:OauthRoleAssignment';

    /**
     * Returns true if the given object is an instance of OauthRoleAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OauthRoleAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OauthRoleAssignment.__pulumiType;
    }

    /**
     * Client ID for the role to be assigned to
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * Label of the role assignment
     */
    public /*out*/ readonly label!: pulumi.Output<string>;
    /**
     * Resource set for the custom role to assign, must be the ID of the created resource set.
     */
    public readonly resourceSet!: pulumi.Output<string | undefined>;
    /**
     * Custom Role ID
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Status of the role assignment
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a OauthRoleAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OauthRoleAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OauthRoleAssignmentArgs | OauthRoleAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OauthRoleAssignmentState | undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["resourceSet"] = state ? state.resourceSet : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as OauthRoleAssignmentArgs | undefined;
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["resourceSet"] = args ? args.resourceSet : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["label"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OauthRoleAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OauthRoleAssignment resources.
 */
export interface OauthRoleAssignmentState {
    /**
     * Client ID for the role to be assigned to
     */
    clientId?: pulumi.Input<string>;
    /**
     * Label of the role assignment
     */
    label?: pulumi.Input<string>;
    /**
     * Resource set for the custom role to assign, must be the ID of the created resource set.
     */
    resourceSet?: pulumi.Input<string>;
    /**
     * Custom Role ID
     */
    role?: pulumi.Input<string>;
    /**
     * Status of the role assignment
     */
    status?: pulumi.Input<string>;
    /**
     * Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OauthRoleAssignment resource.
 */
export interface OauthRoleAssignmentArgs {
    /**
     * Client ID for the role to be assigned to
     */
    clientId: pulumi.Input<string>;
    /**
     * Resource set for the custom role to assign, must be the ID of the created resource set.
     */
    resourceSet?: pulumi.Input<string>;
    /**
     * Custom Role ID
     */
    role?: pulumi.Input<string>;
    /**
     * Role type to assign. This can be one of the standard Okta roles, such as `HELP_DESK_ADMIN`, or `CUSTOM`. Using custom requires the `resourceSet` and `role` attributes to be set.
     */
    type: pulumi.Input<string>;
}