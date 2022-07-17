package codingame;

import java.util.Scanner;

public class Task21 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    for (int i = 0; i < N; i++) {
      int sampleValue = in.nextInt();
      for (int j = 0; j <10; j++) {
        if (sampleValue == i + 1) {
          System.out.println(i + 1 + ":*");

        } else {
          System.out.println(i + 1 + ":");
        }
      }
    }
  }
}
