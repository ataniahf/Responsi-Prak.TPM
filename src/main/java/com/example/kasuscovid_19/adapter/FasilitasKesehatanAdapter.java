package com.example.kasuscovid_19.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kasuscovid_19.R;
import com.example.kasuscovid_19.model.fasilitas_kesehatan.FasilitasiKesehatanDataItem;

import java.util.ArrayList;
//menghubungkan recycleview dengan data (fasilitas kesehatan berupa nama dan alamat rumah sakit)
public class FasilitasKesehatanAdapter extends RecyclerView.Adapter<FasilitasKesehatanAdapter.ViewHolder> {
    private ArrayList<FasilitasiKesehatanDataItem> fasilitasiKesehatanDataItems = new ArrayList<>();
    private Context context;
//deklarasi
    public void setData(ArrayList<FasilitasiKesehatanDataItem> items){
        fasilitasiKesehatanDataItems.clear();
        fasilitasiKesehatanDataItems.addAll(items);
        notifyDataSetChanged();
    }

    public FasilitasKesehatanAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FasilitasKesehatanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //mengconvert file layout add_item.xml sebagai view object baru didalam layout utama/parent
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FasilitasKesehatanAdapter.ViewHolder holder, int position) {
        //mengambil/memegang data yang sesuai (id) dan dimasukkan ke data items
        holder.tv_namaRS.setText(fasilitasiKesehatanDataItems.get(position).getNama());
        holder.tv_alamatRS.setText(fasilitasiKesehatanDataItems.get(position).getAlamat());
        holder.btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menghubungkan maps(aktivity) di aplikasi android diarahkahkan ke maps alamat rs
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q="+ fasilitasiKesehatanDataItems.get(position).getAlamat()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fasilitasiKesehatanDataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //inisialisasi
        TextView tv_namaRS,tv_alamatRS;
        Button btn_map;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //menemukan id yang ada di add_item
            tv_namaRS = itemView.findViewById(R.id.itemfasilitaskesehatan_tv_namaRS);
            tv_alamatRS = itemView.findViewById(R.id.itemfasilitaskesehatan_tv_alamatRS);
            btn_map = itemView.findViewById(R.id.itemfasilitaskesehatan_btn_map);
        }
    }
}
