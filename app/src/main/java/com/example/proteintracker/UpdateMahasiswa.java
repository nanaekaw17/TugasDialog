package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_mahasiswa);

        Button save = findViewById(R.id.btnSave);
        save.setOnClickListener(btnsv);

    }
    private View.OnClickListener btnsv = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =  new Intent(UpdateMahasiswa.this,MahasiswaList.class);
            startActivity(intent);
        }
    };
}
