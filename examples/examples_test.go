// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func skipIfNoOktaTokens(t *testing.T) {
	token := os.Getenv("OKTA_API_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing OKTA_API_TOKEN variable")
	}
	baseUrl := os.Getenv("OKTA_BASE_URL")
	if baseUrl == "" {
		t.Skipf("Skipping test due to missing OKTA_BASE_URL variable")
	}
	orgName := os.Getenv("OKTA_ORG_NAME")
	if orgName == "" {
		t.Skipf("Skipping test due to missing OKTA_ORG_NAME variable")
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

