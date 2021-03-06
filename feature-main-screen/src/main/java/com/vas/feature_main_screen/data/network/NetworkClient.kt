package com.vas.feature_main_screen.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.vas.core.utils.Constants.BASE_URL
import com.vas.core.utils.Constants.HEROES_URL
import com.vas.feature_main_screen.data.model.HeroApi
import okhttp3.OkHttpClient
import okhttp3.Request

class NetworkClient {

    private val client = OkHttpClient()

    private val moshi = Moshi.Builder().build()
    private val type = Types.newParameterizedType(List::class.java, HeroApi::class.java)
    private val adapter = moshi.adapter<List<HeroApi>>(type)

    suspend fun getHeroesList(): List<HeroApi> {
        val request = Request.Builder()
            .url(BASE_URL + HEROES_URL)
            .build()
        client.newCall(request).execute().use { response ->
            return if (response.isSuccessful) adapter.fromJson(response.body!!.source())!! else emptyList()
        }
    }

}