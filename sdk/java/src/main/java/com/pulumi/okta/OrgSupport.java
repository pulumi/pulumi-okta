// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.OrgSupportArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.OrgSupportState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Okta Support access your org
 * This resource allows you to temporarily allow Okta Support to access your org as an administrator. By default,
 * access will be granted for eight hours. Removing this resource will revoke Okta Support access to your org.
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
 * import com.pulumi.okta.OrgSupport;
 * import com.pulumi.okta.OrgSupportArgs;
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
 *         var example = new OrgSupport("example", OrgSupportArgs.builder()
 *             .extendBy(1)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="okta:index/orgSupport:OrgSupport")
public class OrgSupport extends com.pulumi.resources.CustomResource {
    /**
     * Expiration of Okta Support
     * 
     */
    @Export(name="expiration", refs={String.class}, tree="[0]")
    private Output<String> expiration;

    /**
     * @return Expiration of Okta Support
     * 
     */
    public Output<String> expiration() {
        return this.expiration;
    }
    /**
     * Number of days the support should be extended by
     * 
     */
    @Export(name="extendBy", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> extendBy;

    /**
     * @return Number of days the support should be extended by
     * 
     */
    public Output<Optional<Integer>> extendBy() {
        return Codegen.optional(this.extendBy);
    }
    /**
     * Status of Okta Support
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of Okta Support
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrgSupport(java.lang.String name) {
        this(name, OrgSupportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrgSupport(java.lang.String name, @Nullable OrgSupportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrgSupport(java.lang.String name, @Nullable OrgSupportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/orgSupport:OrgSupport", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OrgSupport(java.lang.String name, Output<java.lang.String> id, @Nullable OrgSupportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/orgSupport:OrgSupport", name, state, makeResourceOptions(options, id), false);
    }

    private static OrgSupportArgs makeArgs(@Nullable OrgSupportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OrgSupportArgs.Empty : args;
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
    public static OrgSupport get(java.lang.String name, Output<java.lang.String> id, @Nullable OrgSupportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrgSupport(name, id, state, options);
    }
}
