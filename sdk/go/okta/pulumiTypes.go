// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type EventHookAuth struct {
	// Key to use for authentication, usually the header name, for example `"Authorization"`.
	Key string `pulumi:"key"`
	// The type of hook to trigger. Currently only `"HTTP"` is supported.
	Type string `pulumi:"type"`
	// Authentication secret.
	Value string `pulumi:"value"`
}

// EventHookAuthInput is an input type that accepts EventHookAuthArgs and EventHookAuthOutput values.
// You can construct a concrete instance of `EventHookAuthInput` via:
//
//          EventHookAuthArgs{...}
type EventHookAuthInput interface {
	pulumi.Input

	ToEventHookAuthOutput() EventHookAuthOutput
	ToEventHookAuthOutputWithContext(context.Context) EventHookAuthOutput
}

type EventHookAuthArgs struct {
	// Key to use for authentication, usually the header name, for example `"Authorization"`.
	Key pulumi.StringInput `pulumi:"key"`
	// The type of hook to trigger. Currently only `"HTTP"` is supported.
	Type pulumi.StringInput `pulumi:"type"`
	// Authentication secret.
	Value pulumi.StringInput `pulumi:"value"`
}

func (EventHookAuthArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookAuth)(nil)).Elem()
}

func (i EventHookAuthArgs) ToEventHookAuthOutput() EventHookAuthOutput {
	return i.ToEventHookAuthOutputWithContext(context.Background())
}

func (i EventHookAuthArgs) ToEventHookAuthOutputWithContext(ctx context.Context) EventHookAuthOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookAuthOutput)
}

func (i EventHookAuthArgs) ToEventHookAuthPtrOutput() EventHookAuthPtrOutput {
	return i.ToEventHookAuthPtrOutputWithContext(context.Background())
}

func (i EventHookAuthArgs) ToEventHookAuthPtrOutputWithContext(ctx context.Context) EventHookAuthPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookAuthOutput).ToEventHookAuthPtrOutputWithContext(ctx)
}

// EventHookAuthPtrInput is an input type that accepts EventHookAuthArgs, EventHookAuthPtr and EventHookAuthPtrOutput values.
// You can construct a concrete instance of `EventHookAuthPtrInput` via:
//
//          EventHookAuthArgs{...}
//
//  or:
//
//          nil
type EventHookAuthPtrInput interface {
	pulumi.Input

	ToEventHookAuthPtrOutput() EventHookAuthPtrOutput
	ToEventHookAuthPtrOutputWithContext(context.Context) EventHookAuthPtrOutput
}

type eventHookAuthPtrType EventHookAuthArgs

func EventHookAuthPtr(v *EventHookAuthArgs) EventHookAuthPtrInput {
	return (*eventHookAuthPtrType)(v)
}

func (*eventHookAuthPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHookAuth)(nil)).Elem()
}

func (i *eventHookAuthPtrType) ToEventHookAuthPtrOutput() EventHookAuthPtrOutput {
	return i.ToEventHookAuthPtrOutputWithContext(context.Background())
}

func (i *eventHookAuthPtrType) ToEventHookAuthPtrOutputWithContext(ctx context.Context) EventHookAuthPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookAuthPtrOutput)
}

type EventHookAuthOutput struct{ *pulumi.OutputState }

func (EventHookAuthOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookAuth)(nil)).Elem()
}

func (o EventHookAuthOutput) ToEventHookAuthOutput() EventHookAuthOutput {
	return o
}

func (o EventHookAuthOutput) ToEventHookAuthOutputWithContext(ctx context.Context) EventHookAuthOutput {
	return o
}

func (o EventHookAuthOutput) ToEventHookAuthPtrOutput() EventHookAuthPtrOutput {
	return o.ToEventHookAuthPtrOutputWithContext(context.Background())
}

func (o EventHookAuthOutput) ToEventHookAuthPtrOutputWithContext(ctx context.Context) EventHookAuthPtrOutput {
	return o.ApplyT(func(v EventHookAuth) *EventHookAuth {
		return &v
	}).(EventHookAuthPtrOutput)
}

