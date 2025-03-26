import java.util.Scanner;

public class Main {

    public static String name = "Денис Викторович";
    public static int age = 47;

    public static void main(String[] args) {
        System.out.println("Введи имя возраст");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        age = scanner.nextInt();
        System.out.printf("Приветствую, %s. Тебе %d лет.\n", name, age);
    }
}
