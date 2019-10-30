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
        Daftartemanarrylist.add(new DaftarTeman("Grace Hutabarat", "72170171", "Nonton", "Good Leader", "Bertumbuh dalam proses", "Perempuan", R.drawable.grace));
        Daftartemanarrylist.add(new DaftarTeman("Jonathan Prajna Marga Parama", "72170094", "Kerja Lapangan", "konglomerat", "apapun yang kuperbuat dibuat Tuhan berhasil", "Laki-Laki", R.drawable.jona));
        Daftartemanarrylist.add(new DaftarTeman("Valeriana Tanesha Indra S", "72170143", "Baca Novel", "Bahagia", "Shoot for the moon because even if you miss, you'll land among the stars", "Perempuan", R.drawable.vale));
        Daftartemanarrylist.add(new DaftarTeman("Beni Mulia Tabarus", "72170177", "Basket dan Musik", "membahagiakan ortu", "just dot it", "Laki-laki", R.drawable.beni));
    }


}
