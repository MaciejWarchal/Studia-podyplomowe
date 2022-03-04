public class ArraysDiff {
    public static void main(String[] args) {
        int[] Array1 = { 10, 5, 20 };
        int[] Array2 = { 10, 5, 20 };

        if (Array1.length != Array2.length) {
            System.out.println("Tablice nie sa takie same.");
        } else {
            boolean IfFound = false;

            for (int i = 0; i < Array1.length; i++) {

                if (Array1[i] != Array2[i]) {
                    IfFound = true;
                    break;
                }
            }

            if (IfFound) {
                System.out.println("Tablice nie sa takie same.");
            } else {
                System.out.println("Tablice sa takie same.");
            }
        }
    }
}
