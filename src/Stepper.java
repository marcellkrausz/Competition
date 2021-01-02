import java.util.Random;

public class Stepper extends Creature {

    private final String name;
    private Boolean isAlive;
    private int water;
    private final int maxWater;
    private int distance;

    public Stepper(String name, int water) {

        this.name = name;
        this.water = water;
        this.maxWater = 12;
        this.isAlive = true;
        this.distance = 0;

        if (this.water == -1 ) {
            Random random = new Random();
            this.water = (random.nextInt(maxWater - 3 )+ 3);
        }
    }

    @Override
    public void oneDayOfCreature(Weather weather) {
        if (weather.getType().equals("n")) {
            distance += 1;
            water -= 2;
        } else if (weather.getType().equals("f")) {
            distance += 2;
            water -= 1;
        } else {
            distance += 1;
            water += 3;
        }
        if (water <= 0) {
            isAlive = false;
            return;
        }
        if (water > maxWater) {
            water = maxWater;
        }
    }
    @Override
    public Boolean getAlive() {
        return this.isAlive;
    }

    @Override
    public int getDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getWater() {
        return this.water;
    }

    @Override
    public String toString() {
        return "Walker{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                ", water=" + water +
                ", maxWater=" + maxWater +
                ", distance=" + distance +
                '}';
    }
}
