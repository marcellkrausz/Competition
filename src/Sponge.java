public class Sponge extends Creature{

    public Sponge(String name, int water, int distance) {
        super.name = name;
        super.water = water;
        super.maxWater = 20;
        super.isAlive = true;
        super.distance = 0;
    }


    @Override
    public void oneDayOfThing(Weather weather) {
        if (water < 0) {
            isAlive = false;
            return;
        }
        if (weather.equals("n")) {
            water -= 4;
        } else if (weather.equals("f")) {
            distance += 1;
            water -= 1;
        } else {
            distance += 3;
            if (water != maxWater) {
                water += 6;

            }
        }
    }

        @Override
        public String toString() {
            return "Sponge{" +
                    "name='" + name + '\'' +
                    ", isAlive=" + isAlive +
                    ", water=" + water +
                    ", maxWater=" + maxWater +
                    ", distance=" + distance +
                    '}';
        }
}

