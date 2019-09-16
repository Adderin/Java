public class Integral {

    public static String integrate(int coefficient, int exponent) {
        String solution = coefficient / (exponent + 1) + "x^" + (exponent + 1);
        return solution;
    }
  }
