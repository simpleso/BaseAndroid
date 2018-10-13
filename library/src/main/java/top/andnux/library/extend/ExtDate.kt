package top.andnux.library.extend

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(format: String = "yyyy-MM-dd hh:mm:ss"): String {
    val dateFormat = SimpleDateFormat(format, Locale.getDefault())
    return dateFormat.format(this)
}