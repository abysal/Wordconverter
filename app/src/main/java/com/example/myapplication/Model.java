package com.example.myapplication;

public class Model {
    private String[] oness = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tenss = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public Model() {
    }

    public Model(String[] ones, String[] tens) {
        this.oness = ones;
        this.tenss = tens;
    }

    public String[] getOness() {
        return oness;
    }

    public void setOness(String[] oness) {
        this.oness = oness;
    }

    public String[] getTenss() {
        return tenss;
    }

    public void setTenss(String[] tenss) {
        this.tenss = tenss;
    }
}
