public class WeatherData {

    public void measurementsChanged(){

        float temp = getTemperature();
        float humidity =  getHumidity();
        float pressure = getPressure();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        currentConditionsDisplay.update(temp,humidity, pressure);
        statisticsDisplay.update(temp,humidity, pressure);
        forecastDisplay.update(temp,humidity, pressure);

//        statisticsDisplay.display();
        currentConditionsDisplay.display();
    }

    float getTemperature(){
        return (float) 123.41;
    }

    float getHumidity(){
        return (float) 84;
    }

    float getPressure(){
        return (float) 1600;
    }
}

