// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGroupResult {
    private @Nullable String delayReadSeconds;
    /**
     * @return description of group.
     * 
     */
    private String description;
    /**
     * @return ID of group.
     * 
     */
    private @Nullable String id;
    private @Nullable Boolean includeUsers;
    /**
     * @return name of group.
     * 
     */
    private @Nullable String name;
    /**
     * @return type of group.
     * 
     */
    private @Nullable String type;
    /**
     * @return user ids that are members of this group, only included if `include_users` is set to `true`.
     * 
     */
    private List<String> users;

    private GetGroupResult() {}
    public Optional<String> delayReadSeconds() {
        return Optional.ofNullable(this.delayReadSeconds);
    }
    /**
     * @return description of group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of group.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Boolean> includeUsers() {
        return Optional.ofNullable(this.includeUsers);
    }
    /**
     * @return name of group.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return type of group.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return user ids that are members of this group, only included if `include_users` is set to `true`.
     * 
     */
    public List<String> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String delayReadSeconds;
        private String description;
        private @Nullable String id;
        private @Nullable Boolean includeUsers;
        private @Nullable String name;
        private @Nullable String type;
        private List<String> users;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayReadSeconds = defaults.delayReadSeconds;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.includeUsers = defaults.includeUsers;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder delayReadSeconds(@Nullable String delayReadSeconds) {
            this.delayReadSeconds = delayReadSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeUsers(@Nullable Boolean includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<String> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.delayReadSeconds = delayReadSeconds;
            o.description = description;
            o.id = id;
            o.includeUsers = includeUsers;
            o.name = name;
            o.type = type;
            o.users = users;
            return o;
        }
    }
}