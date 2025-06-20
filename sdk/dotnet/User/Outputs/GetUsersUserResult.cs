// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.User.Outputs
{

    [OutputType]
    public sealed class GetUsersUserResult
    {
        public readonly ImmutableArray<string> AdminRoles;
        public readonly string City;
        public readonly string CostCenter;
        public readonly string CountryCode;
        public readonly string CustomProfileAttributes;
        public readonly string Department;
        public readonly string DisplayName;
        public readonly string Division;
        public readonly string Email;
        public readonly string EmployeeNumber;
        public readonly string FirstName;
        public readonly ImmutableArray<string> GroupMemberships;
        public readonly string HonorificPrefix;
        public readonly string HonorificSuffix;
        public readonly string Id;
        public readonly string LastName;
        public readonly string Locale;
        public readonly string Login;
        public readonly string Manager;
        public readonly string ManagerId;
        public readonly string MiddleName;
        public readonly string MobilePhone;
        public readonly string NickName;
        public readonly string Organization;
        public readonly string PostalAddress;
        public readonly string PreferredLanguage;
        public readonly string PrimaryPhone;
        public readonly string ProfileUrl;
        public readonly ImmutableArray<string> Roles;
        public readonly string SecondEmail;
        public readonly string State;
        public readonly string Status;
        public readonly string StreetAddress;
        public readonly string Timezone;
        public readonly string Title;
        public readonly string UserType;
        public readonly string ZipCode;

        [OutputConstructor]
        private GetUsersUserResult(
            ImmutableArray<string> adminRoles,

            string city,

            string costCenter,

            string countryCode,

            string customProfileAttributes,

            string department,

            string displayName,

            string division,

            string email,

            string employeeNumber,

            string firstName,

            ImmutableArray<string> groupMemberships,

            string honorificPrefix,

            string honorificSuffix,

            string id,

            string lastName,

            string locale,

            string login,

            string manager,

            string managerId,

            string middleName,

            string mobilePhone,

            string nickName,

            string organization,

            string postalAddress,

            string preferredLanguage,

            string primaryPhone,

            string profileUrl,

            ImmutableArray<string> roles,

            string secondEmail,

            string state,

            string status,

            string streetAddress,

            string timezone,

            string title,

            string userType,

            string zipCode)
        {
            AdminRoles = adminRoles;
            City = city;
            CostCenter = costCenter;
            CountryCode = countryCode;
            CustomProfileAttributes = customProfileAttributes;
            Department = department;
            DisplayName = displayName;
            Division = division;
            Email = email;
            EmployeeNumber = employeeNumber;
            FirstName = firstName;
            GroupMemberships = groupMemberships;
            HonorificPrefix = honorificPrefix;
            HonorificSuffix = honorificSuffix;
            Id = id;
            LastName = lastName;
            Locale = locale;
            Login = login;
            Manager = manager;
            ManagerId = managerId;
            MiddleName = middleName;
            MobilePhone = mobilePhone;
            NickName = nickName;
            Organization = organization;
            PostalAddress = postalAddress;
            PreferredLanguage = preferredLanguage;
            PrimaryPhone = primaryPhone;
            ProfileUrl = profileUrl;
            Roles = roles;
            SecondEmail = secondEmail;
            State = state;
            Status = status;
            StreetAddress = streetAddress;
            Timezone = timezone;
            Title = title;
            UserType = userType;
            ZipCode = zipCode;
        }
    }
}
