package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Girilen 10 adet Sayi icerisinden en buyugunu bulup ekrana yazdiran program.
 */
public class Soru_9 {
    // ekranda girilen 10 tane sayi icerisinden en buyugunu bulup ekrana yazdiran program.
    public static void main(String[] args) {
        int sayi;
        int enBuyukDeger = 0;
        Scanner scan = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.print("Lutfen "+i+". sayiyi giriniz: ");
            sayi = scan.nextInt();
            if (sayi>enBuyukDeger){
                enBuyukDeger = sayi;
            }
        }
        System.out.println("Girilen Sayilar icerisinde en buyuk deger : "+enBuyukDeger);
    }
}
