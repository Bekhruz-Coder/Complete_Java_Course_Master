package beginner.DataTypes.ObjectReferences;

public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 5613232L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.55113513215632;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Horse power: " + horsePower);
        System.out.println("Price: $" + price.floatValue()); // floatValue();
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Fuel Consumption Combined: " + fuelConsumptionCombined);
        System.out.println("Fuel Consumption Precise: " + fuelConsumptionPrecise.intValue()); // intValue();
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy Efficency Category: " + energyEfficiencyCategory);

        System.out.println("Car Model: " + carModel);
        System.out.println("Car Model: " + carModel.toUpperCase()); // toUpperCase();
        System.out.println("Car Model: " + carModel.toLowerCase()); // toLowerCase();
        System.out.println("Car Model and car model with new keyword are equals: " + carModel.equals(carModelNew)); // equals(comparingObjectName);
        System.out.println("Car Model with New Keyboard: " + carModelNew);
    }
}