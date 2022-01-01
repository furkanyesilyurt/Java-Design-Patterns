package com.furkanyesilyurt.Structural.Proxy;

public class ImageGenerator implements IImageGenerator{

    private String imagePath;

    public ImageGenerator(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void showImage() {
        System.out.println("Image is showing.. " + imagePath);
    }
}
