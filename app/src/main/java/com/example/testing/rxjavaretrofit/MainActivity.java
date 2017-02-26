package com.example.testing.rxjavaretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testing.rxjavaretrofit.bean.MovieEntity;
import com.example.testing.rxjavaretrofit.bean.Subject;
import com.example.testing.rxjavaretrofit.http.MovieService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click_me_BN)
    public void onClick() {
        getMovie();
    }

//    private void getMovie() {
//        Subscriber<List<Subject>> subscriber = new Subscriber<List<Subject>>() {
//
//            @Override
//            public void onCompleted() {
//                Toast.makeText(MainActivity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                resultTV.setText(e.getMessage());
//            }
//
//            @Override
//            public void onNext(List<Subject> movieEntity) {
//                resultTV.setText(movieEntity.toString());
//            }
//        };
//        HttpMethons.getInstance().getTopMovice(subscriber, 0, 10);
//    }

//    @Override
//    public void showData( List<Subject> movieEntity) {
//        resultTV.setText(movieEntity.toString());
//    }

//    @Override
//    public void setPresenter(FindContract.Presenter presenter) {
//      this.presenter=presenter;
//    }
    //进行网络请求
    private void getMovie() {
        String baseUrl = "https://api.douban.com/v2/movie/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);
        movieService.getTopMovie(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MovieEntity>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(MainActivity.this, "获取数据成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {

                        resultTV.setText(e.getMessage());
                    }

                    @Override
                    public void onNext(MovieEntity movieEntity) {

                        resultTV.setText(movieEntity.toString());
                    }
                });

    }
}
