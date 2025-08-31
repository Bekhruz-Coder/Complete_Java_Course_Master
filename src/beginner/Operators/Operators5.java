package beginner.Operators;

public class Operators5 {
    // Assignment operators
    public static void main(String[] args) {
        int price = 14999;

        price += 1000;
        System.out.println("Price increased: " + price); // 14999 + 1000 = 15999

        price -= 2000;
        System.out.println("Price decreased: $" + price); // 15999 - 2000 = 13999

        price *= 2;
        System.out.println("Price multiplied by 2: $" + price); // 13999 * 2 = 27998

        price /= 2;
        System.out.println("Price divided by 2: $" + price); // 27998 / 2 = 13999

        price %= 10000;
        System.out.println("Price remained: $" + price); // 13999 % 1000 = 3999
    }
}
