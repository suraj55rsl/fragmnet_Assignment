package com.example.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secfragment f2=new secfragment();
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.add(R.id.rawFragment,f2);
        ft.commit();
        ft.addToBackStack(null);


//        getSupportFragmentManager().beginTransaction().add(R.id.rawFragment,f2).commit();

    }

//    public void btnFragment1(View view) {
//        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
//        firstfragment f1=new firstfragment();
//        ft.replace(R.id.rawFragment,f1);
//        ft.commit();
//        ft.addToBackStack(null);
//
//    }
//
//    public void btnFragment2(View view) {
//        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
//        secfragment f2=new secfragment();
//        ft.replace(R.id.rawFragment,f2);
//        ft.commit();
//        ft.addToBackStack(null);
//    }
}



