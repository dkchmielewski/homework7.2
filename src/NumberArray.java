import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Number[] numbers = new Number[10];
        Scanner scanner = new Scanner(System.in);

        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbe zmiennoprzecinkowa");
            numbers[i] = scanner.nextDouble();
        }

        for (Number number:numbers) {
            System.out.println(number);
        }


    }


}
