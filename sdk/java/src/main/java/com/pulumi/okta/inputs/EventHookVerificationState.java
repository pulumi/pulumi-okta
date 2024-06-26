// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventHookVerificationState extends com.pulumi.resources.ResourceArgs {

    public static final EventHookVerificationState Empty = new EventHookVerificationState();

    /**
     * Event hook ID
     * 
     */
    @Import(name="eventHookId")
    private @Nullable Output<String> eventHookId;

    /**
     * @return Event hook ID
     * 
     */
    public Optional<Output<String>> eventHookId() {
        return Optional.ofNullable(this.eventHookId);
    }

    private EventHookVerificationState() {}

    private EventHookVerificationState(EventHookVerificationState $) {
        this.eventHookId = $.eventHookId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHookVerificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHookVerificationState $;

        public Builder() {
            $ = new EventHookVerificationState();
        }

        public Builder(EventHookVerificationState defaults) {
            $ = new EventHookVerificationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventHookId Event hook ID
         * 
         * @return builder
         * 
         */
        public Builder eventHookId(@Nullable Output<String> eventHookId) {
            $.eventHookId = eventHookId;
            return this;
        }

        /**
         * @param eventHookId Event hook ID
         * 
         * @return builder
         * 
         */
        public Builder eventHookId(String eventHookId) {
            return eventHookId(Output.of(eventHookId));
        }

        public EventHookVerificationState build() {
            return $;
        }
    }

}
