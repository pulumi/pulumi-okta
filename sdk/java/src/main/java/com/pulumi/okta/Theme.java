// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.okta.ThemeArgs;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.inputs.ThemeState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to get and update an Okta
 * [Theme](https://developer.okta.com/docs/reference/api/brands/#theme-object).
 * 
 * The Okta Management API does not have a true Create or Delete for a theme. Therefore, the theme resource must be imported
 * first into the pulumi state before updates can be applied to the theme.
 * 
 * ## Import
 * 
 * An Okta Brand can be imported via the ID.
 * 
 * ```sh
 * $ pulumi import okta:index/theme:Theme example &amp;#60;brand id&amp;#62;/&amp;#60;theme id&amp;#62;
 * ```
 * 
 */
@ResourceType(type="okta:index/theme:Theme")
public class Theme extends com.pulumi.resources.CustomResource {
    /**
     * (Optional) Local path to background image file. Setting the value to the blank string `&#34;&#34;` will delete the favicon on the theme at Okta but will not delete the local file.
     * 
     */
    @Export(name="backgroundImage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> backgroundImage;

    /**
     * @return (Optional) Local path to background image file. Setting the value to the blank string `&#34;&#34;` will delete the favicon on the theme at Okta but will not delete the local file.
     * 
     */
    public Output<Optional<String>> backgroundImage() {
        return Codegen.optional(this.backgroundImage);
    }
    /**
     * (Read-Only) Background image URL
     * 
     */
    @Export(name="backgroundImageUrl", refs={String.class}, tree="[0]")
    private Output<String> backgroundImageUrl;

    /**
     * @return (Read-Only) Background image URL
     * 
     */
    public Output<String> backgroundImageUrl() {
        return this.backgroundImageUrl;
    }
    /**
     * Brand ID
     * 
     */
    @Export(name="brandId", refs={String.class}, tree="[0]")
    private Output<String> brandId;

    /**
     * @return Brand ID
     * 
     */
    public Output<String> brandId() {
        return this.brandId;
    }
    /**
     * (Required) Variant for email templates. Valid values: (`OKTA_DEFAULT`, `FULL_THEME`)
     * 
     */
    @Export(name="emailTemplateTouchPointVariant", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> emailTemplateTouchPointVariant;

    /**
     * @return (Required) Variant for email templates. Valid values: (`OKTA_DEFAULT`, `FULL_THEME`)
     * 
     */
    public Output<Optional<String>> emailTemplateTouchPointVariant() {
        return Codegen.optional(this.emailTemplateTouchPointVariant);
    }
    /**
     * (Required) Variant for the Okta End-User Dashboard. Valid values: (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
     * 
     */
    @Export(name="endUserDashboardTouchPointVariant", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endUserDashboardTouchPointVariant;

    /**
     * @return (Required) Variant for the Okta End-User Dashboard. Valid values: (`OKTA_DEFAULT`, `WHITE_LOGO_BACKGROUND`, `FULL_THEME`, `LOGO_ON_FULL_WHITE_BACKGROUND`)
     * 
     */
    public Output<Optional<String>> endUserDashboardTouchPointVariant() {
        return Codegen.optional(this.endUserDashboardTouchPointVariant);
    }
    /**
     * (Required) Variant for the error page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     * 
     */
    @Export(name="errorPageTouchPointVariant", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> errorPageTouchPointVariant;

    /**
     * @return (Required) Variant for the error page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     * 
     */
    public Output<Optional<String>> errorPageTouchPointVariant() {
        return Codegen.optional(this.errorPageTouchPointVariant);
    }
    /**
     * (Optional) Local path to favicon file. Setting the value to the blank string `&#34;&#34;` will delete the favicon on the theme at Okta but will not delete the local file.
     * 
     */
    @Export(name="favicon", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> favicon;

    /**
     * @return (Optional) Local path to favicon file. Setting the value to the blank string `&#34;&#34;` will delete the favicon on the theme at Okta but will not delete the local file.
     * 
     */
    public Output<Optional<String>> favicon() {
        return Codegen.optional(this.favicon);
    }
    /**
     * (Read-Only) Favicon URL
     * 
     */
    @Export(name="faviconUrl", refs={String.class}, tree="[0]")
    private Output<String> faviconUrl;

    /**
     * @return (Read-Only) Favicon URL
     * 
     */
    public Output<String> faviconUrl() {
        return this.faviconUrl;
    }
    /**
     * Link relations for this object - JSON HAL - (Read-Only) Discoverable resources related to the brand
     * 
     */
    @Export(name="links", refs={String.class}, tree="[0]")
    private Output<String> links;

    /**
     * @return Link relations for this object - JSON HAL - (Read-Only) Discoverable resources related to the brand
     * 
     */
    public Output<String> links() {
        return this.links;
    }
    /**
     * (Optional) Local path to logo file. Setting the value to the blank string `&#34;&#34;` will delete the logo on the theme at Okta but will not delete the local file.
     * 
     */
    @Export(name="logo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logo;

    /**
     * @return (Optional) Local path to logo file. Setting the value to the blank string `&#34;&#34;` will delete the logo on the theme at Okta but will not delete the local file.
     * 
     */
    public Output<Optional<String>> logo() {
        return Codegen.optional(this.logo);
    }
    /**
     * (Read-Only) Logo URL
     * 
     */
    @Export(name="logoUrl", refs={String.class}, tree="[0]")
    private Output<String> logoUrl;

    /**
     * @return (Read-Only) Logo URL
     * 
     */
    public Output<String> logoUrl() {
        return this.logoUrl;
    }
    /**
     * (Optional) Primary color contrast hex code
     * 
     */
    @Export(name="primaryColorContrastHex", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> primaryColorContrastHex;

    /**
     * @return (Optional) Primary color contrast hex code
     * 
     */
    public Output<Optional<String>> primaryColorContrastHex() {
        return Codegen.optional(this.primaryColorContrastHex);
    }
    /**
     * (Required) Primary color hex code
     * 
     */
    @Export(name="primaryColorHex", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> primaryColorHex;

    /**
     * @return (Required) Primary color hex code
     * 
     */
    public Output<Optional<String>> primaryColorHex() {
        return Codegen.optional(this.primaryColorHex);
    }
    /**
     * (Optional) Secondary color contrast hex code
     * 
     */
    @Export(name="secondaryColorContrastHex", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secondaryColorContrastHex;

    /**
     * @return (Optional) Secondary color contrast hex code
     * 
     */
    public Output<Optional<String>> secondaryColorContrastHex() {
        return Codegen.optional(this.secondaryColorContrastHex);
    }
    /**
     * (Required) Secondary color hex code
     * 
     */
    @Export(name="secondaryColorHex", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secondaryColorHex;

    /**
     * @return (Required) Secondary color hex code
     * 
     */
    public Output<Optional<String>> secondaryColorHex() {
        return Codegen.optional(this.secondaryColorHex);
    }
    /**
     * (Required) Variant for the Okta Sign-In Page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     * 
     */
    @Export(name="signInPageTouchPointVariant", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> signInPageTouchPointVariant;

    /**
     * @return (Required) Variant for the Okta Sign-In Page. Valid values: (`OKTA_DEFAULT`, `BACKGROUND_SECONDARY_COLOR`, `BACKGROUND_IMAGE`)
     * 
     */
    public Output<Optional<String>> signInPageTouchPointVariant() {
        return Codegen.optional(this.signInPageTouchPointVariant);
    }
    /**
     * Theme ID, used for read (faux-create)
     * 
     */
    @Export(name="themeId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> themeId;

    /**
     * @return Theme ID, used for read (faux-create)
     * 
     */
    public Output<Optional<String>> themeId() {
        return Codegen.optional(this.themeId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Theme(String name) {
        this(name, ThemeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Theme(String name, ThemeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Theme(String name, ThemeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/theme:Theme", name, args == null ? ThemeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Theme(String name, Output<String> id, @Nullable ThemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("okta:index/theme:Theme", name, state, makeResourceOptions(options, id));
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
    public static Theme get(String name, Output<String> id, @Nullable ThemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Theme(name, id, state, options);
    }
}
