package com.example.android.deltatask2;

;


import android.graphics.Bitmap;

public class PhotoList {

    private String Caption,path;
    Bitmap photo;


    public void setCaptions(String Caption){

        this.Caption = Caption;

    }

    public String getCaption(){
        return Caption;
    }

    public void setPath(String path){
        this.path=path;
    }
    public String getPath(){
        return path;
    }


}
