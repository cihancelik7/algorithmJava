package algorithmQuestions;
/*
0 ile 1000 arasindaki asal sayilari bulunuz.
1 e ve kendisine bolunebilen sayilardir
 */
public class question12 {
    public static void main(String[] args) {
           int bolenSayac = 0;

           for (int i =3;i<1000;i++){
               for (int j = 2;j<i;j++){
                   if (i%j==0)bolenSayac++;
                }
               if (bolenSayac==0) System.out.print(i + " - ");
               bolenSayac = 0;
           }
    }
}
