package com.example.sachin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PrimeAdapter extends AppCompatActivity {




        ListView simpleList;
        String animalList[] = {"Jawaharlal Nehru\n" +
                "(1889–1964)","Gulzarilal Nanda (acting)\n" +
                "(1898–1998)","Lal Bahadur Shastri\n" +
                "(1904–1966)","Indira Gandhi\n" +
                "(1917–1984)","Morarji Desai\n" +
                "(1896–1995)","Rajiv Gandhi\n" +
                "(1944–1991)","V. P. Singh\n" +
                "(1931–2008)", "Chandra Shekhar\n" +
                "(1927–2007)", "P. V. Narasimha Rao\n" +
                "(1921–2004)", "Atal Bihari Vajpayee\n" +
                "(born 1924)", "H. D. Deve Gowda\n" +
                "(born 1933)", "Inder Kumar Gujral\n" +
                "(1919–2012)", "Manmohan Singh\n" +
                "(born 1932)", "Narendra Modi\n" +
                "(born 1950)"};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_prime_adapter2);
            simpleList = (ListView) findViewById(R.id.simpleListView);

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_view_item, R.id.textview, animalList);
            simpleList.setAdapter(arrayAdapter);
        }


}

