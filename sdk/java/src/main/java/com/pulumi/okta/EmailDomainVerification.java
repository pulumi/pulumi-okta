// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.EmailDomainVerificationArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.EmailDomainVerificationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Verifies the email domain. The resource won&#39;t be created if the email domain could not be verified.
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
 * import com.pulumi.okta.EmailDomain;
 * import com.pulumi.okta.EmailDomainArgs;
 * import com.pulumi.okta.EmailDomainVerification;
 * import com.pulumi.okta.EmailDomainVerificationArgs;
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
 *         var example = new EmailDomain("example", EmailDomainArgs.builder()
 *             .brandId("abc123")
 *             .domain("example.com")
 *             .displayName("test")
 *             .userName("paul_atreides")
 *             .build());
 * 
 *         var exampleEmailDomainVerification = new EmailDomainVerification("exampleEmailDomainVerification", EmailDomainVerificationArgs.builder()
 *             .emailDomainId(valid.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="okta:index/emailDomainVerification:EmailDomainVerification")
public class EmailDomainVerification extends com.pulumi.resources.CustomResource {
    /**
     * Email domain ID
     * 
     */
    @Export(name="emailDomainId", refs={String.class}, tree="[0]")
    private Output<String> emailDomainId;

    /**
     * @return Email domain ID
     * 
     */
    public Output<String> emailDomainId() {
        return this.emailDomainId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailDomainVerification(java.lang.String name) {
        this(name, EmailDomainVerificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailDomainVerification(java.lang.String name, EmailDomainVerificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailDomainVerification(java.lang.String name, EmailDomainVerificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/emailDomainVerification:EmailDomainVerification", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EmailDomainVerification(java.lang.String name, Output<java.lang.String> id, @Nullable EmailDomainVerificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/emailDomainVerification:EmailDomainVerification", name, state, makeResourceOptions(options, id), false);
    }

    private static EmailDomainVerificationArgs makeArgs(EmailDomainVerificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EmailDomainVerificationArgs.Empty : args;
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
    public static EmailDomainVerification get(java.lang.String name, Output<java.lang.String> id, @Nullable EmailDomainVerificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailDomainVerification(name, id, state, options);
    }
}