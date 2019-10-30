package com.example.proteintracker;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Mahasiswa_1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Mahasiswa_1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    sendMessage smd;



    public Mahasiswa_1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Mahasiswa_1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Mahasiswa_1Fragment newInstance(String param1, String param2) {
        Mahasiswa_1Fragment fragment = new Mahasiswa_1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnpasData = (Button) view.findViewById(R.id.btnplus);
        btnpasData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smd.SenData("");
            }
        });
        Button btnupd = (Button) view.findViewById(R.id.btnupdt);
        btnupd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smd.SenData("");
            }
        });
        Button btnudel = (Button) view.findViewById(R.id.btnDelete);
        btnupd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smd.SenData("");
            }
        });

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mahasiswa_1, container, false);
    }

    interface sendMessage{
        void  SenData(String Message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            smd = (sendMessage) getActivity();
        }catch (ClassCastException e){
            throw  new  ClassCastException("Error in retrieving data. please try again");
        }
    }
}
