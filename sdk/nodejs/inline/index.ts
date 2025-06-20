// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { HookArgs, HookState } from "./hook";
export type Hook = import("./hook").Hook;
export const Hook: typeof import("./hook").Hook = null as any;
utilities.lazyLoad(exports, ["Hook"], () => require("./hook"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "okta:inline/hook:Hook":
                return new Hook(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("okta", "inline/hook", _module)
