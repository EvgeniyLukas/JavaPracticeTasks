package codingame;

import java.util.Scanner;

public class Task41 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print((char) n+9);
    }
  }
}
