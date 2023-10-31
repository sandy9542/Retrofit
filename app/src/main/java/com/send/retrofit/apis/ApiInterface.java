package com.send.retrofit.apis;

import com.send.retrofit.model.Student;
import com.send.retrofit.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("/photos")
    Call<List<UserModel>> getUser();

//    @POST("/api/users")
//    Call<List<Student>> getData();

}
