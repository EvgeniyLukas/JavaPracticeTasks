package codingame;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Task29 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i]%2 == 0){
        System.out.print("N");
      }else if(chars[i]%3 == 0 && chars[i]%2 != 0){
        System.out.print("O");
      }else if(chars[i]%5 == 0 && chars[i]%2 != 0 && chars[i]%3 != 0){
        System.out.print("S");
      }else {
        System.out.print("E");
      }
    }

  }
}
