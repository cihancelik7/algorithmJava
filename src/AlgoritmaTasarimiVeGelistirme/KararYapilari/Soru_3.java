package AlgoritmaTasarimiVeGelistirme.KararYapilari;

import java.util.Scanner;

/*
Taksitle satis yapan bir firma toplam satis miktarini 3 e bolmekte 3 e tam bolunmediginde
artan kismi 1. taksidin uzeerine eklemektedir. Buna gore taksit degerini bulup ekrana yazdirin.

S: Toplam satis
T: Taksit
T1: 1. Taksit
T2: 2. Taksit
T3: 3. Taksit
 */
public class Soru_3 {
    public static void main(String[] args) {
        long s,t,t1,t2,t3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Toplam Satis: ");
        s = scan.nextLong();
        t = s / 3;
        t1 = s - t * 2;
        t2 = t;
        t3 = t;
        System.out.printf("1. Taksit = %d\t2.Taksit = %d\t3.Taksit = %d",t1,t2,t3);
    }
}
/*
Taksit Miktarının Hesaplanması:
t = s / 3;: Toplam satış miktarı (s) üçe bölünür ve bölüm sonucu (t) her bir taksit için
temel miktar olarak belirlenir. Bu işlem, Java'da tam sayı bölme işlemi olduğu için, bölme
 sonucundan kalan (mod) dikkate alınmaz ve sadece tam kısmı alınır.
Taksitlerin Belirlenmesi:
t1 = s - t * 2;: İlk taksit miktarı, toplam satış miktarından diğer iki taksitin
 toplamı çıkarılarak hesaplanır. Burada, t * 2, ikinci ve üçüncü taksitlerin toplam miktarını
  verir. Bu adımda, toplam satış miktarı üçe tam bölünmüyorsa kalan miktar otomatik olarak
  ilk taksite eklenmiş olur.
t2 = t;: İkinci taksit, temel taksit miktarı (t) olarak belirlenir.
t3 = t;: Üçüncü taksit de temel taksit miktarı olarak belirlenir.
Sonuçların Yazdırılması:
System.out.printf("1. Taksit = %d\t2.Taksit = %d\t3.Taksit = %d", t1, t2, t3);: Hesaplanan taksit
miktarları formatlı bir şekilde konsola yazdırılır. Burada %d, integer (tam sayı) değerleri için bir
format belirtecidir ve sırasıyla t1, t2, t3 değerlerini yazdırır.
 */