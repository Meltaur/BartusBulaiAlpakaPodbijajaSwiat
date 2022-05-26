package com.example.plemionagui;

import javafx.scene.image.ImageView;

public class TableImage {
    private ImageView image;

    TableImage(ImageView img){
        this.image = img;
    }

    public void setImage(ImageView value){
        image = value;
    }

    public ImageView getImage(){
        return  image;
    }

}
