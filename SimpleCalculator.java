/**
 * Created by Amen Allah Mefteh on 10/04/2017.
 */
public class SimpleCalculator {
    public static void main(String[] args) {

        String numbers = "//[***][%]\n1***2%3";

        StringCalculator calculator = new StringCalculator();
        int output = calculator.add(numbers);
        System.out.println(" output = " + output);

    }
}
