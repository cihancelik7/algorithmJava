package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Bir ilde 7 tane ilce her ilcede 12 tane koy, her koyde 3 tane okul bulunuyor. Klavyeden her okulda
bulunan ogrenci sayilari giriliyor, her ilcedeki ve koydeki ogrenci toplamini tum ilce koy ve
okuldaki ogrenci toplamini bulan program
 */
public class Soru_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ilToplam = 0;

        // Her ilçe için döngü
        for (int i = 0; i < 7; i++){
            int ilceToplam = 0;

            // Her köy için döngü
            for (int j = 0; j < 12; j++){
                int koyToplam = 0;

                // Her okul için döngü
                for (int k = 0; k < 3; k++){
                    System.out.printf("%d. ilçe, %d. köy, %d. okul için öğrenci sayısını girin: ", i + 1, j + 1, k + 1);
                    int ogrenciSayisi = scan.nextInt();
                    koyToplam += ogrenciSayisi;
                }

                System.out.printf("%d. ilçe, %d. köy toplam öğrenci sayısı: %d%n", i + 1, j + 1, koyToplam);
                ilceToplam += koyToplam;
            }

            System.out.printf("%d. ilçe toplam öğrenci sayısı: %d%n", i + 1, ilceToplam);
            ilToplam += ilceToplam;
        }

        System.out.printf("İl toplam öğrenci sayısı: %d%n", ilToplam);
        scan.close();
    }
}