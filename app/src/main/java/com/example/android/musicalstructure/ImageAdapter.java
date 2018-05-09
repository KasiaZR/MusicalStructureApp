package com.example.android.musicalstructure;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{
    private Context mContext;

    public ImageAdapter (Context c) {
        mContext = c;
    }

    public int getCount(){
        return mThumbId.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbId[position]);
        return imageView;
    }

    private Integer[] mThumbId = {
            R.drawable.banjo, R.drawable.bass,
            R.drawable.cap, R.drawable.clubbing,
            R.drawable.drums, R.drawable.elvis,
            R.drawable.rap, R.drawable.rock,
            R.drawable.saxophone, R.drawable.slow,
            R.drawable.sunglasses, R.drawable.taco,
            R.drawable.violin
    };
}