package top.andnux.library.extend

import android.widget.ImageView
import top.andnux.library.manager.ImageManager

fun ImageView.setImageUrl(url:String,defRes:Int = 0){
    ImageManager.display(this,url,defRes)
}