// Key to use for authentication, usually the header name, for example `"Authorization"`.
func (o EventHookAuthOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookAuth) string { return v.Key }).(pulumi.StringOutput)
}

// The type of hook to trigger. Currently only `"HTTP"` is supported.
func (o EventHookAuthOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookAuth) string { return v.Type }).(pulumi.StringOutput)
}

// Authentication secret.
func (o EventHookAuthOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookAuth) string { return v.Value }).(pulumi.StringOutput)
}

type EventHookAuthPtrOutput struct{ *pulumi.OutputState }

func (EventHookAuthPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHookAuth)(nil)).Elem()
}

func (o EventHookAuthPtrOutput) ToEventHookAuthPtrOutput() EventHookAuthPtrOutput {
	return o
}

func (o EventHookAuthPtrOutput) ToEventHookAuthPtrOutputWithContext(ctx context.Context) EventHookAuthPtrOutput {
	return o
}

func (o EventHookAuthPtrOutput) Elem() EventHookAuthOutput {
	return o.ApplyT(func(v *EventHookAuth) EventHookAuth { return *v }).(EventHookAuthOutput)
}

// Key to use for authentication, usually the header name, for example `"Authorization"`.
func (o EventHookAuthPtrOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookAuth) *string {
		if v == nil {
			return nil
		}
		return &v.Key
	}).(pulumi.StringPtrOutput)
}

// The type of hook to trigger. Currently only `"HTTP"` is supported.
func (o EventHookAuthPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookAuth) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

// Authentication secret.
func (o EventHookAuthPtrOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookAuth) *string {
		if v == nil {
			return nil
		}
		return &v.Value
	}).(pulumi.StringPtrOutput)
}

type EventHookChannel struct {
	// The type of hook to trigger. Currently only `"HTTP"` is supported.
	Type string `pulumi:"type"`
	// The URI the hook will hit.
	Uri string `pulumi:"uri"`
	// The version of the channel. Currently only `"1.0.0"` is supported.
	Version string `pulumi:"version"`
}

// EventHookChannelInput is an input type that accepts EventHookChannelArgs and EventHookChannelOutput values.
// You can construct a concrete instance of `EventHookChannelInput` via:
//
//          EventHookChannelArgs{...}
type EventHookChannelInput interface {
	pulumi.Input

	ToEventHookChannelOutput() EventHookChannelOutput
	ToEventHookChannelOutputWithContext(context.Context) EventHookChannelOutput
}

type EventHookChannelArgs struct {
	// The type of hook to trigger. Currently only `"HTTP"` is supported.
	Type pulumi.StringInput `pulumi:"type"`
	// The URI the hook will hit.
	Uri pulumi.StringInput `pulumi:"uri"`
	// The version of the channel. Currently only `"1.0.0"` is supported.
	Version pulumi.StringInput `pulumi:"version"`
}

func (EventHookChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookChannel)(nil)).Elem()
}

func (i EventHookChannelArgs) ToEventHookChannelOutput() EventHookChannelOutput {
	return i.ToEventHookChannelOutputWithContext(context.Background())
}

func (i EventHookChannelArgs) ToEventHookChannelOutputWithContext(ctx context.Context) EventHookChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookChannelOutput)
}

func (i EventHookChannelArgs) ToEventHookChannelPtrOutput() EventHookChannelPtrOutput {
	return i.ToEventHookChannelPtrOutputWithContext(context.Background())
}

func (i EventHookChannelArgs) ToEventHookChannelPtrOutputWithContext(ctx context.Context) EventHookChannelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookChannelOutput).ToEventHookChannelPtrOutputWithContext(ctx)
}

// EventHookChannelPtrInput is an input type that accepts EventHookChannelArgs, EventHookChannelPtr and EventHookChannelPtrOutput values.
// You can construct a concrete instance of `EventHookChannelPtrInput` via:
//
//          EventHookChannelArgs{...}
//
//  or:
//
//          nil
type EventHookChannelPtrInput interface {
	pulumi.Input

	ToEventHookChannelPtrOutput() EventHookChannelPtrOutput
	ToEventHookChannelPtrOutputWithContext(context.Context) EventHookChannelPtrOutput
}

