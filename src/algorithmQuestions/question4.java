package algorithmQuestions;

import java.util.Scanner;

/*
ikinci dereceden axˆ2 + bx + c = 0 denkleminin diskriminant cozumunu yapiniz?
Kullanicidan a,b ve c degerlerini alarak hesaplayiniz
delta = bˆ2 - 4ac
 */
public class question4 {
    public static void main(String[] args) {
        int a, b, c;
        float kok1,kok2;
        Scanner scan = new Scanner(System.in);

        System.out.println("a sayisi: ");
        a = scan.nextInt();
        System.out.println("b sayisi: ");
        b = scan.nextInt();
        System.out.println("c sayisi: ");
        c = scan.nextInt();

        int delta = (delta(a,b,c));
        System.out.println("Delta: "+delta);
        if (delta > 0) {
            System.out.println("Denklemin iki koku vardir.");
            kok1 = (float) (-b - Math.sqrt(delta)) / 2*a;
            kok2 = (float) (-b + Math.sqrt(delta)) / 2*a;
            System.out.println("kok1:"+kok1);
            System.out.println("kok2: "+kok2);
        } else if (delta==0) {
            System.out.println("Denklemin cakisik koku vardir.");
            kok1 = (float) (-b ) / 2*a;
            System.out.println("kokler: "+kok1);
        }else System.out.println("Denklemin koku yoktur");
    }

    public static int delta(int a, int b, int c) {
        int delta = b * b -(4 * a * c);
        return delta;
    }

}
