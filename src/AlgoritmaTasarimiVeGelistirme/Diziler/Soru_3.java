package AlgoritmaTasarimiVeGelistirme.Diziler;

import java.util.Scanner;

/*
Bir ilin 28 gunluk sicaklik degerleri klavyeden diziye girilmektedir, Buna gore haftalik sicaklik
ortalamasini bulup ekrana yazdiran programi yaziniz,
 */
public class Soru_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int top =0;
        int[][] sd = new int[4][7];
        float[] ort = new float[4];
        for (int i = 0;i<4;i++){
            for (int j=0; j<7;j++){
                System.out.printf("%d.Hafta %d.Gun Sicakligi: ",i+1,j+1);
                sd[i][j] = scan.nextInt();
                top = top + sd[i][j];
            }
            ort[i] = top/7;
            top = 0;
        }
        for (int s = 0; s<4; s++){
            System.out.printf("%f.Hafta Sicaklik Ortalamasi=",ort[s]);
        }

        // ikinci cozum
        int[][] sicakliklar = new int[4][7]; // 4 hafta ve her hafta için 7 gün
        float[] ortalamalar = new float[4]; // Her hafta için ortalama saklamak üzere
        int toplam;

        // kullanicidan sicaklik degerlerini alma

        for (int i = 0; i<4;i++){
            toplam = 0;
        for (int j =0;j<7;j++){
            System.out.println((i+1)+". Hafta "+(j+1)+". Gun Sicakligi: ");
            sicakliklar[i][j] = scan.nextInt();
            toplam+=sicakliklar[i][j];
        }
        ortalamalar[i] = (float) toplam/7; // Her haftanin ortalmaasini hesaplama
        }
        // Her haftanin sicaklik ortalamasini yazdirma
        for (int i = 0;i<4;i++){
            System.out.println((i+1)+". Hafta Sicaklik Ortalamasi: "+ortalamalar[i]);
        }
        scan.close();
    }
}
