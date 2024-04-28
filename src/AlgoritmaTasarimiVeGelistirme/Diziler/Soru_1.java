package AlgoritmaTasarimiVeGelistirme.Diziler;

import java.util.Scanner;

/*
ekrandan girilen 5 tane sayiyi diziye aktaran ve dizinin toplamini bulup ekrana yazdiran program?
 */
public class Soru_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sayi[] = new double[5];
        double toplam = 0;

        for (int i = 0; i<5; i++){
            System.out.printf("%d. Veriyi Girin: ",(i+1));
            sayi[i] = scan.nextDouble();
            toplam = toplam+sayi[i];
        }
        System.out.printf("Toplam: %f",toplam);
    }
}
