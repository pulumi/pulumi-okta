module github.com/pulumi/pulumi-okta/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/oktadeveloper/terraform-provider-okta v0.0.0-20201029224535-9ed9da02e8b3
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.12.1
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
