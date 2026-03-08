import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;

        while (loginAttempts < 3) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check if the credentials are correct
            if (isCorrectCredentials(username, password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid credentials. Please try again.");
                loginAttempts++;
            }
        }

        scanner.close();

        if (loginAttempts == 3) {
            System.out.println("Too many login attempts. Please try again later.");
        } else if (loginAttempts > 3) {
            System.out.println("Account locked. Please contact support.");
        }
    }

    private static boolean isCorrectCredentials(String username, String password) {
        // Replace this with your actual logic to check the credentials
        return username.equals("admin") && password.equals("password");
    }
}