// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.Index.CustomizedSigninPageArgs;
import com.pulumi.okta.Index.inputs.CustomizedSigninPageState;
import com.pulumi.okta.Index.outputs.CustomizedSigninPageContentSecurityPolicySetting;
import com.pulumi.okta.Index.outputs.CustomizedSigninPageWidgetCustomizations;
import com.pulumi.okta.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="okta:Index/customizedSigninPage:CustomizedSigninPage")
public class CustomizedSigninPage extends com.pulumi.resources.CustomResource {
    /**
     * brand id of the preview signin page
     * 
     */
    @Export(name="brandId", refs={String.class}, tree="[0]")
    private Output<String> brandId;

    /**
     * @return brand id of the preview signin page
     * 
     */
    public Output<String> brandId() {
        return this.brandId;
    }
    @Export(name="contentSecurityPolicySetting", refs={CustomizedSigninPageContentSecurityPolicySetting.class}, tree="[0]")
    private Output</* @Nullable */ CustomizedSigninPageContentSecurityPolicySetting> contentSecurityPolicySetting;

    public Output<Optional<CustomizedSigninPageContentSecurityPolicySetting>> contentSecurityPolicySetting() {
        return Codegen.optional(this.contentSecurityPolicySetting);
    }
    /**
     * page content of the preview signin page
     * 
     */
    @Export(name="pageContent", refs={String.class}, tree="[0]")
    private Output<String> pageContent;

    /**
     * @return page content of the preview signin page
     * 
     */
    public Output<String> pageContent() {
        return this.pageContent;
    }
    @Export(name="widgetCustomizations", refs={CustomizedSigninPageWidgetCustomizations.class}, tree="[0]")
    private Output</* @Nullable */ CustomizedSigninPageWidgetCustomizations> widgetCustomizations;

    public Output<Optional<CustomizedSigninPageWidgetCustomizations>> widgetCustomizations() {
        return Codegen.optional(this.widgetCustomizations);
    }
    /**
     * widget version specified as a Semver. The following are currently supported *, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7,
     * 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16,
     * 2.17, 2.18, 2.19, 2.20, 2.21, 3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1,
     * 5.2, 5.3, 5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5, 6.6,
     * 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
     * 
     */
    @Export(name="widgetVersion", refs={String.class}, tree="[0]")
    private Output<String> widgetVersion;

    /**
     * @return widget version specified as a Semver. The following are currently supported *, ^1, ^2, ^3, ^4, ^5, ^6, ^7, 1.6, 1.7,
     * 1.8, 1.9, 1.10, 1.11, 1.12, 1.13, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 2.10, 2.11, 2.12, 2.13, 2.14, 2.15, 2.16,
     * 2.17, 2.18, 2.19, 2.20, 2.21, 3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 5.0, 5.1,
     * 5.2, 5.3, 5.4, 5.5, 5.6, 5.7, 5.8, 5.9, 5.10, 5.11, 5.12, 5.13, 5.14, 5.15, 5.16, 6.0, 6.1, 6.2, 6.3, 6.4, 6.5, 6.6,
     * 6.7, 6.8, 6.9, 7.0, 7.1, 7.2, 7.3, 7.4, 7.5, 7.6, 7.7, 7.8, 7.9, 7.10, 7.11, 7.12, 7.13.
     * 
     */
    public Output<String> widgetVersion() {
        return this.widgetVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomizedSigninPage(String name) {
        this(name, CustomizedSigninPageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomizedSigninPage(String name, CustomizedSigninPageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomizedSigninPage(String name, CustomizedSigninPageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:Index/customizedSigninPage:CustomizedSigninPage", name, args == null ? CustomizedSigninPageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomizedSigninPage(String name, Output<String> id, @Nullable CustomizedSigninPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:Index/customizedSigninPage:CustomizedSigninPage", name, state, makeResourceOptions(options, id));
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
    public static CustomizedSigninPage get(String name, Output<String> id, @Nullable CustomizedSigninPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomizedSigninPage(name, id, state, options);
    }
}