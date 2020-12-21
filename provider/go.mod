module github.com/pulumi/pulumi-okta/provider/v2

go 1.14

require (
	github.com/oktadeveloper/terraform-provider-okta v0.0.0-20201217154016-655f869f8157
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.17.1-0.20201219002337-a0c25bd3e147
	github.com/pulumi/pulumi/sdk/v2 v2.15.1-0.20201202214525-260620430c4c
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
