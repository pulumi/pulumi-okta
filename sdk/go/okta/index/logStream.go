// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package index

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an Okta Log Stream.
//
// This resource allows you to create and configure an Okta Log Stream.
//
// ## Example Usage
//
// ### Splunk Event Collector
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/Index"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Index.NewLogStream(ctx, "example", &Index.LogStreamArgs{
//				Settings: &index.LogStreamSettingsArgs{
//					Edition: pulumi.String("gcp"),
//					Host:    pulumi.String("acme.splunkcloud.com"),
//					Token:   pulumi.String("YOUR_HEC_TOKEN"),
//				},
//				Status: pulumi.String("ACTIVE"),
//				Type:   pulumi.String("splunk_cloud_logstreaming"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Okta Log Stream can be imported via the Okta ID.
//
// ```sh
// $ pulumi import okta:Index/logStream:LogStream example &#60;strema id&#62;
// ```
type LogStream struct {
	pulumi.CustomResourceState

	// Name of the Log Stream Resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Stream provider specific configuration.
	Settings LogStreamSettingsPtrOutput `pulumi:"settings"`
	// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewLogStream registers a new resource with the given unique name, arguments, and options.
func NewLogStream(ctx *pulumi.Context,
	name string, args *LogStreamArgs, opts ...pulumi.ResourceOption) (*LogStream, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogStream
	err := ctx.RegisterResource("okta:Index/logStream:LogStream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogStream gets an existing LogStream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogStreamState, opts ...pulumi.ResourceOption) (*LogStream, error) {
	var resource LogStream
	err := ctx.ReadResource("okta:Index/logStream:LogStream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogStream resources.
type logStreamState struct {
	// Name of the Log Stream Resource.
	Name *string `pulumi:"name"`
	// Stream provider specific configuration.
	Settings *LogStreamSettings `pulumi:"settings"`
	// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
	Status *string `pulumi:"status"`
	// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
	Type *string `pulumi:"type"`
}

type LogStreamState struct {
	// Name of the Log Stream Resource.
	Name pulumi.StringPtrInput
	// Stream provider specific configuration.
	Settings LogStreamSettingsPtrInput
	// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
	Status pulumi.StringPtrInput
	// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
	Type pulumi.StringPtrInput
}

func (LogStreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*logStreamState)(nil)).Elem()
}

type logStreamArgs struct {
	// Name of the Log Stream Resource.
	Name *string `pulumi:"name"`
	// Stream provider specific configuration.
	Settings *LogStreamSettings `pulumi:"settings"`
	// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
	Status *string `pulumi:"status"`
	// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a LogStream resource.
type LogStreamArgs struct {
	// Name of the Log Stream Resource.
	Name pulumi.StringPtrInput
	// Stream provider specific configuration.
	Settings LogStreamSettingsPtrInput
	// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
	Status pulumi.StringPtrInput
	// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
	Type pulumi.StringInput
}

func (LogStreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logStreamArgs)(nil)).Elem()
}

type LogStreamInput interface {
	pulumi.Input

	ToLogStreamOutput() LogStreamOutput
	ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput
}

func (*LogStream) ElementType() reflect.Type {
	return reflect.TypeOf((**LogStream)(nil)).Elem()
}

func (i *LogStream) ToLogStreamOutput() LogStreamOutput {
	return i.ToLogStreamOutputWithContext(context.Background())
}

func (i *LogStream) ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamOutput)
}

// LogStreamArrayInput is an input type that accepts LogStreamArray and LogStreamArrayOutput values.
// You can construct a concrete instance of `LogStreamArrayInput` via:
//
//	LogStreamArray{ LogStreamArgs{...} }
type LogStreamArrayInput interface {
	pulumi.Input

	ToLogStreamArrayOutput() LogStreamArrayOutput
	ToLogStreamArrayOutputWithContext(context.Context) LogStreamArrayOutput
}

type LogStreamArray []LogStreamInput

func (LogStreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogStream)(nil)).Elem()
}

func (i LogStreamArray) ToLogStreamArrayOutput() LogStreamArrayOutput {
	return i.ToLogStreamArrayOutputWithContext(context.Background())
}

func (i LogStreamArray) ToLogStreamArrayOutputWithContext(ctx context.Context) LogStreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamArrayOutput)
}

// LogStreamMapInput is an input type that accepts LogStreamMap and LogStreamMapOutput values.
// You can construct a concrete instance of `LogStreamMapInput` via:
//
//	LogStreamMap{ "key": LogStreamArgs{...} }
type LogStreamMapInput interface {
	pulumi.Input

	ToLogStreamMapOutput() LogStreamMapOutput
	ToLogStreamMapOutputWithContext(context.Context) LogStreamMapOutput
}

type LogStreamMap map[string]LogStreamInput

func (LogStreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogStream)(nil)).Elem()
}

func (i LogStreamMap) ToLogStreamMapOutput() LogStreamMapOutput {
	return i.ToLogStreamMapOutputWithContext(context.Background())
}

func (i LogStreamMap) ToLogStreamMapOutputWithContext(ctx context.Context) LogStreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamMapOutput)
}

type LogStreamOutput struct{ *pulumi.OutputState }

func (LogStreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogStream)(nil)).Elem()
}

func (o LogStreamOutput) ToLogStreamOutput() LogStreamOutput {
	return o
}

func (o LogStreamOutput) ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput {
	return o
}

// Name of the Log Stream Resource.
func (o LogStreamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Stream provider specific configuration.
func (o LogStreamOutput) Settings() LogStreamSettingsPtrOutput {
	return o.ApplyT(func(v *LogStream) LogStreamSettingsPtrOutput { return v.Settings }).(LogStreamSettingsPtrOutput)
}

// Log Stream Status - can either be ACTIVE or INACTIVE only. Default is ACTIVE.
func (o LogStreamOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Type of the Log Stream - can either be `"awsEventbridge"` or `"splunkCloudLogstreaming"` only.
func (o LogStreamOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type LogStreamArrayOutput struct{ *pulumi.OutputState }

func (LogStreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogStream)(nil)).Elem()
}

func (o LogStreamArrayOutput) ToLogStreamArrayOutput() LogStreamArrayOutput {
	return o
}

func (o LogStreamArrayOutput) ToLogStreamArrayOutputWithContext(ctx context.Context) LogStreamArrayOutput {
	return o
}

func (o LogStreamArrayOutput) Index(i pulumi.IntInput) LogStreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogStream {
		return vs[0].([]*LogStream)[vs[1].(int)]
	}).(LogStreamOutput)
}

type LogStreamMapOutput struct{ *pulumi.OutputState }

func (LogStreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogStream)(nil)).Elem()
}

func (o LogStreamMapOutput) ToLogStreamMapOutput() LogStreamMapOutput {
	return o
}

func (o LogStreamMapOutput) ToLogStreamMapOutputWithContext(ctx context.Context) LogStreamMapOutput {
	return o
}

func (o LogStreamMapOutput) MapIndex(k pulumi.StringInput) LogStreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogStream {
		return vs[0].(map[string]*LogStream)[vs[1].(string)]
	}).(LogStreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamInput)(nil)).Elem(), &LogStream{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamArrayInput)(nil)).Elem(), LogStreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamMapInput)(nil)).Elem(), LogStreamMap{})
	pulumi.RegisterOutputType(LogStreamOutput{})
	pulumi.RegisterOutputType(LogStreamArrayOutput{})
	pulumi.RegisterOutputType(LogStreamMapOutput{})
}
