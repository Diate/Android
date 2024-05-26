package com.example.contactsmanagerapp;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
//Method in DAO is execute through Repository
     private final ContactDAO contactDAO;
     ExecutorService executor;
     Handler handler;

    public Repository(Application application) {

        ContactsDatabase contactsDatabase = ContactsDatabase.getInstance(application);
        this.contactDAO = contactsDatabase.getContactDAO();
        executor = Executors.newSingleThreadExecutor();
        handler = new Handler(Looper.getMainLooper());
    }

    public void insertContact(Contacts contact)
    {

        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.insert(contact);
            }
        });

    }
    public void deleteContact(Contacts contact)
    {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.delete(contact);
            }
        });

    }
    public LiveData<List<Contacts>> getAllContact()
    {
        return contactDAO.getAllContact();

    }
}
