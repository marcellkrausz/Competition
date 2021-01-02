import java.util.Random;

public class Weather {

    String type;
    String[] weatherForm = new String[]{"n","f","e"};

    public Weather(String type) {
        this.type = type;
        if (type.equals("r")) {
            Random random = new Random();
            this.type = weatherForm[random.nextInt(3)];
        }
    }

    public String getType(){
        return this.type;
    }
}
