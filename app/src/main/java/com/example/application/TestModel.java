package com.example.application;

import static com.example.application.DataBaseBHelper.TableTests;
import static com.example.application.DataBaseBHelper.TestId;
import static com.example.application.DataBaseBHelper.VariantOne;
import static com.example.application.DataBaseBHelper.VariantTwo;
import static com.example.application.DataBaseBHelper.VariantFree;
import static com.example.application.DataBaseBHelper.VariantFour;
import static com.example.application.DataBaseBHelper.VariantCorrect;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TestModel {
    DataBaseBHelper DB_Helper;

    public TestModel(Context context) {
        DB_Helper = new DataBaseBHelper(context);
    }

    @SuppressLint("Range")
    public List<Test> GetAllTests() {
        List<Test> tests = new ArrayList<>();
        Cursor cursor = DB_Helper.getReadableDatabase().query(DB_Helper.TableTests, new String[]{DB_Helper.TestId, VariantOne, VariantTwo, VariantFree, VariantFour, VariantCorrect}, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(DB_Helper.TestId));
                String Variant_1 = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.VariantOne));
                String Variant_2 = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.VariantTwo));
                String Variant_3 = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.VariantFree));
                String Variant_4 = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.VariantFour));
                String Variant_Correct = cursor.getString(cursor.getColumnIndexOrThrow(DB_Helper.VariantCorrect));
                Test test = new Test(id, Variant_1, Variant_2, Variant_3, Variant_4, Variant_Correct);
                tests.add(test);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return tests;
    }
}
