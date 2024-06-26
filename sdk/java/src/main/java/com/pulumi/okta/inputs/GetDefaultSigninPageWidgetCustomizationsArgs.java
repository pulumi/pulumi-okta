// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.okta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultSigninPageWidgetCustomizationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDefaultSigninPageWidgetCustomizationsArgs Empty = new GetDefaultSigninPageWidgetCustomizationsArgs();

    @Import(name="authenticatorPageCustomLinkLabel", required=true)
    private Output<String> authenticatorPageCustomLinkLabel;

    public Output<String> authenticatorPageCustomLinkLabel() {
        return this.authenticatorPageCustomLinkLabel;
    }

    @Import(name="authenticatorPageCustomLinkUrl", required=true)
    private Output<String> authenticatorPageCustomLinkUrl;

    public Output<String> authenticatorPageCustomLinkUrl() {
        return this.authenticatorPageCustomLinkUrl;
    }

    @Import(name="classicRecoveryFlowEmailOrUsernameLabel", required=true)
    private Output<String> classicRecoveryFlowEmailOrUsernameLabel;

    public Output<String> classicRecoveryFlowEmailOrUsernameLabel() {
        return this.classicRecoveryFlowEmailOrUsernameLabel;
    }

    @Import(name="customLink1Label", required=true)
    private Output<String> customLink1Label;

    public Output<String> customLink1Label() {
        return this.customLink1Label;
    }

    @Import(name="customLink1Url", required=true)
    private Output<String> customLink1Url;

    public Output<String> customLink1Url() {
        return this.customLink1Url;
    }

    @Import(name="customLink2Label", required=true)
    private Output<String> customLink2Label;

    public Output<String> customLink2Label() {
        return this.customLink2Label;
    }

    @Import(name="customLink2Url", required=true)
    private Output<String> customLink2Url;

    public Output<String> customLink2Url() {
        return this.customLink2Url;
    }

    @Import(name="forgotPasswordLabel", required=true)
    private Output<String> forgotPasswordLabel;

    public Output<String> forgotPasswordLabel() {
        return this.forgotPasswordLabel;
    }

    @Import(name="forgotPasswordUrl", required=true)
    private Output<String> forgotPasswordUrl;

    public Output<String> forgotPasswordUrl() {
        return this.forgotPasswordUrl;
    }

    @Import(name="helpLabel", required=true)
    private Output<String> helpLabel;

    public Output<String> helpLabel() {
        return this.helpLabel;
    }

    @Import(name="helpUrl", required=true)
    private Output<String> helpUrl;

    public Output<String> helpUrl() {
        return this.helpUrl;
    }

    @Import(name="passwordInfoTip", required=true)
    private Output<String> passwordInfoTip;

    public Output<String> passwordInfoTip() {
        return this.passwordInfoTip;
    }

    @Import(name="passwordLabel", required=true)
    private Output<String> passwordLabel;

    public Output<String> passwordLabel() {
        return this.passwordLabel;
    }

    @Import(name="showPasswordVisibilityToggle", required=true)
    private Output<Boolean> showPasswordVisibilityToggle;

    public Output<Boolean> showPasswordVisibilityToggle() {
        return this.showPasswordVisibilityToggle;
    }

    @Import(name="showUserIdentifier", required=true)
    private Output<Boolean> showUserIdentifier;

    public Output<Boolean> showUserIdentifier() {
        return this.showUserIdentifier;
    }

    @Import(name="signInLabel", required=true)
    private Output<String> signInLabel;

    public Output<String> signInLabel() {
        return this.signInLabel;
    }

    @Import(name="unlockAccountLabel", required=true)
    private Output<String> unlockAccountLabel;

    public Output<String> unlockAccountLabel() {
        return this.unlockAccountLabel;
    }

    @Import(name="unlockAccountUrl", required=true)
    private Output<String> unlockAccountUrl;

    public Output<String> unlockAccountUrl() {
        return this.unlockAccountUrl;
    }

    @Import(name="usernameInfoTip", required=true)
    private Output<String> usernameInfoTip;

    public Output<String> usernameInfoTip() {
        return this.usernameInfoTip;
    }

    @Import(name="usernameLabel", required=true)
    private Output<String> usernameLabel;

    public Output<String> usernameLabel() {
        return this.usernameLabel;
    }

    @Import(name="widgetGeneration", required=true)
    private Output<String> widgetGeneration;

    public Output<String> widgetGeneration() {
        return this.widgetGeneration;
    }

    private GetDefaultSigninPageWidgetCustomizationsArgs() {}

    private GetDefaultSigninPageWidgetCustomizationsArgs(GetDefaultSigninPageWidgetCustomizationsArgs $) {
        this.authenticatorPageCustomLinkLabel = $.authenticatorPageCustomLinkLabel;
        this.authenticatorPageCustomLinkUrl = $.authenticatorPageCustomLinkUrl;
        this.classicRecoveryFlowEmailOrUsernameLabel = $.classicRecoveryFlowEmailOrUsernameLabel;
        this.customLink1Label = $.customLink1Label;
        this.customLink1Url = $.customLink1Url;
        this.customLink2Label = $.customLink2Label;
        this.customLink2Url = $.customLink2Url;
        this.forgotPasswordLabel = $.forgotPasswordLabel;
        this.forgotPasswordUrl = $.forgotPasswordUrl;
        this.helpLabel = $.helpLabel;
        this.helpUrl = $.helpUrl;
        this.passwordInfoTip = $.passwordInfoTip;
        this.passwordLabel = $.passwordLabel;
        this.showPasswordVisibilityToggle = $.showPasswordVisibilityToggle;
        this.showUserIdentifier = $.showUserIdentifier;
        this.signInLabel = $.signInLabel;
        this.unlockAccountLabel = $.unlockAccountLabel;
        this.unlockAccountUrl = $.unlockAccountUrl;
        this.usernameInfoTip = $.usernameInfoTip;
        this.usernameLabel = $.usernameLabel;
        this.widgetGeneration = $.widgetGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultSigninPageWidgetCustomizationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultSigninPageWidgetCustomizationsArgs $;

        public Builder() {
            $ = new GetDefaultSigninPageWidgetCustomizationsArgs();
        }

        public Builder(GetDefaultSigninPageWidgetCustomizationsArgs defaults) {
            $ = new GetDefaultSigninPageWidgetCustomizationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticatorPageCustomLinkLabel(Output<String> authenticatorPageCustomLinkLabel) {
            $.authenticatorPageCustomLinkLabel = authenticatorPageCustomLinkLabel;
            return this;
        }

        public Builder authenticatorPageCustomLinkLabel(String authenticatorPageCustomLinkLabel) {
            return authenticatorPageCustomLinkLabel(Output.of(authenticatorPageCustomLinkLabel));
        }

        public Builder authenticatorPageCustomLinkUrl(Output<String> authenticatorPageCustomLinkUrl) {
            $.authenticatorPageCustomLinkUrl = authenticatorPageCustomLinkUrl;
            return this;
        }

        public Builder authenticatorPageCustomLinkUrl(String authenticatorPageCustomLinkUrl) {
            return authenticatorPageCustomLinkUrl(Output.of(authenticatorPageCustomLinkUrl));
        }

        public Builder classicRecoveryFlowEmailOrUsernameLabel(Output<String> classicRecoveryFlowEmailOrUsernameLabel) {
            $.classicRecoveryFlowEmailOrUsernameLabel = classicRecoveryFlowEmailOrUsernameLabel;
            return this;
        }

        public Builder classicRecoveryFlowEmailOrUsernameLabel(String classicRecoveryFlowEmailOrUsernameLabel) {
            return classicRecoveryFlowEmailOrUsernameLabel(Output.of(classicRecoveryFlowEmailOrUsernameLabel));
        }

        public Builder customLink1Label(Output<String> customLink1Label) {
            $.customLink1Label = customLink1Label;
            return this;
        }

        public Builder customLink1Label(String customLink1Label) {
            return customLink1Label(Output.of(customLink1Label));
        }

        public Builder customLink1Url(Output<String> customLink1Url) {
            $.customLink1Url = customLink1Url;
            return this;
        }

        public Builder customLink1Url(String customLink1Url) {
            return customLink1Url(Output.of(customLink1Url));
        }

        public Builder customLink2Label(Output<String> customLink2Label) {
            $.customLink2Label = customLink2Label;
            return this;
        }

        public Builder customLink2Label(String customLink2Label) {
            return customLink2Label(Output.of(customLink2Label));
        }

        public Builder customLink2Url(Output<String> customLink2Url) {
            $.customLink2Url = customLink2Url;
            return this;
        }

        public Builder customLink2Url(String customLink2Url) {
            return customLink2Url(Output.of(customLink2Url));
        }

        public Builder forgotPasswordLabel(Output<String> forgotPasswordLabel) {
            $.forgotPasswordLabel = forgotPasswordLabel;
            return this;
        }

        public Builder forgotPasswordLabel(String forgotPasswordLabel) {
            return forgotPasswordLabel(Output.of(forgotPasswordLabel));
        }

        public Builder forgotPasswordUrl(Output<String> forgotPasswordUrl) {
            $.forgotPasswordUrl = forgotPasswordUrl;
            return this;
        }

        public Builder forgotPasswordUrl(String forgotPasswordUrl) {
            return forgotPasswordUrl(Output.of(forgotPasswordUrl));
        }

        public Builder helpLabel(Output<String> helpLabel) {
            $.helpLabel = helpLabel;
            return this;
        }

        public Builder helpLabel(String helpLabel) {
            return helpLabel(Output.of(helpLabel));
        }

        public Builder helpUrl(Output<String> helpUrl) {
            $.helpUrl = helpUrl;
            return this;
        }

        public Builder helpUrl(String helpUrl) {
            return helpUrl(Output.of(helpUrl));
        }

        public Builder passwordInfoTip(Output<String> passwordInfoTip) {
            $.passwordInfoTip = passwordInfoTip;
            return this;
        }

        public Builder passwordInfoTip(String passwordInfoTip) {
            return passwordInfoTip(Output.of(passwordInfoTip));
        }

        public Builder passwordLabel(Output<String> passwordLabel) {
            $.passwordLabel = passwordLabel;
            return this;
        }

        public Builder passwordLabel(String passwordLabel) {
            return passwordLabel(Output.of(passwordLabel));
        }

        public Builder showPasswordVisibilityToggle(Output<Boolean> showPasswordVisibilityToggle) {
            $.showPasswordVisibilityToggle = showPasswordVisibilityToggle;
            return this;
        }

        public Builder showPasswordVisibilityToggle(Boolean showPasswordVisibilityToggle) {
            return showPasswordVisibilityToggle(Output.of(showPasswordVisibilityToggle));
        }

        public Builder showUserIdentifier(Output<Boolean> showUserIdentifier) {
            $.showUserIdentifier = showUserIdentifier;
            return this;
        }

        public Builder showUserIdentifier(Boolean showUserIdentifier) {
            return showUserIdentifier(Output.of(showUserIdentifier));
        }

        public Builder signInLabel(Output<String> signInLabel) {
            $.signInLabel = signInLabel;
            return this;
        }

        public Builder signInLabel(String signInLabel) {
            return signInLabel(Output.of(signInLabel));
        }

        public Builder unlockAccountLabel(Output<String> unlockAccountLabel) {
            $.unlockAccountLabel = unlockAccountLabel;
            return this;
        }

        public Builder unlockAccountLabel(String unlockAccountLabel) {
            return unlockAccountLabel(Output.of(unlockAccountLabel));
        }

        public Builder unlockAccountUrl(Output<String> unlockAccountUrl) {
            $.unlockAccountUrl = unlockAccountUrl;
            return this;
        }

        public Builder unlockAccountUrl(String unlockAccountUrl) {
            return unlockAccountUrl(Output.of(unlockAccountUrl));
        }

        public Builder usernameInfoTip(Output<String> usernameInfoTip) {
            $.usernameInfoTip = usernameInfoTip;
            return this;
        }

        public Builder usernameInfoTip(String usernameInfoTip) {
            return usernameInfoTip(Output.of(usernameInfoTip));
        }

        public Builder usernameLabel(Output<String> usernameLabel) {
            $.usernameLabel = usernameLabel;
            return this;
        }

        public Builder usernameLabel(String usernameLabel) {
            return usernameLabel(Output.of(usernameLabel));
        }

        public Builder widgetGeneration(Output<String> widgetGeneration) {
            $.widgetGeneration = widgetGeneration;
            return this;
        }

        public Builder widgetGeneration(String widgetGeneration) {
            return widgetGeneration(Output.of(widgetGeneration));
        }

        public GetDefaultSigninPageWidgetCustomizationsArgs build() {
            if ($.authenticatorPageCustomLinkLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "authenticatorPageCustomLinkLabel");
            }
            if ($.authenticatorPageCustomLinkUrl == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "authenticatorPageCustomLinkUrl");
            }
            if ($.classicRecoveryFlowEmailOrUsernameLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "classicRecoveryFlowEmailOrUsernameLabel");
            }
            if ($.customLink1Label == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "customLink1Label");
            }
            if ($.customLink1Url == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "customLink1Url");
            }
            if ($.customLink2Label == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "customLink2Label");
            }
            if ($.customLink2Url == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "customLink2Url");
            }
            if ($.forgotPasswordLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "forgotPasswordLabel");
            }
            if ($.forgotPasswordUrl == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "forgotPasswordUrl");
            }
            if ($.helpLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "helpLabel");
            }
            if ($.helpUrl == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "helpUrl");
            }
            if ($.passwordInfoTip == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "passwordInfoTip");
            }
            if ($.passwordLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "passwordLabel");
            }
            if ($.showPasswordVisibilityToggle == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "showPasswordVisibilityToggle");
            }
            if ($.showUserIdentifier == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "showUserIdentifier");
            }
            if ($.signInLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "signInLabel");
            }
            if ($.unlockAccountLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "unlockAccountLabel");
            }
            if ($.unlockAccountUrl == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "unlockAccountUrl");
            }
            if ($.usernameInfoTip == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "usernameInfoTip");
            }
            if ($.usernameLabel == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "usernameLabel");
            }
            if ($.widgetGeneration == null) {
                throw new MissingRequiredPropertyException("GetDefaultSigninPageWidgetCustomizationsArgs", "widgetGeneration");
            }
            return $;
        }
    }

}
