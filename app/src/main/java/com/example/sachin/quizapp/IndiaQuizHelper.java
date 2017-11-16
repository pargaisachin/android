package com.example.sachin.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class IndiaQuizHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "DATABASEQUIZIN";
    private static final int DATABASE_VERSION = 17;
    private static final String TABLE_NAME = "INDIAQUIZ";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public IndiaQuizHelper(Context context) {
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
        IndiaQuestion q1 = new IndiaQuestion("who was the first prime minister of india?", "jawaharlal nehru", "Subhash Chandra Bose", "Govind Ballabh Pant", "Sardar Vallabhbhai Patel", "jawaharlal nehru");
        this.insert(q1);
        IndiaQuestion q2 = new IndiaQuestion("how many state are there in india?", "30", "28", "29", "27", "29");
        this.insert(q2);
        IndiaQuestion q3 = new IndiaQuestion("Who was known as Iron man of India ?", "Govind Ballabh Pant", "Jawaharlal Nehru", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel");
        this.insert(q3);
        IndiaQuestion q4 = new IndiaQuestion("who was the current president of india ?", "mira kumari", "ram nath kovind", "Naidia Comenci", "Tamara Press", "ram nath kovind");
        this.insert(q4);
        IndiaQuestion q5 = new IndiaQuestion("Who is the Flying Sikh of India ?", "Mohinder Singh", "Joginder Singh", "Ajit Pal Singh", "Milkha singh", "Milkha singh");
        this.insert(q5);
        IndiaQuestion q6 = new IndiaQuestion("The Indian to beat the computers in mathematical wizardry is", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakunthala Devi", "Shakunthala Devi");
        this.insert(q6);
        IndiaQuestion q7 = new IndiaQuestion("Who is Larry Pressler ?", "Politician", "Painter", "Actor", "Tennis player", "Politician");
        this.insert(q7);
        IndiaQuestion q8 = new IndiaQuestion("Michael Jackson is a distinguished person in the field of ?", "Pop Music", "Jounalism", "Sports", "Acting", "Pop Music");
        this.insert(q8);
        IndiaQuestion q9 = new IndiaQuestion("The first Indian to swim across English channel was ?", "V. Merchant", "P. K. Banerji", "Mihir Sen", "Arati Saha", "Mihir Sen");
        this.insert(q9);
        IndiaQuestion q10 = new IndiaQuestion("Who was the first Indian to make a movie?", "Dhundiraj Govind Phalke", " Asha Bhonsle", " Ardeshir Irani", "V. Shantaram", "Dhundiraj Govind Phalke");
        this.insert(q10);
        IndiaQuestion q11 = new IndiaQuestion("Who is known as the ' Saint of the gutters ?", "B.R.Ambedkar", "Mother Teresa", "Mahatma Gandhi", "Baba Amte", "Mother Teresa");
        this.insert(q11);
        IndiaQuestion q12 = new IndiaQuestion("Who invented the famous formula E=mc^2", "Albert Einstein", "Galilio", "Sarvesh", "Bill Gates", "Albert Einstein");
        this.insert(q12);
       IndiaQuestion q13 = new IndiaQuestion("Who is elected as president of us 2016", "Donald Trump", "Hilary Clinton", "Jhon pol", "Barack Obama", "Donald Trump");
        this.insert(q13);
        IndiaQuestion q14 = new IndiaQuestion("Who was the founder of company Microsoft", "Bill Gates", "Bill Clinton", "Jhon rio", "Steve jobs", "Bill Gates");
        this.insert(q14);
        IndiaQuestion q15 = new IndiaQuestion("Who was the founder of company Apple ?", "Steve Jobs", "Steve Washinton", "Bill Gates", "Jobs Wills", "Steve Jobs");
        this.insert(q15);
        IndiaQuestion q16 = new IndiaQuestion("Who was the founder of company Google ?", "Steve Jobs", "Bill Gates", "Larry Page", "Sundar Pichai", "Larry Page");
        this.insert(q16);
        IndiaQuestion q17 = new IndiaQuestion("Who is know as god of cricket ?", "Sachin Tendulkar", "Kapil Dev", "Virat Koli", "Dhoni", "Sachin Tendulkar");
        this.insert(q17);
        IndiaQuestion q18 = new IndiaQuestion("who has won ballon d'or of 2015 ?", "Lionel Messi", "Cristiano Ronaldo", "Neymar", "Kaka", "Lionel Messi");
        this.insert(q18);
        IndiaQuestion q19 = new IndiaQuestion("who has won ballon d'or of 2014 ?", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Kaka", "Cristiano Ronaldo");
        this.insert(q19);
        IndiaQuestion q20 = new IndiaQuestion("the Founder of the most famous gaming platform steam is ?", "Bill Cliton", "Bill Williams", "Gabe Newell", "Bill Gates", "Gabe Newell");
        this.insert(q20);
    }
    public void insert(IndiaQuestion indiaQuestion) {
        ContentValues contentvalues = new ContentValues();
       /* contentvalues.put(UID,indiaQuestion.getId());*/
        contentvalues.put(QUESTION, indiaQuestion.getQuestion());
        contentvalues.put(OPTA, indiaQuestion.getOpta());
        contentvalues.put(OPTB, indiaQuestion.getOptb());
        contentvalues.put(OPTC, indiaQuestion.getOptc());
        contentvalues.put(OPTD, indiaQuestion.getOptd());
        contentvalues.put(ANSWER, indiaQuestion.getAnswer());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, contentvalues);
    }
    public List<IndiaQuestion> getAllQuestion() {
        List<IndiaQuestion> que = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        String coloumns[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            IndiaQuestion indiaQuestion = new IndiaQuestion();
            indiaQuestion.setId(cursor.getInt(0));
            indiaQuestion.setQuestion(cursor.getString(1));
            indiaQuestion.setOpta(cursor.getString(2));
            indiaQuestion.setOptb(cursor.getString(3));
            indiaQuestion.setOptc(cursor.getString(4));
            indiaQuestion.setOptd(cursor.getString(5));
            indiaQuestion.setAnswer(cursor.getString(6));
            que.add(indiaQuestion);
        }
        return que;
    }
}
