package algorithmQuestions;

import java.util.Random;

/*
3X3 rastgele sayilardan olusan 2 matris olusturun.
Bu matrislerin , toplamini hesaplayin
 */
public class question16 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] t = new int[3][3];
        Random r = new Random();
        int i,j;
        System.out.println("M1 matrisi");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                // matris 1 in i ninci satirinin j ninci sutununa rastgele 0 ile 5 arasinda bir sayi gir
                m1[i][j] = r.nextInt(5);
                System.out.print(m1[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("\nM2 matrisi");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                // matris 2 nin i ninci satirinin j ninci sutununa rastgele 0 ile 5 arasinda bir sayi gir
                m2[i][j] = r.nextInt(5);
                System.out.print(m2[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("\nToplam matrisi");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                t[i][j] = m1[i][j]+m2[i][j];
                System.out.print(t[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
