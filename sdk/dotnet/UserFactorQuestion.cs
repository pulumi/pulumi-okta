// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta
{
    /// <summary>
    /// Creates security question factor for a user.
    /// 
    /// This resource allows you to create and configure security question factor for a user.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Okta = Pulumi.Okta;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleUser = new Okta.User.User("exampleUser", new Okta.User.UserArgs
    ///         {
    ///             FirstName = "John",
    ///             LastName = "Smith",
    ///             Login = "john.smith@example.com",
    ///             Email = "john.smith@example.com",
    ///         });
    ///         var exampleUserSecurityQuestions = exampleUser.Id.Apply(id =&gt; Okta.GetUserSecurityQuestions.InvokeAsync(new Okta.GetUserSecurityQuestionsArgs
    ///         {
    ///             UserId = id,
    ///         }));
    ///         var exampleFactor = new Okta.Factor.Factor("exampleFactor", new Okta.Factor.FactorArgs
    ///         {
    ///             ProviderId = "okta_question",
    ///             Active = true,
    ///         });
    ///         var exampleUserFactorQuestion = new Okta.UserFactorQuestion("exampleUserFactorQuestion", new Okta.UserFactorQuestionArgs
    ///         {
    ///             UserId = exampleUser.Id,
    ///             Key = exampleUserSecurityQuestions.Apply(exampleUserSecurityQuestions =&gt; exampleUserSecurityQuestions.Questions[0].Key),
    ///             Answer = "meatball",
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleFactor,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Security question factor for a user can be imported via the `user_id` and the `factor_id`.
    /// 
    /// ```sh
    ///  $ pulumi import okta:index/userFactorQuestion:UserFactorQuestion example &lt;user id&gt;/&lt;question factor id&gt;
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/userFactorQuestion:UserFactorQuestion")]
    public partial class UserFactorQuestion : Pulumi.CustomResource
    {
        /// <summary>
        /// Security question answer. Note here that answer won't be set during the resource import.
        /// </summary>
        [Output("answer")]
        public Output<string> Answer { get; private set; } = null!;

        /// <summary>
        /// Security question unique key.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// The status of the security question factor.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Display text for security question.
        /// </summary>
        [Output("text")]
        public Output<string> Text { get; private set; } = null!;

        /// <summary>
        /// ID of the user. Resource will be recreated when `user_id` changes.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserFactorQuestion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserFactorQuestion(string name, UserFactorQuestionArgs args, CustomResourceOptions? options = null)
            : base("okta:index/userFactorQuestion:UserFactorQuestion", name, args ?? new UserFactorQuestionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserFactorQuestion(string name, Input<string> id, UserFactorQuestionState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/userFactorQuestion:UserFactorQuestion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserFactorQuestion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserFactorQuestion Get(string name, Input<string> id, UserFactorQuestionState? state = null, CustomResourceOptions? options = null)
        {
            return new UserFactorQuestion(name, id, state, options);
        }
    }

    public sealed class UserFactorQuestionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security question answer. Note here that answer won't be set during the resource import.
        /// </summary>
        [Input("answer", required: true)]
        public Input<string> Answer { get; set; } = null!;

        /// <summary>
        /// Security question unique key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// ID of the user. Resource will be recreated when `user_id` changes.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserFactorQuestionArgs()
        {
        }
    }

    public sealed class UserFactorQuestionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security question answer. Note here that answer won't be set during the resource import.
        /// </summary>
        [Input("answer")]
        public Input<string>? Answer { get; set; }

        /// <summary>
        /// Security question unique key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The status of the security question factor.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Display text for security question.
        /// </summary>
        [Input("text")]
        public Input<string>? Text { get; set; }

        /// <summary>
        /// ID of the user. Resource will be recreated when `user_id` changes.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserFactorQuestionState()
        {
        }
    }
}