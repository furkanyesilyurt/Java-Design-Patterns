package com.furkanyesilyurt.Structural.Adapter;

public class App {

    public static void main(String[] args) {

        Caesar caesar = new Caesar();
        caesar.encrypt("");
        caesar.decrypt("");

        Vigenére vigenére = new Vigenére();
        vigenére.encrypt("");
        vigenére.decrypt("");

        PrivateCrypt privateCrypt = new PrivateCrypt();
        privateCrypt.textToCode("");
        privateCrypt.codeToText("");

    }

}
