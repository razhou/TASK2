package com.example.ghost.kalkulator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText in, ou, val;
    Button hitung, clear, del;
    String evalue;
    //String temp1,temp2 ="";


    public String str1 = "";
    public String str2="";
    Character op = 'q';
    Integer num1, num2,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view);
        in = (EditText) findViewById(R.id.txtIn);
        ou = (EditText) findViewById(R.id.txtOut);
        val = (EditText) findViewById(R.id.txtVal);
        hitung = (Button) findViewById(R.id.btnHitung);
        clear = (Button) findViewById(R.id.btnClr);
        del = (Button) findViewById(R.id.btnDel);




        in.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "1";
                return false;
            }
        });

        ou.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "2";
                return false;
            }
        });


}

    public void btn1Clicked(View v) {

        if (evalue == "1") {
            insert(1);

        }
        if (evalue == "2") {
            out(1);
        }

    }
    public void btn2Clicked(View v) {

        if (evalue == "1") {
            insert(2);
        }
        if (evalue == "2") {
            out(2);
        }

    }
    public void btn3Clicked(View v){
        if (evalue == "1") {
            insert(3);
        }
        if (evalue == "2") {
            out(3);
        }

    }
    public void btn4Clicked(View v){
        if (evalue == "1") {
            insert(4);
        }
        if (evalue == "2") {
            out(4);
        }

    }
    public void btn5Clicked(View v){
        if (evalue == "1") {
            insert(5);
        }
        if (evalue == "2") {
            out(5);
        }

    }
    public void btn6Clicked(View v){
        if (evalue == "1") {
            insert(6);
        }
        if (evalue == "2") {
            out(6);
        }

    }
    public void btn7Clicked(View v){
        if (evalue == "1") {
            insert(7);
        }
        if (evalue == "2") {
            out(7);
        }

    }
    public void btn8Clicked(View v){
        if (evalue == "1") {
            insert(8);
        }
        if (evalue == "2") {
            out(8);
        }

    }
    public void btn9Clicked(View v){
        if (evalue == "1") {
            insert(9);
        }
        if (evalue == "2") {
            out(9);
        }

    }
    public void btn0Clicked(View v){
        if (evalue == "1") {
            insert(0);
        }
        if (evalue == "2") {
            out(0);
        }

    }

    public void btnClrClicked(View v){
        str1="";
        str2="";
        String delclr = "";
        in.setText(str1);
        ou.setText(str2);
        val.setText(delclr);
    }


    public void btnDelClicked(View v){
        if(evalue=="1"){
            ///Integer panjang = in.getText().length();
            ///if(panjang!=0) {
               // in.setText(in.getText().subSequence(0, panjang - 1));
            //}else if (panjang==0){
              //  in.setText("");
           // }

            str1 = in.getText().toString();
            if(str1.length() >= 1){
                str1 = str1.substring(0, str1.length()-1);
                in.setText(str1);
            }else if (str1.length() < 1 ){
                in.setText(str1);
            }

        }
        if(evalue=="2"){
           // Integer panjang2 = ou.getText().length();
           // if(panjang2!=0) {
               // ou.setText(ou.getText().subSequence(0, panjang2 - 1));
           // }

            str2 = ou.getText().toString();
            if(str2.length() >= 1){
                str2 = str2.substring(0, str2.length() -1);
                ou.setText(str2);
            }else if (str2.length() < 1 ){
                ou.setText(str2);
            }
        }
    }


    public void insert(int j){
        str1=str1+Integer.toString(j);
        num1 = Integer.valueOf(str1).intValue();
        in.setText(str1);

    }

    public void out(int k){
        str2=str2+Integer.toString(k);
        num2 = Integer.valueOf(str2).intValue();
        ou.setText(str2);

    }

    public void btnHitungClicked(View v){
        hasil=num1-num2;
        val.setText(Integer.toString(hasil));

    }







}