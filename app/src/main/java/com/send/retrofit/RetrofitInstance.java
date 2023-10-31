package com.send.retrofit;

import static com.send.retrofit.MainActivity.api;

import com.send.retrofit.apis.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static RetrofitInstance instance;
//    public static Retrofit retrofit;
    public ApiInterface apiInterface;

    RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }


    //Todo:This is get request api call
    public static RetrofitInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }

//    //TODO:this is post request Api call
//    public static Retrofit getRetrofit() {
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("https://reqres.in/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }
}
