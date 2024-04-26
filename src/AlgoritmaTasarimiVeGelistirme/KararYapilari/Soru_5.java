package AlgoritmaTasarimiVeGelistirme.KararYapilari;

import java.util.Scanner;

/*
Bir firma satis tutarina bagli olarak indirim oranini asagisaki gibi belirlemektedir.
 Eger satis tutari 50tl nin altinda ise indirim yapilmamakta,
 50 tl ile 100 tl arasinda ise indirim %2,
 100 tl ile 200 tl arasinda ise indirim %3,
 200 tl uzerinde ise indirim orani %4 olarak uygulanmaktadir. Buna gore satis tutarini bul.
 */
public class Soru_5 {
    public static void main(String[] args) {
        float st;
        Scanner scan = new Scanner(System.in);
        System.out.print("Satis Tutari: ");
        st = scan.nextFloat();
        if (st >= 50 && st < 100) {
            st = st - st * 0.02f;
        } else if (st >= 100 && st < 200) {
            st = st - st * 0.03f;
        } else if (st >= 200) {
            st = st - st * 0.04f;
        }
        System.out.printf("Satis tutari Son Hali: %f", st);

    }
}
