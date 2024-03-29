// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.Index;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.okta.Index.inputs.GetDefaultSigninPageArgs;
import com.pulumi.okta.Index.inputs.GetDefaultSigninPagePlainArgs;
import com.pulumi.okta.Index.inputs.GetDomainArgs;
import com.pulumi.okta.Index.inputs.GetDomainPlainArgs;
import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
import com.pulumi.okta.Index.inputs.GetLogStreamPlainArgs;
import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
import com.pulumi.okta.Index.inputs.GetOrgMetadataPlainArgs;
import com.pulumi.okta.Index.outputs.GetDefaultSigninPageResult;
import com.pulumi.okta.Index.outputs.GetDomainResult;
import com.pulumi.okta.Index.outputs.GetLogStreamResult;
import com.pulumi.okta.Index.outputs.GetOrgMetadataResult;
import com.pulumi.okta.Utilities;
import java.util.concurrent.CompletableFuture;

public final class IndexFunctions {
    public static Output<GetDefaultSigninPageResult> getDefaultSigninPage(GetDefaultSigninPageArgs args) {
        return getDefaultSigninPage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDefaultSigninPageResult> getDefaultSigninPagePlain(GetDefaultSigninPagePlainArgs args) {
        return getDefaultSigninPagePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetDefaultSigninPageResult> getDefaultSigninPage(GetDefaultSigninPageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:Index/getDefaultSigninPage:getDefaultSigninPage", TypeShape.of(GetDefaultSigninPageResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDefaultSigninPageResult> getDefaultSigninPagePlain(GetDefaultSigninPagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:Index/getDefaultSigninPage:getDefaultSigninPage", TypeShape.of(GetDefaultSigninPageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a domain from Okta.
     * 
     * - https://developer.okta.com/docs/reference/api/domains/#get-domain
     * - https://developer.okta.com/docs/reference/api/domains/#domainresponse-object
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Domain;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetDomainArgs;
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
     *         var example = new Domain(&#34;example&#34;);
     * 
     *         final var by-name = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(&#34;www.example.com&#34;)
     *             .build());
     * 
     *         final var by-id = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(example.id())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a domain from Okta.
     * 
     * - https://developer.okta.com/docs/reference/api/domains/#get-domain
     * - https://developer.okta.com/docs/reference/api/domains/#domainresponse-object
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Domain;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetDomainArgs;
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
     *         var example = new Domain(&#34;example&#34;);
     * 
     *         final var by-name = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(&#34;www.example.com&#34;)
     *             .build());
     * 
     *         final var by-id = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(example.id())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args) {
        return getDomainPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a domain from Okta.
     * 
     * - https://developer.okta.com/docs/reference/api/domains/#get-domain
     * - https://developer.okta.com/docs/reference/api/domains/#domainresponse-object
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Domain;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetDomainArgs;
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
     *         var example = new Domain(&#34;example&#34;);
     * 
     *         final var by-name = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(&#34;www.example.com&#34;)
     *             .build());
     * 
     *         final var by-id = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(example.id())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:Index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a domain from Okta.
     * 
     * - https://developer.okta.com/docs/reference/api/domains/#get-domain
     * - https://developer.okta.com/docs/reference/api/domains/#domainresponse-object
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Domain;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetDomainArgs;
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
     *         var example = new Domain(&#34;example&#34;);
     * 
     *         final var by-name = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(&#34;www.example.com&#34;)
     *             .build());
     * 
     *         final var by-id = IndexFunctions.getDomain(GetDomainArgs.builder()
     *             .domainIdOrName(example.id())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:Index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLogStreamResult> getLogStream() {
        return getLogStream(GetLogStreamArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLogStreamResult> getLogStreamPlain() {
        return getLogStreamPlain(GetLogStreamPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLogStreamResult> getLogStream(GetLogStreamArgs args) {
        return getLogStream(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLogStreamResult> getLogStreamPlain(GetLogStreamPlainArgs args) {
        return getLogStreamPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLogStreamResult> getLogStream(GetLogStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:Index/getLogStream:getLogStream", TypeShape.of(GetLogStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve a log stream from Okta.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetLogStreamArgs;
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
     *         final var example = IndexFunctions.getLogStream(GetLogStreamArgs.builder()
     *             .name(&#34;Example Stream&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLogStreamResult> getLogStreamPlain(GetLogStreamPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:Index/getLogStream:getLogStream", TypeShape.of(GetLogStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOrgMetadataResult> getOrgMetadata() {
        return getOrgMetadata(GetOrgMetadataArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOrgMetadataResult> getOrgMetadataPlain() {
        return getOrgMetadataPlain(GetOrgMetadataPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOrgMetadataResult> getOrgMetadata(GetOrgMetadataArgs args) {
        return getOrgMetadata(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOrgMetadataResult> getOrgMetadataPlain(GetOrgMetadataPlainArgs args) {
        return getOrgMetadataPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOrgMetadataResult> getOrgMetadata(GetOrgMetadataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("okta:Index/getOrgMetadata:getOrgMetadata", TypeShape.of(GetOrgMetadataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the well-known org metadata, which includes the id, configured custom domains, authentication pipeline, and various other org settings.
     * 
     * - [Org Well Known Metadata Reference](https://developer.okta.com/docs/api/openapi/okta-management/management/tag/OrgSetting/#tag/OrgSetting/operation/getWellknownOrgMetadata)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.okta.Index.IndexFunctions;
     * import com.pulumi.okta.Index.inputs.GetOrgMetadataArgs;
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
     *         final var test = IndexFunctions.getOrgMetadata();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOrgMetadataResult> getOrgMetadataPlain(GetOrgMetadataPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("okta:Index/getOrgMetadata:getOrgMetadata", TypeShape.of(GetOrgMetadataResult.class), args, Utilities.withVersion(options));
    }
}
