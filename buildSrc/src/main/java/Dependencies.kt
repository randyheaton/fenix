/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// If you ever need to force a toolchain rebuild (taskcluster) then edit the following comment.
// FORCE REBUILD 2022-12-11

object FenixVersions {
    const val kotlin = "1.7.20"
    const val coroutines = "1.6.4"

    // These versions are linked: lint should be X+23.Y.Z of gradle_plugin version, according to:
    // https://github.com/alexjlockwood/android-lint-checks-demo/blob/0245fc027463137b1b4afb97c5295d60dce998b6/dependencies.gradle#L3
    const val android_gradle_plugin = "7.2.2"
    const val android_lint_api = "30.3.0"

    const val sentry = "6.13.1"
    const val leakcanary = "2.10"
    const val osslicenses_plugin = "0.10.4"
    const val detekt = "1.19.0"
    const val jna = "5.12.1"

    const val androidx_compose = "1.3.1"
    const val androidx_compose_compiler = "1.3.2"
    const val androidx_appcompat = "1.3.0"
    const val androidx_benchmark = "1.0.0"
    const val androidx_biometric = "1.1.0"
    const val androidx_coordinator_layout = "1.1.0"
    const val androidx_constraint_layout = "2.0.4"
    const val androidx_preference = "1.1.1"
    const val androidx_legacy = "1.0.0"
    const val androidx_annotation = "1.5.0"
    const val androidx_lifecycle = "2.5.1"
    const val androidx_fragment = "1.5.1"
    const val androidx_navigation = "2.5.1"
    const val androidx_recyclerview = "1.2.1"
    const val androidx_core = "1.8.0"
    const val androidx_paging = "3.1.1"
    const val androidx_transition = "1.4.0"
    const val androidx_work = "2.7.1"
    const val androidx_datastore = "1.0.0"
    const val google_material = "1.2.1"
    const val accompanist_drawablepainter = "0.23.1"
    const val accompanist_insets = "0.23.1"

    const val mozilla_android_components = AndroidComponents.VERSION

    const val adjust = "4.33.0"
    const val installreferrer = "2.2"

    const val junit = "5.5.2"
    const val mockk = "1.12.0"

    const val mockwebserver = "4.10.0"
    const val uiautomator = "2.2.0"
    const val robolectric = "4.9"

    const val google_ads_id_version = "16.0.0"

    const val google_play_review_version = "2.0.0"

    const val protobuf = "3.21.10" // keep in sync with the version used in AS.
}

