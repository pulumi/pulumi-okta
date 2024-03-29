// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Inputs
{

    public sealed class RuleIdpDiscoveryPlatformIncludeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only available when using `os_type = "OTHER"`
        /// </summary>
        [Input("osExpression")]
        public Input<string>? OsExpression { get; set; }

        /// <summary>
        /// One of: `"ANY"`, `"IOS"`, `"WINDOWS"`, `"ANDROID"`, `"OTHER"`, `"OSX"`
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        /// <summary>
        /// One of: `"ANY"`, `"MOBILE"`, `"DESKTOP"`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RuleIdpDiscoveryPlatformIncludeGetArgs()
        {
        }
        public static new RuleIdpDiscoveryPlatformIncludeGetArgs Empty => new RuleIdpDiscoveryPlatformIncludeGetArgs();
    }
}
