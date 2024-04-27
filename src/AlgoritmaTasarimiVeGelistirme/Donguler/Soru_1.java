package AlgoritmaTasarimiVeGelistirme.Donguler;
/*
1'den 100 e kadar olan sayilarin toplamini bulup ekrana yazdirin
 */
public class Soru_1 {
    public static void main(String[] args) {
        int toplam=0;
        for (int i =0; i < 100;i++){
            toplam = toplam+ i;
        }
        System.out.println(toplam);
    }
}
