package com.example.administrator.chuyendoinam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnKetqua=(Button) findViewById(R.id.tong2so);
        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edita=(EditText)
                        findViewById(R.id.editsoa);
                int a=Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText) findViewById(R.id.editsob);
                int b=Integer.parseInt(editb.getText()+"");
                TextView txtkq=(TextView) findViewById(R.id.txtkq);
                txtkq.setText((a+b)+"");
            }

            });
        }
    }

