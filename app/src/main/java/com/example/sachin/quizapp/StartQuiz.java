package com.example.sachin.quizapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


public class StartQuiz extends AppCompatActivity {


    Button b1, b2, b3, b4;
    TextView tv1, tv2, tv3, tv4;
    int score =0;
    IndiaQuizHelper indiaQuizHelper;
    IndiaQuestion currentQuestion;
    List<IndiaQuestion> list;
    int qid = 0;
    int level = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        getSupportActionBar().hide();
        tv1 = (TextView) findViewById(R.id.indiaQuestion);
        tv2 = (TextView) findViewById(R.id.triviTimer);
        b1 = (Button) findViewById(R.id.buttonA);
        b2 = (Button) findViewById(R.id.buttonB);
        b3 = (Button) findViewById(R.id.buttonC);
        b4 = (Button) findViewById(R.id.buttonD);
        tv3 = (TextView) findViewById(R.id.level);
        tv4 = (TextView) findViewById(R.id.score);



        CountDownTimer countDownTimer = new CountDownTimer(300 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished ) {
                tv2.setText("Timer:" + millisUntilFinished  / 1000 + " " + "sec");
            }

            @Override
            public void onFinish() {
                tv2.setText("TIME OUT");
                Intent intent = new Intent(getApplicationContext(), timeup.class);
                startActivity(intent);
            }
        };


        countDownTimer.start();
        indiaQuizHelper = new IndiaQuizHelper(this);
        SQLiteDatabase sqLiteDatabase = indiaQuizHelper.getWritableDatabase();
        indiaQuizHelper.allQuestion();
        list = indiaQuizHelper.getAllQuestion();
        currentQuestion = list.get(qid);
        view();






    }


    public void view() {
        tv1.setText(currentQuestion.getQuestion());
        b1.setText("A."+currentQuestion.getOpta());
        b2.setText("B."+currentQuestion.getOptb());
        b3.setText("C."+currentQuestion.getOptc());
        b4.setText("D."+currentQuestion.getOptd());
        tv3.setText("Level:"+level);
        tv4.setText("Score:"+score);
    }


    public void ButtonA(View view) {

        if (b1.getText().toString().equals("A."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartQuiz.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartQuiz.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonB(View view) {
        if (b2.getText().toString().equals("B."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartQuiz.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartQuiz.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonC(View view) {
        if (b3.getText().toString().equals("C."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartQuiz.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartQuiz.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonD(View view) {
        if (b4.getText().toString().equals("D."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartQuiz.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartQuiz.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}
