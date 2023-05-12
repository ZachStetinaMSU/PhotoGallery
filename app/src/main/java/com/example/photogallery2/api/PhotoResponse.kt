package com.example.photogallery2.api

import android.widget.RemoteViews.RemoteCollectionItems
import com.squareup.moshi.Json

data class PhotoResponse(
    @Json(name = "photo") val galleryItems:List<GalleryItem>
    )
