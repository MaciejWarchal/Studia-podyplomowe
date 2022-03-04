import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {

        int a = -1; //ta zmienna przechowuje pozycje w wyrażeniu
        char aa = '0'; // przechouje znak lub wartość na danej pozycji
        char mark = '0'; // tu zapamiętywany jest znak do operacji
        int newLen = 0; // długośc następnego składnika
        int x = 0;
        int len = 0; // zmienna przechowująca długość wprowadzanych danych
        double d = 0; // zmienna zachouuje wynik
        String line; // przechowuje wprowadzane dane na których wykonuje się operacje

        System.out.println("kalkulator");
        System.out.println("napisz działanie i zakończ znakiem = ");
        line = getString();
        len = line.length();

        while (aa != '=') {

            for (int i = a + 1; i < len; i++) { // ta pętla zczytuje pojedyńcze znaki
                aa = line.charAt(i);

                if (aa == '+' || aa == '-' || aa == '*' || aa == '/' || aa == '=') {
                    x = i;
                    newLen = (i - 1) - a;
                    break;
                }
            }

            double c = 0;// tu przechowuje wartośc całego składnika 
            int aaaa = 0;
            for (int i = x - 1; i >= a + 1; i--) {
                int n = (a + newLen) - i;
                char aaa = line.charAt(i);
                aaaa = Character.getNumericValue(aaa); // zamiana na wartość liczbową
                double b = aaaa * Math.pow(10, n); // tutaj następuje nadanie pojedyńczmu  znakowi odpowiedniej wartości zależnej od miejsca 
                c = c + b; // następuje obliczenie pojedyńczego składnika
                if (a<0){
                    mark='+';
                }else {
                    mark = line.charAt(a);
                }
            }
            a = a + newLen + 1;

            if (mark == '+') { // tutaj oblicznae są wszystkie składniki czyli koncowy wynik
                d = d + c;
            } else if (mark == '-') {
                d = d - c;
            } else if (mark == '*') {
                d = d * c;
            } else if (mark == '/') {
                d = d / c;
            }else {}

        }
        System.out.println("wynik to " + d);

    }
                public static int getInt () {
                    return new Scanner(System.in).nextInt();
                }
                public static String getString () {
                    return new Scanner(System.in).next();
                }
            }


