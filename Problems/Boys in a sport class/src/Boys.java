import java.util.Scanner;

class Boys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean a = (h2 >= h1)&&(h3 >= h2);
        boolean b = (h2 >= h3)&&(h1 >= h2);

        if(a){
            System.out.println(a);
        }
        else if (b){
            System.out.println(b);
        }
        else System.out.println(false);
    }
}