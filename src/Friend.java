import java.util.Random;

public class Friend {

    private String[] GREETINGS = {
            "Привет! Как твои дела?",
            "Здравствуй! О чём поговорим?",
            "Приветствую! Готов к общению!"
    };

    private static final String[] FAREWELLS = {
            "Пока! Было приятно пообщаться!",
            "До встречи! Заходи ещё.",
            "Удачи! Возвращайся скорее."
    };

    Random random = new Random();

    public Friend(){

    }

    public String getRandomResponse(String[] responses) {
        return responses[random.nextInt(responses.length)];
    }

    public String respondToGreeting() {
        return getRandomResponse(GREETINGS);
    }

    public String respondToFarewell() {
        return getRandomResponse(FAREWELLS);
    }

    public String respondToWeather() {
        //todo добавить полноценную реализацию respondToWeather
        return "день";
    }

    public String respondToSport() {
        //todo добавить полноценную реализацию respondToSport
        return "спорт";
    }

}
