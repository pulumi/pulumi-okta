// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OwnerState extends com.pulumi.resources.ResourceArgs {

    public static final OwnerState Empty = new OwnerState();

    /**
     * The display name of the group owner
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the group owner
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The id of the group
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The id of the group
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The user id of the group owner
     * 
     */
    @Import(name="idOfGroupOwner")
    private @Nullable Output<String> idOfGroupOwner;

    /**
     * @return The user id of the group owner
     * 
     */
    public Optional<Output<String>> idOfGroupOwner() {
        return Optional.ofNullable(this.idOfGroupOwner);
    }

    /**
     * The ID of the app instance if the originType is APPLICATION. This value is NULL if originType is OKTA_DIRECTORY.
     * 
     */
    @Import(name="originId")
    private @Nullable Output<String> originId;

    /**
     * @return The ID of the app instance if the originType is APPLICATION. This value is NULL if originType is OKTA_DIRECTORY.
     * 
     */
    public Optional<Output<String>> originId() {
        return Optional.ofNullable(this.originId);
    }

    /**
     * The source where group ownership is managed. Enum: &#34;APPLICATION&#34; &#34;OKTA_DIRECTORY&#34;
     * 
     */
    @Import(name="originType")
    private @Nullable Output<String> originType;

    /**
     * @return The source where group ownership is managed. Enum: &#34;APPLICATION&#34; &#34;OKTA_DIRECTORY&#34;
     * 
     */
    public Optional<Output<String>> originType() {
        return Optional.ofNullable(this.originType);
    }

    /**
     * If originType is APPLICATION, this parameter is set to FALSE until the owner&#39;s originId is reconciled with an associated Okta ID.
     * 
     */
    @Import(name="resolved")
    private @Nullable Output<Boolean> resolved;

    /**
     * @return If originType is APPLICATION, this parameter is set to FALSE until the owner&#39;s originId is reconciled with an associated Okta ID.
     * 
     */
    public Optional<Output<Boolean>> resolved() {
        return Optional.ofNullable(this.resolved);
    }

    /**
     * The entity type of the owner. Enum: &#34;GROUP&#34; &#34;USER&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The entity type of the owner. Enum: &#34;GROUP&#34; &#34;USER&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private OwnerState() {}

    private OwnerState(OwnerState $) {
        this.displayName = $.displayName;
        this.groupId = $.groupId;
        this.idOfGroupOwner = $.idOfGroupOwner;
        this.originId = $.originId;
        this.originType = $.originType;
        this.resolved = $.resolved;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnerState $;

        public Builder() {
            $ = new OwnerState();
        }

        public Builder(OwnerState defaults) {
            $ = new OwnerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The display name of the group owner
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the group owner
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param groupId The id of the group
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The id of the group
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param idOfGroupOwner The user id of the group owner
         * 
         * @return builder
         * 
         */
        public Builder idOfGroupOwner(@Nullable Output<String> idOfGroupOwner) {
            $.idOfGroupOwner = idOfGroupOwner;
            return this;
        }

        /**
         * @param idOfGroupOwner The user id of the group owner
         * 
         * @return builder
         * 
         */
        public Builder idOfGroupOwner(String idOfGroupOwner) {
            return idOfGroupOwner(Output.of(idOfGroupOwner));
        }

        /**
         * @param originId The ID of the app instance if the originType is APPLICATION. This value is NULL if originType is OKTA_DIRECTORY.
         * 
         * @return builder
         * 
         */
        public Builder originId(@Nullable Output<String> originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param originId The ID of the app instance if the originType is APPLICATION. This value is NULL if originType is OKTA_DIRECTORY.
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            return originId(Output.of(originId));
        }

        /**
         * @param originType The source where group ownership is managed. Enum: &#34;APPLICATION&#34; &#34;OKTA_DIRECTORY&#34;
         * 
         * @return builder
         * 
         */
        public Builder originType(@Nullable Output<String> originType) {
            $.originType = originType;
            return this;
        }

        /**
         * @param originType The source where group ownership is managed. Enum: &#34;APPLICATION&#34; &#34;OKTA_DIRECTORY&#34;
         * 
         * @return builder
         * 
         */
        public Builder originType(String originType) {
            return originType(Output.of(originType));
        }

        /**
         * @param resolved If originType is APPLICATION, this parameter is set to FALSE until the owner&#39;s originId is reconciled with an associated Okta ID.
         * 
         * @return builder
         * 
         */
        public Builder resolved(@Nullable Output<Boolean> resolved) {
            $.resolved = resolved;
            return this;
        }

        /**
         * @param resolved If originType is APPLICATION, this parameter is set to FALSE until the owner&#39;s originId is reconciled with an associated Okta ID.
         * 
         * @return builder
         * 
         */
        public Builder resolved(Boolean resolved) {
            return resolved(Output.of(resolved));
        }

        /**
         * @param type The entity type of the owner. Enum: &#34;GROUP&#34; &#34;USER&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The entity type of the owner. Enum: &#34;GROUP&#34; &#34;USER&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OwnerState build() {
            return $;
        }
    }

}