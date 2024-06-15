import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        season = season.toLowerCase();

        switch (season) {
            case "winter":
            System.out.println("1");
            break;
            case "spring":
            System.out.println("2");
            break;
            case "summer":
                System.out.println("3");
                break;
            case "autumn":
                System.out.println("4");
                break;
            default:
                System.out.println("Не правильно введено");




        }


    }
}
