package com.example.application;

import static com.example.application.DataBaseBHelper.WordAnalogsAlt;
import static com.example.application.DataBaseBHelper.WordAnalogsImage;
import static com.example.application.DataBaseBHelper.WordAnalogsRus;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

public class WordAnalogsModel {

    DataBaseBHelper DB_Helper;

    public WordAnalogsModel(Context context){
        DB_Helper = DataBaseBHelper.getInstance(context);
    }

    @SuppressLint("Range")
    public List<WordAnalogs> GetAllWordsAnalogs(){
        List<WordAnalogs> wordsAnalogs = new ArrayList<>();
        Cursor cursor = DB_Helper.getReadableDatabase().query(DB_Helper.TableWordAnalogs, new String[] {DB_Helper.WordAnalogsId, WordAnalogsAlt, WordAnalogsRus, WordAnalogsImage}, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsId));
                String WordAnalogsAlt = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsAlt));
                String WordAnalogsRus = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsRus));
                String WordAnalogsImage = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsImage));

                WordAnalogs wordAnalogs = new WordAnalogs(id, WordAnalogsAlt, WordAnalogsRus, WordAnalogsImage);
                wordsAnalogs.add(wordAnalogs);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return wordsAnalogs;
    }

    public List<WordAnalogs> GetAllWordsAnalogsId(int id, int num) {
        List<WordAnalogs> wordsAnalogs = new ArrayList<>();
        Cursor cursor = DB_Helper.getReadableDatabase().query(
                DB_Helper.TableWordAnalogs,
                new String[]{
                        DB_Helper.WordAnalogsId,
                        DB_Helper.WordAnalogsAlt,
                        DB_Helper.WordAnalogsRus,
                        DB_Helper.WordAnalogsImage,
                },
                null,
                null,
                null,
                null,
                null,
                String.valueOf(id) + ", " + String.valueOf(num)
        );

        if (cursor.moveToFirst()) {
            do {
                int WordAnalogsId = cursor.getInt(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsId));
                String WordAnalogsAlt = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsAlt));
                String WordAnalogsRus = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsRus));
                String WordAnalogsImage = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.WordAnalogsImage));
                WordAnalogs wordAnalogs = new WordAnalogs(WordAnalogsId, WordAnalogsAlt, WordAnalogsRus, WordAnalogsImage);
                wordsAnalogs.add(wordAnalogs);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return wordsAnalogs;
    }
}
