package codingame;

import java.util.Scanner;

public class Task7 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int X = in.nextInt();
    double abs = Math.abs(Math.pow(X, 2) - Math.pow(X + 1, 2));

    System.out.println(abs);
  }

}
