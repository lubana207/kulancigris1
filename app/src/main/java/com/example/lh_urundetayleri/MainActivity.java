package com.example.lh_urundetayleri;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    
    private EditText lh_girismcismi;
    private EditText lh_girismcisoyad;
    private RadioGroup lh_girismcicinsiyati;
    public Spinner lh_girissekli;
    ArrayList<lh_girismci> lh_girismcis;
    ImageView lh_foto;
    private Button lh_fotocek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lh_girismcismi = findViewById(R.id.lh_editText);
        lh_girismcisoyad = findViewById(R.id.lh_editText2);
        lh_girismcicinsiyati = findViewById(R.id.lh_radiogroup);
        lh_girissekli = findViewById(R.id.lh_spinner);
        lh_foto = findViewById(R.id.ilh_mageView);
        lh_fotocek = findViewById(R.id.lh_button2);
        lh_girismcis = new ArrayList<>();

    }

    public void lh_fotocek(View view) {
        Intent lh_intetfoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(lh_intetfoto, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK) {
            lh_foto.setImageBitmap((Bitmap) data.getExtras().get("data"));
        }
    }

    public void lh_olustur(View view) {
        lh_girismcis.add(new lh_girismci(lh_girismcismi.getText().toString(),
                lh_girismcisoyad.getText().toString(),
                lh_girissekli.getSelectedItem().toString()));

        Toast.makeText(getApplicationContext(),"kayıd oldun"
                +lh_girismcismi+" "+lh_girismcisoyad , Toast.LENGTH_LONG).show();


    }

    public void lh_listele(View view) {
        Intent lh_gecis= new Intent(MainActivity.this,lh_listeactivity.class);
        startActivity(lh_gecis);
    }
}