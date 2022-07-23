package codingame;

import java.util.Scanner;

public class Task32 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    String s = String.valueOf(number);

    if (s.contains("6") && !s.contains("8") || !s.contains("6") && s.contains("8")) {
      System.out.println("Lucky");
    } else {
      System.out.println("Not Lucky");
    }
  }
}
