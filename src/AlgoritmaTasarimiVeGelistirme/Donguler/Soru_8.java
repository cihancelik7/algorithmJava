package AlgoritmaTasarimiVeGelistirme.Donguler;
/*
Bir komur kuyusu 980m. derinliktedir. En dipte kepceye 2586 kg komur yuklenmektedir. Kepce yukari cekilirken her
40 metrede 58kg komur dokulmektedir. Kepce yuzeye cikinca kepcede kac kg komur kalir?
 */

public class Soru_8 {
    public static void main(String[] args) {

        int kepce = 2586;
        for (int i = 980;i >=0;i=i-40){
            kepce = kepce - 58;
        }
        System.out.println(kepce);
        // burada mantikta bir sorun var basladigindan itibaren her an dokmedigi sadece 40. metrede dokuldugu goze alinarak
        // hesaplanmistir
    }
}
