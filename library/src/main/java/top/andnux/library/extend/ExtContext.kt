package top.andnux.library.extend

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.net.Uri
import android.os.Build
import android.os.Build.*
import android.support.v4.content.FileProvider
import java.io.File

fun Context.getUriForFile(file: File, authority: String = "{$packageName}.fileProvider"): Uri {
    if (VERSION.SDK_INT < VERSION_CODES.N) {
        return Uri.fromFile(file)
    } else {
        return FileProvider.getUriForFile(this, authority, file)
    }
}

fun Context.install(apkFile: File): Unit {
    if (!apkFile.exists()) {
        return
    }
    val intent = Intent(Intent.ACTION_VIEW)
    intent.setDataAndType(getUriForFile(apkFile), "application/vnd.android.package-archive")
    if (VERSION.SDK_INT < VERSION_CODES.N) {
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    }
    startActivity(intent)
}

fun Context.getVersionName(): String {
    return packageInfo.versionName
}

val Context.packageInfo: PackageInfo
    get() {
        return packageManager.getPackageInfo(packageName, 0)
    }

fun Context.getVersionCode(): Int {
    return packageInfo.versionCode
}

fun Context.getLongVersionCode(): Long {
    return packageInfo.longVersionCode
}