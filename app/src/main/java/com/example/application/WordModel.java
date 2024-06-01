package com.example.application;

import static com.example.application.DataBaseBHelper.TableWords;
import static com.example.application.DataBaseBHelper.WordAlt;
import static com.example.application.DataBaseBHelper.WordAnalogs;
import static com.example.application.DataBaseBHelper.WordImage;
import static com.example.application.DataBaseBHelper.WordRus;
import static com.example.application.DataBaseBHelper.WordSoundOnAlt;
import static com.example.application.DataBaseBHelper.WordSoundOnRus;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordModel {
    DataBaseBHelper DB_Helper;

    public WordModel(Context context){
        DB_Helper = DataBaseBHelper.getInstance(context);
    }
    public long CreateWord(Word word){
        SQLiteDatabase database = DB_Helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DB_Helper.WordAlt, word.GetWordAlt());
        values.put(DB_Helper.WordRus, word.GetWordRus());
        values.put(DB_Helper.WordSoundOnRus, word.GetWordOnRus());
        values.put(DB_Helper.WordSoundOnAlt, word.GetWordOnAlt());
        values.put(DB_Helper.WordImage, word.GetWordImage());
        return database.insert(TableWords, null, values);
    }

    @SuppressLint("Range")
    public List<Word> GetAllWords(){
        List<Word> words = new ArrayList<>();
        Cursor cursor = DB_Helper.getReadableDatabase().query(DB_Helper.TableWords, new String[] {DB_Helper.WordId, WordAlt, WordRus, WordSoundOnRus, WordSoundOnAlt, WordImage}, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(DB_Helper.WordId));
                String WordAlt = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAlt));
                String WordARus = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordRus));
                String WordSoundOrRus = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordSoundOnRus));
                String WordSoundOnAlt = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordSoundOnAlt));
                String WordImage = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordImage));

                Word word = new Word(id, WordAlt, WordARus, WordSoundOrRus, WordSoundOnAlt, WordImage);
                words.add(word);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return words;
    }
    /*
    public Word GetWord(int id) {

    }
    public void UpdWord(){

    }
    public void DelWord(int id){

    }*/

}
