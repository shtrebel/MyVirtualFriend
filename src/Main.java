import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Friend friend = new Friend();

        Scanner scanner = new Scanner(System.in);
        System.out.println(friend.respondToGreeting());

        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("пока") || input.contains("выход")) {
                System.out.println(friend.respondToFarewell());
                break;
            } else if (input.contains("погод")) {
                System.out.println(friend.respondToWeather());
            } else if (input.contains("спорт") || input.contains("футбол")) {
                System.out.println(friend.respondToSport());
            } else {
                System.out.println("Не понял. Спроси о погоде или спорте!");
            }
        }

    }
}