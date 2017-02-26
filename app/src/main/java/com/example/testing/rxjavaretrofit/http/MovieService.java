package com.example.testing.rxjavaretrofit.http;


import com.example.testing.rxjavaretrofit.bean.HttpResult;
import com.example.testing.rxjavaretrofit.bean.MovieEntity;
import com.example.testing.rxjavaretrofit.bean.Subject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dell on 2017/2/26.
 */
public interface MovieService {
    @GET("top250")
//    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);
    Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);
}
