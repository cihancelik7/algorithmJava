package algorithmQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/*
1 den n ye kadar olan sayilardan tek olanlarin toplamini bulunuz?
n sayisi kullanicidan alinacaktir
 */
public class question7 {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        sayi = scan.nextInt();
        for (int i = 1; i <sayi; i++){
            if (i % 2 == 1){
                toplam += i;
            }
        }
        System.out.println("1 - "+sayi+" arasindaki tek sayilarin toplami: "+toplam);
    }

}
