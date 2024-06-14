#1 Java Assessment Recursive and String Method

1. Rusak
    ```java
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
    ```
    Untuk menentukan berapa kali string "Hello" dicetak setelah memanggil Broken(1000), kita perlu menganalisis cara kerja fungsi ini.
    - Fungsi Rusak dipanggil dengan argumen n.
    - Jika n adalah 0, fungsi  berhenti (kembali).
    - Jika tidak, fungsi akan mencetak "Hello" sebanyak n kali.
    - Setelah dikeluarkan, fungsi memanggil dirinya sendiri dengan  setengah  nilai n (n/2) sebagai argumen.


2. Roger
    ```java
        public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }
    ```
   Untuk menentukan nilai kembalian dari panggilan roger(8, 8), kita perlu memahami cara kerja fungsi ini.
   - Fungsi ini mengevaluasi dua kondisi: Jika b == 1,  fungsi mengembalikan 1.
   - Jika k % b == 0, berarti k habis dibagi b, fungsi mengembalikan 1 + roger(k, b - 1).
   - Jika k % b != 0,  fungsi mengembalikan 0 + Roger(k, b - 1).
   
   Fungsi ini menghitung secara rekursif hingga 1 berapa kali k habis dibagi  b, b-1, b-2.


3. String uppercase, lowercase, number, symbol
    ```java
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
    ```
   Tujuan dari metode ini adalah untuk menghitung jumlah huruf besar dan kecil, angka, dan simbol dalam sebuah string yang diberikan sebagai argumen.
   - Empat variabel bertipe int dideklarasikan untuk menyimpan jumlah huruf besar  dan kecil, angka, dan simbol.
     Semua ini diinisialisasi dengan nilai 0.
   - Variabel i diinisialisasi dengan nilai 0, yang digunakan sebagai indeks dalam loop.
   - Perulangan while digunakan untuk mengulang setiap karakter dalam string teks dari indeks 0 hingga akhir string.
   - Karakter pada indeks i dalam string teks disimpan dalam variabel ch.
     ch Karakter dicentang tipenya: - Jika ch adalah huruf besar (Character.isUpperCase(ch)), variabel huruf besar bertambah 1.
   - Jika ch adalah huruf kecil (Character.isLowerCase(ch)), variabel huruf kecil bertambah 1.
   - Jika ch adalah angka (Character.isDigit(ch)), variabel numerik bertambah 1.
   - Jika ch bukan huruf besar atau angka, maka dianggap sebagai simbol dan variabel simbol bertambah 1.
   - Indeks i bertambah 1 untuk berpindah ke karakter berikutnya dalam string.
   - Saat perulangan selesai, hasil penghitungan jumlah huruf besar, huruf kecil, angka, dan simbol dicetak ke konsol.