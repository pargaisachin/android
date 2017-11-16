package com.example.sachin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PresidentAdapter extends AppCompatActivity {




    ListView simpleList;
    String animalList[] = {"\tRajendra Prasad\n" +
            "(1884–1963)\t","Sarvepalli Radhakrishnan\n" +
            "(1888–1975)","Zakir Husain\n" +
            "(1897–1969)","Varahagiri Venkata Giri\n" +
            "(1894–1980)","Fakhruddin Ali Ahmed\n" +
            "(1905–1977)","Neelam Sanjiva Reddy\n" +
            "(1913–1996)","Giani Zail Singh\n" +
            "(1916–1994)", "Shankar Dayal Sharma\n" +
            "(1918–1999)", "Kocheril Raman Narayanan\n" +
            "(1920–2005)", "A. P. J. Abdul Kalam\n" +
            "(1931–2015)", "Pratibha Patil\n" +
            "(1934–)", "Pranab Mukherjee\n" +
            "(1935–)", "Ram Nath Kovind\n" +
            "(1945–)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_adapter2);
        simpleList = (ListView) findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_view_item, R.id.textview, animalList);
        simpleList.setAdapter(arrayAdapter);
    }


}
