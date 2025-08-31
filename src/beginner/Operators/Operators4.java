package beginner.Operators;

public class Operators4 {
//    Logical opeators
    public static void main(String[] args) {
        int price = 14999;
        boolean isDamaged = true;

        String worthSeeingText = !isDamaged || price <= 20000 ? "It's worth seeing the car." : "It isn't worth seeing the car.";
        System.out.println(worthSeeingText);

        String worthRepairingText = isDamaged && price <= 10000 ? "It's worth repairing the car." : "It isn't worth repairing the car.";
        System.out.println(worthRepairingText);
    }
}
