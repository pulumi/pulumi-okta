// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLogStreamSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLogStreamSettingsArgs Empty = new GetLogStreamSettingsArgs();

    /**
     * AWS account ID. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return AWS account ID. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws_govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    @Import(name="edition", required=true)
    private Output<String> edition;

    /**
     * @return Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws_govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }

    /**
     * An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="eventSourceName", required=true)
    private Output<String> eventSourceName;

    /**
     * @return An alphanumeric name (no spaces) to identify this event source in AWS EventBridge. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Output<String> eventSourceName() {
        return this.eventSourceName;
    }

    /**
     * The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The destination AWS region where event source is located. Required only for &#39;aws_eventbridge&#39; type
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk_cloud_logstreaming&#39; type
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    private GetLogStreamSettingsArgs() {}

    private GetLogStreamSettingsArgs(GetLogStreamSettingsArgs $) {
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
    public static Builder builder(GetLogStreamSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogStreamSettingsArgs $;

        public Builder() {
            $ = new GetLogStreamSettingsArgs();
        }

        public Builder(GetLogStreamSettingsArgs defaults) {
            $ = new GetLogStreamSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID. Required only for &#39;aws_eventbridge&#39; type
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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
         * @param edition Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws_govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder edition(Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition Edition of the Splunk Cloud instance. Could be one of: &#39;aws&#39;, &#39;aws_govcloud&#39;, &#39;gcp&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
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
        public Builder eventSourceName(Output<String> eventSourceName) {
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
         * @param host The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The domain name for Splunk Cloud instance. Don&#39;t include http or https in the string. For example: &#39;acme.splunkcloud.com&#39;. Required only for &#39;splunk_cloud_logstreaming&#39; type
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
        public Builder region(Output<String> region) {
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
         * @param token The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk_cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The HEC token for your Splunk Cloud HTTP Event Collector. Required only for &#39;splunk_cloud_logstreaming&#39; type
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public GetLogStreamSettingsArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "accountId");
            }
            if ($.edition == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "edition");
            }
            if ($.eventSourceName == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "eventSourceName");
            }
            if ($.host == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "host");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "region");
            }
            if ($.token == null) {
                throw new MissingRequiredPropertyException("GetLogStreamSettingsArgs", "token");
            }
            return $;
        }
    }

}