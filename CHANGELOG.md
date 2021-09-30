CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v3.13.13 of the Okta Terraform Provider

---

## 3.2.1 (2021-09-27)
* Upgrade to v3.13.11 of the Okta Terraform Provider

## 3.2.0 (2021-09-09)
* Upgrade to v3.13.8 of the Okta Terraform Provider
* Upgrade to pulumi-terraform-bridge v3.5.0
* Upgrade to Pulumi v3.11.0

## 3.1.2 (2021-09-01)
* Upgrade to v3.13.7 of the Okta Terraform Provider

## 3.1.1 (2021-08-19)
* Upgrade to v3.13.5 of the Okta Terraform Provider

## 3.1.0 (2021-08-09)
* Upgrade to v3.13.1 of the Okta Terraform Provider

## 3.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.14.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.13.0 (2021-04-05)
* Upgrade to v3.11.0 of the Okta Terraform Provider

## 2.12.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.12.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binaryc

## 2.11.1 (2021-03-10)
* Upgrade to v3.10.1 of the Okta Terraform Provider

## 2.11.0 (2021-02-19)
* Upgrade to v3.10.0 of the Okta Terraform Provider

## 2.10.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.10.0 (2021-02-15)
* Upgrade to v3.9.0 of the Okta Terraform Provider

## 2.9.0 (2021-02-03)
* Upgrade to v3.8.0 of the Okta Terraform Provider

## 2.8.0 (2021-01-29)
* Upgrading pulumi-terraform-bridge to v2.18.0

## 2.7.1 (2020-12-30)
* Upgrade to v3.7.4 of the Okta Terraform Provider

## 2.7.0 (2020-12-21)
* Upgrade to v3.7.2 of the Okta Terraform Provider
* Upgrade to v2.16.0 of pulumi-terraform-bridge which includes
  * Bug fix: Correcting an issue where replacements were not being correctly identified and leading to panics.
  * Bug fix: Corrects a panic caused by reading sets with partially-known elements.
  * Preserve unknowns during provider preview

## 2.6.3 (2020-12-04)
* Upgrade to v3.6.1 of the Okta Terraform Provider

## 2.6.2 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.6.1 (2020-11-09)
* Upgrade to pulumi-terraform-bridge v2.12.1

## 2.6.0 (2020-11-03)
* Upgrade to v3.6.0 of the Okta Terraform Provider

## 2.5.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.4.2 (2020-10-12)
* Upgrade to v3.5.1 of the Okta Terraform Provider

## 2.4.1 (2020-10-12)
* Deprecate `auth.ServerPolicyClaim` in favour of `auth.ServerPolicyRule`

## 2.4.0 (2020-10-09)
* Upgrade to v3.5.0 of the Okta Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 2.3.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.2.0 (2020-08-06)
* Upgrade to Pulumi SDK v2.7.1
* Upgrade to pulumi-terraform-bridge v2.6.0

## 2.1.3 (2020-06-11)
* Switch to GitHub actions for build

## 2.1.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.1.1

## 2.1.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-17)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.6.0 (2020-04-14)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Refactor layout to support Go modules

## 1.5.0 (2020-03-23)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.4.0 (2020-01-29)
* Namespace names in .NET SDK are adjusted to PascalCase
([#8](https://github.com/pulumi/pulumi-okta/pull/8)).
* Upgrade to pulumi-terraform-bridge v1.6.4

## 1.3.0 (2019-12-04)
* Upgrade to support go 1.13.x
* Upgrade to v3.0.38 of the Okta Terraform Provider
* Upgrade to pulumi-terraform-bridge v1.4.3

## 1.2.0 (2019-11-15)
* Add support for DotNet SDK Generation

## 1.1.0 (2019-10-29)
* Upgrade to v3.0.30 of the Okta Terraform Provider.

## 1.0.0 (2019-10-29)
* Initial release of the provider
