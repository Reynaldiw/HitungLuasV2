package com.reynaldiwijaya.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {

    EditText edtAlasSegitiga;
    EditText edtTinggiSegitiga;
    TextView txtHasilSegitiga;
    Button btnHitungSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlasSegitiga = findViewById(R.id.edtAlasSegitiga);
        edtTinggiSegitiga = findViewById(R.id.edtTinggiSegitiga);
        txtHasilSegitiga = findViewById(R.id.txtHasilSegitiga);
        btnHitungSegitiga = findViewById(R.id.btnHitungSegitiga);

        btnHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Alas = Integer.valueOf(edtAlasSegitiga.getText().toString());
                Integer Tinggi = Integer.valueOf(edtTinggiSegitiga.getText().toString());

                hitungLuasSegitiga(Alas,Tinggi);
            }
        });
    }

    public void hitungLuasSegitiga(Integer Alas, Integer Tinggi){
        Integer hasil;

        hasil = Alas * Tinggi / 2;

        txtHasilSegitiga.setText(String.valueOf(hasil));
    }
}
