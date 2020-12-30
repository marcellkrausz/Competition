public class Main {
    public static void main(String[] args) {
        Race race = new Race();

        while(true) {
            for (int i = 0; i < race.weathers.size(); i++) {
                race.oneDayOfRace();
                race.thingsAlive();
            }
        }
    }
}
