package codingame;

import java.util.Scanner;

public class Task25 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String B = in.next();
    char[] chars = B.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (B.charAt(i) == '1') {
        chars[i] = '0';
      }
      if (B.charAt(i) == '0'){
        chars[i] = '1';
      }
    }
    for (int i = 0; i < chars.length; i++) {
      System.out.print(chars[i]);
    }
  }
}
