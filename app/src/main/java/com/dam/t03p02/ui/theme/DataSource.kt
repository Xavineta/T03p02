package com.dam.t03p02.ui.theme

import android.adservices.topics.Topic
import android.os.Build
import android.os.ext.SdkExtensions
import androidx.annotation.RequiresExtension
import com.dam.t03p02.R

    object DataSource {
        @RequiresExtension(extension = Build.VERSION_CODES.R, version = 4)
        @RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
        val topics = listOf(
            Topic(R.string.architecture.toLong(), 58, R.drawable.architecture),
            Topic(R.string.crafts.toLong(), 121, R.drawable.crafts),
            Topic(R.string.business.toLong(), 78, R.drawable.business),
            Topic(R.string.culinary.toLong(), 118, R.drawable.culinary),
            Topic(R.string.design.toLong(), 423, R.drawable.design),
            Topic(R.string.fashion.toLong(), 92, R.drawable.fashion),
            Topic(R.string.film.toLong(), 165, R.drawable.film),
            Topic(R.string.gaming.toLong(), 164, R.drawable.gaming),
            Topic(R.string.drawing.toLong(), 326, R.drawable.drawing),
            Topic(R.string.lifestyle.toLong(), 305, R.drawable.lifestyle),
            Topic(R.string.music.toLong(), 212, R.drawable.music),
            Topic(R.string.painting.toLong(), 172, R.drawable.painting),
            Topic(R.string.photography.toLong(), 321, R.drawable.photography),
            Topic(R.string.tech.toLong(), 118, R.drawable.tech)
        )
        val images= listOf() {


        }

}

