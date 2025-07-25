// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Application User Base Schema property. This resource allows you to configure a base app user schema property.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := okta.NewAppUserBaseSchemaProperty(ctx, "example", &okta.AppUserBaseSchemaPropertyArgs{
//				AppId:  pulumi.String("<app id>"),
//				Index:  pulumi.String("customPropertyName"),
//				Title:  pulumi.String("customPropertyName"),
//				Type:   pulumi.String("string"),
//				Master: pulumi.String("OKTA"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty example <app_id>/<property_name>
// ```
type AppUserBaseSchemaProperty struct {
	pulumi.CustomResourceState

	// The Application's ID the user schema property should be assigned to.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// Subschema unique string identifier
	Index pulumi.StringOutput `pulumi:"index"`
	// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
	Master pulumi.StringPtrOutput `pulumi:"master"`
	// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
	Pattern pulumi.StringPtrOutput `pulumi:"pattern"`
	// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
	Permissions pulumi.StringPtrOutput `pulumi:"permissions"`
	// Whether the subschema is required
	Required pulumi.BoolPtrOutput `pulumi:"required"`
	// Subschema title (display name)
	Title pulumi.StringOutput `pulumi:"title"`
	// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
	Type pulumi.StringOutput `pulumi:"type"`
	// User type ID. By default, it is `default`
	UserType pulumi.StringPtrOutput `pulumi:"userType"`
}

// NewAppUserBaseSchemaProperty registers a new resource with the given unique name, arguments, and options.
func NewAppUserBaseSchemaProperty(ctx *pulumi.Context,
	name string, args *AppUserBaseSchemaPropertyArgs, opts ...pulumi.ResourceOption) (*AppUserBaseSchemaProperty, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.Index == nil {
		return nil, errors.New("invalid value for required argument 'Index'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppUserBaseSchemaProperty
	err := ctx.RegisterResource("okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppUserBaseSchemaProperty gets an existing AppUserBaseSchemaProperty resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppUserBaseSchemaProperty(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppUserBaseSchemaPropertyState, opts ...pulumi.ResourceOption) (*AppUserBaseSchemaProperty, error) {
	var resource AppUserBaseSchemaProperty
	err := ctx.ReadResource("okta:index/appUserBaseSchemaProperty:AppUserBaseSchemaProperty", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppUserBaseSchemaProperty resources.
type appUserBaseSchemaPropertyState struct {
	// The Application's ID the user schema property should be assigned to.
	AppId *string `pulumi:"appId"`
	// Subschema unique string identifier
	Index *string `pulumi:"index"`
	// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
	Master *string `pulumi:"master"`
	// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
	Pattern *string `pulumi:"pattern"`
	// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
	Permissions *string `pulumi:"permissions"`
	// Whether the subschema is required
	Required *bool `pulumi:"required"`
	// Subschema title (display name)
	Title *string `pulumi:"title"`
	// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
	Type *string `pulumi:"type"`
	// User type ID. By default, it is `default`
	UserType *string `pulumi:"userType"`
}

type AppUserBaseSchemaPropertyState struct {
	// The Application's ID the user schema property should be assigned to.
	AppId pulumi.StringPtrInput
	// Subschema unique string identifier
	Index pulumi.StringPtrInput
	// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
	Master pulumi.StringPtrInput
	// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
	Pattern pulumi.StringPtrInput
	// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
	Permissions pulumi.StringPtrInput
	// Whether the subschema is required
	Required pulumi.BoolPtrInput
	// Subschema title (display name)
	Title pulumi.StringPtrInput
	// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
	Type pulumi.StringPtrInput
	// User type ID. By default, it is `default`
	UserType pulumi.StringPtrInput
}

func (AppUserBaseSchemaPropertyState) ElementType() reflect.Type {
	return reflect.TypeOf((*appUserBaseSchemaPropertyState)(nil)).Elem()
}

type appUserBaseSchemaPropertyArgs struct {
	// The Application's ID the user schema property should be assigned to.
	AppId string `pulumi:"appId"`
	// Subschema unique string identifier
	Index string `pulumi:"index"`
	// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
	Master *string `pulumi:"master"`
	// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
	Pattern *string `pulumi:"pattern"`
	// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
	Permissions *string `pulumi:"permissions"`
	// Whether the subschema is required
	Required *bool `pulumi:"required"`
	// Subschema title (display name)
	Title string `pulumi:"title"`
	// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
	Type string `pulumi:"type"`
	// User type ID. By default, it is `default`
	UserType *string `pulumi:"userType"`
}

// The set of arguments for constructing a AppUserBaseSchemaProperty resource.
type AppUserBaseSchemaPropertyArgs struct {
	// The Application's ID the user schema property should be assigned to.
	AppId pulumi.StringInput
	// Subschema unique string identifier
	Index pulumi.StringInput
	// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
	Master pulumi.StringPtrInput
	// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
	Pattern pulumi.StringPtrInput
	// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
	Permissions pulumi.StringPtrInput
	// Whether the subschema is required
	Required pulumi.BoolPtrInput
	// Subschema title (display name)
	Title pulumi.StringInput
	// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
	Type pulumi.StringInput
	// User type ID. By default, it is `default`
	UserType pulumi.StringPtrInput
}

func (AppUserBaseSchemaPropertyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appUserBaseSchemaPropertyArgs)(nil)).Elem()
}

type AppUserBaseSchemaPropertyInput interface {
	pulumi.Input

	ToAppUserBaseSchemaPropertyOutput() AppUserBaseSchemaPropertyOutput
	ToAppUserBaseSchemaPropertyOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyOutput
}

func (*AppUserBaseSchemaProperty) ElementType() reflect.Type {
	return reflect.TypeOf((**AppUserBaseSchemaProperty)(nil)).Elem()
}

func (i *AppUserBaseSchemaProperty) ToAppUserBaseSchemaPropertyOutput() AppUserBaseSchemaPropertyOutput {
	return i.ToAppUserBaseSchemaPropertyOutputWithContext(context.Background())
}

func (i *AppUserBaseSchemaProperty) ToAppUserBaseSchemaPropertyOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppUserBaseSchemaPropertyOutput)
}

// AppUserBaseSchemaPropertyArrayInput is an input type that accepts AppUserBaseSchemaPropertyArray and AppUserBaseSchemaPropertyArrayOutput values.
// You can construct a concrete instance of `AppUserBaseSchemaPropertyArrayInput` via:
//
//	AppUserBaseSchemaPropertyArray{ AppUserBaseSchemaPropertyArgs{...} }
type AppUserBaseSchemaPropertyArrayInput interface {
	pulumi.Input

	ToAppUserBaseSchemaPropertyArrayOutput() AppUserBaseSchemaPropertyArrayOutput
	ToAppUserBaseSchemaPropertyArrayOutputWithContext(context.Context) AppUserBaseSchemaPropertyArrayOutput
}

type AppUserBaseSchemaPropertyArray []AppUserBaseSchemaPropertyInput

func (AppUserBaseSchemaPropertyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppUserBaseSchemaProperty)(nil)).Elem()
}

