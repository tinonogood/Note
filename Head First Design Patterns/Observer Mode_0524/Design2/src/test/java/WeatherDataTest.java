
public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer c1 = new CurrentConditionsDisplay();
        Observer f1 = new ForecastDisplay();

        wd.registerObserver(c1);
        wd.registerObserver(f1);
        wd.setMeasurements((float) 1.0, (float) 2.0, (float) 3.0);

        wd.removeObserver(f1);
        wd.setMeasurements((float) 2.0, (float) 3.0, (float) 4.0);
    }
}

