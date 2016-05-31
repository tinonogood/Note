
public class StatisticsDisplay {
    public float temp;
    public float humidity;
    public float pressure;

    void display(){
        System.out.println("Static Temperature: " + temp + ", Humidity: "+ humidity + ", Pressure: " + pressure);
    }

    void update(float temp,float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
