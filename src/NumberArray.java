import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Double[] numbers = new Double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbe zmiennoprzecinkowa");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += (number * number);
            System.out.println(sum);
        }
    }
}
