package com.example.lh_urundetayleri;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class lh_listeactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lh_listeactivity);

        ArrayList<lh_urun> lh_uruns = new ArrayList<lh_urun>();
        lh_uruns.add(new lh_urun("Etek", "S Beden", "Larcivart",R.drawable.p));
        lh_uruns.add(new lh_urun("Etek", "M Beden", "Pempe",R.drawable.p4));
        lh_uruns.add(new lh_urun("Etek", "L Beden", "Açık Mor",R.drawable.p5));
        lh_uruns.add(new lh_urun("tisort", "S Beden", "Mavi",R.drawable.p3));
        lh_uruns.add(new lh_urun("tisort", "M Beden", "Pempe",R.drawable.p1));
        lh_uruns.add(new lh_urun("tisort", "L Beden", "Mor",R.drawable.p6));
        lh_customadapter lh_adapter = new lh_customadapter(lh_uruns);

        ListView lh_List = findViewById(R.id.lh_listeview);
        lh_List.setAdapter(lh_adapter);
        lh_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // TextView lh_urunismi = (TextView) view.findViewById(R.id.lh_urunismi);
                //TextView lh_urunbedeni = (TextView) view.findViewById(R.id.lh_urunbedeni);
               // TextView lh_urunrenk = (TextView) view.findViewById(R.id.lh_urunrenk);
              //  Toast.makeText(getApplication(), "Urun Seçildi", Toast.LENGTH_LONG).show();
               // lh_adapter.notifyDataSetChanged();

            }
        });
    }
    class lh_customadapter extends BaseAdapter {
        ArrayList<lh_urun> lh_uruns = new ArrayList<lh_urun>();

        lh_customadapter(ArrayList<lh_urun> lh_uruns) {

            this.lh_uruns = lh_uruns;
        }
        @Override
        public int getCount() {
            return lh_uruns.size();
        }
        @Override
        public Object getItem(int position) {
            return lh_uruns.get(position).lh_urunismi;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            LayoutInflater lh_infliter = getLayoutInflater();
            View view1 = lh_infliter.inflate(R.layout.row, null);
            TextView lh_urunismi = (TextView) view1.findViewById(R.id.lh_urunismi);
            TextView lh_urunbedeni = (TextView) view1.findViewById(R.id.lh_urunbedeni);
            TextView lh_urunrenk = (TextView) view1.findViewById(R.id.lh_urunrenk);
            ImageView  lh_ımage =(ImageView)  view1.findViewById(R.id.lh_imageView);
            Button lh_urunekle=(Button)view1.findViewById(R.id.lh_ekle) ;


            lh_urunekle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplication(), "Urun eklendi", Toast.LENGTH_LONG).show();

                }
            });

            lh_urunismi.setText(lh_uruns.get(i).lh_urunismi);
            lh_urunbedeni.setText(lh_uruns.get(i).lh_urunbedeni);
            lh_urunrenk.setText(lh_uruns.get(i).lh_urunrenk);
            lh_ımage.setImageResource(lh_uruns.get(i).lh_ımage);

            return view1;
        }
    }
 }



