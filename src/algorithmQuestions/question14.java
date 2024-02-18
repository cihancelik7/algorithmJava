package algorithmQuestions;

import java.util.Scanner;

/*
Kullanicinin istedigi kadar sayiyi, kullanicidan alarak bir diziye aktaran,
bu sayilarin toplamini ve ortalamasini bulan programi bulunuz.
 */
public class question14 {
    public static void main(String[] args) {
        int boyut,toplam;
        float ort;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        boyut = scan.nextInt();

        toplam = 0;
        int[] dizi = new int[boyut];
        for (int i = 1; i < boyut;i++){
            System.out.print("diziye eklenecek "+i+". sayiyi giriniz: ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        ort = (float) toplam/boyut;

        System.out.println("Sayilarin dizi icerisindeki toplami: "+toplam);
        System.out.println("Sayilarin dizi icerisindeki ortalamasi: "+ort);

    }
}
