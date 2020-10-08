import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        final int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + 2);
        } else {
            System.out.println(number + 1);
        }

    }
}