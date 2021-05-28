package com.chetana.paginationassignment.Interface;

import com.chetana.paginationassignment.Class.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    //String URL = "https://reqres.in/api/users/";
    String URL = "https://reqres.in";

    @GET("/api/users?")
        //Call<List<User>> getUsers(@Query("page") int page, @Query("per_page") int pagesize); //pagenumber, perpage items
    Call<User> getUsers(@Query("page") String page);
}
