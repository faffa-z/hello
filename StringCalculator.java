/**
 * Created by Amen Allah Mefteh on 10/04/2017.
 */


public class StringCalculator {
    public int add(String input) {
        int output = 0;
        String[] numbers = new InputNormalizer().normalize(input);
        InputValidator.validate(numbers);
        for (String num:numbers) {
            int numInt = Integer.parseInt(num);
            if(numInt < 1000) {
                output += numInt;
            }
        }
        return output;
    }
}
