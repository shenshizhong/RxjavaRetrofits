package com.example.testing.rxjavaretrofit.data.remote;

import android.support.annotation.NonNull;

import com.example.testing.rxjavaretrofit.bean.Subject;

import java.util.List;

/**
 * Created by dell on 2017/2/26.
 */

public interface GetDataCallback {
    void getData(@NonNull GetDataCallback callback);
    void getResult(List<Subject> restult);
}