type eventHookChannelPtrType EventHookChannelArgs

func EventHookChannelPtr(v *EventHookChannelArgs) EventHookChannelPtrInput {
	return (*eventHookChannelPtrType)(v)
}

func (*eventHookChannelPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHookChannel)(nil)).Elem()
}

func (i *eventHookChannelPtrType) ToEventHookChannelPtrOutput() EventHookChannelPtrOutput {
	return i.ToEventHookChannelPtrOutputWithContext(context.Background())
}

func (i *eventHookChannelPtrType) ToEventHookChannelPtrOutputWithContext(ctx context.Context) EventHookChannelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookChannelPtrOutput)
}

type EventHookChannelOutput struct{ *pulumi.OutputState }

func (EventHookChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookChannel)(nil)).Elem()
}

func (o EventHookChannelOutput) ToEventHookChannelOutput() EventHookChannelOutput {
	return o
}

func (o EventHookChannelOutput) ToEventHookChannelOutputWithContext(ctx context.Context) EventHookChannelOutput {
	return o
}

func (o EventHookChannelOutput) ToEventHookChannelPtrOutput() EventHookChannelPtrOutput {
	return o.ToEventHookChannelPtrOutputWithContext(context.Background())
}

func (o EventHookChannelOutput) ToEventHookChannelPtrOutputWithContext(ctx context.Context) EventHookChannelPtrOutput {
	return o.ApplyT(func(v EventHookChannel) *EventHookChannel {
		return &v
	}).(EventHookChannelPtrOutput)
}

// The type of hook to trigger. Currently only `"HTTP"` is supported.
func (o EventHookChannelOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookChannel) string { return v.Type }).(pulumi.StringOutput)
}

// The URI the hook will hit.
func (o EventHookChannelOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookChannel) string { return v.Uri }).(pulumi.StringOutput)
}

// The version of the channel. Currently only `"1.0.0"` is supported.
func (o EventHookChannelOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v EventHookChannel) string { return v.Version }).(pulumi.StringOutput)
}

type EventHookChannelPtrOutput struct{ *pulumi.OutputState }

func (EventHookChannelPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHookChannel)(nil)).Elem()
}

func (o EventHookChannelPtrOutput) ToEventHookChannelPtrOutput() EventHookChannelPtrOutput {
	return o
}

func (o EventHookChannelPtrOutput) ToEventHookChannelPtrOutputWithContext(ctx context.Context) EventHookChannelPtrOutput {
	return o
}

func (o EventHookChannelPtrOutput) Elem() EventHookChannelOutput {
	return o.ApplyT(func(v *EventHookChannel) EventHookChannel { return *v }).(EventHookChannelOutput)
}

// The type of hook to trigger. Currently only `"HTTP"` is supported.
func (o EventHookChannelPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookChannel) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

// The URI the hook will hit.
func (o EventHookChannelPtrOutput) Uri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookChannel) *string {
		if v == nil {
			return nil
		}
		return &v.Uri
	}).(pulumi.StringPtrOutput)
}

// The version of the channel. Currently only `"1.0.0"` is supported.
func (o EventHookChannelPtrOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventHookChannel) *string {
		if v == nil {
			return nil
		}
		return &v.Version
	}).(pulumi.StringPtrOutput)
}

type EventHookHeader struct {
	// Key to use for authentication, usually the header name, for example `"Authorization"`.
	Key *string `pulumi:"key"`
	// Authentication secret.
	Value *string `pulumi:"value"`
}

// EventHookHeaderInput is an input type that accepts EventHookHeaderArgs and EventHookHeaderOutput values.
// You can construct a concrete instance of `EventHookHeaderInput` via:
//
//          EventHookHeaderArgs{...}
type EventHookHeaderInput interface {
	pulumi.Input

	ToEventHookHeaderOutput() EventHookHeaderOutput
	ToEventHookHeaderOutputWithContext(context.Context) EventHookHeaderOutput
}

