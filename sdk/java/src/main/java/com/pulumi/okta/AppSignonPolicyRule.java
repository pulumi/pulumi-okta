// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.AppSignonPolicyRuleArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.AppSignonPolicyRuleState;
import com.pulumi.okta.outputs.AppSignonPolicyRulePlatformInclude;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING:** This feature is only available as a part of the Identity Engine. Contact support for further information.
 * 
 * This resource allows you to create and configure a sign-on policy rule for the application.
 * 
 * A default or `Catch-all Rule` sign-on policy rule can be imported and managed as a custom rule.
 * The only difference is that these fields are immutable and can not be managed: `network_connection`, `network_excludes`,
 * `network_includes`, `platform_include`, `custom_expression`, `device_is_registered`, `device_is_managed`, `users_excluded`,
 * `users_included`, `groups_excluded`, `groups_included`, `user_types_excluded` and `user_types_included`.
 * 
 * ## Example Usage
 * 
 * ### Simple usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.app.Saml;
 * import com.pulumi.okta.app.SamlArgs;
 * import com.pulumi.okta.OktaFunctions;
 * import com.pulumi.okta.inputs.GetAppSignonPolicyArgs;
 * import com.pulumi.okta.AppSignonPolicyRule;
 * import com.pulumi.okta.AppSignonPolicyRuleArgs;
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
 *         var testSaml = new Saml(&#34;testSaml&#34;, SamlArgs.builder()        
 *             .label(&#34;My App&#34;)
 *             .ssoUrl(&#34;https://google.com&#34;)
 *             .recipient(&#34;https://here.com&#34;)
 *             .destination(&#34;https://its-about-the-journey.com&#34;)
 *             .audience(&#34;https://audience.com&#34;)
 *             .status(&#34;ACTIVE&#34;)
 *             .subjectNameIdTemplate(&#34;${user.userName}&#34;)
 *             .subjectNameIdFormat(&#34;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#34;)
 *             .signatureAlgorithm(&#34;RSA_SHA256&#34;)
 *             .responseSigned(true)
 *             .digestAlgorithm(&#34;SHA256&#34;)
 *             .honorForceAuthn(false)
 *             .authnContextClassRef(&#34;urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport&#34;)
 *             .build());
 * 
 *         final var testAppSignonPolicy = OktaFunctions.getAppSignonPolicy(GetAppSignonPolicyArgs.builder()
 *             .appId(testSaml.id())
 *             .build());
 * 
 *         var testAppSignonPolicyRule = new AppSignonPolicyRule(&#34;testAppSignonPolicyRule&#34;, AppSignonPolicyRuleArgs.builder()        
 *             .policyId(testAppSignonPolicy.applyValue(getAppSignonPolicyResult -&gt; getAppSignonPolicyResult).applyValue(testAppSignonPolicy -&gt; testAppSignonPolicy.applyValue(getAppSignonPolicyResult -&gt; getAppSignonPolicyResult.id())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This will create an app sign-on policy rule with the following `THEN` block:
 * 
 * ### Example 1:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *         var test = new AppSignonPolicyRule(&#34;test&#34;, AppSignonPolicyRuleArgs.builder()        
 *             .policyId(data.okta_app_signon_policy().test().id())
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
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This will create an app sign-on policy rule with the following `THEN` block:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example 2:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *         var test = new AppSignonPolicyRule(&#34;test&#34;, AppSignonPolicyRuleArgs.builder()        
 *             .policyId(data.okta_app_signon_policy().test().id())
 *             .constraints(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;knowledge&#34;, jsonObject(
 *                         jsonProperty(&#34;reauthenticateIn&#34;, &#34;PT2H&#34;),
 *                         jsonProperty(&#34;types&#34;, jsonArray(&#34;password&#34;))
 *                     )),
 *                     jsonProperty(&#34;possession&#34;, jsonObject(
 *                         jsonProperty(&#34;deviceBound&#34;, &#34;REQUIRED&#34;),
 *                         jsonProperty(&#34;hardwareProtection&#34;, &#34;REQUIRED&#34;)
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This will create an app sign-on policy rule with the following `THEN` block:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * More examples can be
 * found [here](https://developer.okta.com/docs/reference/api/policy/#verification-method-json-examples).
 * 
 * ### Complex example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.okta.app.Saml;
 * import com.pulumi.okta.app.SamlArgs;
 * import com.pulumi.okta.app.inputs.SamlAttributeStatementArgs;
 * import com.pulumi.okta.OktaFunctions;
 * import com.pulumi.okta.inputs.GetAppSignonPolicyArgs;
 * import com.pulumi.okta.user.User;
 * import com.pulumi.okta.user.UserArgs;
 * import com.pulumi.okta.group.Group;
 * import com.pulumi.okta.group.GroupArgs;
 * import com.pulumi.okta.user.UserType;
 * import com.pulumi.okta.user.UserTypeArgs;
 * import com.pulumi.okta.network.Zone;
 * import com.pulumi.okta.network.ZoneArgs;
 * import com.pulumi.okta.user.UserFunctions;
 * import com.pulumi.okta.user.inputs.GetUserTypeArgs;
 * import com.pulumi.okta.policy.DeviceAssuranceAndroid;
 * import com.pulumi.okta.policy.DeviceAssuranceAndroidArgs;
 * import com.pulumi.okta.AppSignonPolicyRule;
 * import com.pulumi.okta.AppSignonPolicyRuleArgs;
 * import com.pulumi.okta.inputs.AppSignonPolicyRulePlatformIncludeArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         var testSaml = new Saml(&#34;testSaml&#34;, SamlArgs.builder()        
 *             .label(&#34;testAcc_replace_with_uuid&#34;)
 *             .ssoUrl(&#34;https://google.com&#34;)
 *             .recipient(&#34;https://here.com&#34;)
 *             .destination(&#34;https://its-about-the-journey.com&#34;)
 *             .audience(&#34;https://audience.com&#34;)
 *             .subjectNameIdTemplate(&#34;${user.userName}&#34;)
 *             .subjectNameIdFormat(&#34;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#34;)
 *             .responseSigned(true)
 *             .signatureAlgorithm(&#34;RSA_SHA256&#34;)
 *             .digestAlgorithm(&#34;SHA256&#34;)
 *             .honorForceAuthn(false)
 *             .authnContextClassRef(&#34;urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport&#34;)
 *             .singleLogoutIssuer(&#34;https://dunshire.okta.com&#34;)
 *             .singleLogoutUrl(&#34;https://dunshire.okta.com/logout&#34;)
 *             .singleLogoutCertificate(&#34;&#34;&#34;
 * MIIFnDCCA4QCCQDBSLbiON2T1zANBgkqhkiG9w0BAQsFADCBjzELMAkGA1UEBhMCVVMxDjAMBgNV
 * BAgMBU1haW5lMRAwDgYDVQQHDAdDYXJpYm91MRcwFQYDVQQKDA5Tbm93bWFrZXJzIEluYzEUMBIG
 * A1UECwwLRW5naW5lZXJpbmcxDTALBgNVBAMMBFNub3cxIDAeBgkqhkiG9w0BCQEWEWVtYWlsQGV4
 * YW1wbGUuY29tMB4XDTIwMTIwMzIyNDY0M1oXDTMwMTIwMTIyNDY0M1owgY8xCzAJBgNVBAYTAlVT
 * MQ4wDAYDVQQIDAVNYWluZTEQMA4GA1UEBwwHQ2FyaWJvdTEXMBUGA1UECgwOU25vd21ha2VycyBJ
 * bmMxFDASBgNVBAsMC0VuZ2luZWVyaW5nMQ0wCwYDVQQDDARTbm93MSAwHgYJKoZIhvcNAQkBFhFl
 * bWFpbEBleGFtcGxlLmNvbTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBANMmWDjXPdoa
 * PyzIENqeY9njLan2FqCbQPSestWUUcb6NhDsJVGSQ7XR+ozQA5TaJzbP7cAJUj8vCcbqMZsgOQAu
 * O/pzYyQEKptLmrGvPn7xkJ1A1xLkp2NY18cpDTeUPueJUoidZ9EJwEuyUZIktzxNNU1pA1lGijiu
 * 2XNxs9d9JR/hm3tCu9Im8qLVB4JtX80YUa6QtlRjWR/H8a373AYCOASdoB3c57fIPD8ATDNy2w/c
 * fCVGiyKDMFB+GA/WTsZpOP3iohRp8ltAncSuzypcztb2iE+jijtTsiC9kUA2abAJqqpoCJubNShi
 * Vff4822czpziS44MV2guC9wANi8u3Uyl5MKsU95j01jzadKRP5S+2f0K+n8n4UoV9fnqZFyuGAKd
 * CJi9K6NlSAP+TgPe/JP9FOSuxQOHWJfmdLHdJD+evoKi9E55sr5lRFK0xU1Fj5Ld7zjC0pXPhtJf
 * sgjEZzD433AsHnRzvRT1KSNCPkLYomznZo5n9rWYgCQ8HcytlQDTesmKE+s05E/VSWNtH84XdDrt
 * ieXwfwhHfaABSu+WjZYxi9CXdFCSvXhsgufUcK4FbYAHl/ga/cJxZc52yFC7Pcq0u9O2BSCjYPdQ
 * DAHs9dhT1RhwVLM8RmoAzgxyyzau0gxnAlgSBD9FMW6dXqIHIp8yAAg9cRXhYRTNAgMBAAEwDQYJ
 * KoZIhvcNAQELBQADggIBADofEC1SvG8qa7pmKCjB/E9Sxhk3mvUO9Gq43xzwVb721Ng3VYf4vGU3
 * wLUwJeLt0wggnj26NJweN5T3q9T8UMxZhHSWvttEU3+S1nArRB0beti716HSlOCDx4wTmBu/D1MG
 * t/kZYFJw+zuzvAcbYct2pK69AQhD8xAIbQvqADJI7cCK3yRry+aWtppc58P81KYabUlCfFXfhJ9E
 * P72ffN4jVHpX3lxxYh7FKAdiKbY2FYzjsc7RdgKI1R3iAAZUCGBTvezNzaetGzTUjjl/g1tcVYij
 * ltH9ZOQBPlUMI88lxUxqgRTerpPmAJH00CACx4JFiZrweLM1trZyy06wNDQgLrqHr3EOagBF/O2h
 * hfTehNdVr6iq3YhKWBo4/+RL0RCzHMh4u86VbDDnDn4Y6HzLuyIAtBFoikoKM6UHTOa0Pqv2bBr5
 * wbkRkVUxl9yJJw/HmTCdfnsM9dTOJUKzEglnGF2184Gg+qJDZB6fSf0EAO1F6sTqiSswl+uHQZiy
 * DaZzyU7Gg5seKOZ20zTRaX3Ihj9Zij/ORnrARE7eM/usKMECp+7syUwAUKxDCZkGiUdskmOhhBGL
 * JtbyK3F2UvoJoLsm3pIcvMak9KwMjSTGJB47ABUP1+w+zGcNk0D5Co3IJ6QekiLfWJyQ+kKsWLKt
 * zOYQQatrnBagM7MI2/T4
 *             &#34;&#34;&#34;)
 *             .attributeStatements(SamlAttributeStatementArgs.builder()
 *                 .type(&#34;GROUP&#34;)
 *                 .name(&#34;groups&#34;)
 *                 .filterType(&#34;REGEX&#34;)
 *                 .filterValue(&#34;.*&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var testAppSignonPolicy = OktaFunctions.getAppSignonPolicy(GetAppSignonPolicyArgs.builder()
 *             .appId(testSaml.id())
 *             .build());
 * 
 *         for (var i = 0; i &lt; 5; i++) {
 *             new User(&#34;testUser-&#34; + i, UserArgs.builder()            
 *                 .firstName(&#34;TestAcc&#34;)
 *                 .lastName(&#34;Smith&#34;)
 *                 .login(String.format(&#34;testAcc_%s@example.com&#34;, range.value()))
 *                 .email(String.format(&#34;testAcc_%s@example.com&#34;, range.value()))
 *                 .build());
 * 
 *         
 * }
 *         for (var i = 0; i &lt; 5; i++) {
 *             new Group(&#34;this-&#34; + i, GroupArgs.builder()            
 *                 .description(String.format(&#34;testAcc_%s&#34;, range.value()))
 *                 .build());
 * 
 *         
 * }
 *         var testUserType = new UserType(&#34;testUserType&#34;, UserTypeArgs.builder()        
 *             .displayName(&#34;Terraform Acceptance Test User Type Updated&#34;)
 *             .description(&#34;Terraform Acceptance Test User Type Updated&#34;)
 *             .build());
 * 
 *         var testZone = new Zone(&#34;testZone&#34;, ZoneArgs.builder()        
 *             .type(&#34;IP&#34;)
 *             .gateways(            
 *                 &#34;1.2.3.4/24&#34;,
 *                 &#34;2.3.4.5-2.3.4.15&#34;)
 *             .proxies(            
 *                 &#34;2.2.3.4/24&#34;,
 *                 &#34;3.3.4.5-3.3.4.15&#34;)
 *             .build());
 * 
 *         final var default = UserFunctions.getUserType(GetUserTypeArgs.builder()
 *             .name(&#34;user&#34;)
 *             .build());
 * 
 *         var testDeviceAssuranceAndroid = new DeviceAssuranceAndroid(&#34;testDeviceAssuranceAndroid&#34;, DeviceAssuranceAndroidArgs.builder()        
 *             .osVersion(&#34;12&#34;)
 *             .jailbreak(false)
 *             .build());
 * 
 *         var testAppSignonPolicyRule = new AppSignonPolicyRule(&#34;testAppSignonPolicyRule&#34;, AppSignonPolicyRuleArgs.builder()        
 *             .policyId(testAppSignonPolicy.applyValue(getAppSignonPolicyResult -&gt; getAppSignonPolicyResult).applyValue(testAppSignonPolicy -&gt; testAppSignonPolicy.applyValue(getAppSignonPolicyResult -&gt; getAppSignonPolicyResult.id())))
 *             .access(&#34;ALLOW&#34;)
 *             .customExpression(&#34;user.status == \&#34;ACTIVE\&#34;&#34;)
 *             .deviceIsManaged(false)
 *             .deviceIsRegistered(true)
 *             .factorMode(&#34;2FA&#34;)
 *             .groupsExcludeds(            
 *                 this_[2].id(),
 *                 this_[3].id(),
 *                 this_[4].id())
 *             .groupsIncludeds(            
 *                 this_[0].id(),
 *                 this_[1].id())
 *             .deviceAssurancesIncludeds(testDeviceAssuranceAndroid.id())
 *             .networkConnection(&#34;ZONE&#34;)
 *             .networkIncludes(testZone.id())
 *             .platformIncludes(            
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;ANDROID&#34;)
 *                     .type(&#34;MOBILE&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;IOS&#34;)
 *                     .type(&#34;MOBILE&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;MACOS&#34;)
 *                     .type(&#34;DESKTOP&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;OTHER&#34;)
 *                     .type(&#34;DESKTOP&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;OTHER&#34;)
 *                     .type(&#34;MOBILE&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;WINDOWS&#34;)
 *                     .type(&#34;DESKTOP&#34;)
 *                     .build(),
 *                 AppSignonPolicyRulePlatformIncludeArgs.builder()
 *                     .osType(&#34;CHROMEOS&#34;)
 *                     .type(&#34;DESKTOP&#34;)
 *                     .build())
 *             .priority(98)
 *             .reAuthenticationFrequency(&#34;PT43800H&#34;)
 *             .type(&#34;ASSURANCE&#34;)
 *             .userTypesExcludeds(testUserType.id())
 *             .userTypesIncludeds(default_.id())
 *             .usersExcludeds(            
 *                 testUser[2].id(),
 *                 testUser[3].id(),
 *                 testUser[4].id())
 *             .usersIncludeds(            
 *                 testUser[0].id(),
 *                 testUser[1].id())
 *             .constraints(            
 *                 serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;knowledge&#34;, jsonObject(
 *                             jsonProperty(&#34;reauthenticateIn&#34;, &#34;PT2H&#34;),
 *                             jsonProperty(&#34;types&#34;, jsonArray(&#34;password&#34;))
 *                         )),
 *                         jsonProperty(&#34;possession&#34;, jsonObject(
 *                             jsonProperty(&#34;deviceBound&#34;, &#34;REQUIRED&#34;)
 *                         ))
 *                     )),
 *                 serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;possession&#34;, jsonObject(
 *                             jsonProperty(&#34;deviceBound&#34;, &#34;REQUIRED&#34;),
 *                             jsonProperty(&#34;hardwareProtection&#34;, &#34;REQUIRED&#34;),
 *                             jsonProperty(&#34;userPresence&#34;, &#34;OPTIONAL&#34;)
 *                         ))
 *                     )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Okta app sign-on policy rule can be imported via the Okta ID.
 * 
 * ```sh
 * $ pulumi import okta:index/appSignonPolicyRule:AppSignonPolicyRule example &amp;#60;policy_id&amp;#62;/&amp;#60;rule_id&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/appSignonPolicyRule:AppSignonPolicyRule")
public class AppSignonPolicyRule extends com.pulumi.resources.CustomResource {
    /**
     * Allow or deny access based on the rule conditions. It can be set to `&#34;ALLOW&#34;` or `&#34;DENY&#34;`. Default is `&#34;ALLOW&#34;`.
     * 
     */
    @Export(name="access", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> access;

    /**
     * @return Allow or deny access based on the rule conditions. It can be set to `&#34;ALLOW&#34;` or `&#34;DENY&#34;`. Default is `&#34;ALLOW&#34;`.
     * 
     */
    public Output<Optional<String>> access() {
        return Codegen.optional(this.access);
    }
    /**
     * An array that contains nested Authenticator Constraint objects that are organized by the Authenticator class. Each element should be in JSON format.
     * 
     */
    @Export(name="constraints", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> constraints;

    /**
     * @return An array that contains nested Authenticator Constraint objects that are organized by the Authenticator class. Each element should be in JSON format.
     * 
     */
    public Output<Optional<List<String>>> constraints() {
        return Codegen.optional(this.constraints);
    }
    /**
     * This is an advanced optional setting. If the expression is formatted incorrectly or conflicts with conditions set above, the rule may not match any users.
     * 
     */
    @Export(name="customExpression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customExpression;

    /**
     * @return This is an advanced optional setting. If the expression is formatted incorrectly or conflicts with conditions set above, the rule may not match any users.
     * 
     */
    public Output<Optional<String>> customExpression() {
        return Codegen.optional(this.customExpression);
    }
    /**
     * List of device assurances IDs to be included.
     * 
     */
    @Export(name="deviceAssurancesIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> deviceAssurancesIncludeds;

    /**
     * @return List of device assurances IDs to be included.
     * 
     */
    public Output<Optional<List<String>>> deviceAssurancesIncludeds() {
        return Codegen.optional(this.deviceAssurancesIncludeds);
    }
    /**
     * If the device is managed. A device is managed if it&#39;s managed by a device management
     * system. When managed is passed, `device_is_registered` must also be included and must be set to `true`.
     * 
     */
    @Export(name="deviceIsManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deviceIsManaged;

    /**
     * @return If the device is managed. A device is managed if it&#39;s managed by a device management
     * system. When managed is passed, `device_is_registered` must also be included and must be set to `true`.
     * 
     */
    public Output<Optional<Boolean>> deviceIsManaged() {
        return Codegen.optional(this.deviceIsManaged);
    }
    /**
     * If the device is registered. A device is registered if the User enrolls with Okta
     * Verify that is installed on the device. Can only be set to `true`.
     * 
     */
    @Export(name="deviceIsRegistered", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deviceIsRegistered;

    /**
     * @return If the device is registered. A device is registered if the User enrolls with Okta
     * Verify that is installed on the device. Can only be set to `true`.
     * 
     */
    public Output<Optional<Boolean>> deviceIsRegistered() {
        return Codegen.optional(this.deviceIsRegistered);
    }
    /**
     * The number of factors required to satisfy this assurance level. It can be set to `&#34;1FA&#34;` or `&#34;2FA&#34;`. Default is `&#34;2FA&#34;`.
     * 
     */
    @Export(name="factorMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> factorMode;

    /**
     * @return The number of factors required to satisfy this assurance level. It can be set to `&#34;1FA&#34;` or `&#34;2FA&#34;`. Default is `&#34;2FA&#34;`.
     * 
     */
    public Output<Optional<String>> factorMode() {
        return Codegen.optional(this.factorMode);
    }
    /**
     * List of groups IDs to be excluded.
     * 
     */
    @Export(name="groupsExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupsExcludeds;

    /**
     * @return List of groups IDs to be excluded.
     * 
     */
    public Output<Optional<List<String>>> groupsExcludeds() {
        return Codegen.optional(this.groupsExcludeds);
    }
    /**
     * List of groups IDs to be included.
     * 
     */
    @Export(name="groupsIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupsIncludeds;

    /**
     * @return List of groups IDs to be included.
     * 
     */
    public Output<Optional<List<String>>> groupsIncludeds() {
        return Codegen.optional(this.groupsIncludeds);
    }
    /**
     * The inactivity duration after which the end user must re-authenticate. Use the ISO 8601 Period format for recurring time intervals. Default is `&#34;PT1H&#34;`.
     * 
     */
    @Export(name="inactivityPeriod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> inactivityPeriod;

    /**
     * @return The inactivity duration after which the end user must re-authenticate. Use the ISO 8601 Period format for recurring time intervals. Default is `&#34;PT1H&#34;`.
     * 
     */
    public Output<Optional<String>> inactivityPeriod() {
        return Codegen.optional(this.inactivityPeriod);
    }
    /**
     * Name of the policy rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network selection mode: `&#34;ANYWHERE&#34;`, `&#34;ZONE&#34;`, `&#34;ON_NETWORK&#34;`, or `&#34;OFF_NETWORK&#34;`.
     * 
     */
    @Export(name="networkConnection", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkConnection;

    /**
     * @return Network selection mode: `&#34;ANYWHERE&#34;`, `&#34;ZONE&#34;`, `&#34;ON_NETWORK&#34;`, or `&#34;OFF_NETWORK&#34;`.
     * 
     */
    public Output<Optional<String>> networkConnection() {
        return Codegen.optional(this.networkConnection);
    }
    /**
     * List of network zones IDs to exclude. Conflicts with `network_includes`.
     * 
     */
    @Export(name="networkExcludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> networkExcludes;

    /**
     * @return List of network zones IDs to exclude. Conflicts with `network_includes`.
     * 
     */
    public Output<Optional<List<String>>> networkExcludes() {
        return Codegen.optional(this.networkExcludes);
    }
    /**
     * List of network zones IDs to include. Conflicts with `network_excludes`.
     * 
     */
    @Export(name="networkIncludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> networkIncludes;

    /**
     * @return List of network zones IDs to include. Conflicts with `network_excludes`.
     * 
     */
    public Output<Optional<List<String>>> networkIncludes() {
        return Codegen.optional(this.networkIncludes);
    }
    /**
     * List of particular platforms or devices to match on.
     * 
     */
    @Export(name="platformIncludes", refs={List.class,AppSignonPolicyRulePlatformInclude.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AppSignonPolicyRulePlatformInclude>> platformIncludes;

    /**
     * @return List of particular platforms or devices to match on.
     * 
     */
    public Output<Optional<List<AppSignonPolicyRulePlatformInclude>>> platformIncludes() {
        return Codegen.optional(this.platformIncludes);
    }
    /**
     * ID of the app sign-on policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return ID of the app sign-on policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * Priority of the rule.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the rule.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The duration after which the end user must re-authenticate, regardless of user activity. Use the ISO 8601 Period format for recurring time intervals. `&#34;PT0S&#34;` - every sign-in attempt, `&#34;PT43800H&#34;` - once per session. Default is `&#34;PT2H&#34;`.
     * 
     */
    @Export(name="reAuthenticationFrequency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reAuthenticationFrequency;

    /**
     * @return The duration after which the end user must re-authenticate, regardless of user activity. Use the ISO 8601 Period format for recurring time intervals. `&#34;PT0S&#34;` - every sign-in attempt, `&#34;PT43800H&#34;` - once per session. Default is `&#34;PT2H&#34;`.
     * 
     */
    public Output<Optional<String>> reAuthenticationFrequency() {
        return Codegen.optional(this.reAuthenticationFrequency);
    }
    /**
     * The risk score specifies a particular level of risk to match on. Valid values are: `&#34;ANY&#34;`, `&#34;LOW&#34;`, `&#34;MEDIUM&#34;`, `&#34;HIGH&#34;`. Default is `&#34;ANY&#34;`.
     * 
     */
    @Export(name="riskScore", refs={String.class}, tree="[0]")
    private Output<String> riskScore;

    /**
     * @return The risk score specifies a particular level of risk to match on. Valid values are: `&#34;ANY&#34;`, `&#34;LOW&#34;`, `&#34;MEDIUM&#34;`, `&#34;HIGH&#34;`. Default is `&#34;ANY&#34;`.
     * 
     */
    public Output<String> riskScore() {
        return this.riskScore;
    }
    /**
     * Status of the rule
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the rule
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Often the &#34;Catch-all Rule&#34; this rule is the system (default) rule for its associated policy.
     * 
     */
    @Export(name="system", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> system;

    /**
     * @return Often the &#34;Catch-all Rule&#34; this rule is the system (default) rule for its associated policy.
     * 
     */
    public Output<Boolean> system() {
        return this.system;
    }
    /**
     * The Verification Method type. It can be set to `&#34;ASSURANCE&#34;`. Default is `&#34;ASSURANCE&#34;`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The Verification Method type. It can be set to `&#34;ASSURANCE&#34;`. Default is `&#34;ASSURANCE&#34;`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * List of user types IDs to be excluded.
     * 
     */
    @Export(name="userTypesExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userTypesExcludeds;

    /**
     * @return List of user types IDs to be excluded.
     * 
     */
    public Output<Optional<List<String>>> userTypesExcludeds() {
        return Codegen.optional(this.userTypesExcludeds);
    }
    /**
     * List of user types IDs to be included.
     * 
     */
    @Export(name="userTypesIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userTypesIncludeds;

    /**
     * @return List of user types IDs to be included.
     * 
     */
    public Output<Optional<List<String>>> userTypesIncludeds() {
        return Codegen.optional(this.userTypesIncludeds);
    }
    /**
     * List of users IDs to be excluded.
     * 
     */
    @Export(name="usersExcludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> usersExcludeds;

    /**
     * @return List of users IDs to be excluded.
     * 
     */
    public Output<Optional<List<String>>> usersExcludeds() {
        return Codegen.optional(this.usersExcludeds);
    }
    /**
     * List of users IDs to be included.
     * 
     */
    @Export(name="usersIncludeds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> usersIncludeds;

    /**
     * @return List of users IDs to be included.
     * 
     */
    public Output<Optional<List<String>>> usersIncludeds() {
        return Codegen.optional(this.usersIncludeds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSignonPolicyRule(String name) {
        this(name, AppSignonPolicyRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSignonPolicyRule(String name, AppSignonPolicyRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSignonPolicyRule(String name, AppSignonPolicyRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicyRule:AppSignonPolicyRule", name, args == null ? AppSignonPolicyRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSignonPolicyRule(String name, Output<String> id, @Nullable AppSignonPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/appSignonPolicyRule:AppSignonPolicyRule", name, state, makeResourceOptions(options, id));
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
    public static AppSignonPolicyRule get(String name, Output<String> id, @Nullable AppSignonPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSignonPolicyRule(name, id, state, options);
    }
}
