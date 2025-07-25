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

// Manages users relationships. Link value operations allow you to create relationships between primary and associated users.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta"
//	"github.com/pulumi/pulumi-okta/sdk/v5/go/okta/user"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			padishah, err := okta.NewLinkDefinition(ctx, "padishah", &okta.LinkDefinitionArgs{
//				PrimaryName:           pulumi.String("emperor"),
//				PrimaryTitle:          pulumi.String("Emperor"),
//				PrimaryDescription:    pulumi.String("Hereditary ruler of the Imperium and the Known Universe"),
//				AssociatedName:        pulumi.String("sardaukar"),
//				AssociatedTitle:       pulumi.String("Sardaukar"),
//				AssociatedDescription: pulumi.String("Elite military force member"),
//			})
//			if err != nil {
//				return err
//			}
//			emperor, err := user.NewUser(ctx, "emperor", &user.UserArgs{
//				FirstName: pulumi.String("Shaddam"),
//				LastName:  pulumi.String("Corrino IV"),
//				Login:     pulumi.String("shaddam.corrino.iv@salusa-secundus.planet"),
//				Email:     pulumi.String("shaddam.corrino.iv@salusa-secundus.planet"),
//			})
//			if err != nil {
//				return err
//			}
//			var sardaukars []*user.User
//			for index := 0; index < 5; index++ {
//				key0 := index
//				val0 := index
//				__res, err := user.NewUser(ctx, fmt.Sprintf("sardaukars-%v", key0), &user.UserArgs{
//					FirstName: pulumi.String("Amrit"),
//					LastName:  pulumi.Sprintf("Sardaukar_%v", val0),
//					Login:     pulumi.Sprintf("amritsardaukar_%v@salusa-secundus.planet", val0),
//					Email:     pulumi.Sprintf("amritsardaukar_%v@salusa-secundus.planet", val0),
//				})
//				if err != nil {
//					return err
//				}
//				sardaukars = append(sardaukars, __res)
//			}
//			_, err = okta.NewLinkValue(ctx, "example", &okta.LinkValueArgs{
//				PrimaryName:   padishah.PrimaryName,
//				PrimaryUserId: emperor.ID(),
//				AssociatedUserIds: pulumi.StringArray{
//					sardaukars[0].ID(),
//					sardaukars[1].ID(),
//					sardaukars[2].ID(),
//					sardaukars[3].ID(),
//					sardaukars[4].ID(),
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
//
// ## Import
//
// ```sh
// $ pulumi import okta:index/linkValue:LinkValue example <primary_name>/<primary_user_id>
// ```
type LinkValue struct {
	pulumi.CustomResourceState

	// Set of User IDs or login values of the users to be assigned the `associated` relationship.
	AssociatedUserIds pulumi.StringArrayOutput `pulumi:"associatedUserIds"`
	// Name of the `primary` relationship being assigned.
	PrimaryName pulumi.StringOutput `pulumi:"primaryName"`
	// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
	PrimaryUserId pulumi.StringOutput `pulumi:"primaryUserId"`
}

// NewLinkValue registers a new resource with the given unique name, arguments, and options.
func NewLinkValue(ctx *pulumi.Context,
	name string, args *LinkValueArgs, opts ...pulumi.ResourceOption) (*LinkValue, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrimaryName == nil {
		return nil, errors.New("invalid value for required argument 'PrimaryName'")
	}
	if args.PrimaryUserId == nil {
		return nil, errors.New("invalid value for required argument 'PrimaryUserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkValue
	err := ctx.RegisterResource("okta:index/linkValue:LinkValue", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkValue gets an existing LinkValue resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkValue(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkValueState, opts ...pulumi.ResourceOption) (*LinkValue, error) {
	var resource LinkValue
	err := ctx.ReadResource("okta:index/linkValue:LinkValue", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkValue resources.
type linkValueState struct {
	// Set of User IDs or login values of the users to be assigned the `associated` relationship.
	AssociatedUserIds []string `pulumi:"associatedUserIds"`
	// Name of the `primary` relationship being assigned.
	PrimaryName *string `pulumi:"primaryName"`
	// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
	PrimaryUserId *string `pulumi:"primaryUserId"`
}

type LinkValueState struct {
	// Set of User IDs or login values of the users to be assigned the `associated` relationship.
	AssociatedUserIds pulumi.StringArrayInput
	// Name of the `primary` relationship being assigned.
	PrimaryName pulumi.StringPtrInput
	// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
	PrimaryUserId pulumi.StringPtrInput
}

func (LinkValueState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkValueState)(nil)).Elem()
}

type linkValueArgs struct {
	// Set of User IDs or login values of the users to be assigned the `associated` relationship.
	AssociatedUserIds []string `pulumi:"associatedUserIds"`
	// Name of the `primary` relationship being assigned.
	PrimaryName string `pulumi:"primaryName"`
	// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
	PrimaryUserId string `pulumi:"primaryUserId"`
}

// The set of arguments for constructing a LinkValue resource.
type LinkValueArgs struct {
	// Set of User IDs or login values of the users to be assigned the `associated` relationship.
	AssociatedUserIds pulumi.StringArrayInput
	// Name of the `primary` relationship being assigned.
	PrimaryName pulumi.StringInput
	// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
	PrimaryUserId pulumi.StringInput
}

func (LinkValueArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkValueArgs)(nil)).Elem()
}

type LinkValueInput interface {
	pulumi.Input

	ToLinkValueOutput() LinkValueOutput
	ToLinkValueOutputWithContext(ctx context.Context) LinkValueOutput
}

func (*LinkValue) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkValue)(nil)).Elem()
}

