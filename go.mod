module github.com/pulumi/pulumi-okta

go 1.12

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/articulate/terraform-provider-okta v0.0.0-20190930134842-d975cafc7eb3
	github.com/hashicorp/terraform v0.12.8
	github.com/kr/pty v1.1.3 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v0.17.28-0.20190731182900-6804d640fc7c
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190924145130-e75e14d70f0f
	github.com/stretchr/testify v1.3.1-0.20190311161405-34c6fa2dc709
)

replace github.com/okta/okta-sdk-golang => github.com/articulate/okta-sdk-golang v1.1.1
