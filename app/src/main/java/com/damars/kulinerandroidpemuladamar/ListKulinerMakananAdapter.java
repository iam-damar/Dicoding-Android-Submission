package com.damars.kulinerandroidpemuladamar;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKulinerMakananAdapter extends RecyclerView.Adapter<ListKulinerMakananAdapter.ListViewHolder> {
    private OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    private final ArrayList<KulinerMakanan> listMakanan;

    public ListKulinerMakananAdapter(ArrayList<KulinerMakanan> list){
        this.listMakanan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kuliners, viewGroup, false);
        return new ListViewHolder(view);
    }

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        KulinerMakanan kulinerMakanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load((kulinerMakanan.getPhoto()))
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kulinerMakanan.getNamaMakananKul());
        holder.tvDetail.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        holder.tvDetail.setText(kulinerMakanan.getDetaiMakananKul());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listMakanan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallBack {
        void onItemClicked(KulinerMakanan data);
    }
}
