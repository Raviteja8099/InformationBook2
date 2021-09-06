package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CardViewHolder> {

    private ArrayList<ModalClass> modalList=new ArrayList<>();
    private Context context;
    public CustomAdapter(ArrayList<ModalClass> modalList, Context context) {
        this.modalList = modalList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ModalClass item=modalList.get(position);
        holder.textView.setText(item.getImageContent());
        holder.imageView.setImageResource(context.getResources()
                .getIdentifier(item.getImageName(),"drawable",context.getPackageName()));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(position){
                    case 0:
                        Intent intent1=new Intent(context,CountriesActivity.class);
                        context.startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2=new Intent(context,LeadersActivity.class);
                        context.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3=new Intent(context,MuseumsActivity.class);
                        context.startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4=new Intent(context,WondersActivity.class);
                        context.startActivity(intent4);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modalList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        CardView cardView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
            cardView=itemView.findViewById(R.id.cardView);
        }

      
    }
}
