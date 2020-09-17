package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        TextView numbers = (TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
                                       // @override
                                       public void onClick(View view){
                                           Intent numbersIntents = new Intent(MainActivity.this, NumbersActivity.class);
                                           startActivity(numbersIntents);

                                       }
                                   }
        );

    }
}