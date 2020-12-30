public class Homokjáró extends Thing {

    int distance = 0;

    public Homokjáró(String name , int water) {
        super.name = name;
        super.water = water;
        super.maxWater = 8;
        super.isAlive = true;
        super.distance = distance;
    }


    @Override
    public void oneDayOfThing(Weather weather) {
        if (water < 0) {
            isAlive = false;
            return;
        }
        if(weather.equals("n")) {
            distance += 3;
            water -= 1;
        }else if (weather.equals("f")) {
            setDistance(1);
        }else {
            if (water == maxWater) {

            }else {
                water += 3;
            }
        }
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Homokjáró{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                ", water=" + water +
                ", maxWater=" + maxWater +
                ", distance=" + distance +
                '}';
    }
}
