package codingame;

import java.util.Scanner;

public class Task38 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    System.out.println(input.split("[ ]").length);
  }
}
