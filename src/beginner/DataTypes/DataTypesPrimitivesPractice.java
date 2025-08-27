package beginner.DataTypes;

public class DataTypesPrimitivesPractice {
    public static void main(String[] args) {
        String brand = "ASUS";
        String modelName = "ASUS TUF Dash";
        String color = "Black";
        String specialFeature = "Backlit Keyboard";

        byte hardDiskSize = 1; // TB
        byte CPUModel = 7; // Core i7
        byte ramMemory = 16; // GB
        byte operatingSystem = 11; // Windows 11 Home

        float screenSize = 15.6F; // Inches

        boolean isGraphicCardDescription = true;

        System.out.println("Brand:  " + brand);
        System.out.println("Model:  " + modelName);
        System.out.println("Screen Size: " + screenSize + "Inches");
        System.out.println("Color:  " + color);
        System.out.println("Hard Disk Size: " + hardDiskSize +" TB");
        System.out.println("CPU Model: Core i" + CPUModel);
        System.out.println("Ram Memory: " + ramMemory + " GB");
        System.out.println("Operating System: Windows " + operatingSystem + " Home");
        System.out.println("Special Feature: " + specialFeature);
        if (isGraphicCardDescription) {
            System.out.println("Graphics Card Description: Dedicated");
        } else {
            System.out.println("Graphics Card Description: Not Dedicated");
        }
    }
}