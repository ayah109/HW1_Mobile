package com.example.arabic.Model;

public class ImageItem {
    private int imageResource;
    private String text;

    public ImageItem(int imageResource, String text) {
        this.imageResource = imageResource;
        this.text = text;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getText() {
        return text;
    }
}
