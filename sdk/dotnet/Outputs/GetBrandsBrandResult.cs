// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Okta.Outputs
{

    [OutputType]
    public sealed class GetBrandsBrandResult
    {
        /// <summary>
        /// Custom privacy policy URL
        /// </summary>
        public readonly string CustomPrivacyPolicyUrl;
        /// <summary>
        /// The ID of the Brand
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Link relations for this object - JSON HAL - Discoverable resources related to the brand
        /// </summary>
        public readonly string Links;
        /// <summary>
        /// Brand name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Removes "Powered by Okta" from the Okta-hosted sign-in page and "© 2021 Okta, Inc." from the Okta End-User Dashboard
        /// </summary>
        public readonly bool RemovePoweredByOkta;

        [OutputConstructor]
        private GetBrandsBrandResult(
            string customPrivacyPolicyUrl,

            string id,

            string links,

            string name,

            bool removePoweredByOkta)
        {
            CustomPrivacyPolicyUrl = customPrivacyPolicyUrl;
            Id = id;
            Links = links;
            Name = name;
            RemovePoweredByOkta = removePoweredByOkta;
        }
    }
}
