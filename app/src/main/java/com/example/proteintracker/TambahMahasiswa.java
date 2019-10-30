package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TambahMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_mahasiswa);

        Button btnsimpan = findViewById(R.id.btnsimpan2);
        btnsimpan.setOnClickListener(btnsmpn);

    }
    private View.OnClickListener btnsmpn = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(TambahMahasiswa.this,MahasiswaList.class);
            startActivity(intent);
        }
    };
}
