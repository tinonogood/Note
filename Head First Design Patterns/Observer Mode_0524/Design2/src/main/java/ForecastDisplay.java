public class ForecastDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    public void display(){
        String out = "Forecast: \n" +
                "Temp: " + temp + "\n" +
                "Humidity" + humidity + "\n";

        System.out.println(out);
    }

    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}