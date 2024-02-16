package algorithmQuestions;

import java.util.Scanner;

/*
Kullanicidan alinan ismi tersten yazan programi yaziniz..
 */
public class question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz: ");
        String isim = scan.nextLine();

        terstenYaz(isim);

    }
    public static void terstenYaz(String isim){
        for (int i =isim.length()-1; i >= 0;i--){
            System.out.print(isim.charAt(i));

        }
    }


}
