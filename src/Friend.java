import java.util.Random;

public class Friend {

    Random random = new Random();

    public Friend(){

    }

    public String getRandomResponse(String[] responses) {
        //todo добавить полноценную реализацию getRandomResponse
        return "A";
    }

    public String respondToGreeting() {
        //todo добавить полноценную реализацию respondToGreeting
        return "Привет!";
    }

    public String respondToFarewell() {
        //todo добавить полноценную реализацию respondToFarewell
        return "Пока!";
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
