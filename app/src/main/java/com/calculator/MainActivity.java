package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText tresult;
private Button btnone,btntwo,btnthree, btnfour,
        btnfive,btnsix,btnseven,btneight,btnnine,btnzero,
        btndivide,btnmultiply,btnsubtract,btnadd,
        btnpoint,btnequalto,btnclear;

    float num1,num2;

    boolean add,sub,multi,divide,equalto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        tresult = findViewById(R.id.result);

        btnone = findViewById(R.id.one);
        btntwo = findViewById(R.id.two);
        btnthree = findViewById(R.id.three);
        btnfour = findViewById(R.id.four);
        btnfive = findViewById(R.id.five);
        btnsix  = findViewById(R.id.six);
        btnseven = findViewById(R.id.seven);
        btneight = findViewById(R.id.eight);
        btnnine = findViewById(R.id.nine);
        btnzero = findViewById(R.id.zero);


        btndivide = findViewById(R.id.division);
        btnmultiply = findViewById(R.id.multiply);
        btnsubtract = findViewById(R.id.subtract);
        btnadd = findViewById(R.id.plus);
        btnpoint = findViewById(R.id.point);
        btnequalto = findViewById(R.id.equalto);
        btnclear = findViewById(R.id.clear);



        btnone.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

            tresult.setText(tresult.getText() + "1");
         }
     });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "2");
            }
        });


        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "3");
            }
        });


        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "4");
            }
        });


        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "5");
            }
        });


        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "6");
            }
        });


        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "7");
            }
        });


        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "8");
            }
        });

        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "9");
            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + "0");
            }
        });

        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tresult.setText(tresult.getText() + ".");
            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tresult == null)
                {
                    tresult.setText("+");
                }
                else
                {
                     num1 = Float.parseFloat(tresult.getText() + "");
                       add = true;
                    tresult.setText(null);
                }
            }
        });


        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(tresult.getText() + "");
                sub = true;
                tresult.setText(null);
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(tresult.getText() + "");
                divide = true;
                tresult.setText(null);
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(tresult.getText() + "");
                multi = true;
                tresult.setText(null);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tresult.setText("");
            }
        });

        btnequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2 = Float.parseFloat(tresult.getText() + "");

                if (add == true){
                    tresult.setText(num1 + num2 + "");
                    add = false;
                }

                else if (sub == true){
                    tresult.setText(num1 - num2 + "");
                    sub = false;
                }

                else if (multi == true){
                    tresult.setText(num1 * num2 + "");
                    multi = false;
                }

                else if (divide == true){
                    tresult.setText(num1 / num2 + "");
                    divide = false;
                }

            }
        });


    }
}
