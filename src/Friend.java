import java.util.Random;

public class Friend {

    private String[] GREETINGS = {
            "Привет! Как твои дела?",
            "Здравствуй! О чём поговорим?",
            "Приветствую! Готов к общению!"
    };

    private String[] FAREWELLS = {
            "Пока! Было приятно пообщаться!",
            "До встречи! Заходи ещё.",
            "Удачи! Возвращайся скорее."
    };

    private String[] ANSWERS_ABOUT_WEATHER = {
            "Сегодня отличный день! Солнце светит ярко.",
            "На улице дождь. Возьми зонтик!",
            "Погода странная... Лучше останься дома."
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
        return getRandomResponse(ANSWERS_ABOUT_WEATHER);
    }

    public String respondToSport() {
        //todo добавить полноценную реализацию respondToSport
        return "спорт";
    }

}
