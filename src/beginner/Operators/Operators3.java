package beginner.Operators;

public class Operators3 {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        boolean isDamaged = false;
        int moneyInTheBank = 100000;

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: $" + priceNegativeWithMinusSign);

        int priceOneDollarPriceIncrease = ++price;
        System.out.println("Price after 1 dollar price increase: $" + priceOneDollarPriceIncrease);

        int priceOneDollarPriceDecrease = --price;
        System.out.println("Price after 1 dollar price decrease: $" + priceOneDollarPriceDecrease);

        System.out.println("This car is damaged: " + !isDamaged);

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price is greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price is lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price is greater than or equals the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's model is lesser than or equals the money in the Bank: " + (price <= moneyInTheBank));

        System.out.println("The carModel variable's data type is String: " + (carModel instanceof String));

        System.out.println("-------------------------------------------------------------------------");

        String damagedText = isDamaged ? "The car is damaged" : "The car isn't damaged";
        System.out.println(damagedText);

    }
}
