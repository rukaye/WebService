package com.example.webservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.webservices.Adapters.AdapterBilgi;
import com.example.webservices.Models.Bilgiler;
import com.example.webservices.RestApi.ManagerAll;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    List<Bilgiler> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        istek();
    }
    public void istek(){
        list=new ArrayList<>();

        Call<List<Bilgiler>> bilgiList= ManagerAll.getInstance().getirbilgileri();
        bilgiList.enqueue(new Callback<List<Bilgiler>>() {
            @Override
            public void onResponse(Call<List<Bilgiler>> call, Response<List<Bilgiler>> response) {
                if(response.isSuccessful())
                {
                    list=response.body();
                    AdapterBilgi adp=new AdapterBilgi(list,getApplicationContext());
                    listView.setAdapter(adp);
                }

            }

            @Override
            public void onFailure(Call<List<Bilgiler>> call, Throwable t) {

            }
        });
    }
}
