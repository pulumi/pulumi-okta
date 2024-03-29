// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.okta.Index.inputs.LogStreamSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogStreamState extends com.pulumi.resources.ResourceArgs {

    public static final LogStreamState Empty = new LogStreamState();

    /**
     * Name of the Log Stream Resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Log Stream Resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Stream provider specific configuration.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<LogStreamSettingsArgs> settings;

    /**
     * @return Stream provider specific configuration.
     * 
     */
    public Optional<Output<LogStreamSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Type of the Log Stream - can either be `&#34;aws_eventbridge&#34;` or `&#34;splunk_cloud_logstreaming&#34;` only.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the Log Stream - can either be `&#34;aws_eventbridge&#34;` or `&#34;splunk_cloud_logstreaming&#34;` only.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LogStreamState() {}

    private LogStreamState(LogStreamState $) {
        this.name = $.name;
        this.settings = $.settings;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStreamState $;

        public Builder() {
            $ = new LogStreamState();
        }

        public Builder(LogStreamState defaults) {
            $ = new LogStreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Log Stream Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Log Stream Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param settings Stream provider specific configuration.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<LogStreamSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Stream provider specific configuration.
         * 
         * @return builder
         * 
         */
        public Builder settings(LogStreamSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param status Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Type of the Log Stream - can either be `&#34;aws_eventbridge&#34;` or `&#34;splunk_cloud_logstreaming&#34;` only.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Log Stream - can either be `&#34;aws_eventbridge&#34;` or `&#34;splunk_cloud_logstreaming&#34;` only.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LogStreamState build() {
            return $;
        }
    }

}
