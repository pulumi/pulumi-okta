// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Associated (Trusted) authorization servers allow you to designate a trusted authorization server that you associate with another authorization server.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta"
//	"github.com/pulumi/pulumi-okta/sdk/v4/go/okta/auth"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth.NewServer(ctx, "test1", &auth.ServerArgs{
//				Audiences: pulumi.StringArray{
//					pulumi.String("whatever.rise.zone"),
//				},
//				CredentialsRotationMode: pulumi.String("AUTO"),
//				Description:             pulumi.String("The best way to find out if you can trust somebody is to trust them."),
//				Name:                    pulumi.String("testAcc-replace_with_uuid"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth.NewServer(ctx, "test2", &auth.ServerArgs{
//				Audiences: pulumi.StringArray{
//					pulumi.String("whatever.rise.zone"),
//				},
//				CredentialsRotationMode: pulumi.String("AUTO"),
//				Description:             pulumi.String("The best way to find out if you can trust somebody is to trust them."),
//				Name:                    pulumi.String("testAcc-replace_with_uuid"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth.NewServer(ctx, "test3", &auth.ServerArgs{
//				Audiences: pulumi.StringArray{
//					pulumi.String("whatever.rise.zone"),
//				},
//				CredentialsRotationMode: pulumi.String("AUTO"),
//				Description:             pulumi.String("The best way to find out if you can trust somebody is to trust them."),
//				Name:                    pulumi.String("testAcc-replace_with_uuid"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = okta.NewTrustedServer(ctx, "example", &okta.TrustedServerArgs{
//				AuthServerId: pulumi.Any(oktaAuthServer.Test1.Id),
//				Trusteds: pulumi.StringArray{
//					oktaAuthServer.Test2.Id,
//					oktaAuthServer.Test3.Id,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type TrustedServer struct {
	pulumi.CustomResourceState

	// Authorization server ID
	AuthServerId pulumi.StringOutput `pulumi:"authServerId"`
	// A list of the authorization server IDs user want to trust
	Trusteds pulumi.StringArrayOutput `pulumi:"trusteds"`
}

// NewTrustedServer registers a new resource with the given unique name, arguments, and options.
func NewTrustedServer(ctx *pulumi.Context,
	name string, args *TrustedServerArgs, opts ...pulumi.ResourceOption) (*TrustedServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthServerId == nil {
		return nil, errors.New("invalid value for required argument 'AuthServerId'")
	}
	if args.Trusteds == nil {
		return nil, errors.New("invalid value for required argument 'Trusteds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrustedServer
	err := ctx.RegisterResource("okta:index/trustedServer:TrustedServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrustedServer gets an existing TrustedServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrustedServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrustedServerState, opts ...pulumi.ResourceOption) (*TrustedServer, error) {
	var resource TrustedServer
	err := ctx.ReadResource("okta:index/trustedServer:TrustedServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrustedServer resources.
type trustedServerState struct {
	// Authorization server ID
	AuthServerId *string `pulumi:"authServerId"`
	// A list of the authorization server IDs user want to trust
	Trusteds []string `pulumi:"trusteds"`
}

type TrustedServerState struct {
	// Authorization server ID
	AuthServerId pulumi.StringPtrInput
	// A list of the authorization server IDs user want to trust
	Trusteds pulumi.StringArrayInput
}

func (TrustedServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*trustedServerState)(nil)).Elem()
}

type trustedServerArgs struct {
	// Authorization server ID
	AuthServerId string `pulumi:"authServerId"`
	// A list of the authorization server IDs user want to trust
	Trusteds []string `pulumi:"trusteds"`
}

// The set of arguments for constructing a TrustedServer resource.
type TrustedServerArgs struct {
	// Authorization server ID
	AuthServerId pulumi.StringInput
	// A list of the authorization server IDs user want to trust
	Trusteds pulumi.StringArrayInput
}

func (TrustedServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trustedServerArgs)(nil)).Elem()
}

type TrustedServerInput interface {
	pulumi.Input

	ToTrustedServerOutput() TrustedServerOutput
	ToTrustedServerOutputWithContext(ctx context.Context) TrustedServerOutput
}

func (*TrustedServer) ElementType() reflect.Type {
	return reflect.TypeOf((**TrustedServer)(nil)).Elem()
}

func (i *TrustedServer) ToTrustedServerOutput() TrustedServerOutput {
	return i.ToTrustedServerOutputWithContext(context.Background())
}

func (i *TrustedServer) ToTrustedServerOutputWithContext(ctx context.Context) TrustedServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedServerOutput)
}

