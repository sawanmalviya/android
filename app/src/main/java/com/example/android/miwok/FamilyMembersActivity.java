package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        final TextView family = (TextView)findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            // @override
            public void onClick(View view) {
                Intent familyIntents = new Intent(MainActivity.this, familyActivity.class);
                startActivity(familyIntents);
            }
        }
        );
    }
}