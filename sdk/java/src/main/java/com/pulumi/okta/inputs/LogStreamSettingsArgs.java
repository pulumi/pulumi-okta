// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogStreamSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogStreamSettingsArgs Empty = new LogStreamSettingsArgs();

    /**
     * AWS account ID. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return AWS account ID. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws*govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk*cloud_logstreaming&#39; type
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws*govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk*cloud_logstreaming&#39; type
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="eventSourceName")
    private @Nullable Output<String> eventSourceName;

    /**
     * @return An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Optional<Output<String>> eventSourceName() {
        return Optional.ofNullable(this.eventSourceName);
    }

    /**
     * The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk*cloud*logstreaming&#39; type
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk*cloud*logstreaming&#39; type
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk*cloud*logstreaming&#39; type
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk*cloud*logstreaming&#39; type
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private LogStreamSettingsArgs() {}

    private LogStreamSettingsArgs(LogStreamSettingsArgs $) {
        this.accountId = $.accountId;
        this.edition = $.edition;
        this.eventSourceName = $.eventSourceName;
        this.host = $.host;
        this.region = $.region;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStreamSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStreamSettingsArgs $;

        public Builder() {
            $ = new LogStreamSettingsArgs();
        }

        public Builder(LogStreamSettingsArgs defaults) {
            $ = new LogStreamSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId AWS account ID. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param edition Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws*govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk*cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws*govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk*cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param eventSourceName An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder eventSourceName(@Nullable Output<String> eventSourceName) {
            $.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * @param eventSourceName An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder eventSourceName(String eventSourceName) {
            return eventSourceName(Output.of(eventSourceName));
        }

        /**
         * @param host The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk*cloud*logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk*cloud*logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param region The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param token The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk*cloud*logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk*cloud*logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public LogStreamSettingsArgs build() {
            return $;
        }
    }

}