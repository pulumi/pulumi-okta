CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

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
