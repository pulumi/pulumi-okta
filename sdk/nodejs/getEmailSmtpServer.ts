// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getEmailSmtpServer(args: GetEmailSmtpServerArgs, opts?: pulumi.InvokeOptions): Promise<GetEmailSmtpServerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("okta:index/getEmailSmtpServer:getEmailSmtpServer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getEmailSmtpServer.
 */
export interface GetEmailSmtpServerArgs {
    id: string;
}

/**
 * A collection of values returned by getEmailSmtpServer.
 */
export interface GetEmailSmtpServerResult {
    readonly alias: string;
    readonly enabled: boolean;
    readonly host: string;
    readonly id: string;
    readonly port: number;
    readonly username: string;
}
export function getEmailSmtpServerOutput(args: GetEmailSmtpServerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEmailSmtpServerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("okta:index/getEmailSmtpServer:getEmailSmtpServer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getEmailSmtpServer.
 */
export interface GetEmailSmtpServerOutputArgs {
    id: pulumi.Input<string>;
}
