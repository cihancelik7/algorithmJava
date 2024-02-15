package algorithmQuestions;

import java.util.Scanner;

public class question1 {
    /*
     Kullanicidan isminin alarak "Merhaba ${isim}" yaziniz
      */
    public static void main(String[] args) {
        String isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz...");
        isim = scan.nextLine();
        System.out.println("Merhaba " +isim);
    }
}
