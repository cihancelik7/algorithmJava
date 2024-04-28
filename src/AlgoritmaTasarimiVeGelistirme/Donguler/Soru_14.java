package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
1'ler ve 5'ler arasindaki carpim tablosunu yazan program.
 */
public class Soru_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int carpim;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                carpim = i * j;
                System.out.printf("%d * %d = %d\n",i,j,carpim);
            }
            System.out.print("Devam icin bir tusa basiniz:");
            scan.next();
        }
    }
}
