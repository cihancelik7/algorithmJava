package AlgoritmaTasarimiVeGelistirme.KararYapilari;

import java.util.Scanner;

/*
Ekranda girilen A,B ve C sayilarini buyukten kucuge dogru siralayip siralanmis halini ekrana yazdiran
akis diyagrami.
 */
public class Soru_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, yd;
        yd = 0;
        System.out.print("A sayisini giriniz:");
        a = scan.nextInt();
        System.out.print("B sayisini giriniz:");
        b = scan.nextInt();
        System.out.print("C sayisini giriniz:");
        c = scan.nextInt();
        if (a < b) {
            yd = a;
            a = b;
            b = yd;
        }
        if (a < c) {
            yd = a;
            a = c;
            c = yd;
        }
        if (b < c) {
            yd = b;
            b = c;
            c = yd;
        }
        System.out.printf("%d>%d>%d",a,b,c);
    }
}
/*
üç tane sayıyı (a, b, c) kullanıcıdan alıp, bu sayıları büyükten küçüğe doğru sıralayıp, sıralanmış haliyle ekrana yazdırma işlemi yapıyoruz.
System.out.printf("%d>%d>%d",a,b,c); satırı ise, sıralanmış sayıları ekrana formatlı bir şekilde yazdırmak için kullanılıyor. Buradaki %d,
int türündeki değişkenlerin değerlerini yer tutucu olarak belirtir ve sırasıyla a, b, c değişkenlerinin değerlerini alır.

Örneğin, kullanıcı sırasıyla 10, 20, 30 değerlerini girdiğinde, kodunuz bu sayıları büyükten küçüğe sıralayacak (30 > 20 > 10) ve
 System.out.printf("%d>%d>%d", a, b, c); satırı bu sıralamayı ekrana 30>20>10 şeklinde yazdıracaktır.

sıralama mantığı ise şöyle işler:

a ve b sayılarını karşılaştırır ve gerekirse yerlerini değiştirir.
Yeni a ile c sayılarını karşılaştırır ve gerekirse yerlerini değiştirir.
Yeni b ile c sayılarını karşılaştırır ve gerekirse yerlerini değiştirir.
Bu sıralama işlemleri sonrasında a en büyük, b ortanca ve c en küçük sayı olacak şekilde ayarlanmış olur.
 */