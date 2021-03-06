/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.remote;

import org.openqa.selenium.remote.CapabilityType;

/**
 * The list of iOS-specific capabilities.
 * Read:
 * https://github.com/appium/appium/blob/1.5/docs/en/writing-running-appium/caps.md#ios-only
 */
public interface IOSMobileCapabilityType extends CapabilityType {

    /**
     * (Sim-only) Calendar format to set for the iOS Simulator.
     */
    String CALENDAR_FORMAT = "calendarFormat";

    /**
     * Bundle ID of the app under test. Useful for starting an app on a real device
     * or for using other caps which require the bundle ID during test startup.
     * To run a test on a real device using the bundle ID,
     * you may omit the 'app' capability, but you must provide 'udid'.
     */
    String BUNDLE_ID = "bundleId";

    /**
     * Amount of time in ms to wait for instruments before assuming it hung and
     * failing the session.
     */
    String LAUNCH_TIMEOUT = "launchTimeout";

    /**
     * (Sim-only) Force location services to be either on or off.
     * Default is to keep current sim setting.
     */
    String LOCATION_SERVICES_ENABLED = "locationServicesEnabled";

    /**
     * (Sim-only) Set location services to be authorized or not authorized for app via plist,
     * so that location services alert doesn't pop up. Default is to keep current sim
     * setting. Note that if you use this setting you MUST also use the bundleId
     * capability to send in your app's bundle ID.
     */
    String LOCATION_SERVICES_AUTHORIZED = "locationServicesAuthorized";

    /**
     * Accept all iOS alerts automatically if they pop up.
     * This includes privacy access permission alerts
     * (e.g., location, contacts, photos). Default is false.
     */
    String AUTO_ACCEPT_ALERTS = "autoAcceptAlerts";

    /**
     * Dismiss all iOS alerts automatically if they pop up.
     * This includes privacy access permission alerts (e.g.,
     * location, contacts, photos). Default is false.
     */
    String AUTO_DISMISS_ALERTS = "autoDismissAlerts";

    /**
     * Use native intruments lib (ie disable instruments-without-delay).
     */
    String NATIVE_INSTRUMENTS_LIB = "nativeInstrumentsLib";

    /**
     * (Sim-only) Enable "real", non-javascript-based web taps in Safari.
     * Default: false.
     * Warning: depending on viewport size/ratio this might not accurately tap an element.
     */
    String NATIVE_WEB_TAP = "nativeWebTap";

    /**
     * (Sim-only) (&gt;= 8.1) Initial safari url, default is a local welcome page.
     */
    String SAFARI_INITIAL_URL = "safariInitialUrl";

    /**
     * (Sim-only) Allow javascript to open new windows in Safari. Default keeps current sim
     * setting.
     */
    String SAFARI_ALLOW_POPUPS = "safariAllowPopups";

    /**
     * (Sim-only) Prevent Safari from showing a fraudulent website warning.
     * Default keeps current sim setting.
     */
    String SAFARI_IGNORE_FRAUD_WARNING = "safariIgnoreFraudWarning";

    /**
     * (Sim-only) Whether Safari should allow links to open in new windows.
     * Default keeps current sim setting.
     */
    String SAFARI_OPEN_LINKS_IN_BACKGROUND = "safariOpenLinksInBackground";

    /**
     * (Sim-only) Whether to keep keychains (Library/Keychains) when appium
     * session is started/finished.
     */
    String KEEP_KEY_CHAINS = "keepKeyChains";

    /**
     * Where to look for localizable strings. Default en.lproj.
     */
    String LOCALIZABLE_STRINGS_DIR = "localizableStringsDir";

    /**
     * Arguments to pass to the AUT using instruments.
     */
    String PROCESS_ARGUMENTS = "processArguments";

    /**
     * The delay, in ms, between keystrokes sent to an element when typing.
     */
    String INTER_KEY_DELAY = "interKeyDelay";

    /**
     * Whether to show any logs captured from a device in the appium logs. Default false.
     */
    String SHOW_IOS_LOG = "showIOSLog";

