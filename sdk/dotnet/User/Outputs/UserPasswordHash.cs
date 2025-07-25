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
    public sealed class UserPasswordHash
    {
        /// <summary>
        /// The algorithm used to generate the hash using the password
        /// </summary>
        public readonly string Algorithm;
        /// <summary>
        /// Only required for salted hashes
        /// </summary>
        public readonly string? Salt;
        /// <summary>
        /// Specifies whether salt was pre- or postfixed to the password before hashing
        /// </summary>
        public readonly string? SaltOrder;
        /// <summary>
        /// For SHA-512, SHA-256, SHA-1, MD5, This is the actual base64-encoded hash of the password (and salt, if used). This is the Base64 encoded value of the SHA-512/SHA-256/SHA-1/MD5 digest that was computed by either pre-fixing or post-fixing the salt to the password, depending on the saltOrder. If a salt was not used in the source system, then this should just be the the Base64 encoded value of the password's SHA-512/SHA-256/SHA-1/MD5 digest. For BCRYPT, This is the actual radix64-encoded hashed password.
        /// </summary>
        public readonly string Value;
        /// <summary>
        /// Governs the strength of the hash and the time required to compute it. Only required for BCRYPT algorithm
        /// </summary>
        public readonly int? WorkFactor;

        [OutputConstructor]
        private UserPasswordHash(
            string algorithm,

            string? salt,

            string? saltOrder,

            string value,

            int? workFactor)
        {
            Algorithm = algorithm;
            Salt = salt;
            SaltOrder = saltOrder;
            Value = value;
            WorkFactor = workFactor;
        }
    }
}
