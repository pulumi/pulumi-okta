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
 * This resource allows you to manage a profile mapping by source and target IDs.
 * 
 * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.manage` scope.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * There is no reason to import this resource. You can simply create the resource config and point it to a source ID. Mind here, once the source is deleted this resources will no longer exist.
 * 
 */
@ResourceType(type="okta:profile/mapping:Mapping")
public class Mapping extends com.pulumi.resources.CustomResource {
    /**
     * Whether apply the changes to all users with this profile after updating or creating the these mappings.
     * 
     */
    @Export(name="alwaysApply", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> alwaysApply;

    /**
     * @return Whether apply the changes to all users with this profile after updating or creating the these mappings.
     * 
     */
    public Output<Optional<Boolean>> alwaysApply() {
        return Codegen.optional(this.alwaysApply);
    }
    /**
     * Tells the provider whether to attempt to delete missing mappings under profile mapping.
     * 
     */
    @Export(name="deleteWhenAbsent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteWhenAbsent;

    /**
     * @return Tells the provider whether to attempt to delete missing mappings under profile mapping.
     * 
     */
    public Output<Optional<Boolean>> deleteWhenAbsent() {
        return Codegen.optional(this.deleteWhenAbsent);
    }
    /**
     * Priority of the policy.
     * 
     */
    @Export(name="mappings", type=List.class, parameters={MappingMapping.class})
    private Output</* @Nullable */ List<MappingMapping>> mappings;

    /**
     * @return Priority of the policy.
     * 
     */
    public Output<Optional<List<MappingMapping>>> mappings() {
        return Codegen.optional(this.mappings);
    }
    /**
     * Source id of the profile mapping.
     * 
     */
    @Export(name="sourceId", type=String.class, parameters={})
    private Output<String> sourceId;

    /**
     * @return Source id of the profile mapping.
     * 
     */
    public Output<String> sourceId() {
        return this.sourceId;
    }
    /**
     * Name of the mapping source.
     * 
     */
    @Export(name="sourceName", type=String.class, parameters={})
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
    @Export(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return ID of the mapping source.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * ID of the mapping target.
     * 
     */
    @Export(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return ID of the mapping target.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }
    /**
     * Name of the mapping target.
     * 
     */
    @Export(name="targetName", type=String.class, parameters={})
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
    @Export(name="targetType", type=String.class, parameters={})
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
    public Mapping(String name) {
        this(name, MappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Mapping(String name, MappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Mapping(String name, MappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:profile/mapping:Mapping", name, args == null ? MappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Mapping(String name, Output<String> id, @Nullable MappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:profile/mapping:Mapping", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Mapping get(String name, Output<String> id, @Nullable MappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Mapping(name, id, state, options);
    }
}