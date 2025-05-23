// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.group;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
import com.pulumi.okta.group.inputs.GetEveryoneGroupPlainArgs;
import com.pulumi.okta.group.inputs.GetGroupArgs;
import com.pulumi.okta.group.inputs.GetGroupPlainArgs;
import com.pulumi.okta.group.inputs.GetRuleArgs;
import com.pulumi.okta.group.inputs.GetRulePlainArgs;
import com.pulumi.okta.group.outputs.GetEveryoneGroupResult;
import com.pulumi.okta.group.outputs.GetGroupResult;
import com.pulumi.okta.group.outputs.GetRuleResult;
import java.util.concurrent.CompletableFuture;

public final class GroupFunctions {
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEveryoneGroupResult> getEveryoneGroup() {
        return getEveryoneGroup(GetEveryoneGroupArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEveryoneGroupResult> getEveryoneGroupPlain() {
        return getEveryoneGroupPlain(GetEveryoneGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEveryoneGroupResult> getEveryoneGroup(GetEveryoneGroupArgs args) {
        return getEveryoneGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEveryoneGroupResult> getEveryoneGroupPlain(GetEveryoneGroupPlainArgs args) {
        return getEveryoneGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEveryoneGroupResult> getEveryoneGroup(GetEveryoneGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:group/getEveryoneGroup:getEveryoneGroup", TypeShape.of(GetEveryoneGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEveryoneGroupResult> getEveryoneGroup(GetEveryoneGroupArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:group/getEveryoneGroup:getEveryoneGroup", TypeShape.of(GetEveryoneGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve the `Everyone` group from Okta. The
     * same can be achieved with the `okta.group.Group` data
     * source with `name = &#34;Everyone&#34;`. This is simply a shortcut.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetEveryoneGroupArgs;
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
     *         final var example = GroupFunctions.getEveryoneGroup(GetEveryoneGroupArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEveryoneGroupResult> getEveryoneGroupPlain(GetEveryoneGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:group/getEveryoneGroup:getEveryoneGroup", TypeShape.of(GetEveryoneGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGroupResult> getGroup() {
        return getGroup(GetGroupArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroupPlain() {
        return getGroupPlain(GetGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroupPlain(GetGroupPlainArgs args) {
        return getGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:group/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGroupResult> getGroup(GetGroupArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:group/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetGroupArgs;
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
     *         final var example = GroupFunctions.getGroup(GetGroupArgs.builder()
     *             .name("Example App")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroupPlain(GetGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:group/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule() {
        return getRule(GetRuleArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain() {
        return getRulePlain(GetRulePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args) {
        return getRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:group/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:group/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a group rule from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.group.GroupFunctions;
     * import com.pulumi.okta.group.inputs.GetRuleArgs;
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
     *         final var test = GroupFunctions.getRule(GetRuleArgs.builder()
     *             .id(example.id())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:group/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
}
