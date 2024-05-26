package com.example.contactsmanagerapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Contacts.class},version = 1)
public abstract class ContactsDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();

    private static volatile ContactsDatabase db_instance;
    public static synchronized ContactsDatabase getInstance(Context context){
        if(db_instance == null)
        {
            db_instance = Room.databaseBuilder(context.getApplicationContext(),ContactsDatabase.class,"contact_db")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  db_instance;

    }
}
