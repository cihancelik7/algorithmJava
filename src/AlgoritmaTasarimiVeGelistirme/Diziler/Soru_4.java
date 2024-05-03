package AlgoritmaTasarimiVeGelistirme.Diziler;

import java.util.Scanner;

public class Soru_4 {
    /*
    (3,4) luk diziye klavyeden deger girdiren ve bu dizinin sutunlarinin toplamini
    4'luk bir diziye aktaran , satirlarin toplamini 3'luk bir diziye aktaran, daha sonra bu dixiyi (4,3)
    luk diziye aktaran programi yaziniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] A = new double[3][4];
        double[][] B = new double[4][3];
        double[] sut = new double[4];
        double[] sat = new double[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d.Satir %d.Sutun degerini girin:", i + 1, j + 1);
                A[i][j] = scan.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sut[i] += A[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sat[i] += A[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                B[j][i] = A[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f ",B[i][j]);
            }
        }
    }
}
