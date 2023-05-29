import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensorSimple {
    private SensorTemperature sensorTemperature;

    public AdapterST500Info(SensorTemperature sensorTemperature){
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public double getTemperature() {
        return sensorTemperature.temperature();
    }
}