package com.example.newmessage.Fragments;

import com.example.newmessage.Notifications.MyResponse;
import com.example.newmessage.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAvXsa8GI:APA91bHVxbS698-N4xrZxaF6Iy7ibbTYkB6QnUoQKkSdSfBVgva5yfPowjnzX6f3N69wKJAjjAXAbTLr9vyvsQEoI5V4LJIT9AVsMOurk9pMmd5dVy4MMGH6qDxbYZJv4eERj_B9bgP_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
