// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a User Base Schema property.
 *
 * This resource allows you to configure a base user schema property.
 *
 * IMPORTANT NOTE:
 *
 * Based on the [official documentation](https://developer.okta.com/docs/reference/api/schemas/#user-profile-base-subschema)
 * base properties can not be modified, except to update permissions, to change the nullability of `firstName` and
 * `lastName` (`required` property) or to specify a `pattern` for `login`. Currently, `title` and `type` are required, so
 * they should be set to the current values of the base property. This will be fixed in the future releases, as this is
 * a breaking change.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.UserBaseSchemaProperty("example", {
 *     index: "firstName",
 *     master: "OKTA",
 *     required: true,
 *     title: "First name",
 *     type: "string",
 *     userType: okta_user_type_example.id,
 * });
 * ```
 *
 * ## Import
 *
 * User schema property of default user type can be imported via the property index.
 *
 * ```sh
 *  $ pulumi import okta:index/userBaseSchemaProperty:UserBaseSchemaProperty example <property name>
 * ```
 *
 *  User schema property of custom user type can be imported via user type id and property index
 *
 * ```sh
 *  $ pulumi import okta:index/userBaseSchemaProperty:UserBaseSchemaProperty example <user type id>.<property name>
 * ```
 */
export class UserBaseSchemaProperty extends pulumi.CustomResource {
    /**
     * Get an existing UserBaseSchemaProperty resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserBaseSchemaPropertyState, opts?: pulumi.CustomResourceOptions): UserBaseSchemaProperty {
        return new UserBaseSchemaProperty(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/userBaseSchemaProperty:UserBaseSchemaProperty';

    /**
     * Returns true if the given object is an instance of UserBaseSchemaProperty.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserBaseSchemaProperty {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserBaseSchemaProperty.__pulumiType;
    }

    /**
     * The property name.
     */
    public readonly index!: pulumi.Output<string>;
    /**
     * Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
     */
    public readonly master!: pulumi.Output<string | undefined>;
    /**
     * The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
     */
    public readonly pattern!: pulumi.Output<string | undefined>;
    /**
     * Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
     */
    public readonly permissions!: pulumi.Output<string | undefined>;
    /**
     * Whether the property is required for this application's users.
     */
    public readonly required!: pulumi.Output<boolean | undefined>;
    /**
     * The property display name.
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * User type ID.
     */
    public readonly userType!: pulumi.Output<string | undefined>;

    /**
     * Create a UserBaseSchemaProperty resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserBaseSchemaPropertyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserBaseSchemaPropertyArgs | UserBaseSchemaPropertyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserBaseSchemaPropertyState | undefined;
            inputs["index"] = state ? state.index : undefined;
            inputs["master"] = state ? state.master : undefined;
            inputs["pattern"] = state ? state.pattern : undefined;
            inputs["permissions"] = state ? state.permissions : undefined;
            inputs["required"] = state ? state.required : undefined;
            inputs["title"] = state ? state.title : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["userType"] = state ? state.userType : undefined;
        } else {
            const args = argsOrState as UserBaseSchemaPropertyArgs | undefined;
            if ((!args || args.index === undefined) && !opts.urn) {
                throw new Error("Missing required property 'index'");
            }
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["index"] = args ? args.index : undefined;
            inputs["master"] = args ? args.master : undefined;
            inputs["pattern"] = args ? args.pattern : undefined;
            inputs["permissions"] = args ? args.permissions : undefined;
            inputs["required"] = args ? args.required : undefined;
            inputs["title"] = args ? args.title : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["userType"] = args ? args.userType : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(UserBaseSchemaProperty.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserBaseSchemaProperty resources.
 */
export interface UserBaseSchemaPropertyState {
    /**
     * The property name.
     */
    readonly index?: pulumi.Input<string>;
    /**
     * Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
     */
    readonly master?: pulumi.Input<string>;
    /**
     * The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
     */
    readonly pattern?: pulumi.Input<string>;
    /**
     * Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
     */
    readonly permissions?: pulumi.Input<string>;
    /**
     * Whether the property is required for this application's users.
     */
    readonly required?: pulumi.Input<boolean>;
    /**
     * The property display name.
     */
    readonly title?: pulumi.Input<string>;
    /**
     * The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * User type ID.
     */
    readonly userType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserBaseSchemaProperty resource.
 */
export interface UserBaseSchemaPropertyArgs {
    /**
     * The property name.
     */
    readonly index: pulumi.Input<string>;
    /**
     * Master priority for the user schema property. It can be set to `"PROFILE_MASTER"` or `"OKTA"`.
     */
    readonly master?: pulumi.Input<string>;
    /**
     * The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[<pattern>]+`.
     */
    readonly pattern?: pulumi.Input<string>;
    /**
     * Access control permissions for the property. It can be set to `"READ_WRITE"`, `"READ_ONLY"`, `"HIDE"`.
     */
    readonly permissions?: pulumi.Input<string>;
    /**
     * Whether the property is required for this application's users.
     */
    readonly required?: pulumi.Input<boolean>;
    /**
     * The property display name.
     */
    readonly title: pulumi.Input<string>;
    /**
     * The type of the schema property. It can be `"string"`, `"boolean"`, `"number"`, `"integer"`, `"array"`, or `"object"`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * User type ID.
     */
    readonly userType?: pulumi.Input<string>;
}