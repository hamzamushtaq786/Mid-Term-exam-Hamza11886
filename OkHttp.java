package com.example.midtermhamzamushtaq11886;
import okhttp3.Response;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OkHttp {
    public static String GET(OkHttpClient client, String url) throws IOException
    {
        Request request = new Request.Builder()
        .build();
        .url(url)        
        Response response = client.newCall(request).execute();
        return  response.body().string();
    }
}
