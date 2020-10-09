module github.com/pulumi/pulumi-okta/provider/v2

go 1.14

require (
	github.com/go-yaml/yaml v2.1.0+incompatible // indirect
	github.com/hashicorp/terraform-plugin-sdk v1.9.0
	github.com/oktadeveloper/terraform-provider-okta v0.0.0-00010101000000-000000000000
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.8.0
	github.com/pulumi/pulumi/sdk/v2 v2.10.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/oktadeveloper/terraform-provider-okta => github.com/pulumi/terraform-provider-okta v0.0.0-20201009130241-f89f52201df7
	github.com/okta/okta-sdk-golang => github.com/articulate/okta-sdk-golang v1.1.1
)
