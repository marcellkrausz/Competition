import java.util.Random;

public class Sandwalker extends Creature {

    private final String name;
    private Boolean isAlive;
    private int water;
    private final int maxWater;
    private int distance;


    public Sandwalker(String name, int water) {
        this.name = name;
        this.water = water;
        this.maxWater = 8;
        this.isAlive = true;
        this.distance = 0;

        if (this.water == -1) {
            Random random = new Random();
            this.water = (random.nextInt(maxWater - 3) + 3);
        }
    }


    @Override
    public void oneDayOfCreature(Weather weather) {
        if (weather.getType().equals("n")) {
            distance += 3;
            water -= 1;
        } else if (weather.getType().equals("f")) {
            distance += 1;
        } else {
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
        return "Sandwalker{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                ", water=" + water +
                ", maxWater=" + maxWater +
                ", distance=" + distance +
                '}';
    }
}