type EventHookHeaderArgs struct {
	// Key to use for authentication, usually the header name, for example `"Authorization"`.
	Key pulumi.StringPtrInput `pulumi:"key"`
	// Authentication secret.
	Value pulumi.StringPtrInput `pulumi:"value"`
}

func (EventHookHeaderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookHeader)(nil)).Elem()
}

func (i EventHookHeaderArgs) ToEventHookHeaderOutput() EventHookHeaderOutput {
	return i.ToEventHookHeaderOutputWithContext(context.Background())
}

func (i EventHookHeaderArgs) ToEventHookHeaderOutputWithContext(ctx context.Context) EventHookHeaderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookHeaderOutput)
}

// EventHookHeaderArrayInput is an input type that accepts EventHookHeaderArray and EventHookHeaderArrayOutput values.
// You can construct a concrete instance of `EventHookHeaderArrayInput` via:
//
//          EventHookHeaderArray{ EventHookHeaderArgs{...} }
type EventHookHeaderArrayInput interface {
	pulumi.Input

	ToEventHookHeaderArrayOutput() EventHookHeaderArrayOutput
	ToEventHookHeaderArrayOutputWithContext(context.Context) EventHookHeaderArrayOutput
}

type EventHookHeaderArray []EventHookHeaderInput

func (EventHookHeaderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EventHookHeader)(nil)).Elem()
}

func (i EventHookHeaderArray) ToEventHookHeaderArrayOutput() EventHookHeaderArrayOutput {
	return i.ToEventHookHeaderArrayOutputWithContext(context.Background())
}

func (i EventHookHeaderArray) ToEventHookHeaderArrayOutputWithContext(ctx context.Context) EventHookHeaderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHookHeaderArrayOutput)
}

type EventHookHeaderOutput struct{ *pulumi.OutputState }

func (EventHookHeaderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventHookHeader)(nil)).Elem()
}

func (o EventHookHeaderOutput) ToEventHookHeaderOutput() EventHookHeaderOutput {
	return o
}

func (o EventHookHeaderOutput) ToEventHookHeaderOutputWithContext(ctx context.Context) EventHookHeaderOutput {
	return o
}

// Key to use for authentication, usually the header name, for example `"Authorization"`.
func (o EventHookHeaderOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v EventHookHeader) *string { return v.Key }).(pulumi.StringPtrOutput)
}

// Authentication secret.
func (o EventHookHeaderOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v EventHookHeader) *string { return v.Value }).(pulumi.StringPtrOutput)
}

type EventHookHeaderArrayOutput struct{ *pulumi.OutputState }

func (EventHookHeaderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EventHookHeader)(nil)).Elem()
}

func (o EventHookHeaderArrayOutput) ToEventHookHeaderArrayOutput() EventHookHeaderArrayOutput {
	return o
}

func (o EventHookHeaderArrayOutput) ToEventHookHeaderArrayOutputWithContext(ctx context.Context) EventHookHeaderArrayOutput {
	return o
}

func (o EventHookHeaderArrayOutput) Index(i pulumi.IntInput) EventHookHeaderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EventHookHeader {
		return vs[0].([]EventHookHeader)[vs[1].(int)]
	}).(EventHookHeaderOutput)
}

type TemplateSmsTranslation struct {
	// The language to map the template to.
	Language string `pulumi:"language"`
	// The SMS message.
	Template string `pulumi:"template"`
}

// TemplateSmsTranslationInput is an input type that accepts TemplateSmsTranslationArgs and TemplateSmsTranslationOutput values.
// You can construct a concrete instance of `TemplateSmsTranslationInput` via:
//
//          TemplateSmsTranslationArgs{...}
type TemplateSmsTranslationInput interface {
	pulumi.Input

	ToTemplateSmsTranslationOutput() TemplateSmsTranslationOutput
	ToTemplateSmsTranslationOutputWithContext(context.Context) TemplateSmsTranslationOutput
}

type TemplateSmsTranslationArgs struct {
	// The language to map the template to.
	Language pulumi.StringInput `pulumi:"language"`
	// The SMS message.
	Template pulumi.StringInput `pulumi:"template"`
}

