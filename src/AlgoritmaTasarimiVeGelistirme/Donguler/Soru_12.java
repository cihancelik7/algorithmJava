package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Ekranda girilen 10 adet sayidan kacinin 50 ile 72 arasinda oldugunu bulan ve bu sayilarin toplami ile aritmetik
ortalamasini bulan programi yaziniz.
 */
public class Soru_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int sayac=0;
        int toplamSayi = 0;
        double aritmetikOrtalasi = 0;
        for (int i =0;i<3;i++){
            System.out.print("Sayi giriniz: ");
            sayi = scan.nextInt();
            if (sayi>50 && sayi<72){
                sayac++;
                toplamSayi = toplamSayi + sayi;
            }
        }
        aritmetikOrtalasi =(double) toplamSayi / sayac;
        System.out.println(sayac+" adet sayi 50 ile 72 arasindaydi. Bu sayilarin toplami: "+toplamSayi+" aritmetik ortalamalari: "+aritmetikOrtalasi);

    }
}
