// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.AuthenticatorArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.AuthenticatorState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * 
 * This resource allows you to configure different authenticators.
 * 
 * &gt; **NOTE:** An authenticator can only be deleted if it&#39;s not in use by any policy.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.Authenticator;
 * import com.pulumi.okta.AuthenticatorArgs;
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
 *         var test = new Authenticator(&#34;test&#34;, AuthenticatorArgs.builder()        
 *             .key(&#34;security_question&#34;)
 *             .settings(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;allowedFor&#34;, &#34;recovery&#34;)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Okta authenticator can be imported via the Okta ID.
 * 
 * ```sh
 *  $ pulumi import okta:index/authenticator:Authenticator example &amp;#60;authenticator_id&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/authenticator:Authenticator")
public class Authenticator extends com.pulumi.resources.CustomResource {
    /**
     * A human-readable string that identifies the authenticator. Some authenticators are available by feature flag on the organization. Possible values inclue: `duo`, `external_idp`, `google_otp`, `okta_email`, `okta_password`, `okta_verify`, `onprem_mfa`, `phone_number`, `rsa_token`, `security_question`, `webauthn`
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return A human-readable string that identifies the authenticator. Some authenticators are available by feature flag on the organization. Possible values inclue: `duo`, `external_idp`, `google_otp`, `okta_email`, `okta_password`, `okta_verify`, `onprem_mfa`, `phone_number`, `rsa_token`, `security_question`, `webauthn`
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Name of the authenticator.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the authenticator.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The RADIUS server port (for example 1812). This is defined when the On-Prem RADIUS server is configured. Default is `9000`. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    @Export(name="providerAuthPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> providerAuthPort;

    /**
     * @return The RADIUS server port (for example 1812). This is defined when the On-Prem RADIUS server is configured. Default is `9000`. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    public Output<Optional<Integer>> providerAuthPort() {
        return Codegen.optional(this.providerAuthPort);
    }
    /**
     * Server host name or IP address. Default is `&#34;localhost&#34;`. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    @Export(name="providerHostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerHostname;

    /**
     * @return Server host name or IP address. Default is `&#34;localhost&#34;`. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    public Output<Optional<String>> providerHostname() {
        return Codegen.optional(this.providerHostname);
    }
    /**
     * App Instance ID.
     * 
     */
    @Export(name="providerInstanceId", type=String.class, parameters={})
    private Output<String> providerInstanceId;

    /**
     * @return App Instance ID.
     * 
     */
    public Output<String> providerInstanceId() {
        return this.providerInstanceId;
    }
    /**
     * An authentication key that must be defined when the RADIUS server is configured, and must be the same on both the RADIUS client and server. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    @Export(name="providerSharedSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerSharedSecret;

    /**
     * @return An authentication key that must be defined when the RADIUS server is configured, and must be the same on both the RADIUS client and server. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    public Output<Optional<String>> providerSharedSecret() {
        return Codegen.optional(this.providerSharedSecret);
    }
    /**
     * The type of Authenticator. Values include: `&#34;password&#34;`, `&#34;security_question&#34;`, `&#34;phone&#34;`, `&#34;email&#34;`, `&#34;app&#34;`, `&#34;federated&#34;`, and `&#34;security_key&#34;`.
     * 
     */
    @Export(name="providerType", type=String.class, parameters={})
    private Output<String> providerType;

    /**
     * @return The type of Authenticator. Values include: `&#34;password&#34;`, `&#34;security_question&#34;`, `&#34;phone&#34;`, `&#34;email&#34;`, `&#34;app&#34;`, `&#34;federated&#34;`, and `&#34;security_key&#34;`.
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }
    /**
     * Username template expected by the provider. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    @Export(name="providerUserNameTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerUserNameTemplate;

    /**
     * @return Username template expected by the provider. Used only for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    public Output<Optional<String>> providerUserNameTemplate() {
        return Codegen.optional(this.providerUserNameTemplate);
    }
    /**
     * Settings for the authenticator. Settings object contains values based on Authenticator key. It is not used for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    @Export(name="settings", type=String.class, parameters={})
    private Output</* @Nullable */ String> settings;

    /**
     * @return Settings for the authenticator. Settings object contains values based on Authenticator key. It is not used for authenticators with type `&#34;security_key&#34;`.
     * 
     */
    public Output<Optional<String>> settings() {
        return Codegen.optional(this.settings);
    }
    /**
     * Status of the authenticator. Default is `ACTIVE`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the authenticator. Default is `ACTIVE`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Type of the Authenticator.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the Authenticator.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authenticator(String name) {
        this(name, AuthenticatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authenticator(String name, AuthenticatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authenticator(String name, AuthenticatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/authenticator:Authenticator", name, args == null ? AuthenticatorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authenticator(String name, Output<String> id, @Nullable AuthenticatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/authenticator:Authenticator", name, state, makeResourceOptions(options, id));
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
    public static Authenticator get(String name, Output<String> id, @Nullable AuthenticatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Authenticator(name, id, state, options);
    }
}