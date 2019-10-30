package com.example.proteintracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CobaMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_menu);

        String ContMenu[]={"1","2","3","4"};
        ListView Lvs = findViewById(R.id.LstView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ContMenu);
        Lvs.setAdapter(adapter);
        registerForContextMenu(Lvs);//Context Menu
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
        }else { return false; }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }// Menampilkan icon titik 3 pada xml menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"item1 terpilih",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"item2 terpilih",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"item3 terpilih",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.item4:
                Toast.makeText(getApplicationContext(),"item4 terpilih",Toast.LENGTH_LONG).show();
                return  true;
        }
        return true;
    }//  membuat select option menu

}
