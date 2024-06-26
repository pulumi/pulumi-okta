// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CaptchaOrgWideSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final CaptchaOrgWideSettingsState Empty = new CaptchaOrgWideSettingsState();

    /**
     * Array of pages that have CAPTCHA enabled. Valid values: `SSR`, `SSPR` and `SIGN_IN`.
     * 
     */
    @Import(name="captchaId")
    private @Nullable Output<String> captchaId;

    /**
     * @return Array of pages that have CAPTCHA enabled. Valid values: `SSR`, `SSPR` and `SIGN_IN`.
     * 
     */
    public Optional<Output<String>> captchaId() {
        return Optional.ofNullable(this.captchaId);
    }

    /**
     * Set of pages that have CAPTCHA enabled
     * 
     */
    @Import(name="enabledFors")
    private @Nullable Output<List<String>> enabledFors;

    /**
     * @return Set of pages that have CAPTCHA enabled
     * 
     */
    public Optional<Output<List<String>>> enabledFors() {
        return Optional.ofNullable(this.enabledFors);
    }

    private CaptchaOrgWideSettingsState() {}

    private CaptchaOrgWideSettingsState(CaptchaOrgWideSettingsState $) {
        this.captchaId = $.captchaId;
        this.enabledFors = $.enabledFors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaptchaOrgWideSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaptchaOrgWideSettingsState $;

        public Builder() {
            $ = new CaptchaOrgWideSettingsState();
        }

        public Builder(CaptchaOrgWideSettingsState defaults) {
            $ = new CaptchaOrgWideSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param captchaId Array of pages that have CAPTCHA enabled. Valid values: `SSR`, `SSPR` and `SIGN_IN`.
         * 
         * @return builder
         * 
         */
        public Builder captchaId(@Nullable Output<String> captchaId) {
            $.captchaId = captchaId;
            return this;
        }

        /**
         * @param captchaId Array of pages that have CAPTCHA enabled. Valid values: `SSR`, `SSPR` and `SIGN_IN`.
         * 
         * @return builder
         * 
         */
        public Builder captchaId(String captchaId) {
            return captchaId(Output.of(captchaId));
        }

        /**
         * @param enabledFors Set of pages that have CAPTCHA enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledFors(@Nullable Output<List<String>> enabledFors) {
            $.enabledFors = enabledFors;
            return this;
        }

        /**
         * @param enabledFors Set of pages that have CAPTCHA enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledFors(List<String> enabledFors) {
            return enabledFors(Output.of(enabledFors));
        }

        /**
         * @param enabledFors Set of pages that have CAPTCHA enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledFors(String... enabledFors) {
            return enabledFors(List.of(enabledFors));
        }

        public CaptchaOrgWideSettingsState build() {
            return $;
        }
    }

}
