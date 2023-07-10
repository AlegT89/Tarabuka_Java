import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
