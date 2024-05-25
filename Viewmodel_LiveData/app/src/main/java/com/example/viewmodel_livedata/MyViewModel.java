package com.example.viewmodel_livedata;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    MutableLiveData<Integer> counter = new MutableLiveData<>();
    public void increase_Counter(View view){
        int number = counter.getValue() == null ? 0 : counter.getValue();
        counter.setValue(number+1);
    }
    public LiveData<Integer> get_counter()
    {
        return counter;
    }

}
