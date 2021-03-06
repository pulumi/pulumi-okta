// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./baseSchema";
export * from "./getUser";
export * from "./getUserProfileMappingSource";
export * from "./getUserType";
export * from "./getUsers";
export * from "./schema";
export * from "./user";
export * from "./userType";

// Import resources to register:
import { BaseSchema } from "./baseSchema";
import { Schema } from "./schema";
import { User } from "./user";
import { UserType } from "./userType";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "okta:user/baseSchema:BaseSchema":
                return new BaseSchema(name, <any>undefined, { urn })
            case "okta:user/schema:Schema":
                return new Schema(name, <any>undefined, { urn })
            case "okta:user/user:User":
                return new User(name, <any>undefined, { urn })
            case "okta:user/userType:UserType":
                return new UserType(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("okta", "user/baseSchema", _module)
pulumi.runtime.registerResourceModule("okta", "user/schema", _module)
pulumi.runtime.registerResourceModule("okta", "user/user", _module)
pulumi.runtime.registerResourceModule("okta", "user/userType", _module)
