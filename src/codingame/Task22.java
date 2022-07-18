package codingame;

import java.util.Scanner;

public class Task22 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int height = in.nextInt();
    int width = in.nextInt();
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("O");
      }
    }
    System.out.println();
  }
}
