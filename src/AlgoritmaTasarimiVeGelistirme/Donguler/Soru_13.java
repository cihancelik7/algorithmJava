package AlgoritmaTasarimiVeGelistirme.Donguler;

import java.util.Scanner;

/*
Bir kurulusta calisan 175 kisiye ikramiye verilecektir. Calisan kisinin hizmet yili 5 yil ve uzerinde ise 15000 tl
5 yilin altinda ise 7500 tl. Ikramiye verilmesi planlanmistir. Calisan personele odenecek ikramiye bedelini bulan
programi yaziniz
 */
public class Soru_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hizmetYili;
        float ikramiyeYuksek,ikramiyeDusuk,ikramiye;
        ikramiyeDusuk = 0f;
        ikramiyeYuksek = 0f;
        ikramiye = 0f;

        for (int i =0; i <=5; i++){
            System.out.print("Hizmet yilini yaziniz");
            hizmetYili = scan.nextInt();
            if (hizmetYili>=5){
                ikramiyeYuksek = ikramiyeYuksek+15000f;
            }else {
                ikramiyeDusuk = ikramiyeDusuk+7500f;
            }
        }
        ikramiye = ikramiyeDusuk + ikramiyeYuksek;
        System.out.println(ikramiye);
    }
}
