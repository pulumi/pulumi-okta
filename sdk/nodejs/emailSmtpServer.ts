// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class EmailSmtpServer extends pulumi.CustomResource {
    /**
     * Get an existing EmailSmtpServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailSmtpServerState, opts?: pulumi.CustomResourceOptions): EmailSmtpServer {
        return new EmailSmtpServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/emailSmtpServer:EmailSmtpServer';

    /**
     * Returns true if the given object is an instance of EmailSmtpServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailSmtpServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailSmtpServer.__pulumiType;
    }

    /**
     * Human-readable name for your SMTP server.
     */
    public readonly alias!: pulumi.Output<string>;
    /**
     * If true, routes all email traffic through your SMTP server.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Hostname or IP address of your SMTP server.
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * User name of the email domain.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * Port number of your SMTP server.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * Display name of the email domain.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a EmailSmtpServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailSmtpServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailSmtpServerArgs | EmailSmtpServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailSmtpServerState | undefined;
            resourceInputs["alias"] = state ? state.alias : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as EmailSmtpServerArgs | undefined;
            if ((!args || args.alias === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alias'");
            }
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.port === undefined) && !opts.urn) {
                throw new Error("Missing required property 'port'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["alias"] = args ? args.alias : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["password"] = args ? args.password : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailSmtpServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailSmtpServer resources.
 */
export interface EmailSmtpServerState {
    /**
     * Human-readable name for your SMTP server.
     */
    alias?: pulumi.Input<string>;
    /**
     * If true, routes all email traffic through your SMTP server.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Hostname or IP address of your SMTP server.
     */
    host?: pulumi.Input<string>;
    /**
     * User name of the email domain.
     */
    password?: pulumi.Input<string>;
    /**
     * Port number of your SMTP server.
     */
    port?: pulumi.Input<number>;
    /**
     * Display name of the email domain.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailSmtpServer resource.
 */
export interface EmailSmtpServerArgs {
    /**
     * Human-readable name for your SMTP server.
     */
    alias: pulumi.Input<string>;
    /**
     * If true, routes all email traffic through your SMTP server.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Hostname or IP address of your SMTP server.
     */
    host: pulumi.Input<string>;
    /**
     * User name of the email domain.
     */
    password: pulumi.Input<string>;
    /**
     * Port number of your SMTP server.
     */
    port: pulumi.Input<number>;
    /**
     * Display name of the email domain.
     */
    username: pulumi.Input<string>;
}
