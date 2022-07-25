package codingame;

import java.util.Scanner;

public class Task37 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int Y = in.nextInt();
    for (int i = 0; i < Y; i++) {
      if ((int) Math.pow(N, i) == Y) {
        System.out.println(i);
        break;
      }
    }
  }
}
