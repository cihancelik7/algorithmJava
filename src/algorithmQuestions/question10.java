package algorithmQuestions;

import java.util.Scanner;

/*
kullanicidan alinan bir isim soy isimde kac adet sessiz kac adet sesli harf var?
 */
public class question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim;
        int sesli=0;
        int sessiz = 0;

        System.out.println("Isim giriniz..");
        isim = scan.nextLine();

        for (int i = 0; i < isim.length(); i++){
            char c = isim.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sesli ++;
            }else sessiz++;
            if (c == ' '){
                sessiz --;
            }
        }
        System.out.println("Sesli harf sayisi: "+sesli);
        System.out.println("Sessiz harf sayisi: "+sessiz);

    }
}
