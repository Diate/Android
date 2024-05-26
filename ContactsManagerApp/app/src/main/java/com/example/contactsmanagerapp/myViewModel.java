package com.example.contactsmanagerapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class myViewModel extends AndroidViewModel {

    private Repository myrepository;
    LiveData<List<Contacts>> allcontacts;
    public myViewModel(@NonNull Application application) {
        super(application);
        this.myrepository = new Repository(application);
    }
    public LiveData<List<Contacts>> getAllcontacts()
    {
        allcontacts = myrepository.getAllContact();
        return allcontacts;
    }
    public void addContact(Contacts contacts)
    {
        myrepository.insertContact(contacts);
    }
    public void removeContact(Contacts contacts)
    {
        myrepository.deleteContact(contacts);
    }
}
