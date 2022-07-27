package codingame;

import java.util.Arrays;
import java.util.Scanner;

public class Task42 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String S = in.nextLine();
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
        System.out.print("-");
      } else if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
        System.out.print("_");
      }else {
        System.out.print("*");
      }
    }
  }
}
