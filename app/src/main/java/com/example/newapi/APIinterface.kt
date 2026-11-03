package com.example.newapi

import retrofit2.Call
import retrofit2.http.GET


interface APIinterface {
    @GET("post")
    fun getAPIData(): Call<List<DataAPIItem>>
}