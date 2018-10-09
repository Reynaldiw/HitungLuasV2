package com.reynaldiwijaya.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 menginisiasi widget ke dalam variable di java
        Button btnMasuk = findViewById(R.id.btnMasuk);

        //TODO 2 membuat method onClick
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO 3 mebuat Intent untuk pindah halaman dari MainActivity ke MenuActivity
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);

                //TODO 4 Lalu memanggil Function startActivity untuk berpindah halaman
                startActivity(pindah);
            }
        });
    }
}