func (i AppUserBaseSchemaPropertyArray) ToAppUserBaseSchemaPropertyArrayOutput() AppUserBaseSchemaPropertyArrayOutput {
	return i.ToAppUserBaseSchemaPropertyArrayOutputWithContext(context.Background())
}

func (i AppUserBaseSchemaPropertyArray) ToAppUserBaseSchemaPropertyArrayOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppUserBaseSchemaPropertyArrayOutput)
}

// AppUserBaseSchemaPropertyMapInput is an input type that accepts AppUserBaseSchemaPropertyMap and AppUserBaseSchemaPropertyMapOutput values.
// You can construct a concrete instance of `AppUserBaseSchemaPropertyMapInput` via:
//
//	AppUserBaseSchemaPropertyMap{ "key": AppUserBaseSchemaPropertyArgs{...} }
type AppUserBaseSchemaPropertyMapInput interface {
	pulumi.Input

	ToAppUserBaseSchemaPropertyMapOutput() AppUserBaseSchemaPropertyMapOutput
	ToAppUserBaseSchemaPropertyMapOutputWithContext(context.Context) AppUserBaseSchemaPropertyMapOutput
}

type AppUserBaseSchemaPropertyMap map[string]AppUserBaseSchemaPropertyInput

func (AppUserBaseSchemaPropertyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppUserBaseSchemaProperty)(nil)).Elem()
}

func (i AppUserBaseSchemaPropertyMap) ToAppUserBaseSchemaPropertyMapOutput() AppUserBaseSchemaPropertyMapOutput {
	return i.ToAppUserBaseSchemaPropertyMapOutputWithContext(context.Background())
}

func (i AppUserBaseSchemaPropertyMap) ToAppUserBaseSchemaPropertyMapOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppUserBaseSchemaPropertyMapOutput)
}

type AppUserBaseSchemaPropertyOutput struct{ *pulumi.OutputState }

func (AppUserBaseSchemaPropertyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppUserBaseSchemaProperty)(nil)).Elem()
}

