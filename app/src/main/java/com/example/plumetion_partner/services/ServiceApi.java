package com.example.plumetion_partner.services;

import com.example.plumetion_partner.model.User;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ServiceApi {
    @FormUrlEncoded
    @POST("register.php")
    Call<User> doRegistration(@Field("name") String name,
                              @Field("email") String email,
                              @Field("mob_number") String Mob_number,
                              @Field("password") String password

    );
    @FormUrlEncoded
    @POST("login.php")
    Call<User> doLogin(@Field("email") String email,
                       @Field("password") String password);
}
