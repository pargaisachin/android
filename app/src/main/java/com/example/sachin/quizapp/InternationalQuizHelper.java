package com.example.sachin.quizapp;

/**
 * Created by start on 8/14/2017.
 */

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

public class InternationalQuizHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "DATABASEQUIZ";
    private static final int DATABASE_VERSION = 17;
    private static final String TABLE_NAME = "INTERNATIONALQUIZ";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public InternationalQuizHelper(Context context) {
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

    public void allQuestion() {
        InternationalQuestion q1 = new InternationalQuestion("how many countries are their in the world?", "200", "205", "0", "196", "196");
        this.insert(q1);
        InternationalQuestion q2 = new InternationalQuestion("how many continents in the world?", "6", "7", "8", "9", "7");
        this.insert(q2);
        InternationalQuestion q3 = new InternationalQuestion("Who was known as Iron man of India ?", "Govind Ballabh Pant", "Jawaharlal Nehru", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel");
        this.insert(q3);
        InternationalQuestion q4 = new InternationalQuestion("who was the current president of india ?", "mira kumari", "ram nath kovind", "Naidia Comenci", "Tamara Press", "Ram nath kovind");
        this.insert(q4);
        InternationalQuestion q5 = new InternationalQuestion("Who is the Flying Sikh of India ?", "Mohinder Singh", "Joginder Singh", "Ajit Pal Singh", "Milkha singh", "Milkha singh");
        this.insert(q5);
        InternationalQuestion q6 = new InternationalQuestion("The Indian to beat the computers in mathematical wizardry is", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakunthala Devi", "Shakunthala Devi");
        this.insert(q6);
        InternationalQuestion q7 = new InternationalQuestion("Who is Larry Pressler ?", "Politician", "Painter", "Actor", "Tennis player", "Politician");
        this.insert(q7);
        InternationalQuestion q8 = new InternationalQuestion("Michael Jackson is a distinguished person in the field of ?", "Pop Music", "Jounalism", "Sports", "Acting", "Pop Music");
        this.insert(q8);
        InternationalQuestion q9 = new InternationalQuestion("The first Indian to swim across English channel was ?", "V. Merchant", "P. K. Banerji", "Mihir Sen", "Arati Saha", "Mihir Sen");
        this.insert(q9);
        InternationalQuestion q10 = new InternationalQuestion("Who was the first Indian to make a movie?", "Dhundiraj Govind Phalke", " Asha Bhonsle", " Ardeshir Irani", "V. Shantaram", "Dhundiraj Govind Phalke");
        this.insert(q10);
        InternationalQuestion q11 = new InternationalQuestion("Who is known as the ' Saint of the gutters ?", "B.R.Ambedkar", "Mother Teresa", "Mahatma Gandhi", "Baba Amte", "Mother Teresa");
        this.insert(q11);
        InternationalQuestion q12 = new InternationalQuestion("Who invented the famous formula E=mc^2", "Albert Einstein", "Galilio", "Sarvesh", "Bill Gates", "Albert Einstein");
        this.insert(q12);
        InternationalQuestion q13 = new InternationalQuestion("Who is elected as president of us 2016", "Donald Trump", "Hilary Clinton", "Jhon pol", "Barack Obama", "Donald Trump");
        this.insert(q13);
        InternationalQuestion q14 = new InternationalQuestion("Who was the founder of company Microsoft", "Bill Gates", "Bill Clinton", "Jhon rio", "Steve jobs", "Bill Gates");
        this.insert(q14);
        InternationalQuestion q15 = new InternationalQuestion("Who was the founder of company Apple ?", "Steve Jobs", "Steve Washinton", "Bill Gates", "Jobs Wills", "Steve Jobs");
        this.insert(q15);
        InternationalQuestion q16 = new InternationalQuestion("Who was the founder of company Google ?", "Steve Jobs", "Bill Gates", "Larry Page", "Sundar Pichai", "Larry Page");
        this.insert(q16);
        InternationalQuestion q17 = new InternationalQuestion("Who is know as god of cricket ?", "Sachin Tendulkar", "Kapil Dev", "Virat Koli", "Dhoni", "Sachin Tendulkar");
        this.insert(q17);
        InternationalQuestion q18 = new InternationalQuestion("who has won ballon d'or of 2015 ?", "Lionel Messi", "Cristiano Ronaldo", "Neymar", "Kaka", "Lionel Messi");
        this.insert(q18);
        InternationalQuestion q19 = new InternationalQuestion("who has won ballon d'or of 2014 ?", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Kaka", "Cristiano Ronaldo");
        this.insert(q19);
        InternationalQuestion q20 = new InternationalQuestion("the Founder of the most famous gaming platform steam is ?", "Bill Cliton", "Bill Williams", "Gabe Newell", "Bill Gates", "Gabe Newell");
        this.insert(q20);
    }
    public void insert(InternationalQuestion internationalQuestion) {
        ContentValues contentvalues = new ContentValues();
       /* contentvalues.put(UID,triviaQuestion.getId());*/
        contentvalues.put(QUESTION, internationalQuestion.getQuestion());
        contentvalues.put(OPTA, internationalQuestion.getOpta());
        contentvalues.put(OPTB, internationalQuestion.getOptb());
        contentvalues.put(OPTC, internationalQuestion.getOptc());
        contentvalues.put(OPTD, internationalQuestion.getOptd());
        contentvalues.put(ANSWER, internationalQuestion.getAnswer());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, contentvalues);
    }
    public List<InternationalQuestion> getAllQuestion() {
        List<InternationalQuestion> que = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        String coloumns[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            InternationalQuestion internationalQuestion = new InternationalQuestion();
            internationalQuestion.setId(cursor.getInt(0));
            internationalQuestion.setQuestion(cursor.getString(1));
            internationalQuestion.setOpta(cursor.getString(2));
            internationalQuestion.setOptb(cursor.getString(3));
            internationalQuestion.setOptc(cursor.getString(4));
            internationalQuestion.setOptd(cursor.getString(5));
            internationalQuestion.setAnswer(cursor.getString(6));
            que.add(internationalQuestion);
        }
        return que;
    }
}

