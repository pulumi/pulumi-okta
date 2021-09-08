r[![Actions Status](https://github.com/pulumi/pulumi-okta/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-okta/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fokta.svg)](https://www.npmjs.com/package/@pulumi/okta)
[![Python version](https://badge.fury.io/py/pulumi-okta.svg)](https://pypi.org/project/pulumi-okta)
[![NuGet version](https://badge.fury.io/nu/pulumi.okta.svg)](https://badge.fury.io/nu/pulumi.okta)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-okta/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-okta/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-okta/blob/master/LICENSE)

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

    $ go get github.com/pulumi/pulumi-okta/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Okta

## Configuration

The following configuration points are available:

- `okta:orgName` - (Required) This is the org name of your Okta account, for example dev-123.oktapreview.com would have 
an org name of dev-123. May be set via the `OKTA_ORG_NAME` environment variable.
- `okta:baseUrl` - (Required) This is the domain of your Okta account, for example `dev-123.oktapreview.com` would have 
a base url of `oktapreview.com`. May be set via the `OKTA_BASE_URL` environment variable.
- `okta:apiToken` - (Required) This is the API token to interact with your Okta org. May be set via the `OKTA_API_TOKEN` 
environment variable.
- `okta:backoff` - (Optional)  Whether to use exponential back off strategy for rate limits, the default is `true`.
- `okta:maxRetries` - (Optional) Maximum number of retries to attempt before returning an error, the default is `5`.
- `okta:maxWaitSeconds` - (Optional) Maximum seconds to wait when rate limit is hit, the default is `300`.
- `okta:minWaitSeconds` - (Optional) Minimum seconds to wait when rate limit is hit, the default is `30`.

## Reference

For further information, please visit [the Okta provider docs](https://www.pulumi.com/docs/intro/cloud-providers/okta) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/okta).
