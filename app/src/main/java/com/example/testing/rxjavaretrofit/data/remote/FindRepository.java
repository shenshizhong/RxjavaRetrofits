//package com.example.testing.rxjavaretrofit.data.remote;
//
//import android.support.annotation.NonNull;
//import android.widget.Toast;
//
//import com.example.testing.rxjavaretrofit.MainActivity;
//import com.example.testing.rxjavaretrofit.bean.Subject;
//import com.example.testing.rxjavaretrofit.http.HttpMethons;
//
//import java.util.List;
//
//import rx.Subscriber;
//
///**
// * Created by dell on 2017/2/26.
// */
//
//public class FindRepository implements GetDataCallback{
//    List<Subject> restult;
//    @Override
//    public void getData(@NonNull GetDataCallback callback) {
//        Subscriber<List<Subject>> subscriber = new Subscriber<List<Subject>>() {
//
//            @Override
//            public void onCompleted() {
////                Toast.makeText(MainActivity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onError(Throwable e) {
////                resultTV.setText(e.getMessage());
//            }
//
//            @Override
//            public void onNext(List<Subject> movieEntity) {
//                restult= movieEntity;
//            }
//        };
////        HttpMethons.getInstance().getTopMovice(subscriber,0,10);
//
//    }
//    public void getResult(List<Subject> restult){
//        this.restult=restult;
//    }
//}
