package codingame;

import java.util.Scanner;

public class Task28 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int width = in.nextInt();
    int height = in.nextInt();
    for (int j = 1; j <= width; j++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 1; i <= height - 2; i++) {
      System.out.print("*");
      for (int j = 1; j <= width - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int j = 1; j <= width; j++) {
      System.out.print("*");
    }
  }

}

