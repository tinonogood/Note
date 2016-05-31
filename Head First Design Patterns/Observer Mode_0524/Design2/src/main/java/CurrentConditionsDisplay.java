
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    public void display(){
        System.out.println("Current Temperature: " + temp + ", Humidity: "+ humidity + ", Pressure: " + pressure);
    }

    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}