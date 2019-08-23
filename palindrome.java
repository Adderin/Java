import java.util.Scanner;
public class Firstsubroutines {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("Input a string to test: ");
        String str = in.nextLine();
String inBetween = strippingStr(str);
System.out.println("stripped: "+inBetween);
str = StringReverse(inBetween);
System.out.println("reversed: "+str);
if(!inBetween.equals(str)){
System.out.println("This IS NOT a palindrome.");}
else {
    System.out.println("This is a palindrome.");}
}
/*
The subroutine strippingStr is clearing the input string.
So, it converts string to lower case and 
removes everything except lower case letters from "a" to "z".
Then, it returns the output as string.
*/
public static String strippingStr(String str) { 
String StringLowerCase = str.toLowerCase();
String StrippedString;
StrippedString = "";
for (int i = 0; i < str.length(); i++) {
    if(StringLowerCase.charAt(i) >= 'a' && StringLowerCase.charAt(i) <= 'z') {
    StrippedString = StrippedString+StringLowerCase.charAt(i);
    }
  }
return StrippedString;}   
/*
The subroutine StringReverse reverses the input String and
also returns the result as String.
*/
public static String StringReverse (String str){  
  String reverse = "";
  int i;
  for (i = str.length() - 1; i >= 0; i--) {
     reverse = reverse + str.charAt(i); }
  return reverse; 
  }
}
