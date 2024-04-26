package AlgoritmaTasarimiVeGelistirme.KararYapilari;

import java.util.Scanner;

/*
Bir isyerinde calisan personele verilen maas su sekilde hesaplanmaktadir:
Gunluk Calisma Ucreti 1500TL dir.
Aylik calisma gun sayisi 26 gun uzerinden hesaplanmaktadir.
Hesaplanan ucretten %12 gelir vergisi dusulecek, gelir vergisi dusuldukten sonra
%8.8 SSK prim kesintisi bu iki kesintinin toplaminin hesaplanan ucretten farkinin 0.003 damga
pulu kesilecektir. Su ana kadar hesaplanan kesintiler toplaminin hesaplanan ucretten farkina "matrah" adi verilir.
Matraha %3 kira, %1.8 cocuk yardimi %1.7 yol yardimi eklenerek net maas hesaplanmaktadir.

Buna gore klavyeden girilen ad-soy ad , calisma gun sayisina gore kisinin brut maasi, kesintiler toplami, matrahi
ve net maasi hesaplayip ekrana yazdiran akis diyagrami.
AD: Iscinin adi
SOYAD: Iscinin soyadi
CGS: Calisma gun sayisi
BM: Brut Maas
GV: Gelir Vergisi
SSK: Ssk kesintisi
DP: Damga pulu
KT: Kesintiler Toplami
M: Matrah
N: Net maas
 */
public class Soru_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ad;
        int cgs;
        double bm, gv, ssk, dp, kt, m, n;
        System.out.print("Adiniz: ");
        ad = scan.nextLine();
        System.out.print("Calisilan gun sayisi: ");
        cgs = scan.nextInt();
        bm = 1500 * cgs;
        gv = bm * 0.12;
        ssk = (bm - gv) * 0.088;
        dp = (bm - (gv + ssk)) * 0.003;
        kt = gv + ssk + dp;
        m = bm - kt;
        n = m + (m * 0.03 + m * 0.018 + m * 0.017);
        System.out.printf("Net  =   %.2f\tBrut    =   %.2f\tKesintiler=%.2f",n,bm,kt);
    }
}
/*
Formatlama Metodu: System.out.printf
System.out: Java'da standart çıktı akışını (genellikle konsol veya terminal) temsil eder.
printf: Belirlenen format şablonuna göre string ve diğer veri türlerini biçimlendirip yazdırır.
Format Şablonu: "Net = %.2f\tBrut = %.2f\tKesintiler=%.2f"
%.2f: Kayan noktalı sayıları (double veya float) temsil eder ve bu belirteç, sayıların ondalık kısmından sonra sadece iki basamak gösterilmesini sağlar.
\t: String içinde bir tab (sekme) karakteri ekler, böylece çıktılar arasında düzenli bir boşluk bırakır, okunabilirliği artırır.
Kullanılan Argümanlar: n, bm, kt
n (Net Maaş): Hesaplanan net maaş değerini içerir.
bm (Brüt Maaş): Toplam brüt maaş değerini içerir.
kt (Kesintiler Toplamı): Brüt maaştan yapılan tüm kesintilerin toplam değerini içerir.

 */