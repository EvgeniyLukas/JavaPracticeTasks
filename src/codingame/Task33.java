package codingame;

import java.util.Scanner;

public class Task33 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    for (int i = 0; i < s.length(); i++) {
      int c = s.charAt(i);
      System.out.print(Integer.toBinaryString(c));
    }

  }
}
