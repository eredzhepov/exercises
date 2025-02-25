import java.util.Arrays;
import java.util.stream.IntStream;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        int sum = 0;
        String[] array = String.valueOf(n).split("");
        for(int i = 0; i < array.length; i++){
            sum+= Math.pow(Integer.parseInt(array[i]), p);
            p++;
        }
        if(sum%n == 0) return (long) sum/n;
        return -1;
    }
    public static long digPow1(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
        return sum % n == 0 ? sum / n : -1;
    }
    public static void main(String[] args) {
        System.out.println(      digPow1(46288, 3));
    }
}
