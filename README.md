[![Build Status](https://travis-ci.com/pulumi/pulumi-okta.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-okta)

# Okta Resource Provider

The Okta resource provider for Pulumi lets you manage Okta resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/okta

or `yarn`:

    $ yarn add @pulumi/okta

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_okta

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-okta/sdk/go/...

## Configuration

The following configuration points are available:

- `okta:orgName` - (Required) This is the org name of your Okta account, for example dev-123.oktapreview.com would have 
an org name of dev-123. May be set via the `OKTA_ORG_NAME` environment variable.
- `okta:baseUrl` - (Required) This is the domain of your Okta account, for example `dev-123.oktapreview.com` would have 
a base url of `oktapreview.com`. May be set via the `OKTA_BASE_URL` environment variable.
- `okta:apiKey` - (Required) This is the API token to interact with your Okta org. May be set via the `OKTA_API_TOKEN` 
environment variable.
- `okta:backoff` - (Optional)  Whether to use exponential back off strategy for rate limits, the default is `true`.
- `okta:maxRetries` - (Optional) Maximum number of retries to attempt before returning an error, the default is `5`.
- `okta:maxWaitSeconds` - (Optional) Maximum seconds to wait when rate limit is hit, the default is `300`.
- `okta:minWaitSeconds` - (Optional) Minimum seconds to wait when rate limit is hit, the default is `30`.

## Reference

For detailed reference documentation, please visit [the API docs](https://pulumi.io/reference/pkg/nodejs/@pulumi/okta/index.html).
