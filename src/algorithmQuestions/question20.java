package algorithmQuestions;

import java.util.Scanner;

/*
kullanicidan alinan bir cumlede kac adet kelime oldugunu
ve kac adet harf oldugunu bulan programi yaziniz

bugun hava cok guzel
 */
public class question20 {
    public static void main(String[] args) {
        String yazi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle giriniz:");
        yazi = scan.nextLine();

        int sayac =0;
        for (int i = 0; i<yazi.length();i++){
            if (yazi.charAt(i)==' ') sayac++;
        }
        System.out.println("Harf Sayisi: "+(yazi.length()-sayac));




        System.out.println("Kelime sayisi= "+ (sayac+1));

    }
}
