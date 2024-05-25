package com.example.application;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    DataBaseBHelper DB_Helper;
    SQLiteDatabase dataBase;
    public UserModel(Context context){
        DB_Helper = new DataBaseBHelper(context);
        dataBase = DB_Helper.getWritableDatabase();
    }

    public long CreateUser(User user){
        ContentValues values = new ContentValues();
        values.put("Login", user.GetLogin());
        values.put("Password", user.GetPassword());
        values.put("Email", user.GetEmail());
        return dataBase.insert("users", null, values);
    }

    @SuppressLint("Range")
    public List<User> GetAllUsers(){
        List<User> users = new ArrayList<>();
        Cursor cursor = dataBase.query("users", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                User user = new User();
                user.SetId(cursor.getInt(cursor.getColumnIndex("id")));
                user.SetLogin(cursor.getString((cursor.getColumnIndex("login"))));
                user.SetPassword((cursor.getString(cursor.getColumnIndex("password"))));
                user.SetEmail((cursor.getString(cursor.getColumnIndex("email"))));
                users.add(user);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return users;
    }

    public int GetUserId(String login){
        dataBase = DB_Helper.getReadableDatabase();
        String str = DB_Helper.Login + " = ?";
        String[] array = { login };
        Cursor cursor = dataBase.query(DB_Helper.TableUsers, new String[] { DB_Helper.Id }, str, array, null, null, null);

        int index = -1;
        if (cursor.moveToFirst()) {
            index = cursor.getInt(cursor.getColumnIndexOrThrow(DB_Helper.Id));
        }
        cursor.close();

        return index;
    }
    public void UpdUser(){

    }
    public int DelUser(int id){
        return dataBase.delete("users", "id = ?", new String[] { String.valueOf(id) });
    }
}