func (i *LinkValue) ToLinkValueOutput() LinkValueOutput {
	return i.ToLinkValueOutputWithContext(context.Background())
}

func (i *LinkValue) ToLinkValueOutputWithContext(ctx context.Context) LinkValueOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkValueOutput)
}

// LinkValueArrayInput is an input type that accepts LinkValueArray and LinkValueArrayOutput values.
// You can construct a concrete instance of `LinkValueArrayInput` via:
//
//	LinkValueArray{ LinkValueArgs{...} }
type LinkValueArrayInput interface {
	pulumi.Input

	ToLinkValueArrayOutput() LinkValueArrayOutput
	ToLinkValueArrayOutputWithContext(context.Context) LinkValueArrayOutput
}

type LinkValueArray []LinkValueInput

func (LinkValueArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkValue)(nil)).Elem()
}

func (i LinkValueArray) ToLinkValueArrayOutput() LinkValueArrayOutput {
	return i.ToLinkValueArrayOutputWithContext(context.Background())
}

func (i LinkValueArray) ToLinkValueArrayOutputWithContext(ctx context.Context) LinkValueArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkValueArrayOutput)
}

// LinkValueMapInput is an input type that accepts LinkValueMap and LinkValueMapOutput values.
// You can construct a concrete instance of `LinkValueMapInput` via:
//
//	LinkValueMap{ "key": LinkValueArgs{...} }
type LinkValueMapInput interface {
	pulumi.Input

	ToLinkValueMapOutput() LinkValueMapOutput
	ToLinkValueMapOutputWithContext(context.Context) LinkValueMapOutput
}

type LinkValueMap map[string]LinkValueInput

func (LinkValueMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkValue)(nil)).Elem()
}

func (i LinkValueMap) ToLinkValueMapOutput() LinkValueMapOutput {
	return i.ToLinkValueMapOutputWithContext(context.Background())
}

func (i LinkValueMap) ToLinkValueMapOutputWithContext(ctx context.Context) LinkValueMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkValueMapOutput)
}

type LinkValueOutput struct{ *pulumi.OutputState }

func (LinkValueOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkValue)(nil)).Elem()
}

func (o LinkValueOutput) ToLinkValueOutput() LinkValueOutput {
	return o
}

func (o LinkValueOutput) ToLinkValueOutputWithContext(ctx context.Context) LinkValueOutput {
	return o
}

// Set of User IDs or login values of the users to be assigned the `associated` relationship.
func (o LinkValueOutput) AssociatedUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkValue) pulumi.StringArrayOutput { return v.AssociatedUserIds }).(pulumi.StringArrayOutput)
}

// Name of the `primary` relationship being assigned.
func (o LinkValueOutput) PrimaryName() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkValue) pulumi.StringOutput { return v.PrimaryName }).(pulumi.StringOutput)
}

// User ID to be assigned to `primary` for the 'associated' user in the specified relationship.
func (o LinkValueOutput) PrimaryUserId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkValue) pulumi.StringOutput { return v.PrimaryUserId }).(pulumi.StringOutput)
}

type LinkValueArrayOutput struct{ *pulumi.OutputState }

func (LinkValueArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkValue)(nil)).Elem()
}

func (o LinkValueArrayOutput) ToLinkValueArrayOutput() LinkValueArrayOutput {
	return o
}

func (o LinkValueArrayOutput) ToLinkValueArrayOutputWithContext(ctx context.Context) LinkValueArrayOutput {
	return o
}

func (o LinkValueArrayOutput) Index(i pulumi.IntInput) LinkValueOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkValue {
		return vs[0].([]*LinkValue)[vs[1].(int)]
	}).(LinkValueOutput)
}

type LinkValueMapOutput struct{ *pulumi.OutputState }

func (LinkValueMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkValue)(nil)).Elem()
}

func (o LinkValueMapOutput) ToLinkValueMapOutput() LinkValueMapOutput {
	return o
}

func (o LinkValueMapOutput) ToLinkValueMapOutputWithContext(ctx context.Context) LinkValueMapOutput {
	return o
}

func (o LinkValueMapOutput) MapIndex(k pulumi.StringInput) LinkValueOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkValue {
		return vs[0].(map[string]*LinkValue)[vs[1].(string)]
	}).(LinkValueOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkValueInput)(nil)).Elem(), &LinkValue{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkValueArrayInput)(nil)).Elem(), LinkValueArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkValueMapInput)(nil)).Elem(), LinkValueMap{})
	pulumi.RegisterOutputType(LinkValueOutput{})
	pulumi.RegisterOutputType(LinkValueArrayOutput{})
	pulumi.RegisterOutputType(LinkValueMapOutput{})
}
