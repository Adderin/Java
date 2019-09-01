/* 
      Main condition
  setalarm(true, true) -> false
  setalarm(false, true) -> false
  setalarm(false, false) -> false
  setalarm(true, false) -> true
*/

public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
   return employed && !vacation;
    }
}
