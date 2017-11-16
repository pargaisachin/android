package com.example.sachin.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 1/4/2017.
 */

public class PoliticalQuizHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "DATABASEQUIZPOLITICAL";
    private static final int DATABASE_VERSION = 17;
    private static final String TABLE_NAME = "POLITICALQUIZ";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public PoliticalQuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }

    /**
     *
     */
    public void allQuestion() {
        PoliticalQuestion q1 = new PoliticalQuestion("how was the first prim minister of india?", "jawaharlal nehru", "Subhash Chandra Bose", "Govind Ballabh Pant", "Sardar Vallabhbhai Patel", "jawaharlal nehru");
        this.insert(q1);
        PoliticalQuestion q2 = new PoliticalQuestion("Who was known as Iron man of India ?", "Govind Ballabh Pant", "Jawaharlal Nehru", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel");
        this.insert(q2);
        PoliticalQuestion q3 = new PoliticalQuestion("Who is elected as president of us 2016", "Donald Trump", "Hilary Clinton", "Jhon pol", "Barack Obama", "Donald Trump");
        this.insert(q3);



    }
    public void insert(PoliticalQuestion politicalQuestion) {
        ContentValues contentvalues = new ContentValues();
       /* contentvalues.put(UID,indiaQuestion.getId());*/
        contentvalues.put(QUESTION, politicalQuestion.getQuestion());
        contentvalues.put(OPTA, politicalQuestion.getOpta());
        contentvalues.put(OPTB, politicalQuestion.getOptb());
        contentvalues.put(OPTC, politicalQuestion.getOptc());
        contentvalues.put(OPTD, politicalQuestion.getOptd());
        contentvalues.put(ANSWER, politicalQuestion.getAnswer());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, contentvalues);
    }
    public List<PoliticalQuestion> getAllQuestion() {
        List<PoliticalQuestion> que = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        String coloumns[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            PoliticalQuestion politicalQuestion = new PoliticalQuestion();
            politicalQuestion.setId(cursor.getInt(0));
            politicalQuestion.setQuestion(cursor.getString(1));
            politicalQuestion.setOpta(cursor.getString(2));
            politicalQuestion.setOptb(cursor.getString(3));
            politicalQuestion.setOptc(cursor.getString(4));
            politicalQuestion.setOptd(cursor.getString(5));
            politicalQuestion.setAnswer(cursor.getString(6));
            que.add(politicalQuestion);
        }
        return que;
    }
}
