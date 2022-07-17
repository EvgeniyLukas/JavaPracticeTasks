package codingame;

import java.util.Scanner;

public class Task12 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    StringBuilder stringBuilder = new StringBuilder();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (i < chars.length - 1) {
        if (chars[i] == chars[i + 1]) {
          stringBuilder.append(chars[i]);
        }
      }
    }
    System.out.println(stringBuilder);
  }
}
