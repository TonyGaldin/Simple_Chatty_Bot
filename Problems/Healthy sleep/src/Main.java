import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        boolean a = (H < A);
        boolean b = (H > B);

        if (a) {
            System.out.println("Deficiency");
        } else if (b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}