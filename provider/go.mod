module github.com/pulumi/pulumi-okta/provider/v3

go 1.16

require (
	github.com/okta/terraform-provider-okta v0.0.0-20210923171831-5518b4d2fc48
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.5.0
	github.com/pulumi/pulumi/pkg/v3 v3.11.0 // indirect
	github.com/pulumi/pulumi/sdk/v3 v3.11.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
