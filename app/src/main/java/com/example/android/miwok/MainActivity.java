package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

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
