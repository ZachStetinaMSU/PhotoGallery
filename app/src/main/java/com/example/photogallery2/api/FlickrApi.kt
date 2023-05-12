package com.example.photogallery2.api

import retrofit2.http.GET

private const val API_KEY = "8ca5056ce88bd335b20c2e1b1d60abd3"

interface FlickrApi {
   // @GET("/")

    @GET(
        "services/rest/?method=flickr.interestingness.getlist" +
                "&api_key=$API_KEY" +
                "&format=json" +
                 "&nojsoncallback=1" +
                 "&extras=url_s"

    )

    //suspend fun fetchContents(): String
    suspend fun fetchPhotos():FlickrResponse
}