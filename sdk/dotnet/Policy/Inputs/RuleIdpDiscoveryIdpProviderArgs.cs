// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Policy.Inputs
{

    public sealed class RuleIdpDiscoveryIdpProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for the Idp the rule should route to if all conditions are met.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Type of IdP. One of: `AMAZON`, `APPLE`, `DISCORD`, `FACEBOOK`, `GITHUB`, `GITLAB`, `GOOGLE`, `IDV_CLEAR`, `IDV_INCODE`, `IDV_PERSONA`, `LINKEDIN`, `LOGINGOV`, `LOGINGOV_SANDBOX`, `MICROSOFT`, `OIDC`, `PAYPAL`, `PAYPAL_SANDBOX`, `SALESFORCE`, `SAML2`, `SPOTIFY`, `X509`, `XERO`, `YAHOO`, `YAHOOJP`, Default: `OKTA`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RuleIdpDiscoveryIdpProviderArgs()
        {
        }
        public static new RuleIdpDiscoveryIdpProviderArgs Empty => new RuleIdpDiscoveryIdpProviderArgs();
    }
}
