// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.LinkDefinitionArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.LinkDefinitionState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Link definition operations allow you to manage the creation and removal of the link definitions. If you remove a link
 * definition, links based on that definition are unavailable. Note that this resource is immutable, thus can not be modified.
 * 
 * &gt; **NOTE:** Links reappear if you recreate the definition. However, Okta is likely to change this behavior so that links don&#39;t reappear. Don&#39;t rely on this behavior in production environments.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.LinkDefinition;
 * import com.pulumi.okta.LinkDefinitionArgs;
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
 *         var example = new LinkDefinition(&#34;example&#34;, LinkDefinitionArgs.builder()        
 *             .associatedDescription(&#34;Elite military force member&#34;)
 *             .associatedName(&#34;sardaukar&#34;)
 *             .associatedTitle(&#34;Sardaukar&#34;)
 *             .primaryDescription(&#34;Hereditary ruler of the Imperium and the Known Universe&#34;)
 *             .primaryName(&#34;emperor&#34;)
 *             .primaryTitle(&#34;Emperor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Okta Link Definition can be imported via the Okta Primary Link Name.
 * 
 * ```sh
 *  $ pulumi import okta:index/linkDefinition:LinkDefinition example &amp;#60;primary_name&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/linkDefinition:LinkDefinition")
public class LinkDefinition extends com.pulumi.resources.CustomResource {
    /**
     * Description of the associated relationship.
     * 
     */
    @Export(name="associatedDescription", type=String.class, parameters={})
    private Output<String> associatedDescription;

    /**
     * @return Description of the associated relationship.
     * 
     */
    public Output<String> associatedDescription() {
        return this.associatedDescription;
    }
    /**
     * API name of the associated link.
     * 
     */
    @Export(name="associatedName", type=String.class, parameters={})
    private Output<String> associatedName;

    /**
     * @return API name of the associated link.
     * 
     */
    public Output<String> associatedName() {
        return this.associatedName;
    }
    /**
     * Display name of the associated link.
     * 
     */
    @Export(name="associatedTitle", type=String.class, parameters={})
    private Output<String> associatedTitle;

    /**
     * @return Display name of the associated link.
     * 
     */
    public Output<String> associatedTitle() {
        return this.associatedTitle;
    }
    /**
     * Description of the primary relationship.
     * 
     */
    @Export(name="primaryDescription", type=String.class, parameters={})
    private Output<String> primaryDescription;

    /**
     * @return Description of the primary relationship.
     * 
     */
    public Output<String> primaryDescription() {
        return this.primaryDescription;
    }
    /**
     * API name of the primary link.
     * 
     */
    @Export(name="primaryName", type=String.class, parameters={})
    private Output<String> primaryName;

    /**
     * @return API name of the primary link.
     * 
     */
    public Output<String> primaryName() {
        return this.primaryName;
    }
    /**
     * Display name of the primary link.
     * 
     */
    @Export(name="primaryTitle", type=String.class, parameters={})
    private Output<String> primaryTitle;

    /**
     * @return Display name of the primary link.
     * 
     */
    public Output<String> primaryTitle() {
        return this.primaryTitle;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkDefinition(String name) {
        this(name, LinkDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkDefinition(String name, LinkDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkDefinition(String name, LinkDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/linkDefinition:LinkDefinition", name, args == null ? LinkDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkDefinition(String name, Output<String> id, @Nullable LinkDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/linkDefinition:LinkDefinition", name, state, makeResourceOptions(options, id));
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
    public static LinkDefinition get(String name, Output<String> id, @Nullable LinkDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkDefinition(name, id, state, options);
    }
}