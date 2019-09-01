import java.util.*;
public class Kata {
  public static String highAndLow(String numbers) {
int[] intArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
   Arrays.sort(intArray);
   return intArray[intArray.length-1] + " "+ intArray[0];
  }
}
