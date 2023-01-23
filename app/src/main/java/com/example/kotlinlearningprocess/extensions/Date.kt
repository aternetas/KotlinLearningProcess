package com.example.kotlinlearningprocess.extensions

import java.text.SimpleDateFormat
import java.util.*

private const val SECOND_MILLIS = 1000
private const val MINUTE_MILLIS = 60 * SECOND_MILLIS
private const val HOUR_MILLIS = 60 * MINUTE_MILLIS
private const val DAY_MILLIS = (24 * HOUR_MILLIS).toDouble()

fun Date.format(pattern: String = "d.M.yy H:mm:ss"): String = SimpleDateFormat(pattern, Locale("ru")).format(this)

fun Date.countTimeIntervalUntilNow(): String{
    var diff = System.currentTimeMillis() - this.time

    return when(diff){
        in 0 until SECOND_MILLIS -> "just now"
        in SECOND_MILLIS until 45 * SECOND_MILLIS -> "a few seconds ago"
        in 45 * SECOND_MILLIS until 75 * SECOND_MILLIS -> "a minute ago"
        in 75 * SECOND_MILLIS until 45 * MINUTE_MILLIS -> "${((diff / MINUTE_MILLIS).toInt())} minutes ago"
        in 45 * MINUTE_MILLIS until 75 * MINUTE_MILLIS -> "an hour ago"
        in 75 * MINUTE_MILLIS until 22 * HOUR_MILLIS -> "${((diff / HOUR_MILLIS).toInt())} hours ago"
        in 22 * HOUR_MILLIS until 26 * HOUR_MILLIS -> "a day ago"
        in 26 * HOUR_MILLIS until (360 * DAY_MILLIS).toInt() -> "${((diff / DAY_MILLIS).toInt())} days ago"
        else -> "over a year ago"
    }
}
