import java.util.Scanner;

class Classic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        boolean Result = (-15 < A) && (A <= 12) || (14 < A) && (A < 17) || (19 <= A);

        if (Result) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}