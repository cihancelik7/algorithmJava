package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
10 kisiye ait notlarin karelerini ve kuplerini yazdiran bir program.
 */
public class Soru_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int not,kisi;
        float kare,kup;


        System.out.print("Kisi sayisini giriniz:");
        kisi = scan.nextInt();
        for (int i =1; i<=kisi; i++){
            System.out.print(i+". notu giriniz:");
            not = scan.nextInt();
            kare = not*not;
            kup = kare * not;
            System.out.println(i+". kisinin notu: "+not+" Karesi: "+kare+" Kupu: "+kup);
        }
    }
}