// TrustedServerArrayInput is an input type that accepts TrustedServerArray and TrustedServerArrayOutput values.
// You can construct a concrete instance of `TrustedServerArrayInput` via:
//
//	TrustedServerArray{ TrustedServerArgs{...} }
type TrustedServerArrayInput interface {
	pulumi.Input

	ToTrustedServerArrayOutput() TrustedServerArrayOutput
	ToTrustedServerArrayOutputWithContext(context.Context) TrustedServerArrayOutput
}

type TrustedServerArray []TrustedServerInput

func (TrustedServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrustedServer)(nil)).Elem()
}

func (i TrustedServerArray) ToTrustedServerArrayOutput() TrustedServerArrayOutput {
	return i.ToTrustedServerArrayOutputWithContext(context.Background())
}

func (i TrustedServerArray) ToTrustedServerArrayOutputWithContext(ctx context.Context) TrustedServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedServerArrayOutput)
}

// TrustedServerMapInput is an input type that accepts TrustedServerMap and TrustedServerMapOutput values.
// You can construct a concrete instance of `TrustedServerMapInput` via:
//
//	TrustedServerMap{ "key": TrustedServerArgs{...} }
type TrustedServerMapInput interface {
	pulumi.Input

	ToTrustedServerMapOutput() TrustedServerMapOutput
	ToTrustedServerMapOutputWithContext(context.Context) TrustedServerMapOutput
}

type TrustedServerMap map[string]TrustedServerInput

func (TrustedServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrustedServer)(nil)).Elem()
}

func (i TrustedServerMap) ToTrustedServerMapOutput() TrustedServerMapOutput {
	return i.ToTrustedServerMapOutputWithContext(context.Background())
}

func (i TrustedServerMap) ToTrustedServerMapOutputWithContext(ctx context.Context) TrustedServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedServerMapOutput)
}

type TrustedServerOutput struct{ *pulumi.OutputState }

func (TrustedServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrustedServer)(nil)).Elem()
}

func (o TrustedServerOutput) ToTrustedServerOutput() TrustedServerOutput {
	return o
}

func (o TrustedServerOutput) ToTrustedServerOutputWithContext(ctx context.Context) TrustedServerOutput {
	return o
}

// Authorization server ID
func (o TrustedServerOutput) AuthServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrustedServer) pulumi.StringOutput { return v.AuthServerId }).(pulumi.StringOutput)
}

// A list of the authorization server IDs user want to trust
func (o TrustedServerOutput) Trusteds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TrustedServer) pulumi.StringArrayOutput { return v.Trusteds }).(pulumi.StringArrayOutput)
}

type TrustedServerArrayOutput struct{ *pulumi.OutputState }

func (TrustedServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrustedServer)(nil)).Elem()
}

func (o TrustedServerArrayOutput) ToTrustedServerArrayOutput() TrustedServerArrayOutput {
	return o
}

func (o TrustedServerArrayOutput) ToTrustedServerArrayOutputWithContext(ctx context.Context) TrustedServerArrayOutput {
	return o
}

func (o TrustedServerArrayOutput) Index(i pulumi.IntInput) TrustedServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrustedServer {
		return vs[0].([]*TrustedServer)[vs[1].(int)]
	}).(TrustedServerOutput)
}

type TrustedServerMapOutput struct{ *pulumi.OutputState }

func (TrustedServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrustedServer)(nil)).Elem()
}

func (o TrustedServerMapOutput) ToTrustedServerMapOutput() TrustedServerMapOutput {
	return o
}

func (o TrustedServerMapOutput) ToTrustedServerMapOutputWithContext(ctx context.Context) TrustedServerMapOutput {
	return o
}

func (o TrustedServerMapOutput) MapIndex(k pulumi.StringInput) TrustedServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrustedServer {
		return vs[0].(map[string]*TrustedServer)[vs[1].(string)]
	}).(TrustedServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedServerInput)(nil)).Elem(), &TrustedServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedServerArrayInput)(nil)).Elem(), TrustedServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedServerMapInput)(nil)).Elem(), TrustedServerMap{})
	pulumi.RegisterOutputType(TrustedServerOutput{})
	pulumi.RegisterOutputType(TrustedServerArrayOutput{})
	pulumi.RegisterOutputType(TrustedServerMapOutput{})
}