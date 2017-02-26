//package com.example.testing.rxjavaretrofit.http;
//
//import com.example.testing.rxjavaretrofit.bean.HttpResult;
//import com.example.testing.rxjavaretrofit.bean.MovieEntity;
//import com.example.testing.rxjavaretrofit.bean.Subject;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.OkHttpClient;
//import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
//import retrofit2.converter.gson.GsonConverterFactory;
//import rx.Subscriber;
//import rx.android.schedulers.AndroidSchedulers;
//import rx.functions.Func1;
//import rx.schedulers.Schedulers;
//
///**
// * Created by dell on 2017/2/26.
// */
//
//public class HttpMethons {
//    public static final String BASE_URL="https://api.douban.com/v2/movie/";
//    private static final int DEFAULT_TIMEOUT = 5;
//    private  Retrofit retrofit;
//    private final MovieService movieService;
//
//    private HttpMethons(){
//        OkHttpClient.Builder httpClientBuilder  = new OkHttpClient.Builder();
//        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
//
//        retrofit = new Retrofit.Builder()
//                .client(httpClientBuilder.build())
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .baseUrl(BASE_URL)
//                .build();
//        movieService = retrofit.create(MovieService.class);
//
//    }
//    private static class SingletonHolder{
//        private static final HttpMethons INSTANCE=new HttpMethons();
//    }
//    public static HttpMethons getInstance(){
//        return SingletonHolder.INSTANCE;
//    }
//    public void getTopMovice(Subscriber<List<Subject>> subscriber, int start, int count){
//        movieService.getTopMovie(start,count)
//                .map(new HttpResultFunc<List<Subject>>())
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);
//    }
//    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T>{
//
//        @Override
//        public T call(HttpResult<T> httpResult) {
//            if(httpResult.getCount()!=0){
//                throw new ApiException(100);
//            }
//            return httpResult.getSubjects();
//        }
//    }
//}
