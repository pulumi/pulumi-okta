// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.okta.inputs.TemplateSmsTranslationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateSmsState extends com.pulumi.resources.ResourceArgs {

    public static final TemplateSmsState Empty = new TemplateSmsState();

    /**
     * The SMS message.
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The SMS message.
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Set of translations for a particular template.
     * 
     */
    @Import(name="translations")
    private @Nullable Output<List<TemplateSmsTranslationArgs>> translations;

    /**
     * @return Set of translations for a particular template.
     * 
     */
    public Optional<Output<List<TemplateSmsTranslationArgs>>> translations() {
        return Optional.ofNullable(this.translations);
    }

    /**
     * SMS template type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return SMS template type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private TemplateSmsState() {}

    private TemplateSmsState(TemplateSmsState $) {
        this.template = $.template;
        this.translations = $.translations;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateSmsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateSmsState $;

        public Builder() {
            $ = new TemplateSmsState();
        }

        public Builder(TemplateSmsState defaults) {
            $ = new TemplateSmsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param template The SMS message.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The SMS message.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param translations Set of translations for a particular template.
         * 
         * @return builder
         * 
         */
        public Builder translations(@Nullable Output<List<TemplateSmsTranslationArgs>> translations) {
            $.translations = translations;
            return this;
        }

        /**
         * @param translations Set of translations for a particular template.
         * 
         * @return builder
         * 
         */
        public Builder translations(List<TemplateSmsTranslationArgs> translations) {
            return translations(Output.of(translations));
        }

        /**
         * @param translations Set of translations for a particular template.
         * 
         * @return builder
         * 
         */
        public Builder translations(TemplateSmsTranslationArgs... translations) {
            return translations(List.of(translations));
        }

        /**
         * @param type SMS template type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type SMS template type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TemplateSmsState build() {
            return $;
        }
    }

}