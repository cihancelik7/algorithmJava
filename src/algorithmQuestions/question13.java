package algorithmQuestions;

import java.util.Scanner;

/*
Kullanicidan 10 sayi alarak tek ve cift sayilarin adedini, toplamini ve ortalamasini bulan programi yaziniz
 */
public class question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tekToplam, ciftToplan, tekAdet, ciftAdet, sayi;
        float tekOrt, ciftOrt;

        tekAdet = 0;
        ciftAdet = 0;
        tekToplam = 0;
        ciftToplan = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " . sayi: ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                ciftAdet++;
                ciftToplan += sayi;
            } else {
                tekAdet++;
                tekToplam += sayi;
            }
        }
        System.out.println(ciftAdet + " cift sayi toplami = " + ciftToplan);
        System.out.println(tekAdet + " tek sayi toplami = " + tekToplam);

        tekOrt = (float) tekToplam / tekAdet;
        ciftOrt = (float) ciftToplan / ciftAdet;
        System.out.println("tek sayilarin ortalamasi: "+tekOrt);
        System.out.println("cift sayilarin ortalamasi: "+ciftOrt);

    }
}
