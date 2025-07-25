// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an Okta Network Zone. This resource allows you to create and configure an Okta Network Zone.
//
// ## Import
//
// ```sh
// $ pulumi import okta:network/zone:Zone example <zone_id>
// ```
type Zone struct {
	pulumi.CustomResourceState

	// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
	Asns pulumi.StringArrayOutput `pulumi:"asns"`
	// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
	DynamicLocations pulumi.StringArrayOutput `pulumi:"dynamicLocations"`
	// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
	DynamicLocationsExcludes pulumi.StringArrayOutput `pulumi:"dynamicLocationsExcludes"`
	// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
	DynamicProxyType pulumi.StringPtrOutput `pulumi:"dynamicProxyType"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
	Gateways pulumi.StringArrayOutput `pulumi:"gateways"`
	// List of ip service excluded. Use with type `DYNAMIC_V2`
	IpServiceCategoriesExcludes pulumi.StringArrayOutput `pulumi:"ipServiceCategoriesExcludes"`
	// List of ip service included. Use with type `DYNAMIC_V2`
	IpServiceCategoriesIncludes pulumi.StringArrayOutput `pulumi:"ipServiceCategoriesIncludes"`
	// Name of the Network Zone Resource
	Name pulumi.StringOutput `pulumi:"name"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
	Proxies pulumi.StringArrayOutput `pulumi:"proxies"`
	// Network Status - can either be `ACTIVE` or `INACTIVE` only
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
	Type pulumi.StringOutput `pulumi:"type"`
	// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
	Usage pulumi.StringPtrOutput `pulumi:"usage"`
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOption) (*Zone, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Zone
	err := ctx.RegisterResource("okta:network/zone:Zone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZone gets an existing Zone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneState, opts ...pulumi.ResourceOption) (*Zone, error) {
	var resource Zone
	err := ctx.ReadResource("okta:network/zone:Zone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Zone resources.
type zoneState struct {
	// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
	Asns []string `pulumi:"asns"`
	// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
	DynamicLocations []string `pulumi:"dynamicLocations"`
	// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
	DynamicLocationsExcludes []string `pulumi:"dynamicLocationsExcludes"`
	// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
	DynamicProxyType *string `pulumi:"dynamicProxyType"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
	Gateways []string `pulumi:"gateways"`
	// List of ip service excluded. Use with type `DYNAMIC_V2`
	IpServiceCategoriesExcludes []string `pulumi:"ipServiceCategoriesExcludes"`
	// List of ip service included. Use with type `DYNAMIC_V2`
	IpServiceCategoriesIncludes []string `pulumi:"ipServiceCategoriesIncludes"`
	// Name of the Network Zone Resource
	Name *string `pulumi:"name"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
	Proxies []string `pulumi:"proxies"`
	// Network Status - can either be `ACTIVE` or `INACTIVE` only
	Status *string `pulumi:"status"`
	// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
	Type *string `pulumi:"type"`
	// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
	Usage *string `pulumi:"usage"`
}

type ZoneState struct {
	// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
	Asns pulumi.StringArrayInput
	// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
	DynamicLocations pulumi.StringArrayInput
	// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
	DynamicLocationsExcludes pulumi.StringArrayInput
	// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
	DynamicProxyType pulumi.StringPtrInput
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
	Gateways pulumi.StringArrayInput
	// List of ip service excluded. Use with type `DYNAMIC_V2`
	IpServiceCategoriesExcludes pulumi.StringArrayInput
	// List of ip service included. Use with type `DYNAMIC_V2`
	IpServiceCategoriesIncludes pulumi.StringArrayInput
	// Name of the Network Zone Resource
	Name pulumi.StringPtrInput
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
	Proxies pulumi.StringArrayInput
	// Network Status - can either be `ACTIVE` or `INACTIVE` only
	Status pulumi.StringPtrInput
	// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
	Type pulumi.StringPtrInput
	// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
	Usage pulumi.StringPtrInput
}

func (ZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneState)(nil)).Elem()
}

type zoneArgs struct {
	// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
	Asns []string `pulumi:"asns"`
	// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
	DynamicLocations []string `pulumi:"dynamicLocations"`
	// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
	DynamicLocationsExcludes []string `pulumi:"dynamicLocationsExcludes"`
	// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
	DynamicProxyType *string `pulumi:"dynamicProxyType"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
	Gateways []string `pulumi:"gateways"`
	// List of ip service excluded. Use with type `DYNAMIC_V2`
	IpServiceCategoriesExcludes []string `pulumi:"ipServiceCategoriesExcludes"`
	// List of ip service included. Use with type `DYNAMIC_V2`
	IpServiceCategoriesIncludes []string `pulumi:"ipServiceCategoriesIncludes"`
	// Name of the Network Zone Resource
	Name *string `pulumi:"name"`
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
	Proxies []string `pulumi:"proxies"`
	// Network Status - can either be `ACTIVE` or `INACTIVE` only
	Status *string `pulumi:"status"`
	// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
	Type string `pulumi:"type"`
	// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
	Usage *string `pulumi:"usage"`
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
	Asns pulumi.StringArrayInput
	// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
	DynamicLocations pulumi.StringArrayInput
	// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
	DynamicLocationsExcludes pulumi.StringArrayInput
	// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
	DynamicProxyType pulumi.StringPtrInput
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
	Gateways pulumi.StringArrayInput
	// List of ip service excluded. Use with type `DYNAMIC_V2`
	IpServiceCategoriesExcludes pulumi.StringArrayInput
	// List of ip service included. Use with type `DYNAMIC_V2`
	IpServiceCategoriesIncludes pulumi.StringArrayInput
	// Name of the Network Zone Resource
	Name pulumi.StringPtrInput
	// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
	Proxies pulumi.StringArrayInput
	// Network Status - can either be `ACTIVE` or `INACTIVE` only
	Status pulumi.StringPtrInput
	// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
	Type pulumi.StringInput
	// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
	Usage pulumi.StringPtrInput
}

func (ZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneArgs)(nil)).Elem()
}

type ZoneInput interface {
	pulumi.Input

	ToZoneOutput() ZoneOutput
	ToZoneOutputWithContext(ctx context.Context) ZoneOutput
}

func (*Zone) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (i *Zone) ToZoneOutput() ZoneOutput {
	return i.ToZoneOutputWithContext(context.Background())
}

func (i *Zone) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneOutput)
}

// ZoneArrayInput is an input type that accepts ZoneArray and ZoneArrayOutput values.
// You can construct a concrete instance of `ZoneArrayInput` via:
//
//	ZoneArray{ ZoneArgs{...} }
type ZoneArrayInput interface {
	pulumi.Input

	ToZoneArrayOutput() ZoneArrayOutput
	ToZoneArrayOutputWithContext(context.Context) ZoneArrayOutput
}

type ZoneArray []ZoneInput

func (ZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (i ZoneArray) ToZoneArrayOutput() ZoneArrayOutput {
	return i.ToZoneArrayOutputWithContext(context.Background())
}

func (i ZoneArray) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneArrayOutput)
}

// ZoneMapInput is an input type that accepts ZoneMap and ZoneMapOutput values.
// You can construct a concrete instance of `ZoneMapInput` via:
//
//	ZoneMap{ "key": ZoneArgs{...} }
type ZoneMapInput interface {
	pulumi.Input

	ToZoneMapOutput() ZoneMapOutput
	ToZoneMapOutputWithContext(context.Context) ZoneMapOutput
}

type ZoneMap map[string]ZoneInput

func (ZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (i ZoneMap) ToZoneMapOutput() ZoneMapOutput {
	return i.ToZoneMapOutputWithContext(context.Background())
}

func (i ZoneMap) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneMapOutput)
}

type ZoneOutput struct{ *pulumi.OutputState }

func (ZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (o ZoneOutput) ToZoneOutput() ZoneOutput {
	return o
}

func (o ZoneOutput) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return o
}

// List of asns included. Format of each array value: a string representation of an ASN numeric value. Use with type `DYNAMIC` or `DYNAMIC_V2`
func (o ZoneOutput) Asns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.Asns }).(pulumi.StringArrayOutput)
}

// Array of locations ISO-3166-1(2) included. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC` or `DYNAMIC_V2`
func (o ZoneOutput) DynamicLocations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.DynamicLocations }).(pulumi.StringArrayOutput)
}

