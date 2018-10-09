package com.reynaldiwijaya.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaranActivity extends AppCompatActivity {

    EditText edtR;
    TextView txtHasilLingkaran;
    Button btnHitungLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        edtR = findViewById(R.id.edtR);
        txtHasilLingkaran = findViewById(R.id.txtHasilLingkaran);
        btnHitungLingkaran = findViewById(R.id.btnHitungLingkaran);

        btnHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double jariJari  = Double.valueOf(edtR.getText().toString());

                hitungLuasLingkaran(jariJari);
            }
        });
    }

    public void hitungLuasLingkaran(Double jariJari){
        Double hasil;

        hasil = 3.14 * jariJari * jariJari;

        txtHasilLingkaran.setText(String.valueOf(hasil));

    }
}