@Suppress("unused")
object FenixDependencies {
    const val tools_androidgradle = "com.android.tools.build:gradle:${FenixVersions.android_gradle_plugin}"
    const val tools_kotlingradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${FenixVersions.kotlin}"
    const val tools_benchmarkgradle = "androidx.benchmark:benchmark-gradle-plugin:${FenixVersions.androidx_benchmark}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${FenixVersions.kotlin}"
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${FenixVersions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${FenixVersions.kotlin}"
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${FenixVersions.coroutines}"
    const val kotlin_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${FenixVersions.coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${FenixVersions.coroutines}"

    const val osslicenses_plugin = "com.google.android.gms:oss-licenses-plugin:${FenixVersions.osslicenses_plugin}"

    const val mozilla_compose_awesomebar = "org.mozilla.components:compose-awesomebar:${FenixVersions.mozilla_android_components}"
    const val mozilla_compose_cfr = "org.mozilla.components:compose-cfr:${FenixVersions.mozilla_android_components}"

    const val mozilla_concept_awesomebar = "org.mozilla.components:concept-awesomebar:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_base = "org.mozilla.components:concept-base:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_engine = "org.mozilla.components:concept-engine:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_menu = "org.mozilla.components:concept-menu:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_push = "org.mozilla.components:concept-push:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_tabstray = "org.mozilla.components:concept-tabstray:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_toolbar = "org.mozilla.components:concept-toolbar:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_storage = "org.mozilla.components:concept-storage:${FenixVersions.mozilla_android_components}"
    const val mozilla_concept_sync = "org.mozilla.components:concept-sync:${FenixVersions.mozilla_android_components}"

    const val mozilla_browser_engine_gecko = "org.mozilla.components:browser-engine-gecko:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_domains = "org.mozilla.components:browser-domains:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_icons = "org.mozilla.components:browser-icons:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_session_storage = "org.mozilla.components:browser-session-storage:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_state = "org.mozilla.components:browser-state:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_tabstray = "org.mozilla.components:browser-tabstray:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_thumbnails = "org.mozilla.components:browser-thumbnails:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_toolbar = "org.mozilla.components:browser-toolbar:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_menu = "org.mozilla.components:browser-menu:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_menu2 = "org.mozilla.components:browser-menu2:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_errorpages = "org.mozilla.components:browser-errorpages:${FenixVersions.mozilla_android_components}"
    const val mozilla_browser_storage_sync = "org.mozilla.components:browser-storage-sync:${FenixVersions.mozilla_android_components}"

    const val mozilla_feature_addons = "org.mozilla.components:feature-addons:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_extensions = "org.mozilla.components:support-webextensions:${FenixVersions.mozilla_android_components}"

    const val mozilla_feature_accounts = "org.mozilla.components:feature-accounts:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_app_links = "org.mozilla.components:feature-app-links:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_autofill = "org.mozilla.components:feature-autofill:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_awesomebar = "org.mozilla.components:feature-awesomebar:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_contextmenu = "org.mozilla.components:feature-contextmenu:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_customtabs = "org.mozilla.components:feature-customtabs:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_intent = "org.mozilla.components:feature-intent:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_media = "org.mozilla.components:feature-media:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_qr = "org.mozilla.components:feature-qr:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_search = "org.mozilla.components:feature-search:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_session = "org.mozilla.components:feature-session:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_syncedtabs = "org.mozilla.components:feature-syncedtabs:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_tabs = "org.mozilla.components:feature-tabs:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_downloads = "org.mozilla.components:feature-downloads:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_storage = "org.mozilla.components:feature-storage:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_prompts = "org.mozilla.components:feature-prompts:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_push = "org.mozilla.components:feature-push:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_privatemode = "org.mozilla.components:feature-privatemode:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_pwa = "org.mozilla.components:feature-pwa:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_toolbar = "org.mozilla.components:feature-toolbar:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_findinpage = "org.mozilla.components:feature-findinpage:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_logins = "org.mozilla.components:feature-logins:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_site_permissions = "org.mozilla.components:feature-sitepermissions:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_readerview = "org.mozilla.components:feature-readerview:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_tab_collections = "org.mozilla.components:feature-tab-collections:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_recentlyclosed = "org.mozilla.components:feature-recentlyclosed:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_accounts_push = "org.mozilla.components:feature-accounts-push:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_top_sites = "org.mozilla.components:feature-top-sites:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_share = "org.mozilla.components:feature-share:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_webauthn = "org.mozilla.components:feature-webauthn:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_webcompat = "org.mozilla.components:feature-webcompat:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_webnotifications = "org.mozilla.components:feature-webnotifications:${FenixVersions.mozilla_android_components}"
    const val mozilla_feature_webcompat_reporter = "org.mozilla.components:feature-webcompat-reporter:${FenixVersions.mozilla_android_components}"

    const val mozilla_service_pocket = "org.mozilla.components:service-pocket:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_contile =
        "org.mozilla.components:service-contile:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_digitalassetlinks =
        "org.mozilla.components:service-digitalassetlinks:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_sync_autofill =
        "org.mozilla.components:service-sync-autofill:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_sync_logins =
        "org.mozilla.components:service-sync-logins:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_firefox_accounts = "org.mozilla.components:service-firefox-accounts:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_glean = "org.mozilla.components:service-glean:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_location = "org.mozilla.components:service-location:${FenixVersions.mozilla_android_components}"
    const val mozilla_service_nimbus = "org.mozilla.components:service-nimbus:${FenixVersions.mozilla_android_components}"

    const val mozilla_ui_colors = "org.mozilla.components:ui-colors:${FenixVersions.mozilla_android_components}"
    const val mozilla_ui_icons = "org.mozilla.components:ui-icons:${FenixVersions.mozilla_android_components}"
    const val mozilla_ui_widgets = "org.mozilla.components:ui-widgets:${FenixVersions.mozilla_android_components}"
    const val mozilla_ui_tabcounter = "org.mozilla.components:ui-tabcounter:${FenixVersions.mozilla_android_components}"

    const val mozilla_lib_crash = "org.mozilla.components:lib-crash:${FenixVersions.mozilla_android_components}"
    const val lib_crash_sentry =
        "org.mozilla.components:lib-crash-sentry:${FenixVersions.mozilla_android_components}"
    const val mozilla_lib_push_firebase = "org.mozilla.components:lib-push-firebase:${FenixVersions.mozilla_android_components}"
    const val mozilla_lib_dataprotect = "org.mozilla.components:lib-dataprotect:${FenixVersions.mozilla_android_components}"
    const val mozilla_lib_state = "org.mozilla.components:lib-state:${FenixVersions.mozilla_android_components}"

    const val mozilla_lib_publicsuffixlist = "org.mozilla.components:lib-publicsuffixlist:${FenixVersions.mozilla_android_components}"

    const val mozilla_support_base = "org.mozilla.components:support-base:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_rusterrors = "org.mozilla.components:support-rusterrors:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_images = "org.mozilla.components:support-images:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_ktx = "org.mozilla.components:support-ktx:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_rusthttp = "org.mozilla.components:support-rusthttp:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_rustlog = "org.mozilla.components:support-rustlog:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_utils = "org.mozilla.components:support-utils:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_test = "org.mozilla.components:support-test:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_test_libstate = "org.mozilla.components:support-test-libstate:${FenixVersions.mozilla_android_components}"
    const val mozilla_support_locale = "org.mozilla.components:support-locale:${FenixVersions.mozilla_android_components}"

    const val sentry = "io.sentry:sentry-android:${FenixVersions.sentry}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android-core:${FenixVersions.leakcanary}"

    const val androidx_compose_ui = "androidx.compose.ui:ui:${FenixVersions.androidx_compose}"
    const val androidx_compose_ui_test = "androidx.compose.ui:ui-test-junit4:${FenixVersions.androidx_compose}"
    const val androidx_compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${FenixVersions.androidx_compose}"
    const val androidx_compose_ui_tooling = "androidx.compose.ui:ui-tooling:${FenixVersions.androidx_compose}"
    const val androidx_compose_foundation = "androidx.compose.foundation:foundation:${FenixVersions.androidx_compose}"
    const val androidx_compose_material = "androidx.compose.material:material:${FenixVersions.androidx_compose}"
    const val androidx_annotation = "androidx.annotation:annotation:${FenixVersions.androidx_annotation}"
    const val androidx_benchmark_junit4 = "androidx.benchmark:benchmark-junit4:${FenixVersions.androidx_benchmark}"
    const val androidx_biometric = "androidx.biometric:biometric:${FenixVersions.androidx_biometric}"
    const val androidx_fragment = "androidx.fragment:fragment-ktx:${FenixVersions.androidx_fragment}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${FenixVersions.androidx_appcompat}"
    const val androidx_coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:${FenixVersions.androidx_coordinator_layout}"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${FenixVersions.androidx_constraint_layout}"
    const val androidx_legacy = "androidx.legacy:legacy-support-v4:${FenixVersions.androidx_legacy}"
    const val androidx_lifecycle_common = "androidx.lifecycle:lifecycle-common:${FenixVersions.androidx_lifecycle}"
    const val androidx_lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${FenixVersions.androidx_lifecycle}"
    const val androidx_lifecycle_process = "androidx.lifecycle:lifecycle-process:${FenixVersions.androidx_lifecycle}"
    const val androidx_lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${FenixVersions.androidx_lifecycle}"
    const val androidx_lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${FenixVersions.androidx_lifecycle}"
    const val androidx_paging = "androidx.paging:paging-runtime-ktx:${FenixVersions.androidx_paging}"
    const val androidx_preference = "androidx.preference:preference-ktx:${FenixVersions.androidx_preference}"
    const val androidx_safeargs = "androidx.navigation:navigation-safe-args-gradle-plugin:${FenixVersions.androidx_navigation}"
    const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${FenixVersions.androidx_navigation}"
    const val androidx_navigation_ui = "androidx.navigation:navigation-ui:${FenixVersions.androidx_navigation}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${FenixVersions.androidx_recyclerview}"
    const val androidx_core = "androidx.core:core:${FenixVersions.androidx_core}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${FenixVersions.androidx_core}"
    const val androidx_transition = "androidx.transition:transition:${FenixVersions.androidx_transition}"
    const val androidx_work_ktx = "androidx.work:work-runtime-ktx:${FenixVersions.androidx_work}"
    const val androidx_work_testing = "androidx.work:work-testing:${FenixVersions.androidx_work}"
    const val androidx_datastore = "androidx.datastore:datastore:${FenixVersions.androidx_datastore}"
    const val google_material = "com.google.android.material:material:${FenixVersions.google_material}"
    const val google_accompanist_drawablepainter =
        "com.google.accompanist:accompanist-drawablepainter:${FenixVersions.accompanist_drawablepainter}"
    const val google_accompanist_insets =
        "com.google.accompanist:accompanist-insets:${FenixVersions.accompanist_drawablepainter}"

    const val protobuf_javalite = "com.google.protobuf:protobuf-javalite:${FenixVersions.protobuf}"
    const val protobuf_compiler = "com.google.protobuf:protoc:${FenixVersions.protobuf}"

    const val adjust = "com.adjust.sdk:adjust-android:${FenixVersions.adjust}"
    const val installreferrer = "com.android.installreferrer:installreferrer:${FenixVersions.installreferrer}"

    const val jna = "net.java.dev.jna:jna:${FenixVersions.jna}@jar"

    const val junit = "junit:junit:${FenixVersions.junit}"
    const val mockk = "io.mockk:mockk:${FenixVersions.mockk}"
    const val mockk_android = "io.mockk:mockk-android:${FenixVersions.mockk}"

    // --- START AndroidX test dependencies --- //
    // N.B.: the versions of these dependencies appear to be pinned together. To avoid bugs, they
    // should always be updated together based on the latest version from the Android test releases page:
    //   https://developer.android.com/jetpack/androidx/releases/test
    // For the full IDs of these test dependencies, see:
    //   https://developer.android.com/training/testing/set-up-project#android-test-dependencies
    private const val androidx_test_shared_version = "1.5.0"
    private const val androidx_test_junit = "1.1.5"
    private const val androidx_test_orchestrator = "1.4.2"
    private const val androidx_test_runner = "1.5.2"
    const val androidx_test_core = "androidx.test:core:$androidx_test_shared_version"
    private const val androidx_espresso_version = "3.5.1"
    const val espresso_core = "androidx.test.espresso:espresso-core:$androidx_espresso_version"
    const val espresso_contrib = "androidx.test.espresso:espresso-contrib:$androidx_espresso_version"
    const val espresso_idling_resources = "androidx.test.espresso:espresso-idling-resource:$androidx_espresso_version"
    const val espresso_intents = "androidx.test.espresso:espresso-intents:$androidx_espresso_version"
    const val androidx_junit = "androidx.test.ext:junit:$androidx_test_junit"
    const val androidx_test_extensions = "androidx.test.ext:junit-ktx:$androidx_test_junit"
    // Monitor is unused
    const val orchestrator = "androidx.test:orchestrator:$androidx_test_orchestrator"
    const val tools_test_runner = "androidx.test:runner:$androidx_test_runner"
    const val tools_test_rules = "androidx.test:rules:$androidx_test_shared_version"
    // Truth is unused
    // Test services is unused
    // --- END AndroidX test dependencies --- //

    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${FenixVersions.mockwebserver}"
    const val uiautomator = "androidx.test.uiautomator:uiautomator:${FenixVersions.uiautomator}"
    const val robolectric = "org.robolectric:robolectric:${FenixVersions.robolectric}"

    const val google_ads_id = "com.google.android.gms:play-services-ads-identifier:${FenixVersions.google_ads_id_version}"

    // Required for in-app reviews
    const val google_play_review = "com.google.android.play:review:${FenixVersions.google_play_review_version}"
    const val google_play_review_ktx = "com.google.android.play:review-ktx:${FenixVersions.google_play_review_version}"

    const val detektApi = "io.gitlab.arturbosch.detekt:detekt-api:${FenixVersions.detekt}"
    const val detektTest = "io.gitlab.arturbosch.detekt:detekt-test:${FenixVersions.detekt}"
    const val junitApi = "org.junit.jupiter:junit-jupiter-api:${FenixVersions.junit}"
    const val junitParams = "org.junit.jupiter:junit-jupiter-params:${FenixVersions.junit}"
    const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${FenixVersions.junit}"
}

/**
 * Functionality to limit specific dependencies to specific repositories. These are typically expected to be used by
 * dependency group name (i.e. with `include/excludeGroup`). For additional info, see:
 * https://docs.gradle.org/current/userguide/declaring_repositories.html#sec::matching_repositories_to_dependencies
 *
 * Note: I wanted to nest this in Deps but for some reason gradle can't find it so it's top-level now. :|
 */
object RepoMatching {
    const val mozilla = "org\\.mozilla\\..*"
    const val androidx = "androidx\\..*"
    const val comAndroid = "com\\.android.*"
    const val comGoogle = "com\\.google\\..*"
}
