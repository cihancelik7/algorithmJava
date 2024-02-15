package algorithmQuestions;

import java.util.Scanner;

/*
kullanicidan alinacak 2 adet sayinin toplamasini ve ortalamasini yaziniz
 */
public class question2 {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        sayi1 = scan.nextInt();
        System.out.println("Bir sayi daha giriniz...");
        sayi2 = scan.nextInt();
        int toplam = toplam(sayi1,sayi2);
        float ort = ortalama(sayi1,sayi2);
        System.out.println("toplam: "+toplam);
        System.out.println("Ortalama: "+ort);


    }

    public static int toplam(int a,int b){
        return a+b;
    }
    public static float ortalama(int a,int b){
        return (float)(a+b)/2;
    }
}
