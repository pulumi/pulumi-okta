// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.auth;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.okta.Utilities;
import com.pulumi.okta.auth.inputs.GetServerArgs;
import com.pulumi.okta.auth.inputs.GetServerPlainArgs;
import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
import com.pulumi.okta.auth.inputs.GetServerPolicyPlainArgs;
import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
import com.pulumi.okta.auth.inputs.GetServerScopesPlainArgs;
import com.pulumi.okta.auth.outputs.GetServerPolicyResult;
import com.pulumi.okta.auth.outputs.GetServerResult;
import com.pulumi.okta.auth.outputs.GetServerScopesResult;
import java.util.concurrent.CompletableFuture;

public final class AuthFunctions {
    /**
     * Get an auth server from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerArgs;
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
     *         final var example = AuthFunctions.getServer(GetServerArgs.builder()
     *             .name("Example Auth")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * Get an auth server from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerArgs;
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
     *         final var example = AuthFunctions.getServer(GetServerArgs.builder()
     *             .name("Example Auth")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get an auth server from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerArgs;
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
     *         final var example = AuthFunctions.getServer(GetServerArgs.builder()
     *             .name("Example Auth")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an auth server from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerArgs;
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
     *         final var example = AuthFunctions.getServer(GetServerArgs.builder()
     *             .name("Example Auth")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an auth server from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerArgs;
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
     *         final var example = AuthFunctions.getServer(GetServerArgs.builder()
     *             .name("Example Auth")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:auth/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an authorization server policy from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
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
     *         final var example = AuthFunctions.getServerPolicy(GetServerPolicyArgs.builder()
     *             .authServerId("<auth server id>")
     *             .name("staff")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerPolicyResult> getServerPolicy(GetServerPolicyArgs args) {
        return getServerPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Get an authorization server policy from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
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
     *         final var example = AuthFunctions.getServerPolicy(GetServerPolicyArgs.builder()
     *             .authServerId("<auth server id>")
     *             .name("staff")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerPolicyResult> getServerPolicyPlain(GetServerPolicyPlainArgs args) {
        return getServerPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get an authorization server policy from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
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
     *         final var example = AuthFunctions.getServerPolicy(GetServerPolicyArgs.builder()
     *             .authServerId("<auth server id>")
     *             .name("staff")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerPolicyResult> getServerPolicy(GetServerPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServerPolicy:getServerPolicy", TypeShape.of(GetServerPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an authorization server policy from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
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
     *         final var example = AuthFunctions.getServerPolicy(GetServerPolicyArgs.builder()
     *             .authServerId("<auth server id>")
     *             .name("staff")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerPolicyResult> getServerPolicy(GetServerPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServerPolicy:getServerPolicy", TypeShape.of(GetServerPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an authorization server policy from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerPolicyArgs;
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
     *         final var example = AuthFunctions.getServerPolicy(GetServerPolicyArgs.builder()
     *             .authServerId("<auth server id>")
     *             .name("staff")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerPolicyResult> getServerPolicyPlain(GetServerPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:auth/getServerPolicy:getServerPolicy", TypeShape.of(GetServerPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list of authorization server scopes from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
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
     *         final var test = AuthFunctions.getServerScopes(GetServerScopesArgs.builder()
     *             .authServerId("default")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerScopesResult> getServerScopes(GetServerScopesArgs args) {
        return getServerScopes(args, InvokeOptions.Empty);
    }
    /**
     * Get a list of authorization server scopes from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
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
     *         final var test = AuthFunctions.getServerScopes(GetServerScopesArgs.builder()
     *             .authServerId("default")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerScopesResult> getServerScopesPlain(GetServerScopesPlainArgs args) {
        return getServerScopesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a list of authorization server scopes from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
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
     *         final var test = AuthFunctions.getServerScopes(GetServerScopesArgs.builder()
     *             .authServerId("default")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerScopesResult> getServerScopes(GetServerScopesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServerScopes:getServerScopes", TypeShape.of(GetServerScopesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list of authorization server scopes from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
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
     *         final var test = AuthFunctions.getServerScopes(GetServerScopesArgs.builder()
     *             .authServerId("default")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerScopesResult> getServerScopes(GetServerScopesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("okta:auth/getServerScopes:getServerScopes", TypeShape.of(GetServerScopesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list of authorization server scopes from Okta.
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
     * import com.pulumi.okta.auth.AuthFunctions;
     * import com.pulumi.okta.auth.inputs.GetServerScopesArgs;
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
     *         final var test = AuthFunctions.getServerScopes(GetServerScopesArgs.builder()
     *             .authServerId("default")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerScopesResult> getServerScopesPlain(GetServerScopesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:auth/getServerScopes:getServerScopes", TypeShape.of(GetServerScopesResult.class), args, Utilities.withVersion(options));
    }
}
