package com.example.android.complex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentTwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_two, container, false);
        Button button1 = (Button)view2.findViewById(R.id.convertButton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //перевод в алгебраическую форму
                EditText text1 = (EditText)getView().findViewById(R.id.editText3);
                double arg = Double.valueOf(text1.getText().toString());
                EditText text2 = (EditText)getView().findViewById(R.id.editText4);
                double mod = Double.valueOf(text2.getText().toString());
                double re = Math.cos(Math.toRadians(arg))*mod;
                double im = Math.sin(Math.toRadians(arg))*mod;
                TextView textView2 = (TextView)getView().findViewById(R.id.textView2);
                re = Math.round(re * 100.0) / 100.0;
                im = Math.round(im * 100.0) / 100.0;
                String resultText2 = "z = " + Double.toString(re) + " + " + Double.toString(im) + "i";
                textView2.setText(resultText2);
            }
        });
        return view2; }

}
