package com.furkanyesilyurt.Structural.Proxy;

public class App {

    public static void main(String[] args) {

        ImageGeneratorProxy imageGeneratorProxy1 = new ImageGeneratorProxy("path1");
        ImageGeneratorProxy imageGeneratorProxy2 = new ImageGeneratorProxy("path2");

        imageGeneratorProxy1.showImage();
        imageGeneratorProxy2.showImage();

    }

}
