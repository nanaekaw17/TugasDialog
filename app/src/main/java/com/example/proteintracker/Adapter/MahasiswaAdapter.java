package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.Mahasiswa;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    ArrayList<Mahasiswa>MahasiswaArraylist;

    public MahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArraylist) {
        MahasiswaArraylist = mahasiswaArraylist;
    }// set data ke array list


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.latihan_card_view,parent,false);
        return new ViewHolder(view);
    }//

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Holder, int position) {
        Holder.txtNama.setText(MahasiswaArraylist.get(position).getTelo());
        Holder.txtNpm.setText(MahasiswaArraylist.get(position).getNpm());
        Holder.txtNohp.setText(MahasiswaArraylist.get(position).getNoHp());


    }//memasukan data yang ada

    @Override
    public int getItemCount() {
        return (MahasiswaArraylist !=null) ? MahasiswaArraylist.size():0;
    }//menghitung jumlah data yang ada

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama,txtNpm,txtNohp;

        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
            txtNohp = view.findViewById(R.id.txt_nohp_mahasiswa);

        }
    }
}
