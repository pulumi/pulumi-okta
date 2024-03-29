// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.policy.MfaArgs;
import com.pulumi.okta.policy.inputs.MfaState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an MFA Policy.
 * 
 * This resource allows you to create and configure an MFA Policy.
 * 
 * &gt; Requires Org Feature Flag `OKTA_MFA_POLICY`. Contact support to have this feature flag ***enabled***.
 * 
 * &gt; Unless Org Feature Flag `ENG_ENABLE_OPTIONAL_PASSWORD_ENROLLMENT` is ***disabled*** `okta_password` or `okta_email` must be present and its `enroll` value set to `REQUIRED`. Contact support to have this feature flag ***disabled***.
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
 * import com.pulumi.okta.policy.Mfa;
 * import com.pulumi.okta.policy.MfaArgs;
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
 *         var classicExample = new Mfa(&#34;classicExample&#34;, MfaArgs.builder()        
 *             .description(&#34;Example MFA policy using Okta Classic engine with factors.&#34;)
 *             .groupsIncludeds(data.okta_group().everyone().id())
 *             .isOie(false)
 *             .oktaOtp(Map.of(&#34;enroll&#34;, &#34;REQUIRED&#34;))
 *             .oktaPassword(Map.of(&#34;enroll&#34;, &#34;REQUIRED&#34;))
 *             .status(&#34;ACTIVE&#34;)
 *             .build());
 * 
 *         var oieExample = new Mfa(&#34;oieExample&#34;, MfaArgs.builder()        
 *             .description(&#34;Example MFA policy that uses Okta Identity Engine (OIE) with authenticators&#34;)
 *             .groupsIncludeds(data.okta_group().everyone().id())
 *             .isOie(true)
 *             .oktaPassword(Map.of(&#34;enroll&#34;, &#34;REQUIRED&#34;))
 *             .oktaVerify(Map.of(&#34;enroll&#34;, &#34;REQUIRED&#34;))
 *             .status(&#34;ACTIVE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * An MFA Policy can be imported via the Okta ID.
 * 
 * ```sh
 * $ pulumi import okta:policy/mfa:Mfa example &amp;#60;policy id&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:policy/mfa:Mfa")
public class Mfa extends com.pulumi.resources.CustomResource {
    /**
     * Policy Description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Policy Description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * DUO MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="duo", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> duo;

    /**
     * @return DUO MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> duo() {
        return Codegen.optional(this.duo);
    }
    /**
     * External IDP MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="externalIdp", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> externalIdp;

    /**
     * @return External IDP MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> externalIdp() {
        return Codegen.optional(this.externalIdp);
    }
    /**
     * Fido U2F MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="fidoU2f", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> fidoU2f;

    /**
     * @return Fido U2F MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> fidoU2f() {
        return Codegen.optional(this.fidoU2f);
    }
    /**
     * Fido Web Authn MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="fidoWebauthn", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> fidoWebauthn;

    /**
     * @return Fido Web Authn MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> fidoWebauthn() {
        return Codegen.optional(this.fidoWebauthn);
    }
    /**
     * Google OTP MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="googleOtp", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> googleOtp;

    /**
     * @return Google OTP MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> googleOtp() {
        return Codegen.optional(this.googleOtp);
    }
    /**
     * List of Group IDs to Include.
     * 
     */
    @Export(name="groupsIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupsIncludeds;

    /**
     * @return List of Group IDs to Include.
     * 
     */
    public Output<Optional<List<String>>> groupsIncludeds() {
        return Codegen.optional(this.groupsIncludeds);
    }
    /**
     * HMAC-based One-Time Password MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="hotp", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> hotp;

    /**
     * @return HMAC-based One-Time Password MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> hotp() {
        return Codegen.optional(this.hotp);
    }
    /**
     * Boolean that specifies whether to use the newer Okta Identity Engine (OIE) with policy authenticators instead of the classic engine with Factors. This value determines which of the following policy factor settings can be configured. (Default = `false`)
     * &gt; **WARNING:** Tenant must have the Okta Identity Engine enabled in order to use this feature.
     * 
     */
    @Export(name="isOie", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isOie;

    /**
     * @return Boolean that specifies whether to use the newer Okta Identity Engine (OIE) with policy authenticators instead of the classic engine with Factors. This value determines which of the following policy factor settings can be configured. (Default = `false`)
     * &gt; **WARNING:** Tenant must have the Okta Identity Engine enabled in order to use this feature.
     * 
     */
    public Output<Optional<Boolean>> isOie() {
        return Codegen.optional(this.isOie);
    }
    /**
     * Policy Name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Policy Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Okta Call MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="oktaCall", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaCall;

    /**
     * @return Okta Call MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaCall() {
        return Codegen.optional(this.oktaCall);
    }
    /**
     * Okta Email MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="oktaEmail", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaEmail;

    /**
     * @return Okta Email MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaEmail() {
        return Codegen.optional(this.oktaEmail);
    }
    /**
     * Okta OTP (via the Okta Verify app) MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="oktaOtp", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaOtp;

    /**
     * @return Okta OTP (via the Okta Verify app) MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaOtp() {
        return Codegen.optional(this.oktaOtp);
    }
    /**
     * Okta Password MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="oktaPassword", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaPassword;

    /**
     * @return Okta Password MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaPassword() {
        return Codegen.optional(this.oktaPassword);
    }
    /**
     * Okta Push MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="oktaPush", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaPush;

    /**
     * @return Okta Push MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaPush() {
        return Codegen.optional(this.oktaPush);
    }
    /**
     * Okta Question MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="oktaQuestion", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaQuestion;

    /**
     * @return Okta Question MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaQuestion() {
        return Codegen.optional(this.oktaQuestion);
    }
    /**
     * Okta SMS MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="oktaSms", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaSms;

    /**
     * @return Okta SMS MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaSms() {
        return Codegen.optional(this.oktaSms);
    }
    /**
     * Okta Verify MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="oktaVerify", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> oktaVerify;

    /**
     * @return Okta Verify MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> oktaVerify() {
        return Codegen.optional(this.oktaVerify);
    }
    /**
     * On-Prem MFA MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="onpremMfa", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> onpremMfa;

    /**
     * @return On-Prem MFA MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> onpremMfa() {
        return Codegen.optional(this.onpremMfa);
    }
    /**
     * Phone Number MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="phoneNumber", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> phoneNumber;

    /**
     * @return Phone Number MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> phoneNumber() {
        return Codegen.optional(this.phoneNumber);
    }
    /**
     * Priority of the policy.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the policy.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * RSA Token MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="rsaToken", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> rsaToken;

    /**
     * @return RSA Token MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> rsaToken() {
        return Codegen.optional(this.rsaToken);
    }
    /**
     * Security Question MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="securityQuestion", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> securityQuestion;

    /**
     * @return Security Question MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> securityQuestion() {
        return Codegen.optional(this.securityQuestion);
    }
    /**
     * Policy Status: `&#34;ACTIVE&#34;` or `&#34;INACTIVE&#34;`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Policy Status: `&#34;ACTIVE&#34;` or `&#34;INACTIVE&#34;`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Symantec VIP MFA policy settings (✓ Classic).
     * 
     */
    @Export(name="symantecVip", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> symantecVip;

    /**
     * @return Symantec VIP MFA policy settings (✓ Classic).
     * 
     */
    public Output<Optional<Map<String,String>>> symantecVip() {
        return Codegen.optional(this.symantecVip);
    }
    /**
     * FIDO2 (WebAuthn) MFA policy settings (✓ OIE).
     * 
     */
    @Export(name="webauthn", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> webauthn;

    /**
     * @return FIDO2 (WebAuthn) MFA policy settings (✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> webauthn() {
        return Codegen.optional(this.webauthn);
    }
    /**
     * Yubikey Token MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    @Export(name="yubikeyToken", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> yubikeyToken;

    /**
     * @return Yubikey Token MFA policy settings (✓ Classic, ✓ OIE).
     * 
     */
    public Output<Optional<Map<String,String>>> yubikeyToken() {
        return Codegen.optional(this.yubikeyToken);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Mfa(String name) {
        this(name, MfaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Mfa(String name, @Nullable MfaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Mfa(String name, @Nullable MfaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:policy/mfa:Mfa", name, args == null ? MfaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Mfa(String name, Output<String> id, @Nullable MfaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:policy/mfa:Mfa", name, state, makeResourceOptions(options, id));
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
    public static Mfa get(String name, Output<String> id, @Nullable MfaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Mfa(name, id, state, options);
    }
}
