package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Bir holding kendine ait 10 tane sirketin brut satislarinin toplamindan %8 net kazanc saglamaktadir.
Buna gore ekrandan girilen N tane sirkete ait brut satis miktarlarinin karini bulup sonucu ekrana yazdirin
 */
public class Soru_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sirket satisi gireceksiniz: ");
        double brutSatis,toplamSatis,kar;
        toplamSatis = 0;
        int n = scan.nextInt();
        for (int i = 1; i<=n ; i ++){
            System.out.print(i+". Sirketin Brut Satis:");
            brutSatis = scan.nextDouble();
            toplamSatis = toplamSatis + brutSatis;
        }
        kar = toplamSatis * 0.08;
        System.out.println(kar);

    }
}
