package algorithmQuestions;

import java.util.Random;
import java.util.Scanner;

/*
Kullanicinin girdigi mXn boyutta bir matris olusturup bu matrisi rastgele sayilarla doldurunuz,
Bu matrisin transpozesini(satirlari - sutun olarak yazma, sutunlari satir olarak yazma) olusturunuz.
 */
public class question17 {
    public static void main(String[] args) {
        int satir, sutun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz: ");
        satir = scan.nextInt();
        System.out.print("Sutun sayisini giriniz: ");
        sutun = scan.nextInt();

        int[][] m = new int[satir][sutun];

        Random r = new Random();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                m[i][j] = r.nextInt(5);
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n Transpoze matris");
        int[][] t = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                t[i][j] = m[j][i];
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
