// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.okta.user.outputs.GetUserSearch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * @return Administrator roles assigned to user.
     * 
     */
    private List<String> adminRoles;
    /**
     * @return City or locality component of user&#39;s address.
     * 
     */
    private String city;
    private @Nullable String compoundSearchOperator;
    /**
     * @return Name of a cost center assigned to user.
     * 
     */
    private String costCenter;
    /**
     * @return Country name component of user&#39;s address.
     * 
     */
    private String countryCode;
    /**
     * @return Raw JSON containing all custom profile attributes.
     * 
     */
    private String customProfileAttributes;
    private @Nullable String delayReadSeconds;
    /**
     * @return Name of user&#39;s department.
     * 
     */
    private String department;
    /**
     * @return Name of the user, suitable for display to end users.
     * 
     */
    private String displayName;
    /**
     * @return Name of user&#39;s division.
     * 
     */
    private String division;
    /**
     * @return Primary email address of user.
     * 
     */
    private String email;
    /**
     * @return Organization or company assigned unique identifier for the user.
     * 
     */
    private String employeeNumber;
    /**
     * @return Given name of the user.
     * 
     */
    private String firstName;
    /**
     * @return Groups user belongs to.
     * 
     */
    private List<String> groupMemberships;
    /**
     * @return Honorific prefix(es) of the user, or title in most Western languages.
     * 
     */
    private String honorificPrefix;
    /**
     * @return Honorific suffix(es) of the user.
     * 
     */
    private String honorificSuffix;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Family name of the user.
     * 
     */
    private String lastName;
    /**
     * @return User&#39;s default location for purposes of localizing items such as currency, date time format, numerical representations, etc.
     * 
     */
    private String locale;
    /**
     * @return Unique identifier for the user.
     * 
     */
    private String login;
    /**
     * @return Display name of the user&#39;s manager.
     * 
     */
    private String manager;
    /**
     * @return `id` of a user&#39;s manager.
     * 
     */
    private String managerId;
    /**
     * @return Middle name(s) of the user.
     * 
     */
    private String middleName;
    /**
     * @return Mobile phone number of user.
     * 
     */
    private String mobilePhone;
    /**
     * @return Casual way to address the user in real life.
     * 
     */
    private String nickName;
    /**
     * @return Name of user&#39;s organization.
     * 
     */
    private String organization;
    /**
     * @return Mailing address component of user&#39;s address.
     * 
     */
    private String postalAddress;
    /**
     * @return User&#39;s preferred written or spoken languages.
     * 
     */
    private String preferredLanguage;
    /**
     * @return Primary phone number of user such as home number.
     * 
     */
    private String primaryPhone;
    /**
     * @return URL of user&#39;s online profile (e.g. a web page).
     * 
     */
    private String profileUrl;
    private @Nullable List<GetUserSearch> searches;
    /**
     * @return Secondary email address of user typically used for account recovery.
     * 
     */
    private String secondEmail;
    private @Nullable Boolean skipGroups;
    private @Nullable Boolean skipRoles;
    /**
     * @return State or region component of user&#39;s address (region).
     * 
     */
    private String state;
    /**
     * @return Current status of user.
     * 
     */
    private String status;
    /**
     * @return Full street address component of user&#39;s address.
     * 
     */
    private String streetAddress;
    /**
     * @return User&#39;s time zone.
     * 
     */
    private String timezone;
    /**
     * @return User&#39;s title, such as &#34;Vice President&#34;.
     * 
     */
    private String title;
    private @Nullable String userId;
    /**
     * @return Used to describe the organization to user relationship such as &#34;Employee&#34; or &#34;Contractor&#34;.
     * 
     */
    private String userType;
    /**
     * @return Zipcode or postal code component of user&#39;s address (postalCode)
     * 
     */
    private String zipCode;

    private GetUserResult() {}
    /**
     * @return Administrator roles assigned to user.
     * 
     */
    public List<String> adminRoles() {
        return this.adminRoles;
    }
    /**
     * @return City or locality component of user&#39;s address.
     * 
     */
    public String city() {
        return this.city;
    }
    public Optional<String> compoundSearchOperator() {
        return Optional.ofNullable(this.compoundSearchOperator);
    }
    /**
     * @return Name of a cost center assigned to user.
     * 
     */
    public String costCenter() {
        return this.costCenter;
    }
    /**
     * @return Country name component of user&#39;s address.
     * 
     */
    public String countryCode() {
        return this.countryCode;
    }
    /**
     * @return Raw JSON containing all custom profile attributes.
     * 
     */
    public String customProfileAttributes() {
        return this.customProfileAttributes;
    }
    public Optional<String> delayReadSeconds() {
        return Optional.ofNullable(this.delayReadSeconds);
    }
    /**
     * @return Name of user&#39;s department.
     * 
     */
    public String department() {
        return this.department;
    }
    /**
     * @return Name of the user, suitable for display to end users.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Name of user&#39;s division.
     * 
     */
    public String division() {
        return this.division;
    }
    /**
     * @return Primary email address of user.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Organization or company assigned unique identifier for the user.
     * 
     */
    public String employeeNumber() {
        return this.employeeNumber;
    }
    /**
     * @return Given name of the user.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return Groups user belongs to.
     * 
     */
    public List<String> groupMemberships() {
        return this.groupMemberships;
    }
    /**
     * @return Honorific prefix(es) of the user, or title in most Western languages.
     * 
     */
    public String honorificPrefix() {
        return this.honorificPrefix;
    }
    /**
     * @return Honorific suffix(es) of the user.
     * 
     */
    public String honorificSuffix() {
        return this.honorificSuffix;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Family name of the user.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return User&#39;s default location for purposes of localizing items such as currency, date time format, numerical representations, etc.
     * 
     */
    public String locale() {
        return this.locale;
    }
    /**
     * @return Unique identifier for the user.
     * 
     */
    public String login() {
        return this.login;
    }
    /**
     * @return Display name of the user&#39;s manager.
     * 
     */
    public String manager() {
        return this.manager;
    }
    /**
     * @return `id` of a user&#39;s manager.
     * 
     */
    public String managerId() {
        return this.managerId;
    }
    /**
     * @return Middle name(s) of the user.
     * 
     */
    public String middleName() {
        return this.middleName;
    }
    /**
     * @return Mobile phone number of user.
     * 
     */
    public String mobilePhone() {
        return this.mobilePhone;
    }
    /**
     * @return Casual way to address the user in real life.
     * 
     */
    public String nickName() {
        return this.nickName;
    }
    /**
     * @return Name of user&#39;s organization.
     * 
     */
    public String organization() {
        return this.organization;
    }
    /**
     * @return Mailing address component of user&#39;s address.
     * 
     */
    public String postalAddress() {
        return this.postalAddress;
    }
    /**
     * @return User&#39;s preferred written or spoken languages.
     * 
     */
    public String preferredLanguage() {
        return this.preferredLanguage;
    }
    /**
     * @return Primary phone number of user such as home number.
     * 
     */
    public String primaryPhone() {
        return this.primaryPhone;
    }
    /**
     * @return URL of user&#39;s online profile (e.g. a web page).
     * 
     */
    public String profileUrl() {
        return this.profileUrl;
    }
    public List<GetUserSearch> searches() {
        return this.searches == null ? List.of() : this.searches;
    }
    /**
     * @return Secondary email address of user typically used for account recovery.
     * 
     */
    public String secondEmail() {
        return this.secondEmail;
    }
    public Optional<Boolean> skipGroups() {
        return Optional.ofNullable(this.skipGroups);
    }
    public Optional<Boolean> skipRoles() {
        return Optional.ofNullable(this.skipRoles);
    }
    /**
     * @return State or region component of user&#39;s address (region).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Current status of user.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Full street address component of user&#39;s address.
     * 
     */
    public String streetAddress() {
        return this.streetAddress;
    }
    /**
     * @return User&#39;s time zone.
     * 
     */
    public String timezone() {
        return this.timezone;
    }
    /**
     * @return User&#39;s title, such as &#34;Vice President&#34;.
     * 
     */
    public String title() {
        return this.title;
    }
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    /**
     * @return Used to describe the organization to user relationship such as &#34;Employee&#34; or &#34;Contractor&#34;.
     * 
     */
    public String userType() {
        return this.userType;
    }
    /**
     * @return Zipcode or postal code component of user&#39;s address (postalCode)
     * 
     */
    public String zipCode() {
        return this.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> adminRoles;
        private String city;
        private @Nullable String compoundSearchOperator;
        private String costCenter;
        private String countryCode;
        private String customProfileAttributes;
        private @Nullable String delayReadSeconds;
        private String department;
        private String displayName;
        private String division;
        private String email;
        private String employeeNumber;
        private String firstName;
        private List<String> groupMemberships;
        private String honorificPrefix;
        private String honorificSuffix;
        private String id;
        private String lastName;
        private String locale;
        private String login;
        private String manager;
        private String managerId;
        private String middleName;
        private String mobilePhone;
        private String nickName;
        private String organization;
        private String postalAddress;
        private String preferredLanguage;
        private String primaryPhone;
        private String profileUrl;
        private @Nullable List<GetUserSearch> searches;
        private String secondEmail;
        private @Nullable Boolean skipGroups;
        private @Nullable Boolean skipRoles;
        private String state;
        private String status;
        private String streetAddress;
        private String timezone;
        private String title;
        private @Nullable String userId;
        private String userType;
        private String zipCode;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminRoles = defaults.adminRoles;
    	      this.city = defaults.city;
    	      this.compoundSearchOperator = defaults.compoundSearchOperator;
    	      this.costCenter = defaults.costCenter;
    	      this.countryCode = defaults.countryCode;
    	      this.customProfileAttributes = defaults.customProfileAttributes;
    	      this.delayReadSeconds = defaults.delayReadSeconds;
    	      this.department = defaults.department;
    	      this.displayName = defaults.displayName;
    	      this.division = defaults.division;
    	      this.email = defaults.email;
    	      this.employeeNumber = defaults.employeeNumber;
    	      this.firstName = defaults.firstName;
    	      this.groupMemberships = defaults.groupMemberships;
    	      this.honorificPrefix = defaults.honorificPrefix;
    	      this.honorificSuffix = defaults.honorificSuffix;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.locale = defaults.locale;
    	      this.login = defaults.login;
    	      this.manager = defaults.manager;
    	      this.managerId = defaults.managerId;
    	      this.middleName = defaults.middleName;
    	      this.mobilePhone = defaults.mobilePhone;
    	      this.nickName = defaults.nickName;
    	      this.organization = defaults.organization;
    	      this.postalAddress = defaults.postalAddress;
    	      this.preferredLanguage = defaults.preferredLanguage;
    	      this.primaryPhone = defaults.primaryPhone;
    	      this.profileUrl = defaults.profileUrl;
    	      this.searches = defaults.searches;
    	      this.secondEmail = defaults.secondEmail;
    	      this.skipGroups = defaults.skipGroups;
    	      this.skipRoles = defaults.skipRoles;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.streetAddress = defaults.streetAddress;
    	      this.timezone = defaults.timezone;
    	      this.title = defaults.title;
    	      this.userId = defaults.userId;
    	      this.userType = defaults.userType;
    	      this.zipCode = defaults.zipCode;
        }

        @CustomType.Setter
        public Builder adminRoles(List<String> adminRoles) {
            this.adminRoles = Objects.requireNonNull(adminRoles);
            return this;
        }
        public Builder adminRoles(String... adminRoles) {
            return adminRoles(List.of(adminRoles));
        }
        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder compoundSearchOperator(@Nullable String compoundSearchOperator) {
            this.compoundSearchOperator = compoundSearchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder costCenter(String costCenter) {
            this.costCenter = Objects.requireNonNull(costCenter);
            return this;
        }
        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }
        @CustomType.Setter
        public Builder customProfileAttributes(String customProfileAttributes) {
            this.customProfileAttributes = Objects.requireNonNull(customProfileAttributes);
            return this;
        }
        @CustomType.Setter
        public Builder delayReadSeconds(@Nullable String delayReadSeconds) {
            this.delayReadSeconds = delayReadSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder department(String department) {
            this.department = Objects.requireNonNull(department);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder division(String division) {
            this.division = Objects.requireNonNull(division);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = Objects.requireNonNull(employeeNumber);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder groupMemberships(List<String> groupMemberships) {
            this.groupMemberships = Objects.requireNonNull(groupMemberships);
            return this;
        }
        public Builder groupMemberships(String... groupMemberships) {
            return groupMemberships(List.of(groupMemberships));
        }
        @CustomType.Setter
        public Builder honorificPrefix(String honorificPrefix) {
            this.honorificPrefix = Objects.requireNonNull(honorificPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder honorificSuffix(String honorificSuffix) {
            this.honorificSuffix = Objects.requireNonNull(honorificSuffix);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder locale(String locale) {
            this.locale = Objects.requireNonNull(locale);
            return this;
        }
        @CustomType.Setter
        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        @CustomType.Setter
        public Builder manager(String manager) {
            this.manager = Objects.requireNonNull(manager);
            return this;
        }
        @CustomType.Setter
        public Builder managerId(String managerId) {
            this.managerId = Objects.requireNonNull(managerId);
            return this;
        }
        @CustomType.Setter
        public Builder middleName(String middleName) {
            this.middleName = Objects.requireNonNull(middleName);
            return this;
        }
        @CustomType.Setter
        public Builder mobilePhone(String mobilePhone) {
            this.mobilePhone = Objects.requireNonNull(mobilePhone);
            return this;
        }
        @CustomType.Setter
        public Builder nickName(String nickName) {
            this.nickName = Objects.requireNonNull(nickName);
            return this;
        }
        @CustomType.Setter
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        @CustomType.Setter
        public Builder postalAddress(String postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }
        @CustomType.Setter
        public Builder preferredLanguage(String preferredLanguage) {
            this.preferredLanguage = Objects.requireNonNull(preferredLanguage);
            return this;
        }
        @CustomType.Setter
        public Builder primaryPhone(String primaryPhone) {
            this.primaryPhone = Objects.requireNonNull(primaryPhone);
            return this;
        }
        @CustomType.Setter
        public Builder profileUrl(String profileUrl) {
            this.profileUrl = Objects.requireNonNull(profileUrl);
            return this;
        }
        @CustomType.Setter
        public Builder searches(@Nullable List<GetUserSearch> searches) {
            this.searches = searches;
            return this;
        }
        public Builder searches(GetUserSearch... searches) {
            return searches(List.of(searches));
        }
        @CustomType.Setter
        public Builder secondEmail(String secondEmail) {
            this.secondEmail = Objects.requireNonNull(secondEmail);
            return this;
        }
        @CustomType.Setter
        public Builder skipGroups(@Nullable Boolean skipGroups) {
            this.skipGroups = skipGroups;
            return this;
        }
        @CustomType.Setter
        public Builder skipRoles(@Nullable Boolean skipRoles) {
            this.skipRoles = skipRoles;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder streetAddress(String streetAddress) {
            this.streetAddress = Objects.requireNonNull(streetAddress);
            return this;
        }
        @CustomType.Setter
        public Builder timezone(String timezone) {
            this.timezone = Objects.requireNonNull(timezone);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder userType(String userType) {
            this.userType = Objects.requireNonNull(userType);
            return this;
        }
        @CustomType.Setter
        public Builder zipCode(String zipCode) {
            this.zipCode = Objects.requireNonNull(zipCode);
            return this;
        }
        public GetUserResult build() {
            final var o = new GetUserResult();
            o.adminRoles = adminRoles;
            o.city = city;
            o.compoundSearchOperator = compoundSearchOperator;
            o.costCenter = costCenter;
            o.countryCode = countryCode;
            o.customProfileAttributes = customProfileAttributes;
            o.delayReadSeconds = delayReadSeconds;
            o.department = department;
            o.displayName = displayName;
            o.division = division;
            o.email = email;
            o.employeeNumber = employeeNumber;
            o.firstName = firstName;
            o.groupMemberships = groupMemberships;
            o.honorificPrefix = honorificPrefix;
            o.honorificSuffix = honorificSuffix;
            o.id = id;
            o.lastName = lastName;
            o.locale = locale;
            o.login = login;
            o.manager = manager;
            o.managerId = managerId;
            o.middleName = middleName;
            o.mobilePhone = mobilePhone;
            o.nickName = nickName;
            o.organization = organization;
            o.postalAddress = postalAddress;
            o.preferredLanguage = preferredLanguage;
            o.primaryPhone = primaryPhone;
            o.profileUrl = profileUrl;
            o.searches = searches;
            o.secondEmail = secondEmail;
            o.skipGroups = skipGroups;
            o.skipRoles = skipRoles;
            o.state = state;
            o.status = status;
            o.streetAddress = streetAddress;
            o.timezone = timezone;
            o.title = title;
            o.userId = userId;
            o.userType = userType;
            o.zipCode = zipCode;
            return o;
        }
    }
}