package top.andnux.library.extend

import java.io.*

fun InputStream?.string(charsetName: String = "utf-8"): String {
    try {
        val buffer = ByteArray(1024)
        val bos = ByteArrayOutputStream()
        var len = this?.read(buffer) ?: 0
        while (len != -1) {
            bos.write(buffer, 0, len)
            bos.flush()
            len = this?.read(buffer) ?: 0
        }
        return bos.toString(charsetName)
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return ""
}

fun InputStream?.writeToFile(name: String) {
    try {
        val file = File(name)
        if (file.exists()) {
            file.delete()
        }
        val fos = FileOutputStream(file)
        val buffer = ByteArray(1024)
        var len = this?.read(buffer) ?: 0
        while (len != -1) {
            fos.write(buffer, 0, len)
            fos.flush()
            len = this?.read(buffer) ?: 0
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}