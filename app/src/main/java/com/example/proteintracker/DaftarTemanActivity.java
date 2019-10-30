package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.proteintracker.Adapter.DaftartemanAdapter;
import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftartemanAdapter daftartemanAdapter;
    private ArrayList<DaftarTeman>Daftartemanarrylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        daftartemanAdapter = new DaftartemanAdapter(Daftartemanarrylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter( daftartemanAdapter );
    }
    private  void addData(){
        Daftartemanarrylist =  new ArrayList<>();
        Daftartemanarrylist.add(new DaftarTeman(" nama : Nikolaus Aryawan Ravato Wijaya","nim :72170115"," hobby : Barongsai","cita2 : Membahagiakan dan menyangkan Ortu","moto :Terus berproses walaupun itu berat","gender : Laki-aki",R.drawable.arry));
        Daftartemanarrylist.add(new DaftarTeman("nama : Jonathan Prajna Marga Parama","nim : 72170094"," hobby : Kerja Lapangan","cita2 : konglomerat","moto : apapun yang kuperbuat dibuat Tuhan berhasil"," gender : Laki-Laki",R.drawable.jona));
        Daftartemanarrylist.add(new DaftarTeman(" nama : Nana Eka Wulandari"," nim : 72170090","hobby : Tidur","cita2 : Kaya raya","moto : jadi diri sendiri","gender : Perempuan",R.drawable.nana));
        Daftartemanarrylist.add(new DaftarTeman("nama : Beni Mulia Tabarus","nim : 72170177","hobby : Basket dan Musik","cita2 : membahagiakan ortu","moto : just dot it","gender :Laki-laki",R.drawable.beni));
    }


}
