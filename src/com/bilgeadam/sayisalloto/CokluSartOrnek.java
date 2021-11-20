package com.bilgeadam.sayisalloto;

public class CokluSartOrnek {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 35;

        int sayi3 = 41;

        // veya(or) opreratoru || isareti budur.
        // ve (and) operatoru &&
        if (sayi3 == sayi1 || sayi3 == sayi2)
        {
            System.out.println("tekrarlanan sayi var!");
        }

        while (sayi3 != sayi1 && sayi3 !=sayi2)
        {
            System.out.println("sayi3 digerlerine esit degil!");
            sayi3 = sayi1;

        }

    }
}
