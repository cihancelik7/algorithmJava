package AlgoritmaTasarimiVeGelistirme.Donguler;

/*
1 den 100 e kadar olan tek sayilarin toplamini yazdirin
 */
public class Soru_2 {
    public static void main(String[] args) {
        int toplam;
        toplam = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                toplam = toplam + i;
            }
        }
        System.out.println(toplam);

        // alternatif
        int toplam2;
        toplam2 = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            toplam2 =  toplam2 + i;
        }
        System.out.printf("Toplam=%d",toplam2);
    }
}
