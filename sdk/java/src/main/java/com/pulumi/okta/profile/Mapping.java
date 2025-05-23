// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.profile;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.profile.MappingArgs;
import com.pulumi.okta.profile.inputs.MappingState;
import com.pulumi.okta.profile.outputs.MappingMapping;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a profile mapping. This resource allows you to manage a profile mapping by source and target IDs. &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.manage` scope.
 * 
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
 * import com.pulumi.okta.user.UserFunctions;
 * import com.pulumi.okta.profile.Mapping;
 * import com.pulumi.okta.profile.MappingArgs;
 * import com.pulumi.okta.profile.inputs.MappingMappingArgs;
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
 *         final var user = UserFunctions.getUserProfileMappingSource(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new Mapping("example", MappingArgs.builder()
 *             .sourceId("<source id>")
 *             .targetId(user.id())
 *             .deleteWhenAbsent(true)
 *             .mappings(            
 *                 MappingMappingArgs.builder()
 *                     .id("firstName")
 *                     .expression("appuser.firstName")
 *                     .build(),
 *                 MappingMappingArgs.builder()
 *                     .id("lastName")
 *                     .expression("appuser.lastName")
 *                     .build(),
 *                 MappingMappingArgs.builder()
 *                     .id("email")
 *                     .expression("appuser.email")
 *                     .build(),
 *                 MappingMappingArgs.builder()
 *                     .id("login")
 *                     .expression("appuser.email")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="okta:profile/mapping:Mapping")
public class Mapping extends com.pulumi.resources.CustomResource {
    /**
     * Whether apply the changes to all users with this profile after updating or creating the these mappings.
     * &gt; **WARNING:**: &#39;always*apply&#39; is incompatible with OAuth 2.0 authentication and will be ignored when using that type of authentication.
     * **WARNING:** &#39;always*apply&#39; makes use of an internal/private Okta API endpoint that could change without notice rendering this resource inoperable.
     * 
     */
    @Export(name="alwaysApply", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alwaysApply;

    /**
     * @return Whether apply the changes to all users with this profile after updating or creating the these mappings.
     * &gt; **WARNING:**: &#39;always*apply&#39; is incompatible with OAuth 2.0 authentication and will be ignored when using that type of authentication.
     * **WARNING:** &#39;always*apply&#39; makes use of an internal/private Okta API endpoint that could change without notice rendering this resource inoperable.
     * 
     */
    public Output<Optional<Boolean>> alwaysApply() {
        return Codegen.optional(this.alwaysApply);
    }
    /**
     * When turned on this flag will trigger the provider to delete mapping properties that are not defined in config. By default, we do not delete missing properties.
     * 
     */
    @Export(name="deleteWhenAbsent", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteWhenAbsent;

    /**
     * @return When turned on this flag will trigger the provider to delete mapping properties that are not defined in config. By default, we do not delete missing properties.
     * 
     */
    public Output<Optional<Boolean>> deleteWhenAbsent() {
        return Codegen.optional(this.deleteWhenAbsent);
    }
    @Export(name="mappings", refs={List.class,MappingMapping.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MappingMapping>> mappings;

    public Output<Optional<List<MappingMapping>>> mappings() {
        return Codegen.optional(this.mappings);
    }
    /**
     * The source id of the mapping to manage.
     * 
     */
    @Export(name="sourceId", refs={String.class}, tree="[0]")
    private Output<String> sourceId;

    /**
     * @return The source id of the mapping to manage.
     * 
     */
    public Output<String> sourceId() {
        return this.sourceId;
    }
    /**
     * Name of the mapping source.
     * 
     */
    @Export(name="sourceName", refs={String.class}, tree="[0]")
    private Output<String> sourceName;

    /**
     * @return Name of the mapping source.
     * 
     */
    public Output<String> sourceName() {
        return this.sourceName;
    }
    /**
     * ID of the mapping source.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output<String> sourceType;

    /**
     * @return ID of the mapping source.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * The target id of the mapping to manage.
     * 
     */
    @Export(name="targetId", refs={String.class}, tree="[0]")
    private Output<String> targetId;

    /**
     * @return The target id of the mapping to manage.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }
    /**
     * Name of the mapping target.
     * 
     */
    @Export(name="targetName", refs={String.class}, tree="[0]")
    private Output<String> targetName;

    /**
     * @return Name of the mapping target.
     * 
     */
    public Output<String> targetName() {
        return this.targetName;
    }
    /**
     * ID of the mapping target.
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output<String> targetType;

    /**
     * @return ID of the mapping target.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Mapping(java.lang.String name) {
        this(name, MappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Mapping(java.lang.String name, MappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Mapping(java.lang.String name, MappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:profile/mapping:Mapping", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Mapping(java.lang.String name, Output<java.lang.String> id, @Nullable MappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:profile/mapping:Mapping", name, state, makeResourceOptions(options, id), false);
    }

    private static MappingArgs makeArgs(MappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MappingArgs.Empty : args;
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
    public static Mapping get(java.lang.String name, Output<java.lang.String> id, @Nullable MappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Mapping(name, id, state, options);
    }
}
