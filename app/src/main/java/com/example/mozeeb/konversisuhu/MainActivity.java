package com.example.mozeeb.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable
    Button btn_konversi; //deklarasi varaibel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celcius = (EditText)findViewById(R.id.celcius);
        kelvin = (EditText)findViewById(R.id.kelvin);
        farenheit = (EditText)findViewById(R.id.farenheit);
        reamur = (EditText)findViewById(R.id.reamur);
        btn_konversi = (Button)findViewById(R.id.convert);
    }
    public void konversisuhu (View view){
        try{
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius*273.15;
            double nfarenheit = ncelcius*1.8*32;
            double nreamur = ncelcius*6.8;
            kelvin.setText(String.valueOf(nkelvin));
            farenheit.setText(String.valueOf(nfarenheit));
            reamur.setText(String.valueOf(nreamur));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
    public void keluar (View view){

        finish();
    }
}