package algorithmQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/*
n den m e kadar olan sayilardan 7 ye tam bolunen sayilari bulunuz?
n baslangic ve m bitis sayisi kullanicidan alinacaktir
 */
public class question8 {
    public static void main(String[] args) {
        int i,n,m;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir n sayisi belirleyiniz?");
        n = scan.nextInt();
        System.out.println("Bir m sayisi belirleyiniz? ");
        m = scan.nextInt();
        for (i= n ; i<m ; i++){
            if (i % 7 == 0){
                System.out.print(i+"  ");
            }
        }
    }
}
