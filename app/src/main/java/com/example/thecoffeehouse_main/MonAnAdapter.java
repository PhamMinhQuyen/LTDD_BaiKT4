package com.example.thecoffeehouse_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.MyViewHolder>  {

    private Context context;
    private List<MonAn> list;

    public MonAnAdapter(Context context, List<MonAn> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);

        return new MonAnAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            MonAn monAn = list.get(position);
            holder.name.setText(monAn.getName());
        holder.name1.setText(monAn.getName1());
        holder.name2.setText(monAn.getName2());
        holder.name3.setText(monAn.getName3());
        holder.name4.setText(monAn.getName4());
        holder.bt_order.setText(monAn.getBt_order());
        holder.img.setImageResource(monAn.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,name1,name2,name3,name4;
        Button bt_order;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            name1=(TextView)itemView.findViewById(R.id.name1);
            name2=(TextView)itemView.findViewById(R.id.name2);
            name3=(TextView)itemView.findViewById(R.id.name3);
            name4=(TextView)itemView.findViewById(R.id.name4);
            bt_order=(Button)itemView.findViewById(R.id.bt_order);
            img=(ImageView)itemView.findViewById(R.id.img);

        }
    }
}
