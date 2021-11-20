package com.bilgeadam.sayisalloto;

public class WhileOrnek {

    // for dongusunden farki,
    // sayidan cok duruma bagli olmasidir.

    // while dongusu ile 1'den 10'a kadar merhaba yazdiralim.
    public static void main(String[] args) {

        int sayac = 1;
        while(sayac <= 10)
        {
            System.out.println(sayac+ "Merhaba");
            // Genelde bu unutulur,
            // program sonsuz donguye giriyor.
            sayac = sayac + 1;

        }
    }



}


