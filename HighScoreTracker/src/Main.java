import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        System.out.println(username);

        scanner.close();
    }
}
