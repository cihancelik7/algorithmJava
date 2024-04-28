package AlgoritmaTasarimiVeGelistirme.Diziler;

import java.util.Scanner;

/*
Egitim Fakultesinde 3 bolum bulunmaktadir. Her bolumde 2 ayri sinif ve her sinifta 5 ayri ders okutulmaktadir.
Buna gore girilen ders isimleri diziye aktarilacaktir. Bu programi yaziniz:
 */
public class Soru_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] ders = new String[3][2][5];
        for (int i = 0; i<3; i++){
            for (int j =0;j<2;j++){
                for (int k = 0; k<5;k++){
                    System.out.printf("Bölüm %d, Sınıf %d, Ders %d için ders ismini giriniz: ", i + 1, j + 1, k + 1);
                    ders[i][j][k] = scan.nextLine();
                }
            }
        }
        // girilen ders isimleri
        System.out.println("Girilen ders isimleri:");
        for (int i = 0; i<3;i++){
            for (int j=0; j<2;j++){
                for (int k=0; k<5;k++){
                    System.out.printf("Bölüm %d, Sınıf %d, Ders %d: %s%n", i + 1, j + 1, k + 1, ders[i][j][k]);
                }
            }
        }
        scan.close();
    }
}