func (TemplateSmsTranslationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*TemplateSmsTranslation)(nil)).Elem()
}

func (i TemplateSmsTranslationArgs) ToTemplateSmsTranslationOutput() TemplateSmsTranslationOutput {
	return i.ToTemplateSmsTranslationOutputWithContext(context.Background())
}

func (i TemplateSmsTranslationArgs) ToTemplateSmsTranslationOutputWithContext(ctx context.Context) TemplateSmsTranslationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateSmsTranslationOutput)
}

// TemplateSmsTranslationArrayInput is an input type that accepts TemplateSmsTranslationArray and TemplateSmsTranslationArrayOutput values.
// You can construct a concrete instance of `TemplateSmsTranslationArrayInput` via:
//
//          TemplateSmsTranslationArray{ TemplateSmsTranslationArgs{...} }
type TemplateSmsTranslationArrayInput interface {
	pulumi.Input

	ToTemplateSmsTranslationArrayOutput() TemplateSmsTranslationArrayOutput
	ToTemplateSmsTranslationArrayOutputWithContext(context.Context) TemplateSmsTranslationArrayOutput
}

type TemplateSmsTranslationArray []TemplateSmsTranslationInput

func (TemplateSmsTranslationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TemplateSmsTranslation)(nil)).Elem()
}

func (i TemplateSmsTranslationArray) ToTemplateSmsTranslationArrayOutput() TemplateSmsTranslationArrayOutput {
	return i.ToTemplateSmsTranslationArrayOutputWithContext(context.Background())
}

func (i TemplateSmsTranslationArray) ToTemplateSmsTranslationArrayOutputWithContext(ctx context.Context) TemplateSmsTranslationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateSmsTranslationArrayOutput)
}

type TemplateSmsTranslationOutput struct{ *pulumi.OutputState }

func (TemplateSmsTranslationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TemplateSmsTranslation)(nil)).Elem()
}

func (o TemplateSmsTranslationOutput) ToTemplateSmsTranslationOutput() TemplateSmsTranslationOutput {
	return o
}

func (o TemplateSmsTranslationOutput) ToTemplateSmsTranslationOutputWithContext(ctx context.Context) TemplateSmsTranslationOutput {
	return o
}

// The language to map the template to.
func (o TemplateSmsTranslationOutput) Language() pulumi.StringOutput {
	return o.ApplyT(func(v TemplateSmsTranslation) string { return v.Language }).(pulumi.StringOutput)
}

// The SMS message.
func (o TemplateSmsTranslationOutput) Template() pulumi.StringOutput {
	return o.ApplyT(func(v TemplateSmsTranslation) string { return v.Template }).(pulumi.StringOutput)
}

type TemplateSmsTranslationArrayOutput struct{ *pulumi.OutputState }

func (TemplateSmsTranslationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TemplateSmsTranslation)(nil)).Elem()
}

func (o TemplateSmsTranslationArrayOutput) ToTemplateSmsTranslationArrayOutput() TemplateSmsTranslationArrayOutput {
	return o
}

func (o TemplateSmsTranslationArrayOutput) ToTemplateSmsTranslationArrayOutputWithContext(ctx context.Context) TemplateSmsTranslationArrayOutput {
	return o
}

func (o TemplateSmsTranslationArrayOutput) Index(i pulumi.IntInput) TemplateSmsTranslationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TemplateSmsTranslation {
		return vs[0].([]TemplateSmsTranslation)[vs[1].(int)]
	}).(TemplateSmsTranslationOutput)
}

func init() {
	pulumi.RegisterOutputType(EventHookAuthOutput{})
	pulumi.RegisterOutputType(EventHookAuthPtrOutput{})
	pulumi.RegisterOutputType(EventHookChannelOutput{})
	pulumi.RegisterOutputType(EventHookChannelPtrOutput{})
	pulumi.RegisterOutputType(EventHookHeaderOutput{})
	pulumi.RegisterOutputType(EventHookHeaderArrayOutput{})
	pulumi.RegisterOutputType(TemplateSmsTranslationOutput{})
	pulumi.RegisterOutputType(TemplateSmsTranslationArrayOutput{})
}