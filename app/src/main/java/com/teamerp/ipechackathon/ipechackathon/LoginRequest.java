package com.teamerp.ipechackathon.ipechackathon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by satyam on 8/12/17.
 */

public interface LoginRequest {
    @GET("login/user_login/")
    Call<LoginPOJO> call(@Query("VIN") String car_number);
}
