import java.util.Scanner;
public class choinka {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe gwiazdek ");
        int NumStars = getInt();
        int Numstars1 = NumStars % 2 == 0 ? 2 : 1;
        for (int StarsInLine = Numstars1;
             StarsInLine <= NumStars;
             StarsInLine += 2) {
            int NumVoid = (NumStars - StarsInLine) / 2;
            for (int i = 0; i < NumVoid + StarsInLine; i++) {
                System.out.print(i < NumVoid ? " " : "*");
            }
            System.out.println();
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
