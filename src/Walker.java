public class Walker extends Creature{

    public Walker(String name, int water, int distance) {
        super.name = name;
        super.water = water;
        super.maxWater = 12;
        super.isAlive = true;
        super.distance = distance;
    }

    @Override
    public void oneDayOfThing(Weather weather) {
        if (maxWater < 0) {
            isAlive = false;
            return;
        }
        if (weather.equals("n")) {
            distance += 1;
            if (maxWater == 12) {

            }else {
                maxWater -= 2;
            }
        }else if (weather.equals("f")) {
            distance += 2;
            if (maxWater == 12) {

            }else {
                maxWater -= 1;
            }
        }else {
            distance += 1;
            if (maxWater == 12) {

            }else {
                maxWater += 3;
            }
        }
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
