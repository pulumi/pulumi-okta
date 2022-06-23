module github.com/pulumi/pulumi-okta/provider/v3

go 1.16

require (
	github.com/okta/terraform-provider-okta v0.0.0-20220610194640-bfdd92a048fa
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.25.1
	github.com/pulumi/pulumi/sdk/v3 v3.35.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/okta/terraform-provider-okta => github.com/pulumi/terraform-provider-okta v0.0.0-20220609121752-807d30d7cab9
)
