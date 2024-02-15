package algorithmQuestions;

import java.util.ArrayList;
import java.util.Scanner;

import static java.io.FileDescriptor.in;

/*
Kullanicidan alinan 3 sayidan en buyugunu yazdir..
 */
public class question3 {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        sayi1 = scan.nextInt();
        System.out.println("Bir sayi daha giriniz..");
        sayi2 = scan.nextInt();
        System.out.println("Son bir sayi daha giriniz..");
        sayi3 = scan.nextInt();

        // and operators..
        if (sayi1>sayi2 && sayi1>sayi3) System.out.println("sayi 1 en buyuktur: "+sayi1);
        else if(sayi2>sayi1 && sayi2>sayi3) System.out.println("Sayi 2 en buyuktur: "+sayi2);
        else if(sayi3>sayi1 && sayi3> sayi2) System.out.println("Sayi 3 en buyuktur: "+sayi3);
        else System.out.println("sayilar arasinda bir esitlik soz konusu");


    }
}
