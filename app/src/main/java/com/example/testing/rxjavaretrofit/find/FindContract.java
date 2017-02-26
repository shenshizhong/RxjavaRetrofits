package com.example.testing.rxjavaretrofit.find;

import com.example.testing.rxjavaretrofit.BasePresenter;
import com.example.testing.rxjavaretrofit.BaseView;
import com.example.testing.rxjavaretrofit.bean.Subject;

import java.util.List;

/**
 * Created by dell on 2017/2/26.
 */

public interface FindContract {
   interface View extends BaseView<Presenter>{
       void showData(List<Subject> movieEntity);
   }
    interface Presenter extends BasePresenter{
        void editTask();
        void getData();
    }
}
