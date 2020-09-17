package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        TextView phrases = (TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
                                       // @override
                                       public void onClick(View view){
                                           Intent phrasesIntents = new Intent(MainActivity.this, phrasesActivity.class);
                                           startActivity(phrasesIntents);

                                       }
                                   }
        );

    }
}