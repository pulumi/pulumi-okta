// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages Security Notification Emails
 * 		This resource allows you to configure Security Notification Emails.
 * 		> **WARNING:** This resource is available only when using a SSWS API token in the provider config, it is incompatible with OAuth 2.0 authentication.
 * 		> **WARNING:** This resource makes use of an internal/private Okta API endpoint that could change without notice rendering this resource inoperable.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.SecurityNotificationEmails("example", {
 *     reportSuspiciousActivityEnabled: true,
 *     sendEmailForFactorEnrollmentEnabled: true,
 *     sendEmailForFactorResetEnabled: true,
 *     sendEmailForNewDeviceEnabled: true,
 *     sendEmailForPasswordChangedEnabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import okta:index/securityNotificationEmails:SecurityNotificationEmails example _
 * ```
 */
export class SecurityNotificationEmails extends pulumi.CustomResource {
    /**
     * Get an existing SecurityNotificationEmails resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityNotificationEmailsState, opts?: pulumi.CustomResourceOptions): SecurityNotificationEmails {
        return new SecurityNotificationEmails(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:index/securityNotificationEmails:SecurityNotificationEmails';

    /**
     * Returns true if the given object is an instance of SecurityNotificationEmails.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityNotificationEmails {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityNotificationEmails.__pulumiType;
    }

    /**
     * Notifies end users about suspicious or unrecognized activity from their account. Default is `true`.
     */
    public readonly reportSuspiciousActivityEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Notifies end users of any activity on their account related to MFA factor enrollment. Default is `true`.
     */
    public readonly sendEmailForFactorEnrollmentEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Notifies end users that one or more factors have been reset for their account. Default is `true`.
     */
    public readonly sendEmailForFactorResetEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Notifies end users about new sign-on activity. Default is `true`.
     */
    public readonly sendEmailForNewDeviceEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Notifies end users that the password for their account has changed. Default is `true`.
     */
    public readonly sendEmailForPasswordChangedEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SecurityNotificationEmails resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityNotificationEmailsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityNotificationEmailsArgs | SecurityNotificationEmailsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityNotificationEmailsState | undefined;
            resourceInputs["reportSuspiciousActivityEnabled"] = state ? state.reportSuspiciousActivityEnabled : undefined;
            resourceInputs["sendEmailForFactorEnrollmentEnabled"] = state ? state.sendEmailForFactorEnrollmentEnabled : undefined;
            resourceInputs["sendEmailForFactorResetEnabled"] = state ? state.sendEmailForFactorResetEnabled : undefined;
            resourceInputs["sendEmailForNewDeviceEnabled"] = state ? state.sendEmailForNewDeviceEnabled : undefined;
            resourceInputs["sendEmailForPasswordChangedEnabled"] = state ? state.sendEmailForPasswordChangedEnabled : undefined;
        } else {
            const args = argsOrState as SecurityNotificationEmailsArgs | undefined;
            resourceInputs["reportSuspiciousActivityEnabled"] = args ? args.reportSuspiciousActivityEnabled : undefined;
            resourceInputs["sendEmailForFactorEnrollmentEnabled"] = args ? args.sendEmailForFactorEnrollmentEnabled : undefined;
            resourceInputs["sendEmailForFactorResetEnabled"] = args ? args.sendEmailForFactorResetEnabled : undefined;
            resourceInputs["sendEmailForNewDeviceEnabled"] = args ? args.sendEmailForNewDeviceEnabled : undefined;
            resourceInputs["sendEmailForPasswordChangedEnabled"] = args ? args.sendEmailForPasswordChangedEnabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityNotificationEmails.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityNotificationEmails resources.
 */
export interface SecurityNotificationEmailsState {
    /**
     * Notifies end users about suspicious or unrecognized activity from their account. Default is `true`.
     */
    reportSuspiciousActivityEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users of any activity on their account related to MFA factor enrollment. Default is `true`.
     */
    sendEmailForFactorEnrollmentEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users that one or more factors have been reset for their account. Default is `true`.
     */
    sendEmailForFactorResetEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users about new sign-on activity. Default is `true`.
     */
    sendEmailForNewDeviceEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users that the password for their account has changed. Default is `true`.
     */
    sendEmailForPasswordChangedEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SecurityNotificationEmails resource.
 */
export interface SecurityNotificationEmailsArgs {
    /**
     * Notifies end users about suspicious or unrecognized activity from their account. Default is `true`.
     */
    reportSuspiciousActivityEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users of any activity on their account related to MFA factor enrollment. Default is `true`.
     */
    sendEmailForFactorEnrollmentEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users that one or more factors have been reset for their account. Default is `true`.
     */
    sendEmailForFactorResetEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users about new sign-on activity. Default is `true`.
     */
    sendEmailForNewDeviceEnabled?: pulumi.Input<boolean>;
    /**
     * Notifies end users that the password for their account has changed. Default is `true`.
     */
    sendEmailForPasswordChangedEnabled?: pulumi.Input<boolean>;
}
