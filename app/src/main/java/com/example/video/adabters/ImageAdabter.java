package com.example.video.adabters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.video.Interface.ImageOnClick;
import com.example.video.PaintActivity;
import com.example.video.R;
import com.example.video.ViewHolder.ImageViewHolder;
import com.example.video.common.Common;

import java.util.ArrayList;
import java.util.List;

public class ImageAdabter extends RecyclerView.Adapter<ImageViewHolder> {

    private Context mContext;
    private List<Integer> listImages;

    public ImageAdabter(Context mContext) {
        this.mContext = mContext;
        this.listImages = getImages();
    }

    private List<Integer> getImages() {
        List<Integer> results = new ArrayList<>();

        results.add(R.drawable.anexoindependence);
        results.add(R.drawable.anexoindependence11);
        results.add(R.drawable.anexobrazilian2);
        results.add(R.drawable.anexoaulastpatrick);
        results.add(R.drawable.anexocarnaval1);
        results.add(R.drawable.anexocarnaval3);
        results.add(R.drawable.anexoeasterday);
        results.add(R.drawable.anexojunina1);
        results.add(R.drawable.anexopag64_2);
        results.add(R.drawable.anexopag64_3);
        results.add(R.drawable.anexopag64);


        return results;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_images,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(listImages.get(position));

        holder.setImageOnClick(new ImageOnClick() {
            @Override
            public void onClick(int pos){
                Common.PICTURE_SELECTED = listImages.get(pos);
                mContext.startActivity(new Intent(mContext, PaintActivity.class));

            }

        });
        }




    @Override
    public int getItemCount() {
        return listImages.size();
    }
}
