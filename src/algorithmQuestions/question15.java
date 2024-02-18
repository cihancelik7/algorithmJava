package algorithmQuestions;

import java.util.Random;
import java.util.Scanner;

/*
Kullanicinin istedigi buyuklukte bir diziyi 0-100 arasinda rastgele olusturulmus sayilarla doldurup
 bu sayilarin standart sapmasini hesaplayiniz
 */
public class question15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int boyut,toplam;
        System.out.print("Dizinin boyutunu belirleyiniz: ");
        boyut = scan.nextInt();
        int[] dizi = new int[boyut];
        Random r = new Random();
        toplam = 0;
        for (int i = 0; i< boyut;i++){
            dizi[i] = r.nextInt(100);
            System.out.print(dizi[i]+" - ");
            toplam = toplam+dizi[i];
        }
        float ort = (float) toplam/boyut;
        System.out.println("\nOrtalama = "+ort);

        float farkToplam = 0;
        for (int i = 0; i < boyut;i++){
            farkToplam += (float) Math.pow((dizi[i]-ort),2);
        }
        double sapma;
        sapma = Math.sqrt(farkToplam/(boyut-1));
        System.out.println("Standart sapma = "+ sapma);


    }
}
