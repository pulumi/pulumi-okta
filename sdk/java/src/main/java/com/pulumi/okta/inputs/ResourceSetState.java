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


public final class ResourceSetState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSetState Empty = new ResourceSetState();

    /**
     * A description of the Resource Set
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Resource Set
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique name given to the Resource Set
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Unique name given to the Resource Set
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The endpoints that reference the resources to be included in the new Resource Set. At least one endpoint must be specified when creating resource set.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return The endpoints that reference the resources to be included in the new Resource Set. At least one endpoint must be specified when creating resource set.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * The orn(Okta Resource Name) of the resources to be included in the new Resource Set. At least one orn must be specified when creating resource set.
     * 
     */
    @Import(name="resourcesOrns")
    private @Nullable Output<List<String>> resourcesOrns;

    /**
     * @return The orn(Okta Resource Name) of the resources to be included in the new Resource Set. At least one orn must be specified when creating resource set.
     * 
     */
    public Optional<Output<List<String>>> resourcesOrns() {
        return Optional.ofNullable(this.resourcesOrns);
    }

    private ResourceSetState() {}

    private ResourceSetState(ResourceSetState $) {
        this.description = $.description;
        this.label = $.label;
        this.resources = $.resources;
        this.resourcesOrns = $.resourcesOrns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSetState $;

        public Builder() {
            $ = new ResourceSetState();
        }

        public Builder(ResourceSetState defaults) {
            $ = new ResourceSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the Resource Set
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Resource Set
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param label Unique name given to the Resource Set
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Unique name given to the Resource Set
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param resources The endpoints that reference the resources to be included in the new Resource Set. At least one endpoint must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources The endpoints that reference the resources to be included in the new Resource Set. At least one endpoint must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources The endpoints that reference the resources to be included in the new Resource Set. At least one endpoint must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param resourcesOrns The orn(Okta Resource Name) of the resources to be included in the new Resource Set. At least one orn must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resourcesOrns(@Nullable Output<List<String>> resourcesOrns) {
            $.resourcesOrns = resourcesOrns;
            return this;
        }

        /**
         * @param resourcesOrns The orn(Okta Resource Name) of the resources to be included in the new Resource Set. At least one orn must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resourcesOrns(List<String> resourcesOrns) {
            return resourcesOrns(Output.of(resourcesOrns));
        }

        /**
         * @param resourcesOrns The orn(Okta Resource Name) of the resources to be included in the new Resource Set. At least one orn must be specified when creating resource set.
         * 
         * @return builder
         * 
         */
        public Builder resourcesOrns(String... resourcesOrns) {
            return resourcesOrns(List.of(resourcesOrns));
        }

        public ResourceSetState build() {
            return $;
        }
    }

}
