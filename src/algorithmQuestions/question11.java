package algorithmQuestions;

/*
 0 - 1000 arasindaki fibonacci sayilarini bulunuz
 */
public class question11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        do {
            c = a + b;
            if (c>1000)break;
            // break eklememizin sebebi sayilari toplayarak fibonacci elde ettigi icin 1000 ile toplama yapiyor.
            System.out.print(c + " - ");
            a = b;
            b = c;
        } while (c < 1000);


    }
}
