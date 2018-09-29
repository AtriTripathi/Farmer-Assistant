package com.farmerhelper.farmerhelper;

public class Crop {
    private String cr, msp, season;
    private int soil;

    public Crop(String CropName, String MSP, String Season, int Soil) {
        cr = CropName;
        msp = MSP;
        season = Season;
        soil = Soil;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getSoil() {
        return soil;
    }

    public void setSoil(int soil) {
        this.soil = soil;
    }
}
