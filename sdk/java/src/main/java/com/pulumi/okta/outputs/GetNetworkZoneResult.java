// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkZoneResult {
    /**
     * @return Array of Autonomous System Numbers.
     * 
     */
    private List<String> asns;
    /**
     * @return Array of locations.
     * 
     */
    private List<String> dynamicLocations;
    /**
     * @return Type of proxy being controlled by this dynamic network zone.
     * 
     */
    private String dynamicProxyType;
    /**
     * @return Array of values in CIDR/range form.
     * 
     */
    private List<String> gateways;
    /**
     * @return ID of the network zone.
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the network zone.
     * 
     */
    private @Nullable String name;
    /**
     * @return Array of values in CIDR/range form.
     * 
     */
    private List<String> proxies;
    /**
     * @return Type of the Network Zone.
     * 
     */
    private String type;
    /**
     * @return Usage of the Network Zone.
     * 
     */
    private String usage;

    private GetNetworkZoneResult() {}
    /**
     * @return Array of Autonomous System Numbers.
     * 
     */
    public List<String> asns() {
        return this.asns;
    }
    /**
     * @return Array of locations.
     * 
     */
    public List<String> dynamicLocations() {
        return this.dynamicLocations;
    }
    /**
     * @return Type of proxy being controlled by this dynamic network zone.
     * 
     */
    public String dynamicProxyType() {
        return this.dynamicProxyType;
    }
    /**
     * @return Array of values in CIDR/range form.
     * 
     */
    public List<String> gateways() {
        return this.gateways;
    }
    /**
     * @return ID of the network zone.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the network zone.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Array of values in CIDR/range form.
     * 
     */
    public List<String> proxies() {
        return this.proxies;
    }
    /**
     * @return Type of the Network Zone.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Usage of the Network Zone.
     * 
     */
    public String usage() {
        return this.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkZoneResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> asns;
        private List<String> dynamicLocations;
        private String dynamicProxyType;
        private List<String> gateways;
        private @Nullable String id;
        private @Nullable String name;
        private List<String> proxies;
        private String type;
        private String usage;
        public Builder() {}
        public Builder(GetNetworkZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asns = defaults.asns;
    	      this.dynamicLocations = defaults.dynamicLocations;
    	      this.dynamicProxyType = defaults.dynamicProxyType;
    	      this.gateways = defaults.gateways;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.proxies = defaults.proxies;
    	      this.type = defaults.type;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder asns(List<String> asns) {
            this.asns = Objects.requireNonNull(asns);
            return this;
        }
        public Builder asns(String... asns) {
            return asns(List.of(asns));
        }
        @CustomType.Setter
        public Builder dynamicLocations(List<String> dynamicLocations) {
            this.dynamicLocations = Objects.requireNonNull(dynamicLocations);
            return this;
        }
        public Builder dynamicLocations(String... dynamicLocations) {
            return dynamicLocations(List.of(dynamicLocations));
        }
        @CustomType.Setter
        public Builder dynamicProxyType(String dynamicProxyType) {
            this.dynamicProxyType = Objects.requireNonNull(dynamicProxyType);
            return this;
        }
        @CustomType.Setter
        public Builder gateways(List<String> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(String... gateways) {
            return gateways(List.of(gateways));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder proxies(List<String> proxies) {
            this.proxies = Objects.requireNonNull(proxies);
            return this;
        }
        public Builder proxies(String... proxies) {
            return proxies(List.of(proxies));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usage(String usage) {
            this.usage = Objects.requireNonNull(usage);
            return this;
        }
        public GetNetworkZoneResult build() {
            final var o = new GetNetworkZoneResult();
            o.asns = asns;
            o.dynamicLocations = dynamicLocations;
            o.dynamicProxyType = dynamicProxyType;
            o.gateways = gateways;
            o.id = id;
            o.name = name;
            o.proxies = proxies;
            o.type = type;
            o.usage = usage;
            return o;
        }
    }
}