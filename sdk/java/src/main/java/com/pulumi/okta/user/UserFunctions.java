// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.user;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.user.inputs.GetUserArgs;
import com.pulumi.okta.user.inputs.GetUserPlainArgs;
import com.pulumi.okta.user.inputs.GetUserTypeArgs;
import com.pulumi.okta.user.inputs.GetUserTypePlainArgs;
import com.pulumi.okta.user.inputs.GetUsersArgs;
import com.pulumi.okta.user.inputs.GetUsersPlainArgs;
import com.pulumi.okta.user.outputs.GetUserProfileMappingSourceResult;
import com.pulumi.okta.user.outputs.GetUserResult;
import com.pulumi.okta.user.outputs.GetUserTypeResult;
import com.pulumi.okta.user.outputs.GetUsersResult;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class UserFunctions {
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUserResult> getUser() {
        return getUser(GetUserArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUserResult> getUserPlain() {
        return getUserPlain(GetUserPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUserResult> getUserPlain(GetUserPlainArgs args) {
        return getUserPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:user/getUser:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a users from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUser(GetUserArgs.builder()
     *             .searches(GetUserSearchArgs.builder()
     *                 .expression(&#34;profile.firstName eq \&#34;John\&#34;&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUserResult> getUserPlain(GetUserPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:user/getUser:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUserProfileMappingSourceResult> getUserProfileMappingSource() {
        return getUserProfileMappingSource(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserProfileMappingSourceResult> getUserProfileMappingSourcePlain() {
        return getUserProfileMappingSourcePlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUserProfileMappingSourceResult> getUserProfileMappingSource(InvokeArgs args) {
        return getUserProfileMappingSource(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserProfileMappingSourceResult> getUserProfileMappingSourcePlain(InvokeArgs args) {
        return getUserProfileMappingSourcePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUserProfileMappingSourceResult> getUserProfileMappingSource(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:user/getUserProfileMappingSource:getUserProfileMappingSource", TypeShape.of(GetUserProfileMappingSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve the base user Profile Mapping source or target from Okta.
     * 
     * &gt; **NOTE:** If using this resource with OAuth2 scopes, this resource requires `okta.profileMappings.read` scope.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserProfileMappingSourceResult> getUserProfileMappingSourcePlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:user/getUserProfileMappingSource:getUserProfileMappingSource", TypeShape.of(GetUserProfileMappingSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a user type from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUserType(GetUserTypeArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUserTypeResult> getUserType(GetUserTypeArgs args) {
        return getUserType(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a user type from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUserType(GetUserTypeArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUserTypeResult> getUserTypePlain(GetUserTypePlainArgs args) {
        return getUserTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a user type from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUserType(GetUserTypeArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUserTypeResult> getUserType(GetUserTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:user/getUserType:getUserType", TypeShape.of(GetUserTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a user type from Okta.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUserTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUserType(GetUserTypeArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUserTypeResult> getUserTypePlain(GetUserTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:user/getUserType:getUserType", TypeShape.of(GetUserTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUsersResult> getUsers() {
        return getUsers(GetUsersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain() {
        return getUsersPlain(GetUsersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args) {
        return getUsers(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args) {
        return getUsersPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:user/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a list of users from Okta.
     * 
     * ## Example Usage
     * ### Lookup Users by Search Criteria
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .searches(GetUsersSearchArgs.builder()
     *                 .expression(&#34;profile.department eq \&#34;Engineering\&#34; and (created lt \&#34;2014-01-01T00:00:00.000Z\&#34; or status eq \&#34;ACTIVE\&#34;)&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Lookup Users by Group Membership
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.Group;
     * import com.pulumi.okta.user.UserFunctions;
     * import com.pulumi.okta.user.inputs.GetUsersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var exampleGroup = new Group(&#34;exampleGroup&#34;);
     * 
     *         final var exampleUsers = UserFunctions.getUsers(GetUsersArgs.builder()
     *             .groupId(exampleGroup.id())
     *             .includeGroups(true)
     *             .includeRoles(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:user/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
}