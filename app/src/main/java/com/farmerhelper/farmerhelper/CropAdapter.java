package com.farmerhelper.farmerhelper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CropAdapter extends RecyclerView.Adapter<CropAdapter.CropViewHolder> {

//    private final LayoutInflater mInflater;
    private ArrayList<Crop> crop;

//    ArrayList<Crop> crop = new ArrayList<>();


    public static class CropViewHolder extends RecyclerView.ViewHolder {
        private TextView mCropName;
        private TextView mCropMsp;
        private TextView mSeason;

        public CropViewHolder(final View itemView) {
            super(itemView);
            mCropName = itemView.findViewById(R.id.tv_crop_name);
            mCropMsp = itemView.findViewById(R.id.tv_msp);
            mSeason = itemView.findViewById(R.id.tv_season);
        }

//        public CropViewHolder(TextView cropName, TextView cropMsp, TextView season) {
//            super(cropName);
//            mCropName = cropName;
//            mCropMsp = cropMsp;
//            mSeason = season;
//        }
    }

    public CropAdapter(ArrayList<Crop> crop, Context context) {
        this.crop = crop;
//        mInflater = LayoutInflater.from(context);
    }

    @Override
    public CropViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        crop.add(new Crop("Paddy common","1750", "Rabi", 1));
//        crop.add(new Crop("Paddy (F)/grade A","1770", "Rabi", 1));
//        crop.add(new Crop("Jowar Hybrid","2430", "Rabi", 1));
//        crop.add(new Crop("Jowar Maldandi","2450", "Rabi", 1));
//        crop.add(new Crop("Bajra","1950", "Rabi", 1));
//        crop.add(new Crop("Ragi","2897", "Rabi", 1));
//        crop.add(new Crop("Maize","1700", "Rabi", 1));
//        crop.add(new Crop("Tur(arhar)","5675", "Rabi", 1));
//        crop.add(new Crop("Moong","6975", "Rabi", 1));
//        crop.add(new Crop("Urad","5600", "Rabi", 1));
//        crop.add(new Crop("Groundnut","4890", "Rabi", 1));
//        crop.add(new Crop("Sunflower seed","5388", "Rabi", 1));
//        crop.add(new Crop("Soyabean Black","3100", "Rabi", 1));
//        crop.add(new Crop("Soyabean yellow","3399", "Rabi", 1));
//        crop.add(new Crop("Seasame","6249", "Rabi", 1));
//        crop.add(new Crop("Niger seed","5877", "Rabi", 1));
//        crop.add(new Crop("Medium staple","5150", "Rabi", 1));
//        crop.add(new Crop("Long staple cotton","5450", "Rabi", 1));
//        crop.add(new Crop("Gram","4400", "Rabi", 1));
//        crop.add(new Crop("Oilseed(mustard)","4000", "Rabi", 1));
//        crop.add(new Crop("Cashew","52000", "Rabi", 1));
//        crop.add(new Crop("Coconut Copra","7750", "Rabi", 1));
//        crop.add(new Crop("Arecanut","9500", "Rabi", 1));
//        crop.add(new Crop("Cardmom","14700", "Rabi", 1));
//        crop.add(new Crop("Chillies","315", "Rabi", 1));
//        crop.add(new Crop("Cotton","11800", "Rabi", 1));
//        crop.add(new Crop("Sugarcane","275", "Rabi", 1));
//        crop.add(new Crop("Tomato","550", "Rabi", 1));
//        crop.add(new Crop("Tamarind(with seed)","1800", "Rabi", 1));
//        crop.add(new Crop("Capsicum","3900", "Rabi", 1));
//        crop.add(new Crop("Pomegranate","2800", "Rabi", 1));
//        crop.add(new Crop("Watemelon","550", "Rabi", 1));
//        crop.add(new Crop("Grapes(Blue)","2300", "Rabi", 1));
//        crop.add(new Crop("Pepper","3250000", "Rabi", 1));
//        crop.add(new Crop("Cucumber","700", "Rabi", 1));
//        crop.add(new Crop("Tobaco Leaves","13910", "Rabi", 1));
//        crop.add(new Crop("Carrot","1900", "Rabi", 1));
//        crop.add(new Crop("Pineapple","2800", "Rabi", 1));
//        crop.add(new Crop("Beans","780", "Rabi", 1));
//        crop.add(new Crop("Lemon","2600", "Rabi", 1));
//        crop.add(new Crop("Jackfruit","2200", "Rabi", 1));
//        crop.add(new Crop("Turmeric","6000", "Rabi", 1));
//        crop.add(new Crop("Cocoa","20100", "Rabi", 1));
//        crop.add(new Crop("Ginger","2200", "Rabi", 1));
//        crop.add(new Crop("Mango","2500", "Rabi", 1));
//        crop.add(new Crop("Papaya(red indian)","3200", "Rabi", 1));
//        crop.add(new Crop("Rubber","12250", "Rabi", 1));
//        crop.add(new Crop("Suunflower seed","5385", "Rabi", 1));
//        crop.add(new Crop("Coffee","5890", "Rabi", 1));
//        crop.add(new Crop("Mulberry","47300", "Rabi", 1));
//        crop.add(new Crop("Potato","750", "Rabi", 1));
//        crop.add(new Crop("Onion","850", "Rabi", 1));

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.crop_item_view,parent,false);
        return new CropViewHolder(itemView);


//        CardView itemView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.crop_item_view, parent, false);
//        TextView cropName = parent.findViewById(R.id.tv_crop_name);
//        TextView cropMsp = parent.findViewById(R.id.tv_msp);
//        TextView season = parent.findViewById(R.id.tv_season);
//        CropViewHolder vh = new CropViewHolder(cropName,cropMsp,season);
//        return vh;
    }

    @Override
    public void onBindViewHolder(CropViewHolder holder, int position) {
        holder.mCropName.setText(crop.get(position).getCr());
        holder.mCropMsp.setText(crop.get(position).getMsp());
        holder.mSeason.setText(crop.get(position).getSeason());
    }

    @Override
    public int getItemCount() {
        return crop.size();
    }
}
