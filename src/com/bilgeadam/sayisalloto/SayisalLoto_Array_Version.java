package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_Array_Version {

    // static degiskene, obje olusturmadan
    // class_adi.degisken diye erisebiliyoruz.
    private  static final int MAX_SAYI = 90;
    private  static final int KAC_SAYI = 6;


    Random rnd = new Random();


    public  int sayiGetir()
    {
        // nextInt(90) metodu 0-89 arasi uretir
        //1'den baslayin diye ekliyoruz
        return  rnd.nextInt(MAX_SAYI)+1;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi)
    {

        //binarySearch ile ariyacagiz.
        //binarySearch kullanmanin sarti, arrayin sirali olmasidir.

        // gelen array'i siraliyorum
        Arrays.sort(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, sayi);

        // if'de cok satir kullanilacaksa suslu parantez kullanilir haricinde kullanilmaya gerek yok.
        if (sonuc >=0 )
            return true;
        else
            return false;


    }
    public void testArraydeVarmi()
    {
        int sayilar[] = {13,45,67,-4,41,70};
        int sayi = 67;
        boolean sonuc = arraydeVarmi(sayilar,sayi);
        if (sonuc==true)
            System.out.println("Arrayde var!");
        else
            System.out.println("Arrayde yok!");

    }


    public static void main(String[] args) {

        // Yeni Cilgin Sayisal Loto'ya uygun,
        //90 sayidan 6 tane sececegiz.
        //
        //https://www.millipiyangoonline.com/sayisal-loto/sonuclar

        SayisalLoto_Array_Version loto = new SayisalLoto_Array_Version();

        // sayilari tutacagimiz bir array tanimliyoruz.
        int sayilar[] = new int [KAC_SAYI];

        // Dongu ile array'a rastgele sayilari atiyoruz.

        for (int i = 0; i < sayilar.length; i++) {

            int rastgeleSayi = loto.sayiGetir();
            // rastgele sayi arrayde varsa donguyle rekrar sayi alinacak.
            //arrayde olmayan sayi bulana kadar donguden cikamaz.
            boolean sonuc = loto.arraydeVarmi(sayilar,rastgeleSayi);
            while (sonuc == true)
            {
                rastgeleSayi = loto.sayiGetir();
                sonuc = loto.arraydeVarmi(sayilar,rastgeleSayi);
            }
            // hep arrayin ilk elemanina yazalim rastgele sayiyi
            // cunku siralaninca sayi sonlara gidiyor.
            sayilar[0] = rastgeleSayi;

            //6.sayiyi sifir indekse yazinca, tekrar siralanmasi icin bunu ekledik.
            Arrays.sort(sayilar);




        }
        // arrayi yazdir.
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+"-");
        }


        //loto.testArraydeVarmi();

        }










    }




