package com.reynaldiwijaya.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiActivity extends AppCompatActivity {

    //TODO 1 Luas Persegi membuat variable Global dengan tipe data widget
    EditText edtSisi;
    TextView txtHasil;
    Button btnHitung;
    Integer hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        //TODO 2 Menginisiasikan object
        edtSisi = findViewById(R.id.edtSisi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        //TODO 3 membuat method onClick intuk mendeteksi click dari user
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 4 Memasukan input isi editText dari user
                Integer sisi = Integer.valueOf(edtSisi.getText().toString());

                //TODO 5 Memangging Function hitungLuasPersegi
                hitungLuasPersegi(sisi);
            }
        });
    }

    //TODO Membuat Method hitungLuasPersegi
    private void hitungLuasPersegi(Integer sisi) {
        //TODO 7 menghitung Luas Persegi
        hasil = sisi * sisi;

        //TODO 7 Cetak Hasil
        txtHasil.setText(String.valueOf(hasil));
    }

}
