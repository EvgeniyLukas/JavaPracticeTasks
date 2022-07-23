package codingame;

import java.util.Scanner;

public class Task30 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    boolean capital = false;

    StringBuilder printStr = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
          s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        printStr.append(capital ? String.valueOf(s.charAt(i)).toUpperCase()
            : String.valueOf(s.charAt(i)).toLowerCase());
        capital = !capital;
      } else {
        printStr.append(s.charAt(i));
      }
    }

    System.out.println(printStr);
  }
}