func (o AppUserBaseSchemaPropertyOutput) ToAppUserBaseSchemaPropertyOutput() AppUserBaseSchemaPropertyOutput {
	return o
}

func (o AppUserBaseSchemaPropertyOutput) ToAppUserBaseSchemaPropertyOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyOutput {
	return o
}

// The Application's ID the user schema property should be assigned to.
func (o AppUserBaseSchemaPropertyOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// Subschema unique string identifier
func (o AppUserBaseSchemaPropertyOutput) Index() pulumi.StringOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringOutput { return v.Index }).(pulumi.StringOutput)
}

// Master priority for the user schema property. It can be set to `PROFILE_MASTER` or `OKTA`. Default: `PROFILE_MASTER`
func (o AppUserBaseSchemaPropertyOutput) Master() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringPtrOutput { return v.Master }).(pulumi.StringPtrOutput)
}

// The validation pattern to use for the subschema. Must be in form of '.+', or '[\n\n]+' if present.'
func (o AppUserBaseSchemaPropertyOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringPtrOutput { return v.Pattern }).(pulumi.StringPtrOutput)
}

// Access control permissions for the property. It can be set to `READ_WRITE`, `READ_ONLY`, `HIDE`. Default: `READ_ONLY`
func (o AppUserBaseSchemaPropertyOutput) Permissions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringPtrOutput { return v.Permissions }).(pulumi.StringPtrOutput)
}

// Whether the subschema is required
func (o AppUserBaseSchemaPropertyOutput) Required() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.BoolPtrOutput { return v.Required }).(pulumi.BoolPtrOutput)
}

// Subschema title (display name)
func (o AppUserBaseSchemaPropertyOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

// The type of the schema property. It can be `string`, `boolean`, `number`, `integer`, `array`, or `object`
func (o AppUserBaseSchemaPropertyOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User type ID. By default, it is `default`
func (o AppUserBaseSchemaPropertyOutput) UserType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppUserBaseSchemaProperty) pulumi.StringPtrOutput { return v.UserType }).(pulumi.StringPtrOutput)
}

type AppUserBaseSchemaPropertyArrayOutput struct{ *pulumi.OutputState }

func (AppUserBaseSchemaPropertyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppUserBaseSchemaProperty)(nil)).Elem()
}

func (o AppUserBaseSchemaPropertyArrayOutput) ToAppUserBaseSchemaPropertyArrayOutput() AppUserBaseSchemaPropertyArrayOutput {
	return o
}

func (o AppUserBaseSchemaPropertyArrayOutput) ToAppUserBaseSchemaPropertyArrayOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyArrayOutput {
	return o
}

func (o AppUserBaseSchemaPropertyArrayOutput) Index(i pulumi.IntInput) AppUserBaseSchemaPropertyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppUserBaseSchemaProperty {
		return vs[0].([]*AppUserBaseSchemaProperty)[vs[1].(int)]
	}).(AppUserBaseSchemaPropertyOutput)
}

type AppUserBaseSchemaPropertyMapOutput struct{ *pulumi.OutputState }

func (AppUserBaseSchemaPropertyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppUserBaseSchemaProperty)(nil)).Elem()
}

func (o AppUserBaseSchemaPropertyMapOutput) ToAppUserBaseSchemaPropertyMapOutput() AppUserBaseSchemaPropertyMapOutput {
	return o
}

func (o AppUserBaseSchemaPropertyMapOutput) ToAppUserBaseSchemaPropertyMapOutputWithContext(ctx context.Context) AppUserBaseSchemaPropertyMapOutput {
	return o
}

func (o AppUserBaseSchemaPropertyMapOutput) MapIndex(k pulumi.StringInput) AppUserBaseSchemaPropertyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppUserBaseSchemaProperty {
		return vs[0].(map[string]*AppUserBaseSchemaProperty)[vs[1].(string)]
	}).(AppUserBaseSchemaPropertyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppUserBaseSchemaPropertyInput)(nil)).Elem(), &AppUserBaseSchemaProperty{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppUserBaseSchemaPropertyArrayInput)(nil)).Elem(), AppUserBaseSchemaPropertyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppUserBaseSchemaPropertyMapInput)(nil)).Elem(), AppUserBaseSchemaPropertyMap{})
	pulumi.RegisterOutputType(AppUserBaseSchemaPropertyOutput{})
	pulumi.RegisterOutputType(AppUserBaseSchemaPropertyArrayOutput{})
	pulumi.RegisterOutputType(AppUserBaseSchemaPropertyMapOutput{})
}
