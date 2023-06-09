package com.infinite_learning.androidexercisesubmission.customretrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesApi {
  @GET("/quotes")
  suspend fun getQuotes() : Response<QuoteList>
}