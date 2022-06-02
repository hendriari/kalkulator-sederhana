package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textview1;
    Button btntambah,btnkurang, btnkali, btnbagi, btnreset;
    EditText text1, text2;
    float number1;
    float number2;
    float getKurang;
    float getKali;
    float getTambah;
    float getBagi;
    float counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Variabel();
        EksekusiTambah();
        EksekusiKurang();
        EksekusiKali();
        EksekusiBagi();
        EksekusiReset();


    }
        private boolean validasi(){
            if (text1.getText().toString().equals("") || text1.getText() == null){
                return false;
            } else if (text2.getText().toString().equals("") || text2.getText() == null){
                return false;
            } return true;
        }

        private void Variabel() {
            text1 = findViewById(R.id.text1);
            text2 = findViewById(R.id.text2);
            btntambah = findViewById(R.id.btntambah);
            textview1 = findViewById(R.id.textview1);
            btnkurang = findViewById(R.id.btnkurang);
            btnkali = findViewById(R.id.btnkali);
            btnbagi = findViewById(R.id.btnbagi);
            btnreset = findViewById(R.id.btnreset);
        };

    private void EksekusiTambah(){
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasi()) {
                    number1 = Float.parseFloat(text1.getText().toString());
                    number2 = Float.parseFloat(text2.getText().toString());
                    getTambah = number1 + number2;
                    textview1.setText(String.valueOf(getTambah));
                } else ShowMessage("Anda Belum Memasukan Angka");
            }
        });
    }

    private void EksekusiKurang(){
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasi()) {
                    number1 = Float.parseFloat(text1.getText().toString());
                    number2 = Float.parseFloat(text2.getText().toString());
                    getKurang = number1 - number2;
                    textview1.setText(String.valueOf(getKurang));
                }else ShowMessage("Anda Belum Memasukan Angka");
            }
        });
    }

    private void EksekusiKali() {
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasi()) {
                    number1 = Float.parseFloat(text1.getText().toString());
                    number2 = Float.parseFloat(text2.getText().toString());
                    getKali = number1 * number2;
                    textview1.setText(String.valueOf(getKali));
                }else ShowMessage("Anda Belum Memasukan Angka");
            }
        });
    }

    private void EksekusiBagi() {
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasi()) {
                    number1 = Float.parseFloat(text1.getText().toString());
                    number2 = Float.parseFloat(text2.getText().toString());
                    getBagi = number1 / number2;
                    textview1.setText(String.valueOf(getBagi));
                }else ShowMessage("Anda Belum Memasukan Angka");
            }
        });
    }

    private void EksekusiReset() {
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                text1.setText("");
                text2.setText("");
                textview1.setText("" + counter);

            }
        });
    }

    private void ShowMessage(String Message){
        Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_SHORT).show();
    }
}