package codingame;

import java.util.Scanner;

public class Task15 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = in.nextLine();
    String input = in.nextLine();
    StringBuilder builder = new StringBuilder(input);
    for (int i = 0; i < input.length(); i++) {
      if (builder.charAt(i) == a.charAt(0)) {
        builder.insert(i, b);
      } else {
        builder.insert(i, a);
      }
    }
    System.out.println(builder);
  }
}
