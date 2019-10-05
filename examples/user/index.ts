// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import * as okta from "@pulumi/okta";
import * as random from "@pulumi/random";
import * as pulumi from "@pulumi/pulumi";

const userFirstName = new random.RandomPet("random-first-name");
const userLastName = new random.RandomPet("random-last-name");

const randomString = new random.RandomString("random", {
    length: 6,
    special: false,
});

const user = new okta.user.User("example-user", {
    email: pulumi.interpolate`${randomString.result}@pulumi.com`,
    login: pulumi.interpolate`${randomString.result}@pulumi.com`,
    firstName: userFirstName.id,
    lastName: userLastName.id,
});

export const userId = user.id;

