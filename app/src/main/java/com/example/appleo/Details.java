package com.example.appleo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.details);

        Intent intent = getIntent();
        String mytitle = intent.getExtras().getString("title");
        String mysynopsis = intent.getExtras().getString("synopsis");
        String director = intent.getExtras().getString("director");
        String year = intent.getExtras().getString("year");
        TextView labelTitle = findViewById(R.id.title);
        TextView labelSynopsis = findViewById(R.id.synopsis);
        TextView labeldirector = findViewById(R.id.director);
        TextView labelyear = findViewById(R.id.year);
        labelTitle.setText(mytitle);
        labelSynopsis.setText(mysynopsis);
        labeldirector.setText(year);
        labelyear.setText(director);

    }
}