// Array of locations ISO-3166-1(2) excluded. Format code: countryCode OR countryCode-regionCode. Use with type `DYNAMIC_V2`
func (o ZoneOutput) DynamicLocationsExcludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.DynamicLocationsExcludes }).(pulumi.StringArrayOutput)
}

// Type of proxy being controlled by this dynamic network zone - can be one of `Any`, `TorAnonymizer` or `NotTorAnonymizer`. Use with type `DYNAMIC`
func (o ZoneOutput) DynamicProxyType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.DynamicProxyType }).(pulumi.StringPtrOutput)
}

// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Use with type `IP`
func (o ZoneOutput) Gateways() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.Gateways }).(pulumi.StringArrayOutput)
}

// List of ip service excluded. Use with type `DYNAMIC_V2`
func (o ZoneOutput) IpServiceCategoriesExcludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.IpServiceCategoriesExcludes }).(pulumi.StringArrayOutput)
}

// List of ip service included. Use with type `DYNAMIC_V2`
func (o ZoneOutput) IpServiceCategoriesIncludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.IpServiceCategoriesIncludes }).(pulumi.StringArrayOutput)
}

// Name of the Network Zone Resource
func (o ZoneOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Array of values in CIDR/range form depending on the way it's been declared (i.e. CIDR will contain /suffix). Please check API docs for examples. Can not be set if `usage` is set to `BLOCKLIST`. Use with type `IP`
func (o ZoneOutput) Proxies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.Proxies }).(pulumi.StringArrayOutput)
}

// Network Status - can either be `ACTIVE` or `INACTIVE` only
func (o ZoneOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Type of the Network Zone - can be `IP`, `DYNAMIC` or `DYNAMIC_V2` only
func (o ZoneOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Usage of the Network Zone - can be either `POLICY` or `BLOCKLIST`. By default, it is `POLICY`
func (o ZoneOutput) Usage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.Usage }).(pulumi.StringPtrOutput)
}

type ZoneArrayOutput struct{ *pulumi.OutputState }

func (ZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (o ZoneArrayOutput) ToZoneArrayOutput() ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) Index(i pulumi.IntInput) ZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].([]*Zone)[vs[1].(int)]
	}).(ZoneOutput)
}

type ZoneMapOutput struct{ *pulumi.OutputState }

func (ZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (o ZoneMapOutput) ToZoneMapOutput() ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) MapIndex(k pulumi.StringInput) ZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].(map[string]*Zone)[vs[1].(string)]
	}).(ZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneInput)(nil)).Elem(), &Zone{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneArrayInput)(nil)).Elem(), ZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneMapInput)(nil)).Elem(), ZoneMap{})
	pulumi.RegisterOutputType(ZoneOutput{})
	pulumi.RegisterOutputType(ZoneArrayOutput{})
	pulumi.RegisterOutputType(ZoneMapOutput{})
}
