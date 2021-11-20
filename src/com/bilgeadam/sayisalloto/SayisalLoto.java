package com.bilgeadam.sayisalloto;

import java.util.Random;

public class SayisalLoto {


    public int sayiGetir( int maxSayi)
    {
        Random rnd = new Random();
        return rnd.nextInt(maxSayi)+1;
    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        // 6,li bir Array olursturduk.
        int sayilar[] = new int[6];

        // donguyle arrayi,i olusturalim.
        for (int i = 0; i < 6; i++) {

          sayilar[i] = loto.sayiGetir(49);
        }
        // array'i yazdir.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);


        }



    }

}
