package algorithmQuestions;
/*
1 den 100 e kadar olan sayilarin toplamini bulan programi yaziniz
 */
public class question6 {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 0; i < 100; i ++){
          //  toplam = i + toplam;
            toplam += i;
        }
        System.out.println("1 - 100 arasi sayilarin toplami = "+toplam);


    }
}
