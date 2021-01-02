public abstract class Creature {

    private String name;
    private Boolean isAlive;
    private int water;
    private int maxWater;
    private int distance;



    public abstract void oneDayOfCreature(Weather weather);

    public Boolean getAlive() {
        return isAlive;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public int getWater() {
        return water;
    }
}
