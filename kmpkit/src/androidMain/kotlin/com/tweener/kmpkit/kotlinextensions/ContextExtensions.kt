package com.tweener.kmpkit.kotlinextensions

import android.app.AlarmManager
import android.app.NotificationManager
import android.content.ContentResolver
import android.content.Context
import android.net.Uri

/**
 * @author Vivien Mahe
 * @since 06/11/2024
 */

/**
 * Retrieves the system's AlarmManager service.
 *
 * @return The [AlarmManager] instance if available, or `null` if the service is not found.
 */
fun Context.getAlarmManager(): AlarmManager? = getSystemService(Context.ALARM_SERVICE) as? AlarmManager

/**
 * Retrieves the system's NotificationManager service.
 *
 * @return The [NotificationManager] instance if available, or `null` if the service is not found.
 */
fun Context.getNotificationManager(): NotificationManager? = getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager

/**
 * Creates a URI for a raw resource file in the app's package.
 *
 * @param rawFilename The name of the raw resource file (without extension).
 * @return A [Uri] pointing to the raw resource.
 */
fun Context.getRawUri(rawFilename: String): Uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + packageName + "/raw/" + rawFilename)
