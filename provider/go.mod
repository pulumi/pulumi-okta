module github.com/pulumi/pulumi-okta/provider/v3

go 1.16

require (
	github.com/okta/terraform-provider-okta v0.0.0-20220311181230-23f7f59e9b66
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.20.0
	github.com/pulumi/pulumi/sdk/v3 v3.27.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20211019194827-62530c6537a4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
