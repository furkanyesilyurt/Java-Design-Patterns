package com.furkanyesilyurt.Structural.Adapter;

public class Vigenére implements Crypt{

    @Override
    public void encrypt(String text) {
        System.out.println("Vigenére - encrypt");
    }

    @Override
    public void decrypt(String text) {
        System.out.println("Vigenére - decrypt");
    }
}
