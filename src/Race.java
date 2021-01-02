import java.util.ArrayList;
import java.util.List;


public class Race {

    List<Creature> participants = new ArrayList<>();
    List<Weather> weatherForecast = new ArrayList<>();

    public Race() {

        participants.add( new Sandwalker("Vandor", 4));
        participants.add(new Stepper("Seta", 7));
        participants.add(new Sponge("Csuszo", 12 ));
        participants.add(new Sponge("Siklo",10));

        weatherForecast.add(new Weather("n"));
        weatherForecast.add(new Weather("f"));
        weatherForecast.add(new Weather( "f"));
        weatherForecast.add(new Weather( "e"));
        weatherForecast.add(new Weather( "e"));
        weatherForecast.add(new Weather( "e"));
        weatherForecast.add(new Weather( "n"));
        weatherForecast.add(new Weather( "n"));
        weatherForecast.add(new Weather( "f"));
    }
    public Race(int number) {

        participants.add( new Sandwalker("Vandor", -1));
        participants.add(new Stepper("Seta", -1));
        participants.add(new Sponge("Csuszo", -1 ));
        participants.add(new Sponge("Siklo",-1));

        weatherForecast.add(new Weather("r"));
        weatherForecast.add(new Weather("r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
        weatherForecast.add(new Weather( "r"));
    }

    public void simulateRace() {
        for(int i = 0; i < weatherForecast.size(); i++) {
            for (int j = 0; j < participants.size(); j ++) {
                participants.get(j).oneDayOfCreature(weatherForecast.get(i));
                System.out.println(participants.get(j).getName()+ " is alive " + participants.get(j).getAlive() + " has travelled " + participants.get(j).getDistance() + " water : " + participants.get(j).getWater());
            }
        }
    }

    public void printFinishedRace() {
        int maxDistance = 0;
        String winnersName = "";
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).getAlive()) {
               if (maxDistance < participants.get(i).getDistance()) {
                   maxDistance = participants.get(i).getDistance();
                   winnersName = participants.get(i).getName();
               }
            }
        }
        System.out.println("The winner is : " + winnersName + " has travelled " + maxDistance + " distance." );
    }
}
