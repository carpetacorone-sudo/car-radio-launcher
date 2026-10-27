package com.eduard.crvlauncher

/**
 * Everything specific to this head unit lives here. For each shortcut the
 * first installed package in its list is launched.
 * Adapted for a Honda Accord 2007 with the K2401 head unit (Android 14, NWD firmware).
 */
object Config {
    const val DRIVER_NAME = "John"

    /**
     * Cities the weather can be pinned to (tap the weather to cycle).
     * "Automático" uses the unit's GPS and falls back to the first city.
     */
    val CITIES = listOf(
        City("Tijuana", 32.5149, -117.0382),
    )

    // Packages read from the K2401 unit over ADB.
    val NAVIGATION = listOf(
        "com.waze",
        "com.google.android.apps.maps",
        "net.osmand",
        "net.osmand.plus",
        "app.organicmaps",
        "com.here.app.maps",
    )
    val PHONE = listOf("com.nwd.android.phone")
    val RADIO = listOf("com.nwd.radio")
    val MUSIC = listOf("com.spotify.music", "com.nwd.android.music.ui")
    /** Wireless Android Auto / CarPlay link app of this unit (Zlink). */
    val ANDROID_AUTO = listOf("com.zjinnova.zlink")
    /** Media sessions that mean "music from the phone over Bluetooth". */
    val BLUETOOTH_MEDIA_SOURCES = setOf("com.android.bluetooth", "com.nwd.bt.music")
    val CARPLAY = listOf("com.zjinnova.zlink")
}

data class City(val name: String, val lat: Double, val lon: Double)
