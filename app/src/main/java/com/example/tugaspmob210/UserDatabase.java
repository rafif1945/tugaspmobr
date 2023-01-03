package com.example.tugaspmob210;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {UserEntity.class}, version = 1)
public class UserDatabase extends RoomDatabase {
    private static final String dbname="user";
    private static UserDatabase userDatabase;

    public static synchronized UserDatabase getUserDatabase(Context context){
        if(userDatabase==null){
            userDatabase= Room.databaseBuilder(context, UserDatabase.class,dbname).fallbackToDestructiveMigration().build();
        }return userDatabase;
    }



    public UserDao userDao(){
        return null;
    }

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
