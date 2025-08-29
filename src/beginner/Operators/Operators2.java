package beginner.Operators;

public class Operators2 {
    public static void main(String[] args) {

        int price = 14999;
        boolean isDamaged = true;

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
    }
}
