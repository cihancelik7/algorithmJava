package AlgoritmaTasarimiVeGelistirme.Donguler;

/*
Bir ilin 1970 yilinda nufusu 30000 dir. Her 4 yilda nufus artisi %3.8 dir. Buna gore 2004
yilinda bu ilin nufusunun ne kadar oldugunu yazan program.
 */
public class Soru_5 {
    public static void main(String[] args) {
        int nufus = 30000;
        int yil;
        for (yil = 1970; yil <= 2004; yil = yil + 4) {
            nufus =nufus + (int)  (nufus * 0.38);
        }
        System.out.println(nufus);
    }
}
