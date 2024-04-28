package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
girilen 10 adet sayidan en kucugunu yazdiran program.
 */
public class Soru_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alinaBilecekEnYuksekNot;
        int sayi;
        int enKucukDeger;
        System.out.print("Alinabilecek En Yuksek Notu Giriniz: ");
        alinaBilecekEnYuksekNot = scan.nextInt();
        enKucukDeger = alinaBilecekEnYuksekNot;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            sayi = scan.nextInt();
            if (sayi < enKucukDeger) {
                enKucukDeger = sayi;
            }

        }
        System.out.println(enKucukDeger);

    }
}
