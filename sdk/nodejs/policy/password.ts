// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a Password Policy.
 *
 * This resource allows you to create and configure a Password Policy.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as okta from "@pulumi/okta";
 *
 * const example = new okta.policy.Password("example", {
 *     description: "Example",
 *     groupsIncludeds: [data.okta_group.everyone.id],
 *     passwordHistoryCount: 4,
 *     status: "ACTIVE",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * A Password Policy can be imported via the Okta ID.
 *
 * ```sh
 * $ pulumi import okta:policy/password:Password example &#60;policy id&#62;
 * ```
 */
export class Password extends pulumi.CustomResource {
    /**
     * Get an existing Password resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PasswordState, opts?: pulumi.CustomResourceOptions): Password {
        return new Password(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'okta:policy/password:Password';

    /**
     * Returns true if the given object is an instance of Password.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Password {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Password.__pulumiType;
    }

    /**
     * Authentication Provider: `"OKTA"`, `"ACTIVE_DIRECTORY"` or `"LDAP"`. Default is `"OKTA"`. Type `"string"`
     */
    public readonly authProvider!: pulumi.Output<string | undefined>;
    /**
     * Enable or disable voice call password recovery: ACTIVE or INACTIVE.  Type `"string"`
     */
    public readonly callRecovery!: pulumi.Output<string | undefined>;
    /**
     * Policy Description. Type `"string"`
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable or disable email password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    public readonly emailRecovery!: pulumi.Output<string | undefined>;
    /**
     * List of Group IDs to Include. Type `"list(string)"`
     */
    public readonly groupsIncludeds!: pulumi.Output<string[] | undefined>;
    /**
     * Policy Name. Type `"string"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Number of minutes before a locked account is unlocked: 0 = no limit.  Type `"number"`
     */
    public readonly passwordAutoUnlockMinutes!: pulumi.Output<number | undefined>;
    /**
     * Check Passwords Against Common Password Dictionary. Type `"bool"`
     */
    public readonly passwordDictionaryLookup!: pulumi.Output<boolean | undefined>;
    /**
     * User firstName attribute must be excluded from the password. Type `"bool"`
     */
    public readonly passwordExcludeFirstName!: pulumi.Output<boolean | undefined>;
    /**
     * User lastName attribute must be excluded from the password. Type `"bool"`
     */
    public readonly passwordExcludeLastName!: pulumi.Output<boolean | undefined>;
    /**
     * If the username must be excluded from the password. Type `"bool"`
     */
    public readonly passwordExcludeUsername!: pulumi.Output<boolean | undefined>;
    /**
     * Length in days a user will be warned before password expiry: 0 = no warning.  Type `"number"`
     */
    public readonly passwordExpireWarnDays!: pulumi.Output<number | undefined>;
    /**
     * Number of distinct passwords that must be created before they can be reused: 0 = none.  Type `"number"`
     */
    public readonly passwordHistoryCount!: pulumi.Output<number | undefined>;
    /**
     * Notification channels to use to notify a user when their account has been locked. Type `"set(string)"`
     */
    public readonly passwordLockoutNotificationChannels!: pulumi.Output<string[] | undefined>;
    /**
     * Length in days a password is valid before expiry: 0 = no limit.  Type `"number"`
     */
    public readonly passwordMaxAgeDays!: pulumi.Output<number | undefined>;
    /**
     * Number of unsuccessful login attempts allowed before lockout: 0 = no limit.  Type `"number"`
     */
    public readonly passwordMaxLockoutAttempts!: pulumi.Output<number | undefined>;
    /**
     * Minimum time interval in minutes between password changes: 0 = no limit.  Type `"number"`
     */
    public readonly passwordMinAgeMinutes!: pulumi.Output<number | undefined>;
    /**
     * Minimum password length. Default is 8. Type `"number"`
     */
    public readonly passwordMinLength!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of lower case characters in a password. Type `"number"`
     */
    public readonly passwordMinLowercase!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of numbers in a password. Type `"number"`
     */
    public readonly passwordMinNumber!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of symbols in a password. Type `"number"`
     */
    public readonly passwordMinSymbol!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of upper case characters in a password. Type `"number"`
     */
    public readonly passwordMinUppercase!: pulumi.Output<number | undefined>;
    /**
     * If a user should be informed when their account is locked.  Type `"bool"`
     */
    public readonly passwordShowLockoutFailures!: pulumi.Output<boolean | undefined>;
    /**
     * Priority of the policy. Type `"number"`
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Min length of the password recovery question answer.  Type `"number"`
     */
    public readonly questionMinLength!: pulumi.Output<number | undefined>;
    /**
     * Enable or disable security question password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    public readonly questionRecovery!: pulumi.Output<string | undefined>;
    /**
     * Lifetime in minutes of the recovery email token.  Type `"number"`
     */
    public readonly recoveryEmailToken!: pulumi.Output<number | undefined>;
    /**
     * When an Active Directory user is locked out of Okta, the Okta unlock operation should also attempt to unlock the user's Windows account. Type `"bool"`
     */
    public readonly skipUnlock!: pulumi.Output<boolean | undefined>;
    /**
     * Enable or disable SMS password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    public readonly smsRecovery!: pulumi.Output<string | undefined>;
    /**
     * Policy Status: `"ACTIVE"` or `"INACTIVE"`. Type `"string"`
     */
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a Password resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PasswordArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PasswordArgs | PasswordState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PasswordState | undefined;
            resourceInputs["authProvider"] = state ? state.authProvider : undefined;
            resourceInputs["callRecovery"] = state ? state.callRecovery : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["emailRecovery"] = state ? state.emailRecovery : undefined;
            resourceInputs["groupsIncludeds"] = state ? state.groupsIncludeds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["passwordAutoUnlockMinutes"] = state ? state.passwordAutoUnlockMinutes : undefined;
            resourceInputs["passwordDictionaryLookup"] = state ? state.passwordDictionaryLookup : undefined;
            resourceInputs["passwordExcludeFirstName"] = state ? state.passwordExcludeFirstName : undefined;
            resourceInputs["passwordExcludeLastName"] = state ? state.passwordExcludeLastName : undefined;
            resourceInputs["passwordExcludeUsername"] = state ? state.passwordExcludeUsername : undefined;
            resourceInputs["passwordExpireWarnDays"] = state ? state.passwordExpireWarnDays : undefined;
            resourceInputs["passwordHistoryCount"] = state ? state.passwordHistoryCount : undefined;
            resourceInputs["passwordLockoutNotificationChannels"] = state ? state.passwordLockoutNotificationChannels : undefined;
            resourceInputs["passwordMaxAgeDays"] = state ? state.passwordMaxAgeDays : undefined;
            resourceInputs["passwordMaxLockoutAttempts"] = state ? state.passwordMaxLockoutAttempts : undefined;
            resourceInputs["passwordMinAgeMinutes"] = state ? state.passwordMinAgeMinutes : undefined;
            resourceInputs["passwordMinLength"] = state ? state.passwordMinLength : undefined;
            resourceInputs["passwordMinLowercase"] = state ? state.passwordMinLowercase : undefined;
            resourceInputs["passwordMinNumber"] = state ? state.passwordMinNumber : undefined;
            resourceInputs["passwordMinSymbol"] = state ? state.passwordMinSymbol : undefined;
            resourceInputs["passwordMinUppercase"] = state ? state.passwordMinUppercase : undefined;
            resourceInputs["passwordShowLockoutFailures"] = state ? state.passwordShowLockoutFailures : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["questionMinLength"] = state ? state.questionMinLength : undefined;
            resourceInputs["questionRecovery"] = state ? state.questionRecovery : undefined;
            resourceInputs["recoveryEmailToken"] = state ? state.recoveryEmailToken : undefined;
            resourceInputs["skipUnlock"] = state ? state.skipUnlock : undefined;
            resourceInputs["smsRecovery"] = state ? state.smsRecovery : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PasswordArgs | undefined;
            resourceInputs["authProvider"] = args ? args.authProvider : undefined;
            resourceInputs["callRecovery"] = args ? args.callRecovery : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["emailRecovery"] = args ? args.emailRecovery : undefined;
            resourceInputs["groupsIncludeds"] = args ? args.groupsIncludeds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["passwordAutoUnlockMinutes"] = args ? args.passwordAutoUnlockMinutes : undefined;
            resourceInputs["passwordDictionaryLookup"] = args ? args.passwordDictionaryLookup : undefined;
            resourceInputs["passwordExcludeFirstName"] = args ? args.passwordExcludeFirstName : undefined;
            resourceInputs["passwordExcludeLastName"] = args ? args.passwordExcludeLastName : undefined;
            resourceInputs["passwordExcludeUsername"] = args ? args.passwordExcludeUsername : undefined;
            resourceInputs["passwordExpireWarnDays"] = args ? args.passwordExpireWarnDays : undefined;
            resourceInputs["passwordHistoryCount"] = args ? args.passwordHistoryCount : undefined;
            resourceInputs["passwordLockoutNotificationChannels"] = args ? args.passwordLockoutNotificationChannels : undefined;
            resourceInputs["passwordMaxAgeDays"] = args ? args.passwordMaxAgeDays : undefined;
            resourceInputs["passwordMaxLockoutAttempts"] = args ? args.passwordMaxLockoutAttempts : undefined;
            resourceInputs["passwordMinAgeMinutes"] = args ? args.passwordMinAgeMinutes : undefined;
            resourceInputs["passwordMinLength"] = args ? args.passwordMinLength : undefined;
            resourceInputs["passwordMinLowercase"] = args ? args.passwordMinLowercase : undefined;
            resourceInputs["passwordMinNumber"] = args ? args.passwordMinNumber : undefined;
            resourceInputs["passwordMinSymbol"] = args ? args.passwordMinSymbol : undefined;
            resourceInputs["passwordMinUppercase"] = args ? args.passwordMinUppercase : undefined;
            resourceInputs["passwordShowLockoutFailures"] = args ? args.passwordShowLockoutFailures : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["questionMinLength"] = args ? args.questionMinLength : undefined;
            resourceInputs["questionRecovery"] = args ? args.questionRecovery : undefined;
            resourceInputs["recoveryEmailToken"] = args ? args.recoveryEmailToken : undefined;
            resourceInputs["skipUnlock"] = args ? args.skipUnlock : undefined;
            resourceInputs["smsRecovery"] = args ? args.smsRecovery : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Password.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Password resources.
 */
export interface PasswordState {
    /**
     * Authentication Provider: `"OKTA"`, `"ACTIVE_DIRECTORY"` or `"LDAP"`. Default is `"OKTA"`. Type `"string"`
     */
    authProvider?: pulumi.Input<string>;
    /**
     * Enable or disable voice call password recovery: ACTIVE or INACTIVE.  Type `"string"`
     */
    callRecovery?: pulumi.Input<string>;
    /**
     * Policy Description. Type `"string"`
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable email password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    emailRecovery?: pulumi.Input<string>;
    /**
     * List of Group IDs to Include. Type `"list(string)"`
     */
    groupsIncludeds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Policy Name. Type `"string"`
     */
    name?: pulumi.Input<string>;
    /**
     * Number of minutes before a locked account is unlocked: 0 = no limit.  Type `"number"`
     */
    passwordAutoUnlockMinutes?: pulumi.Input<number>;
    /**
     * Check Passwords Against Common Password Dictionary. Type `"bool"`
     */
    passwordDictionaryLookup?: pulumi.Input<boolean>;
    /**
     * User firstName attribute must be excluded from the password. Type `"bool"`
     */
    passwordExcludeFirstName?: pulumi.Input<boolean>;
    /**
     * User lastName attribute must be excluded from the password. Type `"bool"`
     */
    passwordExcludeLastName?: pulumi.Input<boolean>;
    /**
     * If the username must be excluded from the password. Type `"bool"`
     */
    passwordExcludeUsername?: pulumi.Input<boolean>;
    /**
     * Length in days a user will be warned before password expiry: 0 = no warning.  Type `"number"`
     */
    passwordExpireWarnDays?: pulumi.Input<number>;
    /**
     * Number of distinct passwords that must be created before they can be reused: 0 = none.  Type `"number"`
     */
    passwordHistoryCount?: pulumi.Input<number>;
    /**
     * Notification channels to use to notify a user when their account has been locked. Type `"set(string)"`
     */
    passwordLockoutNotificationChannels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Length in days a password is valid before expiry: 0 = no limit.  Type `"number"`
     */
    passwordMaxAgeDays?: pulumi.Input<number>;
    /**
     * Number of unsuccessful login attempts allowed before lockout: 0 = no limit.  Type `"number"`
     */
    passwordMaxLockoutAttempts?: pulumi.Input<number>;
    /**
     * Minimum time interval in minutes between password changes: 0 = no limit.  Type `"number"`
     */
    passwordMinAgeMinutes?: pulumi.Input<number>;
    /**
     * Minimum password length. Default is 8. Type `"number"`
     */
    passwordMinLength?: pulumi.Input<number>;
    /**
     * Minimum number of lower case characters in a password. Type `"number"`
     */
    passwordMinLowercase?: pulumi.Input<number>;
    /**
     * Minimum number of numbers in a password. Type `"number"`
     */
    passwordMinNumber?: pulumi.Input<number>;
    /**
     * Minimum number of symbols in a password. Type `"number"`
     */
    passwordMinSymbol?: pulumi.Input<number>;
    /**
     * Minimum number of upper case characters in a password. Type `"number"`
     */
    passwordMinUppercase?: pulumi.Input<number>;
    /**
     * If a user should be informed when their account is locked.  Type `"bool"`
     */
    passwordShowLockoutFailures?: pulumi.Input<boolean>;
    /**
     * Priority of the policy. Type `"number"`
     */
    priority?: pulumi.Input<number>;
    /**
     * Min length of the password recovery question answer.  Type `"number"`
     */
    questionMinLength?: pulumi.Input<number>;
    /**
     * Enable or disable security question password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    questionRecovery?: pulumi.Input<string>;
    /**
     * Lifetime in minutes of the recovery email token.  Type `"number"`
     */
    recoveryEmailToken?: pulumi.Input<number>;
    /**
     * When an Active Directory user is locked out of Okta, the Okta unlock operation should also attempt to unlock the user's Windows account. Type `"bool"`
     */
    skipUnlock?: pulumi.Input<boolean>;
    /**
     * Enable or disable SMS password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    smsRecovery?: pulumi.Input<string>;
    /**
     * Policy Status: `"ACTIVE"` or `"INACTIVE"`. Type `"string"`
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Password resource.
 */
export interface PasswordArgs {
    /**
     * Authentication Provider: `"OKTA"`, `"ACTIVE_DIRECTORY"` or `"LDAP"`. Default is `"OKTA"`. Type `"string"`
     */
    authProvider?: pulumi.Input<string>;
    /**
     * Enable or disable voice call password recovery: ACTIVE or INACTIVE.  Type `"string"`
     */
    callRecovery?: pulumi.Input<string>;
    /**
     * Policy Description. Type `"string"`
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable email password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    emailRecovery?: pulumi.Input<string>;
    /**
     * List of Group IDs to Include. Type `"list(string)"`
     */
    groupsIncludeds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Policy Name. Type `"string"`
     */
    name?: pulumi.Input<string>;
    /**
     * Number of minutes before a locked account is unlocked: 0 = no limit.  Type `"number"`
     */
    passwordAutoUnlockMinutes?: pulumi.Input<number>;
    /**
     * Check Passwords Against Common Password Dictionary. Type `"bool"`
     */
    passwordDictionaryLookup?: pulumi.Input<boolean>;
    /**
     * User firstName attribute must be excluded from the password. Type `"bool"`
     */
    passwordExcludeFirstName?: pulumi.Input<boolean>;
    /**
     * User lastName attribute must be excluded from the password. Type `"bool"`
     */
    passwordExcludeLastName?: pulumi.Input<boolean>;
    /**
     * If the username must be excluded from the password. Type `"bool"`
     */
    passwordExcludeUsername?: pulumi.Input<boolean>;
    /**
     * Length in days a user will be warned before password expiry: 0 = no warning.  Type `"number"`
     */
    passwordExpireWarnDays?: pulumi.Input<number>;
    /**
     * Number of distinct passwords that must be created before they can be reused: 0 = none.  Type `"number"`
     */
    passwordHistoryCount?: pulumi.Input<number>;
    /**
     * Notification channels to use to notify a user when their account has been locked. Type `"set(string)"`
     */
    passwordLockoutNotificationChannels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Length in days a password is valid before expiry: 0 = no limit.  Type `"number"`
     */
    passwordMaxAgeDays?: pulumi.Input<number>;
    /**
     * Number of unsuccessful login attempts allowed before lockout: 0 = no limit.  Type `"number"`
     */
    passwordMaxLockoutAttempts?: pulumi.Input<number>;
    /**
     * Minimum time interval in minutes between password changes: 0 = no limit.  Type `"number"`
     */
    passwordMinAgeMinutes?: pulumi.Input<number>;
    /**
     * Minimum password length. Default is 8. Type `"number"`
     */
    passwordMinLength?: pulumi.Input<number>;
    /**
     * Minimum number of lower case characters in a password. Type `"number"`
     */
    passwordMinLowercase?: pulumi.Input<number>;
    /**
     * Minimum number of numbers in a password. Type `"number"`
     */
    passwordMinNumber?: pulumi.Input<number>;
    /**
     * Minimum number of symbols in a password. Type `"number"`
     */
    passwordMinSymbol?: pulumi.Input<number>;
    /**
     * Minimum number of upper case characters in a password. Type `"number"`
     */
    passwordMinUppercase?: pulumi.Input<number>;
    /**
     * If a user should be informed when their account is locked.  Type `"bool"`
     */
    passwordShowLockoutFailures?: pulumi.Input<boolean>;
    /**
     * Priority of the policy. Type `"number"`
     */
    priority?: pulumi.Input<number>;
    /**
     * Min length of the password recovery question answer.  Type `"number"`
     */
    questionMinLength?: pulumi.Input<number>;
    /**
     * Enable or disable security question password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    questionRecovery?: pulumi.Input<string>;
    /**
     * Lifetime in minutes of the recovery email token.  Type `"number"`
     */
    recoveryEmailToken?: pulumi.Input<number>;
    /**
     * When an Active Directory user is locked out of Okta, the Okta unlock operation should also attempt to unlock the user's Windows account. Type `"bool"`
     */
    skipUnlock?: pulumi.Input<boolean>;
    /**
     * Enable or disable SMS password recovery: ACTIVE or INACTIVE. Type `"string"`
     */
    smsRecovery?: pulumi.Input<string>;
    /**
     * Policy Status: `"ACTIVE"` or `"INACTIVE"`. Type `"string"`
     */
    status?: pulumi.Input<string>;
}
