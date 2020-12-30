import java.util.ArrayList;
import java.util.List;

public class Race {

    int day = 1;
    List<Creature> participants = new ArrayList<>();
    List<Weather> weathers = new ArrayList<>();

    public Race() {
        Sandwalker sandwalker = new Sandwalker("Vandor", 4);
        Walker walker = new Walker("Seta", 7, 0);
        Sponge sponge = new Sponge("Csuszo", 12 , 0);
        Sponge sponge1 = new Sponge("Siklo",10, 0);

        participants.add(sandwalker);
        participants.add(walker);
        participants.add(sponge);
        participants.add(sponge1);

        Weather weather1 = new Weather("n");
        Weather weather2 = new Weather("f");
        Weather weather3 = new Weather( "f");
        Weather weather4 = new Weather( "e");
        Weather weather5 = new Weather( "e");
        Weather weather6 = new Weather( "e");
        Weather weather7 = new Weather( "n");
        Weather weather8 = new Weather( "n");
        Weather weather9 = new Weather( "f");

        weathers.add(weather1);
        weathers.add(weather2);
        weathers.add(weather3);
        weathers.add(weather4);
        weathers.add(weather5);
        weathers.add(weather6);
        weathers.add(weather7);
        weathers.add(weather8);
        weathers.add(weather9);
    }

    public void oneDayOfRace() {
        for (int i = 0; i < participants.size(); i++) {

        }
        day++;
    }
    public void thingsAlive(){
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).isAlive) {
                System.out.println(day - 1  );
                System.out.println(participants.get(i).toString());
            }
        }
    }
}
