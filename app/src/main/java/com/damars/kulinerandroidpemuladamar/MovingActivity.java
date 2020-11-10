package com.damars.kulinerandroidpemuladamar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovingActivity extends AppCompatActivity {
    ImageView tvImage;
    TextView tvNamaMakanan, tvKeteranganMakanan, tvHargaMakanan;

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moving);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;

        tvNamaMakanan = findViewById(R.id.tv_nama_makanan);
        tvImage = findViewById(R.id.tv_imageMakanan);
        tvHargaMakanan = findViewById(R.id.tv_hargaMakanan);
        tvKeteranganMakanan = findViewById(R.id.tv_identitas_keterangan);

        int photoimage = getIntent().getIntExtra("alamat_image", 0);
        String namaMakanan = getIntent().getStringExtra("nama_makanan");
        String detailMakanan = getIntent().getStringExtra("detail_makanan");
        String hargaMakanan = getIntent().getStringExtra("harga_makanan");

        actionBar.setTitle("Detail Kuliner Makanan");

        Glide.with(this).asBitmap().load(photoimage).into(tvImage);

        tvNamaMakanan.setText(namaMakanan);
        tvKeteranganMakanan.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        tvKeteranganMakanan.setText(detailMakanan);
        tvHargaMakanan.setText(hargaMakanan);

    }
}