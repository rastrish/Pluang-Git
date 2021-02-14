package com.example.pluanggit.data

import com.example.pluang.data.response.Response
import com.example.pluanggit.data.EndPoints
import retrofit2.http.GET
import retrofit2.http.Query


interface PluangNetworkService{

  @GET(EndPoints.REPO)
  suspend fun getGitList(@Query("lang")lang : String , @Query("since") since : String) : Response

}