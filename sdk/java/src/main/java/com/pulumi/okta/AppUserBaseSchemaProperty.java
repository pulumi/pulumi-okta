// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.AppUserBaseSchemaPropertyArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.AppUserBaseSchemaPropertyState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Application User Base Schema property.
 * 
 * This resource allows you to configure a base app user schema property.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.AppUserBaseSchemaProperty;
 * import com.pulumi.okta.AppUserBaseSchemaPropertyArgs;
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
 *         var example = new AppUserBaseSchemaProperty(&#34;example&#34;, AppUserBaseSchemaPropertyArgs.builder()        
 *             .appId(&#34;&lt;app id&gt;&#34;)
 *             .index(&#34;customPropertyName&#34;)
 *             .master(&#34;OKTA&#34;)
 *             .title(&#34;customPropertyName&#34;)
 *             .type(&#34;string&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * App user base schema property can be imported via the property index and app id.
 * 
 * ```sh
 * $ pulumi import okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty example &amp;#60;app id&amp;#62;/&amp;#60;property name&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty")
public class AppUserBaseSchemaProperty extends com.pulumi.resources.CustomResource {
    /**
     * The Application&#39;s ID the user schema property should be assigned to.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The Application&#39;s ID the user schema property should be assigned to.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The property name.
     * 
     */
    @Export(name="index", refs={String.class}, tree="[0]")
    private Output<String> index;

    /**
     * @return The property name.
     * 
     */
    public Output<String> index() {
        return this.index;
    }
    /**
     * Master priority for the user schema property. It can be set to `&#34;PROFILE_MASTER&#34;` or `&#34;OKTA&#34;`.
     * 
     */
    @Export(name="master", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> master;

    /**
     * @return Master priority for the user schema property. It can be set to `&#34;PROFILE_MASTER&#34;` or `&#34;OKTA&#34;`.
     * 
     */
    public Output<Optional<String>> master() {
        return Codegen.optional(this.master);
    }
    /**
     * The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[&lt;pattern&gt;]+`.
     * 
     */
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pattern;

    /**
     * @return The validation pattern to use for the subschema, only available for `login` property. Must be in form of `.+`, or `[&lt;pattern&gt;]+`.
     * 
     */
    public Output<Optional<String>> pattern() {
        return Codegen.optional(this.pattern);
    }
    /**
     * Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
     * 
     */
    @Export(name="permissions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> permissions;

    /**
     * @return Access control permissions for the property. It can be set to `&#34;READ_WRITE&#34;`, `&#34;READ_ONLY&#34;`, `&#34;HIDE&#34;`.
     * 
     */
    public Output<Optional<String>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * Whether the property is required for this application&#39;s users.
     * 
     */
    @Export(name="required", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> required;

    /**
     * @return Whether the property is required for this application&#39;s users.
     * 
     */
    public Output<Optional<Boolean>> required() {
        return Codegen.optional(this.required);
    }
    /**
     * The property display name.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return The property display name.
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    /**
     * The type of the schema property. It can be `&#34;string&#34;`, `&#34;boolean&#34;`, `&#34;number&#34;`, `&#34;integer&#34;`, `&#34;array&#34;`, or `&#34;object&#34;`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the schema property. It can be `&#34;string&#34;`, `&#34;boolean&#34;`, `&#34;number&#34;`, `&#34;integer&#34;`, `&#34;array&#34;`, or `&#34;object&#34;`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * User type ID. By default, it is `&#34;default&#34;`.
     * 
     */
    @Export(name="userType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userType;

    /**
     * @return User type ID. By default, it is `&#34;default&#34;`.
     * 
     */
    public Output<Optional<String>> userType() {
        return Codegen.optional(this.userType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppUserBaseSchemaProperty(String name) {
        this(name, AppUserBaseSchemaPropertyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppUserBaseSchemaProperty(String name, AppUserBaseSchemaPropertyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppUserBaseSchemaProperty(String name, AppUserBaseSchemaPropertyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty", name, args == null ? AppUserBaseSchemaPropertyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppUserBaseSchemaProperty(String name, Output<String> id, @Nullable AppUserBaseSchemaPropertyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty", name, state, makeResourceOptions(options, id));
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
    public static AppUserBaseSchemaProperty get(String name, Output<String> id, @Nullable AppUserBaseSchemaPropertyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppUserBaseSchemaProperty(name, id, state, options);
    }
}
