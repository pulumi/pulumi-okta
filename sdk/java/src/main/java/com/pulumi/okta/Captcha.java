// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.CaptchaArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.CaptchaState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * 
 * This resource allows you to create and configure a CAPTCHA.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.Captcha;
 * import com.pulumi.okta.CaptchaArgs;
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
 *         var example = new Captcha(&#34;example&#34;, CaptchaArgs.builder()        
 *             .secretKey(&#34;some_secret_key&#34;)
 *             .siteKey(&#34;some_key&#34;)
 *             .type(&#34;HCAPTCHA&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Behavior can be imported via the Okta ID.
 * 
 * ```sh
 *  $ pulumi import okta:index/captcha:Captcha example &amp;#60;captcha id&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/captcha:Captcha")
public class Captcha extends com.pulumi.resources.CustomResource {
    /**
     * Name of the captcha.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the captcha.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Secret key issued from the CAPTCHA vendor to perform server-side validation for a CAPTCHA token.
     * 
     */
    @Export(name="secretKey", type=String.class, parameters={})
    private Output<String> secretKey;

    /**
     * @return Secret key issued from the CAPTCHA vendor to perform server-side validation for a CAPTCHA token.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }
    /**
     * Site key issued from the CAPTCHA vendor to render a CAPTCHA on a page.
     * 
     */
    @Export(name="siteKey", type=String.class, parameters={})
    private Output<String> siteKey;

    /**
     * @return Site key issued from the CAPTCHA vendor to render a CAPTCHA on a page.
     * 
     */
    public Output<String> siteKey() {
        return this.siteKey;
    }
    /**
     * Type of the captcha. Valid values: `&#34;HCAPTCHA&#34;`, `&#34;RECAPTCHA_V2&#34;`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the captcha. Valid values: `&#34;HCAPTCHA&#34;`, `&#34;RECAPTCHA_V2&#34;`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Captcha(String name) {
        this(name, CaptchaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Captcha(String name, CaptchaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Captcha(String name, CaptchaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/captcha:Captcha", name, args == null ? CaptchaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Captcha(String name, Output<String> id, @Nullable CaptchaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/captcha:Captcha", name, state, makeResourceOptions(options, id));
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
    public static Captcha get(String name, Output<String> id, @Nullable CaptchaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Captcha(name, id, state, options);
    }
}