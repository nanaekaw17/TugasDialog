package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MahasiswaActivity extends AppCompatActivity implements Mahasiswa_1Fragment.sendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mahasiswa_1Fragment mhs = Mahasiswa_1Fragment.newInstance("hai","");
        ft.replace(R.id.Frame1,mhs);
        ft.commit();

    }
    @Override
    public void SenData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiwaFragment mhs1 = MahasiwaFragment.newInstance(Message,"");
        ft.replace(R.id.Frame1,mhs1);
        ft.commit();
    }
}
