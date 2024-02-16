package algorithmQuestions;
/*
 vize notunun %40 ini Final notunun %60 ini alarak ortalama notu hesaplayiniz
 ortalama 65 ten buyuk ise gecti kucukse kaldi yazan bir program hazirlayiniz
 */

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        int vize,fnl;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        vize = scan.nextInt();
        System.out.println("Final Notunuzu giriniz: ");
        fnl = scan.nextInt();
        float ort = ortalama(vize,fnl);
        System.out.println(ort);
        if (ort >= 50){
            System.out.println("Ogrenci gecti");
        }else System.out.println("Ogrenci kaldi");


    }
    public static float ortalama(int vize, int fnl){
        float vizeOrt = (float) (vize * 0.4);
        float fnlOrt = (float) (fnl * 0.6);
        return vizeOrt+fnlOrt;
    }
}
