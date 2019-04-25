package com.example.android.complex;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //первый фрагмент активный по умолчанию
        if(savedInstanceState == null) {
            getSupportFragmentManager().
                    beginTransaction().replace(R.id.fragment_place,new FragmentOne()).commit();
        }
    }

    //смена активных фрагментов на экране
    public void ChangeFragment(View view){
       Fragment fragment;
       if (view == findViewById(R.id.button1)) {
           fragment = new FragmentOne();
           FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
           ft.replace(R.id.fragment_place, fragment);
           ft.addToBackStack(null);
           ft.commit();
       }

       if (view == findViewById(R.id.button2)) {
           fragment = new FragmentTwo();
           FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
           ft.replace(R.id.fragment_place, fragment);
           ft.addToBackStack(null);
           ft.commit();
       }
    }
}
