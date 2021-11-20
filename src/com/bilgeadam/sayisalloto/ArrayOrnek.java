package com.bilgeadam.sayisalloto;

public class ArrayOrnek {

    public static void main(String[] args) {

        // arraylerin tipi olmak zorundadir, String mi int mi ?
        int sayilar[] = new int[6];
        // 6 li olusturduysak, array indeksleri 0 dan 5 e kadardir.

        sayilar[0] = 23;
        sayilar[1] = 11;
        sayilar[2] = -34;
        sayilar[3] = 46;
        sayilar[4] = 0;
        sayilar[5] = -29;

        // sayilar[6] yaparsak bu hata verir, 6 diye bir indeks yok.
        //sayilar[6]= 500;
        // i++ = i = i+1 demektir.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }

    }

}
