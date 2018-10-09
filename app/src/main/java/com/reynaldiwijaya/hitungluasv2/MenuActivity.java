package com.reynaldiwijaya.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //TODO 1 Luas Persegi, membuat method luasPersegi
    public  void luasPersegi(View view){
        //TODO 2 Luas Persegi membuat objek
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);
        //TODO 3 menjalankan startActivity
        startActivity(pindah);

    }

    public void luasPersegiPanjang(View view){
        Intent pindah2 = new Intent(MenuActivity.this, LuasPersegiPanjangActivity.class);

        startActivity(pindah2);
    }

    public void luasLingkaran(View view){
        Intent pindah3 = new Intent(MenuActivity.this, LuasLingkaranActivity.class);

        startActivity(pindah3);
    }

    public void luasSegitiga(View view){
        Intent pindah4 = new Intent(MenuActivity.this, LuasSegitigaActivity.class);

        startActivity(pindah4);
    }


    }

