package algorithmQuestions;

import java.util.Scanner;

/*
Kullanicidan alinan 4 basamakli bir sayiyi yazi ile yaziniz?
Kullanici 3215 girmis olsun, 'uc bin iki yuz on bes' ekrana yazilsin.
 */
public class question18 {
    public static void main(String[] args) {
        int sayi,br,on,yz,bn;
        char c;
        // kullanicidan alinan sayi string e donusturulecek ve char ile 0 1 2 3 numarali indexleri alicaz
        Scanner scan = new Scanner(System.in);
        System.out.print("LUtfen 4 basamakli bir sayi giriniz: ");
        sayi = scan.nextInt();
        // sayiyi integer den string e cevirdik ve index ini aldik
        c = Integer.toString(sayi).charAt(0);
        // sayiyi tekrar integer a donusturduk
        bn = Integer.parseInt(Character.toString(c));
        System.out.print(bn);

        c= Integer.toString(sayi).charAt(1);
        yz = Integer.parseInt(Character.toString(c));
        System.out.print(yz);

        c = Integer.toString(sayi).charAt(2);
        on = Integer.parseInt(Character.toString(c));
        System.out.print(on);

        c = Integer.toString(sayi).charAt(3);
        br = Integer.parseInt(Character.toString(c));
        System.out.println(br);

        String[] binler = {"", "bin ", "ikibin ", "ucbin ", "dortbin ", "besbin ", "altibin ", "yedibin ", "sekizbin ", "dokuzbin "};
        String[] yuzler = {"", "yuz ", "ikiyuz ", "ucyuz ", "dortyuz ", "besyuz ", "altiyuz ", "yeduyuz ", "sekizyuz ", "dokuzyuz "};
        String[] onlar = {"", "on ", "yirmi ", "otuz ", "kirk ", "elli ", "altmis ", "yetmis ", "seksen ", "doksan "};
        String[] birler = {"", "bir.", "iki.", "uc.", "dort.", "bes.", "alti.", "yedi.", "sekiz.", "dokuz."};

        System.out.print(binler[bn]);
        System.out.print(yuzler[yz]);
        System.out.print(onlar[on]);
        System.out.print(birler[br]);

    }
}
