package codingame;

import java.util.Scanner;

public class Task6 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int c = in.nextInt();
    int r = in.nextInt();
    if (r > t * c) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
