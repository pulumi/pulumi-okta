// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.okta.inputs.GetDeviceAssurancePolicyThirdPartySignalProviderDtc;
import java.util.Objects;


public final class GetDeviceAssurancePolicyThirdPartySignalProvider extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceAssurancePolicyThirdPartySignalProvider Empty = new GetDeviceAssurancePolicyThirdPartySignalProvider();

    @Import(name="dtc", required=true)
    private GetDeviceAssurancePolicyThirdPartySignalProviderDtc dtc;

    public GetDeviceAssurancePolicyThirdPartySignalProviderDtc dtc() {
        return this.dtc;
    }

    private GetDeviceAssurancePolicyThirdPartySignalProvider() {}

    private GetDeviceAssurancePolicyThirdPartySignalProvider(GetDeviceAssurancePolicyThirdPartySignalProvider $) {
        this.dtc = $.dtc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceAssurancePolicyThirdPartySignalProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceAssurancePolicyThirdPartySignalProvider $;

        public Builder() {
            $ = new GetDeviceAssurancePolicyThirdPartySignalProvider();
        }

        public Builder(GetDeviceAssurancePolicyThirdPartySignalProvider defaults) {
            $ = new GetDeviceAssurancePolicyThirdPartySignalProvider(Objects.requireNonNull(defaults));
        }

        public Builder dtc(GetDeviceAssurancePolicyThirdPartySignalProviderDtc dtc) {
            $.dtc = dtc;
            return this;
        }

        public GetDeviceAssurancePolicyThirdPartySignalProvider build() {
            if ($.dtc == null) {
                throw new MissingRequiredPropertyException("GetDeviceAssurancePolicyThirdPartySignalProvider", "dtc");
            }
            return $;
        }
    }

}