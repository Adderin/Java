public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        int divider  = n / 2;     
        if(divider + firstNumber > n || divider + firstNumber == n) {
          return firstNumber - divider;
        } else {
          return firstNumber + divider;
        }
    }
}
