package com.example.httpdemo.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.*
import java.util.*

interface HttpApi {

  /**
   * 通过用户名获取用户信息
   * @param userName 用户名
   * @return  用户基本信息
   * */

  @GET("/users/{userName}")
  fun getUserInfoByName(@Path("userName") userName: String): Observable<ResponseBody>
}