
public class CurrentConditionsDisplay {
    private float temp;
    private float humidity;
    private float pressure;

    void display(){
        System.out.println("Current Temperature: " + temp + ", Humidity: "+ humidity + ", Pressure: " + pressure);
    }

    void update(float temp,float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}