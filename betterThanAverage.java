//Done without Arrays library
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    double avg = 0;
    int total = 0;
    for(int i=0; i< classPoints.length; i++) {
        total += classPoints[i];
    }
    avg = (total+yourPoints) / (classPoints.length + 1);
    if (yourPoints > avg) { return true;}
    else return false;
  }
}
