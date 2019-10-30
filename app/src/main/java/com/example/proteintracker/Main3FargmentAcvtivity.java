package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FargmentAcvtivity extends AppCompatActivity implements ProteinFragment.sendMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fargment_acvtivity);
        Button btnpress = findViewById(R.id.btntesFragment);
        btnpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("hai","Para Progmobers");
                ft.replace(R.id.Frg,proteinFragment);
                ft.commit();
            }
        });
    }

    @Override
    public void SenData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ProteinFragment proteinFragment = ProteinFragment.newInstance(Message,"Para Progmobers");
        ft.replace(R.id.Frg,proteinFragment);
        ft.commit();
    }
}
