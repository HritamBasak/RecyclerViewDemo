package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.MainActivity;
import com.example.recyclerviewdemo.R;

import java.util.ArrayList;

import Model.ModelRecipe;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolderClass> {
    ArrayList<ModelRecipe> list;
    Context context;
    public AdapterClass(ArrayList<ModelRecipe> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_recyclerview,parent,false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        ModelRecipe model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        switch (position)
        {
            case 0:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"ButterNun is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"ButterNun is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 1:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Cake and Samosa is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Cake and Samosa is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                break;
            case 2:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Chicken Wings is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Chicken Wings is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 3:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Chocolates is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Chocolates is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                break;
            case 4:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Tea is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Tea is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 5:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Maggie is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Maggie is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 6:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Sweets is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Sweets is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 7:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Patties is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Patties is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case 8:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Rajpapri is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Rajpapri is clicked",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                break;
            case 9:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Rasmalai is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast=Toast.makeText(context,"Rasmalai is clicked",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
        }
    }
    @Override
    public int getItemCount() {

        return list.size();
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
