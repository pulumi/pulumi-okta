// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.AppSignonPolicyRuleArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.AppSignonPolicyRuleState;
import com.pulumi.okta.outputs.AppSignonPolicyRulePlatformInclude;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a sign-on policy rules for the application.
 * &gt; **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * This resource allows you to create and configure a sign-on policy rule for the application.
 * A default or &#39;Catch-all Rule&#39; sign-on policy rule can be imported and managed as a custom rule.
 * The only difference is that these fields are immutable and can not be managed: &#39;network_connection&#39;, &#39;network_excludes&#39;,
 * &#39;network_includes&#39;, &#39;platform_include&#39;, &#39;custom_expression&#39;, &#39;device_is_registered&#39;, &#39;device_is_managed&#39;, &#39;users_excluded&#39;,
 * &#39;users_included&#39;, &#39;groups_excluded&#39;, &#39;groups_included&#39;, &#39;user_types_excluded&#39; and &#39;user_types_included&#39;.
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import okta:index/appSignonPolicyRule:AppSignonPolicyRule example &lt;policy_id&gt;/&lt;rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="okta:index/appSignonPolicyRule:AppSignonPolicyRule")
public class AppSignonPolicyRule extends com.pulumi.resources.CustomResource {
    /**
     * Allow or deny access based on the rule conditions: ALLOW or DENY
     * 
     */
    @Export(name="access", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> access;

    /**
     * @return Allow or deny access based on the rule conditions: ALLOW or DENY
     * 
     */
    public Output<Optional<String>> access() {
        return Codegen.optional(this.access);
    }
    /**
     * Authentication method chains. Only supports 5 items in the array. Each chain can support maximum 3 steps. To be used only with verification method type `AUTH_METHOD_CHAIN`.
     * 
     */
    @Export(name="chains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> chains;

    /**
     * @return Authentication method chains. Only supports 5 items in the array. Each chain can support maximum 3 steps. To be used only with verification method type `AUTH_METHOD_CHAIN`.
     * 
     */
    public Output<Optional<List<String>>> chains() {
        return Codegen.optional(this.chains);
    }
    /**
     * An array that contains nested Authenticator Constraint objects that are organized by the Authenticator class
     * 
     */
    @Export(name="constraints", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> constraints;

    /**
     * @return An array that contains nested Authenticator Constraint objects that are organized by the Authenticator class
     * 
     */
    public Output<Optional<List<String>>> constraints() {
        return Codegen.optional(this.constraints);
    }
    /**
     * This is an optional advanced setting. If the expression is formatted incorrectly or conflicts with conditions set above, the rule may not match any users.
     * 
     */
    @Export(name="customExpression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customExpression;

    /**
     * @return This is an optional advanced setting. If the expression is formatted incorrectly or conflicts with conditions set above, the rule may not match any users.
     * 
     */
    public Output<Optional<String>> customExpression() {
        return Codegen.optional(this.customExpression);
    }
    /**
     * List of device assurance IDs to include
     * 
     */
    @Export(name="deviceAssurancesIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> deviceAssurancesIncludeds;

    /**
     * @return List of device assurance IDs to include
     * 
     */
    public Output<Optional<List<String>>> deviceAssurancesIncludeds() {
        return Codegen.optional(this.deviceAssurancesIncludeds);
    }
    /**
     * If the device is managed. A device is managed if it&#39;s managed by a device management system. When managed is passed, registered must also be included and must be set to true.
     * 
     */
    @Export(name="deviceIsManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deviceIsManaged;

    /**
     * @return If the device is managed. A device is managed if it&#39;s managed by a device management system. When managed is passed, registered must also be included and must be set to true.
     * 
     */
    public Output<Optional<Boolean>> deviceIsManaged() {
        return Codegen.optional(this.deviceIsManaged);
    }
    /**
     * If the device is registered. A device is registered if the User enrolls with Okta Verify that is installed on the device.
     * 
     */
    @Export(name="deviceIsRegistered", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deviceIsRegistered;

    /**
     * @return If the device is registered. A device is registered if the User enrolls with Okta Verify that is installed on the device.
     * 
     */
    public Output<Optional<Boolean>> deviceIsRegistered() {
        return Codegen.optional(this.deviceIsRegistered);
    }
    /**
     * The number of factors required to satisfy this assurance level
     * 
     */
    @Export(name="factorMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> factorMode;

    /**
     * @return The number of factors required to satisfy this assurance level
     * 
     */
    public Output<Optional<String>> factorMode() {
        return Codegen.optional(this.factorMode);
    }
    /**
     * List of group IDs to exclude
     * 
     */
    @Export(name="groupsExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupsExcludeds;

    /**
     * @return List of group IDs to exclude
     * 
     */
    public Output<Optional<List<String>>> groupsExcludeds() {
        return Codegen.optional(this.groupsExcludeds);
    }
    /**
     * List of group IDs to include
     * 
     */
    @Export(name="groupsIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupsIncludeds;

    /**
     * @return List of group IDs to include
     * 
     */
    public Output<Optional<List<String>>> groupsIncludeds() {
        return Codegen.optional(this.groupsIncludeds);
    }
    /**
     * The inactivity duration after which the end user must re-authenticate. Use the ISO 8601 Period format for recurring time intervals.
     * 
     */
    @Export(name="inactivityPeriod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> inactivityPeriod;

    /**
     * @return The inactivity duration after which the end user must re-authenticate. Use the ISO 8601 Period format for recurring time intervals.
     * 
     */
    public Output<Optional<String>> inactivityPeriod() {
        return Codegen.optional(this.inactivityPeriod);
    }
    /**
     * Policy Rule Name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Policy Rule Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network selection mode: ANYWHERE, ZONE, ON*NETWORK, or OFF*NETWORK.
     * 
     */
    @Export(name="networkConnection", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkConnection;

    /**
     * @return Network selection mode: ANYWHERE, ZONE, ON*NETWORK, or OFF*NETWORK.
     * 
     */
    public Output<Optional<String>> networkConnection() {
        return Codegen.optional(this.networkConnection);
    }
    /**
     * The zones to exclude
     * 
     */
    @Export(name="networkExcludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> networkExcludes;

    /**
     * @return The zones to exclude
     * 
     */
    public Output<Optional<List<String>>> networkExcludes() {
        return Codegen.optional(this.networkExcludes);
    }
    /**
     * The zones to include
     * 
     */
    @Export(name="networkIncludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> networkIncludes;

    /**
     * @return The zones to include
     * 
     */
    public Output<Optional<List<String>>> networkIncludes() {
        return Codegen.optional(this.networkIncludes);
    }
    @Export(name="platformIncludes", refs={List.class,AppSignonPolicyRulePlatformInclude.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AppSignonPolicyRulePlatformInclude>> platformIncludes;

    public Output<Optional<List<AppSignonPolicyRulePlatformInclude>>> platformIncludes() {
        return Codegen.optional(this.platformIncludes);
    }
    /**
     * ID of the policy
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return ID of the policy
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * Priority of the rule.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the rule.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The duration after which the end user must re-authenticate, regardless of user activity. Use the ISO 8601 Period format for recurring time intervals. PT0S - Every sign-in attempt, PT43800H - Once per session
     * 
     */
    @Export(name="reAuthenticationFrequency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reAuthenticationFrequency;

    /**
     * @return The duration after which the end user must re-authenticate, regardless of user activity. Use the ISO 8601 Period format for recurring time intervals. PT0S - Every sign-in attempt, PT43800H - Once per session
     * 
     */
    public Output<Optional<String>> reAuthenticationFrequency() {
        return Codegen.optional(this.reAuthenticationFrequency);
    }
    /**
     * The risk score specifies a particular level of risk to match on: ANY, LOW, MEDIUM, HIGH
     * 
     */
    @Export(name="riskScore", refs={String.class}, tree="[0]")
    private Output<String> riskScore;

    /**
     * @return The risk score specifies a particular level of risk to match on: ANY, LOW, MEDIUM, HIGH
     * 
     */
    public Output<String> riskScore() {
        return this.riskScore;
    }
    /**
     * Status of the rule
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the rule
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Often the `Catch-all Rule` this rule is the system (default) rule for its associated policy
     * 
     */
    @Export(name="system", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> system;

    /**
     * @return Often the `Catch-all Rule` this rule is the system (default) rule for its associated policy
     * 
     */
    public Output<Boolean> system() {
        return this.system;
    }
    /**
     * The Verification Method type
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The Verification Method type
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Set of User Type IDs to exclude
     * 
     */
    @Export(name="userTypesExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userTypesExcludeds;

    /**
     * @return Set of User Type IDs to exclude
     * 
     */
    public Output<Optional<List<String>>> userTypesExcludeds() {
        return Codegen.optional(this.userTypesExcludeds);
    }
    /**
     * Set of User Type IDs to include
     * 
     */
    @Export(name="userTypesIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userTypesIncludeds;

    /**
     * @return Set of User Type IDs to include
     * 
     */
    public Output<Optional<List<String>>> userTypesIncludeds() {
        return Codegen.optional(this.userTypesIncludeds);
    }
    /**
     * Set of User IDs to exclude
     * 
     */
    @Export(name="usersExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> usersExcludeds;

    /**
     * @return Set of User IDs to exclude
     * 
     */
    public Output<Optional<List<String>>> usersExcludeds() {
        return Codegen.optional(this.usersExcludeds);
    }
    /**
     * Set of User IDs to include
     * 
     */
    @Export(name="usersIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> usersIncludeds;

    /**
     * @return Set of User IDs to include
     * 
     */
    public Output<Optional<List<String>>> usersIncludeds() {
        return Codegen.optional(this.usersIncludeds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSignonPolicyRule(java.lang.String name) {
        this(name, AppSignonPolicyRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSignonPolicyRule(java.lang.String name, AppSignonPolicyRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSignonPolicyRule(java.lang.String name, AppSignonPolicyRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicyRule:AppSignonPolicyRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSignonPolicyRule(java.lang.String name, Output<java.lang.String> id, @Nullable AppSignonPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicyRule:AppSignonPolicyRule", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSignonPolicyRuleArgs makeArgs(AppSignonPolicyRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSignonPolicyRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppSignonPolicyRule get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSignonPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSignonPolicyRule(name, id, state, options);
    }
}