    /**
     * strategy to use to type test into a test field. Simulator default: oneByOne.
     * Real device default: grouped.
     */
    String SEND_KEY_STRATEGY = "sendKeyStrategy";

    /**
     * Max timeout in sec to wait for a screenshot to be generated. default: 10.
     */
    String SCREENSHOT_WAIT_TIMEOUT = "screenshotWaitTimeout";

    /**
     * The ios automation script used to determined if the app has been launched,
     * by default the system wait for the page source not to be empty.
     * The result must be a boolean.
     */
    String WAIT_FOR_APP_SCRIPT = "waitForAppScript";

    /**
     * Number of times to send connection message to remote debugger, to get webview.
     * Default: 8.
     */
    String WEBVIEW_CONNECT_RETRIES = "webviewConnectRetries";

    /**
     * The display name of the application under test. Used to automate backgrounding
     * the app in iOS 9+.
     */
    String APP_NAME = "appName";

    /**
     * Capability to pre-authorize a specific SSL cert in the iOS trust store.
     */
    String CUSTOM_SSL_CERT = "customSSLCert";

    /**
     * The desired capability to specify a length for tapping, if the regular
     * tap is too long for the app under test. The  XCUITest specific capability.
     */
    String TAP_WITH_SHORT_PRESS_DURATION = "tapWithShortPressDuration";

    /**
     * The capability to direct Appium to set the simulator scale.
     * The  XCUITest specific capability.
     */
    String SCALE_FACTOR = "scaleFactor";

    /**
     * This value if specified, will be used to forward traffic from Mac
     * host to real ios devices over USB. Default value is same as port
     * number used by WDA on device.
     * eg: 8100
     */
    String WDA_LOCAL_PORT = "wdaLocalPort";

    /**
     * Whether to display the output of the Xcode command
     * used to run the tests.If this is true,
     * there will be lots of extra logging at startup. Defaults to false
     */
    String SHOW_XCODE_LOG = "showXcodeLog";

    /**
     * Device logger for real devices. It could be path to deviceconsole
     * (installed with npm install deviceconsole, a compiled binary named
     * deviceconsole will be added to ./node_modules/deviceconsole/)
     * or idevicesyslog (comes with libimobiledevice). Defaults to idevicesyslog
     */
    String REAL_DEVICE_LOGGER = "realDeviceLogger";

    /**
     * Time in milliseconds to pause between installing the application
     * and starting WebDriverAgent on the device. Used particularly for larger applications.
     * Defaults to 0
     */
    String IOS_INSTALL_PAUSE = "iosInstallPause";

    /**
     * Full path to an optional Xcode configuration file that
     * specifies the code signing identity
     * and team for running the WebDriverAgent on the real device.
     * e.g., /path/to/myconfig.xcconfig
     */
    String XCODE_CONFIG_FILE = "xcodeConfigFile";

    /**
     * Password for unlocking keychain specified in keychainPath.
     */
    String KEYCHAIN_PASSWORD = "keychainPassword";

    /**
     * Skips the build phase of running the WDA app.
     * Building is then the responsibility of the user.
     * Only works for Xcode 8+. Defaults to false
     */
    String USE_PREBUILT_WDA = "usePrebuiltWDA";

    /**
     * Sets read only permissons to Attachments subfolder of WebDriverAgent
     * root inside Xcode's DerivedData.
     * This is necessary to prevent XCTest framework from
     * creating tons of unnecessary screenshots and logs,
     * which are impossible to shutdown using programming
     * interfaces provided by Apple
     */
    String PREVENT_WDAATTACHMENTS = "preventWDAAttachments";

    /**
     * Appium will connect to an existing WebDriverAgent,
     * instance at this URL instead of starting a new one.
     * eg : http://localhost:8100
     */
    String WEB_DRIVER_AGENT_URL = "webDriverAgentUrl";

    /**
     * Full path to the private development key exported
     * from the system keychain. Used in conjunction
     * with keychainPassword when testing on real devices.
     * e.g., /path/to/MyPrivateKey.p12
     */
    String KEYCHAIN_PATH = "keychainPath";

}