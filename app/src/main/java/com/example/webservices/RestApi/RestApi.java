package com.example.webservices.RestApi;

import com.example.webservices.Models.Bilgiler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {
   @GET("/posts")
    Call<List<Bilgiler>> bilgiGetir();
}
