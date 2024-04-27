package AlgoritmaTasarimiVeGelistirme.Donguler;
/*
1 den 100 e kadar olan cift sayilari toplayip ekrana yazdirin
 */
public class Soru_3 {
    public static void main(String[] args) {
        // cozum 1
        int toplam=0;
        for (int i = 0; i<100;i++){
            if (i % 2 == 0){
                toplam = toplam+i;
            }
        }
        System.out.println(toplam);

        // Cozum 2
        int toplam2=0;
        for (int i =2; i < 100; i=i+2){
            toplam2 = toplam2+i;
        }
        System.out.printf("Toplam=%d",toplam2);
    }
}
