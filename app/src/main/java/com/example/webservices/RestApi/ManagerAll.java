package com.example.webservices.RestApi;

import com.example.webservices.Models.Bilgiler;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {
    private   static ManagerAll ourInstance=new ManagerAll();
    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }
    public Call<List<Bilgiler>> getirbilgileri(){
        Call<List<Bilgiler>> call=getRestApiclient().bilgiGetir();
        return call;
    }

}
