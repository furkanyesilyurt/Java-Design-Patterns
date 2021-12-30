package com.furkanyesilyurt.Structural.Adapter;

public class Caesar implements Crypt{

    @Override
    public void encrypt(String text) {
        System.out.println("Caesar - encrypt");
    }

    @Override
    public void decrypt(String text) {
        System.out.println("Caesar - decrypt");
    }
}
