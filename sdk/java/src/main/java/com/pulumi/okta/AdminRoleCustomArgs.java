// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdminRoleCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdminRoleCustomArgs Empty = new AdminRoleCustomArgs();

    /**
     * A human-readable description of the new Role
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A human-readable description of the new Role
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The name given to the new Role
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The name given to the new Role
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The permissions that the new Role grants. At least one
     * 			permission must be specified when creating custom role. Valid values: &#34;okta.users.manage&#34;,
     * 			&#34;okta.users.create&#34;,
     * 			&#34;okta.users.read&#34;,
     * 			&#34;okta.users.credentials.manage&#34;,
     * 			&#34;okta.users.credentials.resetFactors&#34;,
     * 			&#34;okta.users.credentials.resetPassword&#34;,
     * 			&#34;okta.users.credentials.expirePassword&#34;,
     * 			&#34;okta.users.userprofile.manage&#34;,
     * 			&#34;okta.users.lifecycle.manage&#34;,
     * 			&#34;okta.users.lifecycle.activate&#34;,
     * 			&#34;okta.users.lifecycle.deactivate&#34;,
     * 			&#34;okta.users.lifecycle.suspend&#34;,
     * 			&#34;okta.users.lifecycle.unsuspend&#34;,
     * 			&#34;okta.users.lifecycle.delete&#34;,
     * 			&#34;okta.users.lifecycle.unlock&#34;,
     * 			&#34;okta.users.lifecycle.clearSessions&#34;,
     * 			&#34;okta.users.groupMembership.manage&#34;,
     * 			&#34;okta.users.appAssignment.manage&#34;,
     * 			&#34;okta.users.apitokens.manage&#34;,
     * 			&#34;okta.users.apitokens.read&#34;,
     * 			&#34;okta.groups.manage&#34;,
     * 			&#34;okta.groups.create&#34;,
     * 			&#34;okta.groups.members.manage&#34;,
     * 			&#34;okta.groups.read&#34;,
     * 			&#34;okta.groups.appAssignment.manage&#34;,
     * 			&#34;okta.apps.read&#34;,
     * 			&#34;okta.apps.manage&#34;,
     * 			&#34;okta.apps.assignment.manage&#34;,
     * 			&#34;okta.profilesources.import.run&#34;,
     * 			&#34;okta.authzServers.read&#34;,
     * 			&#34;okta.users.userprofile.manage&#34;,
     * 			&#34;okta.authzServers.manage&#34;,
     * 			&#34;okta.customizations.read&#34;,
     * 			&#34;okta.customizations.manage&#34;,
     * 			&#34;okta.identityProviders.read&#34;,
     * 			&#34;okta.identityProviders.manage&#34;,
     * 			&#34;okta.workflows.read&#34;,
     * 			&#34;okta.workflows.invoke&#34;.
     * 			&#34;okta.governance.accessCertifications.manage&#34;,
     * 			&#34;okta.governance.accessRequests.manage&#34;,
     * 			&#34;okta.apps.manageFirstPartyApps&#34;,
     * 			&#34;okta.agents.manage&#34;,
     * 			&#34;okta.agents.register&#34;,
     * 			&#34;okta.agents.view&#34;,
     * 			&#34;okta.directories.manage&#34;,
     * 			&#34;okta.directories.read&#34;,
     * 			&#34;okta.devices.manage&#34;,
     * 			&#34;okta.devices.lifecycle.manage&#34;,
     * 			&#34;okta.devices.lifecycle.activate&#34;,
     * 			&#34;okta.devices.lifecycle.deactivate&#34;,
     * 			&#34;okta.devices.lifecycle.suspend&#34;,
     * 			&#34;okta.devices.lifecycle.unsuspend&#34;,
     * 			&#34;okta.devices.lifecycle.delete&#34;,
     * 			&#34;okta.devices.read&#34;,
     * 			&#34;okta.iam.read&#34;,
     * 			&#34;okta.support.cases.manage&#34;.,
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    /**
     * @return The permissions that the new Role grants. At least one
     * 			permission must be specified when creating custom role. Valid values: &#34;okta.users.manage&#34;,
     * 			&#34;okta.users.create&#34;,
     * 			&#34;okta.users.read&#34;,
     * 			&#34;okta.users.credentials.manage&#34;,
     * 			&#34;okta.users.credentials.resetFactors&#34;,
     * 			&#34;okta.users.credentials.resetPassword&#34;,
     * 			&#34;okta.users.credentials.expirePassword&#34;,
     * 			&#34;okta.users.userprofile.manage&#34;,
     * 			&#34;okta.users.lifecycle.manage&#34;,
     * 			&#34;okta.users.lifecycle.activate&#34;,
     * 			&#34;okta.users.lifecycle.deactivate&#34;,
     * 			&#34;okta.users.lifecycle.suspend&#34;,
     * 			&#34;okta.users.lifecycle.unsuspend&#34;,
     * 			&#34;okta.users.lifecycle.delete&#34;,
     * 			&#34;okta.users.lifecycle.unlock&#34;,
     * 			&#34;okta.users.lifecycle.clearSessions&#34;,
     * 			&#34;okta.users.groupMembership.manage&#34;,
     * 			&#34;okta.users.appAssignment.manage&#34;,
     * 			&#34;okta.users.apitokens.manage&#34;,
     * 			&#34;okta.users.apitokens.read&#34;,
     * 			&#34;okta.groups.manage&#34;,
     * 			&#34;okta.groups.create&#34;,
     * 			&#34;okta.groups.members.manage&#34;,
     * 			&#34;okta.groups.read&#34;,
     * 			&#34;okta.groups.appAssignment.manage&#34;,
     * 			&#34;okta.apps.read&#34;,
     * 			&#34;okta.apps.manage&#34;,
     * 			&#34;okta.apps.assignment.manage&#34;,
     * 			&#34;okta.profilesources.import.run&#34;,
     * 			&#34;okta.authzServers.read&#34;,
     * 			&#34;okta.users.userprofile.manage&#34;,
     * 			&#34;okta.authzServers.manage&#34;,
     * 			&#34;okta.customizations.read&#34;,
     * 			&#34;okta.customizations.manage&#34;,
     * 			&#34;okta.identityProviders.read&#34;,
     * 			&#34;okta.identityProviders.manage&#34;,
     * 			&#34;okta.workflows.read&#34;,
     * 			&#34;okta.workflows.invoke&#34;.
     * 			&#34;okta.governance.accessCertifications.manage&#34;,
     * 			&#34;okta.governance.accessRequests.manage&#34;,
     * 			&#34;okta.apps.manageFirstPartyApps&#34;,
     * 			&#34;okta.agents.manage&#34;,
     * 			&#34;okta.agents.register&#34;,
     * 			&#34;okta.agents.view&#34;,
     * 			&#34;okta.directories.manage&#34;,
     * 			&#34;okta.directories.read&#34;,
     * 			&#34;okta.devices.manage&#34;,
     * 			&#34;okta.devices.lifecycle.manage&#34;,
     * 			&#34;okta.devices.lifecycle.activate&#34;,
     * 			&#34;okta.devices.lifecycle.deactivate&#34;,
     * 			&#34;okta.devices.lifecycle.suspend&#34;,
     * 			&#34;okta.devices.lifecycle.unsuspend&#34;,
     * 			&#34;okta.devices.lifecycle.delete&#34;,
     * 			&#34;okta.devices.read&#34;,
     * 			&#34;okta.iam.read&#34;,
     * 			&#34;okta.support.cases.manage&#34;.,
     * 
     */
    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private AdminRoleCustomArgs() {}

    private AdminRoleCustomArgs(AdminRoleCustomArgs $) {
        this.description = $.description;
        this.label = $.label;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdminRoleCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdminRoleCustomArgs $;

        public Builder() {
            $ = new AdminRoleCustomArgs();
        }

        public Builder(AdminRoleCustomArgs defaults) {
            $ = new AdminRoleCustomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description of the new Role
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the new Role
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param label The name given to the new Role
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The name given to the new Role
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param permissions The permissions that the new Role grants. At least one
         * 			permission must be specified when creating custom role. Valid values: &#34;okta.users.manage&#34;,
         * 			&#34;okta.users.create&#34;,
         * 			&#34;okta.users.read&#34;,
         * 			&#34;okta.users.credentials.manage&#34;,
         * 			&#34;okta.users.credentials.resetFactors&#34;,
         * 			&#34;okta.users.credentials.resetPassword&#34;,
         * 			&#34;okta.users.credentials.expirePassword&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.users.lifecycle.manage&#34;,
         * 			&#34;okta.users.lifecycle.activate&#34;,
         * 			&#34;okta.users.lifecycle.deactivate&#34;,
         * 			&#34;okta.users.lifecycle.suspend&#34;,
         * 			&#34;okta.users.lifecycle.unsuspend&#34;,
         * 			&#34;okta.users.lifecycle.delete&#34;,
         * 			&#34;okta.users.lifecycle.unlock&#34;,
         * 			&#34;okta.users.lifecycle.clearSessions&#34;,
         * 			&#34;okta.users.groupMembership.manage&#34;,
         * 			&#34;okta.users.appAssignment.manage&#34;,
         * 			&#34;okta.users.apitokens.manage&#34;,
         * 			&#34;okta.users.apitokens.read&#34;,
         * 			&#34;okta.groups.manage&#34;,
         * 			&#34;okta.groups.create&#34;,
         * 			&#34;okta.groups.members.manage&#34;,
         * 			&#34;okta.groups.read&#34;,
         * 			&#34;okta.groups.appAssignment.manage&#34;,
         * 			&#34;okta.apps.read&#34;,
         * 			&#34;okta.apps.manage&#34;,
         * 			&#34;okta.apps.assignment.manage&#34;,
         * 			&#34;okta.profilesources.import.run&#34;,
         * 			&#34;okta.authzServers.read&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.authzServers.manage&#34;,
         * 			&#34;okta.customizations.read&#34;,
         * 			&#34;okta.customizations.manage&#34;,
         * 			&#34;okta.identityProviders.read&#34;,
         * 			&#34;okta.identityProviders.manage&#34;,
         * 			&#34;okta.workflows.read&#34;,
         * 			&#34;okta.workflows.invoke&#34;.
         * 			&#34;okta.governance.accessCertifications.manage&#34;,
         * 			&#34;okta.governance.accessRequests.manage&#34;,
         * 			&#34;okta.apps.manageFirstPartyApps&#34;,
         * 			&#34;okta.agents.manage&#34;,
         * 			&#34;okta.agents.register&#34;,
         * 			&#34;okta.agents.view&#34;,
         * 			&#34;okta.directories.manage&#34;,
         * 			&#34;okta.directories.read&#34;,
         * 			&#34;okta.devices.manage&#34;,
         * 			&#34;okta.devices.lifecycle.manage&#34;,
         * 			&#34;okta.devices.lifecycle.activate&#34;,
         * 			&#34;okta.devices.lifecycle.deactivate&#34;,
         * 			&#34;okta.devices.lifecycle.suspend&#34;,
         * 			&#34;okta.devices.lifecycle.unsuspend&#34;,
         * 			&#34;okta.devices.lifecycle.delete&#34;,
         * 			&#34;okta.devices.read&#34;,
         * 			&#34;okta.iam.read&#34;,
         * 			&#34;okta.support.cases.manage&#34;.,
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The permissions that the new Role grants. At least one
         * 			permission must be specified when creating custom role. Valid values: &#34;okta.users.manage&#34;,
         * 			&#34;okta.users.create&#34;,
         * 			&#34;okta.users.read&#34;,
         * 			&#34;okta.users.credentials.manage&#34;,
         * 			&#34;okta.users.credentials.resetFactors&#34;,
         * 			&#34;okta.users.credentials.resetPassword&#34;,
         * 			&#34;okta.users.credentials.expirePassword&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.users.lifecycle.manage&#34;,
         * 			&#34;okta.users.lifecycle.activate&#34;,
         * 			&#34;okta.users.lifecycle.deactivate&#34;,
         * 			&#34;okta.users.lifecycle.suspend&#34;,
         * 			&#34;okta.users.lifecycle.unsuspend&#34;,
         * 			&#34;okta.users.lifecycle.delete&#34;,
         * 			&#34;okta.users.lifecycle.unlock&#34;,
         * 			&#34;okta.users.lifecycle.clearSessions&#34;,
         * 			&#34;okta.users.groupMembership.manage&#34;,
         * 			&#34;okta.users.appAssignment.manage&#34;,
         * 			&#34;okta.users.apitokens.manage&#34;,
         * 			&#34;okta.users.apitokens.read&#34;,
         * 			&#34;okta.groups.manage&#34;,
         * 			&#34;okta.groups.create&#34;,
         * 			&#34;okta.groups.members.manage&#34;,
         * 			&#34;okta.groups.read&#34;,
         * 			&#34;okta.groups.appAssignment.manage&#34;,
         * 			&#34;okta.apps.read&#34;,
         * 			&#34;okta.apps.manage&#34;,
         * 			&#34;okta.apps.assignment.manage&#34;,
         * 			&#34;okta.profilesources.import.run&#34;,
         * 			&#34;okta.authzServers.read&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.authzServers.manage&#34;,
         * 			&#34;okta.customizations.read&#34;,
         * 			&#34;okta.customizations.manage&#34;,
         * 			&#34;okta.identityProviders.read&#34;,
         * 			&#34;okta.identityProviders.manage&#34;,
         * 			&#34;okta.workflows.read&#34;,
         * 			&#34;okta.workflows.invoke&#34;.
         * 			&#34;okta.governance.accessCertifications.manage&#34;,
         * 			&#34;okta.governance.accessRequests.manage&#34;,
         * 			&#34;okta.apps.manageFirstPartyApps&#34;,
         * 			&#34;okta.agents.manage&#34;,
         * 			&#34;okta.agents.register&#34;,
         * 			&#34;okta.agents.view&#34;,
         * 			&#34;okta.directories.manage&#34;,
         * 			&#34;okta.directories.read&#34;,
         * 			&#34;okta.devices.manage&#34;,
         * 			&#34;okta.devices.lifecycle.manage&#34;,
         * 			&#34;okta.devices.lifecycle.activate&#34;,
         * 			&#34;okta.devices.lifecycle.deactivate&#34;,
         * 			&#34;okta.devices.lifecycle.suspend&#34;,
         * 			&#34;okta.devices.lifecycle.unsuspend&#34;,
         * 			&#34;okta.devices.lifecycle.delete&#34;,
         * 			&#34;okta.devices.read&#34;,
         * 			&#34;okta.iam.read&#34;,
         * 			&#34;okta.support.cases.manage&#34;.,
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions The permissions that the new Role grants. At least one
         * 			permission must be specified when creating custom role. Valid values: &#34;okta.users.manage&#34;,
         * 			&#34;okta.users.create&#34;,
         * 			&#34;okta.users.read&#34;,
         * 			&#34;okta.users.credentials.manage&#34;,
         * 			&#34;okta.users.credentials.resetFactors&#34;,
         * 			&#34;okta.users.credentials.resetPassword&#34;,
         * 			&#34;okta.users.credentials.expirePassword&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.users.lifecycle.manage&#34;,
         * 			&#34;okta.users.lifecycle.activate&#34;,
         * 			&#34;okta.users.lifecycle.deactivate&#34;,
         * 			&#34;okta.users.lifecycle.suspend&#34;,
         * 			&#34;okta.users.lifecycle.unsuspend&#34;,
         * 			&#34;okta.users.lifecycle.delete&#34;,
         * 			&#34;okta.users.lifecycle.unlock&#34;,
         * 			&#34;okta.users.lifecycle.clearSessions&#34;,
         * 			&#34;okta.users.groupMembership.manage&#34;,
         * 			&#34;okta.users.appAssignment.manage&#34;,
         * 			&#34;okta.users.apitokens.manage&#34;,
         * 			&#34;okta.users.apitokens.read&#34;,
         * 			&#34;okta.groups.manage&#34;,
         * 			&#34;okta.groups.create&#34;,
         * 			&#34;okta.groups.members.manage&#34;,
         * 			&#34;okta.groups.read&#34;,
         * 			&#34;okta.groups.appAssignment.manage&#34;,
         * 			&#34;okta.apps.read&#34;,
         * 			&#34;okta.apps.manage&#34;,
         * 			&#34;okta.apps.assignment.manage&#34;,
         * 			&#34;okta.profilesources.import.run&#34;,
         * 			&#34;okta.authzServers.read&#34;,
         * 			&#34;okta.users.userprofile.manage&#34;,
         * 			&#34;okta.authzServers.manage&#34;,
         * 			&#34;okta.customizations.read&#34;,
         * 			&#34;okta.customizations.manage&#34;,
         * 			&#34;okta.identityProviders.read&#34;,
         * 			&#34;okta.identityProviders.manage&#34;,
         * 			&#34;okta.workflows.read&#34;,
         * 			&#34;okta.workflows.invoke&#34;.
         * 			&#34;okta.governance.accessCertifications.manage&#34;,
         * 			&#34;okta.governance.accessRequests.manage&#34;,
         * 			&#34;okta.apps.manageFirstPartyApps&#34;,
         * 			&#34;okta.agents.manage&#34;,
         * 			&#34;okta.agents.register&#34;,
         * 			&#34;okta.agents.view&#34;,
         * 			&#34;okta.directories.manage&#34;,
         * 			&#34;okta.directories.read&#34;,
         * 			&#34;okta.devices.manage&#34;,
         * 			&#34;okta.devices.lifecycle.manage&#34;,
         * 			&#34;okta.devices.lifecycle.activate&#34;,
         * 			&#34;okta.devices.lifecycle.deactivate&#34;,
         * 			&#34;okta.devices.lifecycle.suspend&#34;,
         * 			&#34;okta.devices.lifecycle.unsuspend&#34;,
         * 			&#34;okta.devices.lifecycle.delete&#34;,
         * 			&#34;okta.devices.read&#34;,
         * 			&#34;okta.iam.read&#34;,
         * 			&#34;okta.support.cases.manage&#34;.,
         * 
         * @return builder
         * 
         */
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public AdminRoleCustomArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("AdminRoleCustomArgs", "description");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("AdminRoleCustomArgs", "label");
            }
            return $;
        }
    }

}
