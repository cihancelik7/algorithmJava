package AlgoritmaTasarimiVeGelistirme.Diziler;

import java.util.Scanner;

/**
 * Bir öğretmen 2 ayrı bölümde, her bölümde 5 farklı derse giren ve her derste 12 öğrencisi olan notları girip hesaplayan program.
 */
public class Soru_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] vize = new int[2][5][12];
        int[][][] finalNot = new int[2][5][12];
        String[][][] sonuc = new String[2][5][12];
        float[][][] ortalama = new float[2][5][12];

        for (int bolum = 0; bolum < 2; bolum++) {
            for (int ders = 0; ders < 5; ders++) {
                for (int ogrenci = 0; ogrenci < 12; ogrenci++) {
                    System.out.println((bolum + 1) + ". Bölüm, " + (ders + 1) + ". Ders, " + (ogrenci + 1) + ". Öğrencinin Vize Notunu Giriniz: ");
                    vize[bolum][ders][ogrenci] = scan.nextInt();
                    System.out.println((bolum + 1) + ". Bölüm, " + (ders + 1) + ". Ders, " + (ogrenci + 1) + ". Öğrencinin Final Notunu Giriniz: ");
                    finalNot[bolum][ders][ogrenci] = scan.nextInt();
                    ortalama[bolum][ders][ogrenci] = vize[bolum][ders][ogrenci] * 0.40f + finalNot[bolum][ders][ogrenci] * 0.60f;

                    if (ortalama[bolum][ders][ogrenci] < 60) {
                        sonuc[bolum][ders][ogrenci] = "KALDI";
                    } else {
                        sonuc[bolum][ders][ogrenci] = "GECTI";
                    }
                    System.out.println("Öğrenci " + sonuc[bolum][ders][ogrenci]);
                }
            }
        }
        scan.close(); // Scanner nesnesini kapat
    }
}



