package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String english;
    private String igbo;
    private int res = NO_IMAGE_PROVIDED;

    public Word(String english, String igbo){
        this.english = english;
        this.igbo = igbo;
    }

    public Word(String english, String igbo, int res){
        this.english = english;
        this.igbo = igbo;
        this.res = res;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getIgbo() {
        return igbo;
    }

    public void setIgbo(String igbo) {
        this.igbo = igbo;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public boolean hasImage(){
        return res != NO_IMAGE_PROVIDED;
    }
}
