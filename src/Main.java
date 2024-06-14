import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("=".repeat(10));
        System.out.println("RUSAK");
        System.out.println();
        rusak(1000);
        System.out.println("Total Cetak Hello : " + counter);
        System.out.println("=".repeat(10));
        System.out.println("ROGER");
        System.out.println();
        System.out.println(roger(8,8));
        System.out.println("=".repeat(10));
        System.out.println("KATA");
        System.out.println();
        counterUppercaseLowercaseNumberSymbol("pemrogramanDasarJava1");
        System.out.println("=".repeat(10));

    }


    //Rusak
    private static int counter = 0;
    public static void rusak (int n){
        if (n == 0) {
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Hello");
            counter++;
        }

        rusak((int) n/2);
    }


    //Roger
    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }


    //Kata
    public static void counterUppercaseLowercaseNumberSymbol (String text){
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;
        int symbol = 0;

        int i = 0;
        while(i < text.length()){
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercase++;
            } else if( Character.isLowerCase(ch)){
                lowercase++;
            } else if (Character.isDigit(ch)){
                number++;
            } else {
                symbol++;
            }
            i++;
        }

        System.out.println("Uppercase = " + uppercase);
        System.out.println("Lowercase = " + lowercase);
        System.out.println("Number    = " + number);
        System.out.println("Symbol    = " + symbol);
    }
}