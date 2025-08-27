package beginner.DataTypes;

public class DataTypesPrimitivesConversion {
    public static void main(String[] args) {
        short temperatureOfRoom = 24;
        System.out.println("Room temperature: " + temperatureOfRoom + "C");

        float newTemperatureOfRoom = temperatureOfRoom;
        // or
        // float newTemperatureOfRoom;
        // newTemperatureOfRoom = temperatureOfRoom;
        System.out.println("New temperature: " + newTemperatureOfRoom + "C");

    }
}