// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.group.RuleArgs;
import com.pulumi.okta.group.inputs.RuleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.group.Rule;
 * import com.pulumi.okta.group.RuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Rule("example", RuleArgs.builder()
 *             .name("example")
 *             .status("ACTIVE")
 *             .groupAssignments("<group id>")
 *             .expressionType("urn:okta:expression:1.0")
 *             .expressionValue("String.startsWith(user.firstName,\"andy\")")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import okta:group/rule:Rule example &lt;group_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="okta:group/rule:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    /**
     * The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
     * 
     */
    @Export(name="expressionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expressionType;

    /**
     * @return The expression type to use to invoke the rule. The default is `urn:okta:expression:1.0`.
     * 
     */
    public Output<Optional<String>> expressionType() {
        return Codegen.optional(this.expressionType);
    }
    /**
     * The expression value.
     * 
     */
    @Export(name="expressionValue", refs={String.class}, tree="[0]")
    private Output<String> expressionValue;

    /**
     * @return The expression value.
     * 
     */
    public Output<String> expressionValue() {
        return this.expressionValue;
    }
    /**
     * The list of group ids to assign the users to.
     * 
     */
    @Export(name="groupAssignments", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> groupAssignments;

    /**
     * @return The list of group ids to assign the users to.
     * 
     */
    public Output<List<String>> groupAssignments() {
        return this.groupAssignments;
    }
    /**
     * The name of the Group Rule (min character 1; max characters 50).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Group Rule (min character 1; max characters 50).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
     * 
     */
    @Export(name="removeAssignedUsers", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> removeAssignedUsers;

    /**
     * @return Remove users added by this rule from the assigned group after deleting this resource. Default is `false`
     * 
     */
    public Output<Optional<Boolean>> removeAssignedUsers() {
        return Codegen.optional(this.removeAssignedUsers);
    }
    /**
     * Default to `ACTIVE`
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Default to `ACTIVE`
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The list of user IDs that would be excluded when rules are processed
     * 
     */
    @Export(name="usersExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> usersExcludeds;

    /**
     * @return The list of user IDs that would be excluded when rules are processed
     * 
     */
    public Output<Optional<List<String>>> usersExcludeds() {
        return Codegen.optional(this.usersExcludeds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(java.lang.String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(java.lang.String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(java.lang.String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:group/rule:Rule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Rule(java.lang.String name, Output<java.lang.String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:group/rule:Rule", name, state, makeResourceOptions(options, id), false);
    }

    private static RuleArgs makeArgs(RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RuleArgs.Empty : args;
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
    public static Rule get(java.lang.String name, Output<java.lang.String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}
