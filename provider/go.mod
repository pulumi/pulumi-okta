module github.com/pulumi/pulumi-okta/provider/v2

go 1.14

require (
	github.com/articulate/terraform-provider-okta v1.0.1-0.20191121000300-cf25a358d866
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.2
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200821035132-629254334213
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/okta/okta-sdk-golang => github.com/articulate/okta-sdk-golang v1.1.1
)
