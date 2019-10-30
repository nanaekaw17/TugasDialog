package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView myTextView = findViewById(R.id.textView1);
        

        Bundle b = getIntent().getExtras();
        String HelpText = b.getString("helpstring");

        myTextView.setText(HelpText);


    }
}
