import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = 1;
        
        for (int i = a; i < b; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}