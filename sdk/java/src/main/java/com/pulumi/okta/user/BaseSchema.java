// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.user.BaseSchemaArgs;
import com.pulumi.okta.user.inputs.BaseSchemaState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **DEPRECATED** use `okta.UserBaseSchemaProperty` instead.
 * 
 * This resource allows you to configure a base user schema property.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.user.BaseSchema;
 * import com.pulumi.okta.user.BaseSchemaArgs;
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
 *         var example = new BaseSchema(&#34;example&#34;, BaseSchemaArgs.builder()        
 *             .index(&#34;customPropertyName&#34;)
 *             .master(&#34;OKTA&#34;)
 *             .title(&#34;customPropertyName&#34;)
 *             .type(&#34;string&#34;)
 *             .userType(data.okta_user_type().example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * User schema property of default user type can be imported via the property index.
 * 
 * ```sh
 *  $ pulumi import okta:user/baseSchema:BaseSchema example &amp;#60;property name&amp;#62;
 * ```
 * 
 *  User schema property of custom user type can be imported via user type id and property index
 * 
 * ```sh
 *  $ pulumi import okta:user/baseSchema:BaseSchema example &amp;#60;user type id&amp;#62;.&amp;#60;property name&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:user/baseSchema:BaseSchema")
public class BaseSchema extends com.pulumi.resources.CustomResource {
    /**
     * The property name.
     * 
     */
    @Export(name="index", type=String.class, parameters={})
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
    @Export(name="master", type=String.class, parameters={})
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
    @Export(name="pattern", type=String.class, parameters={})
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
    @Export(name="permissions", type=String.class, parameters={})
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
    @Export(name="required", type=Boolean.class, parameters={})
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
    @Export(name="title", type=String.class, parameters={})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the schema property. It can be `&#34;string&#34;`, `&#34;boolean&#34;`, `&#34;number&#34;`, `&#34;integer&#34;`, `&#34;array&#34;`, or `&#34;object&#34;`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * User type ID
     * 
     */
    @Export(name="userType", type=String.class, parameters={})
    private Output</* @Nullable */ String> userType;

    /**
     * @return User type ID
     * 
     */
    public Output<Optional<String>> userType() {
        return Codegen.optional(this.userType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BaseSchema(String name) {
        this(name, BaseSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BaseSchema(String name, BaseSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BaseSchema(String name, BaseSchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:user/baseSchema:BaseSchema", name, args == null ? BaseSchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BaseSchema(String name, Output<String> id, @Nullable BaseSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:user/baseSchema:BaseSchema", name, state, makeResourceOptions(options, id));
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
    public static BaseSchema get(String name, Output<String> id, @Nullable BaseSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BaseSchema(name, id, state, options);
    }
}