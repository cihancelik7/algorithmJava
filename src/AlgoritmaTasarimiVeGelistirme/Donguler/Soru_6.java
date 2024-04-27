package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Ekrana girilen 5 adet sayinin toplamini bulup ekrana yazdiran program.
 */
public class Soru_6 {
    public static void main(String[] args) {
        int toplam=0;
        int sayi;
        Scanner scan = new Scanner(System.in);
        for (int i =1; i <= 5;i ++ ){
            System.out.print(i+". Sayiyi giriniz:");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Sayilarin toplami: "+toplam);
    }
}
