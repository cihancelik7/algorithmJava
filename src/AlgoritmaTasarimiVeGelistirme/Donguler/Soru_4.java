package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
  Kullanıcı tarafından girilen kişi sayısına göre iş yerindeki maaş ortalamasını hesaplayan bir sistem geliştirin.
 */
public class Soru_4 {
    public static void main(String[] args) {
        int toplam = 0;
        int kisiSayisi;
        int maas;
        double ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kisi Sayisini Giriniz: ");
        kisiSayisi = scan.nextInt();
        for (int i =1; i<=kisiSayisi;i++){
            System.out.print(i+".Kisinin Maasi:");
            maas = scan.nextInt();
            toplam += maas;
        }
        if (kisiSayisi>0){
            ortalama = (double) toplam/kisiSayisi;
            System.out.println("Ortalama Maas: "+ortalama);
        }else {
            System.out.println("Girilen kisi sayisi 0 dan buyuk olmalidir.");
        }
        scan.close();
    }
}
