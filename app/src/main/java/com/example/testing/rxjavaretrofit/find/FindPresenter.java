//package com.example.testing.rxjavaretrofit.find;
//
//import android.support.annotation.NonNull;
//import android.util.Log;
//
//import com.example.testing.rxjavaretrofit.bean.Subject;
//import com.example.testing.rxjavaretrofit.data.remote.FindRepository;
//import com.example.testing.rxjavaretrofit.data.remote.GetDataCallback;
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
//public class FindPresenter implements FindContract.Presenter{
//    FindContract.View findView;
//    GetDataCallback findRepository;
//    public FindPresenter(FindContract.View findView,GetDataCallback findRepository){
//        this.findView=findView;
//        this.findView.setPresenter(this);
//        this.findRepository=findRepository;
//
//    }
//    @Override
//    public void editTask() {
//
//    }
//
//    @Override
//    public void getData() {
//        Log.e("===============","====================");
////        findRepository.getData(new GetDataCallback() {
////
////            @Override
////            public void getData(@NonNull GetDataCallback callback) {
////
////            }
////
////            public void getResult(List<Subject> restult){
////                findView.showData(restult);
////            }
////        });
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
//                Log.e("===============","===================222222222"+e.getMessage());
//            }
//
//            @Override
//            public void onNext(List<Subject> movieEntity) {
////                findView.showData(movieEntity);
//                Log.e("===============","===================33333333333333");
//            }
//        };
////        HttpMethons.getInstance().getTopMovice(subscriber,0,10);
//    }
//    @Override
//    public void start() {
//
//    }
//
//}
