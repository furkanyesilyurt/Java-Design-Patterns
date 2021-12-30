package com.furkanyesilyurt.Structural.Adapter;

public class CryptAdapter implements Crypt{

    private PrivateCrypt privateCrypt;

    public CryptAdapter(PrivateCrypt privateCrypt) {
        this.privateCrypt = privateCrypt;
    }

    @Override
    public void encrypt(String text) {
        privateCrypt.codeToText(text);
    }

    @Override
    public void decrypt(String text) {
        privateCrypt.textToCode(text);
    }
}
