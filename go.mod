module github.com/pulumi/pulumi-okta

go 1.12

require (
	github.com/Azure/go-autorest/autorest/azure/auth v0.4.0 // indirect
	github.com/Azure/go-autorest/autorest/to v0.3.0 // indirect
	github.com/Azure/go-autorest/autorest/validation v0.2.0 // indirect
	github.com/articulate/terraform-provider-okta v1.0.1-0.20191121000300-cf25a358d866
	github.com/docker/docker v1.13.1 // indirect
	github.com/gliderlabs/ssh v0.1.3 // indirect
	github.com/hashicorp/terraform-plugin-sdk v1.2.0
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.2.0
	github.com/pulumi/pulumi-terraform-bridge v1.2.1-0.20191030115615-68f8d85120cb
	github.com/stretchr/testify v1.4.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/okta/okta-sdk-golang => github.com/articulate/okta-sdk-golang v1.1.1
)
