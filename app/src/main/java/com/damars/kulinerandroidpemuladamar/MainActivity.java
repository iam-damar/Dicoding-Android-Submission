package com.damars.kulinerandroidpemuladamar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKulinerMakanan;
    private ArrayList<KulinerMakanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        setTitle("Kuliner Khas Blora");

        rvKulinerMakanan = findViewById(R.id.rv_kuliners);
        rvKulinerMakanan.setHasFixedSize(true);

        list.addAll(DataKulinerMakanan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKulinerMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerMakananAdapter listKulinerMakananAdapter = new ListKulinerMakananAdapter(list);
        rvKulinerMakanan.setAdapter(listKulinerMakananAdapter);

        listKulinerMakananAdapter.setOnItemClickCallBack(new ListKulinerMakananAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(KulinerMakanan data) {
                ShowKulinerMakanan(data);
            }
        });
    }

    private void ShowKulinerMakanan(KulinerMakanan kulinerMakanan) {
        Intent directintent = new Intent(MainActivity.this, MovingActivity.class);
        Toast.makeText(this, kulinerMakanan.getNamaMakananKul(), Toast.LENGTH_SHORT).show();
        directintent.putExtra("alamat_image", kulinerMakanan.getPhoto());
        directintent.putExtra("nama_makanan", kulinerMakanan.getNamaMakananKul());
        directintent.putExtra("harga_makanan", kulinerMakanan.getHargaMakananKul());
        directintent.putExtra("detail_makanan", kulinerMakanan.getDetaiMakananKul());
        startActivity(directintent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.kuliner_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setModeMenu(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setModeMenu(int IdisSelected) {
        switch (IdisSelected) {
            case R.id.item_ribbon:
                hereAboutMe();
                break;
        }
    }
    private void hereAboutMe(){
        Intent directIintent = new Intent(MainActivity.this, AboutsMe.class);
        startActivity(directIintent);
    }


}