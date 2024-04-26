package AlgoritmaTasarimiVeGelistirme.KararYapilari;

import java.util.Scanner;

/*
Bir malin ham fiyati verilmektedir. Satis fiyatina ; ham fiyatin %14 u kadar iscilik gideri, ham fiyatin
%7si kadar cari giderler, ham fiyatin %14 u kadar vergi giderleri hesaplanmaktadir. Buna gore ham fiyata %22
KDV eklenerek tuketiciye kaca satildigini bulan programi yaz.
 */
public class Soru_4 {
    public static void main(String[] args) {
        float hf,sf,ig,cg,vg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ham Fiyat: ");
        hf = scan.nextFloat();
        ig = hf * 0.14f;
        cg = hf * 0.07f;
        vg = hf * 0.14f;
        sf = hf + ig + cg + vg;
        sf = sf + sf*0.22f;
        System.out.printf("Satis Fiyati = %.2f",sf);

    }
}
