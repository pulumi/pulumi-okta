// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.AppSignonPolicyArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.AppSignonPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * 
 * This resource allows you to create and configure a sign-on policy for the application. (Inside the product this is referenced as an _authentication policy_)
 * 
 * A newly create app sign-on policy will always contain a default `Catch-all Rule`.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.AppSignonPolicy;
 * import com.pulumi.okta.AppSignonPolicyArgs;
 * import com.pulumi.okta.app.OAuth;
 * import com.pulumi.okta.app.OAuthArgs;
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
 *         var myAppPolicy = new AppSignonPolicy(&#34;myAppPolicy&#34;, AppSignonPolicyArgs.builder()        
 *             .description(&#34;Authentication Policy to be used on my app.&#34;)
 *             .build());
 * 
 *         var myApp = new OAuth(&#34;myApp&#34;, OAuthArgs.builder()        
 *             .label(&#34;My App&#34;)
 *             .type(&#34;web&#34;)
 *             .grantTypes(&#34;authorization_code&#34;)
 *             .redirectUris(&#34;http://localhost:3000&#34;)
 *             .postLogoutRedirectUris(&#34;http://localhost:3000&#34;)
 *             .responseTypes(&#34;code&#34;)
 *             .authenticationPolicy(myAppPolicy.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * \_The same mechanism is in place for `okta.app.OAuth` and `okta.app.Saml`.
 * 
 * The created policy can be extended using `app_signon_policy_rules`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.AppSignonPolicy;
 * import com.pulumi.okta.AppSignonPolicyArgs;
 * import com.pulumi.okta.AppSignonPolicyRule;
 * import com.pulumi.okta.AppSignonPolicyRuleArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var myAppPolicy = new AppSignonPolicy(&#34;myAppPolicy&#34;, AppSignonPolicyArgs.builder()        
 *             .description(&#34;Authentication Policy to be used on my app.&#34;)
 *             .build());
 * 
 *         var someRule = new AppSignonPolicyRule(&#34;someRule&#34;, AppSignonPolicyRuleArgs.builder()        
 *             .policyId(resource.okta_app_signon_policy().my_app_policy().id())
 *             .factorMode(&#34;1FA&#34;)
 *             .reAuthenticationFrequency(&#34;PT43800H&#34;)
 *             .constraints(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;knowledge&#34;, jsonObject(
 *                         jsonProperty(&#34;types&#34;, jsonArray(&#34;password&#34;))
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="okta:index/appSignonPolicy:AppSignonPolicy")
public class AppSignonPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Description of the policy.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Name of the policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSignonPolicy(String name) {
        this(name, AppSignonPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSignonPolicy(String name, AppSignonPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSignonPolicy(String name, AppSignonPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicy:AppSignonPolicy", name, args == null ? AppSignonPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSignonPolicy(String name, Output<String> id, @Nullable AppSignonPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicy:AppSignonPolicy", name, state, makeResourceOptions(options, id));
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
    public static AppSignonPolicy get(String name, Output<String> id, @Nullable AppSignonPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSignonPolicy(name, id, state, options);
    }
}