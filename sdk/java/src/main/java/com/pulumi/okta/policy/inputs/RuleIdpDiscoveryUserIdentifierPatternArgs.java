// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleIdpDiscoveryUserIdentifierPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleIdpDiscoveryUserIdentifierPatternArgs Empty = new RuleIdpDiscoveryUserIdentifierPatternArgs();

    /**
     * The kind of pattern. For regex, use `&#34;EXPRESSION&#34;`. For simple string matches, use one of the following: `&#34;SUFFIX&#34;`, `&#34;EQUALS&#34;`, `&#34;STARTS_WITH&#34;`, `&#34;CONTAINS&#34;`
     * 
     */
    @Import(name="matchType")
    private @Nullable Output<String> matchType;

    /**
     * @return The kind of pattern. For regex, use `&#34;EXPRESSION&#34;`. For simple string matches, use one of the following: `&#34;SUFFIX&#34;`, `&#34;EQUALS&#34;`, `&#34;STARTS_WITH&#34;`, `&#34;CONTAINS&#34;`
     * 
     */
    public Optional<Output<String>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    /**
     * The regex or simple match string to match against.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The regex or simple match string to match against.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RuleIdpDiscoveryUserIdentifierPatternArgs() {}

    private RuleIdpDiscoveryUserIdentifierPatternArgs(RuleIdpDiscoveryUserIdentifierPatternArgs $) {
        this.matchType = $.matchType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleIdpDiscoveryUserIdentifierPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleIdpDiscoveryUserIdentifierPatternArgs $;

        public Builder() {
            $ = new RuleIdpDiscoveryUserIdentifierPatternArgs();
        }

        public Builder(RuleIdpDiscoveryUserIdentifierPatternArgs defaults) {
            $ = new RuleIdpDiscoveryUserIdentifierPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchType The kind of pattern. For regex, use `&#34;EXPRESSION&#34;`. For simple string matches, use one of the following: `&#34;SUFFIX&#34;`, `&#34;EQUALS&#34;`, `&#34;STARTS_WITH&#34;`, `&#34;CONTAINS&#34;`
         * 
         * @return builder
         * 
         */
        public Builder matchType(@Nullable Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        /**
         * @param matchType The kind of pattern. For regex, use `&#34;EXPRESSION&#34;`. For simple string matches, use one of the following: `&#34;SUFFIX&#34;`, `&#34;EQUALS&#34;`, `&#34;STARTS_WITH&#34;`, `&#34;CONTAINS&#34;`
         * 
         * @return builder
         * 
         */
        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        /**
         * @param value The regex or simple match string to match against.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The regex or simple match string to match against.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RuleIdpDiscoveryUserIdentifierPatternArgs build() {
            return $;
        }
    }

}