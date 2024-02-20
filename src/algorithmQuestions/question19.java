package algorithmQuestions;
/*
Tersten yazildiginda da ayni degeri olan sayilara Palindrom sayilar denir.
Ornek olarak "1991" ve ya "34543" sayilari tersten yazilsa bile ayni degerde olurlar.
1000 - 100000 sayilari arasindaki palindromlari  bulan programi yaziniz.
 */
public class question19 {
    public static void main(String[] args) {
        int i,j;
        String duz,ters;
        for(i=1000;i<100000;i++){
            duz = Integer.toString(i);
            ters="";

            for (j=duz.length()-1;j>=0;j--){
                ters += duz.charAt(j);
            }
            if (duz.equals(ters)) System.out.print(i +" - ");


        }

    }
}
