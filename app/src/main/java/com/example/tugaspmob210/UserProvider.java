package com.example.tugaspmob210;

import android.content.Context;

import androidx.room.Room;

public class UserProvider {
    private static UserDatabase instance;
    public static UserDatabase getInstance(Context context){
        if(UserProvider.instance==null){
            UserProvider.instance= Room.databaseBuilder(context, UserDatabase.class, "user.db").allowMainThreadQueries().build();
        }
        return UserProvider.instance;
    }
}
