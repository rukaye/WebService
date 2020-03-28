package com.example.webservices.RestApi;

public class BaseManager {
    protected RestApi getRestApiclient(){
        RestApiClient restApiClient=new RestApiClient(BaseUrl.bilgi_Url);
        return restApiClient.getRestApi();
    }
}
