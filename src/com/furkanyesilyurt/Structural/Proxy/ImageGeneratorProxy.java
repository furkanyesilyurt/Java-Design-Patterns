package com.furkanyesilyurt.Structural.Proxy;

public class ImageGeneratorProxy implements IImageGenerator{

    private ImageGenerator imageGenerator;
    private String imagePath;

    public ImageGeneratorProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void showImage() {

        if(imageGenerator == null){

            imageGenerator = new ImageGenerator(imagePath);

        }

        imageGenerator.showImage();
    }
}
