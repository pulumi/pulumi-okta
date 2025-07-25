// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Okta = Pulumi.Okta;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Okta.User.User("test", new()
    ///     {
    ///         FirstName = "TestAcc",
    ///         LastName = "Smith",
    ///         Login = "testAcc-replace_with_uuid@example.com",
    ///         Email = "testAcc-replace_with_uuid@example.com",
    ///     });
    /// 
    ///     var testUserGroupMemberships = new Okta.UserGroupMemberships("test", new()
    ///     {
    ///         UserId = test.Id,
    ///         Groups = new[]
    ///         {
    ///             test1.Id,
    ///             test2.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/userGroupMemberships:UserGroupMemberships")]
    public partial class UserGroupMemberships : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of Okta group IDs which the user should have membership managed for.
        /// </summary>
        [Output("groups")]
        public Output<ImmutableArray<string>> Groups { get; private set; } = null!;

        /// <summary>
        /// ID of a Okta User
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserGroupMemberships resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserGroupMemberships(string name, UserGroupMembershipsArgs args, CustomResourceOptions? options = null)
            : base("okta:index/userGroupMemberships:UserGroupMemberships", name, args ?? new UserGroupMembershipsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserGroupMemberships(string name, Input<string> id, UserGroupMembershipsState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/userGroupMemberships:UserGroupMemberships", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserGroupMemberships resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserGroupMemberships Get(string name, Input<string> id, UserGroupMembershipsState? state = null, CustomResourceOptions? options = null)
        {
            return new UserGroupMemberships(name, id, state, options);
        }
    }

    public sealed class UserGroupMembershipsArgs : global::Pulumi.ResourceArgs
    {
        [Input("groups", required: true)]
        private InputList<string>? _groups;

        /// <summary>
        /// The list of Okta group IDs which the user should have membership managed for.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// ID of a Okta User
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserGroupMembershipsArgs()
        {
        }
        public static new UserGroupMembershipsArgs Empty => new UserGroupMembershipsArgs();
    }

    public sealed class UserGroupMembershipsState : global::Pulumi.ResourceArgs
    {
        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// The list of Okta group IDs which the user should have membership managed for.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// ID of a Okta User
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserGroupMembershipsState()
        {
        }
        public static new UserGroupMembershipsState Empty => new UserGroupMembershipsState();
    }
}
