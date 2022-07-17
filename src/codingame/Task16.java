package codingame;

import java.util.Scanner;

public class Task16 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String chars = in.nextLine();
    String s = in.nextLine();
    String toGet = in.nextLine();
    int index = 0;
    for (int x = 0; x < toGet.length(); x++) {
      for (int i = 0; i < chars.length(); i++) {
        if (chars.charAt(i) == toGet.charAt(x)) {
          index = i;
        }
      }
    }
    System.out.println(s.charAt(index));
  }
}
