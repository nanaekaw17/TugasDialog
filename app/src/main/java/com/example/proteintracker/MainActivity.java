package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button mybtn = (Button)findViewById(R.id.button);
        Button btnlay = findViewById(R.id.buttonLay);
        btnlay.setOnClickListener(btnLay);

        Button btnApp = findViewById(R.id.AppTrackerProtein);
        btnApp.setOnClickListener(btnAPP);

        Button btnTable = findViewById(R.id.btnSave);
        btnTable.setOnClickListener(btnClickSave);

        Button btnRelative=findViewById(R.id.RelativeLayout);
        btnRelative.setOnClickListener(btnRelay);

        Button btnFragmen = findViewById(R.id.Fragmen);
        btnFragmen.setOnClickListener(btnfrag);

        Button btnmhs = findViewById(R.id.btnMhs);
        btnmhs.setOnClickListener(btnmhs1);

        Button btnlist = findViewById(R.id.btnList);
        btnlist.setOnClickListener(List1);

        Button btnlstmhs = findViewById(R.id.ListMahasiswa);
        btnlstmhs.setOnClickListener(mhslist);


        mybtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                EditText myeditText = (EditText)findViewById(R.id.editText);
                Log.d("ProteinTracker",myeditText.getText().toString());
            }
        });


        Button Helpbtn = (Button)findViewById(R.id.buttonHelp);
        Helpbtn.setOnClickListener(HelpButtonListener);

        if (savedInstanceState !=null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }

    }
    private View.OnClickListener mybtnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            EditText myeditText = (EditText)findViewById(R.id.editText);
            Log.d("ProteinTracker",myeditText.getText().toString());
        }

    };

    /*private View.OnClickListener HelpButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            startActivity(intent);
        }
    };*/

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    private View.OnClickListener HelpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText);
            b.putString("helpstring", myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    private  View.OnClickListener btnLay = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

    };

    private View.OnClickListener btnAPP = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           Intent intent = new Intent(MainActivity.this,ProteinTreckerApp.class);
           startActivity(intent);
        }
    };
    private  View.OnClickListener btnClickSave = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this,TableLayout.class);
         startActivity(intent);
        }
    };
    private View.OnClickListener btnRelay = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,RelativeLayout.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener btnfrag = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main3FargmentAcvtivity.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener btnmhs1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MahasiswaActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener List1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,ListActivity.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener mhslist = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MahasiswaList.class);
            startActivity(intent);
        }
    };



}
