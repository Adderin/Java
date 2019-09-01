import java.util.Arrays;
public class Kata {
  public static String highAndLow(String numbers) {
    int[] integerArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    int big = integerArray[0];
    int small = integerArray[0];
    for(int i: integerArray) {
        if(i < small) {
          small = i; 
          }
        if(i > big) {
          big = i; 
          }
    }
    return big+" "+small;
  }
}
