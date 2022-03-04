import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        System.out.print("Podaj slowo aby sprawdzić czy to palindrom: ");
        String wyraz = getString();
        boolean jesliPalindrom = true;
        int dlugoscwyrazu = wyraz.length();
        for (int i = 0; i < dlugoscwyrazu / 2; i++) {
            if (wyraz.charAt(i) != wyraz.charAt(dlugoscwyrazu - 1 - i)) {
                jesliPalindrom = false;
                break;
            }
        }
        if (jesliPalindrom) {
            System.out.println("Slowo " + wyraz + " jest palindromem.");
        } else {
            System.out.println("Slowo " + wyraz + " nie jest palindromem.");
        }
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
