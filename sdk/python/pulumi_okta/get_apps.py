# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetAppsResult',
    'AwaitableGetAppsResult',
    'get_apps',
    'get_apps_output',
]

@pulumi.output_type
class GetAppsResult:
    """
    A collection of values returned by getApps.
    """
    def __init__(__self__, active_only=None, apps=None, id=None, include_non_deleted=None, label=None, label_prefix=None, q=None, use_optimization=None):
        if active_only and not isinstance(active_only, bool):
            raise TypeError("Expected argument 'active_only' to be a bool")
        pulumi.set(__self__, "active_only", active_only)
        if apps and not isinstance(apps, list):
            raise TypeError("Expected argument 'apps' to be a list")
        pulumi.set(__self__, "apps", apps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_non_deleted and not isinstance(include_non_deleted, bool):
            raise TypeError("Expected argument 'include_non_deleted' to be a bool")
        pulumi.set(__self__, "include_non_deleted", include_non_deleted)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if label_prefix and not isinstance(label_prefix, str):
            raise TypeError("Expected argument 'label_prefix' to be a str")
        pulumi.set(__self__, "label_prefix", label_prefix)
        if q and not isinstance(q, str):
            raise TypeError("Expected argument 'q' to be a str")
        pulumi.set(__self__, "q", q)
        if use_optimization and not isinstance(use_optimization, bool):
            raise TypeError("Expected argument 'use_optimization' to be a bool")
        pulumi.set(__self__, "use_optimization", use_optimization)

    @property
    @pulumi.getter(name="activeOnly")
    def active_only(self) -> Optional[builtins.bool]:
        """
        Search only active applications.
        """
        return pulumi.get(self, "active_only")

    @property
    @pulumi.getter
    def apps(self) -> Sequence['outputs.GetAppsAppResult']:
        """
        The list of applications that match the search criteria.
        """
        return pulumi.get(self, "apps")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includeNonDeleted")
    def include_non_deleted(self) -> Optional[builtins.bool]:
        """
        Specifies whether to include non-active, but not deleted apps in the results.
        """
        return pulumi.get(self, "include_non_deleted")

    @property
    @pulumi.getter
    def label(self) -> Optional[builtins.str]:
        """
        Searches for applications whose label or name property matches this value exactly.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="labelPrefix")
    @_utilities.deprecated("""Use `q` instead. This attribute will be removed in a future version.""")
    def label_prefix(self) -> Optional[builtins.str]:
        """
        Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
        """
        return pulumi.get(self, "label_prefix")

    @property
    @pulumi.getter
    def q(self) -> Optional[builtins.str]:
        """
        Searches for apps with name or label properties that starts with the `q` value.
        """
        return pulumi.get(self, "q")

    @property
    @pulumi.getter(name="useOptimization")
    def use_optimization(self) -> Optional[builtins.bool]:
        """
        Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
        """
        return pulumi.get(self, "use_optimization")


class AwaitableGetAppsResult(GetAppsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppsResult(
            active_only=self.active_only,
            apps=self.apps,
            id=self.id,
            include_non_deleted=self.include_non_deleted,
            label=self.label,
            label_prefix=self.label_prefix,
            q=self.q,
            use_optimization=self.use_optimization)


def get_apps(active_only: Optional[builtins.bool] = None,
             include_non_deleted: Optional[builtins.bool] = None,
             label: Optional[builtins.str] = None,
             label_prefix: Optional[builtins.str] = None,
             q: Optional[builtins.str] = None,
             use_optimization: Optional[builtins.bool] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppsResult:
    """
    Use this data source to access information about an existing resource.

    :param builtins.bool active_only: Search only active applications.
    :param builtins.bool include_non_deleted: Specifies whether to include non-active, but not deleted apps in the results.
    :param builtins.str label: Searches for applications whose label or name property matches this value exactly.
    :param builtins.str label_prefix: Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
    :param builtins.str q: Searches for apps with name or label properties that starts with the `q` value.
    :param builtins.bool use_optimization: Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
    """
    __args__ = dict()
    __args__['activeOnly'] = active_only
    __args__['includeNonDeleted'] = include_non_deleted
    __args__['label'] = label
    __args__['labelPrefix'] = label_prefix
    __args__['q'] = q
    __args__['useOptimization'] = use_optimization
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('okta:index/getApps:getApps', __args__, opts=opts, typ=GetAppsResult).value

    return AwaitableGetAppsResult(
        active_only=pulumi.get(__ret__, 'active_only'),
        apps=pulumi.get(__ret__, 'apps'),
        id=pulumi.get(__ret__, 'id'),
        include_non_deleted=pulumi.get(__ret__, 'include_non_deleted'),
        label=pulumi.get(__ret__, 'label'),
        label_prefix=pulumi.get(__ret__, 'label_prefix'),
        q=pulumi.get(__ret__, 'q'),
        use_optimization=pulumi.get(__ret__, 'use_optimization'))
def get_apps_output(active_only: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                    include_non_deleted: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                    label: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    label_prefix: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    q: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    use_optimization: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppsResult]:
    """
    Use this data source to access information about an existing resource.

    :param builtins.bool active_only: Search only active applications.
    :param builtins.bool include_non_deleted: Specifies whether to include non-active, but not deleted apps in the results.
    :param builtins.str label: Searches for applications whose label or name property matches this value exactly.
    :param builtins.str label_prefix: Searches for applications whose label or name property begins with this value. **Warning:** This might not work as intended and will be removed in the future release. Use `q` instead.
    :param builtins.str q: Searches for apps with name or label properties that starts with the `q` value.
    :param builtins.bool use_optimization: Specifies whether to use query optimization. If you specify `useOptimization=true` in the request query, the response contains a subset of app instance properties.
    """
    __args__ = dict()
    __args__['activeOnly'] = active_only
    __args__['includeNonDeleted'] = include_non_deleted
    __args__['label'] = label
    __args__['labelPrefix'] = label_prefix
    __args__['q'] = q
    __args__['useOptimization'] = use_optimization
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('okta:index/getApps:getApps', __args__, opts=opts, typ=GetAppsResult)
    return __ret__.apply(lambda __response__: GetAppsResult(
        active_only=pulumi.get(__response__, 'active_only'),
        apps=pulumi.get(__response__, 'apps'),
        id=pulumi.get(__response__, 'id'),
        include_non_deleted=pulumi.get(__response__, 'include_non_deleted'),
        label=pulumi.get(__response__, 'label'),
        label_prefix=pulumi.get(__response__, 'label_prefix'),
        q=pulumi.get(__response__, 'q'),
        use_optimization=pulumi.get(__response__, 'use_optimization')))
