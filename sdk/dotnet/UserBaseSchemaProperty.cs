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
    /// Manages a User Base Schema property. This resource allows you to configure a base user schema property.
    /// 
    /// ## IMPORTANT NOTE:
    /// 
    /// Based on the [official documentation](https://developer.okta.com/docs/reference/api/schemas/#user-profile-base-subschema)
    /// base properties can not be modified, except to update permissions, to change the nullability of `firstName` and
    /// `lastName` (`required` property) or to specify a `pattern` for `login`. Currently, `title` and `type` are required, so
    /// they should be set to the current values of the base property. This will be fixed in the future releases, as this is
    /// a breaking change.
    /// 
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
    ///     var example = new Okta.UserBaseSchemaProperty("example", new()
    ///     {
    ///         Index = "firstName",
    ///         Title = "First name",
    ///         Type = "string",
    ///         Required = true,
    ///         Master = "OKTA",
    ///         UserType = exampleOktaUserType.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ### User schema property of default user type can be imported via the property index.
    /// 
    /// ```sh
    /// $ pulumi import okta:index/userBaseSchemaProperty:UserBaseSchemaProperty example &lt;property_name&gt;
    /// ```
    /// 
    /// ### User schema property of custom user type can be imported via user type id and property index
    /// 
    /// ```sh
    /// $ pulumi import okta:index/userBaseSchemaProperty:UserBaseSchemaProperty example &lt;user_type_id&gt;.&lt;property name&gt;
    /// ```
    /// </summary>
    [OktaResourceType("okta:index/userBaseSchemaProperty:UserBaseSchemaProperty")]
    public partial class UserBaseSchemaProperty : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Subschema unique string identifier
        /// </summary>
        [Output("index")]
        public Output<string> Index { get; private set; } = null!;

        /// <summary>
        /// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
        /// </summary>
        [Output("master")]
        public Output<string?> Master { get; private set; } = null!;

        /// <summary>
        /// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
        /// </summary>
        [Output("pattern")]
        public Output<string?> Pattern { get; private set; } = null!;

        /// <summary>
        /// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
        /// </summary>
        [Output("permissions")]
        public Output<string?> Permissions { get; private set; } = null!;

        /// <summary>
        /// Whether the subschema is required
        /// </summary>
        [Output("required")]
        public Output<bool?> Required { get; private set; } = null!;

        /// <summary>
        /// Subschema title (display name)
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// User type ID. By default, it is `default`
        /// </summary>
        [Output("userType")]
        public Output<string?> UserType { get; private set; } = null!;


        /// <summary>
        /// Create a UserBaseSchemaProperty resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserBaseSchemaProperty(string name, UserBaseSchemaPropertyArgs args, CustomResourceOptions? options = null)
            : base("okta:index/userBaseSchemaProperty:UserBaseSchemaProperty", name, args ?? new UserBaseSchemaPropertyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserBaseSchemaProperty(string name, Input<string> id, UserBaseSchemaPropertyState? state = null, CustomResourceOptions? options = null)
            : base("okta:index/userBaseSchemaProperty:UserBaseSchemaProperty", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserBaseSchemaProperty resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserBaseSchemaProperty Get(string name, Input<string> id, UserBaseSchemaPropertyState? state = null, CustomResourceOptions? options = null)
        {
            return new UserBaseSchemaProperty(name, id, state, options);
        }
    }

    public sealed class UserBaseSchemaPropertyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Subschema unique string identifier
        /// </summary>
        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        /// <summary>
        /// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
        /// </summary>
        [Input("master")]
        public Input<string>? Master { get; set; }

        /// <summary>
        /// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        /// <summary>
        /// Whether the subschema is required
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        /// <summary>
        /// Subschema title (display name)
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// User type ID. By default, it is `default`
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public UserBaseSchemaPropertyArgs()
        {
        }
        public static new UserBaseSchemaPropertyArgs Empty => new UserBaseSchemaPropertyArgs();
    }

    public sealed class UserBaseSchemaPropertyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Subschema unique string identifier
        /// </summary>
        [Input("index")]
        public Input<string>? Index { get; set; }

        /// <summary>
        /// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
        /// </summary>
        [Input("master")]
        public Input<string>? Master { get; set; }

        /// <summary>
        /// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        /// <summary>
        /// Whether the subschema is required
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        /// <summary>
        /// Subschema title (display name)
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// User type ID. By default, it is `default`
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public UserBaseSchemaPropertyState()
        {
        }
        public static new UserBaseSchemaPropertyState Empty => new UserBaseSchemaPropertyState();
    }
}
