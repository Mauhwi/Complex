package com.example.android.complex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button button1 = (Button)view.findViewById(R.id.convertButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //перевод в показательную форму
                EditText text1 = (EditText)getView().findViewById(R.id.editText1);
                double deistv = Double.valueOf(text1.getText().toString());
                EditText text2 = (EditText)getView().findViewById(R.id.editText2);
                double i = Double.valueOf(text2.getText().toString());
                double r = Math.sqrt(Math.pow(deistv, 2) + Math.pow(i, 2));
                double fi = Math.atan(i/deistv);
                TextView textView1 = (TextView)getView().findViewById(R.id.textView1);
                TextView textView12 = (TextView)getView().findViewById(R.id.textView12);
                r = Math.round(r * 100.0) / 100.0;
                fi = Math.round(fi * 100.0) / 100.0;
                String resultText1 = "z = " + Double.toString(r) + "e";
                String resultText12 = "i" + Double.toString(fi);
                textView1.setText(resultText1);
                textView12.setText(resultText12);
            }
    });
        return view; }
}
