package codingame;

import java.util.Scanner;

public class Task44 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    int width = in.nextInt();
    int height = in.nextInt();
    System.out.println(length * width + length * height + width * height);

  }
}
