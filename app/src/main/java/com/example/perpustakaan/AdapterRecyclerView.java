package com.example.perpustakaan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private final ArrayList <ItemModel> dataItem;

    private Context context;


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        ImageView imageIcon;
        LinearLayoutCompat parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_title);
            imageIcon = itemView.findViewById(R.id.imageList);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

    AdapterRecyclerView(Context context,ArrayList<ItemModel> dataItem) {
        this.context = context;
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        imageIcon.setImageResource(dataItem.get(position).getImage());

        holder.parentLayout.setOnClickListener(v -> {
            Toast.makeText(context, "Anda Memilih" + dataItem.get(position).getName(), Toast.LENGTH_SHORT).show();

            if (dataItem.get(position).getName().equals("Matematika")) {
                context.startActivity(new Intent(context,MatematikaActivity.class));
            }
            if (dataItem.get(position).getName().equals("Ilmu Pengetahuan Alam")) {
                context.startActivity(new Intent(context,IpaActivity.class));
            }
            if (dataItem.get(position).getName().equals("Ilmu Pengetahuan Sosial")) {
                context.startActivity(new Intent(context,IpsActivity.class));
            }
            if (dataItem.get(position).getName().equals("Pendidikan Kewarganegaraan")) {
                context.startActivity(new Intent(context,PknActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
