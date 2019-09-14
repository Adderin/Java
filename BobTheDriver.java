public class Bob {
  public static int enough(int cap, int on, int wait){
        if(cap < (on + wait)) {
            return Math.abs(cap - (on + wait));
        }
        return 0;
  }
}
