package com.example.proteintracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proteintracker.Model.Mahasiswa;

public class MahasiswaList extends AppCompatActivity {
    String[] items={"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan", "Immanuel Harold Maga",
            "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama", "Emma Norren Cahya Putri",
            "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha", "Lionrico Sanjay Exauvida Jeipy",
            "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased",
            "Valeriana Tanesha Indra S", "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa_list);


        ListView lst = findViewById(R.id.ListNamaTeman);

        lst.setAdapter(new ArrayAdapter<String>(MahasiswaList.this, android.R.layout.simple_list_item_1, items));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MahasiswaList.this, "Anda memilih = " + items[i], Toast.LENGTH_LONG).show();
            }
        });
        Button tmb1 = findViewById(R.id.btnTambah);
        tmb1.setOnClickListener(tmb);

        Button upd = findViewById(R.id.btnupdt2);
        upd.setOnClickListener(udt);

        ListView Lvs = findViewById(R.id.ListNamaTeman);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        Lvs.setAdapter(adapter);
        registerForContextMenu(Lvs);


    }

    private View.OnClickListener tmb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MahasiswaList.this,TambahMahasiswa.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener udt = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent( MahasiswaList.this,UpdateMahasiswa.class);
            startActivity(intent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuteman,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.menuFragment) {
            Intent intent = new Intent(MahasiswaList.this,MahasiswaActivity.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.menulist){
             Intent intent = new Intent(MahasiswaList.this, ListActivity.class);
             startActivity(intent);
        }else if (item.getItemId()==R.id.menuproteintracker){
            Intent intent = new Intent(MahasiswaList.this,ProteinTreckerApp.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);


        }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Silahkan Milih Guys");
        menu.add(0,v.getId(),0,"simpan");
        menu.add(0,v.getId(),0,"tidak simpan");//
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle()=="simpan"){
            Toast.makeText(getApplicationContext(),"Harap Tunggu Sedang Meyimpan",Toast.LENGTH_LONG).show();
        }else if (item.getTitle()=="Tidak simpan"){
            Toast.makeText(getApplicationContext(),"Tidak jadi  Meyimpan",Toast.LENGTH_LONG).show();
        }else {return  false;}
        return super.onContextItemSelected(item);
    }


}
