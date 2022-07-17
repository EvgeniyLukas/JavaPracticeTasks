package codingame;

import java.util.Scanner;

public class Task3 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int R = in.nextInt();
    for (int i = 1; i < N; i++) {
      System.out.print(Math.ceil(Math.pow(R, i - 1)) + " ");
    }
  }
}
