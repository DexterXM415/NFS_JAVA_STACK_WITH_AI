import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = inputName.nextLine(); 

        System.out.println("Enter your age:");
        int age = inputAge.nextInt();

        System.out.println("Hello" + name + "you are" + age + "years old");

    }
}
